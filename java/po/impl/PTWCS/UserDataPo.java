package com.doc.common.po.impl; 
 
public class UserDataPo implements IUserDataPo {
 
	public enum COLUMNS {
		USER_ID("使用者帳號"), //
		USER_PASS("使用者密碼"), //
		USER_NAME("使用者名稱"), //
		USER_COMMENT("如為有對應角色R0002：貨棧，需設定貨棧代號：
CA：華儲
CG：榮儲
CW：遠雄") //
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
	private String userPass;
	private String userName;
	private String userComment;

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
 
	@Override
	public String getUserComment() {
		return this.userComment;
	}
 
	@Override
	public void setUserComment(final String userComment) {
		this.userComment = userComment; 
	}
 
}
