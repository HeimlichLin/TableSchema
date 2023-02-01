package com.doc.common.dao.impl; 
 
public class Parameter20060213DAOImpl extends GeneralDAOImpl<Parameter20060213Po> implements Parameter20060213DAO { 
	public static final Parameter20060213DAOImpl INSTANCE = new Parameter20060213DAOImpl(); 
	public static final String TABLENAME = "PARAMETER_20060213"; 

	public Parameter20060213DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Parameter20060213Po> CONVERTER = new MapConverter<Parameter20060213Po>() { 
 
		@Override 
		public Parameter20060213Po convert(final DataObject dataObject) { 
			final Parameter20060213Po parameter20060213Po = new Parameter20060213Po(); 
			parameter20060213Po.setKey(dataObject.getString(Parameter20060213Po.COLUMNS.KEY.name())); 
			parameter20060213Po.setValue(dataObject.getString(Parameter20060213Po.COLUMNS.VALUE.name())); 
			parameter20060213Po.setGroupname(dataObject.getString(Parameter20060213Po.COLUMNS.GROUPNAME.name())); 
			parameter20060213Po.setArea(dataObject.getString(Parameter20060213Po.COLUMNS.AREA.name())); 
			return parameter20060213Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Parameter20060213Po parameter20060213Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Parameter20060213Po.COLUMNS.KEY.name(), parameter20060213Po.getKey()); 
			dataObject.setValue(Parameter20060213Po.COLUMNS.VALUE.name(), parameter20060213Po.getValue()); 
			dataObject.setValue(Parameter20060213Po.COLUMNS.GROUPNAME.name(), parameter20060213Po.getGroupname()); 
			dataObject.setValue(Parameter20060213Po.COLUMNS.AREA.name(), parameter20060213Po.getArea()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Parameter20060213Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Parameter20060213Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
