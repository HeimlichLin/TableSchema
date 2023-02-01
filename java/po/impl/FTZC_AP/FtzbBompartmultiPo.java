package com.doc.common.po.impl; 
 
public class FtzbBompartmultiPo implements IFtzbBompartmultiPo {
 
	public enum COLUMNS {
		BONDNO("null"), //
		CTMCODE("null"), //
		PRDTNO("null"), //
		PARTNO("null"), //
		PARTNO2("null"), //
		UNITQTY("null"), //
		UNIT("null"), //
		DESCRIP("null"), //
		ITEM("null"), //
		UPDTIME("null"), //
		BOMDATE("null") //
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
	private String partno2;
	private BigDecimal unitqty;
	private String unit;
	private String descrip;
	private BigDecimal item;
	private String updtime;
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
	public String getPartno2() {
		return this.partno2;
	}
 
	@Override
	public void setPartno2(final String partno2) {
		this.partno2 = partno2; 
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
	public String getDescrip() {
		return this.descrip;
	}
 
	@Override
	public void setDescrip(final String descrip) {
		this.descrip = descrip; 
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
	public String getUpdtime() {
		return this.updtime;
	}
 
	@Override
	public void setUpdtime(final String updtime) {
		this.updtime = updtime; 
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
