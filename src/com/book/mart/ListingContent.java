package com.book.mart;

import com.book.mart.BookContent.Book;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Date;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class ListingContent {

	/**
	 * An array of sample (dummy) items.
	 */
	public static List<ListingItem> ITEMS = new ArrayList<ListingItem>();

	/**
	 * A map of sample (dummy) items, by ID.
	 */
	public static Map<String, ListingItem> ITEM_MAP = new HashMap<String, 
			ListingItem>();
	

	static {
		// Add 3 sample items.
		addItem(new ListingItem("1", "HuckleBerry Finn",
				Books.HUCKLEBERRY_FINN, "New", 99.40, true, 
				new Date(), new Date(), 1, "Bobby"));
		addItem(new ListingItem("2", "Three Musketeers",
				Books.THREE_MUSKETEERS, "Good", 10.34, true, 
				new Date(), new Date(), 25, "Carl"));
		addItem(new ListingItem("3", "Fifty Shades of Grey",
				Books.FIFTY_SHADES_OF_GRAY, "Fair", 12.25, false, 
				new Date(), new Date(), 100, "Robert"));
	}

	private static void addItem(ListingItem item) {
		ITEMS.add(item);
		ITEM_MAP.put(item.id, item);
	}

	/**
	 * A dummy item representing a piece of content.
	 */
	public static class ListingItem {
		public String id;
		public String content; // title
		public Book item; // reference to item being sold
		public String condition; 
		public double askingPrice;
		public boolean forTrade; // willing to trade books
		public Date listingStart;
		public Date listingEnd;
		public int viewCount;
		public String seller;
		

		public ListingItem(String id, String content, 
				Book item, String condition, 
				double askingPrice, boolean forTrade, 
				Date listingStart, Date listingEnd, 
				int viewCount, String seller) 
		{
			this.id = id;
			this.content = content;
			this.item = item;
			this.condition = condition;
			this.askingPrice = askingPrice;
			this.forTrade = forTrade;
			this.listingStart = listingStart;
			this.listingEnd = listingEnd;
			this.viewCount = viewCount;
			this.seller = seller;
						
		}
		
		@Override
		public String toString() 
		{
			String s = this.content + ": " + this.condition + ": $" + 
		               String.format("%.2f", this.askingPrice);
			return this.forTrade ? s + " (Trade)" : s;
		}
	}
}


