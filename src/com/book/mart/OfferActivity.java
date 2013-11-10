package com.book.mart;

import com.book.mart.MessageContent.Message;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class OfferActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_offer);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.offer, menu);
		return true;
	//}
	/*
	public View getView (int position, View convertView, ViewGroup Parent) {
		View view = convertView;
		
		if (view == null) {
			LayoutInflater viewInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			view = viewInflater.inflate(R.layout.message_entry_layout, null);
		}
	    OfferItem offer = Offers.get(position);
		*/
		/*
		if (offer != null) {
			TextView toFrom = (TextView) view.findViewById(R.id.messageToFrom);
			TextView content = (TextView) view.findViewById(R.id.messageContent);
			
			if (toFrom != null) {
				toFrom.setText(message.sender + " to " + message.recipient);
			}
			
			if (content != null) {
				content.setText(message.content);
			}
		}*/
		
		//return view;
	}
}
