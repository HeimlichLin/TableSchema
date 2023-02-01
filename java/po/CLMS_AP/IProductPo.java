package com.doc.common.po; 
 
public interface IProductPo {
 
	String getBondno();
 
	void setBondno(final String bondno);
 
	String getCtmcode();
 
	void setCtmcode(final String ctmcode);
 
	String getPrdtno();
 
	void setPrdtno(final String prdtno);
 
	String getDescrip();
 
	void setDescrip(final String descrip);
 
	String getUnit();
 
	void setUnit(final String unit);
 
	String getRefprdtno();
 
	void setRefprdtno(final String refprdtno);
 
	String getRevdate();
 
	void setRevdate(final String revdate);
 
	String getCcccode();
 
	void setCcccode(final String ccccode);
 
	BigDecimal getDutyrate();
 
	void setDutyrate(final BigDecimal dutyrate);
 
	BigDecimal getComdtaxrate();
 
	void setComdtaxrate(final BigDecimal comdtaxrate);
 
	String getBrand();
 
	void setBrand(final String brand);
 
	String getModel();
 
	void setModel(final String model);
 
	String getSpec();
 
	void setSpec(final String spec);
 
	BigDecimal getUprice();
 
	void setUprice(final BigDecimal uprice);
 
	String getCur();
 
	void setCur(final String cur);
 
	BigDecimal getCarryfreeqty();
 
	void setCarryfreeqty(final BigDecimal carryfreeqty);
 
	BigDecimal getCarrydutyqty();
 
	void setCarrydutyqty(final BigDecimal carrydutyqty);
 
}
