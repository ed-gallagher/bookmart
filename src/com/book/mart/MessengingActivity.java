package com.book.mart;

import java.util.List;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.book.mart.MessageContent.Message;

public class MessengingActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_messenging);
				
		/*setListAdapter(new ArrayAdapter<MessageContent.Message>(this,
				android.R.layout.simple_list_item_activated_1,
				, MessageContent.CONVO));*/
		setListAdapter(new MessageAdapter(this, android.R.id.list, MessageContent.CONVO));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.messenging, menu);
		return true;
	}
	
	public class MessageAdapter extends ArrayAdapter<MessageContent.Message> {
		private List<MessageContent.Message> messages;
		private Context context;
		
		public MessageAdapter(Context context, int textViewResId, List<MessageContent.Message> objects) {
			super(context, textViewResId, objects);
			this.messages = objects;
			this.context = context;
		}
		
		public View getView (int position, View convertView, ViewGroup Parent) {
			View view = convertView;
			
			if (view == null) {
				LayoutInflater viewInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
				view = viewInflater.inflate(R.layout.message_entry_layout, null);
			}
			
			Message message = messages.get(position);
			
			if (message != null) {
				TextView toFrom = (TextView) view.findViewById(R.id.messageToFrom);
				TextView content = (TextView) view.findViewById(R.id.messageContent);
				
				if (toFrom != null) {
					toFrom.setText(message.sender + " to " + message.recipient);
				}
				
				if (content != null) {
					content.setText(message.content);
				}
			}
			
			return view;
		}
	}
	
	/*@Override
	public boolean onOptionsItemSelected( MenuItem item )
	{
		switch (item.getMessage())
		{
			case R.id.action_toMessageList:
				Intent i = new Intent( this, Buying.class );
				startActivity( i );
				return true;
			default:
				return super.onOptionsMessageList( item );
		}
	}*/
	

}
