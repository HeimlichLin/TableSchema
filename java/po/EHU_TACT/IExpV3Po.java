package com.doc.common.po; 
 
public interface IExpV3Po {
 
	String getExpressid();
 
	void setExpressid(final String expressid);
 
	String getExpresscname();
 
	void setExpresscname(final String expresscname);
 
	String getExpressename();
 
	void setExpressename(final String expressename);
 
	String getExpresssname();
 
	void setExpresssname(final String expresssname);
 
	String getBan();
 
	void setBan(final String ban);
 
	String getBoxno();
 
	void setBoxno(final String boxno);
 
	String getChargebox();
 
	void setChargebox(final String chargebox);
 
	BigDecimal getBaseref();
 
	void setBaseref(final BigDecimal baseref);
 
	BigDecimal getCurrenttotal();
 
	void setCurrenttotal(final BigDecimal currenttotal);
 
	BigDecimal getBaseline();
 
	void setBaseline(final BigDecimal baseline);
 
	String getOnlinebill();
 
	void setOnlinebill(final String onlinebill);
 
	String getOnlinerecp();
 
	void setOnlinerecp(final String onlinerecp);
 
	java.sql.Timestamp getFeeAlertdate();
 
	void setFeeAlertdate(final java.sql.Timestamp feeAlertdate);
 
	java.sql.Timestamp getFeeRecoverdate();
 
	void setFeeRecoverdate(final java.sql.Timestamp feeRecoverdate);
 
	java.sql.Timestamp getFeeLogdate();
 
	void setFeeLogdate(final java.sql.Timestamp feeLogdate);
 
	String getChargetype();
 
	void setChargetype(final String chargetype);
 
	String getDiscounttype();
 
	void setDiscounttype(final String discounttype);
 
	BigDecimal getLevel1();
 
	void setLevel1(final BigDecimal level1);
 
	BigDecimal getDiscount1();
 
	void setDiscount1(final BigDecimal discount1);
 
	BigDecimal getLevel2();
 
	void setLevel2(final BigDecimal level2);
 
	BigDecimal getDiscount2();
 
	void setDiscount2(final BigDecimal discount2);
 
	BigDecimal getLevel3();
 
	void setLevel3(final BigDecimal level3);
 
	BigDecimal getDiscount3();
 
	void setDiscount3(final BigDecimal discount3);
 
	BigDecimal getLevel4();
 
	void setLevel4(final BigDecimal level4);
 
	BigDecimal getDiscount4();
 
	void setDiscount4(final BigDecimal discount4);
 
	BigDecimal getLevel5();
 
	void setLevel5(final BigDecimal level5);
 
	BigDecimal getDiscount5();
 
	void setDiscount5(final BigDecimal discount5);
 
	String getObcaccount();
 
	void setObcaccount(final String obcaccount);
 
	String getEhuaccount();
 
	void setEhuaccount(final String ehuaccount);
 
	BigDecimal getWarningline();
 
	void setWarningline(final BigDecimal warningline);
 
}
