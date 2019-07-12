package com.doc.common.bean; 
 
public class PartialstoreDo { 
 
	public enum COLUMNS { 
		MSGFUN("異動別"), 
		BONDNO("監管編號"), 
		REFBILLNO("參考單號"), 
		CTMCODE("客戶編碼"), 
		REFERCODE("交易者代碼"), 
		ITEM("項次"), 
		PRDTNO("料號"), 
		STRTYPE("進出倉別"), 
		GDSTYPE("貨物類別"), 
		RSTRQTY("實際進出倉數量"), 
		STRUNIT("進出倉單位"), 
		STRPOST("進出倉儲位"), 
		STRDATE("進出倉日期"), 
		BATCHNO("批號"), 
		STOCKNO("進倉單號"), 
		OUTSTRNO("出倉單號"), 
		DECLTYPE("報單類別"), 
		DECLNO("報單號碼"), 
		ITEMNO("項次號碼"), 
		ODECLNO("原原項次號碼"), 
		OITEMNO("原項次號碼"), 
		REALSTATUS("實際進出倉狀態"), 
		MONTHNO("彙報單號"), 
		USERID("使用者代碼"), 
		CONFIRMDATE("系統日期") 
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
 
	public String getConfirmdate() { 
		return confirmdate; 
	} 
 
	public void setConfirmdate(String confirmdate) { 
		this.confirmdate = confirmdate; 
	} 
 
} 
