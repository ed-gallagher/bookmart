package com.book.mart;

import java.util.Date;

import com.book.mart.BookContent.Book;

public class Books {
	public static final Book HUCKLEBERRY_FINN = new Book( "1", 
			"Huckleberry Finn", "Mark Twain", "None",
			"Adventure", "0123456789", 10, new Date( 1884 ), true);
	public static final Book THREE_MUSKETEERS = new Book( "2", 
			"The Three Musketeers", "Alexander Dumas", "None",
			"Adventure", "0987654321", 5, new Date( 2003 ), false);
	public static final Book FIFTY_SHADES_OF_GRAY = new Book( "3", 
			"Fifty Shades of Gray", "I don't know", "Somone",
			"Romance", "1948727573", 1, new Date( 2012 ), true);
}
