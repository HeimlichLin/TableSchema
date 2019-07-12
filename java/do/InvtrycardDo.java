package com.doc.common.bean; 
 
public class InvtrycardDo { 
 
	public enum COLUMNS { 
		BONDNO("null"), 
		YY("null"), 
		SERIESNO("null"), 
		CARDNO("null"), 
		CHECKDATE("null"), 
		OPTYPE("null"), 
		PRDTTYPE("null"), 
		PRDTNO("null"), 
		UNIT("null"), 
		INPOST("null"), 
		LOCATION("null"), 
		CHECKQTY("null"), 
		DESCRIP("null"), 
		MODEL("null"), 
		SPEC("null"), 
		CHECKER1("null"), 
		CHECKER2("null"), 
		CHECKER3("null"), 
		RMK("null"), 
		UPDTIME("null") 
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
	private BigDecimal seriesno; 
	private String cardno; 
	private String checkdate; 
	private String optype; 
	private String prdttype; 
	private String prdtno; 
	private String unit; 
	private String inpost; 
	private String location; 
	private BigDecimal checkqty; 
	private String descrip; 
	private String model; 
	private String spec; 
	private String checker1; 
	private String checker2; 
	private String checker3; 
	private String rmk; 
	private String updtime; 
	
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
 
	public BigDecimal getSeriesno() { 
		return seriesno; 
	} 
 
	public void setSeriesno(BigDecimal seriesno) { 
		this.seriesno = seriesno; 
	} 
 
	public String getCardno() { 
		return cardno; 
	} 
 
	public void setCardno(String cardno) { 
		this.cardno = cardno; 
	} 
 
	public String getCheckdate() { 
		return checkdate; 
	} 
 
	public void setCheckdate(String checkdate) { 
		this.checkdate = checkdate; 
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
 
	public String getPrdtno() { 
		return prdtno; 
	} 
 
	public void setPrdtno(String prdtno) { 
		this.prdtno = prdtno; 
	} 
 
	public String getUnit() { 
		return unit; 
	} 
 
	public void setUnit(String unit) { 
		this.unit = unit; 
	} 
 
	public String getInpost() { 
		return inpost; 
	} 
 
	public void setInpost(String inpost) { 
		this.inpost = inpost; 
	} 
 
	public String getLocation() { 
		return location; 
	} 
 
	public void setLocation(String location) { 
		this.location = location; 
	} 
 
	public BigDecimal getCheckqty() { 
		return checkqty; 
	} 
 
	public void setCheckqty(BigDecimal checkqty) { 
		this.checkqty = checkqty; 
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
 
	public String getChecker1() { 
		return checker1; 
	} 
 
	public void setChecker1(String checker1) { 
		this.checker1 = checker1; 
	} 
 
	public String getChecker2() { 
		return checker2; 
	} 
 
	public void setChecker2(String checker2) { 
		this.checker2 = checker2; 
	} 
 
	public String getChecker3() { 
		return checker3; 
	} 
 
	public void setChecker3(String checker3) { 
		this.checker3 = checker3; 
	} 
 
	public String getRmk() { 
		return rmk; 
	} 
 
	public void setRmk(String rmk) { 
		this.rmk = rmk; 
	} 
 
	public String getUpdtime() { 
		return updtime; 
	} 
 
	public void setUpdtime(String updtime) { 
		this.updtime = updtime; 
	} 
 
} 
