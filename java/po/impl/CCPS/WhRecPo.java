package com.doc.common.po.impl; 
 
public class WhRecPo implements IWhRecPo {
 
	public enum COLUMNS {
		WH_REC_SER_NO("yyyyMMddHHMMssSSS+三位流水號"), //
		AC_ID("參考：管制點資料檔"), //
		IC_CODE("參考：證件對應IC卡設定"), //
		WH_DT("入倉日期時間"), //
		COMMENT("備註"), //
		WH_APPLY_SER_NO("參考：入倉申請") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String whRecSerNo;
	private String acId;
	private String icCode;
	private java.sql.Timestamp whDt;
	private String comment;
	private String whApplySerNo;

	@Override
	public String getWhRecSerNo() {
		return this.whRecSerNo;
	}
 
	@Override
	public void setWhRecSerNo(final String whRecSerNo) {
		this.whRecSerNo = whRecSerNo; 
	}
 
	@Override
	public String getAcId() {
		return this.acId;
	}
 
	@Override
	public void setAcId(final String acId) {
		this.acId = acId; 
	}
 
	@Override
	public String getIcCode() {
		return this.icCode;
	}
 
	@Override
	public void setIcCode(final String icCode) {
		this.icCode = icCode; 
	}
 
	@Override
	public java.sql.Timestamp getWhDt() {
		return this.whDt;
	}
 
	@Override
	public void setWhDt(final java.sql.Timestamp whDt) {
		this.whDt = whDt; 
	}
 
	@Override
	public String getComment() {
		return this.comment;
	}
 
	@Override
	public void setComment(final String comment) {
		this.comment = comment; 
	}
 
	@Override
	public String getWhApplySerNo() {
		return this.whApplySerNo;
	}
 
	@Override
	public void setWhApplySerNo(final String whApplySerNo) {
		this.whApplySerNo = whApplySerNo; 
	}
 
}
