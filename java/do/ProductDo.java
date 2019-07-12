package com.doc.common.bean; 
 
public class ProductDo { 
 
	public enum COLUMNS { 
		BONDNO("監管編號"), 
		CTMCODE("客戶編碼"), 
		PRDTNO("料號"), 
		DESCRIP("貨名"), 
		UNIT("單位"), 
		REFPRDTNO("交易方料號"), 
		REVDATE("修改日期"), 
		CCCCODE("商品分類號列"), 
		DUTYRATE("稅率"), 
		COMDTAXRATE("貨物稅率"), 
		BRAND("廠牌"), 
		MODEL("型號"), 
		SPEC("規格"), 
		UPRICE("單價"), 
		CUR("貨幣"), 
		CARRYFREEQTY("結轉免稅數量（帳冊"), 
		CARRYDUTYQTY("結轉課稅數量(帳冊)") 
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
	private String ctmcode; 
	private String prdtno; 
	private String descrip; 
	private String unit; 
	private String refprdtno; 
	private String revdate; 
	private String ccccode; 
	private BigDecimal dutyrate; 
	private BigDecimal comdtaxrate; 
	private String brand; 
	private String model; 
	private String spec; 
	private BigDecimal uprice; 
	private String cur; 
	private BigDecimal carryfreeqty; 
	private BigDecimal carrydutyqty; 
	
	public String getBondno() { 
		return bondno; 
	} 
 
	public void setBondno(String bondno) { 
		this.bondno = bondno; 
	} 
 
	public String getCtmcode() { 
		return ctmcode; 
	} 
 
	public void setCtmcode(String ctmcode) { 
		this.ctmcode = ctmcode; 
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
 
	public String getUnit() { 
		return unit; 
	} 
 
	public void setUnit(String unit) { 
		this.unit = unit; 
	} 
 
	public String getRefprdtno() { 
		return refprdtno; 
	} 
 
	public void setRefprdtno(String refprdtno) { 
		this.refprdtno = refprdtno; 
	} 
 
	public String getRevdate() { 
		return revdate; 
	} 
 
	public void setRevdate(String revdate) { 
		this.revdate = revdate; 
	} 
 
	public String getCcccode() { 
		return ccccode; 
	} 
 
	public void setCcccode(String ccccode) { 
		this.ccccode = ccccode; 
	} 
 
	public BigDecimal getDutyrate() { 
		return dutyrate; 
	} 
 
	public void setDutyrate(BigDecimal dutyrate) { 
		this.dutyrate = dutyrate; 
	} 
 
	public BigDecimal getComdtaxrate() { 
		return comdtaxrate; 
	} 
 
	public void setComdtaxrate(BigDecimal comdtaxrate) { 
		this.comdtaxrate = comdtaxrate; 
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
 
	public BigDecimal getCarryfreeqty() { 
		return carryfreeqty; 
	} 
 
	public void setCarryfreeqty(BigDecimal carryfreeqty) { 
		this.carryfreeqty = carryfreeqty; 
	} 
 
	public BigDecimal getCarrydutyqty() { 
		return carrydutyqty; 
	} 
 
	public void setCarrydutyqty(BigDecimal carrydutyqty) { 
		this.carrydutyqty = carrydutyqty; 
	} 
 
} 
