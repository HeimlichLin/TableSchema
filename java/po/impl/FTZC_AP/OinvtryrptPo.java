package com.doc.common.po.impl; 
 
public class OinvtryrptPo implements IOinvtryrptPo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		INV_YEAR("盤點年度"), //
		INV_ITEM("結算報告表項次"), //
		COMMODITY_NO("料號"), //
		GOOD_UNIT("單位"), //
		GOODS_DESC("貨名"), //
		LAST_QTY("上期已稅結轉量(結算報告表 + 項)"), //
		QTY("本期已稅進儲數量(結算報告表 + 項)"), //
		OUT1_QTY("(結算報告表 - 項)；復進區數量_原料數量"), //
		OUT2_QTY("(結算報告表 - 項)；復進區數量_總成件折合原料數"), //
		OUT3_QTY("(結算報告表 - 項)；運往國瑞總成件折合原料數"), //
		OUT4_QTY("(結算報告表 - 項)；總成件區外出口折合原料數"), //
		OUT5_QTY("(結算報告表 - 項)；區外補稅數量_原料數量"), //
		OUT6_QTY("(結算報告表 - 項)；區外補稅數量_總成件折合原料數"), //
		BOOK_QTY("帳面結存數量"), //
		INV_QTY("本期盤點數量"), //
		EARN_QTY("盤盈數量"), //
		LOST_QTY("盤虧數量"), //
		ALLOWMISS_RATE("盤差容許率"), //
		ALLOWMISS_QTY("盤差容許數量"), //
		PAYTAX_QTY("盤差補稅數量"), //
		NEXT_QTY("結轉下期盤差"), //
		REMARK("備註"), //
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
	private BigDecimal invYear;
	private BigDecimal invItem;
	private String commodityNo;
	private String goodUnit;
	private String goodsDesc;
	private BigDecimal lastQty;
	private BigDecimal qty;
	private BigDecimal out1Qty;
	private BigDecimal out2Qty;
	private BigDecimal out3Qty;
	private BigDecimal out4Qty;
	private BigDecimal out5Qty;
	private BigDecimal out6Qty;
	private BigDecimal bookQty;
	private BigDecimal invQty;
	private BigDecimal earnQty;
	private BigDecimal lostQty;
	private BigDecimal allowmissRate;
	private BigDecimal allowmissQty;
	private BigDecimal paytaxQty;
	private BigDecimal nextQty;
	private String remark;
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
	public String getGoodsDesc() {
		return this.goodsDesc;
	}
 
	@Override
	public void setGoodsDesc(final String goodsDesc) {
		this.goodsDesc = goodsDesc; 
	}
 
	@Override
	public BigDecimal getLastQty() {
		return this.lastQty;
	}
 
	@Override
	public void setLastQty(final BigDecimal lastQty) {
		this.lastQty = lastQty; 
	}
 
	@Override
	public BigDecimal getQty() {
		return this.qty;
	}
 
	@Override
	public void setQty(final BigDecimal qty) {
		this.qty = qty; 
	}
 
	@Override
	public BigDecimal getOut1Qty() {
		return this.out1Qty;
	}
 
	@Override
	public void setOut1Qty(final BigDecimal out1Qty) {
		this.out1Qty = out1Qty; 
	}
 
	@Override
	public BigDecimal getOut2Qty() {
		return this.out2Qty;
	}
 
	@Override
	public void setOut2Qty(final BigDecimal out2Qty) {
		this.out2Qty = out2Qty; 
	}
 
	@Override
	public BigDecimal getOut3Qty() {
		return this.out3Qty;
	}
 
	@Override
	public void setOut3Qty(final BigDecimal out3Qty) {
		this.out3Qty = out3Qty; 
	}
 
	@Override
	public BigDecimal getOut4Qty() {
		return this.out4Qty;
	}
 
	@Override
	public void setOut4Qty(final BigDecimal out4Qty) {
		this.out4Qty = out4Qty; 
	}
 
	@Override
	public BigDecimal getOut5Qty() {
		return this.out5Qty;
	}
 
	@Override
	public void setOut5Qty(final BigDecimal out5Qty) {
		this.out5Qty = out5Qty; 
	}
 
	@Override
	public BigDecimal getOut6Qty() {
		return this.out6Qty;
	}
 
	@Override
	public void setOut6Qty(final BigDecimal out6Qty) {
		this.out6Qty = out6Qty; 
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
	public BigDecimal getInvQty() {
		return this.invQty;
	}
 
	@Override
	public void setInvQty(final BigDecimal invQty) {
		this.invQty = invQty; 
	}
 
	@Override
	public BigDecimal getEarnQty() {
		return this.earnQty;
	}
 
	@Override
	public void setEarnQty(final BigDecimal earnQty) {
		this.earnQty = earnQty; 
	}
 
	@Override
	public BigDecimal getLostQty() {
		return this.lostQty;
	}
 
	@Override
	public void setLostQty(final BigDecimal lostQty) {
		this.lostQty = lostQty; 
	}
 
	@Override
	public BigDecimal getAllowmissRate() {
		return this.allowmissRate;
	}
 
	@Override
	public void setAllowmissRate(final BigDecimal allowmissRate) {
		this.allowmissRate = allowmissRate; 
	}
 
	@Override
	public BigDecimal getAllowmissQty() {
		return this.allowmissQty;
	}
 
	@Override
	public void setAllowmissQty(final BigDecimal allowmissQty) {
		this.allowmissQty = allowmissQty; 
	}
 
	@Override
	public BigDecimal getPaytaxQty() {
		return this.paytaxQty;
	}
 
	@Override
	public void setPaytaxQty(final BigDecimal paytaxQty) {
		this.paytaxQty = paytaxQty; 
	}
 
	@Override
	public BigDecimal getNextQty() {
		return this.nextQty;
	}
 
	@Override
	public void setNextQty(final BigDecimal nextQty) {
		this.nextQty = nextQty; 
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
