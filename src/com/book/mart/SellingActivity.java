package com.book.mart;



import android.os.Bundle;
import android.app.ListActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SellingActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_selling);
		
		setListAdapter(new ArrayAdapter<ListingContent.ListingItem>(this,
				android.R.layout.simple_list_item_activated_1,
				android.R.id.text1, ListingContent.ITEMS));

	}
	
	@Override
	public void onListItemClick(ListView listView, View view, int position,
			long id) {
		super.onListItemClick(listView, view, position, id);
		
		Intent i = new Intent( this, ListingInfoActivity.class );
		i.putExtra( "listing", ListingContent.ITEMS.get(position).id);
		startActivity( i );
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.selling, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected( MenuItem item )
	{
		switch (item.getItemId())
		{
			case R.id.action_toBuying:
				Intent i = new Intent( this, Buying.class );
				startActivity( i );
				return true;
			case R.id.action_toInbox:
				Intent inbox_intent = new Intent(this, MessengingActivity.class);
				startActivity(inbox_intent);
				return true;
			case R.id.action_addListing:
				Intent j = new Intent(this, Add_Listing.class);
				startActivity(j);
				return true;
				
			default:
				return super.onOptionsItemSelected( item );
		}
	}
	
}
