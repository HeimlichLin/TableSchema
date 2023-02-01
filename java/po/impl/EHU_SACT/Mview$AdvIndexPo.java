package com.doc.common.po.impl; 
 
public class Mview$AdvIndexPo implements IMview$AdvIndexPo {
 
	public enum COLUMNS {
		RUNID#("null"), //
		RANK#("null"), //
		MVINDEX#("null"), //
		INDEX_TYPE("null"), //
		INDEX_NAME("null"), //
		COLUMN_NAME("null"), //
		INDEX_CONTENT("null"), //
		SUMMARY_OWNER("null") //
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
	private BigDecimal mvindex#;
	private BigDecimal indexType;
	private String indexName;
	private String columnName;
	private String indexContent;
	private String summaryOwner;

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
	public BigDecimal getMvindex#() {
		return this.mvindex#;
	}
 
	@Override
	public void setMvindex#(final BigDecimal mvindex#) {
		this.mvindex# = mvindex#; 
	}
 
	@Override
	public BigDecimal getIndexType() {
		return this.indexType;
	}
 
	@Override
	public void setIndexType(final BigDecimal indexType) {
		this.indexType = indexType; 
	}
 
	@Override
	public String getIndexName() {
		return this.indexName;
	}
 
	@Override
	public void setIndexName(final String indexName) {
		this.indexName = indexName; 
	}
 
	@Override
	public String getColumnName() {
		return this.columnName;
	}
 
	@Override
	public void setColumnName(final String columnName) {
		this.columnName = columnName; 
	}
 
	@Override
	public String getIndexContent() {
		return this.indexContent;
	}
 
	@Override
	public void setIndexContent(final String indexContent) {
		this.indexContent = indexContent; 
	}
 
	@Override
	public String getSummaryOwner() {
		return this.summaryOwner;
	}
 
	@Override
	public void setSummaryOwner(final String summaryOwner) {
		this.summaryOwner = summaryOwner; 
	}
 
}
