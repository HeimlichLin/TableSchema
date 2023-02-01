package com.doc.common.po.impl; 
 
public class ShutdeclarPo implements IShutdeclarPo {
 
	public enum COLUMNS {
		BONDNO("海關監管編號"), //
		STRTYPE("進出倉別"), //
		DECLTYPE("報單類別"), //
		SHIPTYPE("空海運別"), //
		DECLNO("報單號碼"), //
		DOCNO("退關文件號碼"), //
		SHUTDATE("退關日期"), //
		MSGFUN("異動別"), //
		RMK("備註"), //
		UPDTIME("船公司名稱") //
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
	private String strtype;
	private String decltype;
	private String shiptype;
	private String declno;
	private String docno;
	private String shutdate;
	private String msgfun;
	private String rmk;
	private String updtime;

	@Override
	public String getBondno() {
		return this.bondno;
	}
 
	@Override
	public void setBondno(final String bondno) {
		this.bondno = bondno; 
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
	public String getDecltype() {
		return this.decltype;
	}
 
	@Override
	public void setDecltype(final String decltype) {
		this.decltype = decltype; 
	}
 
	@Override
	public String getShiptype() {
		return this.shiptype;
	}
 
	@Override
	public void setShiptype(final String shiptype) {
		this.shiptype = shiptype; 
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
	public String getDocno() {
		return this.docno;
	}
 
	@Override
	public void setDocno(final String docno) {
		this.docno = docno; 
	}
 
	@Override
	public String getShutdate() {
		return this.shutdate;
	}
 
	@Override
	public void setShutdate(final String shutdate) {
		this.shutdate = shutdate; 
	}
 
	@Override
	public String getMsgfun() {
		return this.msgfun;
	}
 
	@Override
	public void setMsgfun(final String msgfun) {
		this.msgfun = msgfun; 
	}
 
	@Override
	public String getRmk() {
		return this.rmk;
	}
 
	@Override
	public void setRmk(final String rmk) {
		this.rmk = rmk; 
	}
 
	@Override
	public String getUpdtime() {
		return this.updtime;
	}
 
	@Override
	public void setUpdtime(final String updtime) {
		this.updtime = updtime; 
	}
 
}
