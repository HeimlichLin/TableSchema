package com.doc.common.po.impl; 
 
public class ProductPo implements IProductPo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		CTM_CODE("客戶編號"), //
		PRDT_NO("料號"), //
		DESCRIP("敘述"), //
		UNIT("單位"), //
		REFPRDT_NO("交易方料號"), //
		REV_DATE("新增日期"), //
		CCC_CODE("稅則號列"), //
		DUTY_RATE("稅率"), //
		COMD_TAX_RATE("貨物稅率"), //
		BRAND("品牌"), //
		MODEL("型號"), //
		SPEC("規格"), //
		UPRICE("單價"), //
		CUR("幣別"), //
		MAKE_PLACE("產地"), //
		STATUS("啟用狀態") //
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
	private String ctmCode;
	private String prdtNo;
	private String descrip;
	private String unit;
	private String refprdtNo;
	private String revDate;
	private String cccCode;
	private BigDecimal dutyRate;
	private BigDecimal comdTaxRate;
	private String brand;
	private String model;
	private String spec;
	private BigDecimal uprice;
	private String cur;
	private String makePlace;
	private String status;

	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
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
	public String getPrdtNo() {
		return this.prdtNo;
	}
 
	@Override
	public void setPrdtNo(final String prdtNo) {
		this.prdtNo = prdtNo; 
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
	public String getUnit() {
		return this.unit;
	}
 
	@Override
	public void setUnit(final String unit) {
		this.unit = unit; 
	}
 
	@Override
	public String getRefprdtNo() {
		return this.refprdtNo;
	}
 
	@Override
	public void setRefprdtNo(final String refprdtNo) {
		this.refprdtNo = refprdtNo; 
	}
 
	@Override
	public String getRevDate() {
		return this.revDate;
	}
 
	@Override
	public void setRevDate(final String revDate) {
		this.revDate = revDate; 
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
	public BigDecimal getComdTaxRate() {
		return this.comdTaxRate;
	}
 
	@Override
	public void setComdTaxRate(final BigDecimal comdTaxRate) {
		this.comdTaxRate = comdTaxRate; 
	}
 
	@Override
	public String getBrand() {
		return this.brand;
	}
 
	@Override
	public void setBrand(final String brand) {
		this.brand = brand; 
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
	public String getSpec() {
		return this.spec;
	}
 
	@Override
	public void setSpec(final String spec) {
		this.spec = spec; 
	}
 
	@Override
	public BigDecimal getUprice() {
		return this.uprice;
	}
 
	@Override
	public void setUprice(final BigDecimal uprice) {
		this.uprice = uprice; 
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
	public String getMakePlace() {
		return this.makePlace;
	}
 
	@Override
	public void setMakePlace(final String makePlace) {
		this.makePlace = makePlace; 
	}
 
	@Override
	public String getStatus() {
		return this.status;
	}
 
	@Override
	public void setStatus(final String status) {
		this.status = status; 
	}
 
}
