package com.doc.common.po.impl; 
 
public class TmpHOutdetail20070801Po implements ITmpHOutdetail20070801Po {
 
	public enum COLUMNS {
		BONDNO("null"), //
		REFBILLNO("null"), //
		ITEM("null"), //
		PRDTNO("null"), //
		ROUTQTY("null"), //
		OUTUNIT("null"), //
		OUTPOST("null"), //
		OUTDATE("null"), //
		BATCHNO("null"), //
		STOCKNO("null"), //
		DECLTYPE("null"), //
		DECLNO("null"), //
		ITEMNO("null"), //
		ODECLNO("null"), //
		OITEMNO("null"), //
		OUTSTATUS("null"), //
		OUTRMKS("null"), //
		CONFIRMDATE("null"), //
		DESCRIP("null"), //
		MONTHNO("null"), //
		USERID("null"), //
		TRADEPRDTNO("null"), //
		NWGHT("null"), //
		GROSS("null"), //
		OUTSTRNO("null"), //
		UNITPRICE("null"), //
		CCCCODE("null"), //
		RLSTIME("null"), //
		DUTYRATE("null"), //
		PONO("null"), //
		INVNO("null"), //
		COUNTNO("null"), //
		UPDTIME("null"), //
		OUTRMKS2("null"), //
		OREFBILLNO("null"), //
		OITEM("null"), //
		DECLDATE("null"), //
		INVOICE("null"), //
		MOITEMNO("null") //
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
	public BigDecimal getRoutqty() {
		return this.routqty;
	}
 
	@Override
	public void setRoutqty(final BigDecimal routqty) {
		this.routqty = routqty; 
	}
 
	@Override
	public String getOutunit() {
		return this.outunit;
	}
 
	@Override
	public void setOutunit(final String outunit) {
		this.outunit = outunit; 
	}
 
	@Override
	public String getOutpost() {
		return this.outpost;
	}
 
	@Override
	public void setOutpost(final String outpost) {
		this.outpost = outpost; 
	}
 
	@Override
	public String getOutdate() {
		return this.outdate;
	}
 
	@Override
	public void setOutdate(final String outdate) {
		this.outdate = outdate; 
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
	public String getOutrmks() {
		return this.outrmks;
	}
 
	@Override
	public void setOutrmks(final String outrmks) {
		this.outrmks = outrmks; 
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
	public String getOutstrno() {
		return this.outstrno;
	}
 
	@Override
	public void setOutstrno(final String outstrno) {
		this.outstrno = outstrno; 
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
	public String getCcccode() {
		return this.ccccode;
	}
 
	@Override
	public void setCcccode(final String ccccode) {
		this.ccccode = ccccode; 
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
	public BigDecimal getDutyrate() {
		return this.dutyrate;
	}
 
	@Override
	public void setDutyrate(final BigDecimal dutyrate) {
		this.dutyrate = dutyrate; 
	}
 
	@Override
	public String getPono() {
		return this.pono;
	}
 
	@Override
	public void setPono(final String pono) {
		this.pono = pono; 
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
	public BigDecimal getCountno() {
		return this.countno;
	}
 
	@Override
	public void setCountno(final BigDecimal countno) {
		this.countno = countno; 
	}
 
	@Override
	public String getUpdtime() {
		return this.updtime;
	}
 
	@Override
	public void setUpdtime(final String updtime) {
		this.updtime = updtime; 
	}
 
	@Override
	public String getOutrmks2() {
		return this.outrmks2;
	}
 
	@Override
	public void setOutrmks2(final String outrmks2) {
		this.outrmks2 = outrmks2; 
	}
 
	@Override
	public String getOrefbillno() {
		return this.orefbillno;
	}
 
	@Override
	public void setOrefbillno(final String orefbillno) {
		this.orefbillno = orefbillno; 
	}
 
	@Override
	public BigDecimal getOitem() {
		return this.oitem;
	}
 
	@Override
	public void setOitem(final BigDecimal oitem) {
		this.oitem = oitem; 
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
	public String getInvoice() {
		return this.invoice;
	}
 
	@Override
	public void setInvoice(final String invoice) {
		this.invoice = invoice; 
	}
 
	@Override
	public BigDecimal getMoitemno() {
		return this.moitemno;
	}
 
	@Override
	public void setMoitemno(final BigDecimal moitemno) {
		this.moitemno = moitemno; 
	}
 
}
