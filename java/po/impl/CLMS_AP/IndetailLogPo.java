package com.doc.common.po.impl; 
 
public class IndetailLogPo implements IIndetailLogPo {
 
	public enum COLUMNS {
		BONDNO("監管編號"), //
		REFBILLNO("參考單號"), //
		ITEM("項次"), //
		PRDTNO("料號"), //
		RINQTY("實際進倉數量"), //
		INUNIT("進倉單位"), //
		BALANCE("庫存量"), //
		INPOST("進倉儲位"), //
		INDATE("進倉日期"), //
		BATCHNO("批號"), //
		STOCKNO("進倉單號"), //
		DECLTYPE("報單類別"), //
		DECLNO("報單號碼"), //
		ITEMNO("報單項次"), //
		OTESTNO("null"), //
		INSTATUS("進倉狀態"), //
		INRMKS("客戶備註欄位"), //
		CONFIRMDATE("進倉確認日期"), //
		DESCRIP("貨名"), //
		MONTHNO("彙報單號"), //
		CCCCODE("商品分類號列"), //
		D8DATE("原進倉日期"), //
		USERID("使用者代碼"), //
		TRADEPRDTNO("交易方料號"), //
		UNITPRICE("單價"), //
		NWGHT("淨重"), //
		GROSS("毛重"), //
		VALUEAMT("完稅價格"), //
		DUTYRATE("進口稅率"), //
		COMDTAXRATE("貨物稅率"), //
		MDECLNO("彙報報單號碼"), //
		D8DECLNO("D8報單號碼"), //
		OUTSTRNO("出倉單號"), //
		DECLQTY("申報數量"), //
		RLSTIME("放行時間"), //
		COUNTNO("彙報序號"), //
		DUTYTYPE("納辦"), //
		STATMODE("統計方式"), //
		ODECLNO("原報單"), //
		OITEMNO("原項次"), //
		OUTSTATUS("核銷狀態"), //
		OPTYPE("營運貨物別"), //
		ADJUSTQTY("調整數量"), //
		INRMKS2("客戶註記"), //
		INVOICE("發票號碼"), //
		INVNO("彙報交易憑證"), //
		DECLDATE("報關日期"), //
		PROCESSTIME("異動日期"), //
		PROCESSSTATE("異動類別") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
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
	private String inrmks2;
	private String invoice;
	private String invno;
	private String decldate;
	private String processtime;
	private String processstate;

	@Override
	public String getBondno() {
		return this.bondno;
	}
 
	@Override
	public void setBondno(final String bondno) {
		this.bondno = bondno; 
	}
 
	@Override
	public String getRefbillno() {
		return this.refbillno;
	}
 
	@Override
	public void setRefbillno(final String refbillno) {
		this.refbillno = refbillno; 
	}
 
	@Override
	public BigDecimal getItem() {
		return this.item;
	}
 
	@Override
	public void setItem(final BigDecimal item) {
		this.item = item; 
	}
 
	@Override
	public String getPrdtno() {
		return this.prdtno;
	}
 
	@Override
	public void setPrdtno(final String prdtno) {
		this.prdtno = prdtno; 
	}
 
	@Override
	public BigDecimal getRinqty() {
		return this.rinqty;
	}
 
	@Override
	public void setRinqty(final BigDecimal rinqty) {
		this.rinqty = rinqty; 
	}
 
	@Override
	public String getInunit() {
		return this.inunit;
	}
 
	@Override
	public void setInunit(final String inunit) {
		this.inunit = inunit; 
	}
 
	@Override
	public BigDecimal getBalance() {
		return this.balance;
	}
 
	@Override
	public void setBalance(final BigDecimal balance) {
		this.balance = balance; 
	}
 
	@Override
	public String getInpost() {
		return this.inpost;
	}
 
	@Override
	public void setInpost(final String inpost) {
		this.inpost = inpost; 
	}
 
