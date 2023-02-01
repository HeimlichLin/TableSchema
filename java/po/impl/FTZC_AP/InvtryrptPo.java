package com.doc.common.po.impl; 
 
public class InvtryrptPo implements IInvtryrptPo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		INV_YEAR("盤點年度"), //
		INV_ITEM("結算報告表項次"), //
		COMMODITY_NO("料號"), //
		GOOD_TYPE("貨物性質(1:機器設備;2:營運貨物)"), //
		GOOD_KIND("貨物類別(1:原料;2:成品/在製品)"), //
		GOOD_UNIT("單位"), //
		GOODS_SPEC("規格"), //
		GOODS_MODEL("型號"), //
		GOODS_DESC("貨名"), //
		MODIFY_DATE("更新時間"), //
		LASTUNTAX_QTY("上期免稅結轉數量(結算報告表 + 項)"), //
		UNTAX_QTY("本期免稅進儲數量(結算報告表 + 項)"), //
		LASTTAX_QTY("上期已稅結轉量(結算報告表 + 項)"), //
		TAX_QTY("本期已稅進儲數量(結算報告表 + 項)"), //
		OUT5_QTY("(結算報告表 - 項)；區內：本期廠(倉)內加工製造貨物銷售使用數量(成品折合料數)；區外：復進區數量_原料數量"), //
		OUT6_QTY("(結算報告表 - 項)；區內：本期廠(倉)內修理重整貨物銷售使用數量(成品折合料數)；區外：復進區數量_成品折合原料數"), //
		OUT7_QTY("(結算報告表 - 項)；區內：本期外運數量；區外：成品區外出口數量折合原料數"), //
		OUT8_QTY("(結算報告表 - 項)；區內：本期報廢數量；區外：區外補稅數量_原料數量"), //
		OUT9_QTY("(結算報告表 - 項)；區內：本期自國外運入自用機器/設備滿五年除帳數量；區外：區外補稅數量_成品折合原料數"), //
		OUT10_QTY("(結算報告表 - 項)；區內：本期其他情形使用數量；區外：無"), //
		BOOK_QTY("帳面結存數量"), //
		INV_QTY("本期盤點數量"), //
		EARN_QTY("盤盈數量"), //
		LOST_QTY("盤虧數量"), //
		ALLOWMISS_RATE("盤差容許率"), //
		ALLOWMISS_QTY("盤差容許數量"), //
		PAYTAX_QTY("補稅數量"), //
		NEXTUNTAX_QTY("結轉下期免稅數量"), //
		NEXTTAX_QTY("結轉下期已稅數量"), //
		REMARK("備註"), //
		INOUT("區內外(1:區內;2:區外)"), //
		CTM_CODE("客戶編號(區外專用)"), //
		COCOMP_NO("協力廠商(區外專用)"), //
		RTN_CODE("TEST"), //
		ERR_CODE("TEST"), //
		ERR_DESC("TEST"), //
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
	private BigDecimal lastuntaxQty;
	private BigDecimal untaxQty;
	private BigDecimal lasttaxQty;
	private BigDecimal taxQty;
	private BigDecimal out5Qty;
	private BigDecimal out6Qty;
	private BigDecimal out7Qty;
	private BigDecimal out8Qty;
	private BigDecimal out9Qty;
	private BigDecimal out10Qty;
	private BigDecimal bookQty;
	private BigDecimal invQty;
	private BigDecimal earnQty;
	private BigDecimal lostQty;
	private BigDecimal allowmissRate;
	private BigDecimal allowmissQty;
	private BigDecimal paytaxQty;
	private BigDecimal nextuntaxQty;
	private BigDecimal nexttaxQty;
	private String remark;
	private String inout;
	private String ctmCode;
	private String cocompNo;
	private BigDecimal rtnCode;
	private BigDecimal errCode;
	private String errDesc;
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
	public BigDecimal getLastuntaxQty() {
		return this.lastuntaxQty;
	}
 
	@Override
	public void setLastuntaxQty(final BigDecimal lastuntaxQty) {
		this.lastuntaxQty = lastuntaxQty; 
	}
 
	@Override
	public BigDecimal getUntaxQty() {
		return this.untaxQty;
	}
 
	@Override
	public void setUntaxQty(final BigDecimal untaxQty) {
		this.untaxQty = untaxQty; 
	}
 
	@Override
	public BigDecimal getLasttaxQty() {
		return this.lasttaxQty;
	}
 
	@Override
	public void setLasttaxQty(final BigDecimal lasttaxQty) {
		this.lasttaxQty = lasttaxQty; 
	}
 
	@Override
	public BigDecimal getTaxQty() {
		return this.taxQty;
	}
 
	@Override
	public void setTaxQty(final BigDecimal taxQty) {
		this.taxQty = taxQty; 
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
	public BigDecimal getOut7Qty() {
		return this.out7Qty;
	}
 
	@Override
	public void setOut7Qty(final BigDecimal out7Qty) {
		this.out7Qty = out7Qty; 
	}
 
	@Override
	public BigDecimal getOut8Qty() {
		return this.out8Qty;
	}
 
	@Override
	public void setOut8Qty(final BigDecimal out8Qty) {
		this.out8Qty = out8Qty; 
	}
 
	@Override
	public BigDecimal getOut9Qty() {
		return this.out9Qty;
	}
 
	@Override
	public void setOut9Qty(final BigDecimal out9Qty) {
		this.out9Qty = out9Qty; 
	}
 
	@Override
	public BigDecimal getOut10Qty() {
		return this.out10Qty;
	}
 
	@Override
	public void setOut10Qty(final BigDecimal out10Qty) {
		this.out10Qty = out10Qty; 
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
	public BigDecimal getNextuntaxQty() {
		return this.nextuntaxQty;
	}
 
	@Override
	public void setNextuntaxQty(final BigDecimal nextuntaxQty) {
		this.nextuntaxQty = nextuntaxQty; 
	}
 
	@Override
	public BigDecimal getNexttaxQty() {
		return this.nexttaxQty;
	}
 
	@Override
	public void setNexttaxQty(final BigDecimal nexttaxQty) {
		this.nexttaxQty = nexttaxQty; 
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
	public BigDecimal getRtnCode() {
		return this.rtnCode;
	}
 
	@Override
	public void setRtnCode(final BigDecimal rtnCode) {
		this.rtnCode = rtnCode; 
	}
 
	@Override
	public BigDecimal getErrCode() {
		return this.errCode;
	}
 
	@Override
	public void setErrCode(final BigDecimal errCode) {
		this.errCode = errCode; 
	}
 
	@Override
	public String getErrDesc() {
		return this.errDesc;
	}
 
	@Override
	public void setErrDesc(final String errDesc) {
		this.errDesc = errDesc; 
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
