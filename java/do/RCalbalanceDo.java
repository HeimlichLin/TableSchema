package com.doc.common.bean; 
 
public class RCalbalanceDo { 
 
	public enum COLUMNS { 
		SESSIONID("null"), 
		BONDNO("null"), 
		GDSTYPE("null"), 
		DECLTYPE("null"), 
		PRDTNO("null"), 
		DECLNO("null"), 
		ITEMNO("null"), 
		STOCKNO("null"), 
		INDATE("null"), 
		RINQTY("null"), 
		INUNIT("null"), 
		INPOST("null"), 
		BALANCE("null"), 
		ISSTOCK("null"), 
		RMK("null"), 
		INSTATUS("null"), 
		CONTROLNO("null"), 
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
 
	private String sessionid; 
	private String bondno; 
	private String gdstype; 
	private String decltype; 
	private String prdtno; 
	private String declno; 
	private BigDecimal itemno; 
	private String stockno; 
	private String indate; 
	private BigDecimal rinqty; 
	private String inunit; 
	private String inpost; 
	private BigDecimal balance; 
	private String isstock; 
	private String rmk; 
	private String instatus; 
	private String controlno; 
	private String updtime; 
	
	public String getSessionid() { 
		return sessionid; 
	} 
 
	public void setSessionid(String sessionid) { 
		this.sessionid = sessionid; 
	} 
 
	public String getBondno() { 
		return bondno; 
	} 
 
	public void setBondno(String bondno) { 
		this.bondno = bondno; 
	} 
 
	public String getGdstype() { 
		return gdstype; 
	} 
 
	public void setGdstype(String gdstype) { 
		this.gdstype = gdstype; 
	} 
 
	public String getDecltype() { 
		return decltype; 
	} 
 
	public void setDecltype(String decltype) { 
		this.decltype = decltype; 
	} 
 
	public String getPrdtno() { 
		return prdtno; 
	} 
 
	public void setPrdtno(String prdtno) { 
		this.prdtno = prdtno; 
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
 
	public String getStockno() { 
		return stockno; 
	} 
 
	public void setStockno(String stockno) { 
		this.stockno = stockno; 
	} 
 
	public String getIndate() { 
		return indate; 
	} 
 
	public void setIndate(String indate) { 
		this.indate = indate; 
	} 
 
	public BigDecimal getRinqty() { 
		return rinqty; 
	} 
 
	public void setRinqty(BigDecimal rinqty) { 
		this.rinqty = rinqty; 
	} 
 
	public String getInunit() { 
		return inunit; 
	} 
 
	public void setInunit(String inunit) { 
		this.inunit = inunit; 
	} 
 
	public String getInpost() { 
		return inpost; 
	} 
 
	public void setInpost(String inpost) { 
		this.inpost = inpost; 
	} 
 
	public BigDecimal getBalance() { 
		return balance; 
	} 
 
	public void setBalance(BigDecimal balance) { 
		this.balance = balance; 
	} 
 
	public String getIsstock() { 
		return isstock; 
	} 
 
	public void setIsstock(String isstock) { 
		this.isstock = isstock; 
	} 
 
	public String getRmk() { 
		return rmk; 
	} 
 
	public void setRmk(String rmk) { 
		this.rmk = rmk; 
	} 
 
	public String getInstatus() { 
		return instatus; 
	} 
 
	public void setInstatus(String instatus) { 
		this.instatus = instatus; 
	} 
 
	public String getControlno() { 
		return controlno; 
	} 
 
	public void setControlno(String controlno) { 
		this.controlno = controlno; 
	} 
 
	public String getUpdtime() { 
		return updtime; 
	} 
 
	public void setUpdtime(String updtime) { 
		this.updtime = updtime; 
	} 
 
} 
