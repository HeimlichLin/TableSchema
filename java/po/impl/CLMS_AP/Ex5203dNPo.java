package com.doc.common.po.impl; 
 
public class Ex5203dNPo implements IEx5203dNPo {
 
	public enum COLUMNS {
		DECL_NO("報單號碼"), //
		ITEM_NO("報單項次"), //
		CCC_CODE("商品分類號列"), //
		WEIGHT("重量"), //
		FOB_VALUE_TWD("離岸價格") //
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
	private BigDecimal fobValueTwd;

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
	public BigDecimal getFobValueTwd() {
		return this.fobValueTwd;
	}
 
	@Override
	public void setFobValueTwd(final BigDecimal fobValueTwd) {
		this.fobValueTwd = fobValueTwd; 
	}
 
}
