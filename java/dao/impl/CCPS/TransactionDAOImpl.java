package com.doc.common.dao.impl; 
 
public class TransactionDAOImpl extends GeneralDAOImpl<TransactionPo> implements TransactionDAO { 
	public static final TransactionDAOImpl INSTANCE = new TransactionDAOImpl(); 
	public static final String TABLENAME = "TRANSACTION"; 

	public TransactionDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TransactionPo> CONVERTER = new MapConverter<TransactionPo>() { 
 
		@Override 
		public TransactionPo convert(final DataObject dataObject) { 
			final TransactionPo transactionPo = new TransactionPo(); 
			transactionPo.setTransactionMasterIdenCode(dataObject.getString(TransactionPo.COLUMNS.TRANSACTION_MASTER_IDEN_CODE.name())); 
			transactionPo.setBusinessInfoAssoCode(dataObject.getString(TransactionPo.COLUMNS.BUSINESS_INFO_ASSO_CODE.name())); 
			transactionPo.setFactoryInfoAssoCode(dataObject.getString(TransactionPo.COLUMNS.FACTORY_INFO_ASSO_CODE.name())); 
			transactionPo.setTransactionRelation(dataObject.getString(TransactionPo.COLUMNS.TRANSACTION_RELATION.name())); 
			transactionPo.setDomesticCustomer(dataObject.getString(TransactionPo.COLUMNS.DOMESTIC_CUSTOMER.name())); 
			transactionPo.setDomesticSupplier(dataObject.getString(TransactionPo.COLUMNS.DOMESTIC_SUPPLIER.name())); 
			transactionPo.setDomesticProvider(dataObject.getString(TransactionPo.COLUMNS.DOMESTIC_PROVIDER.name())); 
			transactionPo.setForeignCustomer(dataObject.getString(TransactionPo.COLUMNS.FOREIGN_CUSTOMER.name())); 
			transactionPo.setForeignSupplier(dataObject.getString(TransactionPo.COLUMNS.FOREIGN_SUPPLIER.name())); 
			transactionPo.setForeignProvider(dataObject.getString(TransactionPo.COLUMNS.FOREIGN_PROVIDER.name())); 
			transactionPo.setFoodBusinessRegisterId(dataObject.getString(TransactionPo.COLUMNS.FOOD_BUSINESS_REGISTER_ID.name())); 
			transactionPo.setNoRegisterIdReason(dataObject.getString(TransactionPo.COLUMNS.NO_REGISTER_ID_REASON.name())); 
			transactionPo.setNoRegisterIdDescription(dataObject.getString(TransactionPo.COLUMNS.NO_REGISTER_ID_DESCRIPTION.name())); 
			transactionPo.setTransactionSelfCode(dataObject.getString(TransactionPo.COLUMNS.TRANSACTION_SELF_CODE.name())); 
			transactionPo.setTransactionCompanyCode(dataObject.getString(TransactionPo.COLUMNS.TRANSACTION_COMPANY_CODE.name())); 
			transactionPo.setTransactionName(dataObject.getString(TransactionPo.COLUMNS.TRANSACTION_NAME.name())); 
			transactionPo.setTransactionCity(dataObject.getString(TransactionPo.COLUMNS.TRANSACTION_CITY.name())); 
			transactionPo.setTransactionTownshipArea(dataObject.getString(TransactionPo.COLUMNS.TRANSACTION_TOWNSHIP_AREA.name())); 
			transactionPo.setTransactionDomesticAddress(dataObject.getString(TransactionPo.COLUMNS.TRANSACTION_DOMESTIC_ADDRESS.name())); 
			transactionPo.setTransactionForignAddress(dataObject.getString(TransactionPo.COLUMNS.TRANSACTION_FORIGN_ADDRESS.name())); 
			transactionPo.setTransactionContactPerson(dataObject.getString(TransactionPo.COLUMNS.TRANSACTION_CONTACT_PERSON.name())); 
			transactionPo.setTransactionContactPhone1(dataObject.getString(TransactionPo.COLUMNS.TRANSACTION_CONTACT_PHONE1.name())); 
			transactionPo.setTransactionContactPhone2(dataObject.getString(TransactionPo.COLUMNS.TRANSACTION_CONTACT_PHONE2.name())); 
			return transactionPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TransactionPo transactionPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TransactionPo.COLUMNS.TRANSACTION_MASTER_IDEN_CODE.name(), transactionPo.getTransactionMasterIdenCode()); 
			dataObject.setValue(TransactionPo.COLUMNS.BUSINESS_INFO_ASSO_CODE.name(), transactionPo.getBusinessInfoAssoCode()); 
			dataObject.setValue(TransactionPo.COLUMNS.FACTORY_INFO_ASSO_CODE.name(), transactionPo.getFactoryInfoAssoCode()); 
			dataObject.setValue(TransactionPo.COLUMNS.TRANSACTION_RELATION.name(), transactionPo.getTransactionRelation()); 
			dataObject.setValue(TransactionPo.COLUMNS.DOMESTIC_CUSTOMER.name(), transactionPo.getDomesticCustomer()); 
			dataObject.setValue(TransactionPo.COLUMNS.DOMESTIC_SUPPLIER.name(), transactionPo.getDomesticSupplier()); 
			dataObject.setValue(TransactionPo.COLUMNS.DOMESTIC_PROVIDER.name(), transactionPo.getDomesticProvider()); 
			dataObject.setValue(TransactionPo.COLUMNS.FOREIGN_CUSTOMER.name(), transactionPo.getForeignCustomer()); 
			dataObject.setValue(TransactionPo.COLUMNS.FOREIGN_SUPPLIER.name(), transactionPo.getForeignSupplier()); 
			dataObject.setValue(TransactionPo.COLUMNS.FOREIGN_PROVIDER.name(), transactionPo.getForeignProvider()); 
			dataObject.setValue(TransactionPo.COLUMNS.FOOD_BUSINESS_REGISTER_ID.name(), transactionPo.getFoodBusinessRegisterId()); 
			dataObject.setValue(TransactionPo.COLUMNS.NO_REGISTER_ID_REASON.name(), transactionPo.getNoRegisterIdReason()); 
			dataObject.setValue(TransactionPo.COLUMNS.NO_REGISTER_ID_DESCRIPTION.name(), transactionPo.getNoRegisterIdDescription()); 
			dataObject.setValue(TransactionPo.COLUMNS.TRANSACTION_SELF_CODE.name(), transactionPo.getTransactionSelfCode()); 
			dataObject.setValue(TransactionPo.COLUMNS.TRANSACTION_COMPANY_CODE.name(), transactionPo.getTransactionCompanyCode()); 
			dataObject.setValue(TransactionPo.COLUMNS.TRANSACTION_NAME.name(), transactionPo.getTransactionName()); 
			dataObject.setValue(TransactionPo.COLUMNS.TRANSACTION_CITY.name(), transactionPo.getTransactionCity()); 
			dataObject.setValue(TransactionPo.COLUMNS.TRANSACTION_TOWNSHIP_AREA.name(), transactionPo.getTransactionTownshipArea()); 
			dataObject.setValue(TransactionPo.COLUMNS.TRANSACTION_DOMESTIC_ADDRESS.name(), transactionPo.getTransactionDomesticAddress()); 
			dataObject.setValue(TransactionPo.COLUMNS.TRANSACTION_FORIGN_ADDRESS.name(), transactionPo.getTransactionForignAddress()); 
			dataObject.setValue(TransactionPo.COLUMNS.TRANSACTION_CONTACT_PERSON.name(), transactionPo.getTransactionContactPerson()); 
			dataObject.setValue(TransactionPo.COLUMNS.TRANSACTION_CONTACT_PHONE1.name(), transactionPo.getTransactionContactPhone1()); 
			dataObject.setValue(TransactionPo.COLUMNS.TRANSACTION_CONTACT_PHONE2.name(), transactionPo.getTransactionContactPhone2()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TransactionPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TransactionPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(TransactionPo.COLUMNS.TRANSACTION_MASTER_IDEN_CODE.name(), po.getTransactionMasterIdenCode()); 
		sqlWhere.add(TransactionPo.COLUMNS.BUSINESS_INFO_ASSO_CODE.name(), po.getBusinessInfoAssoCode()); 
		return sqlWhere; 
	} 
 
} 
