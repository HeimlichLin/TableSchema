package com.doc.common.bean; 
 
public class Anne0701IndetailDo { 
 
	public enum COLUMNS { 
		BONDNO("null"), 
		REFBILLNO("null"), 
		ITEM("null"), 
		PRDTNO("null"), 
		RINQTY("null"), 
		INUNIT("null"), 
		BALANCE("null"), 
		INPOST("null"), 
		INDATE("null"), 
		BATCHNO("null"), 
		STOCKNO("null"), 
		DECLTYPE("null"), 
		DECLNO("null"), 
		ITEMNO("null"), 
		OTESTNO("null"), 
		INSTATUS("null"), 
		INRMKS("null"), 
		CONFIRMDATE("null"), 
		DESCRIP("null"), 
		MONTHNO("null"), 
		CCCCODE("null"), 
		D8DATE("null"), 
		USERID("null"), 
		TRADEPRDTNO("null"), 
		UNITPRICE("null"), 
		NWGHT("null"), 
		GROSS("null"), 
		VALUEAMT("null"), 
		DUTYRATE("null"), 
		COMDTAXRATE("null"), 
		MDECLNO("null"), 
		D8DECLNO("null"), 
		OUTSTRNO("null"), 
		DECLQTY("null"), 
		RLSTIME("null"), 
		COUNTNO("null"), 
		DUTYTYPE("null"), 
		STATMODE("null"), 
		ODECLNO("null"), 
		OITEMNO("null"), 
		OUTSTATUS("null"), 
		OPTYPE("null"), 
		ADJUSTQTY("null") 
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
	private BigDecimal rinqty; 
	private String inunit; 
	private BigDecimal balance; 
	private String inpost; 
	private String indate; 
	private String batchno; 
	private String stockno; 
	private String decltype; 
	private String declno; 
	private BigDecimal itemno; 
	private String otestno; 
	private String instatus; 
	private String inrmks; 
	private String confirmdate; 
	private String descrip; 
	private String monthno; 
	private String ccccode; 
	private String d8date; 
	private String userid; 
	private String tradeprdtno; 
	private BigDecimal unitprice; 
	private BigDecimal nwght; 
	private BigDecimal gross; 
	private BigDecimal valueamt; 
	private BigDecimal dutyrate; 
	private BigDecimal comdtaxrate; 
	private String mdeclno; 
	private String d8declno; 
	private String outstrno; 
	private BigDecimal declqty; 
	private String rlstime; 
	private BigDecimal countno; 
	private String dutytype; 
	private String statmode; 
	private String odeclno; 
	private BigDecimal oitemno; 
	private String outstatus; 
	private String optype; 
	private BigDecimal adjustqty; 
	
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
 
	public BigDecimal getBalance() { 
		return balance; 
	} 
 
	public void setBalance(BigDecimal balance) { 
		this.balance = balance; 
	} 
 
	public String getInpost() { 
		return inpost; 
	} 
 
	public void setInpost(String inpost) { 
		this.inpost = inpost; 
	} 
 
	public String getIndate() { 
		return indate; 
	} 
 
	public void setIndate(String indate) { 
		this.indate = indate; 
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
 
	public String getOtestno() { 
		return otestno; 
	} 
 
	public void setOtestno(String otestno) { 
		this.otestno = otestno; 
	} 
 
	public String getInstatus() { 
		return instatus; 
	} 
 
	public void setInstatus(String instatus) { 
		this.instatus = instatus; 
	} 
 
	public String getInrmks() { 
		return inrmks; 
	} 
 
	public void setInrmks(String inrmks) { 
		this.inrmks = inrmks; 
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
 
	public String getCcccode() { 
		return ccccode; 
	} 
 
	public void setCcccode(String ccccode) { 
		this.ccccode = ccccode; 
	} 
 
	public String getD8date() { 
		return d8date; 
	} 
 
	public void setD8date(String d8date) { 
		this.d8date = d8date; 
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
 
	public BigDecimal getUnitprice() { 
		return unitprice; 
	} 
 
	public void setUnitprice(BigDecimal unitprice) { 
		this.unitprice = unitprice; 
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
 
	public BigDecimal getValueamt() { 
		return valueamt; 
	} 
 
	public void setValueamt(BigDecimal valueamt) { 
		this.valueamt = valueamt; 
	} 
 
	public BigDecimal getDutyrate() { 
		return dutyrate; 
	} 
 
	public void setDutyrate(BigDecimal dutyrate) { 
		this.dutyrate = dutyrate; 
	} 
 
	public BigDecimal getComdtaxrate() { 
		return comdtaxrate; 
	} 
 
	public void setComdtaxrate(BigDecimal comdtaxrate) { 
		this.comdtaxrate = comdtaxrate; 
	} 
 
	public String getMdeclno() { 
		return mdeclno; 
	} 
 
	public void setMdeclno(String mdeclno) { 
		this.mdeclno = mdeclno; 
	} 
 
	public String getD8declno() { 
		return d8declno; 
	} 
 
	public void setD8declno(String d8declno) { 
		this.d8declno = d8declno; 
	} 
 
	public String getOutstrno() { 
		return outstrno; 
	} 
 
	public void setOutstrno(String outstrno) { 
		this.outstrno = outstrno; 
	} 
 
	public BigDecimal getDeclqty() { 
		return declqty; 
	} 
 
	public void setDeclqty(BigDecimal declqty) { 
		this.declqty = declqty; 
	} 
 
	public String getRlstime() { 
		return rlstime; 
	} 
 
	public void setRlstime(String rlstime) { 
		this.rlstime = rlstime; 
	} 
 
	public BigDecimal getCountno() { 
		return countno; 
	} 
 
	public void setCountno(BigDecimal countno) { 
		this.countno = countno; 
	} 
 
	public String getDutytype() { 
		return dutytype; 
	} 
 
	public void setDutytype(String dutytype) { 
		this.dutytype = dutytype; 
	} 
 
	public String getStatmode() { 
		return statmode; 
	} 
 
	public void setStatmode(String statmode) { 
		this.statmode = statmode; 
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
 
	public String getOptype() { 
		return optype; 
	} 
 
	public void setOptype(String optype) { 
		this.optype = optype; 
	} 
 
	public BigDecimal getAdjustqty() { 
		return adjustqty; 
	} 
 
	public void setAdjustqty(BigDecimal adjustqty) { 
		this.adjustqty = adjustqty; 
	} 
 
} 
