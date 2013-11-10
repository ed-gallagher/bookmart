package com.book.mart;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.book.mart.BookContent.Book;

public class OfferContent {
		/**
		 * An array of sample (dummy) items.
		 */
		public static List<OfferItem> OFFERS = new ArrayList<OfferItem>();

		/**
		 * A map of sample (dummy) items, by ID.
		 */
		public static Map<String, OfferItem> OFFERS_MAP = new HashMap<String, 
				OfferItem>();

		/**
		 * A sample of three dummy OfferItems
		 */
		//addOffer(new OfferItem());

		private static void addOffer(OfferItem offer) {
			OFFERS.add(offer);
			OFFERS_MAP.put(offer.id, offer);	
		}
			
		public static class OfferItem{
			public String id;
			public String buyer;
			public String seller;
			public List<Book> bOffer;
			public float amount;
			
			public OfferItem(String id, String buyer, String seller, 
					List<Book> bOffer, float amount) 
			{
			    this.id = id;
			    this.buyer = buyer;
			    this.seller = seller;
				this.bOffer = bOffer;
				this.amount = amount;
			}
		}
}
