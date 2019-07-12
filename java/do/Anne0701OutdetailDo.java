package com.doc.common.bean; 
 
public class Anne0701OutdetailDo { 
 
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
		MAWB("null"), 
		VESSELNO("null"), 
		DUTYTYPE("null"), 
		OPTYPE("null"), 
		STATMODE("null") 
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
	private String mawb; 
	private String vesselno; 
	private String dutytype; 
	private String optype; 
	private String statmode; 
	
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
 
	public String getMawb() { 
		return mawb; 
	} 
 
	public void setMawb(String mawb) { 
		this.mawb = mawb; 
	} 
 
	public String getVesselno() { 
		return vesselno; 
	} 
 
	public void setVesselno(String vesselno) { 
		this.vesselno = vesselno; 
	} 
 
	public String getDutytype() { 
		return dutytype; 
	} 
 
	public void setDutytype(String dutytype) { 
		this.dutytype = dutytype; 
	} 
 
	public String getOptype() { 
		return optype; 
	} 
 
	public void setOptype(String optype) { 
		this.optype = optype; 
	} 
 
	public String getStatmode() { 
		return statmode; 
	} 
 
	public void setStatmode(String statmode) { 
		this.statmode = statmode; 
	} 
 
} 
