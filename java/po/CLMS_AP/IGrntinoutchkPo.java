package com.doc.common.po; 
 
public interface IGrntinoutchkPo {
 
	String getBondno();
 
	void setBondno(final String bondno);
 
	String getOdeclno();
 
	void setOdeclno(final String odeclno);
 
	BigDecimal getOitemno();
 
	void setOitemno(final BigDecimal oitemno);
 
	String getStrpost();
 
	void setStrpost(final String strpost);
 
	BigDecimal getInTaxamt();
 
	void setInTaxamt(final BigDecimal inTaxamt);
 
	BigDecimal getOutTaxamt();
 
	void setOutTaxamt(final BigDecimal outTaxamt);
 
}
