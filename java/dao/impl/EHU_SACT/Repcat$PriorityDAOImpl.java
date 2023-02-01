package com.doc.common.dao.impl; 
 
public class Repcat$PriorityDAOImpl extends GeneralDAOImpl<Repcat$PriorityPo> implements IRepcat$PriorityDAO { 
	public static final Repcat$PriorityDAOImpl INSTANCE = new Repcat$PriorityDAOImpl(); 
	public static final String TABLENAME = "REPCAT$_PRIORITY"; 

	public Repcat$PriorityDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Repcat$PriorityPo> CONVERTER = new MapConverter<Repcat$PriorityPo>() { 
 
		@Override 
		public Repcat$PriorityPo convert(final DataObject dataObject) { 
			final Repcat$PriorityPo repcat$PriorityPo = new Repcat$PriorityPo(); 
			repcat$PriorityPo.setSname(dataObject.getString(Repcat$PriorityPo.COLUMNS.SNAME.name())); 
			repcat$PriorityPo.setSname(dataObject.getString(Repcat$PriorityPo.COLUMNS.SNAME.name())); 
			repcat$PriorityPo.setPriorityGroup(dataObject.getString(Repcat$PriorityPo.COLUMNS.PRIORITY_GROUP.name())); 
			repcat$PriorityPo.setPriorityGroup(dataObject.getString(Repcat$PriorityPo.COLUMNS.PRIORITY_GROUP.name())); 
			repcat$PriorityPo.setPriority(BigDecimalUtils.formObj(dataObject.getValue(Repcat$PriorityPo.COLUMNS.PRIORITY.name()))); 
			repcat$PriorityPo.setRawValue(); 
			repcat$PriorityPo.setCharValue(dataObject.getString(Repcat$PriorityPo.COLUMNS.CHAR_VALUE.name())); 
			repcat$PriorityPo.setNumberValue(BigDecimalUtils.formObj(dataObject.getValue(Repcat$PriorityPo.COLUMNS.NUMBER_VALUE.name()))); 
			repcat$PriorityPo.setDateValue(TimestampUtils.of(dataObject.getValue(Repcat$PriorityPo.COLUMNS.DATE_VALUE.name()))); 
			repcat$PriorityPo.setVarchar2Value(dataObject.getString(Repcat$PriorityPo.COLUMNS.VARCHAR2_VALUE.name())); 
			repcat$PriorityPo.setNcharValue(); 
			repcat$PriorityPo.setNvarchar2Value(); 
			repcat$PriorityPo.setLargeCharValue(dataObject.getString(Repcat$PriorityPo.COLUMNS.LARGE_CHAR_VALUE.name())); 
			return repcat$PriorityPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Repcat$PriorityPo repcat$PriorityPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Repcat$PriorityPo.COLUMNS.SNAME.name(), repcat$PriorityPo.getSname()); 
			dataObject.setValue(Repcat$PriorityPo.COLUMNS.SNAME.name(), repcat$PriorityPo.getSname()); 
			dataObject.setValue(Repcat$PriorityPo.COLUMNS.PRIORITY_GROUP.name(), repcat$PriorityPo.getPriorityGroup()); 
			dataObject.setValue(Repcat$PriorityPo.COLUMNS.PRIORITY_GROUP.name(), repcat$PriorityPo.getPriorityGroup()); 
			dataObject.setValue(Repcat$PriorityPo.COLUMNS.PRIORITY.name(), repcat$PriorityPo.getPriority()); 
			dataObject.setValue(Repcat$PriorityPo.COLUMNS.RAW_VALUE.name(), repcat$PriorityPo.getRawValue()); 
			dataObject.setValue(Repcat$PriorityPo.COLUMNS.CHAR_VALUE.name(), repcat$PriorityPo.getCharValue()); 
			dataObject.setValue(Repcat$PriorityPo.COLUMNS.NUMBER_VALUE.name(), repcat$PriorityPo.getNumberValue()); 
			dataObject.setValue(Repcat$PriorityPo.COLUMNS.DATE_VALUE.name(), repcat$PriorityPo.getDateValue()); 
			dataObject.setValue(Repcat$PriorityPo.COLUMNS.VARCHAR2_VALUE.name(), repcat$PriorityPo.getVarchar2Value()); 
			dataObject.setValue(Repcat$PriorityPo.COLUMNS.NCHAR_VALUE.name(), repcat$PriorityPo.getNcharValue()); 
			dataObject.setValue(Repcat$PriorityPo.COLUMNS.NVARCHAR2_VALUE.name(), repcat$PriorityPo.getNvarchar2Value()); 
			dataObject.setValue(Repcat$PriorityPo.COLUMNS.LARGE_CHAR_VALUE.name(), repcat$PriorityPo.getLargeCharValue()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Repcat$PriorityPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Repcat$PriorityPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Repcat$PriorityPo.COLUMNS.SNAME.name(), po.getSname()); 
		sqlWhere.add(Repcat$PriorityPo.COLUMNS.SNAME.name(), po.getSname()); 
		sqlWhere.add(Repcat$PriorityPo.COLUMNS.PRIORITY_GROUP.name(), po.getPriorityGroup()); 
		sqlWhere.add(Repcat$PriorityPo.COLUMNS.PRIORITY_GROUP.name(), po.getPriorityGroup()); 
		sqlWhere.add(Repcat$PriorityPo.COLUMNS.PRIORITY.name(), po.getPriority()); 
		return sqlWhere; 
	} 
 
} 
