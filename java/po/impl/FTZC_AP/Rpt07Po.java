package com.doc.common.po.impl; 
 
public class Rpt07Po implements IRpt07Po {
 
	public enum COLUMNS {
		OUT_DATE("日期－時間"), //
		DECL_NO("報單或憑證號碼"), //
		GOODS_DESC("貨名"), //
		GOODS_BRAND("商標"), //
		GOODS_SPEC("規格"), //
		COMMODITY_NO("原料/成品料號"), //
		GOODS_UNIT("單位"), //
		TOTAL_QTY("原料/成品運出數量"), //
		MATERIALIN_QTY("原料運回數量"), //
		MATERIALTAX_QTY("原料廠外補稅數量"), //
		PRODUCTIN_QTY("成品運回數量"), //
		PRODUCTOUT_QTY("成品逕行出口數量"), //
		PRODUCTTAX_QTY("成品廠外補稅數量"), //
		SCRP_QTY("原料/成品廠外報廢數量（區外盤點清冊）"), //
		VERIFY_UNIT("含（或不含）耗損使用數量（單位數量）"), //
		VERIFY_QTY("折合原料數量"), //
		BALANCE_QTY("滯外數量（含未完成加工折合原料數量）"), //
		OUT_DOC("委託出廠核准文號"), //
		BOM_NO("用料清表編號"), //
		SCRAP_DOC("報廢核准文號及報廢清冊編號"), //
		PRODUCT_DOC("成品逕行出口核准文號"), //
		EXTEND_DOC("核准展延日期及核准文號"), //
		APPROVE_TIME("核准期限"), //
		MEMO("其他"), //
		BF_NO("監管編號"), //
		CTM_CODE("客戶代碼"), //
		SERIAL_NO("ORDERBY"), //
		COCOMP_NAME("null"), //
		CTM_ADD("null"), //
		VAT("null"), //
		GOODS_TYPE("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String outDate;
	private String declNo;
	private String goodsDesc;
	private String goodsBrand;
	private String goodsSpec;
	private String commodityNo;
	private String goodsUnit;
	private BigDecimal totalQty;
	private BigDecimal materialinQty;
	private BigDecimal materialtaxQty;
	private BigDecimal productinQty;
	private BigDecimal productoutQty;
	private BigDecimal producttaxQty;
	private BigDecimal scrpQty;
	private BigDecimal verifyUnit;
	private BigDecimal verifyQty;
	private BigDecimal balanceQty;
	private String outDoc;
	private String bomNo;
	private String scrapDoc;
	private String productDoc;
	private String extendDoc;
	private String approveTime;
	private String memo;
	private String bfNo;
	private String ctmCode;
	private BigDecimal serialNo;
	private String cocompName;
	private String ctmAdd;
	private String vat;
	private String goodsType;

	@Override
	public String getOutDate() {
		return this.outDate;
	}
 
	@Override
	public void setOutDate(final String outDate) {
		this.outDate = outDate; 
	}
 
	@Override
	public String getDeclNo() {
		return this.declNo;
	}
 
	@Override
	public void setDeclNo(final String declNo) {
		this.declNo = declNo; 
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
	public String getGoodsBrand() {
		return this.goodsBrand;
	}
 
	@Override
	public void setGoodsBrand(final String goodsBrand) {
		this.goodsBrand = goodsBrand; 
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
	public String getCommodityNo() {
		return this.commodityNo;
	}
 
	@Override
	public void setCommodityNo(final String commodityNo) {
		this.commodityNo = commodityNo; 
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
	public BigDecimal getTotalQty() {
		return this.totalQty;
	}
 
	@Override
	public void setTotalQty(final BigDecimal totalQty) {
		this.totalQty = totalQty; 
	}
 
	@Override
	public BigDecimal getMaterialinQty() {
		return this.materialinQty;
	}
 
	@Override
	public void setMaterialinQty(final BigDecimal materialinQty) {
		this.materialinQty = materialinQty; 
	}
 
	@Override
	public BigDecimal getMaterialtaxQty() {
		return this.materialtaxQty;
	}
 
	@Override
	public void setMaterialtaxQty(final BigDecimal materialtaxQty) {
		this.materialtaxQty = materialtaxQty; 
	}
 
	@Override
	public BigDecimal getProductinQty() {
		return this.productinQty;
	}
 
	@Override
	public void setProductinQty(final BigDecimal productinQty) {
		this.productinQty = productinQty; 
	}
 
	@Override
	public BigDecimal getProductoutQty() {
		return this.productoutQty;
	}
 
	@Override
	public void setProductoutQty(final BigDecimal productoutQty) {
		this.productoutQty = productoutQty; 
	}
 
	@Override
	public BigDecimal getProducttaxQty() {
		return this.producttaxQty;
	}
 
	@Override
	public void setProducttaxQty(final BigDecimal producttaxQty) {
		this.producttaxQty = producttaxQty; 
	}
 
	@Override
	public BigDecimal getScrpQty() {
		return this.scrpQty;
	}
 
	@Override
	public void setScrpQty(final BigDecimal scrpQty) {
		this.scrpQty = scrpQty; 
	}
 
	@Override
	public BigDecimal getVerifyUnit() {
		return this.verifyUnit;
	}
 
	@Override
	public void setVerifyUnit(final BigDecimal verifyUnit) {
		this.verifyUnit = verifyUnit; 
	}
 
	@Override
	public BigDecimal getVerifyQty() {
		return this.verifyQty;
	}
 
	@Override
	public void setVerifyQty(final BigDecimal verifyQty) {
		this.verifyQty = verifyQty; 
	}
 
	@Override
	public BigDecimal getBalanceQty() {
		return this.balanceQty;
	}
 
	@Override
	public void setBalanceQty(final BigDecimal balanceQty) {
		this.balanceQty = balanceQty; 
	}
 
	@Override
	public String getOutDoc() {
		return this.outDoc;
	}
 
	@Override
	public void setOutDoc(final String outDoc) {
		this.outDoc = outDoc; 
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
	public String getScrapDoc() {
		return this.scrapDoc;
	}
 
	@Override
	public void setScrapDoc(final String scrapDoc) {
		this.scrapDoc = scrapDoc; 
	}
 
	@Override
	public String getProductDoc() {
		return this.productDoc;
	}
 
	@Override
	public void setProductDoc(final String productDoc) {
		this.productDoc = productDoc; 
	}
 
	@Override
	public String getExtendDoc() {
		return this.extendDoc;
	}
 
	@Override
	public void setExtendDoc(final String extendDoc) {
		this.extendDoc = extendDoc; 
	}
 
	@Override
	public String getApproveTime() {
		return this.approveTime;
	}
 
	@Override
	public void setApproveTime(final String approveTime) {
		this.approveTime = approveTime; 
	}
 
	@Override
	public String getMemo() {
		return this.memo;
	}
 
	@Override
	public void setMemo(final String memo) {
		this.memo = memo; 
	}
 
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
	public BigDecimal getSerialNo() {
		return this.serialNo;
	}
 
	@Override
	public void setSerialNo(final BigDecimal serialNo) {
		this.serialNo = serialNo; 
	}
 
	@Override
	public String getCocompName() {
		return this.cocompName;
	}
 
	@Override
	public void setCocompName(final String cocompName) {
		this.cocompName = cocompName; 
	}
 
	@Override
	public String getCtmAdd() {
		return this.ctmAdd;
	}
 
	@Override
	public void setCtmAdd(final String ctmAdd) {
		this.ctmAdd = ctmAdd; 
	}
 
	@Override
	public String getVat() {
		return this.vat;
	}
 
	@Override
	public void setVat(final String vat) {
		this.vat = vat; 
	}
 
	@Override
	public String getGoodsType() {
		return this.goodsType;
	}
 
	@Override
	public void setGoodsType(final String goodsType) {
		this.goodsType = goodsType; 
	}
 
}
