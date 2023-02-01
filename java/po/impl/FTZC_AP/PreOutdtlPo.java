package com.doc.common.po.impl; 
 
public class PreOutdtlPo implements IPreOutdtlPo {
 
	public enum COLUMNS {
		BF_NO("null"), //
		O_DECL_NO("null"), //
		O_ITEM_NO("null"), //
		GOODS_UNIT("null"), //
		OUT_STORAGE_AREA("null"), //
		SUMQTY("null"), //
		COMMODITY_NO("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String bfNo;
	private String oDeclNo;
	private BigDecimal oItemNo;
	private String goodsUnit;
	private String outStorageArea;
	private BigDecimal sumqty;
	private String commodityNo;

	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
	}
 
	@Override
	public String getODeclNo() {
		return this.oDeclNo;
	}
 
	@Override
	public void setODeclNo(final String oDeclNo) {
		this.oDeclNo = oDeclNo; 
	}
 
	@Override
	public BigDecimal getOItemNo() {
		return this.oItemNo;
	}
 
	@Override
	public void setOItemNo(final BigDecimal oItemNo) {
		this.oItemNo = oItemNo; 
	}
 
	@Override
	public String getGoodsUnit() {
		return this.goodsUnit;
	}
 
	@Override
	public void setGoodsUnit(final String goodsUnit) {
		this.goodsUnit = goodsUnit; 
	}
 
	@Override
	public String getOutStorageArea() {
		return this.outStorageArea;
	}
 
	@Override
	public void setOutStorageArea(final String outStorageArea) {
		this.outStorageArea = outStorageArea; 
	}
 
	@Override
	public BigDecimal getSumqty() {
		return this.sumqty;
	}
 
	@Override
	public void setSumqty(final BigDecimal sumqty) {
		this.sumqty = sumqty; 
	}
 
	@Override
	public String getCommodityNo() {
		return this.commodityNo;
	}
 
	@Override
	public void setCommodityNo(final String commodityNo) {
		this.commodityNo = commodityNo; 
	}
 
}
