package com.doc.common.po.impl; 
 
public class LogmnrpCtasPartMapPo implements ILogmnrpCtasPartMapPo {
 
	public enum COLUMNS {
		LOGMNR_UID("null"), //
		BASEOBJ#("null"), //
		BASEOBJV#("null"), //
		KEYOBJ#("null"), //
		PART#("null"), //
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
 
	private BigDecimal logmnrUid;
	private BigDecimal baseobj#;
	private BigDecimal baseobjv#;
	private BigDecimal keyobj#;
	private BigDecimal part#;
	private BigDecimal spare1;
	private BigDecimal spare2;
	private String spare3;

	@Override
	public BigDecimal getLogmnrUid() {
		return this.logmnrUid;
	}
 
	@Override
	public void setLogmnrUid(final BigDecimal logmnrUid) {
		this.logmnrUid = logmnrUid; 
	}
 
	@Override
	public BigDecimal getBaseobj#() {
		return this.baseobj#;
	}
 
	@Override
	public void setBaseobj#(final BigDecimal baseobj#) {
		this.baseobj# = baseobj#; 
	}
 
	@Override
	public BigDecimal getBaseobjv#() {
		return this.baseobjv#;
	}
 
	@Override
	public void setBaseobjv#(final BigDecimal baseobjv#) {
		this.baseobjv# = baseobjv#; 
	}
 
	@Override
	public BigDecimal getKeyobj#() {
		return this.keyobj#;
	}
 
	@Override
	public void setKeyobj#(final BigDecimal keyobj#) {
		this.keyobj# = keyobj#; 
	}
 
	@Override
	public BigDecimal getPart#() {
		return this.part#;
	}
 
	@Override
	public void setPart#(final BigDecimal part#) {
		this.part# = part#; 
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
