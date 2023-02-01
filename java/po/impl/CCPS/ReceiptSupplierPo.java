package com.doc.common.po.impl; 
 
public class ReceiptSupplierPo implements IReceiptSupplierPo {
 
	public enum COLUMNS {
		RECEIPT_SUPPLIER_IDEN_CODE("收貨資料供應商識別碼"), //
		RECEIPT_MASTER_ASSO_CODE("收貨資料主檔關聯碼"), //
		DOMESTIC_SUPPLIER_ASSO_CODE("國內供應商交易對象關聯碼"), //
		DOMESTIC_SUPPLIER_SELF_CODE("國內供應商交易對象自編碼"), //
		SUPPLIER_NAME("供應商名稱") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String receiptSupplierIdenCode;
	private String receiptMasterAssoCode;
	private String domesticSupplierAssoCode;
	private String domesticSupplierSelfCode;
	private String supplierName;

	@Override
	public String getReceiptSupplierIdenCode() {
		return this.receiptSupplierIdenCode;
	}
 
	@Override
	public void setReceiptSupplierIdenCode(final String receiptSupplierIdenCode) {
		this.receiptSupplierIdenCode = receiptSupplierIdenCode; 
	}
 
	@Override
	public String getReceiptMasterAssoCode() {
		return this.receiptMasterAssoCode;
	}
 
	@Override
	public void setReceiptMasterAssoCode(final String receiptMasterAssoCode) {
		this.receiptMasterAssoCode = receiptMasterAssoCode; 
	}
 
	@Override
	public String getDomesticSupplierAssoCode() {
		return this.domesticSupplierAssoCode;
	}
 
	@Override
	public void setDomesticSupplierAssoCode(final String domesticSupplierAssoCode) {
		this.domesticSupplierAssoCode = domesticSupplierAssoCode; 
	}
 
	@Override
	public String getDomesticSupplierSelfCode() {
		return this.domesticSupplierSelfCode;
	}
 
	@Override
	public void setDomesticSupplierSelfCode(final String domesticSupplierSelfCode) {
		this.domesticSupplierSelfCode = domesticSupplierSelfCode; 
	}
 
	@Override
	public String getSupplierName() {
		return this.supplierName;
	}
 
	@Override
	public void setSupplierName(final String supplierName) {
		this.supplierName = supplierName; 
	}
 
}
