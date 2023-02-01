package com.doc.common.dao.impl; 
 
public class Repcat$TemplateObjectsDAOImpl extends GeneralDAOImpl<Repcat$TemplateObjectsPo> implements IRepcat$TemplateObjectsDAO { 
	public static final Repcat$TemplateObjectsDAOImpl INSTANCE = new Repcat$TemplateObjectsDAOImpl(); 
	public static final String TABLENAME = "REPCAT$_TEMPLATE_OBJECTS"; 

	public Repcat$TemplateObjectsDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Repcat$TemplateObjectsPo> CONVERTER = new MapConverter<Repcat$TemplateObjectsPo>() { 
 
		@Override 
		public Repcat$TemplateObjectsPo convert(final DataObject dataObject) { 
			final Repcat$TemplateObjectsPo repcat$TemplateObjectsPo = new Repcat$TemplateObjectsPo(); 
			repcat$TemplateObjectsPo.setTemplateObjectId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$TemplateObjectsPo.COLUMNS.TEMPLATE_OBJECT_ID.name()))); 
			repcat$TemplateObjectsPo.setRefreshTemplateId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$TemplateObjectsPo.COLUMNS.REFRESH_TEMPLATE_ID.name()))); 
			repcat$TemplateObjectsPo.setRefreshTemplateId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$TemplateObjectsPo.COLUMNS.REFRESH_TEMPLATE_ID.name()))); 
			repcat$TemplateObjectsPo.setObjectName(dataObject.getString(Repcat$TemplateObjectsPo.COLUMNS.OBJECT_NAME.name())); 
			repcat$TemplateObjectsPo.setObjectType(BigDecimalUtils.formObj(dataObject.getValue(Repcat$TemplateObjectsPo.COLUMNS.OBJECT_TYPE.name()))); 
			repcat$TemplateObjectsPo.setObjectType(BigDecimalUtils.formObj(dataObject.getValue(Repcat$TemplateObjectsPo.COLUMNS.OBJECT_TYPE.name()))); 
			repcat$TemplateObjectsPo.setObjectVersion#(BigDecimalUtils.formObj(dataObject.getValue(Repcat$TemplateObjectsPo.COLUMNS.OBJECT_VERSION#.name()))); 
			repcat$TemplateObjectsPo.setDdlText(); 
			repcat$TemplateObjectsPo.setMasterRollbackSeg(dataObject.getString(Repcat$TemplateObjectsPo.COLUMNS.MASTER_ROLLBACK_SEG.name())); 
			repcat$TemplateObjectsPo.setDerivedFromSname(dataObject.getString(Repcat$TemplateObjectsPo.COLUMNS.DERIVED_FROM_SNAME.name())); 
			repcat$TemplateObjectsPo.setDerivedFromOname(dataObject.getString(Repcat$TemplateObjectsPo.COLUMNS.DERIVED_FROM_ONAME.name())); 
			repcat$TemplateObjectsPo.setFlavorId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$TemplateObjectsPo.COLUMNS.FLAVOR_ID.name()))); 
			repcat$TemplateObjectsPo.setSchemaName(dataObject.getString(Repcat$TemplateObjectsPo.COLUMNS.SCHEMA_NAME.name())); 
			repcat$TemplateObjectsPo.setDdlNum(BigDecimalUtils.formObj(dataObject.getValue(Repcat$TemplateObjectsPo.COLUMNS.DDL_NUM.name()))); 
			repcat$TemplateObjectsPo.setTemplateRefgroupId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$TemplateObjectsPo.COLUMNS.TEMPLATE_REFGROUP_ID.name()))); 
			repcat$TemplateObjectsPo.setFlags(); 
			repcat$TemplateObjectsPo.setSpare1(dataObject.getString(Repcat$TemplateObjectsPo.COLUMNS.SPARE1.name())); 
			return repcat$TemplateObjectsPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Repcat$TemplateObjectsPo repcat$TemplateObjectsPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Repcat$TemplateObjectsPo.COLUMNS.TEMPLATE_OBJECT_ID.name(), repcat$TemplateObjectsPo.getTemplateObjectId()); 
			dataObject.setValue(Repcat$TemplateObjectsPo.COLUMNS.REFRESH_TEMPLATE_ID.name(), repcat$TemplateObjectsPo.getRefreshTemplateId()); 
			dataObject.setValue(Repcat$TemplateObjectsPo.COLUMNS.REFRESH_TEMPLATE_ID.name(), repcat$TemplateObjectsPo.getRefreshTemplateId()); 
			dataObject.setValue(Repcat$TemplateObjectsPo.COLUMNS.OBJECT_NAME.name(), repcat$TemplateObjectsPo.getObjectName()); 
			dataObject.setValue(Repcat$TemplateObjectsPo.COLUMNS.OBJECT_TYPE.name(), repcat$TemplateObjectsPo.getObjectType()); 
			dataObject.setValue(Repcat$TemplateObjectsPo.COLUMNS.OBJECT_TYPE.name(), repcat$TemplateObjectsPo.getObjectType()); 
			dataObject.setValue(Repcat$TemplateObjectsPo.COLUMNS.OBJECT_VERSION#.name(), repcat$TemplateObjectsPo.getObjectVersion#()); 
			dataObject.setValue(Repcat$TemplateObjectsPo.COLUMNS.DDL_TEXT.name(), repcat$TemplateObjectsPo.getDdlText()); 
			dataObject.setValue(Repcat$TemplateObjectsPo.COLUMNS.MASTER_ROLLBACK_SEG.name(), repcat$TemplateObjectsPo.getMasterRollbackSeg()); 
			dataObject.setValue(Repcat$TemplateObjectsPo.COLUMNS.DERIVED_FROM_SNAME.name(), repcat$TemplateObjectsPo.getDerivedFromSname()); 
			dataObject.setValue(Repcat$TemplateObjectsPo.COLUMNS.DERIVED_FROM_ONAME.name(), repcat$TemplateObjectsPo.getDerivedFromOname()); 
			dataObject.setValue(Repcat$TemplateObjectsPo.COLUMNS.FLAVOR_ID.name(), repcat$TemplateObjectsPo.getFlavorId()); 
			dataObject.setValue(Repcat$TemplateObjectsPo.COLUMNS.SCHEMA_NAME.name(), repcat$TemplateObjectsPo.getSchemaName()); 
			dataObject.setValue(Repcat$TemplateObjectsPo.COLUMNS.DDL_NUM.name(), repcat$TemplateObjectsPo.getDdlNum()); 
			dataObject.setValue(Repcat$TemplateObjectsPo.COLUMNS.TEMPLATE_REFGROUP_ID.name(), repcat$TemplateObjectsPo.getTemplateRefgroupId()); 
			dataObject.setValue(Repcat$TemplateObjectsPo.COLUMNS.FLAGS.name(), repcat$TemplateObjectsPo.getFlags()); 
			dataObject.setValue(Repcat$TemplateObjectsPo.COLUMNS.SPARE1.name(), repcat$TemplateObjectsPo.getSpare1()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Repcat$TemplateObjectsPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Repcat$TemplateObjectsPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Repcat$TemplateObjectsPo.COLUMNS.TEMPLATE_OBJECT_ID.name(), po.getTemplateObjectId()); 
		sqlWhere.add(Repcat$TemplateObjectsPo.COLUMNS.REFRESH_TEMPLATE_ID.name(), po.getRefreshTemplateId()); 
		sqlWhere.add(Repcat$TemplateObjectsPo.COLUMNS.REFRESH_TEMPLATE_ID.name(), po.getRefreshTemplateId()); 
		sqlWhere.add(Repcat$TemplateObjectsPo.COLUMNS.OBJECT_NAME.name(), po.getObjectName()); 
		sqlWhere.add(Repcat$TemplateObjectsPo.COLUMNS.OBJECT_TYPE.name(), po.getObjectType()); 
		sqlWhere.add(Repcat$TemplateObjectsPo.COLUMNS.OBJECT_TYPE.name(), po.getObjectType()); 
		sqlWhere.add(Repcat$TemplateObjectsPo.COLUMNS.SCHEMA_NAME.name(), po.getSchemaName()); 
		sqlWhere.add(Repcat$TemplateObjectsPo.COLUMNS.DDL_NUM.name(), po.getDdlNum()); 
		return sqlWhere; 
	} 
 
} 
