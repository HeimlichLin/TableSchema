package com.doc.common.dao.impl; 
 
public class ServiceTypeDAOImpl extends GeneralDAOImpl<ServiceTypePo> implements ServiceTypeDAO { 
	public static final ServiceTypeDAOImpl INSTANCE = new ServiceTypeDAOImpl(); 
	public static final String TABLENAME = "SERVICE_TYPE"; 

	public ServiceTypeDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ServiceTypePo> CONVERTER = new MapConverter<ServiceTypePo>() { 
 
		@Override 
		public ServiceTypePo convert(final DataObject dataObject) { 
			final ServiceTypePo serviceTypePo = new ServiceTypePo(); 
			serviceTypePo.setTypeName(dataObject.getString(ServiceTypePo.COLUMNS.TYPE_NAME.name())); 
			return serviceTypePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ServiceTypePo serviceTypePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ServiceTypePo.COLUMNS.TYPE_NAME.name(), serviceTypePo.getTypeName()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ServiceTypePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ServiceTypePo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(ServiceTypePo.COLUMNS.TYPE_NAME.name(), po.getTypeName()); 
		return sqlWhere; 
	} 
 
} 
