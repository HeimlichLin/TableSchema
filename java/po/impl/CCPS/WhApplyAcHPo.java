package com.doc.common.po.impl; 
 
public class WhApplyAcHPo implements IWhApplyAcHPo {
 
	public enum COLUMNS {
		RECORD_NO("紀錄編號"), //
		WH_APPLY_SER_NO("入倉申請序號"), //
		WH_CODE("貨棧代號"), //
		AC_ID("管制點編號") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String recordNo;
	private String whApplySerNo;
	private String whCode;
	private String acId;

	@Override
	public String getRecordNo() {
		return this.recordNo;
	}
 
	@Override
	public void setRecordNo(final String recordNo) {
		this.recordNo = recordNo; 
	}
 
	@Override
	public String getWhApplySerNo() {
		return this.whApplySerNo;
	}
 
	@Override
	public void setWhApplySerNo(final String whApplySerNo) {
		this.whApplySerNo = whApplySerNo; 
	}
 
	@Override
	public String getWhCode() {
		return this.whCode;
	}
 
	@Override
	public void setWhCode(final String whCode) {
		this.whCode = whCode; 
	}
 
	@Override
	public String getAcId() {
		return this.acId;
	}
 
	@Override
	public void setAcId(final String acId) {
		this.acId = acId; 
	}
 
}
