package com.doc.common.po.impl; 
 
public class BookPo implements IBookPo {
 
	public enum COLUMNS {
		ID("null"), //
		TITLE("null"), //
		AUTHOR("null"), //
		PRICE("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal id;
	private String title;
	private String author;
	private BigDecimal price;

	@Override
	public BigDecimal getId() {
		return this.id;
	}
 
	@Override
	public void setId(final BigDecimal id) {
		this.id = id; 
	}
 
	@Override
	public String getTitle() {
		return this.title;
	}
 
	@Override
	public void setTitle(final String title) {
		this.title = title; 
	}
 
	@Override
	public String getAuthor() {
		return this.author;
	}
 
	@Override
	public void setAuthor(final String author) {
		this.author = author; 
	}
 
	@Override
	public BigDecimal getPrice() {
		return this.price;
	}
 
	@Override
	public void setPrice(final BigDecimal price) {
		this.price = price; 
	}
 
}
