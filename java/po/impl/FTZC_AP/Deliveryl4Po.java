package com.doc.common.po.impl; 
 
public class Deliveryl4Po implements IDeliveryl4Po {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		DELIVERY_NO("運送單號"), //
		PRDT_NO("料號"), //
		UNIT("單位"), //
		QTY("數量"), //
		SPEC("規格"), //
		MODEL("型號"), //
		DESCRIP("貨名"), //
		CCC_CODE("稅則號列"), //
		MAKE_PLACE("生產國別"), //
		APPLY_NO("企業參考號碼(按月彙報核准編號)"), //
		ITEM("項次"), //
		BOM_DATE("用料清表日期"), //
		START_PLACE("起運地點"), //
		END_PLACE("運往地點"), //
		STATUS_DATE("預定出入區日期時間"), //
		PROCESS_TYPE("作業別(按月彙報出入區)"), //
		BALANCE("沒被轉成進出倉單的數量"), //
		DUTY_TYPE("納稅辦法"), //
		STAT_MODE("統計方式"), //
		APPLY_ITEM("??"), //
		ITEM_TMP("??"), //
		DUTY_RATE("稅率"), //
		VALUE_AMT("完稅價格"), //
		APPLY_DATE("申請日期時間"), //
		OWNER_BAN("統一編號") //
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
	private String deliveryNo;
	private String prdtNo;
	private String unit;
	private String qty;
	private String spec;
	private String model;
	private String descrip;
	private String cccCode;
	private String makePlace;
	private String applyNo;
	private BigDecimal item;
	private String bomDate;
	private String startPlace;
	private String endPlace;
	private String statusDate;
	private String processType;
	private String balance;
	private String dutyType;
	private String statMode;
	private String applyItem;
	private BigDecimal itemTmp;
	private BigDecimal dutyRate;
	private BigDecimal valueAmt;
	private String applyDate;
	private String ownerBan;

	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
	}
 
	@Override
	public String getDeliveryNo() {
		return this.deliveryNo;
	}
 
	@Override
	public void setDeliveryNo(final String deliveryNo) {
		this.deliveryNo = deliveryNo; 
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
	public String getUnit() {
		return this.unit;
	}
 
	@Override
	public void setUnit(final String unit) {
		this.unit = unit; 
	}
 
	@Override
	public String getQty() {
		return this.qty;
	}
 
	@Override
	public void setQty(final String qty) {
		this.qty = qty; 
	}
 
	@Override
	public String getSpec() {
		return this.spec;
	}
 
	@Override
	public void setSpec(final String spec) {
		this.spec = spec; 
	}
 
	@Override
	public String getModel() {
		return this.model;
	}
 
	@Override
	public void setModel(final String model) {
		this.model = model; 
	}
 
	@Override
	public String getDescrip() {
		return this.descrip;
	}
 
	@Override
	public void setDescrip(final String descrip) {
		this.descrip = descrip; 
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
	public String getMakePlace() {
		return this.makePlace;
	}
 
	@Override
	public void setMakePlace(final String makePlace) {
		this.makePlace = makePlace; 
	}
 
	@Override
	public String getApplyNo() {
		return this.applyNo;
	}
 
	@Override
	public void setApplyNo(final String applyNo) {
		this.applyNo = applyNo; 
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
	public String getBomDate() {
		return this.bomDate;
	}
 
	@Override
	public void setBomDate(final String bomDate) {
		this.bomDate = bomDate; 
	}
 
	@Override
	public String getStartPlace() {
		return this.startPlace;
	}
 
	@Override
	public void setStartPlace(final String startPlace) {
		this.startPlace = startPlace; 
	}
 
	@Override
	public String getEndPlace() {
		return this.endPlace;
	}
 
	@Override
	public void setEndPlace(final String endPlace) {
		this.endPlace = endPlace; 
	}
 
	@Override
	public String getStatusDate() {
		return this.statusDate;
	}
 
	@Override
	public void setStatusDate(final String statusDate) {
		this.statusDate = statusDate; 
	}
 
	@Override
	public String getProcessType() {
		return this.processType;
	}
 
	@Override
	public void setProcessType(final String processType) {
		this.processType = processType; 
	}
 
	@Override
	public String getBalance() {
		return this.balance;
	}
 
	@Override
	public void setBalance(final String balance) {
		this.balance = balance; 
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
	public String getApplyItem() {
		return this.applyItem;
	}
 
	@Override
	public void setApplyItem(final String applyItem) {
		this.applyItem = applyItem; 
	}
 
	@Override
	public BigDecimal getItemTmp() {
		return this.itemTmp;
	}
 
	@Override
	public void setItemTmp(final BigDecimal itemTmp) {
		this.itemTmp = itemTmp; 
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
	public BigDecimal getValueAmt() {
		return this.valueAmt;
	}
 
	@Override
	public void setValueAmt(final BigDecimal valueAmt) {
		this.valueAmt = valueAmt; 
	}
 
	@Override
	public String getApplyDate() {
		return this.applyDate;
	}
 
	@Override
	public void setApplyDate(final String applyDate) {
		this.applyDate = applyDate; 
	}
 
	@Override
	public String getOwnerBan() {
		return this.ownerBan;
	}
 
	@Override
	public void setOwnerBan(final String ownerBan) {
		this.ownerBan = ownerBan; 
	}
 
}
