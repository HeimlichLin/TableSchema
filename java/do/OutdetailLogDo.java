package com.doc.common.bean; 
 
public class OutdetailLogDo { 
 
	public enum COLUMNS { 
		BONDNO("監管編號"), 
		REFBILLNO("參考單號"), 
		ITEM("項次"), 
		PRDTNO("料號"), 
		ROUTQTY("實際出倉數量"), 
		OUTUNIT("單位"), 
		OUTPOST("儲位"), 
		OUTDATE("出倉日期"), 
		BATCHNO("批號"), 
		STOCKNO("進倉單號"), 
		DECLTYPE("報單類別"), 
		DECLNO("報單號碼"), 
		ITEMNO("報單項次"), 
		ODECLNO("原報單號碼"), 
		OITEMNO("原報單項次"), 
		OUTSTATUS("出倉狀態"), 
		OUTRMKS("出倉註記"), 
		CONFIRMDATE("出倉確認日期"), 
		DESCRIP("貨名"), 
		MONTHNO("彙報單號"), 
		USERID("使用者代碼"), 
		TRADEPRDTNO("交易方料號"), 
		NWGHT("淨重"), 
		GROSS("毛重"), 
		OUTSTRNO("出倉單號"), 
		UNITPRICE("單價"), 
		CCCCODE("商品分類號列"), 
		RLSTIME("放行時間"), 
		DUTYRATE("稅率"), 
		PONO("客戶PO號碼"), 
		INVNO("彙報交易憑證"), 
		COUNTNO("彙報序號"), 
		MAWB("主提單"), 
		VESSELNO("船號(帳冊用)"), 
		DUTYTYPE("納辦"), 
		OPTYPE("營運貨物別"), 
		STATMODE("統計方式"), 
		OUTRMKS2("客戶備註欄"), 
		OREFBILLNO("原參考單號"), 
		OITEM("原項次"), 
		DECLDATE("報關日期"), 
		INVOICE("發票號碼"), 
		MOITEMNO("暫存原進倉報單項次"), 
		PROCESSTIME("異動時間"), 
		PROCESSSTATE("異動類別") 
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
	private String outrmks2; 
	private String orefbillno; 
	private BigDecimal oitem; 
	private String decldate; 
	private String invoice; 
	private BigDecimal moitemno; 
	private String processtime; 
	private String processstate; 
	
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
 
	public String getProcesstime() { 
		return processtime; 
	} 
 
	public void setProcesstime(String processtime) { 
		this.processtime = processtime; 
	} 
 
	public String getProcessstate() { 
		return processstate; 
	} 
 
	public void setProcessstate(String processstate) { 
		this.processstate = processstate; 
	} 
 
} 
