package com.doc.common.po; 
 
public interface ICpgMainPo {
 
	String getMessageid();
 
	void setMessageid(final String messageid);
 
	String getMessagename();
 
	void setMessagename(final String messagename);
 
	String getMessageversion();
 
	void setMessageversion(final String messageversion);
 
	String getSenderid();
 
	void setSenderid(final String senderid);
 
	String getRecipienttype();
 
	void setRecipienttype(final String recipienttype);
 
	String getRecipientid();
 
	void setRecipientid(final String recipientid);
 
	String getMsgfunccode();
 
	void setMsgfunccode(final String msgfunccode);
 
	String getMessagetype();
 
	void setMessagetype(final String messagetype);
 
	String getPostspecialaccount();
 
	void setPostspecialaccount(final String postspecialaccount);
 
	String getPosttype();
 
	void setPosttype(final String posttype);
 
	String getYear();
 
	void setYear(final String year);
 
	String getCountrycode();
 
	void setCountrycode(final String countrycode);
 
	String getExchangeagency();
 
	void setExchangeagency(final String exchangeagency);
 
	BigDecimal getTotalpackageno();
 
	void setTotalpackageno(final BigDecimal totalpackageno);
 
	String getSealdatetime();
 
	void setSealdatetime(final String sealdatetime);
 
	String getPostmblno();
 
	void setPostmblno(final String postmblno);
 
	String getLastyeartotalpackageno();
 
	void setLastyeartotalpackageno(final String lastyeartotalpackageno);
 
	BigDecimal getTotalqty();
 
	void setTotalqty(final BigDecimal totalqty);
 
	BigDecimal getTotalpagecount();
 
	void setTotalpagecount(final BigDecimal totalpagecount);
 
	BigDecimal getTotalbagnumber();
 
	void setTotalbagnumber(final BigDecimal totalbagnumber);
 
	BigDecimal getTotalweight();
 
	void setTotalweight(final BigDecimal totalweight);
 
	String getOtherfields();
 
	void setOtherfields(final String otherfields);
 
	String getFilename();
 
	void setFilename(final String filename);
 
	String getCreatetime();
 
	void setCreatetime(final String createtime);
 
}