	@Override
	public String getIndate() {
		return this.indate;
	}
 
	@Override
	public void setIndate(final String indate) {
		this.indate = indate; 
	}
 
	@Override
	public String getBatchno() {
		return this.batchno;
	}
 
	@Override
	public void setBatchno(final String batchno) {
		this.batchno = batchno; 
	}
 
	@Override
	public String getStockno() {
		return this.stockno;
	}
 
	@Override
	public void setStockno(final String stockno) {
		this.stockno = stockno; 
	}
 
	@Override
	public String getDecltype() {
		return this.decltype;
	}
 
	@Override
	public void setDecltype(final String decltype) {
		this.decltype = decltype; 
	}
 
	@Override
	public String getDeclno() {
		return this.declno;
	}
 
	@Override
	public void setDeclno(final String declno) {
		this.declno = declno; 
	}
 
	@Override
	public BigDecimal getItemno() {
		return this.itemno;
	}
 
	@Override
	public void setItemno(final BigDecimal itemno) {
		this.itemno = itemno; 
	}
 
	@Override
	public String getOtestno() {
		return this.otestno;
	}
 
	@Override
	public void setOtestno(final String otestno) {
		this.otestno = otestno; 
	}
 
	@Override
	public String getInstatus() {
		return this.instatus;
	}
 
	@Override
	public void setInstatus(final String instatus) {
		this.instatus = instatus; 
	}
 
	@Override
	public String getInrmks() {
		return this.inrmks;
	}
 
	@Override
	public void setInrmks(final String inrmks) {
		this.inrmks = inrmks; 
	}
 
	@Override
	public String getConfirmdate() {
		return this.confirmdate;
	}
 
	@Override
	public void setConfirmdate(final String confirmdate) {
		this.confirmdate = confirmdate; 
	}
 
	@Override
	public String getDescrip() {
		return this.descrip;
	}
 
	@Override
	public void setDescrip(final String descrip) {
		this.descrip = descrip; 
	}
 
	@Override
	public String getMonthno() {
		return this.monthno;
	}
 
	@Override
	public void setMonthno(final String monthno) {
		this.monthno = monthno; 
	}
 
	@Override
	public String getCcccode() {
		return this.ccccode;
	}
 
	@Override
	public void setCcccode(final String ccccode) {
		this.ccccode = ccccode; 
	}
 
	@Override
	public String getD8date() {
		return this.d8date;
	}
 
	@Override
	public void setD8date(final String d8date) {
		this.d8date = d8date; 
	}
 
	@Override
	public String getUserid() {
		return this.userid;
	}
 
	@Override
	public void setUserid(final String userid) {
		this.userid = userid; 
	}
 
	@Override
	public String getTradeprdtno() {
		return this.tradeprdtno;
	}
 
	@Override
	public void setTradeprdtno(final String tradeprdtno) {
		this.tradeprdtno = tradeprdtno; 
	}
 
	@Override
	public BigDecimal getUnitprice() {
		return this.unitprice;
	}
 
	@Override
	public void setUnitprice(final BigDecimal unitprice) {
		this.unitprice = unitprice; 
	}
 
	@Override
	public BigDecimal getNwght() {
		return this.nwght;
	}
 
	@Override
	public void setNwght(final BigDecimal nwght) {
		this.nwght = nwght; 
	}
 
	@Override
	public BigDecimal getGross() {
		return this.gross;
	}
 
	@Override
	public void setGross(final BigDecimal gross) {
		this.gross = gross; 
	}
 
	@Override
	public BigDecimal getValueamt() {
		return this.valueamt;
	}
 
	@Override
	public void setValueamt(final BigDecimal valueamt) {
		this.valueamt = valueamt; 
	}
 
	@Override
	public BigDecimal getDutyrate() {
		return this.dutyrate;
	}
 
	@Override
	public void setDutyrate(final BigDecimal dutyrate) {
		this.dutyrate = dutyrate; 
	}
 
