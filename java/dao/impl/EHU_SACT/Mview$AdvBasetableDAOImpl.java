package com.doc.common.dao.impl; 
 
public class Mview$AdvBasetableDAOImpl extends GeneralDAOImpl<Mview$AdvBasetablePo> implements IMview$AdvBasetableDAO { 
	public static final Mview$AdvBasetableDAOImpl INSTANCE = new Mview$AdvBasetableDAOImpl(); 
	public static final String TABLENAME = "MVIEW$_ADV_BASETABLE"; 

	public Mview$AdvBasetableDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Mview$AdvBasetablePo> CONVERTER = new MapConverter<Mview$AdvBasetablePo>() { 
 
		@Override 
		public Mview$AdvBasetablePo convert(final DataObject dataObject) { 
			final Mview$AdvBasetablePo mview$AdvBasetablePo = new Mview$AdvBasetablePo(); 
			mview$AdvBasetablePo.setCollectionid#(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvBasetablePo.COLUMNS.COLLECTIONID#.name()))); 
			mview$AdvBasetablePo.setQueryid#(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvBasetablePo.COLUMNS.QUERYID#.name()))); 
			mview$AdvBasetablePo.setOwner(dataObject.getString(Mview$AdvBasetablePo.COLUMNS.OWNER.name())); 
			mview$AdvBasetablePo.setTableName(dataObject.getString(Mview$AdvBasetablePo.COLUMNS.TABLE_NAME.name())); 
			mview$AdvBasetablePo.setTableType(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvBasetablePo.COLUMNS.TABLE_TYPE.name()))); 
			return mview$AdvBasetablePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Mview$AdvBasetablePo mview$AdvBasetablePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Mview$AdvBasetablePo.COLUMNS.COLLECTIONID#.name(), mview$AdvBasetablePo.getCollectionid#()); 
			dataObject.setValue(Mview$AdvBasetablePo.COLUMNS.QUERYID#.name(), mview$AdvBasetablePo.getQueryid#()); 
			dataObject.setValue(Mview$AdvBasetablePo.COLUMNS.OWNER.name(), mview$AdvBasetablePo.getOwner()); 
			dataObject.setValue(Mview$AdvBasetablePo.COLUMNS.TABLE_NAME.name(), mview$AdvBasetablePo.getTableName()); 
			dataObject.setValue(Mview$AdvBasetablePo.COLUMNS.TABLE_TYPE.name(), mview$AdvBasetablePo.getTableType()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Mview$AdvBasetablePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Mview$AdvBasetablePo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Mview$AdvBasetablePo.COLUMNS.QUERYID#.name(), po.getQueryid#()); 
		return sqlWhere; 
	} 
 
} 
