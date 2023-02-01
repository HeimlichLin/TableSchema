package com.doc.common.dao.impl; 
 
public class Repcat$SiteObjectsDAOImpl extends GeneralDAOImpl<Repcat$SiteObjectsPo> implements IRepcat$SiteObjectsDAO { 
	public static final Repcat$SiteObjectsDAOImpl INSTANCE = new Repcat$SiteObjectsDAOImpl(); 
	public static final String TABLENAME = "REPCAT$_SITE_OBJECTS"; 

	public Repcat$SiteObjectsDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Repcat$SiteObjectsPo> CONVERTER = new MapConverter<Repcat$SiteObjectsPo>() { 
 
		@Override 
		public Repcat$SiteObjectsPo convert(final DataObject dataObject) { 
			final Repcat$SiteObjectsPo repcat$SiteObjectsPo = new Repcat$SiteObjectsPo(); 
			repcat$SiteObjectsPo.setTemplateSiteId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$SiteObjectsPo.COLUMNS.TEMPLATE_SITE_ID.name()))); 
			repcat$SiteObjectsPo.setSname(dataObject.getString(Repcat$SiteObjectsPo.COLUMNS.SNAME.name())); 
			repcat$SiteObjectsPo.setOname(dataObject.getString(Repcat$SiteObjectsPo.COLUMNS.ONAME.name())); 
			repcat$SiteObjectsPo.setObjectTypeId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$SiteObjectsPo.COLUMNS.OBJECT_TYPE_ID.name()))); 
			repcat$SiteObjectsPo.setObjectTypeId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$SiteObjectsPo.COLUMNS.OBJECT_TYPE_ID.name()))); 
			return repcat$SiteObjectsPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Repcat$SiteObjectsPo repcat$SiteObjectsPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Repcat$SiteObjectsPo.COLUMNS.TEMPLATE_SITE_ID.name(), repcat$SiteObjectsPo.getTemplateSiteId()); 
			dataObject.setValue(Repcat$SiteObjectsPo.COLUMNS.SNAME.name(), repcat$SiteObjectsPo.getSname()); 
			dataObject.setValue(Repcat$SiteObjectsPo.COLUMNS.ONAME.name(), repcat$SiteObjectsPo.getOname()); 
			dataObject.setValue(Repcat$SiteObjectsPo.COLUMNS.OBJECT_TYPE_ID.name(), repcat$SiteObjectsPo.getObjectTypeId()); 
			dataObject.setValue(Repcat$SiteObjectsPo.COLUMNS.OBJECT_TYPE_ID.name(), repcat$SiteObjectsPo.getObjectTypeId()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Repcat$SiteObjectsPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Repcat$SiteObjectsPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Repcat$SiteObjectsPo.COLUMNS.TEMPLATE_SITE_ID.name(), po.getTemplateSiteId()); 
		sqlWhere.add(Repcat$SiteObjectsPo.COLUMNS.SNAME.name(), po.getSname()); 
		sqlWhere.add(Repcat$SiteObjectsPo.COLUMNS.ONAME.name(), po.getOname()); 
		sqlWhere.add(Repcat$SiteObjectsPo.COLUMNS.OBJECT_TYPE_ID.name(), po.getObjectTypeId()); 
		sqlWhere.add(Repcat$SiteObjectsPo.COLUMNS.OBJECT_TYPE_ID.name(), po.getObjectTypeId()); 
		return sqlWhere; 
	} 
 
} 
