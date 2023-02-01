package com.doc.common.po.impl; 
 
public class BomdtlTPo implements IBomdtlTPo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		BOM_NO("用料清表編號(系統唯一)"), //
		VER("用料清表版本"), //
		PARENT("父料號"), //
		ITEM_NO("項次編號"), //
		COMMODITY_NO("料號"), //
		MIX_QTY("含耗損數量使用數量"), //
		BAD_QTY("耗損數量"), //
		UNIT_QTY("原料單位用量"), //
		GOODS_QTY("不含耗損使用數量"), //
		GOODS_UNIT("單位"), //
		GOODS_DESC("貨名"), //
		GOODS_MODEL("型號"), //
		GOODS_SPEC("規格"), //
		REMARKS("明細備註"), //
		MULTI("設變料註記"), //
		USER_ID("建置者/異動者"), //
		START_DATE("有效日期"), //
		END_DATE("失效日期") //
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
	private String bomNo;
	private String ver;
	private String parent;
	private String itemNo;
	private String commodityNo;
	private BigDecimal mixQty;
	private BigDecimal badQty;
	private BigDecimal unitQty;
	private BigDecimal goodsQty;
	private String goodsUnit;
	private String goodsDesc;
	private String goodsModel;
	private String goodsSpec;
	private String remarks;
	private String multi;
	private String userId;
	private String startDate;
	private String endDate;

	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
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
 
	@Override
	public String getParent() {
		return this.parent;
	}
 
	@Override
	public void setParent(final String parent) {
		this.parent = parent; 
	}
 
	@Override
	public String getItemNo() {
		return this.itemNo;
	}
 
	@Override
	public void setItemNo(final String itemNo) {
		this.itemNo = itemNo; 
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
	public BigDecimal getMixQty() {
		return this.mixQty;
	}
 
	@Override
	public void setMixQty(final BigDecimal mixQty) {
		this.mixQty = mixQty; 
	}
 
	@Override
	public BigDecimal getBadQty() {
		return this.badQty;
	}
 
	@Override
	public void setBadQty(final BigDecimal badQty) {
		this.badQty = badQty; 
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
	public BigDecimal getGoodsQty() {
		return this.goodsQty;
	}
 
	@Override
	public void setGoodsQty(final BigDecimal goodsQty) {
		this.goodsQty = goodsQty; 
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
	public String getGoodsModel() {
		return this.goodsModel;
	}
 
	@Override
	public void setGoodsModel(final String goodsModel) {
		this.goodsModel = goodsModel; 
	}
 
	@Override
	public String getGoodsSpec() {
		return this.goodsSpec;
	}
 
	@Override
	public void setGoodsSpec(final String goodsSpec) {
		this.goodsSpec = goodsSpec; 
	}
 
	@Override
	public String getRemarks() {
		return this.remarks;
	}
 
	@Override
	public void setRemarks(final String remarks) {
		this.remarks = remarks; 
	}
 
	@Override
	public String getMulti() {
		return this.multi;
	}
 
	@Override
	public void setMulti(final String multi) {
		this.multi = multi; 
	}
 
	@Override
	public String getUserId() {
		return this.userId;
	}
 
	@Override
	public void setUserId(final String userId) {
		this.userId = userId; 
	}
 
	@Override
	public String getStartDate() {
		return this.startDate;
	}
 
	@Override
	public void setStartDate(final String startDate) {
		this.startDate = startDate; 
	}
 
	@Override
	public String getEndDate() {
		return this.endDate;
	}
 
	@Override
	public void setEndDate(final String endDate) {
		this.endDate = endDate; 
	}
 
}
