package com.doc.common.po.impl; 
 
public class Im5105dNPo implements IIm5105dNPo {
 
	public enum COLUMNS {
		DECL_NO("報單號碼"), //
		ITEM_NO("報單項次"), //
		CCC_CODE("貨物分類號列"), //
		WEIGHT("重量"), //
		CUSTOMS_VALUE_AMT("完稅價格") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String declNo;
	private BigDecimal itemNo;
	private String cccCode;
	private BigDecimal weight;
	private BigDecimal customsValueAmt;

	@Override
	public String getDeclNo() {
		return this.declNo;
	}
 
	@Override
	public void setDeclNo(final String declNo) {
		this.declNo = declNo; 
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
	public String getCccCode() {
		return this.cccCode;
	}
 
	@Override
	public void setCccCode(final String cccCode) {
		this.cccCode = cccCode; 
	}
 
	@Override
	public BigDecimal getWeight() {
		return this.weight;
	}
 
	@Override
	public void setWeight(final BigDecimal weight) {
		this.weight = weight; 
	}
 
	@Override
	public BigDecimal getCustomsValueAmt() {
		return this.customsValueAmt;
	}
 
	@Override
	public void setCustomsValueAmt(final BigDecimal customsValueAmt) {
		this.customsValueAmt = customsValueAmt; 
	}
 
}
