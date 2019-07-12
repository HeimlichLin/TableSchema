package com.doc.common.bean; 
 
public class AnnounceDo { 
 
	public enum COLUMNS { 
		SERIALNO("null"), 
		PUBLISHER("null"), 
		ANNOUNCEDATE("null"), 
		TITLE("null"), 
		CONTENT("null"), 
		ISDISPLAY("null"), 
		URL01("null"), 
		URL02("null"), 
		URL03("null"), 
		AUTHID("null") 
		; 
		final String name; 
	 
		private COLUMNS(final String name) { 
			this.name = name; 
		} 
	 
		public String getName() { 
			return this.name; 
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
	
	public BigDecimal getSerialno() { 
		return serialno; 
	} 
 
	public void setSerialno(BigDecimal serialno) { 
		this.serialno = serialno; 
	} 
 
	public String getPublisher() { 
		return publisher; 
	} 
 
	public void setPublisher(String publisher) { 
		this.publisher = publisher; 
	} 
 
	public String getAnnouncedate() { 
		return announcedate; 
	} 
 
	public void setAnnouncedate(String announcedate) { 
		this.announcedate = announcedate; 
	} 
 
	public String getTitle() { 
		return title; 
	} 
 
	public void setTitle(String title) { 
		this.title = title; 
	} 
 
	public String getContent() { 
		return content; 
	} 
 
	public void setContent(String content) { 
		this.content = content; 
	} 
 
	public String getIsdisplay() { 
		return isdisplay; 
	} 
 
	public void setIsdisplay(String isdisplay) { 
		this.isdisplay = isdisplay; 
	} 
 
	public String getUrl01() { 
		return url01; 
	} 
 
	public void setUrl01(String url01) { 
		this.url01 = url01; 
	} 
 
	public String getUrl02() { 
		return url02; 
	} 
 
	public void setUrl02(String url02) { 
		this.url02 = url02; 
	} 
 
	public String getUrl03() { 
		return url03; 
	} 
 
	public void setUrl03(String url03) { 
		this.url03 = url03; 
	} 
 
	public String getAuthid() { 
		return authid; 
	} 
 
	public void setAuthid(String authid) { 
		this.authid = authid; 
	} 
 
} 
