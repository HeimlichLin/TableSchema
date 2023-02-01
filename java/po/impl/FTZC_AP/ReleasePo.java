package com.doc.common.po.impl; 
 
public class ReleasePo implements IReleasePo {
 
	public enum COLUMNS {
		BOX_NO("報關行箱號"), //
		DECL_TYPE("報單類別"), //
		DECL_NO("報單號碼"), //
		STG_PLACE("存放處所"), //
		RLS_TIME("放行時間"), //
		RLS_PKG("放行件數"), //
		PKG_UNIT("件數單位"), //
		G_WGT("總重量"), //
		EXTRACOND("放行附帶條件"), //
		VESSEL_SIGN("船舶呼號"), //
		VOYAGE_NO("航次"), //
		SHIP_CODE("船公司代碼"), //
		EXPORTER("貨主名稱"), //
		CLEAR_TYPE("通關方式"), //
		MSG_TYPE("訊息別"), //
		STR_TYPE("null"), //
		TRANS_ID("null"), //
		AS_TYPE("海空運別.S:海運.A:空運"), //
		IO_TYPE("進出口別.I:進口.O:出口"), //
		MAWB_NO("主提單號"), //
		HAWB_NO("分提單號"), //
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
 
	private String boxNo;
	private String declType;
	private String declNo;
	private String stgPlace;
	private java.sql.Timestamp rlsTime;
	private BigDecimal rlsPkg;
	private String pkgUnit;
	private BigDecimal gWgt;
	private String extracond;
	private String vesselSign;
	private String voyageNo;
	private String shipCode;
	private String exporter;
	private String clearType;
	private String msgType;
	private String strType;
	private String transId;
	private String asType;
	private String ioType;
	private String mawbNo;
	private String hawbNo;
	private BigDecimal declSeqNo;

	@Override
	public String getBoxNo() {
		return this.boxNo;
	}
 
	@Override
	public void setBoxNo(final String boxNo) {
		this.boxNo = boxNo; 
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
	public String getStgPlace() {
		return this.stgPlace;
	}
 
	@Override
	public void setStgPlace(final String stgPlace) {
		this.stgPlace = stgPlace; 
	}
 
	@Override
	public java.sql.Timestamp getRlsTime() {
		return this.rlsTime;
	}
 
	@Override
	public void setRlsTime(final java.sql.Timestamp rlsTime) {
		this.rlsTime = rlsTime; 
	}
 
	@Override
	public BigDecimal getRlsPkg() {
		return this.rlsPkg;
	}
 
	@Override
	public void setRlsPkg(final BigDecimal rlsPkg) {
		this.rlsPkg = rlsPkg; 
	}
 
	@Override
	public String getPkgUnit() {
		return this.pkgUnit;
	}
 
	@Override
	public void setPkgUnit(final String pkgUnit) {
		this.pkgUnit = pkgUnit; 
	}
 
	@Override
	public BigDecimal getGWgt() {
		return this.gWgt;
	}
 
	@Override
	public void setGWgt(final BigDecimal gWgt) {
		this.gWgt = gWgt; 
	}
 
	@Override
	public String getExtracond() {
		return this.extracond;
	}
 
	@Override
	public void setExtracond(final String extracond) {
		this.extracond = extracond; 
	}
 
	@Override
	public String getVesselSign() {
		return this.vesselSign;
	}
 
	@Override
	public void setVesselSign(final String vesselSign) {
		this.vesselSign = vesselSign; 
	}
 
	@Override
	public String getVoyageNo() {
		return this.voyageNo;
	}
 
	@Override
	public void setVoyageNo(final String voyageNo) {
		this.voyageNo = voyageNo; 
	}
 
	@Override
	public String getShipCode() {
		return this.shipCode;
	}
 
	@Override
	public void setShipCode(final String shipCode) {
		this.shipCode = shipCode; 
	}
 
	@Override
	public String getExporter() {
		return this.exporter;
	}
 
	@Override
	public void setExporter(final String exporter) {
		this.exporter = exporter; 
	}
 
	@Override
	public String getClearType() {
		return this.clearType;
	}
 
	@Override
	public void setClearType(final String clearType) {
		this.clearType = clearType; 
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
	public String getStrType() {
		return this.strType;
	}
 
	@Override
	public void setStrType(final String strType) {
		this.strType = strType; 
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
	public String getAsType() {
		return this.asType;
	}
 
	@Override
	public void setAsType(final String asType) {
		this.asType = asType; 
	}
 
	@Override
	public String getIoType() {
		return this.ioType;
	}
 
	@Override
	public void setIoType(final String ioType) {
		this.ioType = ioType; 
	}
 
	@Override
	public String getMawbNo() {
		return this.mawbNo;
	}
 
	@Override
	public void setMawbNo(final String mawbNo) {
		this.mawbNo = mawbNo; 
	}
 
	@Override
	public String getHawbNo() {
		return this.hawbNo;
	}
 
	@Override
	public void setHawbNo(final String hawbNo) {
		this.hawbNo = hawbNo; 
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
