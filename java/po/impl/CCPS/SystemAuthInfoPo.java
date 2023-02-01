package com.doc.common.po.impl; 
 
public class SystemAuthInfoPo implements ISystemAuthInfoPo {
 
	public enum COLUMNS {
		AUTH_ID("認證帳號"), //
		AUTH_PASS("認證密碼"), //
		STATUS("狀態"), //
		AUTH_MODULE("授權模組"), //
		SYS_CODE("系統代號") //
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
	private String authPass;
	private String status;
	private String authModule;
	private String sysCode;

	@Override
	public String getAuthId() {
		return this.authId;
	}
 
	@Override
	public void setAuthId(final String authId) {
		this.authId = authId; 
	}
 
	@Override
	public String getAuthPass() {
		return this.authPass;
	}
 
	@Override
	public void setAuthPass(final String authPass) {
		this.authPass = authPass; 
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
	public String getAuthModule() {
		return this.authModule;
	}
 
	@Override
	public void setAuthModule(final String authModule) {
		this.authModule = authModule; 
	}
 
	@Override
	public String getSysCode() {
		return this.sysCode;
	}
 
	@Override
	public void setSysCode(final String sysCode) {
		this.sysCode = sysCode; 
	}
 
}
