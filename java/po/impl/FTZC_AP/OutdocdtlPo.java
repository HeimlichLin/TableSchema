package com.doc.common.po.impl; 
 
public class OutdocdtlPo implements IOutdocdtlPo {
 
	public enum COLUMNS {
		DOC_NO("文件單號"), //
		BF_NO("監管編號"), //
		DOC_ITEM("此文件項次"), //
		COMMODITY_NO("出倉貨物料號"), //
		GOOD_UNIT("出倉貨物單位"), //
		GOOD_QTY("出倉貨物數量"), //
		VERIFY_QTY("出倉貨物已核銷數量"), //
		OUT_NO("出倉單號"), //
		OUT_ITEM("出倉項次"), //
		OUT_DATE("出倉日期"), //
		IN_STORAGE_AREA("儲位"), //
		O_DECL_NO("原報單號碼"), //
		O_DECL_ITEM("原報單項次"), //
		O_DECL_TYPE("原報單作業類別"), //
		CTM_CODE("客戶代碼"), //
		GOODS_CODE("貨物性質(1:機器設備;2:營運貨物)"), //
		DOC_TYPE("文件類別:加工單(P)、拆料單(R)、維修單、檢測單(T)、報廢單(S)"), //
		PARENT_NO("該筆資料的PARENT_NO"), //
		PARENT_ITEN("該筆資料的PARENT_ITEM"), //
		PARENT_COMMODITY_NO("該筆資料的PARENT_料號"), //
		PARENT("是否有父類別關係"), //
		O_OP_CODE("庫存作業類別"), //
		REMARK1("null"), //
		OUT_GUID("null"), //
		CREATE_DATE("記錄RECORD時間"), //
		BACK_QTY("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String docNo;
	private String bfNo;
	private BigDecimal docItem;
	private String commodityNo;
	private String goodUnit;
	private BigDecimal goodQty;
	private BigDecimal verifyQty;
	private String outNo;
	private String outItem;
	private String outDate;
	private String inStorageArea;
	private String oDeclNo;
	private String oDeclItem;
	private String oDeclType;
	private String ctmCode;
	private String goodsCode;
	private String docType;
	private String parentNo;
	private String parentIten;
	private String parentCommodityNo;
	private String parent;
	private String oOpCode;
	private String remark1;
	private String outGuid;
	private String createDate;
	private BigDecimal backQty;

	@Override
	public String getDocNo() {
		return this.docNo;
	}
 
	@Override
	public void setDocNo(final String docNo) {
		this.docNo = docNo; 
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
	public BigDecimal getDocItem() {
		return this.docItem;
	}
 
	@Override
	public void setDocItem(final BigDecimal docItem) {
		this.docItem = docItem; 
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
	public BigDecimal getGoodQty() {
		return this.goodQty;
	}
 
	@Override
	public void setGoodQty(final BigDecimal goodQty) {
		this.goodQty = goodQty; 
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
	public String getOutNo() {
		return this.outNo;
	}
 
	@Override
	public void setOutNo(final String outNo) {
		this.outNo = outNo; 
	}
 
	@Override
	public String getOutItem() {
		return this.outItem;
	}
 
	@Override
	public void setOutItem(final String outItem) {
		this.outItem = outItem; 
	}
 
	@Override
	public String getOutDate() {
		return this.outDate;
	}
 
	@Override
	public void setOutDate(final String outDate) {
		this.outDate = outDate; 
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
	public String getODeclNo() {
		return this.oDeclNo;
	}
 
	@Override
	public void setODeclNo(final String oDeclNo) {
		this.oDeclNo = oDeclNo; 
	}
 
	@Override
	public String getODeclItem() {
		return this.oDeclItem;
	}
 
	@Override
	public void setODeclItem(final String oDeclItem) {
		this.oDeclItem = oDeclItem; 
	}
 
	@Override
	public String getODeclType() {
		return this.oDeclType;
	}
 
	@Override
	public void setODeclType(final String oDeclType) {
		this.oDeclType = oDeclType; 
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
	public String getGoodsCode() {
		return this.goodsCode;
	}
 
	@Override
	public void setGoodsCode(final String goodsCode) {
		this.goodsCode = goodsCode; 
	}
 
	@Override
	public String getDocType() {
		return this.docType;
	}
 
	@Override
	public void setDocType(final String docType) {
		this.docType = docType; 
	}
 
	@Override
	public String getParentNo() {
		return this.parentNo;
	}
 
	@Override
	public void setParentNo(final String parentNo) {
		this.parentNo = parentNo; 
	}
 
	@Override
	public String getParentIten() {
		return this.parentIten;
	}
 
	@Override
	public void setParentIten(final String parentIten) {
		this.parentIten = parentIten; 
	}
 
	@Override
	public String getParentCommodityNo() {
		return this.parentCommodityNo;
	}
 
	@Override
	public void setParentCommodityNo(final String parentCommodityNo) {
		this.parentCommodityNo = parentCommodityNo; 
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
	public String getOOpCode() {
		return this.oOpCode;
	}
 
	@Override
	public void setOOpCode(final String oOpCode) {
		this.oOpCode = oOpCode; 
	}
 
	@Override
	public String getRemark1() {
		return this.remark1;
	}
 
	@Override
	public void setRemark1(final String remark1) {
		this.remark1 = remark1; 
	}
 
	@Override
	public String getOutGuid() {
		return this.outGuid;
	}
 
	@Override
	public void setOutGuid(final String outGuid) {
		this.outGuid = outGuid; 
	}
 
	@Override
	public String getCreateDate() {
		return this.createDate;
	}
 
	@Override
	public void setCreateDate(final String createDate) {
		this.createDate = createDate; 
	}
 
	@Override
	public BigDecimal getBackQty() {
		return this.backQty;
	}
 
	@Override
	public void setBackQty(final BigDecimal backQty) {
		this.backQty = backQty; 
	}
 
}
