package com.doc.common.po.impl; 
 
public class BackerrorPo implements IBackerrorPo {
 
	public enum COLUMNS {
		BONDNO("監管編號"), //
		REFBILLNO("參考單號"), //
		ITEM("項次"), //
		STRPOST("進倉儲位"), //
		DECLNO("報單號碼"), //
		ITEMNO("報單項次"), //
		STRDATE("null"), //
		BACKTABLE("null"), //
		ERRCODE("null"), //
		ERRDESC("null"), //
		LOGTIME("null"), //
		STRTYPE("null"), //
		BACKTYPE("null") //
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
	private String strpost;
	private String declno;
	private BigDecimal itemno;
	private String strdate;
	private String backtable;
	private BigDecimal errcode;
	private String errdesc;
	private String logtime;
	private String strtype;
	private String backtype;

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
	public String getStrpost() {
		return this.strpost;
	}
 
	@Override
	public void setStrpost(final String strpost) {
		this.strpost = strpost; 
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
	public String getStrdate() {
		return this.strdate;
	}
 
	@Override
	public void setStrdate(final String strdate) {
		this.strdate = strdate; 
	}
 
	@Override
	public String getBacktable() {
		return this.backtable;
	}
 
	@Override
	public void setBacktable(final String backtable) {
		this.backtable = backtable; 
	}
 
	@Override
	public BigDecimal getErrcode() {
		return this.errcode;
	}
 
	@Override
	public void setErrcode(final BigDecimal errcode) {
		this.errcode = errcode; 
	}
 
	@Override
	public String getErrdesc() {
		return this.errdesc;
	}
 
	@Override
	public void setErrdesc(final String errdesc) {
		this.errdesc = errdesc; 
	}
 
	@Override
	public String getLogtime() {
		return this.logtime;
	}
 
	@Override
	public void setLogtime(final String logtime) {
		this.logtime = logtime; 
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
	public String getBacktype() {
		return this.backtype;
	}
 
	@Override
	public void setBacktype(final String backtype) {
		this.backtype = backtype; 
	}
 
}
