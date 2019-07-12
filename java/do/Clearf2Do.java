package com.doc.common.bean; 
 
public class Clearf2Do { 
 
	public enum COLUMNS { 
		BONDNO("null"), 
		DECLNO("null"), 
		ITEMNO("null"), 
		DECLTYPE("null"), 
		PRDTNO("null"), 
		QTY("null"), 
		POST("null"), 
		DUTYTYPE("null"), 
		ODECLNO("null"), 
		OITEMNO("null"), 
		ODECLTYPE("null"), 
		OPRDTNO("null"), 
		OQTY("null"), 
		OPOST("null"), 
		ODUTYTYPE("null"), 
		OUTSTATUS("null"), 
		F4DATE("null"), 
		F2DATE("null"), 
		UNIT("null"), 
		F2UNIT("null"), 
		BOMQUILTY("null"), 
		BOMQTY("null") 
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
	private String decltype; 
	private String prdtno; 
	private BigDecimal qty; 
	private String post; 
	private String dutytype; 
	private String odeclno; 
	private BigDecimal oitemno; 
	private String odecltype; 
	private String oprdtno; 
	private BigDecimal oqty; 
	private String opost; 
	private String odutytype; 
	private String outstatus; 
	private String f4date; 
	private String f2date; 
	private String unit; 
	private String f2unit; 
	private BigDecimal bomquilty; 
	private BigDecimal bomqty; 
	
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
 
	public String getDecltype() { 
		return decltype; 
	} 
 
	public void setDecltype(String decltype) { 
		this.decltype = decltype; 
	} 
 
	public String getPrdtno() { 
		return prdtno; 
	} 
 
	public void setPrdtno(String prdtno) { 
		this.prdtno = prdtno; 
	} 
 
	public BigDecimal getQty() { 
		return qty; 
	} 
 
	public void setQty(BigDecimal qty) { 
		this.qty = qty; 
	} 
 
	public String getPost() { 
		return post; 
	} 
 
	public void setPost(String post) { 
		this.post = post; 
	} 
 
	public String getDutytype() { 
		return dutytype; 
	} 
 
	public void setDutytype(String dutytype) { 
		this.dutytype = dutytype; 
	} 
 
	public String getOdeclno() { 
		return odeclno; 
	} 
 
	public void setOdeclno(String odeclno) { 
		this.odeclno = odeclno; 
	} 
 
	public BigDecimal getOitemno() { 
		return oitemno; 
	} 
 
	public void setOitemno(BigDecimal oitemno) { 
		this.oitemno = oitemno; 
	} 
 
	public String getOdecltype() { 
		return odecltype; 
	} 
 
	public void setOdecltype(String odecltype) { 
		this.odecltype = odecltype; 
	} 
 
	public String getOprdtno() { 
		return oprdtno; 
	} 
 
	public void setOprdtno(String oprdtno) { 
		this.oprdtno = oprdtno; 
	} 
 
	public BigDecimal getOqty() { 
		return oqty; 
	} 
 
	public void setOqty(BigDecimal oqty) { 
		this.oqty = oqty; 
	} 
 
	public String getOpost() { 
		return opost; 
	} 
 
	public void setOpost(String opost) { 
		this.opost = opost; 
	} 
 
	public String getOdutytype() { 
		return odutytype; 
	} 
 
	public void setOdutytype(String odutytype) { 
		this.odutytype = odutytype; 
	} 
 
	public String getOutstatus() { 
		return outstatus; 
	} 
 
	public void setOutstatus(String outstatus) { 
		this.outstatus = outstatus; 
	} 
 
	public String getF4date() { 
		return f4date; 
	} 
 
	public void setF4date(String f4date) { 
		this.f4date = f4date; 
	} 
 
	public String getF2date() { 
		return f2date; 
	} 
 
	public void setF2date(String f2date) { 
		this.f2date = f2date; 
	} 
 
	public String getUnit() { 
		return unit; 
	} 
 
	public void setUnit(String unit) { 
		this.unit = unit; 
	} 
 
	public String getF2unit() { 
		return f2unit; 
	} 
 
	public void setF2unit(String f2unit) { 
		this.f2unit = f2unit; 
	} 
 
	public BigDecimal getBomquilty() { 
		return bomquilty; 
	} 
 
	public void setBomquilty(BigDecimal bomquilty) { 
		this.bomquilty = bomquilty; 
	} 
 
	public BigDecimal getBomqty() { 
		return bomqty; 
	} 
 
	public void setBomqty(BigDecimal bomqty) { 
		this.bomqty = bomqty; 
	} 
 
} 
