package com.doc.common.po.impl; 
 
public class L5T1Po implements IL5T1Po {
 
	public enum COLUMNS {
		BF_NO("null"), //
		MSG_FUN("null"), //
		DECL_NO("null"), //
		ITEM_NO("null"), //
		DECL_TYPE("null"), //
		PRDT_NO("null"), //
		QTY("null"), //
		POST("null"), //
		DUTY_TYPE("null"), //
		O_DECL_NO("null"), //
		O_ITEM_NO("null"), //
		O_DECL_TYPE("null"), //
		O_PRDT_NO("null"), //
		O_QTY("null"), //
		O_POST("null"), //
		O_DUTY_TYPE("null"), //
		OUT_STATUS("null"), //
		F4_DATE("null"), //
		F2_DATE("null"), //
		UNIT("null"), //
		F2_UNIT("null"), //
		BOM_QTY("null"), //
		SERIAL_NO("null"), //
		UNCLEAR_QTY("null"), //
		REF_BILL_NO("null"), //
		ITEM("null"), //
		O_REF_BILL_NO("null"), //
		O_ITEM("null"), //
		CTM_CODE("null"), //
		CONFIRM_DATE("null"), //
		O_BF_NO("null"), //
		CO_BF_NO("null"), //
		O_O_DECL_NO("null"), //
		O_O_ITEM_NO("null"), //
		O_O_PRDT_NO("null"), //
		CONTROL_NO("null"), //
		VERSION("null"), //
		SEQ_NO("null"), //
		I_CONFIRMED("null"), //
		O_PRDT_NO_QTY("null") //
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
	private String msgFun;
	private String declNo;
	private BigDecimal itemNo;
	private String declType;
	private String prdtNo;
	private BigDecimal qty;
	private String post;
	private String dutyType;
	private String oDeclNo;
	private BigDecimal oItemNo;
	private String oDeclType;
	private String oPrdtNo;
	private BigDecimal oQty;
	private String oPost;
	private String oDutyType;
	private String outStatus;
	private String f4Date;
	private String f2Date;
	private String unit;
	private String f2Unit;
	private BigDecimal bomQty;
	private BigDecimal serialNo;
	private BigDecimal unclearQty;
	private String refBillNo;
	private BigDecimal item;
	private String oRefBillNo;
	private BigDecimal oItem;
	private String ctmCode;
	private String confirmDate;
	private String oBfNo;
	private String coBfNo;
	private String oODeclNo;
	private BigDecimal oOItemNo;
	private String oOPrdtNo;
	private String controlNo;
	private BigDecimal version;
	private BigDecimal seqNo;
	private String iConfirmed;
	private BigDecimal oPrdtNoQty;

	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
	}
 
	@Override
	public String getMsgFun() {
		return this.msgFun;
	}
 
