package com.doc.common.po; 
 
public interface IBillingDetailPo {
 
	String getWriteOffNo();
 
	void setWriteOffNo(final String writeOffNo);
 
	BigDecimal getItemNo();
 
	void setItemNo(final BigDecimal itemNo);
 
	String getName();
 
	void setName(final String name);
 
	BigDecimal getQuantity();
 
	void setQuantity(final BigDecimal quantity);
 
	BigDecimal getUnitPrice();
 
	void setUnitPrice(final BigDecimal unitPrice);
 
	BigDecimal getSubtotal();
 
	void setSubtotal(final BigDecimal subtotal);
 
	BigDecimal getUntaxAmount();
 
	void setUntaxAmount(final BigDecimal untaxAmount);
 
	BigDecimal getTaxAmount();
 
	void setTaxAmount(final BigDecimal taxAmount);
 
	String getRemark();
 
	void setRemark(final String remark);
 
}
