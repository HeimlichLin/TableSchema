package com.doc.common.dao.impl; 
 
public class Mview$AdvExceptionsDAOImpl extends GeneralDAOImpl<Mview$AdvExceptionsPo> implements IMview$AdvExceptionsDAO { 
	public static final Mview$AdvExceptionsDAOImpl INSTANCE = new Mview$AdvExceptionsDAOImpl(); 
	public static final String TABLENAME = "MVIEW$_ADV_EXCEPTIONS"; 

	public Mview$AdvExceptionsDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Mview$AdvExceptionsPo> CONVERTER = new MapConverter<Mview$AdvExceptionsPo>() { 
 
		@Override 
		public Mview$AdvExceptionsPo convert(final DataObject dataObject) { 
			final Mview$AdvExceptionsPo mview$AdvExceptionsPo = new Mview$AdvExceptionsPo(); 
			mview$AdvExceptionsPo.setRunid#(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvExceptionsPo.COLUMNS.RUNID#.name()))); 
			mview$AdvExceptionsPo.setOwner(dataObject.getString(Mview$AdvExceptionsPo.COLUMNS.OWNER.name())); 
			mview$AdvExceptionsPo.setTableName(dataObject.getString(Mview$AdvExceptionsPo.COLUMNS.TABLE_NAME.name())); 
			mview$AdvExceptionsPo.setDimensionName(dataObject.getString(Mview$AdvExceptionsPo.COLUMNS.DIMENSION_NAME.name())); 
			mview$AdvExceptionsPo.setRelationship(dataObject.getString(Mview$AdvExceptionsPo.COLUMNS.RELATIONSHIP.name())); 
			mview$AdvExceptionsPo.setBadRowid(); 
			return mview$AdvExceptionsPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Mview$AdvExceptionsPo mview$AdvExceptionsPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Mview$AdvExceptionsPo.COLUMNS.RUNID#.name(), mview$AdvExceptionsPo.getRunid#()); 
			dataObject.setValue(Mview$AdvExceptionsPo.COLUMNS.OWNER.name(), mview$AdvExceptionsPo.getOwner()); 
			dataObject.setValue(Mview$AdvExceptionsPo.COLUMNS.TABLE_NAME.name(), mview$AdvExceptionsPo.getTableName()); 
			dataObject.setValue(Mview$AdvExceptionsPo.COLUMNS.DIMENSION_NAME.name(), mview$AdvExceptionsPo.getDimensionName()); 
			dataObject.setValue(Mview$AdvExceptionsPo.COLUMNS.RELATIONSHIP.name(), mview$AdvExceptionsPo.getRelationship()); 
			dataObject.setValue(Mview$AdvExceptionsPo.COLUMNS.BAD_ROWID.name(), mview$AdvExceptionsPo.getBadRowid()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Mview$AdvExceptionsPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Mview$AdvExceptionsPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Mview$AdvExceptionsPo.COLUMNS.RUNID#.name(), po.getRunid#()); 
		return sqlWhere; 
	} 
 
} 
