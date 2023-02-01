package com.doc.common.po.impl; 
 
public class RoleDataPo implements IRoleDataPo {
 
	public enum COLUMNS {
		ROLE_ID("R0000：系統管理員
R0001：駐站關員
R0002：貨棧"), //
		ROLE_NAME("R0000：系統管理員
R0001：駐站關員
R0002：貨棧"), //
		ROLE_COMMENT("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String roleId;
	private String roleName;
	private String roleComment;

	@Override
	public String getRoleId() {
		return this.roleId;
	}
 
	@Override
	public void setRoleId(final String roleId) {
		this.roleId = roleId; 
	}
 
	@Override
	public String getRoleName() {
		return this.roleName;
	}
 
	@Override
	public void setRoleName(final String roleName) {
		this.roleName = roleName; 
	}
 
	@Override
	public String getRoleComment() {
		return this.roleComment;
	}
 
	@Override
	public void setRoleComment(final String roleComment) {
		this.roleComment = roleComment; 
	}
 
}
