package com.doc.common.po.impl; 
 
public class FtzbBomdetailPo implements IFtzbBomdetailPo {
 
	public enum COLUMNS {
		BONDNO("監管編號"), //
		CTMCODE("客戶代碼"), //
		PRDTNO("產品料號"), //
		PARTNO("原料料號"), //
		UNITQTY("原料單位用量"), //
		UNIT("原料單位"), //
		REMARKS("null"), //
		DESCRIP("貨名"), //
		MODEL("型號"), //
		SPEC("規格"), //
		GOODQTY("不含破損使用數量"), //
		BADQTY("破損數量"), //
		MIXQTY("含破損使用數量"), //
		BOMRATE("盤差容許率"), //
		BOMDATE("用料清表日期"), //
		APPROVEDNO("核准文號"), //
		RMK("null"), //
		SEQNO("序號") //
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
	private String approvedno;
	private String rmk;
	private BigDecimal seqno;

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
 
	@Override
	public String getApprovedno() {
		return this.approvedno;
	}
 
	@Override
	public void setApprovedno(final String approvedno) {
		this.approvedno = approvedno; 
	}
 
	@Override
	public String getRmk() {
		return this.rmk;
	}
 
	@Override
	public void setRmk(final String rmk) {
		this.rmk = rmk; 
	}
 
	@Override
	public BigDecimal getSeqno() {
		return this.seqno;
	}
 
	@Override
	public void setSeqno(final BigDecimal seqno) {
		this.seqno = seqno; 
	}
 
}
