package com.doc.common.po; 
 
public interface IBomdetailPo {
 
	String getBondno();
 
	void setBondno(final String bondno);
 
	String getCtmcode();
 
	void setCtmcode(final String ctmcode);
 
	String getPrdtno();
 
	void setPrdtno(final String prdtno);
 
	String getPartno();
 
	void setPartno(final String partno);
 
	BigDecimal getUnitqty();
 
	void setUnitqty(final BigDecimal unitqty);
 
	String getUnit();
 
	void setUnit(final String unit);
 
	String getRemarks();
 
	void setRemarks(final String remarks);
 
	String getDescrip();
 
	void setDescrip(final String descrip);
 
	String getModel();
 
	void setModel(final String model);
 
	String getSpec();
 
	void setSpec(final String spec);
 
	BigDecimal getGoodqty();
 
	void setGoodqty(final BigDecimal goodqty);
 
	BigDecimal getBadqty();
 
	void setBadqty(final BigDecimal badqty);
 
	BigDecimal getMixqty();
 
	void setMixqty(final BigDecimal mixqty);
 
	BigDecimal getBomrate();
 
	void setBomrate(final BigDecimal bomrate);
 
	String getBomdate();
 
	void setBomdate(final String bomdate);
 
}
