package com.doc.common.dao.impl; 
 
public class BusinessInfoDAOImpl extends GeneralDAOImpl<BusinessInfoPo> implements BusinessInfoDAO { 
	public static final BusinessInfoDAOImpl INSTANCE = new BusinessInfoDAOImpl(); 
	public static final String TABLENAME = "BUSINESS_INFO"; 

	public BusinessInfoDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<BusinessInfoPo> CONVERTER = new MapConverter<BusinessInfoPo>() { 
 
		@Override 
		public BusinessInfoPo convert(final DataObject dataObject) { 
			final BusinessInfoPo businessInfoPo = new BusinessInfoPo(); 
			businessInfoPo.setBusinessInfoMasterIdenCode(dataObject.getString(BusinessInfoPo.COLUMNS.BUSINESS_INFO_MASTER_IDEN_CODE.name())); 
			businessInfoPo.setFoodRegNum(dataObject.getString(BusinessInfoPo.COLUMNS.FOOD_REG_NUM.name())); 
			businessInfoPo.setBan(dataObject.getString(BusinessInfoPo.COLUMNS.BAN.name())); 
			businessInfoPo.setName(dataObject.getString(BusinessInfoPo.COLUMNS.NAME.name())); 
			businessInfoPo.setBrand(dataObject.getString(BusinessInfoPo.COLUMNS.BRAND.name())); 
			businessInfoPo.setBoss(dataObject.getString(BusinessInfoPo.COLUMNS.BOSS.name())); 
			businessInfoPo.setCity(dataObject.getString(BusinessInfoPo.COLUMNS.CITY.name())); 
			businessInfoPo.setArea(dataObject.getString(BusinessInfoPo.COLUMNS.AREA.name())); 
			businessInfoPo.setAddress(dataObject.getString(BusinessInfoPo.COLUMNS.ADDRESS.name())); 
			businessInfoPo.setZipcode(dataObject.getString(BusinessInfoPo.COLUMNS.ZIPCODE.name())); 
			businessInfoPo.setTel(dataObject.getString(BusinessInfoPo.COLUMNS.TEL.name())); 
			businessInfoPo.setFax(dataObject.getString(BusinessInfoPo.COLUMNS.FAX.name())); 
			businessInfoPo.setContacts(dataObject.getString(BusinessInfoPo.COLUMNS.CONTACTS.name())); 
			businessInfoPo.setContactsTitle(dataObject.getString(BusinessInfoPo.COLUMNS.CONTACTS_TITLE.name())); 
			businessInfoPo.setContactsEmail(dataObject.getString(BusinessInfoPo.COLUMNS.CONTACTS_EMAIL.name())); 
			businessInfoPo.setContactsMobile(dataObject.getString(BusinessInfoPo.COLUMNS.CONTACTS_MOBILE.name())); 
			businessInfoPo.setStatus(dataObject.getString(BusinessInfoPo.COLUMNS.STATUS.name())); 
			businessInfoPo.setRemark(dataObject.getString(BusinessInfoPo.COLUMNS.REMARK.name())); 
			businessInfoPo.setIndustryIi(dataObject.getString(BusinessInfoPo.COLUMNS.INDUSTRY_II.name())); 
			businessInfoPo.setIndustryMf(dataObject.getString(BusinessInfoPo.COLUMNS.INDUSTRY_MF.name())); 
			businessInfoPo.setIndustrySb(dataObject.getString(BusinessInfoPo.COLUMNS.INDUSTRY_SB.name())); 
			businessInfoPo.setIndustryBi(dataObject.getString(BusinessInfoPo.COLUMNS.INDUSTRY_BI.name())); 
			return businessInfoPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final BusinessInfoPo businessInfoPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(BusinessInfoPo.COLUMNS.BUSINESS_INFO_MASTER_IDEN_CODE.name(), businessInfoPo.getBusinessInfoMasterIdenCode()); 
			dataObject.setValue(BusinessInfoPo.COLUMNS.FOOD_REG_NUM.name(), businessInfoPo.getFoodRegNum()); 
			dataObject.setValue(BusinessInfoPo.COLUMNS.BAN.name(), businessInfoPo.getBan()); 
			dataObject.setValue(BusinessInfoPo.COLUMNS.NAME.name(), businessInfoPo.getName()); 
			dataObject.setValue(BusinessInfoPo.COLUMNS.BRAND.name(), businessInfoPo.getBrand()); 
			dataObject.setValue(BusinessInfoPo.COLUMNS.BOSS.name(), businessInfoPo.getBoss()); 
			dataObject.setValue(BusinessInfoPo.COLUMNS.CITY.name(), businessInfoPo.getCity()); 
			dataObject.setValue(BusinessInfoPo.COLUMNS.AREA.name(), businessInfoPo.getArea()); 
			dataObject.setValue(BusinessInfoPo.COLUMNS.ADDRESS.name(), businessInfoPo.getAddress()); 
			dataObject.setValue(BusinessInfoPo.COLUMNS.ZIPCODE.name(), businessInfoPo.getZipcode()); 
			dataObject.setValue(BusinessInfoPo.COLUMNS.TEL.name(), businessInfoPo.getTel()); 
			dataObject.setValue(BusinessInfoPo.COLUMNS.FAX.name(), businessInfoPo.getFax()); 
			dataObject.setValue(BusinessInfoPo.COLUMNS.CONTACTS.name(), businessInfoPo.getContacts()); 
			dataObject.setValue(BusinessInfoPo.COLUMNS.CONTACTS_TITLE.name(), businessInfoPo.getContactsTitle()); 
			dataObject.setValue(BusinessInfoPo.COLUMNS.CONTACTS_EMAIL.name(), businessInfoPo.getContactsEmail()); 
			dataObject.setValue(BusinessInfoPo.COLUMNS.CONTACTS_MOBILE.name(), businessInfoPo.getContactsMobile()); 
			dataObject.setValue(BusinessInfoPo.COLUMNS.STATUS.name(), businessInfoPo.getStatus()); 
			dataObject.setValue(BusinessInfoPo.COLUMNS.REMARK.name(), businessInfoPo.getRemark()); 
			dataObject.setValue(BusinessInfoPo.COLUMNS.INDUSTRY_II.name(), businessInfoPo.getIndustryIi()); 
			dataObject.setValue(BusinessInfoPo.COLUMNS.INDUSTRY_MF.name(), businessInfoPo.getIndustryMf()); 
			dataObject.setValue(BusinessInfoPo.COLUMNS.INDUSTRY_SB.name(), businessInfoPo.getIndustrySb()); 
			dataObject.setValue(BusinessInfoPo.COLUMNS.INDUSTRY_BI.name(), businessInfoPo.getIndustryBi()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<BusinessInfoPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(BusinessInfoPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(BusinessInfoPo.COLUMNS.BUSINESS_INFO_MASTER_IDEN_CODE.name(), po.getBusinessInfoMasterIdenCode()); 
		return sqlWhere; 
	} 
 
} 
