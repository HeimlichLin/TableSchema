package com.doc.common.po.impl; 
 
public class WorkpicturePo implements IWorkpicturePo {
 
	public enum COLUMNS {
		INDAY("null"), //
		EXPRESSID("null"), //
		EXPRESSSNAME("null"), //
		NUMBERONBAG("null"), //
		MD5("null"), //
		REMARK("null"), //
		USERID("null"), //
		UPLOADDATE("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private java.sql.Timestamp inday;
	private String expressid;
	private String expresssname;
	private String numberonbag;
	private String md5;
	private String remark;
	private String userid;
	private java.sql.Timestamp uploaddate;

	@Override
	public java.sql.Timestamp getInday() {
		return this.inday;
	}
 
	@Override
	public void setInday(final java.sql.Timestamp inday) {
		this.inday = inday; 
	}
 
	@Override
	public String getExpressid() {
		return this.expressid;
	}
 
	@Override
	public void setExpressid(final String expressid) {
		this.expressid = expressid; 
	}
 
	@Override
	public String getExpresssname() {
		return this.expresssname;
	}
 
	@Override
	public void setExpresssname(final String expresssname) {
		this.expresssname = expresssname; 
	}
 
	@Override
	public String getNumberonbag() {
		return this.numberonbag;
	}
 
	@Override
	public void setNumberonbag(final String numberonbag) {
		this.numberonbag = numberonbag; 
	}
 
	@Override
	public String getMd5() {
		return this.md5;
	}
 
	@Override
	public void setMd5(final String md5) {
		this.md5 = md5; 
	}
 
	@Override
	public String getRemark() {
		return this.remark;
	}
 
	@Override
	public void setRemark(final String remark) {
		this.remark = remark; 
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
	public java.sql.Timestamp getUploaddate() {
		return this.uploaddate;
	}
 
	@Override
	public void setUploaddate(final java.sql.Timestamp uploaddate) {
		this.uploaddate = uploaddate; 
	}
 
}
