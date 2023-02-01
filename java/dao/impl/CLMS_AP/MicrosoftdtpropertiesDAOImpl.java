package com.doc.common.dao.impl; 
 
public class MicrosoftdtpropertiesDAOImpl extends GeneralDAOImpl<MicrosoftdtpropertiesPo> implements MicrosoftdtpropertiesDAO { 
	public static final MicrosoftdtpropertiesDAOImpl INSTANCE = new MicrosoftdtpropertiesDAOImpl(); 
	public static final String TABLENAME = "MICROSOFTDTPROPERTIES"; 

	public MicrosoftdtpropertiesDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<MicrosoftdtpropertiesPo> CONVERTER = new MapConverter<MicrosoftdtpropertiesPo>() { 
 
		@Override 
		public MicrosoftdtpropertiesPo convert(final DataObject dataObject) { 
			final MicrosoftdtpropertiesPo microsoftdtpropertiesPo = new MicrosoftdtpropertiesPo(); 
			microsoftdtpropertiesPo.setId(BigDecimalUtils.formObj(dataObject.getValue(MicrosoftdtpropertiesPo.COLUMNS.ID.name()))); 
			microsoftdtpropertiesPo.setObjectid(BigDecimalUtils.formObj(dataObject.getValue(MicrosoftdtpropertiesPo.COLUMNS.OBJECTID.name()))); 
			microsoftdtpropertiesPo.setProperty(dataObject.getString(MicrosoftdtpropertiesPo.COLUMNS.PROPERTY.name())); 
			microsoftdtpropertiesPo.setValue(dataObject.getString(MicrosoftdtpropertiesPo.COLUMNS.VALUE.name())); 
			microsoftdtpropertiesPo.setLvalue(); 
			microsoftdtpropertiesPo.setVersion(BigDecimalUtils.formObj(dataObject.getValue(MicrosoftdtpropertiesPo.COLUMNS.VERSION.name()))); 
			return microsoftdtpropertiesPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final MicrosoftdtpropertiesPo microsoftdtpropertiesPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(MicrosoftdtpropertiesPo.COLUMNS.ID.name(), microsoftdtpropertiesPo.getId()); 
			dataObject.setValue(MicrosoftdtpropertiesPo.COLUMNS.OBJECTID.name(), microsoftdtpropertiesPo.getObjectid()); 
			dataObject.setValue(MicrosoftdtpropertiesPo.COLUMNS.PROPERTY.name(), microsoftdtpropertiesPo.getProperty()); 
			dataObject.setValue(MicrosoftdtpropertiesPo.COLUMNS.VALUE.name(), microsoftdtpropertiesPo.getValue()); 
			dataObject.setValue(MicrosoftdtpropertiesPo.COLUMNS.LVALUE.name(), microsoftdtpropertiesPo.getLvalue()); 
			dataObject.setValue(MicrosoftdtpropertiesPo.COLUMNS.VERSION.name(), microsoftdtpropertiesPo.getVersion()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<MicrosoftdtpropertiesPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(MicrosoftdtpropertiesPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(MicrosoftdtpropertiesPo.COLUMNS.ID.name(), po.getId()); 
		sqlWhere.add(MicrosoftdtpropertiesPo.COLUMNS.PROPERTY.name(), po.getProperty()); 
		return sqlWhere; 
	} 
 
} 
