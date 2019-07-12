package com.doc.common.bean; 
 
public class InvtrybookDo { 
 
	public enum COLUMNS { 
		BONDNO("null"), 
		YY("null"), 
		ITEM("null"), 
		PRDTNO("null"), 
		INPOST("null"), 
		CARDNO("null"), 
		OPTYPE("null"), 
		PRDTTYPE("null"), 
		LOCATION("null"), 
		UNIT("null"), 
		CHKQTY("null"), 
		DESCRIP("null"), 
		MODEL("null"), 
		SPEC("null"), 
		DEL("null"), 
		UPDTIME("null"), 
		CHECKDATE("null"), 
		CARRYQTY("null") 
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
	private String yy; 
	private BigDecimal item; 
	private String prdtno; 
	private String inpost; 
	private String cardno; 
	private String optype; 
	private String prdttype; 
	private String location; 
	private String unit; 
	private BigDecimal chkqty; 
	private String descrip; 
	private String model; 
	private String spec; 
	private String del; 
	private String updtime; 
	private String checkdate; 
	private BigDecimal carryqty; 
	
	public String getBondno() { 
		return bondno; 
	} 
 
	public void setBondno(String bondno) { 
		this.bondno = bondno; 
	} 
 
	public String getYy() { 
		return yy; 
	} 
 
	public void setYy(String yy) { 
		this.yy = yy; 
	} 
 
	public BigDecimal getItem() { 
		return item; 
	} 
 
	public void setItem(BigDecimal item) { 
		this.item = item; 
	} 
 
	public String getPrdtno() { 
		return prdtno; 
	} 
 
	public void setPrdtno(String prdtno) { 
		this.prdtno = prdtno; 
	} 
 
	public String getInpost() { 
		return inpost; 
	} 
 
	public void setInpost(String inpost) { 
		this.inpost = inpost; 
	} 
 
	public String getCardno() { 
		return cardno; 
	} 
 
	public void setCardno(String cardno) { 
		this.cardno = cardno; 
	} 
 
	public String getOptype() { 
		return optype; 
	} 
 
	public void setOptype(String optype) { 
		this.optype = optype; 
	} 
 
	public String getPrdttype() { 
		return prdttype; 
	} 
 
	public void setPrdttype(String prdttype) { 
		this.prdttype = prdttype; 
	} 
 
	public String getLocation() { 
		return location; 
	} 
 
	public void setLocation(String location) { 
		this.location = location; 
	} 
 
	public String getUnit() { 
		return unit; 
	} 
 
	public void setUnit(String unit) { 
		this.unit = unit; 
	} 
 
	public BigDecimal getChkqty() { 
		return chkqty; 
	} 
 
	public void setChkqty(BigDecimal chkqty) { 
		this.chkqty = chkqty; 
	} 
 
	public String getDescrip() { 
		return descrip; 
	} 
 
	public void setDescrip(String descrip) { 
		this.descrip = descrip; 
	} 
 
	public String getModel() { 
		return model; 
	} 
 
	public void setModel(String model) { 
		this.model = model; 
	} 
 
	public String getSpec() { 
		return spec; 
	} 
 
	public void setSpec(String spec) { 
		this.spec = spec; 
	} 
 
	public String getDel() { 
		return del; 
	} 
 
	public void setDel(String del) { 
		this.del = del; 
	} 
 
	public String getUpdtime() { 
		return updtime; 
	} 
 
	public void setUpdtime(String updtime) { 
		this.updtime = updtime; 
	} 
 
	public String getCheckdate() { 
		return checkdate; 
	} 
 
	public void setCheckdate(String checkdate) { 
		this.checkdate = checkdate; 
	} 
 
	public BigDecimal getCarryqty() { 
		return carryqty; 
	} 
 
	public void setCarryqty(BigDecimal carryqty) { 
		this.carryqty = carryqty; 
	} 
 
} 
