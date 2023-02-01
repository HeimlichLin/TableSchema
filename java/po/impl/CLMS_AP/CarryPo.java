package com.doc.common.po.impl; 
 
public class CarryPo implements ICarryPo {
 
	public enum COLUMNS {
		BONDNO("null"), //
		DECLNO("null"), //
		UPDTIME("null"), //
		CARRYNO("null"), //
		STRTYPE("null") //
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
	private String updtime;
	private String carryno;
	private String strtype;

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
	public String getUpdtime() {
		return this.updtime;
	}
 
	@Override
	public void setUpdtime(final String updtime) {
		this.updtime = updtime; 
	}
 
	@Override
	public String getCarryno() {
		return this.carryno;
	}
 
	@Override
	public void setCarryno(final String carryno) {
		this.carryno = carryno; 
	}
 
	@Override
	public String getStrtype() {
		return this.strtype;
	}
 
	@Override
	public void setStrtype(final String strtype) {
		this.strtype = strtype; 
	}
 
}
