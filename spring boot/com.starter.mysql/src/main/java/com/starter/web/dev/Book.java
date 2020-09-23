package com.starter.web.dev;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bookdetails")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	
	private long book_Id;
	private String book_Name;
	private String book_author;
	
	public long getBook_Id() {
		return book_Id;
	}
	public void setBook_Id(long book_Id) {
		this.book_Id = book_Id;
	}
	public String getBook_Name() {
		return book_Name;
	}
	public void setBook_Name(String book_Name) {
		this.book_Name = book_Name;
	}
	public String getBook_author() {
		return book_author;
	}
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
	
	@Override
	public String toString() {
		return "Book [book_Id=" + book_Id + ", book_Name=" + book_Name + ", book_author=" + book_author + "]";
	}
	
	
	
}
