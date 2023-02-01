package com.doc.common.dao.impl; 
 
public class Repcat$RepcatDAOImpl extends GeneralDAOImpl<Repcat$RepcatPo> implements IRepcat$RepcatDAO { 
	public static final Repcat$RepcatDAOImpl INSTANCE = new Repcat$RepcatDAOImpl(); 
	public static final String TABLENAME = "REPCAT$_REPCAT"; 

	public Repcat$RepcatDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Repcat$RepcatPo> CONVERTER = new MapConverter<Repcat$RepcatPo>() { 
 
		@Override 
		public Repcat$RepcatPo convert(final DataObject dataObject) { 
			final Repcat$RepcatPo repcat$RepcatPo = new Repcat$RepcatPo(); 
			repcat$RepcatPo.setGowner(dataObject.getString(Repcat$RepcatPo.COLUMNS.GOWNER.name())); 
			repcat$RepcatPo.setSname(dataObject.getString(Repcat$RepcatPo.COLUMNS.SNAME.name())); 
			repcat$RepcatPo.setMaster(dataObject.getString(Repcat$RepcatPo.COLUMNS.MASTER.name())); 
			repcat$RepcatPo.setStatus(BigDecimalUtils.formObj(dataObject.getValue(Repcat$RepcatPo.COLUMNS.STATUS.name()))); 
			repcat$RepcatPo.setSchemaComment(dataObject.getString(Repcat$RepcatPo.COLUMNS.SCHEMA_COMMENT.name())); 
			repcat$RepcatPo.setFlavorId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$RepcatPo.COLUMNS.FLAVOR_ID.name()))); 
			repcat$RepcatPo.setFlag(); 
			return repcat$RepcatPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Repcat$RepcatPo repcat$RepcatPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Repcat$RepcatPo.COLUMNS.GOWNER.name(), repcat$RepcatPo.getGowner()); 
			dataObject.setValue(Repcat$RepcatPo.COLUMNS.SNAME.name(), repcat$RepcatPo.getSname()); 
			dataObject.setValue(Repcat$RepcatPo.COLUMNS.MASTER.name(), repcat$RepcatPo.getMaster()); 
			dataObject.setValue(Repcat$RepcatPo.COLUMNS.STATUS.name(), repcat$RepcatPo.getStatus()); 
			dataObject.setValue(Repcat$RepcatPo.COLUMNS.SCHEMA_COMMENT.name(), repcat$RepcatPo.getSchemaComment()); 
			dataObject.setValue(Repcat$RepcatPo.COLUMNS.FLAVOR_ID.name(), repcat$RepcatPo.getFlavorId()); 
			dataObject.setValue(Repcat$RepcatPo.COLUMNS.FLAG.name(), repcat$RepcatPo.getFlag()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Repcat$RepcatPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Repcat$RepcatPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Repcat$RepcatPo.COLUMNS.GOWNER.name(), po.getGowner()); 
		sqlWhere.add(Repcat$RepcatPo.COLUMNS.SNAME.name(), po.getSname()); 
		return sqlWhere; 
	} 
 
} 
