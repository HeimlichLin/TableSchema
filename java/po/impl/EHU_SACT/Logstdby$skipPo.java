package com.doc.common.po.impl; 
 
public class Logstdby$skipPo implements ILogstdby$skipPo {
 
	public enum COLUMNS {
		ERROR("null"), //
		STATEMENT_OPT("null"), //
		SCHEMA("null"), //
		NAME("null"), //
		USE_LIKE("null"), //
		ESC("null"), //
		PROC("null"), //
		ACTIVE("null"), //
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
 
	private BigDecimal error;
	private String statementOpt;
	private String schema;
	private String name;
	private BigDecimal useLike;
	private String esc;
	private String proc;
	private BigDecimal active;
	private BigDecimal spare1;
	private BigDecimal spare2;
	private String spare3;

	@Override
	public BigDecimal getError() {
		return this.error;
	}
 
	@Override
	public void setError(final BigDecimal error) {
		this.error = error; 
	}
 
	@Override
	public String getStatementOpt() {
		return this.statementOpt;
	}
 
	@Override
	public void setStatementOpt(final String statementOpt) {
		this.statementOpt = statementOpt; 
	}
 
	@Override
	public String getSchema() {
		return this.schema;
	}
 
	@Override
	public void setSchema(final String schema) {
		this.schema = schema; 
	}
 
	@Override
	public String getName() {
		return this.name;
	}
 
	@Override
	public void setName(final String name) {
		this.name = name; 
	}
 
	@Override
	public BigDecimal getUseLike() {
		return this.useLike;
	}
 
	@Override
	public void setUseLike(final BigDecimal useLike) {
		this.useLike = useLike; 
	}
 
	@Override
	public String getEsc() {
		return this.esc;
	}
 
	@Override
	public void setEsc(final String esc) {
		this.esc = esc; 
	}
 
	@Override
	public String getProc() {
		return this.proc;
	}
 
	@Override
	public void setProc(final String proc) {
		this.proc = proc; 
	}
 
	@Override
	public BigDecimal getActive() {
		return this.active;
	}
 
	@Override
	public void setActive(final BigDecimal active) {
		this.active = active; 
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
