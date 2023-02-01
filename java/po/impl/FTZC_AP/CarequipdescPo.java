package com.doc.common.po.impl; 
 
public class CarequipdescPo implements ICarequipdescPo {
 
	public enum COLUMNS {
		RPTTYPE("車輛類別"), //
		ITEMNO("項次編號"), //
		DESCRIP("敘述"), //
		ITEM("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String rpttype;
	private BigDecimal itemno;
	private String descrip;
	private BigDecimal item;

	@Override
	public String getRpttype() {
		return this.rpttype;
	}
 
	@Override
	public void setRpttype(final String rpttype) {
		this.rpttype = rpttype; 
	}
 
	@Override
	public BigDecimal getItemno() {
		return this.itemno;
	}
 
	@Override
	public void setItemno(final BigDecimal itemno) {
		this.itemno = itemno; 
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
 
}
