package com.doc.common.bean; 
 
public class XdecldetailDo { 
 
	public enum COLUMNS { 
		BONDNO("null"), 
		DECLNO("null"), 
		ITEMNO("null"), 
		PRDTNO("null"), 
		DESCRIP("null"), 
		BRAND("null"), 
		MODEL("null"), 
		SPEC("null"), 
		NWGHT("null"), 
		QTY("null"), 
		UNIT("null"), 
		UPRICE("null"), 
		CUR("null"), 
		VALUEAMT("null"), 
		VALUEQTY("null"), 
		DUTYRATE("null"), 
		UNITDUTY("null"), 
		ODECLNO("null"), 
		OITEMNO("null"), 
		CCCCODE("null"), 
		COMDTAXRATE("null"), 
		STRTYPE("null") 
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
	private String prdtno; 
	private String descrip; 
	private String brand; 
	private String model; 
	private String spec; 
	private BigDecimal nwght; 
	private BigDecimal qty; 
	private String unit; 
	private BigDecimal uprice; 
	private String cur; 
	private BigDecimal valueamt; 
	private BigDecimal valueqty; 
	private BigDecimal dutyrate; 
	private BigDecimal unitduty; 
	private String odeclno; 
	private BigDecimal oitemno; 
	private String ccccode; 
	private BigDecimal comdtaxrate; 
	private String strtype; 
	
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
 
	public String getPrdtno() { 
		return prdtno; 
	} 
 
	public void setPrdtno(String prdtno) { 
		this.prdtno = prdtno; 
	} 
 
	public String getDescrip() { 
		return descrip; 
	} 
 
	public void setDescrip(String descrip) { 
		this.descrip = descrip; 
	} 
 
	public String getBrand() { 
		return brand; 
	} 
 
	public void setBrand(String brand) { 
		this.brand = brand; 
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
 
	public BigDecimal getNwght() { 
		return nwght; 
	} 
 
	public void setNwght(BigDecimal nwght) { 
		this.nwght = nwght; 
	} 
 
	public BigDecimal getQty() { 
		return qty; 
	} 
 
	public void setQty(BigDecimal qty) { 
		this.qty = qty; 
	} 
 
	public String getUnit() { 
		return unit; 
	} 
 
	public void setUnit(String unit) { 
		this.unit = unit; 
	} 
 
	public BigDecimal getUprice() { 
		return uprice; 
	} 
 
	public void setUprice(BigDecimal uprice) { 
		this.uprice = uprice; 
	} 
 
	public String getCur() { 
		return cur; 
	} 
 
	public void setCur(String cur) { 
		this.cur = cur; 
	} 
 
	public BigDecimal getValueamt() { 
		return valueamt; 
	} 
 
	public void setValueamt(BigDecimal valueamt) { 
		this.valueamt = valueamt; 
	} 
 
	public BigDecimal getValueqty() { 
		return valueqty; 
	} 
 
	public void setValueqty(BigDecimal valueqty) { 
		this.valueqty = valueqty; 
	} 
 
	public BigDecimal getDutyrate() { 
		return dutyrate; 
	} 
 
	public void setDutyrate(BigDecimal dutyrate) { 
		this.dutyrate = dutyrate; 
	} 
 
	public BigDecimal getUnitduty() { 
		return unitduty; 
	} 
 
	public void setUnitduty(BigDecimal unitduty) { 
		this.unitduty = unitduty; 
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
 
	public String getCcccode() { 
		return ccccode; 
	} 
 
	public void setCcccode(String ccccode) { 
		this.ccccode = ccccode; 
	} 
 
	public BigDecimal getComdtaxrate() { 
		return comdtaxrate; 
	} 
 
	public void setComdtaxrate(BigDecimal comdtaxrate) { 
		this.comdtaxrate = comdtaxrate; 
	} 
 
	public String getStrtype() { 
		return strtype; 
	} 
 
	public void setStrtype(String strtype) { 
		this.strtype = strtype; 
	} 
 
} 
