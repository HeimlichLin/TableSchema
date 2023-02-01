package com.doc.common.dao.impl; 
 
public class Mview$AdvParametersDAOImpl extends GeneralDAOImpl<Mview$AdvParametersPo> implements IMview$AdvParametersDAO { 
	public static final Mview$AdvParametersDAOImpl INSTANCE = new Mview$AdvParametersDAOImpl(); 
	public static final String TABLENAME = "MVIEW$_ADV_PARAMETERS"; 

	public Mview$AdvParametersDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Mview$AdvParametersPo> CONVERTER = new MapConverter<Mview$AdvParametersPo>() { 
 
		@Override 
		public Mview$AdvParametersPo convert(final DataObject dataObject) { 
			final Mview$AdvParametersPo mview$AdvParametersPo = new Mview$AdvParametersPo(); 
			mview$AdvParametersPo.setParameterName(dataObject.getString(Mview$AdvParametersPo.COLUMNS.PARAMETER_NAME.name())); 
			mview$AdvParametersPo.setParameterType(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvParametersPo.COLUMNS.PARAMETER_TYPE.name()))); 
			mview$AdvParametersPo.setStringValue(dataObject.getString(Mview$AdvParametersPo.COLUMNS.STRING_VALUE.name())); 
			mview$AdvParametersPo.setDateValue(TimestampUtils.of(dataObject.getValue(Mview$AdvParametersPo.COLUMNS.DATE_VALUE.name()))); 
			mview$AdvParametersPo.setNumericalValue(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvParametersPo.COLUMNS.NUMERICAL_VALUE.name()))); 
			return mview$AdvParametersPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Mview$AdvParametersPo mview$AdvParametersPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Mview$AdvParametersPo.COLUMNS.PARAMETER_NAME.name(), mview$AdvParametersPo.getParameterName()); 
			dataObject.setValue(Mview$AdvParametersPo.COLUMNS.PARAMETER_TYPE.name(), mview$AdvParametersPo.getParameterType()); 
			dataObject.setValue(Mview$AdvParametersPo.COLUMNS.STRING_VALUE.name(), mview$AdvParametersPo.getStringValue()); 
			dataObject.setValue(Mview$AdvParametersPo.COLUMNS.DATE_VALUE.name(), mview$AdvParametersPo.getDateValue()); 
			dataObject.setValue(Mview$AdvParametersPo.COLUMNS.NUMERICAL_VALUE.name(), mview$AdvParametersPo.getNumericalValue()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Mview$AdvParametersPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Mview$AdvParametersPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Mview$AdvParametersPo.COLUMNS.PARAMETER_NAME.name(), po.getParameterName()); 
		return sqlWhere; 
	} 
 
} 
