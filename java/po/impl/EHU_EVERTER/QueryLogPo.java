package com.doc.common.po.impl; 
 
public class QueryLogPo implements IQueryLogPo {
 
	public enum COLUMNS {
		U_ID("null"), //
		U_NAME("null"), //
		U_TYPE("null"), //
		U_COMPANY("null"), //
		S1_PWD("null"), //
		U_IP("null"), //
		ENTER_DATE("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String uId;
	private String uName;
	private String uType;
	private String uCompany;
	private String s1Pwd;
	private String uIp;
	private String enterDate;

	@Override
	public String getUId() {
		return this.uId;
	}
 
	@Override
	public void setUId(final String uId) {
		this.uId = uId; 
	}
 
	@Override
	public String getUName() {
		return this.uName;
	}
 
	@Override
	public void setUName(final String uName) {
		this.uName = uName; 
	}
 
	@Override
	public String getUType() {
		return this.uType;
	}
 
	@Override
	public void setUType(final String uType) {
		this.uType = uType; 
	}
 
	@Override
	public String getUCompany() {
		return this.uCompany;
	}
 
	@Override
	public void setUCompany(final String uCompany) {
		this.uCompany = uCompany; 
	}
 
	@Override
	public String getS1Pwd() {
		return this.s1Pwd;
	}
 
	@Override
	public void setS1Pwd(final String s1Pwd) {
		this.s1Pwd = s1Pwd; 
	}
 
	@Override
	public String getUIp() {
		return this.uIp;
	}
 
	@Override
	public void setUIp(final String uIp) {
		this.uIp = uIp; 
	}
 
	@Override
	public String getEnterDate() {
		return this.enterDate;
	}
 
	@Override
	public void setEnterDate(final String enterDate) {
		this.enterDate = enterDate; 
	}
 
}
