package com.doc.common.po.impl; 
 
public class IndtlPo implements IIndtlPo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		IN_DATE("進倉日期"), //
		IN_NO("進倉單號"), //
		IN_ITEM_NO("進倉項次"), //
		DECL_TYPE("進倉報單類別"), //
		DECL_NO("進倉報單號碼"), //
		ITEM_NO("進倉報單項次"), //
		DUTY_TYPE("納稅辦法"), //
		STAT_MODE("統計方式"), //
		COMMODITY_NO("進倉料號"), //
		GOODS_QTY("進倉數量"), //
		GOODS_UNIT("進倉單位"), //
		IN_STORAGE_AREA("進倉儲位"), //
		GOODS_CODE("貨物性質(1:機器設備;2:營運貨物)"), //
		GOODS_DESC("貨名"), //
		GOODS_MODEL("型號"), //
		GOODS_SPEC("規格"), //
		CUR("幣別"), //
		GOODS_UNIT_PRICE("單價"), //
		CUSTOM_VALUE_AMT("完稅價格"), //
		DUTY_RATE("進口稅率"), //
		DUTY_RATE1("貨物稅率(參考5105  C116)"), //
		CCC_CODE("稅則號列"), //
		TRADE_PRDT_NO("交易方料號"), //
		VERIFY_STATUS("庫存核銷狀態"), //
		FTZ_NO("運送單號"), //
		FTZ_ITEM("運送單項次"), //
		CN_TYPE("大陸帳"), //
		USER_ID("使用者代碼"), //
		MN_NO("按月彙報彙總單號"), //
		MN_DECL_TYPE("按月彙報報單類別"), //
		MN_DECL_NO("按月彙報申報報單號碼"), //
		MN_SEQ_NO("按月彙報彙總單序號"), //
		MN_MARK("按月彙報註記:M:進出倉完畢;G:GROUP彙總完畢;C:CONFIRMED報單資訊確認完畢"), //
		REMARK("客戶備註欄位"), //
		BOM_NO("進倉參考用料清表單號"), //
		BOM_VER("進倉參考用料清表版本"), //
		SPLIT_MARK("分批註記"), //
		EDIT_MARK("允許修改註記"), //
		TOTAL_IN_QTY("已進倉數量(含分批加總)"), //
		CURRENT_QTY("現有庫存量"), //
		ONLINE_QTY("生產線上數量"), //
		PRDT_MARK("在製品註記"), //
		TRANS_ID("交易ID"), //
		OP_CODE("進倉作業類別"), //
		IN_STATUS("進倉狀態"), //
		O_DECL_NO("原報單號碼"), //
		O_ITEM_NO("原報單項次"), //
		NET_WEIGHT("淨重"), //
		O_OP_CODE("原作業類別"), //
		GUID("GLOBALLY UNIQUE IDENTIFIER"), //
		O_OUT_GUID("區內進倉作業紀錄上次出倉的資訊"), //
		REF_DOC_DATE("進出倉參考文件日期"), //
		REF_DOC_NO("進出倉參考文件號碼
"), //
		REF_DOC_VER("進出倉參考文件版本"), //
		MN_GROUP_DATE("彙總日期"), //
		PGM_REMARK("更新資料程式"), //
		DEDUCTED_MARK("除帳註記 (ex.自用機器滿五年除帳)"), //
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
	private String inDate;
	private String inNo;
	private BigDecimal inItemNo;
	private String declType;
	private String declNo;
	private BigDecimal itemNo;
	private String dutyType;
	private String statMode;
	private String commodityNo;
	private BigDecimal goodsQty;
	private String goodsUnit;
	private String inStorageArea;
	private String goodsCode;
	private String goodsDesc;
	private String goodsModel;
	private String goodsSpec;
	private String cur;
	private BigDecimal goodsUnitPrice;
	private BigDecimal customValueAmt;
	private BigDecimal dutyRate;
	private BigDecimal dutyRate1;
	private String cccCode;
	private String tradePrdtNo;
	private String verifyStatus;
	private String ftzNo;
	private String ftzItem;
	private String cnType;
	private String userId;
	private String mnNo;
	private String mnDeclType;
	private String mnDeclNo;
	private BigDecimal mnSeqNo;
	private String mnMark;
	private String remark;
	private String bomNo;
	private String bomVer;
	private String splitMark;
	private String editMark;
	private BigDecimal totalInQty;
	private BigDecimal currentQty;
	private BigDecimal onlineQty;
	private String prdtMark;
	private String transId;
	private String opCode;
	private String inStatus;
	private String oDeclNo;
	private BigDecimal oItemNo;
	private BigDecimal netWeight;
	private String oOpCode;
	private String guid;
	private String oOutGuid;
	private String refDocDate;
	private String refDocNo;
	private String refDocVer;
	private String mnGroupDate;
	private String pgmRemark;
	private String deductedMark;
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
	public String getInDate() {
		return this.inDate;
	}
 
	@Override
	public void setInDate(final String inDate) {
		this.inDate = inDate; 
	}
 
	@Override
	public String getInNo() {
		return this.inNo;
	}
 
	@Override
	public void setInNo(final String inNo) {
		this.inNo = inNo; 
	}
 
	@Override
	public BigDecimal getInItemNo() {
		return this.inItemNo;
	}
 
	@Override
	public void setInItemNo(final BigDecimal inItemNo) {
		this.inItemNo = inItemNo; 
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
	public String getInStorageArea() {
		return this.inStorageArea;
	}
 
	@Override
	public void setInStorageArea(final String inStorageArea) {
		this.inStorageArea = inStorageArea; 
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
	public BigDecimal getCustomValueAmt() {
		return this.customValueAmt;
	}
 
	@Override
	public void setCustomValueAmt(final BigDecimal customValueAmt) {
		this.customValueAmt = customValueAmt; 
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
	public BigDecimal getDutyRate1() {
		return this.dutyRate1;
	}
 
	@Override
	public void setDutyRate1(final BigDecimal dutyRate1) {
		this.dutyRate1 = dutyRate1; 
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
	public String getTradePrdtNo() {
		return this.tradePrdtNo;
	}
 
	@Override
	public void setTradePrdtNo(final String tradePrdtNo) {
		this.tradePrdtNo = tradePrdtNo; 
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
	public String getFtzItem() {
		return this.ftzItem;
	}
 
	@Override
	public void setFtzItem(final String ftzItem) {
		this.ftzItem = ftzItem; 
	}
 
	@Override
	public String getCnType() {
		return this.cnType;
	}
 
	@Override
	public void setCnType(final String cnType) {
		this.cnType = cnType; 
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
	public String getBomVer() {
		return this.bomVer;
	}
 
	@Override
	public void setBomVer(final String bomVer) {
		this.bomVer = bomVer; 
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
	public BigDecimal getTotalInQty() {
		return this.totalInQty;
	}
 
	@Override
	public void setTotalInQty(final BigDecimal totalInQty) {
		this.totalInQty = totalInQty; 
	}
 
	@Override
	public BigDecimal getCurrentQty() {
		return this.currentQty;
	}
 
	@Override
	public void setCurrentQty(final BigDecimal currentQty) {
		this.currentQty = currentQty; 
	}
 
	@Override
	public BigDecimal getOnlineQty() {
		return this.onlineQty;
	}
 
	@Override
	public void setOnlineQty(final BigDecimal onlineQty) {
		this.onlineQty = onlineQty; 
	}
 
	@Override
	public String getPrdtMark() {
		return this.prdtMark;
	}
 
	@Override
	public void setPrdtMark(final String prdtMark) {
		this.prdtMark = prdtMark; 
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
	public String getInStatus() {
		return this.inStatus;
	}
 
	@Override
	public void setInStatus(final String inStatus) {
		this.inStatus = inStatus; 
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
	public BigDecimal getNetWeight() {
		return this.netWeight;
	}
 
	@Override
	public void setNetWeight(final BigDecimal netWeight) {
		this.netWeight = netWeight; 
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
	public String getOOutGuid() {
		return this.oOutGuid;
	}
 
	@Override
	public void setOOutGuid(final String oOutGuid) {
		this.oOutGuid = oOutGuid; 
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
	public String getPgmRemark() {
		return this.pgmRemark;
	}
 
	@Override
	public void setPgmRemark(final String pgmRemark) {
		this.pgmRemark = pgmRemark; 
	}
 
	@Override
	public String getDeductedMark() {
		return this.deductedMark;
	}
 
	@Override
	public void setDeductedMark(final String deductedMark) {
		this.deductedMark = deductedMark; 
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
