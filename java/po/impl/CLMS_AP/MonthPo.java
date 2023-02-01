package com.doc.common.po.impl; 
 
public class MonthPo implements IMonthPo {
 
	public enum COLUMNS {
		BONDNO("監管編號"), //
		STRTYPE("進出倉別"), //
		CTMCODE("客戶代螞"), //
		MONTHNO("彙報單號"), //
		DECLTYPE("報單類別"), //
		DECLNO("報單號碼"), //
		MDATE("彙報日期"), //
		ORDERBY("排序"), //
		CONFIRMDATE("系統時間") //
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
	private String ctmcode;
	private String monthno;
	private String decltype;
	private String declno;
	private String mdate;
	private String orderby;
	private String confirmdate;

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
	public String getCtmcode() {
		return this.ctmcode;
	}
 
	@Override
	public void setCtmcode(final String ctmcode) {
		this.ctmcode = ctmcode; 
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
	public String getMdate() {
		return this.mdate;
	}
 
	@Override
	public void setMdate(final String mdate) {
		this.mdate = mdate; 
	}
 
	@Override
	public String getOrderby() {
		return this.orderby;
	}
 
	@Override
	public void setOrderby(final String orderby) {
		this.orderby = orderby; 
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
