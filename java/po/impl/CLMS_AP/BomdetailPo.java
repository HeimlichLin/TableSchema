package com.doc.common.po.impl; 
 
public class BomdetailPo implements IBomdetailPo {
 
	public enum COLUMNS {
		BONDNO("監管編號"), //
		CTMCODE("客戶代碼(客戶編碼)"), //
		PRDTNO("產品號碼(料號)"), //
		PARTNO("料號"), //
		UNITQTY("單位用量"), //
		UNIT("單位"), //
		REMARKS("備註"), //
		DESCRIP("品名"), //
		MODEL("型號"), //
		SPEC("規格"), //
		GOODQTY("null"), //
		BADQTY("null"), //
		MIXQTY("null"), //
		BOMRATE("null"), //
		BOMDATE("用料清表日期") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String bondno;
	private String ctmcode;
	private String prdtno;
	private String partno;
	private BigDecimal unitqty;
	private String unit;
	private String remarks;
	private String descrip;
	private String model;
	private String spec;
	private BigDecimal goodqty;
	private BigDecimal badqty;
	private BigDecimal mixqty;
	private BigDecimal bomrate;
	private String bomdate;

	@Override
	public String getBondno() {
		return this.bondno;
	}
 
	@Override
	public void setBondno(final String bondno) {
		this.bondno = bondno; 
	}
 
	@Override
	public String getCtmcode() {
		return this.ctmcode;
	}
 
	@Override
	public void setCtmcode(final String ctmcode) {
		this.ctmcode = ctmcode; 
	}
 
	@Override
	public String getPrdtno() {
		return this.prdtno;
	}
 
	@Override
	public void setPrdtno(final String prdtno) {
		this.prdtno = prdtno; 
	}
 
	@Override
	public String getPartno() {
		return this.partno;
	}
 
	@Override
	public void setPartno(final String partno) {
		this.partno = partno; 
	}
 
	@Override
	public BigDecimal getUnitqty() {
		return this.unitqty;
	}
 
	@Override
	public void setUnitqty(final BigDecimal unitqty) {
		this.unitqty = unitqty; 
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
	public String getRemarks() {
		return this.remarks;
	}
 
	@Override
	public void setRemarks(final String remarks) {
		this.remarks = remarks; 
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
	public BigDecimal getGoodqty() {
		return this.goodqty;
	}
 
	@Override
	public void setGoodqty(final BigDecimal goodqty) {
		this.goodqty = goodqty; 
	}
 
	@Override
	public BigDecimal getBadqty() {
		return this.badqty;
	}
 
	@Override
	public void setBadqty(final BigDecimal badqty) {
		this.badqty = badqty; 
	}
 
	@Override
	public BigDecimal getMixqty() {
		return this.mixqty;
	}
 
	@Override
	public void setMixqty(final BigDecimal mixqty) {
		this.mixqty = mixqty; 
	}
 
	@Override
	public BigDecimal getBomrate() {
		return this.bomrate;
	}
 
	@Override
	public void setBomrate(final BigDecimal bomrate) {
		this.bomrate = bomrate; 
	}
 
	@Override
	public String getBomdate() {
		return this.bomdate;
	}
 
	@Override
	public void setBomdate(final String bomdate) {
		this.bomdate = bomdate; 
	}
 
}
