package com.doc.common.po; 
 
public interface ITransactionPo {
 
	String getTransactionMasterIdenCode();
 
	void setTransactionMasterIdenCode(final String transactionMasterIdenCode);
 
	String getBusinessInfoAssoCode();
 
	void setBusinessInfoAssoCode(final String businessInfoAssoCode);
 
	String getFactoryInfoAssoCode();
 
	void setFactoryInfoAssoCode(final String factoryInfoAssoCode);
 
	String getTransactionRelation();
 
	void setTransactionRelation(final String transactionRelation);
 
	String getDomesticCustomer();
 
	void setDomesticCustomer(final String domesticCustomer);
 
	String getDomesticSupplier();
 
	void setDomesticSupplier(final String domesticSupplier);
 
	String getDomesticProvider();
 
	void setDomesticProvider(final String domesticProvider);
 
	String getForeignCustomer();
 
	void setForeignCustomer(final String foreignCustomer);
 
	String getForeignSupplier();
 
	void setForeignSupplier(final String foreignSupplier);
 
	String getForeignProvider();
 
	void setForeignProvider(final String foreignProvider);
 
	String getFoodBusinessRegisterId();
 
	void setFoodBusinessRegisterId(final String foodBusinessRegisterId);
 
	String getNoRegisterIdReason();
 
	void setNoRegisterIdReason(final String noRegisterIdReason);
 
	String getNoRegisterIdDescription();
 
	void setNoRegisterIdDescription(final String noRegisterIdDescription);
 
	String getTransactionSelfCode();
 
	void setTransactionSelfCode(final String transactionSelfCode);
 
	String getTransactionCompanyCode();
 
	void setTransactionCompanyCode(final String transactionCompanyCode);
 
	String getTransactionName();
 
	void setTransactionName(final String transactionName);
 
	String getTransactionCity();
 
	void setTransactionCity(final String transactionCity);
 
	String getTransactionTownshipArea();
 
	void setTransactionTownshipArea(final String transactionTownshipArea);
 
	String getTransactionDomesticAddress();
 
	void setTransactionDomesticAddress(final String transactionDomesticAddress);
 
	String getTransactionForignAddress();
 
	void setTransactionForignAddress(final String transactionForignAddress);
 
	String getTransactionContactPerson();
 
	void setTransactionContactPerson(final String transactionContactPerson);
 
	String getTransactionContactPhone1();
 
	void setTransactionContactPhone1(final String transactionContactPhone1);
 
	String getTransactionContactPhone2();
 
	void setTransactionContactPhone2(final String transactionContactPhone2);
 
}
