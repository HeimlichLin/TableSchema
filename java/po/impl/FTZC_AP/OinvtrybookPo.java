package com.doc.common.po.impl; 
 
public class OinvtrybookPo implements IOinvtrybookPo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		INV_YEAR("結算年度"), //
		INV_ITEM("盤存清冊項次"), //
		COMMODITY_NO("產品料號"), //
		GOOD_UNIT("單位"), //
		INV_QTY("盤點數量(實盤數量)"), //
		BOOK_QTY("帳面數量"), //
		CARD_NO("盤點卡號"), //
		GOODS_DESC("貨名"), //
		INV_DATE("盤點日期"), //
		REMARK("備註"), //
		AREA("存放區域(貨物型態為原料系統記錄「原料倉」；貨物型態為成品系統記錄「成品倉」)"), //
		CTM_CODE("客戶編號"), //
		COCOMP_NO("協力廠商"), //
		CHECKER1("盤點者") //
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
	private BigDecimal invYear;
	private BigDecimal invItem;
	private String commodityNo;
	private String goodUnit;
	private BigDecimal invQty;
	private BigDecimal bookQty;
	private String cardNo;
	private String goodsDesc;
	private String invDate;
	private String remark;
	private String area;
	private String ctmCode;
	private String cocompNo;
	private String checker1;

	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
	}
 
	@Override
	public BigDecimal getInvYear() {
		return this.invYear;
	}
 
	@Override
	public void setInvYear(final BigDecimal invYear) {
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
	public String getGoodUnit() {
		return this.goodUnit;
	}
 
	@Override
	public void setGoodUnit(final String goodUnit) {
		this.goodUnit = goodUnit; 
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
	public String getCardNo() {
		return this.cardNo;
	}
 
	@Override
	public void setCardNo(final String cardNo) {
		this.cardNo = cardNo; 
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
	public String getInvDate() {
		return this.invDate;
	}
 
	@Override
	public void setInvDate(final String invDate) {
		this.invDate = invDate; 
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
	public String getArea() {
		return this.area;
	}
 
	@Override
	public void setArea(final String area) {
		this.area = area; 
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
 
}
