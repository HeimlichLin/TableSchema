package com.doc.common.po.impl; 
 
public class AnnouncePo implements IAnnouncePo {
 
	public enum COLUMNS {
		SERIALNO("null"), //
		PUBLISHER("null"), //
		ANNOUNCEDATE("null"), //
		TITLE("null"), //
		CONTENT("null"), //
		ISDISPLAY("null"), //
		URL01("null"), //
		URL02("null"), //
		URL03("null"), //
		AUTHID("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal serialno;
	private String publisher;
	private String announcedate;
	private String title;
	private String content;
	private String isdisplay;
	private String url01;
	private String url02;
	private String url03;
	private String authid;

	@Override
	public BigDecimal getSerialno() {
		return this.serialno;
	}
 
	@Override
	public void setSerialno(final BigDecimal serialno) {
		this.serialno = serialno; 
	}
 
	@Override
	public String getPublisher() {
		return this.publisher;
	}
 
	@Override
	public void setPublisher(final String publisher) {
		this.publisher = publisher; 
	}
 
	@Override
	public String getAnnouncedate() {
		return this.announcedate;
	}
 
	@Override
	public void setAnnouncedate(final String announcedate) {
		this.announcedate = announcedate; 
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
	public String getContent() {
		return this.content;
	}
 
	@Override
	public void setContent(final String content) {
		this.content = content; 
	}
 
	@Override
	public String getIsdisplay() {
		return this.isdisplay;
	}
 
	@Override
	public void setIsdisplay(final String isdisplay) {
		this.isdisplay = isdisplay; 
	}
 
	@Override
	public String getUrl01() {
		return this.url01;
	}
 
	@Override
	public void setUrl01(final String url01) {
		this.url01 = url01; 
	}
 
	@Override
	public String getUrl02() {
		return this.url02;
	}
 
	@Override
	public void setUrl02(final String url02) {
		this.url02 = url02; 
	}
 
	@Override
	public String getUrl03() {
		return this.url03;
	}
 
	@Override
	public void setUrl03(final String url03) {
		this.url03 = url03; 
	}
 
	@Override
	public String getAuthid() {
		return this.authid;
	}
 
	@Override
	public void setAuthid(final String authid) {
		this.authid = authid; 
	}
 
}
