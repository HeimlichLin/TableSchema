package com.doc.common.po.impl; 
 
public class Mview$AdvPartitionPo implements IMview$AdvPartitionPo {
 
	public enum COLUMNS {
		RUNID#("null"), //
		RANK#("null"), //
		SUMMARY_OWNER("null"), //
		QUERY_TEXT("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal runid#;
	private BigDecimal rank#;
	private String summaryOwner;
	private String queryText;

	@Override
	public BigDecimal getRunid#() {
		return this.runid#;
	}
 
	@Override
	public void setRunid#(final BigDecimal runid#) {
		this.runid# = runid#; 
	}
 
	@Override
	public BigDecimal getRank#() {
		return this.rank#;
	}
 
	@Override
	public void setRank#(final BigDecimal rank#) {
		this.rank# = rank#; 
	}
 
	@Override
	public String getSummaryOwner() {
		return this.summaryOwner;
	}
 
	@Override
	public void setSummaryOwner(final String summaryOwner) {
		this.summaryOwner = summaryOwner; 
	}
 
	@Override
	public String getQueryText() {
		return this.queryText;
	}
 
	@Override
	public void setQueryText(final String queryText) {
		this.queryText = queryText; 
	}
 
}
