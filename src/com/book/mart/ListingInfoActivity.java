package com.book.mart;

import android.view.View;

import com.book.mart.ListingContent.ListingItem;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class ListingInfoActivity extends Activity {
	
	private ListingItem listing;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_listing_info);
		
		Bundle b = getIntent().getExtras();
		if (b.containsKey("listing")) {
			// Load sthe dummy content specified by the fragment
			// arguments. In a real-world scenario, use a Loader
			// to load content from a content provider.
			listing = ListingContent.ITEM_MAP.get( b.get("listing") );
			updateUI();
		}
	}
	
	protected void updateUI()
	{
		TextView titleLabel = (TextView)findViewById( R.id.titleValueLabel );	
		titleLabel.setText( listing.item.title );
		TextView authorLabel = (TextView)findViewById( R.id.authorValueLabel );
		authorLabel.setText( listing.item.author );
		TextView publishLabel = (TextView)findViewById( R.id.publisherValueLabel );
		publishLabel.setText( listing.item.publisher );
		TextView genreLabel = (TextView)findViewById(R.id.genreValueLabel);
		genreLabel.setText(listing.item.genre);
		TextView isbnLabel=(TextView)findViewById(R.id.isbnValueLabel);
		isbnLabel.setText(listing.item.ISBN);
		TextView editionLabel = (TextView)findViewById(R.id.editionValueLabel);
	    editionLabel.setText(String.valueOf(listing.item.edition));
		TextView pubDateLabel=(TextView)findViewById(R.id.pubDateValueLabel);
		pubDateLabel.setText(listing.item.pubDate.toString());
		TextView formatLabel=(TextView)findViewById(R.id.formatValueLabel);
		formatLabel.setText((listing.item.isHard) ? "Hard cover" : "Paperback");
		
		
		
		
		
		
		TextView conditionLabel= (TextView)findViewById( R.id.conditionValueLabel );
		conditionLabel.setText(listing.condition);
		TextView askingPriceLabel=(TextView)findViewById( R.id.askingPriceValueLabel);
		
		askingPriceLabel.setText(String.format("$%.2f", listing.askingPrice));
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.listing_info, menu);
		return true;
	}
	
	 public void goToOffer (View view) {
		 Intent intent = new Intent(this, OfferActivity.class); 
		 startActivity(intent);
	 }

}
