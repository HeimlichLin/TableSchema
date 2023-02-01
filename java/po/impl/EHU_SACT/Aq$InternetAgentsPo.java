package com.doc.common.po.impl; 
 
public class Aq$InternetAgentsPo implements IAq$InternetAgentsPo {
 
	public enum COLUMNS {
		AGENT_NAME("null"), //
		PROTOCOL("null"), //
		SPARE1("null") //
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
	private BigDecimal protocol;
	private String spare1;

	@Override
	public String getAgentName() {
		return this.agentName;
	}
 
	@Override
	public void setAgentName(final String agentName) {
		this.agentName = agentName; 
	}
 
	@Override
	public BigDecimal getProtocol() {
		return this.protocol;
	}
 
	@Override
	public void setProtocol(final BigDecimal protocol) {
		this.protocol = protocol; 
	}
 
	@Override
	public String getSpare1() {
		return this.spare1;
	}
 
	@Override
	public void setSpare1(final String spare1) {
		this.spare1 = spare1; 
	}
 
}
