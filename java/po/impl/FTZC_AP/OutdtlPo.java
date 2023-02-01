package com.doc.common.po.impl; 
 
public class OutdtlPo implements IOutdtlPo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		OUT_NO("出倉單號"), //
		OUT_ITEM_NO("出倉項次"), //
		DECL_TYPE("出倉報單類別"), //
		DECL_NO("出倉報單號碼"), //
		ITEM_NO("出倉報單項次"), //
		DUTY_TYPE("納稅辦法"), //
		STAT_MODE("統計方式"), //
		COMMODITY_NO("出倉料號"), //
		GOODS_QTY("出倉數量"), //
		GOODS_UNIT("出倉單位"), //
		OUT_STORAGE_AREA("出倉儲位"), //
		OUT_DATE("出倉日期"), //
		GOODS_DESC("貨名"), //
		GOODS_MODEL("型號"), //
		GOODS_SPEC("規格"), //
		CUR("幣別"), //
		GOODS_UNIT_PRICE("單價"), //
		DUTY_RATE("進口稅率"), //
		CUSTOM_VALUE_AMT("完稅價格"), //
		CCC_CODE("稅則號列"), //
		VERIFY_STATUS("庫存核銷狀態"), //
		FTZ_NO("運送單號"), //
		FTZ_ITEM("運送單項次"), //
		MN_NO("按月彙報彙報單號(報成一張報單的號碼)"), //
		MN_DECL_TYPE("按月彙報報單類別"), //
		MN_DECL_NO("按月彙報申報報單號碼(使用者填入的報單號碼)"), //
		MN_SEQ_NO("按月彙報彙總單序號"), //
		MN_MARK("按月彙報註記:M:進出倉完畢;G:GROUP彙總完畢;C:CONFIRMED報單資訊確認完畢"), //
		DOC_PERMIT_NO("展延文號"), //
		DOC_PERMIT_DATE("展延期限"), //
		DOC_PERMIT_MARK("逾期註記"), //
		TOTAL_OUT_QTY("已出倉數量(含分批加總)"), //
		SPLIT_MARK("分批註記"), //
		EDIT_MARK("允許修改註記"), //
		TRANS_ID("null"), //
		OP_CODE("出倉明細作業類別"), //
		USER_ID("使用者代碼"), //
		REMARK("客戶備註欄位"), //
		NET_WEIGHT("淨重"), //
		O_DECL_NO("庫存單號"), //
		O_ITEM_NO("庫存單號項次"), //
		O_OP_CODE("庫存作業類別"), //
		GUID("GLOBALLY UNIQUE IDENTIFIER"), //
		O_IN_GUID("庫存對應到的GUID"), //
		BAL_MARK("滯外帳註記"), //
		REF_DOC_DATE("進出倉參考文件日期"), //
		REF_DOC_NO("進出倉參考文件號碼
"), //
		REF_DOC_VER("進出倉參考文件版本"), //
		MN_GROUP_DATE("彙總日期"), //
		GOODS_CODE("貨物性質(1:機器設備;2:營運貨物)"), //
		PGM_REMARK("更新資料程式"), //
		DECL_SEQ_NO("報單序號(5205使用)") //
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
	private String outNo;
	private BigDecimal outItemNo;
	private String declType;
	private String declNo;
	private BigDecimal itemNo;
	private String dutyType;
	private String statMode;
	private String commodityNo;
	private BigDecimal goodsQty;
	private String goodsUnit;
	private String outStorageArea;
	private String outDate;
	private String goodsDesc;
	private String goodsModel;
	private String goodsSpec;
	private String cur;
	private BigDecimal goodsUnitPrice;
	private BigDecimal dutyRate;
	private BigDecimal customValueAmt;
	private String cccCode;
	private String verifyStatus;
	private String ftzNo;
	private BigDecimal ftzItem;
	private String mnNo;
	private String mnDeclType;
	private String mnDeclNo;
	private BigDecimal mnSeqNo;
	private String mnMark;
	private String docPermitNo;
	private String docPermitDate;
	private String docPermitMark;
	private BigDecimal totalOutQty;
	private String splitMark;
	private String editMark;
	private String transId;
	private String opCode;
	private String userId;
	private String remark;
	private BigDecimal netWeight;
	private String oDeclNo;
	private BigDecimal oItemNo;
	private String oOpCode;
	private String guid;
	private String oInGuid;
	private String balMark;
	private String refDocDate;
	private String refDocNo;
	private String refDocVer;
	private String mnGroupDate;
	private String goodsCode;
	private String pgmRemark;
	private BigDecimal declSeqNo;

	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
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
	public BigDecimal getOutItemNo() {
		return this.outItemNo;
	}
 
	@Override
	public void setOutItemNo(final BigDecimal outItemNo) {
		this.outItemNo = outItemNo; 
	}
 
	@Override
	public String getDeclType() {
		return this.declType;
	}
 
	@Override
	public void setDeclType(final String declType) {
		this.declType = declType; 
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
	public BigDecimal getItemNo() {
		return this.itemNo;
	}
 
	@Override
	public void setItemNo(final BigDecimal itemNo) {
		this.itemNo = itemNo; 
	}
 
	@Override
	public String getDutyType() {
		return this.dutyType;
	}
 
	@Override
	public void setDutyType(final String dutyType) {
		this.dutyType = dutyType; 
	}
 
	@Override
	public String getStatMode() {
		return this.statMode;
	}
 
	@Override
	public void setStatMode(final String statMode) {
		this.statMode = statMode; 
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
	public String getOutStorageArea() {
		return this.outStorageArea;
	}
 
	@Override
	public void setOutStorageArea(final String outStorageArea) {
		this.outStorageArea = outStorageArea; 
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
	public String getCur() {
		return this.cur;
	}
 
	@Override
	public void setCur(final String cur) {
		this.cur = cur; 
	}
 
	@Override
	public BigDecimal getGoodsUnitPrice() {
		return this.goodsUnitPrice;
	}
 
	@Override
	public void setGoodsUnitPrice(final BigDecimal goodsUnitPrice) {
		this.goodsUnitPrice = goodsUnitPrice; 
	}
 
	@Override
	public BigDecimal getDutyRate() {
		return this.dutyRate;
	}
 
	@Override
	public void setDutyRate(final BigDecimal dutyRate) {
		this.dutyRate = dutyRate; 
	}
 
	@Override
	public BigDecimal getCustomValueAmt() {
		return this.customValueAmt;
	}
 
	@Override
	public void setCustomValueAmt(final BigDecimal customValueAmt) {
		this.customValueAmt = customValueAmt; 
	}
 
	@Override
	public String getCccCode() {
		return this.cccCode;
	}
 
	@Override
	public void setCccCode(final String cccCode) {
		this.cccCode = cccCode; 
	}
 
	@Override
	public String getVerifyStatus() {
		return this.verifyStatus;
	}
 
	@Override
	public void setVerifyStatus(final String verifyStatus) {
		this.verifyStatus = verifyStatus; 
	}
 
	@Override
	public String getFtzNo() {
		return this.ftzNo;
	}
 
	@Override
	public void setFtzNo(final String ftzNo) {
		this.ftzNo = ftzNo; 
	}
 
	@Override
	public BigDecimal getFtzItem() {
		return this.ftzItem;
	}
 
	@Override
	public void setFtzItem(final BigDecimal ftzItem) {
		this.ftzItem = ftzItem; 
	}
 
	@Override
	public String getMnNo() {
		return this.mnNo;
	}
 
	@Override
	public void setMnNo(final String mnNo) {
		this.mnNo = mnNo; 
	}
 
	@Override
	public String getMnDeclType() {
		return this.mnDeclType;
	}
 
	@Override
	public void setMnDeclType(final String mnDeclType) {
		this.mnDeclType = mnDeclType; 
	}
 
	@Override
	public String getMnDeclNo() {
		return this.mnDeclNo;
	}
 
	@Override
	public void setMnDeclNo(final String mnDeclNo) {
		this.mnDeclNo = mnDeclNo; 
	}
 
	@Override
	public BigDecimal getMnSeqNo() {
		return this.mnSeqNo;
	}
 
	@Override
	public void setMnSeqNo(final BigDecimal mnSeqNo) {
		this.mnSeqNo = mnSeqNo; 
	}
 
	@Override
	public String getMnMark() {
		return this.mnMark;
	}
 
	@Override
	public void setMnMark(final String mnMark) {
		this.mnMark = mnMark; 
	}
 
	@Override
	public String getDocPermitNo() {
		return this.docPermitNo;
	}
 
	@Override
	public void setDocPermitNo(final String docPermitNo) {
		this.docPermitNo = docPermitNo; 
	}
 
	@Override
	public String getDocPermitDate() {
		return this.docPermitDate;
	}
 
	@Override
	public void setDocPermitDate(final String docPermitDate) {
		this.docPermitDate = docPermitDate; 
	}
 
	@Override
	public String getDocPermitMark() {
		return this.docPermitMark;
	}
 
	@Override
	public void setDocPermitMark(final String docPermitMark) {
		this.docPermitMark = docPermitMark; 
	}
 
	@Override
	public BigDecimal getTotalOutQty() {
		return this.totalOutQty;
	}
 
	@Override
	public void setTotalOutQty(final BigDecimal totalOutQty) {
		this.totalOutQty = totalOutQty; 
	}
 
	@Override
	public String getSplitMark() {
		return this.splitMark;
	}
 
	@Override
	public void setSplitMark(final String splitMark) {
		this.splitMark = splitMark; 
	}
 
	@Override
	public String getEditMark() {
		return this.editMark;
	}
 
	@Override
	public void setEditMark(final String editMark) {
		this.editMark = editMark; 
	}
 
	@Override
	public String getTransId() {
		return this.transId;
	}
 
	@Override
	public void setTransId(final String transId) {
		this.transId = transId; 
	}
 
	@Override
	public String getOpCode() {
		return this.opCode;
	}
 
	@Override
	public void setOpCode(final String opCode) {
		this.opCode = opCode; 
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
	public String getRemark() {
		return this.remark;
	}
 
	@Override
	public void setRemark(final String remark) {
		this.remark = remark; 
	}
 
	@Override
	public BigDecimal getNetWeight() {
		return this.netWeight;
	}
 
	@Override
	public void setNetWeight(final BigDecimal netWeight) {
		this.netWeight = netWeight; 
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
	public String getOOpCode() {
		return this.oOpCode;
	}
 
	@Override
	public void setOOpCode(final String oOpCode) {
		this.oOpCode = oOpCode; 
	}
 
	@Override
	public String getGuid() {
		return this.guid;
	}
 
	@Override
	public void setGuid(final String guid) {
		this.guid = guid; 
	}
 
	@Override
	public String getOInGuid() {
		return this.oInGuid;
	}
 
	@Override
	public void setOInGuid(final String oInGuid) {
		this.oInGuid = oInGuid; 
	}
 
	@Override
	public String getBalMark() {
		return this.balMark;
	}
 
	@Override
	public void setBalMark(final String balMark) {
		this.balMark = balMark; 
	}
 
	@Override
	public String getRefDocDate() {
		return this.refDocDate;
	}
 
	@Override
	public void setRefDocDate(final String refDocDate) {
		this.refDocDate = refDocDate; 
	}
 
	@Override
	public String getRefDocNo() {
		return this.refDocNo;
	}
 
	@Override
	public void setRefDocNo(final String refDocNo) {
		this.refDocNo = refDocNo; 
	}
 
	@Override
	public String getRefDocVer() {
		return this.refDocVer;
	}
 
	@Override
	public void setRefDocVer(final String refDocVer) {
		this.refDocVer = refDocVer; 
	}
 
	@Override
	public String getMnGroupDate() {
		return this.mnGroupDate;
	}
 
	@Override
	public void setMnGroupDate(final String mnGroupDate) {
		this.mnGroupDate = mnGroupDate; 
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
	public String getPgmRemark() {
		return this.pgmRemark;
	}
 
	@Override
	public void setPgmRemark(final String pgmRemark) {
		this.pgmRemark = pgmRemark; 
	}
 
	@Override
	public BigDecimal getDeclSeqNo() {
		return this.declSeqNo;
	}
 
	@Override
	public void setDeclSeqNo(final BigDecimal declSeqNo) {
		this.declSeqNo = declSeqNo; 
	}
 
}
