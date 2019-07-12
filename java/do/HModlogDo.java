package com.doc.common.bean; 
 
public class HModlogDo { 
 
	public enum COLUMNS { 
		BONDNO("null"), 
		REFBILLNO("null"), 
		ITEM("null"), 
		POST("null"), 
		STRTYPE("null"), 
		MODIFER("null"), 
		MODTIME("null"), 
		MODITEM("null"), 
		ORIDATA("null"), 
		MODDATA("null"), 
		MODFILE("null"), 
		REMKS("null") 
		; 
		final String name; 
	 
		private COLUMNS(final String name) { 
			this.name = name; 
		} 
	 
		public String getName() { 
			return this.name; 
		} 
	} 
 
	private String bondno; 
	private String refbillno; 
	private BigDecimal item; 
	private String post; 
	private String strtype; 
	private String modifer; 
	private java.sql.Timestamp modtime; 
	private String moditem; 
	private String oridata; 
	private String moddata; 
	private String modfile; 
	private String remks; 
	
	public String getBondno() { 
		return bondno; 
	} 
 
	public void setBondno(String bondno) { 
		this.bondno = bondno; 
	} 
 
	public String getRefbillno() { 
		return refbillno; 
	} 
 
	public void setRefbillno(String refbillno) { 
		this.refbillno = refbillno; 
	} 
 
	public BigDecimal getItem() { 
		return item; 
	} 
 
	public void setItem(BigDecimal item) { 
		this.item = item; 
	} 
 
	public String getPost() { 
		return post; 
	} 
 
	public void setPost(String post) { 
		this.post = post; 
	} 
 
	public String getStrtype() { 
		return strtype; 
	} 
 
	public void setStrtype(String strtype) { 
		this.strtype = strtype; 
	} 
 
	public String getModifer() { 
		return modifer; 
	} 
 
	public void setModifer(String modifer) { 
		this.modifer = modifer; 
	} 
 
	public java.sql.Timestamp getModtime() { 
		return modtime; 
	} 
 
	public void setModtime(java.sql.Timestamp modtime) { 
		this.modtime = modtime; 
	} 
 
	public String getModitem() { 
		return moditem; 
	} 
 
	public void setModitem(String moditem) { 
		this.moditem = moditem; 
	} 
 
	public String getOridata() { 
		return oridata; 
	} 
 
	public void setOridata(String oridata) { 
		this.oridata = oridata; 
	} 
 
	public String getModdata() { 
		return moddata; 
	} 
 
	public void setModdata(String moddata) { 
		this.moddata = moddata; 
	} 
 
	public String getModfile() { 
		return modfile; 
	} 
 
	public void setModfile(String modfile) { 
		this.modfile = modfile; 
	} 
 
	public String getRemks() { 
		return remks; 
	} 
 
	public void setRemks(String remks) { 
		this.remks = remks; 
	} 
 
} 
