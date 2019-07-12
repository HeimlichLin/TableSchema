package com.doc.common.bean; 
 
public class StrvehicleDo { 
 
	public enum COLUMNS { 
		BONDNO("null"), 
		DECLNO("null"), 
		ITEMNO("null"), 
		VEHICLENO("null"), 
		VEHICLEOUT("null") 
		; 
		final String name; 
	 
		private COLUMNS(final String name) { 
			this.name = name; 
		} 
	 
		public String getName() { 
			return this.name; 
		} 
	} 
 
	private String bondno; 
	private String declno; 
	private BigDecimal itemno; 
	private String vehicleno; 
	private String vehicleout; 
	
	public String getBondno() { 
		return bondno; 
	} 
 
	public void setBondno(String bondno) { 
		this.bondno = bondno; 
	} 
 
	public String getDeclno() { 
		return declno; 
	} 
 
	public void setDeclno(String declno) { 
		this.declno = declno; 
	} 
 
	public BigDecimal getItemno() { 
		return itemno; 
	} 
 
	public void setItemno(BigDecimal itemno) { 
		this.itemno = itemno; 
	} 
 
	public String getVehicleno() { 
		return vehicleno; 
	} 
 
	public void setVehicleno(String vehicleno) { 
		this.vehicleno = vehicleno; 
	} 
 
	public String getVehicleout() { 
		return vehicleout; 
	} 
 
	public void setVehicleout(String vehicleout) { 
		this.vehicleout = vehicleout; 
	} 
 
} 
