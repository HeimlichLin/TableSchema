package com.doc.common.po.impl; 
 
public class AcDevInfoPo implements IAcDevInfoPo {
 
	public enum COLUMNS {
		AC_ID("參考：管制點資料檔"), //
		WH_CODE("參考：管制點資料檔"), //
		DEV_TOKEN("裝置令牌") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String acId;
	private String whCode;
	private String devToken;

	@Override
	public String getAcId() {
		return this.acId;
	}
 
	@Override
	public void setAcId(final String acId) {
		this.acId = acId; 
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
	public String getDevToken() {
		return this.devToken;
	}
 
	@Override
	public void setDevToken(final String devToken) {
		this.devToken = devToken; 
	}
 
}
