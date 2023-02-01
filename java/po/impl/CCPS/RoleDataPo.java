package com.doc.common.po.impl; 
 
public class RoleDataPo implements IRoleDataPo {
 
	public enum COLUMNS {
		ROLE_SER_NO("角色序號"), //
		ROLE_ID("角色編號"), //
		ROLE_NAME("角色名稱"), //
		ROLE_COMMENT("角色備註") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal roleSerNo;
	private String roleId;
	private String roleName;
	private String roleComment;

	@Override
	public BigDecimal getRoleSerNo() {
		return this.roleSerNo;
	}
 
	@Override
	public void setRoleSerNo(final BigDecimal roleSerNo) {
		this.roleSerNo = roleSerNo; 
	}
 
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
