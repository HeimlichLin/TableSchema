package com.doc.common.bean; 
 
public class AdjustmentDo { 
 
	public enum COLUMNS { 
		BONDNO("null"), 
		REFBILLNO("null"), 
		ITEM("null"), 
		INPOST("null"), 
		DECLNO("null"), 
		ITEMNO("null"), 
		RINQTY("null"), 
		ADJUSTQTY("null"), 
		APPRVNO("null"), 
		APPRVDATE("null"), 
		RMK("null"), 
		UPDTIME("null") 
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
	private String inpost; 
	private String declno; 
	private BigDecimal itemno; 
	private BigDecimal rinqty; 
	private BigDecimal adjustqty; 
	private String apprvno; 
	private String apprvdate; 
	private String rmk; 
	private String updtime; 
	
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
 
	public String getInpost() { 
		return inpost; 
	} 
 
	public void setInpost(String inpost) { 
		this.inpost = inpost; 
	} 
 
	public String getDeclno() { 
		return declno; 
	} 
 
	public void setDeclno(String declno) { 
		this.declno = declno; 
	} 
 
	public BigDecimal getItemno() { 
		return itemno; 
	} 
 
	public void setItemno(BigDecimal itemno) { 
		this.itemno = itemno; 
	} 
 
	public BigDecimal getRinqty() { 
		return rinqty; 
	} 
 
	public void setRinqty(BigDecimal rinqty) { 
		this.rinqty = rinqty; 
	} 
 
	public BigDecimal getAdjustqty() { 
		return adjustqty; 
	} 
 
	public void setAdjustqty(BigDecimal adjustqty) { 
		this.adjustqty = adjustqty; 
	} 
 
	public String getApprvno() { 
		return apprvno; 
	} 
 
	public void setApprvno(String apprvno) { 
		this.apprvno = apprvno; 
	} 
 
	public String getApprvdate() { 
		return apprvdate; 
	} 
 
	public void setApprvdate(String apprvdate) { 
		this.apprvdate = apprvdate; 
	} 
 
	public String getRmk() { 
		return rmk; 
	} 
 
	public void setRmk(String rmk) { 
		this.rmk = rmk; 
	} 
 
	public String getUpdtime() { 
		return updtime; 
	} 
 
	public void setUpdtime(String updtime) { 
		this.updtime = updtime; 
	} 
 
} 
