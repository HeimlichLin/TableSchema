package com.doc.common.po.impl; 
 
public class InvtrybookPo implements IInvtrybookPo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		INV_YEAR("結算年度"), //
		INV_ITEM("盤存清冊項次"), //
		IN_STORAGE_AREA("進倉儲位"), //
		COMMODITY_NO("產品料號"), //
		CARD_NO("盤點卡號"), //
		GOOD_TYPE("貨物性質(1:機器設備;2:營運貨物)"), //
		GOOD_KIND("貨物類別(1:原料;2:成品/在製品)"), //
		GOOD_UNIT("單位"), //
		GOODS_SPEC("規格"), //
		GOODS_MODEL("型號"), //
		GOODS_DESC("貨名"), //
		MODIFY_DATE("更新時間"), //
		INV_DATE("盤點日期"), //
		INV_QTY("盤點數量(實盤數量)"), //
		BOOK_QTY("帳面數量"), //
		REMARK("備註"), //
		BOM_NO("用料清表編號(系統唯一)"), //
		BOM_DATE("用料清表日期"), //
		AREA("存放區域(貨物型態為原料系統記錄「原料倉」；貨物型態為成品系統記錄「成品倉」)"), //
		BOM_VER("用料清表版本"), //
		INOUT("區內外註記(1:區內;2:區外)"), //
		CTM_CODE("客戶編號(區外專用)"), //
		COCOMP_NO("協力廠商(區外專用)"), //
		CHECKER1("初盤者"), //
		CHECKER2("複盤者"), //
		CHECKER3("會計師") //
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
	private String invItem;
	private String inStorageArea;
	private String commodityNo;
	private String cardNo;
	private String goodType;
	private String goodKind;
	private String goodUnit;
	private String goodsSpec;
	private String goodsModel;
	private String goodsDesc;
	private String modifyDate;
	private String invDate;
	private BigDecimal invQty;
	private BigDecimal bookQty;
	private String remark;
	private String bomNo;
	private String bomDate;
	private String area;
	private String bomVer;
	private String inout;
	private String ctmCode;
	private String cocompNo;
	private String checker1;
	private String checker2;
	private String checker3;

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
	public String getInvItem() {
		return this.invItem;
	}
 
	@Override
	public void setInvItem(final String invItem) {
		this.invItem = invItem; 
	}
 
	@Override
	public String getInStorageArea() {
		return this.inStorageArea;
	}
 
	@Override
	public void setInStorageArea(final String inStorageArea) {
		this.inStorageArea = inStorageArea; 
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
	public String getCardNo() {
		return this.cardNo;
	}
 
	@Override
	public void setCardNo(final String cardNo) {
		this.cardNo = cardNo; 
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
	public String getInvDate() {
		return this.invDate;
	}
 
	@Override
	public void setInvDate(final String invDate) {
		this.invDate = invDate; 
	}
 
	@Override
	public BigDecimal getInvQty() {
		return this.invQty;
	}
 
	@Override
	public void setInvQty(final BigDecimal invQty) {
		this.invQty = invQty; 
	}
 
	@Override
	public BigDecimal getBookQty() {
		return this.bookQty;
	}
 
	@Override
	public void setBookQty(final BigDecimal bookQty) {
		this.bookQty = bookQty; 
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
	public String getBomNo() {
		return this.bomNo;
	}
 
	@Override
	public void setBomNo(final String bomNo) {
		this.bomNo = bomNo; 
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
	public String getArea() {
		return this.area;
	}
 
	@Override
	public void setArea(final String area) {
		this.area = area; 
	}
 
	@Override
	public String getBomVer() {
		return this.bomVer;
	}
 
	@Override
	public void setBomVer(final String bomVer) {
		this.bomVer = bomVer; 
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
	public String getChecker1() {
		return this.checker1;
	}
 
	@Override
	public void setChecker1(final String checker1) {
		this.checker1 = checker1; 
	}
 
	@Override
	public String getChecker2() {
		return this.checker2;
	}
 
	@Override
	public void setChecker2(final String checker2) {
		this.checker2 = checker2; 
	}
 
	@Override
	public String getChecker3() {
		return this.checker3;
	}
 
	@Override
	public void setChecker3(final String checker3) {
		this.checker3 = checker3; 
	}
 
}
