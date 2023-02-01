package com.doc.common.po.impl; 
 
public class TUserRolesPo implements ITUserRolesPo {
 
	public enum COLUMNS {
		T_USER_ID("null"), //
		ROLES_ID("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal tUserId;
	private BigDecimal rolesId;

	@Override
	public BigDecimal getTUserId() {
		return this.tUserId;
	}
 
	@Override
	public void setTUserId(final BigDecimal tUserId) {
		this.tUserId = tUserId; 
	}
 
	@Override
	public BigDecimal getRolesId() {
		return this.rolesId;
	}
 
	@Override
	public void setRolesId(final BigDecimal rolesId) {
		this.rolesId = rolesId; 
	}
 
}
