package com.doc.common.po.impl; 
 
public class TlF1dataPo implements ITlF1dataPo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		DECL_NO("報單號碼"), //
		ITEM_NO("項次"), //
		INVOICE_NO("發票號碼（TTC Invoice Number）"), //
		COMMODITY_NO("客戶料號（品番）"), //
		CUSTOMS_COMMODITY_NO("通關料號（通關品番）"), //
		DESCRIP("貨名（品名）"), //
		UNIT_PRICE("單價"), //
		QTY("數量"), //
		UNIT("客戶單位代碼"), //
		AMT_PRICE("合計金額（=單價*數量）"), //
		CCC_CODE("稅則號列（通關稅則）"), //
		NET_WGT("淨重"), //
		CONTR_NO("櫃號"), //
		TOYOTA_COMMODITY_NO("豐通品番"), //
		SUPPLIER_COMMODITY_NO("供應商品番"), //
		CTM_CODE("客戶代碼"), //
		CTM_NAME("客戶"), //
		CURRENT_QTY("庫存量") //
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
	private String declNo;
	private BigDecimal itemNo;
	private String invoiceNo;
	private String commodityNo;
	private String customsCommodityNo;
	private String descrip;
	private BigDecimal unitPrice;
	private BigDecimal qty;
	private String unit;
	private BigDecimal amtPrice;
	private String cccCode;
	private BigDecimal netWgt;
	private String contrNo;
	private String toyotaCommodityNo;
	private String supplierCommodityNo;
	private String ctmCode;
	private String ctmName;
	private BigDecimal currentQty;

	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
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
	public String getInvoiceNo() {
		return this.invoiceNo;
	}
 
	@Override
	public void setInvoiceNo(final String invoiceNo) {
		this.invoiceNo = invoiceNo; 
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
	public BigDecimal getCurrentQty() {
		return this.currentQty;
	}
 
	@Override
	public void setCurrentQty(final BigDecimal currentQty) {
		this.currentQty = currentQty; 
	}
 
}
