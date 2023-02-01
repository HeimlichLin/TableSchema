package com.doc.common.dao.impl; 
 
public class Repcat$RepschemaDAOImpl extends GeneralDAOImpl<Repcat$RepschemaPo> implements IRepcat$RepschemaDAO { 
	public static final Repcat$RepschemaDAOImpl INSTANCE = new Repcat$RepschemaDAOImpl(); 
	public static final String TABLENAME = "REPCAT$_REPSCHEMA"; 

	public Repcat$RepschemaDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Repcat$RepschemaPo> CONVERTER = new MapConverter<Repcat$RepschemaPo>() { 
 
		@Override 
		public Repcat$RepschemaPo convert(final DataObject dataObject) { 
			final Repcat$RepschemaPo repcat$RepschemaPo = new Repcat$RepschemaPo(); 
			repcat$RepschemaPo.setGowner(dataObject.getString(Repcat$RepschemaPo.COLUMNS.GOWNER.name())); 
			repcat$RepschemaPo.setGowner(dataObject.getString(Repcat$RepschemaPo.COLUMNS.GOWNER.name())); 
			repcat$RepschemaPo.setSname(dataObject.getString(Repcat$RepschemaPo.COLUMNS.SNAME.name())); 
			repcat$RepschemaPo.setDblink(dataObject.getString(Repcat$RepschemaPo.COLUMNS.DBLINK.name())); 
			repcat$RepschemaPo.setDblink(dataObject.getString(Repcat$RepschemaPo.COLUMNS.DBLINK.name())); 
			repcat$RepschemaPo.setMasterdef(dataObject.getString(Repcat$RepschemaPo.COLUMNS.MASTERDEF.name())); 
			repcat$RepschemaPo.setSnapmaster(dataObject.getString(Repcat$RepschemaPo.COLUMNS.SNAPMASTER.name())); 
			repcat$RepschemaPo.setMasterComment(dataObject.getString(Repcat$RepschemaPo.COLUMNS.MASTER_COMMENT.name())); 
			repcat$RepschemaPo.setMaster(dataObject.getString(Repcat$RepschemaPo.COLUMNS.MASTER.name())); 
			repcat$RepschemaPo.setPropUpdates(BigDecimalUtils.formObj(dataObject.getValue(Repcat$RepschemaPo.COLUMNS.PROP_UPDATES.name()))); 
			repcat$RepschemaPo.setMyDblink(dataObject.getString(Repcat$RepschemaPo.COLUMNS.MY_DBLINK.name())); 
			repcat$RepschemaPo.setExtensionId(); 
			return repcat$RepschemaPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Repcat$RepschemaPo repcat$RepschemaPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Repcat$RepschemaPo.COLUMNS.GOWNER.name(), repcat$RepschemaPo.getGowner()); 
			dataObject.setValue(Repcat$RepschemaPo.COLUMNS.GOWNER.name(), repcat$RepschemaPo.getGowner()); 
			dataObject.setValue(Repcat$RepschemaPo.COLUMNS.SNAME.name(), repcat$RepschemaPo.getSname()); 
			dataObject.setValue(Repcat$RepschemaPo.COLUMNS.DBLINK.name(), repcat$RepschemaPo.getDblink()); 
			dataObject.setValue(Repcat$RepschemaPo.COLUMNS.DBLINK.name(), repcat$RepschemaPo.getDblink()); 
			dataObject.setValue(Repcat$RepschemaPo.COLUMNS.MASTERDEF.name(), repcat$RepschemaPo.getMasterdef()); 
			dataObject.setValue(Repcat$RepschemaPo.COLUMNS.SNAPMASTER.name(), repcat$RepschemaPo.getSnapmaster()); 
			dataObject.setValue(Repcat$RepschemaPo.COLUMNS.MASTER_COMMENT.name(), repcat$RepschemaPo.getMasterComment()); 
			dataObject.setValue(Repcat$RepschemaPo.COLUMNS.MASTER.name(), repcat$RepschemaPo.getMaster()); 
			dataObject.setValue(Repcat$RepschemaPo.COLUMNS.PROP_UPDATES.name(), repcat$RepschemaPo.getPropUpdates()); 
			dataObject.setValue(Repcat$RepschemaPo.COLUMNS.MY_DBLINK.name(), repcat$RepschemaPo.getMyDblink()); 
			dataObject.setValue(Repcat$RepschemaPo.COLUMNS.EXTENSION_ID.name(), repcat$RepschemaPo.getExtensionId()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Repcat$RepschemaPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Repcat$RepschemaPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Repcat$RepschemaPo.COLUMNS.GOWNER.name(), po.getGowner()); 
		sqlWhere.add(Repcat$RepschemaPo.COLUMNS.GOWNER.name(), po.getGowner()); 
		sqlWhere.add(Repcat$RepschemaPo.COLUMNS.SNAME.name(), po.getSname()); 
		sqlWhere.add(Repcat$RepschemaPo.COLUMNS.DBLINK.name(), po.getDblink()); 
		sqlWhere.add(Repcat$RepschemaPo.COLUMNS.DBLINK.name(), po.getDblink()); 
		sqlWhere.add(Repcat$RepschemaPo.COLUMNS.EXTENSION_ID.name(), po.getExtensionId()); 
		return sqlWhere; 
	} 
 
} 
