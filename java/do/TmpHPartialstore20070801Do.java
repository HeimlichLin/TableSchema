package com.doc.common.bean; 
 
public class TmpHPartialstore20070801Do { 
 
	public enum COLUMNS { 
		MSGFUN("null"), 
		BONDNO("null"), 
		REFBILLNO("null"), 
		CTMCODE("null"), 
		REFERCODE("null"), 
		ITEM("null"), 
		PRDTNO("null"), 
		STRTYPE("null"), 
		GDSTYPE("null"), 
		RSTRQTY("null"), 
		STRUNIT("null"), 
		STRPOST("null"), 
		STRDATE("null"), 
		BATCHNO("null"), 
		STOCKNO("null"), 
		OUTSTRNO("null"), 
		DECLTYPE("null"), 
		DECLNO("null"), 
		ITEMNO("null"), 
		ODECLNO("null"), 
		OITEMNO("null"), 
		REALSTATUS("null"), 
		MONTHNO("null"), 
		USERID("null"), 
		UPDTIME("null"), 
		CONFIRMDATE("null") 
		; 
		final String name; 
	 
		private COLUMNS(final String name) { 
			this.name = name; 
		} 
	 
		public String getName() { 
			return this.name; 
		} 
	} 
 
	private String msgfun; 
	private String bondno; 
	private String refbillno; 
	private String ctmcode; 
	private String refercode; 
	private BigDecimal item; 
	private String prdtno; 
	private String strtype; 
	private String gdstype; 
	private BigDecimal rstrqty; 
	private String strunit; 
	private String strpost; 
	private String strdate; 
	private String batchno; 
	private String stockno; 
	private String outstrno; 
	private String decltype; 
	private String declno; 
	private BigDecimal itemno; 
	private String odeclno; 
	private BigDecimal oitemno; 
	private String realstatus; 
	private String monthno; 
	private String userid; 
	private String updtime; 
	private String confirmdate; 
	
	public String getMsgfun() { 
		return msgfun; 
	} 
 
	public void setMsgfun(String msgfun) { 
		this.msgfun = msgfun; 
	} 
 
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
 
	public String getCtmcode() { 
		return ctmcode; 
	} 
 
	public void setCtmcode(String ctmcode) { 
		this.ctmcode = ctmcode; 
	} 
 
	public String getRefercode() { 
		return refercode; 
	} 
 
	public void setRefercode(String refercode) { 
		this.refercode = refercode; 
	} 
 
	public BigDecimal getItem() { 
		return item; 
	} 
 
	public void setItem(BigDecimal item) { 
		this.item = item; 
	} 
 
	public String getPrdtno() { 
		return prdtno; 
	} 
 
	public void setPrdtno(String prdtno) { 
		this.prdtno = prdtno; 
	} 
 
	public String getStrtype() { 
		return strtype; 
	} 
 
	public void setStrtype(String strtype) { 
		this.strtype = strtype; 
	} 
 
	public String getGdstype() { 
		return gdstype; 
	} 
 
	public void setGdstype(String gdstype) { 
		this.gdstype = gdstype; 
	} 
 
	public BigDecimal getRstrqty() { 
		return rstrqty; 
	} 
 
	public void setRstrqty(BigDecimal rstrqty) { 
		this.rstrqty = rstrqty; 
	} 
 
	public String getStrunit() { 
		return strunit; 
	} 
 
	public void setStrunit(String strunit) { 
		this.strunit = strunit; 
	} 
 
	public String getStrpost() { 
		return strpost; 
	} 
 
	public void setStrpost(String strpost) { 
		this.strpost = strpost; 
	} 
 
	public String getStrdate() { 
		return strdate; 
	} 
 
	public void setStrdate(String strdate) { 
		this.strdate = strdate; 
	} 
 
	public String getBatchno() { 
		return batchno; 
	} 
 
	public void setBatchno(String batchno) { 
		this.batchno = batchno; 
	} 
 
	public String getStockno() { 
		return stockno; 
	} 
 
	public void setStockno(String stockno) { 
		this.stockno = stockno; 
	} 
 
	public String getOutstrno() { 
		return outstrno; 
	} 
 
	public void setOutstrno(String outstrno) { 
		this.outstrno = outstrno; 
	} 
 
	public String getDecltype() { 
		return decltype; 
	} 
 
	public void setDecltype(String decltype) { 
		this.decltype = decltype; 
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
 
	public String getOdeclno() { 
		return odeclno; 
	} 
 
	public void setOdeclno(String odeclno) { 
		this.odeclno = odeclno; 
	} 
 
	public BigDecimal getOitemno() { 
		return oitemno; 
	} 
 
	public void setOitemno(BigDecimal oitemno) { 
		this.oitemno = oitemno; 
	} 
 
	public String getRealstatus() { 
		return realstatus; 
	} 
 
	public void setRealstatus(String realstatus) { 
		this.realstatus = realstatus; 
	} 
 
	public String getMonthno() { 
		return monthno; 
	} 
 
	public void setMonthno(String monthno) { 
		this.monthno = monthno; 
	} 
 
	public String getUserid() { 
		return userid; 
	} 
 
	public void setUserid(String userid) { 
		this.userid = userid; 
	} 
 
	public String getUpdtime() { 
		return updtime; 
	} 
 
	public void setUpdtime(String updtime) { 
		this.updtime = updtime; 
	} 
 
	public String getConfirmdate() { 
		return confirmdate; 
	} 
 
	public void setConfirmdate(String confirmdate) { 
		this.confirmdate = confirmdate; 
	} 
 
} 
