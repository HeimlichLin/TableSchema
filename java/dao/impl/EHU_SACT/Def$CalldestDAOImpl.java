package com.doc.common.dao.impl; 
 
public class Def$CalldestDAOImpl extends GeneralDAOImpl<Def$CalldestPo> implements IDef$CalldestDAO { 
	public static final Def$CalldestDAOImpl INSTANCE = new Def$CalldestDAOImpl(); 
	public static final String TABLENAME = "DEF$_CALLDEST"; 

	public Def$CalldestDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Def$CalldestPo> CONVERTER = new MapConverter<Def$CalldestPo>() { 
 
		@Override 
		public Def$CalldestPo convert(final DataObject dataObject) { 
			final Def$CalldestPo def$CalldestPo = new Def$CalldestPo(); 
			def$CalldestPo.setEnqTid(dataObject.getString(Def$CalldestPo.COLUMNS.ENQ_TID.name())); 
			def$CalldestPo.setStepNo(BigDecimalUtils.formObj(dataObject.getValue(Def$CalldestPo.COLUMNS.STEP_NO.name()))); 
			def$CalldestPo.setDblink(dataObject.getString(Def$CalldestPo.COLUMNS.DBLINK.name())); 
			def$CalldestPo.setDblink(dataObject.getString(Def$CalldestPo.COLUMNS.DBLINK.name())); 
			def$CalldestPo.setSchemaName(dataObject.getString(Def$CalldestPo.COLUMNS.SCHEMA_NAME.name())); 
			def$CalldestPo.setPackageName(dataObject.getString(Def$CalldestPo.COLUMNS.PACKAGE_NAME.name())); 
			def$CalldestPo.setCatchup(); 
			return def$CalldestPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Def$CalldestPo def$CalldestPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Def$CalldestPo.COLUMNS.ENQ_TID.name(), def$CalldestPo.getEnqTid()); 
			dataObject.setValue(Def$CalldestPo.COLUMNS.STEP_NO.name(), def$CalldestPo.getStepNo()); 
			dataObject.setValue(Def$CalldestPo.COLUMNS.DBLINK.name(), def$CalldestPo.getDblink()); 
			dataObject.setValue(Def$CalldestPo.COLUMNS.DBLINK.name(), def$CalldestPo.getDblink()); 
			dataObject.setValue(Def$CalldestPo.COLUMNS.SCHEMA_NAME.name(), def$CalldestPo.getSchemaName()); 
			dataObject.setValue(Def$CalldestPo.COLUMNS.PACKAGE_NAME.name(), def$CalldestPo.getPackageName()); 
			dataObject.setValue(Def$CalldestPo.COLUMNS.CATCHUP.name(), def$CalldestPo.getCatchup()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Def$CalldestPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Def$CalldestPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Def$CalldestPo.COLUMNS.ENQ_TID.name(), po.getEnqTid()); 
		sqlWhere.add(Def$CalldestPo.COLUMNS.STEP_NO.name(), po.getStepNo()); 
		sqlWhere.add(Def$CalldestPo.COLUMNS.DBLINK.name(), po.getDblink()); 
		sqlWhere.add(Def$CalldestPo.COLUMNS.DBLINK.name(), po.getDblink()); 
		sqlWhere.add(Def$CalldestPo.COLUMNS.CATCHUP.name(), po.getCatchup()); 
		return sqlWhere; 
	} 
 
} 
