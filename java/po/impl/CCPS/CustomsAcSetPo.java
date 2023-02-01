package com.doc.common.po.impl; 
 
public class CustomsAcSetPo implements ICustomsAcSetPo {
 
	public enum COLUMNS {
		CUSTOMS_ID("海關編號"), //
		AC_ID("參考：管制點資料檔"), //
		USER_ID("參考：使用者資料檔") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String customsId;
	private String acId;
	private String userId;

	@Override
	public String getCustomsId() {
		return this.customsId;
	}
 
	@Override
	public void setCustomsId(final String customsId) {
		this.customsId = customsId; 
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
	public String getUserId() {
		return this.userId;
	}
 
	@Override
	public void setUserId(final String userId) {
		this.userId = userId; 
	}
 
}