	@Override
	public BigDecimal getComdtaxrate() {
		return this.comdtaxrate;
	}
 
	@Override
	public void setComdtaxrate(final BigDecimal comdtaxrate) {
		this.comdtaxrate = comdtaxrate; 
	}
 
	@Override
	public String getMdeclno() {
		return this.mdeclno;
	}
 
	@Override
	public void setMdeclno(final String mdeclno) {
		this.mdeclno = mdeclno; 
	}
 
	@Override
	public String getD8declno() {
		return this.d8declno;
	}
 
	@Override
	public void setD8declno(final String d8declno) {
		this.d8declno = d8declno; 
	}
 
	@Override
	public String getOutstrno() {
		return this.outstrno;
	}
 
	@Override
	public void setOutstrno(final String outstrno) {
		this.outstrno = outstrno; 
	}
 
	@Override
	public BigDecimal getDeclqty() {
		return this.declqty;
	}
 
	@Override
	public void setDeclqty(final BigDecimal declqty) {
		this.declqty = declqty; 
	}
 
	@Override
	public String getRlstime() {
		return this.rlstime;
	}
 
	@Override
	public void setRlstime(final String rlstime) {
		this.rlstime = rlstime; 
	}
 
	@Override
	public BigDecimal getCountno() {
		return this.countno;
	}
 
	@Override
	public void setCountno(final BigDecimal countno) {
		this.countno = countno; 
	}
 
	@Override
	public String getDutytype() {
		return this.dutytype;
	}
 
	@Override
	public void setDutytype(final String dutytype) {
		this.dutytype = dutytype; 
	}
 
	@Override
	public String getStatmode() {
		return this.statmode;
	}
 
	@Override
	public void setStatmode(final String statmode) {
		this.statmode = statmode; 
	}
 
	@Override
	public String getOdeclno() {
		return this.odeclno;
	}
 
	@Override
	public void setOdeclno(final String odeclno) {
		this.odeclno = odeclno; 
	}
 
	@Override
	public BigDecimal getOitemno() {
		return this.oitemno;
	}
 
	@Override
	public void setOitemno(final BigDecimal oitemno) {
		this.oitemno = oitemno; 
	}
 
	@Override
	public String getOutstatus() {
		return this.outstatus;
	}
 
	@Override
	public void setOutstatus(final String outstatus) {
		this.outstatus = outstatus; 
	}
 
	@Override
	public String getOptype() {
		return this.optype;
	}
 
	@Override
	public void setOptype(final String optype) {
		this.optype = optype; 
	}
 
	@Override
	public BigDecimal getAdjustqty() {
		return this.adjustqty;
	}
 
	@Override
	public void setAdjustqty(final BigDecimal adjustqty) {
		this.adjustqty = adjustqty; 
	}
 
	@Override
	public String getInrmks2() {
		return this.inrmks2;
	}
 
	@Override
	public void setInrmks2(final String inrmks2) {
		this.inrmks2 = inrmks2; 
	}
 
	@Override
	public String getInvoice() {
		return this.invoice;
	}
 
	@Override
	public void setInvoice(final String invoice) {
		this.invoice = invoice; 
	}
 
	@Override
	public String getInvno() {
		return this.invno;
	}
 
	@Override
	public void setInvno(final String invno) {
		this.invno = invno; 
	}
 
	@Override
	public String getDecldate() {
		return this.decldate;
	}
 
	@Override
	public void setDecldate(final String decldate) {
		this.decldate = decldate; 
	}
 
	@Override
	public String getProcesstime() {
		return this.processtime;
	}
 
	@Override
	public void setProcesstime(final String processtime) {
		this.processtime = processtime; 
	}
 
	@Override
	public String getProcessstate() {
		return this.processstate;
	}
 
	@Override
	public void setProcessstate(final String processstate) {
		this.processstate = processstate; 
	}
 
}
