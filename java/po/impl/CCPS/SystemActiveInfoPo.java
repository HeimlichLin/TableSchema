package com.doc.common.po.impl; 
 
public class SystemActiveInfoPo implements ISystemActiveInfoPo {
 
	public enum COLUMNS {
		SYS_CODE("系統代號"), //
		FOOD_REG_NUM("食品登記字號"), //
		PROD_ACT_CODE("產品啟動碼"), //
		STATUS("狀態"), //
		API_KEY("API_KEY"), //
		SECURITY_KEY("SECURITY_KEY"), //
		INSERTDAY("建檔日期"), //
		IS_AUTH("是否有授權書"), //
		AUTH_ID("認證帳號"), //
		BAN("統一編號") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String sysCode;
	private String foodRegNum;
	private String prodActCode;
	private String status;
	private String apiKey;
	private String securityKey;
	private java.sql.Timestamp insertday;
	private String isAuth;
	private String authId;
	private String ban;

	@Override
	public String getSysCode() {
		return this.sysCode;
	}
 
	@Override
	public void setSysCode(final String sysCode) {
		this.sysCode = sysCode; 
	}
 
	@Override
	public String getFoodRegNum() {
		return this.foodRegNum;
	}
 
	@Override
	public void setFoodRegNum(final String foodRegNum) {
		this.foodRegNum = foodRegNum; 
	}
 
	@Override
	public String getProdActCode() {
		return this.prodActCode;
	}
 
	@Override
	public void setProdActCode(final String prodActCode) {
		this.prodActCode = prodActCode; 
	}
 
	@Override
	public String getStatus() {
		return this.status;
	}
 
	@Override
	public void setStatus(final String status) {
		this.status = status; 
	}
 
	@Override
	public String getApiKey() {
		return this.apiKey;
	}
 
	@Override
	public void setApiKey(final String apiKey) {
		this.apiKey = apiKey; 
	}
 
	@Override
	public String getSecurityKey() {
		return this.securityKey;
	}
 
	@Override
	public void setSecurityKey(final String securityKey) {
		this.securityKey = securityKey; 
	}
 
	@Override
	public java.sql.Timestamp getInsertday() {
		return this.insertday;
	}
 
	@Override
	public void setInsertday(final java.sql.Timestamp insertday) {
		this.insertday = insertday; 
	}
 
	@Override
	public String getIsAuth() {
		return this.isAuth;
	}
 
	@Override
	public void setIsAuth(final String isAuth) {
		this.isAuth = isAuth; 
	}
 
	@Override
	public String getAuthId() {
		return this.authId;
	}
 
	@Override
	public void setAuthId(final String authId) {
		this.authId = authId; 
	}
 
	@Override
	public String getBan() {
		return this.ban;
	}
 
	@Override
	public void setBan(final String ban) {
		this.ban = ban; 
	}
 
}
