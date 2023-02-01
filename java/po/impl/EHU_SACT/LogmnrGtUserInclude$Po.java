package com.doc.common.po.impl; 
 
public class LogmnrGtUserInclude$Po implements ILogmnrGtUserInclude$Po {
 
	public enum COLUMNS {
		USER_NAME("null"), //
		USER_TYPE("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String userName;
	private BigDecimal userType;

	@Override
	public String getUserName() {
		return this.userName;
	}
 
	@Override
	public void setUserName(final String userName) {
		this.userName = userName; 
	}
 
	@Override
	public BigDecimal getUserType() {
		return this.userType;
	}
 
	@Override
	public void setUserType(final BigDecimal userType) {
		this.userType = userType; 
	}
 
}
