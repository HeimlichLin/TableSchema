package com.doc.common.dao.impl; 
 
public class Repcat$SitesNewDAOImpl extends GeneralDAOImpl<Repcat$SitesNewPo> implements IRepcat$SitesNewDAO { 
	public static final Repcat$SitesNewDAOImpl INSTANCE = new Repcat$SitesNewDAOImpl(); 
	public static final String TABLENAME = "REPCAT$_SITES_NEW"; 

	public Repcat$SitesNewDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Repcat$SitesNewPo> CONVERTER = new MapConverter<Repcat$SitesNewPo>() { 
 
		@Override 
		public Repcat$SitesNewPo convert(final DataObject dataObject) { 
			final Repcat$SitesNewPo repcat$SitesNewPo = new Repcat$SitesNewPo(); 
			repcat$SitesNewPo.setExtensionId(); 
			repcat$SitesNewPo.setGowner(dataObject.getString(Repcat$SitesNewPo.COLUMNS.GOWNER.name())); 
			repcat$SitesNewPo.setGname(dataObject.getString(Repcat$SitesNewPo.COLUMNS.GNAME.name())); 
			repcat$SitesNewPo.setGname(dataObject.getString(Repcat$SitesNewPo.COLUMNS.GNAME.name())); 
			repcat$SitesNewPo.setDblink(dataObject.getString(Repcat$SitesNewPo.COLUMNS.DBLINK.name())); 
			repcat$SitesNewPo.setFullInstantiation(dataObject.getString(Repcat$SitesNewPo.COLUMNS.FULL_INSTANTIATION.name())); 
			repcat$SitesNewPo.setMasterStatus(BigDecimalUtils.formObj(dataObject.getValue(Repcat$SitesNewPo.COLUMNS.MASTER_STATUS.name()))); 
			return repcat$SitesNewPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Repcat$SitesNewPo repcat$SitesNewPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Repcat$SitesNewPo.COLUMNS.EXTENSION_ID.name(), repcat$SitesNewPo.getExtensionId()); 
			dataObject.setValue(Repcat$SitesNewPo.COLUMNS.GOWNER.name(), repcat$SitesNewPo.getGowner()); 
			dataObject.setValue(Repcat$SitesNewPo.COLUMNS.GNAME.name(), repcat$SitesNewPo.getGname()); 
			dataObject.setValue(Repcat$SitesNewPo.COLUMNS.GNAME.name(), repcat$SitesNewPo.getGname()); 
			dataObject.setValue(Repcat$SitesNewPo.COLUMNS.DBLINK.name(), repcat$SitesNewPo.getDblink()); 
			dataObject.setValue(Repcat$SitesNewPo.COLUMNS.FULL_INSTANTIATION.name(), repcat$SitesNewPo.getFullInstantiation()); 
			dataObject.setValue(Repcat$SitesNewPo.COLUMNS.MASTER_STATUS.name(), repcat$SitesNewPo.getMasterStatus()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Repcat$SitesNewPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Repcat$SitesNewPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Repcat$SitesNewPo.COLUMNS.EXTENSION_ID.name(), po.getExtensionId()); 
		sqlWhere.add(Repcat$SitesNewPo.COLUMNS.GOWNER.name(), po.getGowner()); 
		sqlWhere.add(Repcat$SitesNewPo.COLUMNS.GNAME.name(), po.getGname()); 
		sqlWhere.add(Repcat$SitesNewPo.COLUMNS.GNAME.name(), po.getGname()); 
		sqlWhere.add(Repcat$SitesNewPo.COLUMNS.DBLINK.name(), po.getDblink()); 
		return sqlWhere; 
	} 
 
} 
