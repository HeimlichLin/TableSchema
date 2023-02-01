package com.doc.common.po.impl; 
 
public class BomTMessgPo implements IBomTMessgPo {
 
	public enum COLUMNS {
		BOM_FILE("檔案名稱"), //
		MSG_TYPE("null"), //
		COCOMP_NO("協力廠商"), //
		CTM_CODE("客戶欄位(貨主)"), //
		BF_NO("監管編號"), //
		PROCESS("加工方式"), //
		BOM_DATE("用料清表日期"), //
		GOODS_TYPE("1成品2在製品(客戶參考欄位)"), //
		PRDT_NO("產品料號"), //
		PRDT_NAME("產品料名"), //
		PRDT_UNIT("產品單位"), //
		PART_NO("原料號碼"), //
		SERIAL_NO("檔案版本"), //
		PART_NAME("原料名稱"), //
		UNIT_QTY("單位用量"), //
		UNIT("單位"), //
		BEGIN_DATE("起始日期"), //
		END_DATE("結束日期"), //
		BOM_TYPE("1成品2在製品(客戶參考欄位)"), //
		PRDT_TYPE("產品類別"), //
		RECV_DATE("接收日期"), //
		ICONFIRMED("確認註記"), //
		BOM_NO("用料清表編號(系統唯一)"), //
		APPROVE_NO("核准文號"), //
		APPROVE_DATE("核准日期"), //
		SEQ_NO("建檔順序") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String bomFile;
	private String msgType;
	private String cocompNo;
	private String ctmCode;
	private String bfNo;
	private String process;
	private String bomDate;
	private String goodsType;
	private String prdtNo;
	private String prdtName;
	private String prdtUnit;
	private String partNo;
	private BigDecimal serialNo;
	private String partName;
	private BigDecimal unitQty;
	private String unit;
	private String beginDate;
	private String endDate;
	private String bomType;
	private String prdtType;
	private String recvDate;
	private String iconfirmed;
	private String bomNo;
	private String approveNo;
	private String approveDate;
	private BigDecimal seqNo;

	@Override
	public String getBomFile() {
		return this.bomFile;
	}
 
	@Override
	public void setBomFile(final String bomFile) {
		this.bomFile = bomFile; 
	}
 
	@Override
	public String getMsgType() {
		return this.msgType;
	}
 
	@Override
	public void setMsgType(final String msgType) {
		this.msgType = msgType; 
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
	public String getCtmCode() {
		return this.ctmCode;
	}
 
	@Override
	public void setCtmCode(final String ctmCode) {
		this.ctmCode = ctmCode; 
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
	public String getProcess() {
		return this.process;
	}
 
	@Override
	public void setProcess(final String process) {
		this.process = process; 
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
	public String getGoodsType() {
		return this.goodsType;
	}
 
	@Override
	public void setGoodsType(final String goodsType) {
		this.goodsType = goodsType; 
	}
 
	@Override
	public String getPrdtNo() {
		return this.prdtNo;
	}
 
	@Override
	public void setPrdtNo(final String prdtNo) {
		this.prdtNo = prdtNo; 
	}
 
	@Override
	public String getPrdtName() {
		return this.prdtName;
	}
 
	@Override
	public void setPrdtName(final String prdtName) {
		this.prdtName = prdtName; 
	}
 
	@Override
	public String getPrdtUnit() {
		return this.prdtUnit;
	}
 
	@Override
	public void setPrdtUnit(final String prdtUnit) {
		this.prdtUnit = prdtUnit; 
	}
 
	@Override
	public String getPartNo() {
		return this.partNo;
	}
 
	@Override
	public void setPartNo(final String partNo) {
		this.partNo = partNo; 
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
	public String getPartName() {
		return this.partName;
	}
 
	@Override
	public void setPartName(final String partName) {
		this.partName = partName; 
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
	public String getUnit() {
		return this.unit;
	}
 
	@Override
	public void setUnit(final String unit) {
		this.unit = unit; 
	}
 
	@Override
	public String getBeginDate() {
		return this.beginDate;
	}
 
	@Override
	public void setBeginDate(final String beginDate) {
		this.beginDate = beginDate; 
	}
 
	@Override
	public String getEndDate() {
		return this.endDate;
	}
 
	@Override
	public void setEndDate(final String endDate) {
		this.endDate = endDate; 
	}
 
	@Override
	public String getBomType() {
		return this.bomType;
	}
 
	@Override
	public void setBomType(final String bomType) {
		this.bomType = bomType; 
	}
 
	@Override
	public String getPrdtType() {
		return this.prdtType;
	}
 
	@Override
	public void setPrdtType(final String prdtType) {
		this.prdtType = prdtType; 
	}
 
	@Override
	public String getRecvDate() {
		return this.recvDate;
	}
 
	@Override
	public void setRecvDate(final String recvDate) {
		this.recvDate = recvDate; 
	}
 
	@Override
	public String getIconfirmed() {
		return this.iconfirmed;
	}
 
	@Override
	public void setIconfirmed(final String iconfirmed) {
		this.iconfirmed = iconfirmed; 
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
	public String getApproveNo() {
		return this.approveNo;
	}
 
	@Override
	public void setApproveNo(final String approveNo) {
		this.approveNo = approveNo; 
	}
 
	@Override
	public String getApproveDate() {
		return this.approveDate;
	}
 
	@Override
	public void setApproveDate(final String approveDate) {
		this.approveDate = approveDate; 
	}
 
	@Override
	public BigDecimal getSeqNo() {
		return this.seqNo;
	}
 
	@Override
	public void setSeqNo(final BigDecimal seqNo) {
		this.seqNo = seqNo; 
	}
 
}
