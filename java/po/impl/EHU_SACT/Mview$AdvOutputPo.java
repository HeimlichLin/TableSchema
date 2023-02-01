package com.doc.common.po.impl; 
 
public class Mview$AdvOutputPo implements IMview$AdvOutputPo {
 
	public enum COLUMNS {
		RUNID#("null"), //
		OUTPUT_TYPE("null"), //
		RANK#("null"), //
		ACTION_TYPE("null"), //
		SUMMARY_OWNER("null"), //
		SUMMARY_NAME("null"), //
		GROUP_BY_COLUMNS("null"), //
		WHERE_CLAUSE("null"), //
		FROM_CLAUSE("null"), //
		MEASURES_LIST("null"), //
		FACT_TABLES("null"), //
		GROUPING_LEVELS("null"), //
		QUERYLEN("null"), //
		QUERY_TEXT("null"), //
		STORAGE_IN_BYTES("null"), //
		PCT_PERFORMANCE_GAIN("null"), //
		FREQUENCY("null"), //
		CUMULATIVE_BENEFIT("null"), //
		BENEFIT_TO_COST_RATIO("null"), //
		VALIDATED("null") //
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
	private BigDecimal outputType;
	private BigDecimal rank#;
	private String actionType;
	private String summaryOwner;
	private String summaryName;
	private String groupByColumns;
	private String whereClause;
	private String fromClause;
	private String measuresList;
	private String factTables;
	private String groupingLevels;
	private BigDecimal querylen;
	private String queryText;
	private BigDecimal storageInBytes;
	private BigDecimal pctPerformanceGain;
	private BigDecimal frequency;
	private BigDecimal cumulativeBenefit;
	private BigDecimal benefitToCostRatio;
	private BigDecimal validated;

	@Override
	public BigDecimal getRunid#() {
		return this.runid#;
	}
 
	@Override
	public void setRunid#(final BigDecimal runid#) {
		this.runid# = runid#; 
	}
 
	@Override
	public BigDecimal getOutputType() {
		return this.outputType;
	}
 
	@Override
	public void setOutputType(final BigDecimal outputType) {
		this.outputType = outputType; 
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
	public String getActionType() {
		return this.actionType;
	}
 
	@Override
	public void setActionType(final String actionType) {
		this.actionType = actionType; 
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
	public String getSummaryName() {
		return this.summaryName;
	}
 
	@Override
	public void setSummaryName(final String summaryName) {
		this.summaryName = summaryName; 
	}
 
	@Override
	public String getGroupByColumns() {
		return this.groupByColumns;
	}
 
	@Override
	public void setGroupByColumns(final String groupByColumns) {
		this.groupByColumns = groupByColumns; 
	}
 
	@Override
	public String getWhereClause() {
		return this.whereClause;
	}
 
	@Override
	public void setWhereClause(final String whereClause) {
		this.whereClause = whereClause; 
	}
 
	@Override
	public String getFromClause() {
		return this.fromClause;
	}
 
	@Override
	public void setFromClause(final String fromClause) {
		this.fromClause = fromClause; 
	}
 
	@Override
	public String getMeasuresList() {
		return this.measuresList;
	}
 
	@Override
	public void setMeasuresList(final String measuresList) {
		this.measuresList = measuresList; 
	}
 
	@Override
	public String getFactTables() {
		return this.factTables;
	}
 
	@Override
	public void setFactTables(final String factTables) {
		this.factTables = factTables; 
	}
 
	@Override
	public String getGroupingLevels() {
		return this.groupingLevels;
	}
 
	@Override
	public void setGroupingLevels(final String groupingLevels) {
		this.groupingLevels = groupingLevels; 
	}
 
	@Override
	public BigDecimal getQuerylen() {
		return this.querylen;
	}
 
	@Override
	public void setQuerylen(final BigDecimal querylen) {
		this.querylen = querylen; 
	}
 
	@Override
	public String getQueryText() {
		return this.queryText;
	}
 
	@Override
	public void setQueryText(final String queryText) {
		this.queryText = queryText; 
	}
 
	@Override
	public BigDecimal getStorageInBytes() {
		return this.storageInBytes;
	}
 
	@Override
	public void setStorageInBytes(final BigDecimal storageInBytes) {
		this.storageInBytes = storageInBytes; 
	}
 
	@Override
	public BigDecimal getPctPerformanceGain() {
		return this.pctPerformanceGain;
	}
 
	@Override
	public void setPctPerformanceGain(final BigDecimal pctPerformanceGain) {
		this.pctPerformanceGain = pctPerformanceGain; 
	}
 
	@Override
	public BigDecimal getFrequency() {
		return this.frequency;
	}
 
	@Override
	public void setFrequency(final BigDecimal frequency) {
		this.frequency = frequency; 
	}
 
	@Override
	public BigDecimal getCumulativeBenefit() {
		return this.cumulativeBenefit;
	}
 
	@Override
	public void setCumulativeBenefit(final BigDecimal cumulativeBenefit) {
		this.cumulativeBenefit = cumulativeBenefit; 
	}
 
	@Override
	public BigDecimal getBenefitToCostRatio() {
		return this.benefitToCostRatio;
	}
 
	@Override
	public void setBenefitToCostRatio(final BigDecimal benefitToCostRatio) {
		this.benefitToCostRatio = benefitToCostRatio; 
	}
 
	@Override
	public BigDecimal getValidated() {
		return this.validated;
	}
 
	@Override
	public void setValidated(final BigDecimal validated) {
		this.validated = validated; 
	}
 
}
