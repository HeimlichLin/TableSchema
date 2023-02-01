package com.doc.common.po.impl; 
 
public class GcitempOldPo implements IGcitempOldPo {
 
	public enum COLUMNS {
		SN("null"), //
		IE("進出口別"), //
		WORKAREA("倉棧代碼"), //
		MWB("主號"), //
		HWB("分號/袋號"), //
		GCIDATE("海關受理進倉時間 yyyymmddhhmmssms (24小時)"), //
		WEIGHT("以公斤為單位(小數兩位)"), //
		BOXNO("報關箱號"), //
		DECL_NO("報單號碼"), //
		DECL_TYPE("報單類別"), //
		BAG_TOTAL_QTY("併袋總數(併袋案件使用，餘為0)"), //
		BAG_CLEARANCE_TYPE("通關方式(併袋案件若其中有一分號為C3即回傳C3)"), //
		GOODS_RECEIVED_QTY("已進倉件數；累計已進倉幾件"), //
		PACKAGE_TOTAL_QTY("總件數"), //
		GCIPIECE("實際進倉件數"), //
		GCOPIECE("實際出倉件數"), //
		RESULT_CODE("回覆代碼"), //
		RESULT_MSG("回覆說明"), //
		EXTRA_CONDITION("放行附帶條件"), //
		SEND_STATUS("傳送狀態(Null-未傳送, 0-傳送中, 1-傳送成功, 2-傳送失敗, 9-傳送異常)"), //
		SEND_QTY("傳送次數"), //
		EXPRESSID("記帳代號"), //
		FLIGHTNO("航班班次"), //
		FLIGHTDEST("(華儲)航班目的地"), //
		CHWS("驗關機台"), //
		WORKSTATION("華儲倉別(台北/高雄)"), //
		IN_READ("進倉完成寫入"), //
		IS_MIGRATION("null"), //
		OUT_READ("出倉完成寫入"), //
		USERID("作業人員 ID"), //
		CRT_DATE("寫入時間"), //
		UPT_DT("更新日期") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal sn;
	private String ie;
	private String workarea;
	private String mwb;
	private String hwb;
	private String gcidate;
	private BigDecimal weight;
	private String boxno;
	private String declNo;
	private String declType;
	private BigDecimal bagTotalQty;
	private String bagClearanceType;
	private BigDecimal goodsReceivedQty;
	private BigDecimal packageTotalQty;
	private BigDecimal gcipiece;
	private BigDecimal gcopiece;
	private String resultCode;
	private String resultMsg;
	private String extraCondition;
	private String sendStatus;
	private BigDecimal sendQty;
	private String expressid;
	private String flightno;
	private String flightdest;
	private String chws;
	private String workstation;
	private String inRead;
	private String isMigration;
	private String outRead;
	private String userid;
	private java.sql.Timestamp crtDate;
	private java.sql.Timestamp uptDt;

	@Override
	public BigDecimal getSn() {
		return this.sn;
	}
 
	@Override
	public void setSn(final BigDecimal sn) {
		this.sn = sn; 
	}
 
	@Override
	public String getIe() {
		return this.ie;
	}
 
	@Override
	public void setIe(final String ie) {
		this.ie = ie; 
	}
 
	@Override
	public String getWorkarea() {
		return this.workarea;
	}
 
	@Override
	public void setWorkarea(final String workarea) {
		this.workarea = workarea; 
	}
 
	@Override
	public String getMwb() {
		return this.mwb;
	}
 
	@Override
	public void setMwb(final String mwb) {
		this.mwb = mwb; 
	}
 
	@Override
	public String getHwb() {
		return this.hwb;
	}
 
	@Override
	public void setHwb(final String hwb) {
		this.hwb = hwb; 
	}
 
	@Override
	public String getGcidate() {
		return this.gcidate;
	}
 
	@Override
	public void setGcidate(final String gcidate) {
		this.gcidate = gcidate; 
	}
 
	@Override
	public BigDecimal getWeight() {
		return this.weight;
	}
 
	@Override
	public void setWeight(final BigDecimal weight) {
		this.weight = weight; 
	}
 
	@Override
	public String getBoxno() {
		return this.boxno;
	}
 
