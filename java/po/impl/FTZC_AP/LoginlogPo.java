package com.doc.common.po.impl; 
 
public class LoginlogPo implements ILoginlogPo {
 
	public enum COLUMNS {
		USER_ID("使用者ID"), //
		CLENT_IP("使用者登入IP"), //
		SERVER_IP("伺服器IP"), //
		SESSION_ID("null"), //
		STATUS("登入狀態：0 (OK)、11(NOT_EXISTS)、12(ACCOUNT_EXPIRED)、13(ACCOUNT_LOCKED)、14(ACCOUNT_DENIED)、21(INVALID_PASSWORD)、22(PASSWORD_EXPIRED)、31(IP_DENIED)、99(ERROR)"), //
		LOGIN_TIME("登入時間") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String userId;
	private String clentIp;
	private String serverIp;
	private String sessionId;
	private String status;
	private String loginTime;

	@Override
	public String getUserId() {
		return this.userId;
	}
 
	@Override
	public void setUserId(final String userId) {
		this.userId = userId; 
	}
 
	@Override
	public String getClentIp() {
		return this.clentIp;
	}
 
	@Override
	public void setClentIp(final String clentIp) {
		this.clentIp = clentIp; 
	}
 
	@Override
	public String getServerIp() {
		return this.serverIp;
	}
 
	@Override
	public void setServerIp(final String serverIp) {
		this.serverIp = serverIp; 
	}
 
	@Override
	public String getSessionId() {
		return this.sessionId;
	}
 
	@Override
	public void setSessionId(final String sessionId) {
		this.sessionId = sessionId; 
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
	public String getLoginTime() {
		return this.loginTime;
	}
 
	@Override
	public void setLoginTime(final String loginTime) {
		this.loginTime = loginTime; 
	}
 
}
