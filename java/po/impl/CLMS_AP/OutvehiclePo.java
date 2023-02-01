package com.doc.common.po.impl; 
 
public class OutvehiclePo implements IOutvehiclePo {
 
	public enum COLUMNS {
		BONDNO("null"), //
		DECLNO("null"), //
		ITEMNO("null"), //
		VEHICLENO("null") //
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
	private String declno;
	private BigDecimal itemno;
	private String vehicleno;

	@Override
	public String getBondno() {
		return this.bondno;
	}
 
	@Override
	public void setBondno(final String bondno) {
		this.bondno = bondno; 
	}
 
	@Override
	public String getDeclno() {
		return this.declno;
	}
 
	@Override
	public void setDeclno(final String declno) {
		this.declno = declno; 
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
	public String getVehicleno() {
		return this.vehicleno;
	}
 
	@Override
	public void setVehicleno(final String vehicleno) {
		this.vehicleno = vehicleno; 
	}
 
}