	@Override
	public void setMsgFun(final String msgFun) {
		this.msgFun = msgFun; 
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
	public String getDeclType() {
		return this.declType;
	}
 
	@Override
	public void setDeclType(final String declType) {
		this.declType = declType; 
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
	public BigDecimal getQty() {
		return this.qty;
	}
 
	@Override
	public void setQty(final BigDecimal qty) {
		this.qty = qty; 
	}
 
	@Override
	public String getPost() {
		return this.post;
	}
 
	@Override
	public void setPost(final String post) {
		this.post = post; 
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
	public String getODeclType() {
		return this.oDeclType;
	}
 
	@Override
	public void setODeclType(final String oDeclType) {
		this.oDeclType = oDeclType; 
	}
 
	@Override
	public String getOPrdtNo() {
		return this.oPrdtNo;
	}
 
	@Override
	public void setOPrdtNo(final String oPrdtNo) {
		this.oPrdtNo = oPrdtNo; 
	}
 
	@Override
	public BigDecimal getOQty() {
		return this.oQty;
	}
 
	@Override
	public void setOQty(final BigDecimal oQty) {
		this.oQty = oQty; 
	}
 
	@Override
	public String getOPost() {
		return this.oPost;
	}
 
	@Override
	public void setOPost(final String oPost) {
		this.oPost = oPost; 
	}
 
	@Override
	public String getODutyType() {
		return this.oDutyType;
	}
 
	@Override
	public void setODutyType(final String oDutyType) {
		this.oDutyType = oDutyType; 
	}
 
	@Override
	public String getOutStatus() {
		return this.outStatus;
	}
 
	@Override
	public void setOutStatus(final String outStatus) {
		this.outStatus = outStatus; 
	}
 
	@Override
	public String getF4Date() {
		return this.f4Date;
	}
 
	@Override
	public void setF4Date(final String f4Date) {
		this.f4Date = f4Date; 
	}
 
	@Override
	public String getF2Date() {
		return this.f2Date;
	}
 
	@Override
	public void setF2Date(final String f2Date) {
		this.f2Date = f2Date; 
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
	public String getF2Unit() {
		return this.f2Unit;
	}
 
	@Override
	public void setF2Unit(final String f2Unit) {
		this.f2Unit = f2Unit; 
	}
 
	@Override
	public BigDecimal getBomQty() {
		return this.bomQty;
	}
 
	@Override
	public void setBomQty(final BigDecimal bomQty) {
		this.bomQty = bomQty; 
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
	public BigDecimal getUnclearQty() {
		return this.unclearQty;
	}
 
	@Override
	public void setUnclearQty(final BigDecimal unclearQty) {
		this.unclearQty = unclearQty; 
	}
 
	@Override
	public String getRefBillNo() {
		return this.refBillNo;
	}
 
	@Override
	public void setRefBillNo(final String refBillNo) {
		this.refBillNo = refBillNo; 
	}
 
	@Override
	public BigDecimal getItem() {
		return this.item;
	}
 
	@Override
	public void setItem(final BigDecimal item) {
		this.item = item; 
	}
 
	@Override
	public String getORefBillNo() {
		return this.oRefBillNo;
	}
 
	@Override
	public void setORefBillNo(final String oRefBillNo) {
		this.oRefBillNo = oRefBillNo; 
	}
 
	@Override
	public BigDecimal getOItem() {
		return this.oItem;
	}
 
	@Override
	public void setOItem(final BigDecimal oItem) {
		this.oItem = oItem; 
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
	public String getConfirmDate() {
		return this.confirmDate;
	}
 
	@Override
	public void setConfirmDate(final String confirmDate) {
		this.confirmDate = confirmDate; 
	}
 
	@Override
	public String getOBfNo() {
		return this.oBfNo;
	}
 
	@Override
	public void setOBfNo(final String oBfNo) {
		this.oBfNo = oBfNo; 
	}
 
	@Override
	public String getCoBfNo() {
		return this.coBfNo;
	}
 
	@Override
	public void setCoBfNo(final String coBfNo) {
		this.coBfNo = coBfNo; 
	}
 
	@Override
	public String getOODeclNo() {
		return this.oODeclNo;
	}
 
	@Override
	public void setOODeclNo(final String oODeclNo) {
		this.oODeclNo = oODeclNo; 
	}
 
	@Override
	public BigDecimal getOOItemNo() {
		return this.oOItemNo;
	}
 
	@Override
	public void setOOItemNo(final BigDecimal oOItemNo) {
		this.oOItemNo = oOItemNo; 
	}
 
	@Override
	public String getOOPrdtNo() {
		return this.oOPrdtNo;
	}
 
	@Override
	public void setOOPrdtNo(final String oOPrdtNo) {
		this.oOPrdtNo = oOPrdtNo; 
	}
 
	@Override
	public String getControlNo() {
		return this.controlNo;
	}
 
	@Override
	public void setControlNo(final String controlNo) {
		this.controlNo = controlNo; 
	}
 
	@Override
	public BigDecimal getVersion() {
		return this.version;
	}
 
	@Override
	public void setVersion(final BigDecimal version) {
		this.version = version; 
	}
 
	@Override
	public BigDecimal getSeqNo() {
		return this.seqNo;
	}
 
	@Override
	public void setSeqNo(final BigDecimal seqNo) {
		this.seqNo = seqNo; 
	}
 
	@Override
	public String getIConfirmed() {
		return this.iConfirmed;
	}
 
	@Override
	public void setIConfirmed(final String iConfirmed) {
		this.iConfirmed = iConfirmed; 
	}
 
	@Override
	public BigDecimal getOPrdtNoQty() {
		return this.oPrdtNoQty;
	}
 
	@Override
	public void setOPrdtNoQty(final BigDecimal oPrdtNoQty) {
		this.oPrdtNoQty = oPrdtNoQty; 
	}
 
}
