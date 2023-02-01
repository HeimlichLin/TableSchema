package com.doc.common.po.impl; 
 
public class Mview$AdvPrettyPo implements IMview$AdvPrettyPo {
 
	public enum COLUMNS {
		QUERYID#("null"), //
		SQL_TEXT("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal queryid#;
	private String sqlText;

	@Override
	public BigDecimal getQueryid#() {
		return this.queryid#;
	}
 
	@Override
	public void setQueryid#(final BigDecimal queryid#) {
		this.queryid# = queryid#; 
	}
 
	@Override
	public String getSqlText() {
		return this.sqlText;
	}
 
	@Override
	public void setSqlText(final String sqlText) {
		this.sqlText = sqlText; 
	}
 
}
