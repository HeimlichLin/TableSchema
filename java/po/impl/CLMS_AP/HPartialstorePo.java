package com.doc.common.po.impl; 
 
public class HPartialstorePo implements IHPartialstorePo {
 
	public enum COLUMNS {
		MSGFUN("異動別"), //
		BONDNO("監管編號"), //
		REFBILLNO("參考單號"), //
		CTMCODE("客戶編碼"), //
		REFERCODE("交易者代碼"), //
		ITEM("項次"), //
		PRDTNO("料號"), //
		STRTYPE("進出倉別"), //
		GDSTYPE("貨物類別"), //
		RSTRQTY("實際進出倉數量"), //
		STRUNIT("進出倉單位"), //
		STRPOST("進出倉儲位"), //
		STRDATE("進出倉日期"), //
		BATCHNO("批號"), //
		STOCKNO("進倉單號"), //
		OUTSTRNO("出倉單號"), //
		DECLTYPE("報單類別"), //
		DECLNO("報單號碼"), //
		ITEMNO("項次號碼"), //
		ODECLNO("原報單號碼"), //
		OITEMNO("原項次號碼"), //
		REALSTATUS("實際進出倉狀態"), //
		MONTHNO("彙報單號"), //
		USERID("使用者代碼"), //
		UPDTIME("系統時間"), //
		CONFIRMDATE("分批出倉確認時間") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
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

	@Override
	public String getMsgfun() {
		return this.msgfun;
	}
 
	@Override
	public void setMsgfun(final String msgfun) {
		this.msgfun = msgfun; 
	}
 
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
	public String getCtmcode() {
		return this.ctmcode;
	}
 
	@Override
	public void setCtmcode(final String ctmcode) {
		this.ctmcode = ctmcode; 
	}
 
	@Override
	public String getRefercode() {
		return this.refercode;
	}
 
	@Override
	public void setRefercode(final String refercode) {
		this.refercode = refercode; 
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
	public String getStrtype() {
		return this.strtype;
	}
 
	@Override
	public void setStrtype(final String strtype) {
		this.strtype = strtype; 
	}
 
	@Override
	public String getGdstype() {
		return this.gdstype;
	}
 
	@Override
	public void setGdstype(final String gdstype) {
		this.gdstype = gdstype; 
	}
 
	@Override
	public BigDecimal getRstrqty() {
		return this.rstrqty;
	}
 
	@Override
	public void setRstrqty(final BigDecimal rstrqty) {
		this.rstrqty = rstrqty; 
	}
 
	@Override
	public String getStrunit() {
		return this.strunit;
	}
 
	@Override
	public void setStrunit(final String strunit) {
		this.strunit = strunit; 
	}
 
	@Override
	public String getStrpost() {
		return this.strpost;
	}
 
	@Override
	public void setStrpost(final String strpost) {
		this.strpost = strpost; 
	}
 
	@Override
	public String getStrdate() {
		return this.strdate;
	}
 
	@Override
	public void setStrdate(final String strdate) {
		this.strdate = strdate; 
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
	public String getOutstrno() {
		return this.outstrno;
	}
 
	@Override
	public void setOutstrno(final String outstrno) {
		this.outstrno = outstrno; 
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
	public String getRealstatus() {
		return this.realstatus;
	}
 
	@Override
	public void setRealstatus(final String realstatus) {
		this.realstatus = realstatus; 
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
	public String getUpdtime() {
		return this.updtime;
	}
 
	@Override
	public void setUpdtime(final String updtime) {
		this.updtime = updtime; 
	}
 
	@Override
	public String getConfirmdate() {
		return this.confirmdate;
	}
 
	@Override
	public void setConfirmdate(final String confirmdate) {
		this.confirmdate = confirmdate; 
	}
 
}
