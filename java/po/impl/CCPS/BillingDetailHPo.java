package com.doc.common.po.impl; 
 
public class BillingDetailHPo implements IBillingDetailHPo {
 
	public enum COLUMNS {
		RECORD_NO("紀錄編號"), //
		WRITE_OFF_NO("銷帳編號"), //
		ITEM_NO("項次"), //
		NAME("名稱"), //
		QUANTITY("數量"), //
		UNIT_PRICE("單價"), //
		SUBTOTAL("小計"), //
		UNTAX_AMOUNT("未稅金額"), //
		TAX_AMOUNT("應稅金額"), //
		REMARK("備註") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String recordNo;
	private String writeOffNo;
	private BigDecimal itemNo;
	private String name;
	private BigDecimal quantity;
	private BigDecimal unitPrice;
	private BigDecimal subtotal;
	private BigDecimal untaxAmount;
	private BigDecimal taxAmount;
	private String remark;

	@Override
	public String getRecordNo() {
		return this.recordNo;
	}
 
	@Override
	public void setRecordNo(final String recordNo) {
		this.recordNo = recordNo; 
	}
 
	@Override
	public String getWriteOffNo() {
		return this.writeOffNo;
	}
 
	@Override
	public void setWriteOffNo(final String writeOffNo) {
		this.writeOffNo = writeOffNo; 
	}
 
	@Override
	public BigDecimal getItemNo() {
		return this.itemNo;
	}
 
	@Override
	public void setItemNo(final BigDecimal itemNo) {
		this.itemNo = itemNo; 
	}
 
	@Override
	public String getName() {
		return this.name;
	}
 
	@Override
	public void setName(final String name) {
		this.name = name; 
	}
 
	@Override
	public BigDecimal getQuantity() {
		return this.quantity;
	}
 
	@Override
	public void setQuantity(final BigDecimal quantity) {
		this.quantity = quantity; 
	}
 
	@Override
	public BigDecimal getUnitPrice() {
		return this.unitPrice;
	}
 
	@Override
	public void setUnitPrice(final BigDecimal unitPrice) {
		this.unitPrice = unitPrice; 
	}
 
	@Override
	public BigDecimal getSubtotal() {
		return this.subtotal;
	}
 
	@Override
	public void setSubtotal(final BigDecimal subtotal) {
		this.subtotal = subtotal; 
	}
 
	@Override
	public BigDecimal getUntaxAmount() {
		return this.untaxAmount;
	}
 
	@Override
	public void setUntaxAmount(final BigDecimal untaxAmount) {
		this.untaxAmount = untaxAmount; 
	}
 
	@Override
	public BigDecimal getTaxAmount() {
		return this.taxAmount;
	}
 
	@Override
	public void setTaxAmount(final BigDecimal taxAmount) {
		this.taxAmount = taxAmount; 
	}
 
	@Override
	public String getRemark() {
		return this.remark;
	}
 
	@Override
	public void setRemark(final String remark) {
		this.remark = remark; 
	}
 
}
