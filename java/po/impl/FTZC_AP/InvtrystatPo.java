package com.doc.common.po.impl; 
 
public class InvtrystatPo implements IInvtrystatPo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		INV_YEAR("盤點年度"), //
		INV_ITEM("盤點統計表項次"), //
		COMMODITY_NO("產品料號"), //
		GOOD_TYPE("貨物性質(1:機器設備;2:營運貨物)"), //
		GOOD_KIND("貨物類別(1:原料;2:成品/在製品)"), //
		GOOD_UNIT("單位"), //
		GOODS_SPEC("規格"), //
		GOODS_MODEL("型號"), //
		GOODS_DESC("貨名"), //
		MODIFY_DATE("更新時間"), //
		MAR_QTY("盤存清冊的原料倉原料數量"), //
		LINEMAR_QTY("生產線原料存量"), //
		PRD2MAR_QTY("盤點折合的原料數量"), //
		LINEPRD2MAR_QTY("生產線成品折合原料"), //
		STAT_QTY("盤存合計=原料倉原料存量+生產線原料存量+成品折合+生產線成品折合原料"), //
		REMARK("備註"), //
		INOUT("區內外(1:區內;2:區外;3:區間盤點)"), //
		CTM_CODE("客戶編號(區外專用)"), //
		COCOMP_NO("協力廠商(區外專用)"), //
		INV_DATE("盤點日期") //
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
	private String invYear;
	private BigDecimal invItem;
	private String commodityNo;
	private String goodType;
	private String goodKind;
	private String goodUnit;
	private String goodsSpec;
	private String goodsModel;
	private String goodsDesc;
	private String modifyDate;
	private BigDecimal marQty;
	private BigDecimal linemarQty;
	private BigDecimal prd2marQty;
	private BigDecimal lineprd2marQty;
	private BigDecimal statQty;
	private String remark;
	private String inout;
	private String ctmCode;
	private String cocompNo;
	private String invDate;

	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
	}
 
	@Override
	public String getInvYear() {
		return this.invYear;
	}
 
	@Override
	public void setInvYear(final String invYear) {
		this.invYear = invYear; 
	}
 
	@Override
	public BigDecimal getInvItem() {
		return this.invItem;
	}
 
	@Override
	public void setInvItem(final BigDecimal invItem) {
		this.invItem = invItem; 
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
	public String getGoodType() {
		return this.goodType;
	}
 
	@Override
	public void setGoodType(final String goodType) {
		this.goodType = goodType; 
	}
 
	@Override
	public String getGoodKind() {
		return this.goodKind;
	}
 
	@Override
	public void setGoodKind(final String goodKind) {
		this.goodKind = goodKind; 
	}
 
	@Override
	public String getGoodUnit() {
		return this.goodUnit;
	}
 
	@Override
	public void setGoodUnit(final String goodUnit) {
		this.goodUnit = goodUnit; 
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
	public String getGoodsModel() {
		return this.goodsModel;
	}
 
	@Override
	public void setGoodsModel(final String goodsModel) {
		this.goodsModel = goodsModel; 
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
	public String getModifyDate() {
		return this.modifyDate;
	}
 
	@Override
	public void setModifyDate(final String modifyDate) {
		this.modifyDate = modifyDate; 
	}
 
	@Override
	public BigDecimal getMarQty() {
		return this.marQty;
	}
 
	@Override
	public void setMarQty(final BigDecimal marQty) {
		this.marQty = marQty; 
	}
 
	@Override
	public BigDecimal getLinemarQty() {
		return this.linemarQty;
	}
 
	@Override
	public void setLinemarQty(final BigDecimal linemarQty) {
		this.linemarQty = linemarQty; 
	}
 
	@Override
	public BigDecimal getPrd2marQty() {
		return this.prd2marQty;
	}
 
	@Override
	public void setPrd2marQty(final BigDecimal prd2marQty) {
		this.prd2marQty = prd2marQty; 
	}
 
	@Override
	public BigDecimal getLineprd2marQty() {
		return this.lineprd2marQty;
	}
 
	@Override
	public void setLineprd2marQty(final BigDecimal lineprd2marQty) {
		this.lineprd2marQty = lineprd2marQty; 
	}
 
	@Override
	public BigDecimal getStatQty() {
		return this.statQty;
	}
 
	@Override
	public void setStatQty(final BigDecimal statQty) {
		this.statQty = statQty; 
	}
 
	@Override
	public String getRemark() {
		return this.remark;
	}
 
	@Override
	public void setRemark(final String remark) {
		this.remark = remark; 
	}
 
	@Override
	public String getInout() {
		return this.inout;
	}
 
	@Override
	public void setInout(final String inout) {
		this.inout = inout; 
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
	public String getCocompNo() {
		return this.cocompNo;
	}
 
	@Override
	public void setCocompNo(final String cocompNo) {
		this.cocompNo = cocompNo; 
	}
 
	@Override
	public String getInvDate() {
		return this.invDate;
	}
 
	@Override
	public void setInvDate(final String invDate) {
		this.invDate = invDate; 
	}
 
}
