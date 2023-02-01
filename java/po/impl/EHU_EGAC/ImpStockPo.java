package com.doc.common.po.impl; 
 
public class ImpStockPo implements IImpStockPo {
 
	public enum COLUMNS {
		MWB("主號"), //
		EXPBAGNO("分/袋號"), //
		CONTAINER("櫃號"), //
		STOCKTYPE("理/驗貨類別"), //
		STOCKNO("盤點代碼"), //
		INPUTMODE("人工輸入"), //
		CHKPIECE("盤點件數"), //
		CHKUSER("盤點人員"), //
		CHECKDATE("盤點日期"), //
		LASTUPDATE("最後更新日"), //
		LASTUPUSER("最後更新人員"), //
		UNIQUEID("序號") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String mwb;
	private String expbagno;
	private String container;
	private String stocktype;
	private String stockno;
	private String inputmode;
	private BigDecimal chkpiece;
	private String chkuser;
	private java.sql.Timestamp checkdate;
	private java.sql.Timestamp lastupdate;
	private String lastupuser;
	private BigDecimal uniqueid;

	@Override
	public String getMwb() {
		return this.mwb;
	}
 
	@Override
	public void setMwb(final String mwb) {
		this.mwb = mwb; 
	}
 
	@Override
	public String getExpbagno() {
		return this.expbagno;
	}
 
	@Override
	public void setExpbagno(final String expbagno) {
		this.expbagno = expbagno; 
	}
 
	@Override
	public String getContainer() {
		return this.container;
	}
 
	@Override
	public void setContainer(final String container) {
		this.container = container; 
	}
 
	@Override
	public String getStocktype() {
		return this.stocktype;
	}
 
	@Override
	public void setStocktype(final String stocktype) {
		this.stocktype = stocktype; 
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
	public String getInputmode() {
		return this.inputmode;
	}
 
	@Override
	public void setInputmode(final String inputmode) {
		this.inputmode = inputmode; 
	}
 
	@Override
	public BigDecimal getChkpiece() {
		return this.chkpiece;
	}
 
	@Override
	public void setChkpiece(final BigDecimal chkpiece) {
		this.chkpiece = chkpiece; 
	}
 
	@Override
	public String getChkuser() {
		return this.chkuser;
	}
 
	@Override
	public void setChkuser(final String chkuser) {
		this.chkuser = chkuser; 
	}
 
	@Override
	public java.sql.Timestamp getCheckdate() {
		return this.checkdate;
	}
 
	@Override
	public void setCheckdate(final java.sql.Timestamp checkdate) {
		this.checkdate = checkdate; 
	}
 
	@Override
	public java.sql.Timestamp getLastupdate() {
		return this.lastupdate;
	}
 
	@Override
	public void setLastupdate(final java.sql.Timestamp lastupdate) {
		this.lastupdate = lastupdate; 
	}
 
	@Override
	public String getLastupuser() {
		return this.lastupuser;
	}
 
	@Override
	public void setLastupuser(final String lastupuser) {
		this.lastupuser = lastupuser; 
	}
 
	@Override
	public BigDecimal getUniqueid() {
		return this.uniqueid;
	}
 
	@Override
	public void setUniqueid(final BigDecimal uniqueid) {
		this.uniqueid = uniqueid; 
	}
 
}
