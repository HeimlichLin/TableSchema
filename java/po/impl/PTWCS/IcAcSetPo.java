package com.doc.common.po.impl; 
 
public class IcAcSetPo implements IIcAcSetPo {
 
	public enum COLUMNS {
		IC_NO("參考：管制點資料檔"), //
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
 
	private String icNo;
	private String whCode;
	private String acId;

	@Override
	public String getIcNo() {
		return this.icNo;
	}
 
	@Override
	public void setIcNo(final String icNo) {
		this.icNo = icNo; 
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
