package com.doc.common.po.impl; 
 
public class UserinfPo implements IUserinfPo {
 
	public enum COLUMNS {
		USER_ID("使用者帳號"), //
		USER_PW("使用者密碼"), //
		AUTH_ID("權限群組ID"), //
		USER_NAME("使用者名稱"), //
		USER_OFFICE("關區"), //
		STATUS("使用狀態"), //
		ACTIVE_DATE("啟用日期"), //
		END_DATE("截止日期"), //
		DEPARTMENT("公司、部門名稱"), //
		TEL("電話號碼"), //
		LAST_LOGIN("最後登入時間"), //
		CTM_CODE("客戶代碼") //
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
	private String userPw;
	private String authId;
	private String userName;
	private String userOffice;
	private String status;
	private String activeDate;
	private String endDate;
	private String department;
	private String tel;
	private String lastLogin;
	private String ctmCode;

	@Override
	public String getUserId() {
		return this.userId;
	}
 
	@Override
	public void setUserId(final String userId) {
		this.userId = userId; 
	}
 
	@Override
	public String getUserPw() {
		return this.userPw;
	}
 
	@Override
	public void setUserPw(final String userPw) {
		this.userPw = userPw; 
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
	public String getUserName() {
		return this.userName;
	}
 
	@Override
	public void setUserName(final String userName) {
		this.userName = userName; 
	}
 
	@Override
	public String getUserOffice() {
		return this.userOffice;
	}
 
	@Override
	public void setUserOffice(final String userOffice) {
		this.userOffice = userOffice; 
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
	public String getActiveDate() {
		return this.activeDate;
	}
 
	@Override
	public void setActiveDate(final String activeDate) {
		this.activeDate = activeDate; 
	}
 
	@Override
	public String getEndDate() {
		return this.endDate;
	}
 
	@Override
	public void setEndDate(final String endDate) {
		this.endDate = endDate; 
	}
 
	@Override
	public String getDepartment() {
		return this.department;
	}
 
	@Override
	public void setDepartment(final String department) {
		this.department = department; 
	}
 
	@Override
	public String getTel() {
		return this.tel;
	}
 
	@Override
	public void setTel(final String tel) {
		this.tel = tel; 
	}
 
	@Override
	public String getLastLogin() {
		return this.lastLogin;
	}
 
	@Override
	public void setLastLogin(final String lastLogin) {
		this.lastLogin = lastLogin; 
	}
 
	@Override
	public String getCtmCode() {
		return this.ctmCode;
	}
 
	@Override
	public void setCtmCode(final String ctmCode) {
		this.ctmCode = ctmCode; 
	}
 
}
