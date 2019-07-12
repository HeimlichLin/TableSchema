package com.doc.common.dao.impl; 
 
public class MicrosoftdtpropertiesDAO extends GeneralDAOImpl<MicrosoftdtpropertiesDo> implements MicrosoftdtpropertiesDAO { 
	public static final MicrosoftdtpropertiesDAOImpl INSTANCE = new MicrosoftdtpropertiesDAOImpl(); 
	public static final String TABLENAME = "MICROSOFTDTPROPERTIES"; 

	public MicrosoftdtpropertiesDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<MicrosoftdtpropertiesDo> CONVERTER = new MapConverter<MicrosoftdtpropertiesDo>() { 
 
		@Override 
		public MicrosoftdtpropertiesDo convert(final DataObject dataObject) { 
			final MicrosoftdtpropertiesDo microsoftdtpropertiesDo = new MicrosoftdtpropertiesDo(); 
			microsoftdtpropertiesDo.setId(BigDecimalUtils.formObj(dataObject.getString(MicrosoftdtpropertiesDo.COLUMNS.ID.name()))); 
			microsoftdtpropertiesDo.setObjectid(BigDecimalUtils.formObj(dataObject.getString(MicrosoftdtpropertiesDo.COLUMNS.OBJECTID.name()))); 
			microsoftdtpropertiesDo.setProperty(dataObject.getString(MicrosoftdtpropertiesDo.COLUMNS.PROPERTY.name())); 
			microsoftdtpropertiesDo.setValue(dataObject.getString(MicrosoftdtpropertiesDo.COLUMNS.VALUE.name())); 
			microsoftdtpropertiesDo.setLvalue(dataObject.getString(MicrosoftdtpropertiesDo.COLUMNS.LVALUE.name())); 
			microsoftdtpropertiesDo.setVersion(BigDecimalUtils.formObj(dataObject.getString(MicrosoftdtpropertiesDo.COLUMNS.VERSION.name()))); 
			return microsoftdtpropertiesDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final MicrosoftdtpropertiesDo microsoftdtpropertiesDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(MicrosoftdtpropertiesDo.COLUMNS.ID.name(), microsoftdtpropertiesDo.getId()); 
			dataObject.setValue(MicrosoftdtpropertiesDo.COLUMNS.OBJECTID.name(), microsoftdtpropertiesDo.getObjectid()); 
			dataObject.setValue(MicrosoftdtpropertiesDo.COLUMNS.PROPERTY.name(), microsoftdtpropertiesDo.getProperty()); 
			dataObject.setValue(MicrosoftdtpropertiesDo.COLUMNS.VALUE.name(), microsoftdtpropertiesDo.getValue()); 
			dataObject.setValue(MicrosoftdtpropertiesDo.COLUMNS.LVALUE.name(), microsoftdtpropertiesDo.getLvalue()); 
			dataObject.setValue(MicrosoftdtpropertiesDo.COLUMNS.VERSION.name(), microsoftdtpropertiesDo.getVersion()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<MicrosoftdtpropertiesDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(MicrosoftdtpropertiesDo po) { 
		sqlWhere.add(MicrosoftdtpropertiesDo.COLUMNS.OBJECTID.name(), po.getObjectid()); 
		sqlWhere.add(MicrosoftdtpropertiesDo.COLUMNS.VALUE.name(), po.getValue()); 
		sqlWhere.add(MicrosoftdtpropertiesDo.COLUMNS.LVALUE.name(), po.getLvalue()); 
		sqlWhere.add(MicrosoftdtpropertiesDo.COLUMNS.VERSION.name(), po.getVersion()); 
	} 
 
} 
