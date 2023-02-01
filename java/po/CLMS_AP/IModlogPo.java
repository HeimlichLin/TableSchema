package com.doc.common.po; 
 
public interface IModlogPo {
 
	String getBondno();
 
	void setBondno(final String bondno);
 
	String getRefbillno();
 
	void setRefbillno(final String refbillno);
 
	BigDecimal getItem();
 
	void setItem(final BigDecimal item);
 
	String getPost();
 
	void setPost(final String post);
 
	String getStrtype();
 
	void setStrtype(final String strtype);
 
	String getModifer();
 
	void setModifer(final String modifer);
 
	java.sql.Timestamp getModtime();
 
	void setModtime(final java.sql.Timestamp modtime);
 
	String getModitem();
 
	void setModitem(final String moditem);
 
	String getOridata();
 
	void setOridata(final String oridata);
 
	String getModdata();
 
	void setModdata(final String moddata);
 
	String getModfile();
 
	void setModfile(final String modfile);
 
	String getRemks();
 
	void setRemks(final String remks);
 
	String getDeclno();
 
	void setDeclno(final String declno);
 
	BigDecimal getItemno();
 
	void setItemno(final BigDecimal itemno);
 
	String getOdeclno();
 
	void setOdeclno(final String odeclno);
 
	String getOitemno();
 
	void setOitemno(final String oitemno);
 
}
