package com.doc.common.po; 
 
public interface IBookPo {
 
	BigDecimal getId();
 
	void setId(final BigDecimal id);
 
	String getTitle();
 
	void setTitle(final String title);
 
	String getAuthor();
 
	void setAuthor(final String author);
 
	BigDecimal getPrice();
 
	void setPrice(final BigDecimal price);
 
}
