package com.book.mart;
	
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
	public class BookContent {

		/**
		 * An array of sample (dummy) items.
		 */
		public static List<Book> BOOKS = new ArrayList<Book>();

		/**
		 * A map of sample (dummy) items, by ID.
		 */
		public static Map<String, Book> BOOK_MAP = new HashMap<String, Book>();
		

		static {
			// Add 3 sample items.
			//addBook(new Book());
		}

		private static void addBook(Book newBook) {
			BOOKS.add(newBook);
			BOOK_MAP.put(newBook.id, newBook);
		}

		/**
		 * A dummy item representing a piece of content.
		 */
		public static class Book {
			public String id;
			public String title;
			public String author;
			public String publisher;
			public String genre;
			public String ISBN;
			public int edition;
			public Date pubDate;
			public Boolean isHard;
			

			public Book(String id, String title, String author, String publisher,
			String genre, String ISBN, int edition, Date pubDate, Boolean isHard) 
			{
				this.id = id;
				this.title = title;
				this.author = author;
				this.publisher = publisher;
				this.genre = genre;
				this.ISBN = ISBN;
				this.edition = edition;
				this.pubDate = pubDate;
				this.isHard = isHard;
			}
			
			@Override
			public String toString() 
			{
				String s = this.title + ": " + this.author + ": Ed." +
						String.format("%d", this.edition) + ": " + this.ISBN;
				return this.isHard ? s + " (Hardcover)" : s;
			}
		}	
	}
