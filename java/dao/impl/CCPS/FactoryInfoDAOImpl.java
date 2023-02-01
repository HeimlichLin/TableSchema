package com.doc.common.dao.impl; 
 
public class FactoryInfoDAOImpl extends GeneralDAOImpl<FactoryInfoPo> implements FactoryInfoDAO { 
	public static final FactoryInfoDAOImpl INSTANCE = new FactoryInfoDAOImpl(); 
	public static final String TABLENAME = "FACTORY_INFO"; 

	public FactoryInfoDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<FactoryInfoPo> CONVERTER = new MapConverter<FactoryInfoPo>() { 
 
		@Override 
		public FactoryInfoPo convert(final DataObject dataObject) { 
			final FactoryInfoPo factoryInfoPo = new FactoryInfoPo(); 
			factoryInfoPo.setFactoryInfoMasterIdenCode(dataObject.getString(FactoryInfoPo.COLUMNS.FACTORY_INFO_MASTER_IDEN_CODE.name())); 
			factoryInfoPo.setBusinessInfoMasterAssoCode(dataObject.getString(FactoryInfoPo.COLUMNS.BUSINESS_INFO_MASTER_ASSO_CODE.name())); 
			factoryInfoPo.setFoodRegNum(dataObject.getString(FactoryInfoPo.COLUMNS.FOOD_REG_NUM.name())); 
			factoryInfoPo.setScale(dataObject.getString(FactoryInfoPo.COLUMNS.SCALE.name())); 
			factoryInfoPo.setReged(dataObject.getString(FactoryInfoPo.COLUMNS.REGED.name())); 
			factoryInfoPo.setBan(dataObject.getString(FactoryInfoPo.COLUMNS.BAN.name())); 
			factoryInfoPo.setName(dataObject.getString(FactoryInfoPo.COLUMNS.NAME.name())); 
			factoryInfoPo.setCity(dataObject.getString(FactoryInfoPo.COLUMNS.CITY.name())); 
			factoryInfoPo.setArea(dataObject.getString(FactoryInfoPo.COLUMNS.AREA.name())); 
			factoryInfoPo.setAddress(dataObject.getString(FactoryInfoPo.COLUMNS.ADDRESS.name())); 
			factoryInfoPo.setZipcode(dataObject.getString(FactoryInfoPo.COLUMNS.ZIPCODE.name())); 
			factoryInfoPo.setTel(dataObject.getString(FactoryInfoPo.COLUMNS.TEL.name())); 
			factoryInfoPo.setFax(dataObject.getString(FactoryInfoPo.COLUMNS.FAX.name())); 
			factoryInfoPo.setContacts(dataObject.getString(FactoryInfoPo.COLUMNS.CONTACTS.name())); 
			factoryInfoPo.setContactsTitle(dataObject.getString(FactoryInfoPo.COLUMNS.CONTACTS_TITLE.name())); 
			factoryInfoPo.setContactsEmail(dataObject.getString(FactoryInfoPo.COLUMNS.CONTACTS_EMAIL.name())); 
			factoryInfoPo.setStatus(dataObject.getString(FactoryInfoPo.COLUMNS.STATUS.name())); 
			return factoryInfoPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final FactoryInfoPo factoryInfoPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(FactoryInfoPo.COLUMNS.FACTORY_INFO_MASTER_IDEN_CODE.name(), factoryInfoPo.getFactoryInfoMasterIdenCode()); 
			dataObject.setValue(FactoryInfoPo.COLUMNS.BUSINESS_INFO_MASTER_ASSO_CODE.name(), factoryInfoPo.getBusinessInfoMasterAssoCode()); 
			dataObject.setValue(FactoryInfoPo.COLUMNS.FOOD_REG_NUM.name(), factoryInfoPo.getFoodRegNum()); 
			dataObject.setValue(FactoryInfoPo.COLUMNS.SCALE.name(), factoryInfoPo.getScale()); 
			dataObject.setValue(FactoryInfoPo.COLUMNS.REGED.name(), factoryInfoPo.getReged()); 
			dataObject.setValue(FactoryInfoPo.COLUMNS.BAN.name(), factoryInfoPo.getBan()); 
			dataObject.setValue(FactoryInfoPo.COLUMNS.NAME.name(), factoryInfoPo.getName()); 
			dataObject.setValue(FactoryInfoPo.COLUMNS.CITY.name(), factoryInfoPo.getCity()); 
			dataObject.setValue(FactoryInfoPo.COLUMNS.AREA.name(), factoryInfoPo.getArea()); 
			dataObject.setValue(FactoryInfoPo.COLUMNS.ADDRESS.name(), factoryInfoPo.getAddress()); 
			dataObject.setValue(FactoryInfoPo.COLUMNS.ZIPCODE.name(), factoryInfoPo.getZipcode()); 
			dataObject.setValue(FactoryInfoPo.COLUMNS.TEL.name(), factoryInfoPo.getTel()); 
			dataObject.setValue(FactoryInfoPo.COLUMNS.FAX.name(), factoryInfoPo.getFax()); 
			dataObject.setValue(FactoryInfoPo.COLUMNS.CONTACTS.name(), factoryInfoPo.getContacts()); 
			dataObject.setValue(FactoryInfoPo.COLUMNS.CONTACTS_TITLE.name(), factoryInfoPo.getContactsTitle()); 
			dataObject.setValue(FactoryInfoPo.COLUMNS.CONTACTS_EMAIL.name(), factoryInfoPo.getContactsEmail()); 
			dataObject.setValue(FactoryInfoPo.COLUMNS.STATUS.name(), factoryInfoPo.getStatus()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<FactoryInfoPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(FactoryInfoPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(FactoryInfoPo.COLUMNS.FACTORY_INFO_MASTER_IDEN_CODE.name(), po.getFactoryInfoMasterIdenCode()); 
		return sqlWhere; 
	} 
 
} 
