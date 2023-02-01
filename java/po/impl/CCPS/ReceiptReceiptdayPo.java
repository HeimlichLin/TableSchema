package com.doc.common.po.impl; 
 
public class ReceiptReceiptdayPo implements IReceiptReceiptdayPo {
 
	public enum COLUMNS {
		RECEIPT_RECEIPTDAY_IDEN_CODE("收貨資料收貨日期識別碼"), //
		RECEIPT_MASTER_ASSO_CODE("收貨資料主檔關聯碼"), //
		RECEIPT_DAY("收貨日期") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String receiptReceiptdayIdenCode;
	private String receiptMasterAssoCode;
	private String receiptDay;

	@Override
	public String getReceiptReceiptdayIdenCode() {
		return this.receiptReceiptdayIdenCode;
	}
 
	@Override
	public void setReceiptReceiptdayIdenCode(final String receiptReceiptdayIdenCode) {
		this.receiptReceiptdayIdenCode = receiptReceiptdayIdenCode; 
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
	public String getReceiptDay() {
		return this.receiptDay;
	}
 
	@Override
	public void setReceiptDay(final String receiptDay) {
		this.receiptDay = receiptDay; 
	}
 
}
