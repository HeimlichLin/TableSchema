package com.doc.common.po.impl; 
 
public class VehiclePo implements IVehiclePo {
 
	public enum COLUMNS {
		BONDNO("監管編號"), //
		DECLNO("報單號碼"), //
		ITEMNO("報單項次"), //
		VEHICLENO("車身號碼"), //
		VEHICLEOUT("null") //
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
	private String vehicleout;

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
 
	@Override
	public String getVehicleout() {
		return this.vehicleout;
	}
 
	@Override
	public void setVehicleout(final String vehicleout) {
		this.vehicleout = vehicleout; 
	}
 
}
