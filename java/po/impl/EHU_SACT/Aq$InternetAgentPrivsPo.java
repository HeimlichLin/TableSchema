package com.doc.common.po.impl; 
 
public class Aq$InternetAgentPrivsPo implements IAq$InternetAgentPrivsPo {
 
	public enum COLUMNS {
		AGENT_NAME("null"), //
		DB_USERNAME("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String agentName;
	private String dbUsername;

	@Override
	public String getAgentName() {
		return this.agentName;
	}
 
	@Override
	public void setAgentName(final String agentName) {
		this.agentName = agentName; 
	}
 
	@Override
	public String getDbUsername() {
		return this.dbUsername;
	}
 
	@Override
	public void setDbUsername(final String dbUsername) {
		this.dbUsername = dbUsername; 
	}
 
}
