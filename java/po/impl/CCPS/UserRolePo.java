package com.doc.common.po.impl; 
 
public class UserRolePo implements IUserRolePo {
 
	public enum COLUMNS {
		USER_ID("參考：使用者資料檔"), //
		ROLE_ID("參考：角色資料檔") //
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
	private String roleId;

	@Override
	public String getUserId() {
		return this.userId;
	}
 
	@Override
	public void setUserId(final String userId) {
		this.userId = userId; 
	}
 
	@Override
	public String getRoleId() {
		return this.roleId;
	}
 
	@Override
	public void setRoleId(final String roleId) {
		this.roleId = roleId; 
	}
 
}
