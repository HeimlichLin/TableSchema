package com.doc.common.dao.impl; 
 
public class Repcat$ObjectParmsDAOImpl extends GeneralDAOImpl<Repcat$ObjectParmsPo> implements IRepcat$ObjectParmsDAO { 
	public static final Repcat$ObjectParmsDAOImpl INSTANCE = new Repcat$ObjectParmsDAOImpl(); 
	public static final String TABLENAME = "REPCAT$_OBJECT_PARMS"; 

	public Repcat$ObjectParmsDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Repcat$ObjectParmsPo> CONVERTER = new MapConverter<Repcat$ObjectParmsPo>() { 
 
		@Override 
		public Repcat$ObjectParmsPo convert(final DataObject dataObject) { 
			final Repcat$ObjectParmsPo repcat$ObjectParmsPo = new Repcat$ObjectParmsPo(); 
			repcat$ObjectParmsPo.setTemplateParameterId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$ObjectParmsPo.COLUMNS.TEMPLATE_PARAMETER_ID.name()))); 
			repcat$ObjectParmsPo.setTemplateObjectId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$ObjectParmsPo.COLUMNS.TEMPLATE_OBJECT_ID.name()))); 
			repcat$ObjectParmsPo.setTemplateObjectId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$ObjectParmsPo.COLUMNS.TEMPLATE_OBJECT_ID.name()))); 
			return repcat$ObjectParmsPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Repcat$ObjectParmsPo repcat$ObjectParmsPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Repcat$ObjectParmsPo.COLUMNS.TEMPLATE_PARAMETER_ID.name(), repcat$ObjectParmsPo.getTemplateParameterId()); 
			dataObject.setValue(Repcat$ObjectParmsPo.COLUMNS.TEMPLATE_OBJECT_ID.name(), repcat$ObjectParmsPo.getTemplateObjectId()); 
			dataObject.setValue(Repcat$ObjectParmsPo.COLUMNS.TEMPLATE_OBJECT_ID.name(), repcat$ObjectParmsPo.getTemplateObjectId()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Repcat$ObjectParmsPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Repcat$ObjectParmsPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Repcat$ObjectParmsPo.COLUMNS.TEMPLATE_PARAMETER_ID.name(), po.getTemplateParameterId()); 
		sqlWhere.add(Repcat$ObjectParmsPo.COLUMNS.TEMPLATE_OBJECT_ID.name(), po.getTemplateObjectId()); 
		sqlWhere.add(Repcat$ObjectParmsPo.COLUMNS.TEMPLATE_OBJECT_ID.name(), po.getTemplateObjectId()); 
		return sqlWhere; 
	} 
 
} 
