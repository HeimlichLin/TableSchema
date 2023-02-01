package com.doc.common.po.impl; 
 
public class Logstdby$plsqlPo implements ILogstdby$plsqlPo {
 
	public enum COLUMNS {
		SESSION_ID("null"), //
		START_FINISH("null"), //
		CALL_TEXT("null"), //
		SPARE1("null"), //
		SPARE2("null"), //
		SPARE3("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal sessionId;
	private BigDecimal startFinish;
	private String callText;
	private BigDecimal spare1;
	private BigDecimal spare2;
	private String spare3;

	@Override
	public BigDecimal getSessionId() {
		return this.sessionId;
	}
 
	@Override
	public void setSessionId(final BigDecimal sessionId) {
		this.sessionId = sessionId; 
	}
 
	@Override
	public BigDecimal getStartFinish() {
		return this.startFinish;
	}
 
	@Override
	public void setStartFinish(final BigDecimal startFinish) {
		this.startFinish = startFinish; 
	}
 
	@Override
	public String getCallText() {
		return this.callText;
	}
 
	@Override
	public void setCallText(final String callText) {
		this.callText = callText; 
	}
 
	@Override
	public BigDecimal getSpare1() {
		return this.spare1;
	}
 
	@Override
	public void setSpare1(final BigDecimal spare1) {
		this.spare1 = spare1; 
	}
 
	@Override
	public BigDecimal getSpare2() {
		return this.spare2;
	}
 
	@Override
	public void setSpare2(final BigDecimal spare2) {
		this.spare2 = spare2; 
	}
 
	@Override
	public String getSpare3() {
		return this.spare3;
	}
 
	@Override
	public void setSpare3(final String spare3) {
		this.spare3 = spare3; 
	}
 
}
