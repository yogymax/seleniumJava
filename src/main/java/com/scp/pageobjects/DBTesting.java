package com.scp.pageobjects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class DBTesting {
	
	//Download the jar...

	@Test
	public void dbInsertRecordTest() throws Exception{ 	
		Class.forName("org.hsqldb.jdbcDriver");
		Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/","SA","");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("insert into booksinfo values(8,'A1','B1',102)");
		List<Book> listOfBooks = new ArrayList<Book>();
		Book book = null;
		while(rs.next()){
			book = new Book();
			book.setBookId(Integer.parseInt(rs.getString("BOOK_ID")));
			book.setBookName(rs.getString("BOOK_NAME"));
			book.setBookPrice(Integer.parseInt(rs.getString("BOOK_PRICE")));
			book.setAuthorName(rs.getString("AUTHOR_NAME"));
			listOfBooks.add(book);
		}
		
		
		System.out.println(listOfBooks);
		
		for (Book book1 : listOfBooks) {
			Assert.assertEquals("6",book1.getBookId());
			Assert.assertEquals("",book1.getBookName());
			Assert.assertEquals("6",book1.getBookId());
			Assert.assertEquals("6",book1.getBookId());
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
