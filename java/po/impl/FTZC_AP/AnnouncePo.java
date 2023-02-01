package com.doc.common.po.impl; 
 
public class AnnouncePo implements IAnnouncePo {
 
	public enum COLUMNS {
		SEQ("序號(系統唯一值)"), //
		PUBLISHER("訊息來源"), //
		ANNOUNCE_DATE("公告日期"), //
		TITLE("標題"), //
		CONTENT("內容"), //
		VISIABLE("是否顯示"), //
		URL01("null"), //
		URL02("null"), //
		URL03("null"), //
		AUTH_ID("??") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String seq;
	private String publisher;
	private String announceDate;
	private String title;
	private String content;
	private String visiable;
	private String url01;
	private String url02;
	private String url03;
	private String authId;

	@Override
	public String getSeq() {
		return this.seq;
	}
 
	@Override
	public void setSeq(final String seq) {
		this.seq = seq; 
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
	public String getAnnounceDate() {
		return this.announceDate;
	}
 
	@Override
	public void setAnnounceDate(final String announceDate) {
		this.announceDate = announceDate; 
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
	public String getVisiable() {
		return this.visiable;
	}
 
	@Override
	public void setVisiable(final String visiable) {
		this.visiable = visiable; 
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
	public String getAuthId() {
		return this.authId;
	}
 
	@Override
	public void setAuthId(final String authId) {
		this.authId = authId; 
	}
 
}
