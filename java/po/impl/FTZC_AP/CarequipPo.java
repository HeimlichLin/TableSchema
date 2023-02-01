package com.doc.common.po.impl; 
 
public class CarequipPo implements ICarequipPo {
 
	public enum COLUMNS {
		RPTTYPE("車輛型態"), //
		CARTYPE("null"), //
		ITEMNO("項次編號"), //
		CONTENTS("內容"), //
		DECLNO("報單號碼"), //
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
	private String cartype;
	private BigDecimal itemno;
	private String contents;
	private String declno;
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
	public String getCartype() {
		return this.cartype;
	}
 
	@Override
	public void setCartype(final String cartype) {
		this.cartype = cartype; 
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
	public String getContents() {
		return this.contents;
	}
 
	@Override
	public void setContents(final String contents) {
		this.contents = contents; 
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
	public BigDecimal getItem() {
		return this.item;
	}
 
	@Override
	public void setItem(final BigDecimal item) {
		this.item = item; 
	}
 
}
