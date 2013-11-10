package com.book.mart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.book.mart.ListingContent.ListingItem;

public class Add_Listing extends ListActivity {

	public Button srchButton;
	public EditText searchField;
	//public SearchView searchListing;
	//public ListView resultsLV;
	List<ListingItem> results;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add__listing);
		
		srchButton = (Button)findViewById(R.id.searchButton);
		searchField = (EditText)findViewById(R.id.searchField);
		//searchListing = (SearchView)findViewById(R.id.searchListing);
		results = new ArrayList<ListingItem>();
		
		//searchListing.setIconifiedByDefault(false);
		//searchListing.setSubmitButtonEnabled(true);
		//searchListing.setOnSearchClickListener();
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add__listing, menu);
		return true;
	}
	
	public void onSearchButtonClick(View view){
		/*String query = searchField.getText().toString();
		return query;*/
		
		for (ListingItem item : ListingContent.ITEMS) {
			if (item.content.toUpperCase(Locale.getDefault()).contains(searchField.getText().toString().toUpperCase(Locale.getDefault()))) {
				results.add(item);
			}
		}
		
		setListAdapter(new ArrayAdapter<ListingContent.ListingItem>(this,
				android.R.layout.simple_list_item_1,
				android.R.id.text1, results));
	}
/*
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		
		
		
		Intent updateDBIntent = new Intent(this, );
		updateDBIntent.putExtra("chosenBook", results.get(position).id);
		
		startService(updateDBIntent);
		
	}
	*/
	

}