	@Override
	public void setBoxno(final String boxno) {
		this.boxno = boxno; 
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
	public String getDeclType() {
		return this.declType;
	}
 
	@Override
	public void setDeclType(final String declType) {
		this.declType = declType; 
	}
 
	@Override
	public BigDecimal getBagTotalQty() {
		return this.bagTotalQty;
	}
 
	@Override
	public void setBagTotalQty(final BigDecimal bagTotalQty) {
		this.bagTotalQty = bagTotalQty; 
	}
 
	@Override
	public String getBagClearanceType() {
		return this.bagClearanceType;
	}
 
	@Override
	public void setBagClearanceType(final String bagClearanceType) {
		this.bagClearanceType = bagClearanceType; 
	}
 
	@Override
	public BigDecimal getGoodsReceivedQty() {
		return this.goodsReceivedQty;
	}
 
	@Override
	public void setGoodsReceivedQty(final BigDecimal goodsReceivedQty) {
		this.goodsReceivedQty = goodsReceivedQty; 
	}
 
	@Override
	public BigDecimal getPackageTotalQty() {
		return this.packageTotalQty;
	}
 
	@Override
	public void setPackageTotalQty(final BigDecimal packageTotalQty) {
		this.packageTotalQty = packageTotalQty; 
	}
 
	@Override
	public BigDecimal getGcipiece() {
		return this.gcipiece;
	}
 
	@Override
	public void setGcipiece(final BigDecimal gcipiece) {
		this.gcipiece = gcipiece; 
	}
 
	@Override
	public BigDecimal getGcopiece() {
		return this.gcopiece;
	}
 
	@Override
	public void setGcopiece(final BigDecimal gcopiece) {
		this.gcopiece = gcopiece; 
	}
 
	@Override
	public String getResultCode() {
		return this.resultCode;
	}
 
	@Override
	public void setResultCode(final String resultCode) {
		this.resultCode = resultCode; 
	}
 
	@Override
	public String getResultMsg() {
		return this.resultMsg;
	}
 
	@Override
	public void setResultMsg(final String resultMsg) {
		this.resultMsg = resultMsg; 
	}
 
	@Override
	public String getExtraCondition() {
		return this.extraCondition;
	}
 
	@Override
	public void setExtraCondition(final String extraCondition) {
		this.extraCondition = extraCondition; 
	}
 
	@Override
	public String getSendStatus() {
		return this.sendStatus;
	}
 
	@Override
	public void setSendStatus(final String sendStatus) {
		this.sendStatus = sendStatus; 
	}
 
	@Override
	public BigDecimal getSendQty() {
		return this.sendQty;
	}
 
	@Override
	public void setSendQty(final BigDecimal sendQty) {
		this.sendQty = sendQty; 
	}
 
	@Override
	public String getExpressid() {
		return this.expressid;
	}
 
	@Override
	public void setExpressid(final String expressid) {
		this.expressid = expressid; 
	}
 
	@Override
	public String getFlightno() {
		return this.flightno;
	}
 
	@Override
	public void setFlightno(final String flightno) {
		this.flightno = flightno; 
	}
 
	@Override
	public String getFlightdest() {
		return this.flightdest;
	}
 
	@Override
	public void setFlightdest(final String flightdest) {
		this.flightdest = flightdest; 
	}
 
	@Override
	public String getChws() {
		return this.chws;
	}
 
	@Override
	public void setChws(final String chws) {
		this.chws = chws; 
	}
 
	@Override
	public String getWorkstation() {
		return this.workstation;
	}
 
	@Override
	public void setWorkstation(final String workstation) {
		this.workstation = workstation; 
	}
 
	@Override
	public String getInRead() {
		return this.inRead;
	}
 
	@Override
	public void setInRead(final String inRead) {
		this.inRead = inRead; 
	}
 
	@Override
	public String getIsMigration() {
		return this.isMigration;
	}
 
	@Override
	public void setIsMigration(final String isMigration) {
		this.isMigration = isMigration; 
	}
 
	@Override
	public String getOutRead() {
		return this.outRead;
	}
 
	@Override
	public void setOutRead(final String outRead) {
		this.outRead = outRead; 
	}
 
	@Override
	public String getUserid() {
		return this.userid;
	}
 
	@Override
	public void setUserid(final String userid) {
		this.userid = userid; 
	}
 
	@Override
	public java.sql.Timestamp getCrtDate() {
		return this.crtDate;
	}
 
	@Override
	public void setCrtDate(final java.sql.Timestamp crtDate) {
		this.crtDate = crtDate; 
	}
 
	@Override
	public java.sql.Timestamp getUptDt() {
		return this.uptDt;
	}
 
	@Override
	public void setUptDt(final java.sql.Timestamp uptDt) {
		this.uptDt = uptDt; 
	}
 
}
