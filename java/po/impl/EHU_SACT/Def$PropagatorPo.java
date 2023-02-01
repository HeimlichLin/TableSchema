package com.doc.common.po.impl; 
 
public class Def$PropagatorPo implements IDef$PropagatorPo {
 
	public enum COLUMNS {
		USERID("User ID of the propagator"), //
		USERNAME("User name of the propagator"), //
		CREATED("The time when the propagator is registered") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal userid;
	private String username;
	private java.sql.Timestamp created;

	@Override
	public BigDecimal getUserid() {
		return this.userid;
	}
 
	@Override
	public void setUserid(final BigDecimal userid) {
		this.userid = userid; 
	}
 
	@Override
	public String getUsername() {
		return this.username;
	}
 
	@Override
	public void setUsername(final String username) {
		this.username = username; 
	}
 
	@Override
	public java.sql.Timestamp getCreated() {
		return this.created;
	}
 
	@Override
	public void setCreated(final java.sql.Timestamp created) {
		this.created = created; 
	}
 
}
