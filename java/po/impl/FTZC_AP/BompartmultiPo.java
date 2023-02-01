package com.doc.common.po.impl; 
 
public class BompartmultiPo implements IBompartmultiPo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		CTM_CODE("客戶欄位(貨主)"), //
		PRDT_NO("產品料號"), //
		COMMODITY_NO("原料號碼"), //
		COMMODITY_NO2("原料號碼2"), //
		UNIT_QTY("單位用量"), //
		UPD_TIME("更新時間"), //
		BOM_DATE("用料清表日期"), //
		GOODS_UNIT("單位"), //
		GOODS_DESC("備註"), //
		ITEM_NO("項次"), //
		BOM_NO("用料清表編號(系統唯一)"), //
		VER("用料清表版本") //
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
	private String ctmCode;
	private String prdtNo;
	private String commodityNo;
	private String commodityNo2;
	private BigDecimal unitQty;
	private String updTime;
	private String bomDate;
	private String goodsUnit;
	private String goodsDesc;
	private BigDecimal itemNo;
	private String bomNo;
	private String ver;

	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
	}
 
	@Override
	public String getCtmCode() {
		return this.ctmCode;
	}
 
	@Override
	public void setCtmCode(final String ctmCode) {
		this.ctmCode = ctmCode; 
	}
 
	@Override
	public String getPrdtNo() {
		return this.prdtNo;
	}
 
	@Override
	public void setPrdtNo(final String prdtNo) {
		this.prdtNo = prdtNo; 
	}
 
	@Override
	public String getCommodityNo() {
		return this.commodityNo;
	}
 
	@Override
	public void setCommodityNo(final String commodityNo) {
		this.commodityNo = commodityNo; 
	}
 
	@Override
	public String getCommodityNo2() {
		return this.commodityNo2;
	}
 
	@Override
	public void setCommodityNo2(final String commodityNo2) {
		this.commodityNo2 = commodityNo2; 
	}
 
	@Override
	public BigDecimal getUnitQty() {
		return this.unitQty;
	}
 
	@Override
	public void setUnitQty(final BigDecimal unitQty) {
		this.unitQty = unitQty; 
	}
 
	@Override
	public String getUpdTime() {
		return this.updTime;
	}
 
	@Override
	public void setUpdTime(final String updTime) {
		this.updTime = updTime; 
	}
 
	@Override
	public String getBomDate() {
		return this.bomDate;
	}
 
	@Override
	public void setBomDate(final String bomDate) {
		this.bomDate = bomDate; 
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
	public String getGoodsDesc() {
		return this.goodsDesc;
	}
 
	@Override
	public void setGoodsDesc(final String goodsDesc) {
		this.goodsDesc = goodsDesc; 
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
	public String getBomNo() {
		return this.bomNo;
	}
 
	@Override
	public void setBomNo(final String bomNo) {
		this.bomNo = bomNo; 
	}
 
	@Override
	public String getVer() {
		return this.ver;
	}
 
	@Override
	public void setVer(final String ver) {
		this.ver = ver; 
	}
 
}
