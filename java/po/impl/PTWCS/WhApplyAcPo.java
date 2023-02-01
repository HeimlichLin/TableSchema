package com.doc.common.po.impl; 
 
public class WhApplyAcPo implements IWhApplyAcPo {
 
	public enum COLUMNS {
		WH_APPLY_SER_NO("參考：入倉申請"), //
		WH_CODE("參考：管制點資料檔"), //
		AC_ID("參考：管制點資料檔") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String whApplySerNo;
	private String whCode;
	private String acId;

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
