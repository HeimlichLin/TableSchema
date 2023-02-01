package com.doc.common.po.impl; 
 
public class SystemNotifyInfoPo implements ISystemNotifyInfoPo {
 
	public enum COLUMNS {
		AUTH_ID("認證帳號"), //
		SYS_CODE("系統代號"), //
		FOOD_REG_NUM("食品登記字號"), //
		NOTIFY_TYPE("通知類型"), //
		NOTIFY_INFO("通知資訊") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String authId;
	private String sysCode;
	private String foodRegNum;
	private String notifyType;
	private String notifyInfo;

	@Override
	public String getAuthId() {
		return this.authId;
	}
 
	@Override
	public void setAuthId(final String authId) {
		this.authId = authId; 
	}
 
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
	public String getNotifyType() {
		return this.notifyType;
	}
 
	@Override
	public void setNotifyType(final String notifyType) {
		this.notifyType = notifyType; 
	}
 
	@Override
	public String getNotifyInfo() {
		return this.notifyInfo;
	}
 
	@Override
	public void setNotifyInfo(final String notifyInfo) {
		this.notifyInfo = notifyInfo; 
	}
 
}
