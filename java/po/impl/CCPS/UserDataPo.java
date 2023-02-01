package com.doc.common.po.impl; 
 
public class UserDataPo implements IUserDataPo {
 
	public enum COLUMNS {
		USER_SER_NO("使用者序號"), //
		USER_ID("使用者帳號"), //
		USER_PASS("使用者密碼"), //
		USER_NAME("使用者名稱") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal userSerNo;
	private String userId;
	private String userPass;
	private String userName;

	@Override
	public BigDecimal getUserSerNo() {
		return this.userSerNo;
	}
 
	@Override
	public void setUserSerNo(final BigDecimal userSerNo) {
		this.userSerNo = userSerNo; 
	}
 
	@Override
	public String getUserId() {
		return this.userId;
	}
 
	@Override
	public void setUserId(final String userId) {
		this.userId = userId; 
	}
 
	@Override
	public String getUserPass() {
		return this.userPass;
	}
 
	@Override
	public void setUserPass(final String userPass) {
		this.userPass = userPass; 
	}
 
	@Override
	public String getUserName() {
		return this.userName;
	}
 
	@Override
	public void setUserName(final String userName) {
		this.userName = userName; 
	}
 
}
