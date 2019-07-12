package com.doc.common.bean; 
 
public class TmpHOutdetail20070801Do { 
 
	public enum COLUMNS { 
		BONDNO("null"), 
		REFBILLNO("null"), 
		ITEM("null"), 
		PRDTNO("null"), 
		ROUTQTY("null"), 
		OUTUNIT("null"), 
		OUTPOST("null"), 
		OUTDATE("null"), 
		BATCHNO("null"), 
		STOCKNO("null"), 
		DECLTYPE("null"), 
		DECLNO("null"), 
		ITEMNO("null"), 
		ODECLNO("null"), 
		OITEMNO("null"), 
		OUTSTATUS("null"), 
		OUTRMKS("null"), 
		CONFIRMDATE("null"), 
		DESCRIP("null"), 
		MONTHNO("null"), 
		USERID("null"), 
		TRADEPRDTNO("null"), 
		NWGHT("null"), 
		GROSS("null"), 
		OUTSTRNO("null"), 
		UNITPRICE("null"), 
		CCCCODE("null"), 
		RLSTIME("null"), 
		DUTYRATE("null"), 
		PONO("null"), 
		INVNO("null"), 
		COUNTNO("null"), 
		UPDTIME("null"), 
		OUTRMKS2("null"), 
		OREFBILLNO("null"), 
		OITEM("null"), 
		DECLDATE("null"), 
		INVOICE("null"), 
		MOITEMNO("null") 
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
	private String prdtno; 
	private BigDecimal routqty; 
	private String outunit; 
	private String outpost; 
	private String outdate; 
	private String batchno; 
	private String stockno; 
	private String decltype; 
	private String declno; 
	private BigDecimal itemno; 
	private String odeclno; 
	private BigDecimal oitemno; 
	private String outstatus; 
	private String outrmks; 
	private String confirmdate; 
	private String descrip; 
	private String monthno; 
	private String userid; 
	private String tradeprdtno; 
	private BigDecimal nwght; 
	private BigDecimal gross; 
	private String outstrno; 
	private BigDecimal unitprice; 
	private String ccccode; 
	private String rlstime; 
	private BigDecimal dutyrate; 
	private String pono; 
	private String invno; 
	private BigDecimal countno; 
	private String updtime; 
	private String outrmks2; 
	private String orefbillno; 
	private BigDecimal oitem; 
	private String decldate; 
	private String invoice; 
	private BigDecimal moitemno; 
	
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
 
	public String getPrdtno() { 
		return prdtno; 
	} 
 
	public void setPrdtno(String prdtno) { 
		this.prdtno = prdtno; 
	} 
 
	public BigDecimal getRoutqty() { 
		return routqty; 
	} 
 
	public void setRoutqty(BigDecimal routqty) { 
		this.routqty = routqty; 
	} 
 
	public String getOutunit() { 
		return outunit; 
	} 
 
	public void setOutunit(String outunit) { 
		this.outunit = outunit; 
	} 
 
	public String getOutpost() { 
		return outpost; 
	} 
 
	public void setOutpost(String outpost) { 
		this.outpost = outpost; 
	} 
 
	public String getOutdate() { 
		return outdate; 
	} 
 
	public void setOutdate(String outdate) { 
		this.outdate = outdate; 
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
 
	public String getOutstatus() { 
		return outstatus; 
	} 
 
	public void setOutstatus(String outstatus) { 
		this.outstatus = outstatus; 
	} 
 
	public String getOutrmks() { 
		return outrmks; 
	} 
 
	public void setOutrmks(String outrmks) { 
		this.outrmks = outrmks; 
	} 
 
	public String getConfirmdate() { 
		return confirmdate; 
	} 
 
	public void setConfirmdate(String confirmdate) { 
		this.confirmdate = confirmdate; 
	} 
 
	public String getDescrip() { 
		return descrip; 
	} 
 
	public void setDescrip(String descrip) { 
		this.descrip = descrip; 
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
 
	public String getTradeprdtno() { 
		return tradeprdtno; 
	} 
 
	public void setTradeprdtno(String tradeprdtno) { 
		this.tradeprdtno = tradeprdtno; 
	} 
 
	public BigDecimal getNwght() { 
		return nwght; 
	} 
 
	public void setNwght(BigDecimal nwght) { 
		this.nwght = nwght; 
	} 
 
	public BigDecimal getGross() { 
		return gross; 
	} 
 
	public void setGross(BigDecimal gross) { 
		this.gross = gross; 
	} 
 
	public String getOutstrno() { 
		return outstrno; 
	} 
 
	public void setOutstrno(String outstrno) { 
		this.outstrno = outstrno; 
	} 
 
	public BigDecimal getUnitprice() { 
		return unitprice; 
	} 
 
	public void setUnitprice(BigDecimal unitprice) { 
		this.unitprice = unitprice; 
	} 
 
	public String getCcccode() { 
		return ccccode; 
	} 
 
	public void setCcccode(String ccccode) { 
		this.ccccode = ccccode; 
	} 
 
	public String getRlstime() { 
		return rlstime; 
	} 
 
	public void setRlstime(String rlstime) { 
		this.rlstime = rlstime; 
	} 
 
	public BigDecimal getDutyrate() { 
		return dutyrate; 
	} 
 
	public void setDutyrate(BigDecimal dutyrate) { 
		this.dutyrate = dutyrate; 
	} 
 
	public String getPono() { 
		return pono; 
	} 
 
	public void setPono(String pono) { 
		this.pono = pono; 
	} 
 
	public String getInvno() { 
		return invno; 
	} 
 
	public void setInvno(String invno) { 
		this.invno = invno; 
	} 
 
	public BigDecimal getCountno() { 
		return countno; 
	} 
 
	public void setCountno(BigDecimal countno) { 
		this.countno = countno; 
	} 
 
	public String getUpdtime() { 
		return updtime; 
	} 
 
	public void setUpdtime(String updtime) { 
		this.updtime = updtime; 
	} 
 
	public String getOutrmks2() { 
		return outrmks2; 
	} 
 
	public void setOutrmks2(String outrmks2) { 
		this.outrmks2 = outrmks2; 
	} 
 
	public String getOrefbillno() { 
		return orefbillno; 
	} 
 
	public void setOrefbillno(String orefbillno) { 
		this.orefbillno = orefbillno; 
	} 
 
	public BigDecimal getOitem() { 
		return oitem; 
	} 
 
	public void setOitem(BigDecimal oitem) { 
		this.oitem = oitem; 
	} 
 
	public String getDecldate() { 
		return decldate; 
	} 
 
	public void setDecldate(String decldate) { 
		this.decldate = decldate; 
	} 
 
	public String getInvoice() { 
		return invoice; 
	} 
 
	public void setInvoice(String invoice) { 
		this.invoice = invoice; 
	} 
 
	public BigDecimal getMoitemno() { 
		return moitemno; 
	} 
 
	public void setMoitemno(BigDecimal moitemno) { 
		this.moitemno = moitemno; 
	} 
 
} 
