package com.doc.common.dao.impl; 
 
public class Repcat$UserParmValuesDAOImpl extends GeneralDAOImpl<Repcat$UserParmValuesPo> implements IRepcat$UserParmValuesDAO { 
	public static final Repcat$UserParmValuesDAOImpl INSTANCE = new Repcat$UserParmValuesDAOImpl(); 
	public static final String TABLENAME = "REPCAT$_USER_PARM_VALUES"; 

	public Repcat$UserParmValuesDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Repcat$UserParmValuesPo> CONVERTER = new MapConverter<Repcat$UserParmValuesPo>() { 
 
		@Override 
		public Repcat$UserParmValuesPo convert(final DataObject dataObject) { 
			final Repcat$UserParmValuesPo repcat$UserParmValuesPo = new Repcat$UserParmValuesPo(); 
			repcat$UserParmValuesPo.setUserParameterId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$UserParmValuesPo.COLUMNS.USER_PARAMETER_ID.name()))); 
			repcat$UserParmValuesPo.setTemplateParameterId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$UserParmValuesPo.COLUMNS.TEMPLATE_PARAMETER_ID.name()))); 
			repcat$UserParmValuesPo.setUserId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$UserParmValuesPo.COLUMNS.USER_ID.name()))); 
			repcat$UserParmValuesPo.setParmValue(); 
			return repcat$UserParmValuesPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Repcat$UserParmValuesPo repcat$UserParmValuesPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Repcat$UserParmValuesPo.COLUMNS.USER_PARAMETER_ID.name(), repcat$UserParmValuesPo.getUserParameterId()); 
			dataObject.setValue(Repcat$UserParmValuesPo.COLUMNS.TEMPLATE_PARAMETER_ID.name(), repcat$UserParmValuesPo.getTemplateParameterId()); 
			dataObject.setValue(Repcat$UserParmValuesPo.COLUMNS.USER_ID.name(), repcat$UserParmValuesPo.getUserId()); 
			dataObject.setValue(Repcat$UserParmValuesPo.COLUMNS.PARM_VALUE.name(), repcat$UserParmValuesPo.getParmValue()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Repcat$UserParmValuesPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Repcat$UserParmValuesPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Repcat$UserParmValuesPo.COLUMNS.USER_PARAMETER_ID.name(), po.getUserParameterId()); 
		sqlWhere.add(Repcat$UserParmValuesPo.COLUMNS.TEMPLATE_PARAMETER_ID.name(), po.getTemplateParameterId()); 
		sqlWhere.add(Repcat$UserParmValuesPo.COLUMNS.USER_ID.name(), po.getUserId()); 
		return sqlWhere; 
	} 
 
} 
