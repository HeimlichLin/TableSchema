package com.doc.common.dao.impl; 
 
public class Mview$AdvOutputDAOImpl extends GeneralDAOImpl<Mview$AdvOutputPo> implements IMview$AdvOutputDAO { 
	public static final Mview$AdvOutputDAOImpl INSTANCE = new Mview$AdvOutputDAOImpl(); 
	public static final String TABLENAME = "MVIEW$_ADV_OUTPUT"; 

	public Mview$AdvOutputDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Mview$AdvOutputPo> CONVERTER = new MapConverter<Mview$AdvOutputPo>() { 
 
		@Override 
		public Mview$AdvOutputPo convert(final DataObject dataObject) { 
			final Mview$AdvOutputPo mview$AdvOutputPo = new Mview$AdvOutputPo(); 
			mview$AdvOutputPo.setRunid#(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvOutputPo.COLUMNS.RUNID#.name()))); 
			mview$AdvOutputPo.setOutputType(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvOutputPo.COLUMNS.OUTPUT_TYPE.name()))); 
			mview$AdvOutputPo.setRank#(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvOutputPo.COLUMNS.RANK#.name()))); 
			mview$AdvOutputPo.setActionType(dataObject.getString(Mview$AdvOutputPo.COLUMNS.ACTION_TYPE.name())); 
			mview$AdvOutputPo.setSummaryOwner(dataObject.getString(Mview$AdvOutputPo.COLUMNS.SUMMARY_OWNER.name())); 
			mview$AdvOutputPo.setSummaryName(dataObject.getString(Mview$AdvOutputPo.COLUMNS.SUMMARY_NAME.name())); 
			mview$AdvOutputPo.setGroupByColumns(dataObject.getString(Mview$AdvOutputPo.COLUMNS.GROUP_BY_COLUMNS.name())); 
			mview$AdvOutputPo.setWhereClause(dataObject.getString(Mview$AdvOutputPo.COLUMNS.WHERE_CLAUSE.name())); 
			mview$AdvOutputPo.setFromClause(dataObject.getString(Mview$AdvOutputPo.COLUMNS.FROM_CLAUSE.name())); 
			mview$AdvOutputPo.setMeasuresList(dataObject.getString(Mview$AdvOutputPo.COLUMNS.MEASURES_LIST.name())); 
			mview$AdvOutputPo.setFactTables(dataObject.getString(Mview$AdvOutputPo.COLUMNS.FACT_TABLES.name())); 
			mview$AdvOutputPo.setGroupingLevels(dataObject.getString(Mview$AdvOutputPo.COLUMNS.GROUPING_LEVELS.name())); 
			mview$AdvOutputPo.setQuerylen(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvOutputPo.COLUMNS.QUERYLEN.name()))); 
			mview$AdvOutputPo.setQueryText(); 
			mview$AdvOutputPo.setStorageInBytes(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvOutputPo.COLUMNS.STORAGE_IN_BYTES.name()))); 
			mview$AdvOutputPo.setPctPerformanceGain(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvOutputPo.COLUMNS.PCT_PERFORMANCE_GAIN.name()))); 
			mview$AdvOutputPo.setFrequency(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvOutputPo.COLUMNS.FREQUENCY.name()))); 
			mview$AdvOutputPo.setCumulativeBenefit(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvOutputPo.COLUMNS.CUMULATIVE_BENEFIT.name()))); 
			mview$AdvOutputPo.setBenefitToCostRatio(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvOutputPo.COLUMNS.BENEFIT_TO_COST_RATIO.name()))); 
			mview$AdvOutputPo.setValidated(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvOutputPo.COLUMNS.VALIDATED.name()))); 
			return mview$AdvOutputPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Mview$AdvOutputPo mview$AdvOutputPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Mview$AdvOutputPo.COLUMNS.RUNID#.name(), mview$AdvOutputPo.getRunid#()); 
			dataObject.setValue(Mview$AdvOutputPo.COLUMNS.OUTPUT_TYPE.name(), mview$AdvOutputPo.getOutputType()); 
			dataObject.setValue(Mview$AdvOutputPo.COLUMNS.RANK#.name(), mview$AdvOutputPo.getRank#()); 
			dataObject.setValue(Mview$AdvOutputPo.COLUMNS.ACTION_TYPE.name(), mview$AdvOutputPo.getActionType()); 
			dataObject.setValue(Mview$AdvOutputPo.COLUMNS.SUMMARY_OWNER.name(), mview$AdvOutputPo.getSummaryOwner()); 
			dataObject.setValue(Mview$AdvOutputPo.COLUMNS.SUMMARY_NAME.name(), mview$AdvOutputPo.getSummaryName()); 
			dataObject.setValue(Mview$AdvOutputPo.COLUMNS.GROUP_BY_COLUMNS.name(), mview$AdvOutputPo.getGroupByColumns()); 
			dataObject.setValue(Mview$AdvOutputPo.COLUMNS.WHERE_CLAUSE.name(), mview$AdvOutputPo.getWhereClause()); 
			dataObject.setValue(Mview$AdvOutputPo.COLUMNS.FROM_CLAUSE.name(), mview$AdvOutputPo.getFromClause()); 
			dataObject.setValue(Mview$AdvOutputPo.COLUMNS.MEASURES_LIST.name(), mview$AdvOutputPo.getMeasuresList()); 
			dataObject.setValue(Mview$AdvOutputPo.COLUMNS.FACT_TABLES.name(), mview$AdvOutputPo.getFactTables()); 
			dataObject.setValue(Mview$AdvOutputPo.COLUMNS.GROUPING_LEVELS.name(), mview$AdvOutputPo.getGroupingLevels()); 
			dataObject.setValue(Mview$AdvOutputPo.COLUMNS.QUERYLEN.name(), mview$AdvOutputPo.getQuerylen()); 
			dataObject.setValue(Mview$AdvOutputPo.COLUMNS.QUERY_TEXT.name(), mview$AdvOutputPo.getQueryText()); 
			dataObject.setValue(Mview$AdvOutputPo.COLUMNS.STORAGE_IN_BYTES.name(), mview$AdvOutputPo.getStorageInBytes()); 
			dataObject.setValue(Mview$AdvOutputPo.COLUMNS.PCT_PERFORMANCE_GAIN.name(), mview$AdvOutputPo.getPctPerformanceGain()); 
			dataObject.setValue(Mview$AdvOutputPo.COLUMNS.FREQUENCY.name(), mview$AdvOutputPo.getFrequency()); 
			dataObject.setValue(Mview$AdvOutputPo.COLUMNS.CUMULATIVE_BENEFIT.name(), mview$AdvOutputPo.getCumulativeBenefit()); 
			dataObject.setValue(Mview$AdvOutputPo.COLUMNS.BENEFIT_TO_COST_RATIO.name(), mview$AdvOutputPo.getBenefitToCostRatio()); 
			dataObject.setValue(Mview$AdvOutputPo.COLUMNS.VALIDATED.name(), mview$AdvOutputPo.getValidated()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Mview$AdvOutputPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Mview$AdvOutputPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Mview$AdvOutputPo.COLUMNS.RUNID#.name(), po.getRunid#()); 
		sqlWhere.add(Mview$AdvOutputPo.COLUMNS.RANK#.name(), po.getRank#()); 
		return sqlWhere; 
	} 
 
} 
