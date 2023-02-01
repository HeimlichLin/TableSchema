package com.doc.common.po.impl; 
 
public class TlF2dataResultPo implements ITlF2dataResultPo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		INVOICE_NO("發票號碼"), //
		SERIAL_NO("序號"), //
		COMMODITY_NO("客戶料號（品番）"), //
		CUSTOMS_COMMODITY_NO("通關料號（通關品番）"), //
		DESCRIP("貨名（品名）"), //
		UNIT_PRICE("單價(Unit Price)"), //
		QTY("出倉數量 (Qty)"), //
		UNIT("客戶單位代碼 (UOM)"), //
		AMT_PRICE("合計金額（=單價*數量）"), //
		CCC_CODE("稅則號列（通關稅則）"), //
		DUTY_RATE("稅率"), //
		NET_WGT("淨重 (淨重)"), //
		CONTR_NO("櫃號"), //
		TOYOTA_COMMODITY_NO("豐通品番"), //
		SUPPLIER_COMMODITY_NO("供應商品番 (供應商品番)"), //
		CTM_CODE("客戶代碼 (客戶品番)"), //
		CTM_NAME("客戶"), //
		TEMP_DECL_NO("暫編報單號碼"), //
		TEMP_ITEM_NO("暫編項次"), //
		O_DECL_NO("原進倉報單號碼"), //
		O_ITEM_NO("原進倉報單項次"), //
		BOM_CHECK("用料清表比對"), //
		STATUS("核銷狀態"), //
		CONTROL_NO("檔名"), //
		LAST_QTY("未出倉數量") //
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
	private String invoiceNo;
	private BigDecimal serialNo;
	private String commodityNo;
	private String customsCommodityNo;
	private String descrip;
	private BigDecimal unitPrice;
	private BigDecimal qty;
	private String unit;
	private BigDecimal amtPrice;
	private String cccCode;
	private BigDecimal dutyRate;
	private BigDecimal netWgt;
	private String contrNo;
	private String toyotaCommodityNo;
	private String supplierCommodityNo;
	private String ctmCode;
	private String ctmName;
	private String tempDeclNo;
	private BigDecimal tempItemNo;
	private String oDeclNo;
	private BigDecimal oItemNo;
	private String bomCheck;
	private String status;
	private String controlNo;
	private BigDecimal lastQty;

	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
	}
 
	@Override
	public String getInvoiceNo() {
		return this.invoiceNo;
	}
 
	@Override
	public void setInvoiceNo(final String invoiceNo) {
		this.invoiceNo = invoiceNo; 
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
	public String getCommodityNo() {
		return this.commodityNo;
	}
 
	@Override
	public void setCommodityNo(final String commodityNo) {
		this.commodityNo = commodityNo; 
	}
 
	@Override
	public String getCustomsCommodityNo() {
		return this.customsCommodityNo;
	}
 
	@Override
	public void setCustomsCommodityNo(final String customsCommodityNo) {
		this.customsCommodityNo = customsCommodityNo; 
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
	public BigDecimal getUnitPrice() {
		return this.unitPrice;
	}
 
	@Override
	public void setUnitPrice(final BigDecimal unitPrice) {
		this.unitPrice = unitPrice; 
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
	public String getUnit() {
		return this.unit;
	}
 
	@Override
	public void setUnit(final String unit) {
		this.unit = unit; 
	}
 
	@Override
	public BigDecimal getAmtPrice() {
		return this.amtPrice;
	}
 
	@Override
	public void setAmtPrice(final BigDecimal amtPrice) {
		this.amtPrice = amtPrice; 
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
	public BigDecimal getDutyRate() {
		return this.dutyRate;
	}
 
	@Override
	public void setDutyRate(final BigDecimal dutyRate) {
		this.dutyRate = dutyRate; 
	}
 
	@Override
	public BigDecimal getNetWgt() {
		return this.netWgt;
	}
 
	@Override
	public void setNetWgt(final BigDecimal netWgt) {
		this.netWgt = netWgt; 
	}
 
	@Override
	public String getContrNo() {
		return this.contrNo;
	}
 
	@Override
	public void setContrNo(final String contrNo) {
		this.contrNo = contrNo; 
	}
 
	@Override
	public String getToyotaCommodityNo() {
		return this.toyotaCommodityNo;
	}
 
	@Override
	public void setToyotaCommodityNo(final String toyotaCommodityNo) {
		this.toyotaCommodityNo = toyotaCommodityNo; 
	}
 
	@Override
	public String getSupplierCommodityNo() {
		return this.supplierCommodityNo;
	}
 
	@Override
	public void setSupplierCommodityNo(final String supplierCommodityNo) {
		this.supplierCommodityNo = supplierCommodityNo; 
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
	public String getCtmName() {
		return this.ctmName;
	}
 
	@Override
	public void setCtmName(final String ctmName) {
		this.ctmName = ctmName; 
	}
 
	@Override
	public String getTempDeclNo() {
		return this.tempDeclNo;
	}
 
	@Override
	public void setTempDeclNo(final String tempDeclNo) {
		this.tempDeclNo = tempDeclNo; 
	}
 
	@Override
	public BigDecimal getTempItemNo() {
		return this.tempItemNo;
	}
 
	@Override
	public void setTempItemNo(final BigDecimal tempItemNo) {
		this.tempItemNo = tempItemNo; 
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
	public String getBomCheck() {
		return this.bomCheck;
	}
 
	@Override
	public void setBomCheck(final String bomCheck) {
		this.bomCheck = bomCheck; 
	}
 
	@Override
	public String getStatus() {
		return this.status;
	}
 
	@Override
	public void setStatus(final String status) {
		this.status = status; 
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
	public BigDecimal getLastQty() {
		return this.lastQty;
	}
 
	@Override
	public void setLastQty(final BigDecimal lastQty) {
		this.lastQty = lastQty; 
	}
 
}
