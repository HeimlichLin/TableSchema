package com.doc.common.dao.impl; 
 
public class ParameterDAOImpl extends GeneralDAOImpl<ParameterPo> implements ParameterDAO { 
	public static final ParameterDAOImpl INSTANCE = new ParameterDAOImpl(); 
	public static final String TABLENAME = "PARAMETER"; 

	public ParameterDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ParameterPo> CONVERTER = new MapConverter<ParameterPo>() { 
 
		@Override 
		public ParameterPo convert(final DataObject dataObject) { 
			final ParameterPo parameterPo = new ParameterPo(); 
			parameterPo.setKey(dataObject.getString(ParameterPo.COLUMNS.KEY.name())); 
			parameterPo.setValue(dataObject.getString(ParameterPo.COLUMNS.VALUE.name())); 
			parameterPo.setGroupname(dataObject.getString(ParameterPo.COLUMNS.GROUPNAME.name())); 
			parameterPo.setArea(dataObject.getString(ParameterPo.COLUMNS.AREA.name())); 
			return parameterPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ParameterPo parameterPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ParameterPo.COLUMNS.KEY.name(), parameterPo.getKey()); 
			dataObject.setValue(ParameterPo.COLUMNS.VALUE.name(), parameterPo.getValue()); 
			dataObject.setValue(ParameterPo.COLUMNS.GROUPNAME.name(), parameterPo.getGroupname()); 
			dataObject.setValue(ParameterPo.COLUMNS.AREA.name(), parameterPo.getArea()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ParameterPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ParameterPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
