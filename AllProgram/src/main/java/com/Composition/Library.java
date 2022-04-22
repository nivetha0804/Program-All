package com.Composition;

import java.util.List;

public class Library 
{
	private final List<Book> books;
	 
    // Library class contains list of books
    Library(List<Book> books)
    {
         // Referring to same book as
        // this keyword refers to same instance itself
        this.books = books;
    }
 
    // Method
    // To get total number of books in library
    public List<Book> getTotalBooksInLibrary()
    {
         return books;
    }
}
