package com.doc.common.bean; 
 
public class BackerrorDo { 
 
	public enum COLUMNS { 
		BONDNO("null"), 
		REFBILLNO("null"), 
		ITEM("null"), 
		STRPOST("null"), 
		DECLNO("null"), 
		ITEMNO("null"), 
		STRDATE("null"), 
		BACKTABLE("null"), 
		ERRCODE("null"), 
		ERRDESC("null"), 
		LOGTIME("null"), 
		STRTYPE("null"), 
		BACKTYPE("null") 
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
	private String strpost; 
	private String declno; 
	private BigDecimal itemno; 
	private String strdate; 
	private String backtable; 
	private BigDecimal errcode; 
	private String errdesc; 
	private String logtime; 
	private String strtype; 
	private String backtype; 
	
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
 
	public String getStrpost() { 
		return strpost; 
	} 
 
	public void setStrpost(String strpost) { 
		this.strpost = strpost; 
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
 
	public String getStrdate() { 
		return strdate; 
	} 
 
	public void setStrdate(String strdate) { 
		this.strdate = strdate; 
	} 
 
	public String getBacktable() { 
		return backtable; 
	} 
 
	public void setBacktable(String backtable) { 
		this.backtable = backtable; 
	} 
 
	public BigDecimal getErrcode() { 
		return errcode; 
	} 
 
	public void setErrcode(BigDecimal errcode) { 
		this.errcode = errcode; 
	} 
 
	public String getErrdesc() { 
		return errdesc; 
	} 
 
	public void setErrdesc(String errdesc) { 
		this.errdesc = errdesc; 
	} 
 
	public String getLogtime() { 
		return logtime; 
	} 
 
	public void setLogtime(String logtime) { 
		this.logtime = logtime; 
	} 
 
	public String getStrtype() { 
		return strtype; 
	} 
 
	public void setStrtype(String strtype) { 
		this.strtype = strtype; 
	} 
 
	public String getBacktype() { 
		return backtype; 
	} 
 
	public void setBacktype(String backtype) { 
		this.backtype = backtype; 
	} 
 
} 
