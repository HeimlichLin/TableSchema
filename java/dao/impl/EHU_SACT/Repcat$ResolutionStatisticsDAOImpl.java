package com.doc.common.dao.impl; 
 
public class Repcat$ResolutionStatisticsDAOImpl extends GeneralDAOImpl<Repcat$ResolutionStatisticsPo> implements IRepcat$ResolutionStatisticsDAO { 
	public static final Repcat$ResolutionStatisticsDAOImpl INSTANCE = new Repcat$ResolutionStatisticsDAOImpl(); 
	public static final String TABLENAME = "REPCAT$_RESOLUTION_STATISTICS"; 

	public Repcat$ResolutionStatisticsDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Repcat$ResolutionStatisticsPo> CONVERTER = new MapConverter<Repcat$ResolutionStatisticsPo>() { 
 
		@Override 
		public Repcat$ResolutionStatisticsPo convert(final DataObject dataObject) { 
			final Repcat$ResolutionStatisticsPo repcat$ResolutionStatisticsPo = new Repcat$ResolutionStatisticsPo(); 
			repcat$ResolutionStatisticsPo.setSname(dataObject.getString(Repcat$ResolutionStatisticsPo.COLUMNS.SNAME.name())); 
			repcat$ResolutionStatisticsPo.setOname(dataObject.getString(Repcat$ResolutionStatisticsPo.COLUMNS.ONAME.name())); 
			repcat$ResolutionStatisticsPo.setConflictTypeId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$ResolutionStatisticsPo.COLUMNS.CONFLICT_TYPE_ID.name()))); 
			repcat$ResolutionStatisticsPo.setReferenceName(dataObject.getString(Repcat$ResolutionStatisticsPo.COLUMNS.REFERENCE_NAME.name())); 
			repcat$ResolutionStatisticsPo.setMethodName(dataObject.getString(Repcat$ResolutionStatisticsPo.COLUMNS.METHOD_NAME.name())); 
			repcat$ResolutionStatisticsPo.setFunctionName(dataObject.getString(Repcat$ResolutionStatisticsPo.COLUMNS.FUNCTION_NAME.name())); 
			repcat$ResolutionStatisticsPo.setPriorityGroup(dataObject.getString(Repcat$ResolutionStatisticsPo.COLUMNS.PRIORITY_GROUP.name())); 
			repcat$ResolutionStatisticsPo.setResolvedDate(TimestampUtils.of(dataObject.getValue(Repcat$ResolutionStatisticsPo.COLUMNS.RESOLVED_DATE.name()))); 
			repcat$ResolutionStatisticsPo.setPrimaryKeyValue(dataObject.getString(Repcat$ResolutionStatisticsPo.COLUMNS.PRIMARY_KEY_VALUE.name())); 
			return repcat$ResolutionStatisticsPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Repcat$ResolutionStatisticsPo repcat$ResolutionStatisticsPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Repcat$ResolutionStatisticsPo.COLUMNS.SNAME.name(), repcat$ResolutionStatisticsPo.getSname()); 
			dataObject.setValue(Repcat$ResolutionStatisticsPo.COLUMNS.ONAME.name(), repcat$ResolutionStatisticsPo.getOname()); 
			dataObject.setValue(Repcat$ResolutionStatisticsPo.COLUMNS.CONFLICT_TYPE_ID.name(), repcat$ResolutionStatisticsPo.getConflictTypeId()); 
			dataObject.setValue(Repcat$ResolutionStatisticsPo.COLUMNS.REFERENCE_NAME.name(), repcat$ResolutionStatisticsPo.getReferenceName()); 
			dataObject.setValue(Repcat$ResolutionStatisticsPo.COLUMNS.METHOD_NAME.name(), repcat$ResolutionStatisticsPo.getMethodName()); 
			dataObject.setValue(Repcat$ResolutionStatisticsPo.COLUMNS.FUNCTION_NAME.name(), repcat$ResolutionStatisticsPo.getFunctionName()); 
			dataObject.setValue(Repcat$ResolutionStatisticsPo.COLUMNS.PRIORITY_GROUP.name(), repcat$ResolutionStatisticsPo.getPriorityGroup()); 
			dataObject.setValue(Repcat$ResolutionStatisticsPo.COLUMNS.RESOLVED_DATE.name(), repcat$ResolutionStatisticsPo.getResolvedDate()); 
			dataObject.setValue(Repcat$ResolutionStatisticsPo.COLUMNS.PRIMARY_KEY_VALUE.name(), repcat$ResolutionStatisticsPo.getPrimaryKeyValue()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Repcat$ResolutionStatisticsPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Repcat$ResolutionStatisticsPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
