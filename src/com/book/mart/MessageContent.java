package com.book.mart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Date;

import com.book.mart.ListingContent.ListingItem;

	/**
	 * Helper class for providing sample content for user interfaces created by
	 * Android template wizards.
	 * <p>
	 * TODO: Replace all uses of this class before publishing your app.
	 */
	public class MessageContent {

		/**
		 * An array of sample (dummy) items.
		 */
		public static List<Message> CONVO = new ArrayList<Message>();

		/**
		 * A map of sample (dummy) items, by ID.
		 */
		public static Map<String, Message> CONVO_MAP = new HashMap<String, Message>();
		

		static {
			// Add some sample messages
			// Add 3 sample items.
			addMessage(new Message("1", "Sender 1", "Sender 2", "Hello, World!", new Date()));
			addMessage(new Message("2", "Sender 2", "Sender 1", "I'm well!", new Date()));
			addMessage(new Message("3", "Sender 1", "Sender 2", "That's great!", new Date()));
		}

		private static void addMessage(Message newMsg) {
			CONVO.add(newMsg);
			CONVO_MAP.put(newMsg.id, newMsg);
		}

		/**
		 * A dummy item representing a piece of content.
		 */
		public static class Message {
			public String id;
			public String sender;
			public String recipient;
			public String content;
			public Date timestamp;
			

			public Message (String id, String sender, String recipient, String content, Date timestamp)
			{
				this.id = id;
				this.sender = sender;
				this.recipient = recipient;
				this.content = content;
				this.timestamp = timestamp;
			}
		}	
	}
