package com.doc.common.po; 
 
public interface ILogitemsPo {
 
	String getItemsBagno();
 
	void setItemsBagno(final String itemsBagno);
 
	String getItemsHwb();
 
	void setItemsHwb(final String itemsHwb);
 
	String getItemsMwb();
 
	void setItemsMwb(final String itemsMwb);
 
	BigDecimal getItemsItemno();
 
	void setItemsItemno(final BigDecimal itemsItemno);
 
	String getItemsExpbagno();
 
	void setItemsExpbagno(final String itemsExpbagno);
 
	java.sql.Timestamp getItemsGcidate();
 
	void setItemsGcidate(final java.sql.Timestamp itemsGcidate);
 
	BigDecimal getItemsGciweight();
 
	void setItemsGciweight(final BigDecimal itemsGciweight);
 
	java.sql.Timestamp getItemsGcodate();
 
	void setItemsGcodate(final java.sql.Timestamp itemsGcodate);
 
	String getItemsDeclno();
 
	void setItemsDeclno(final String itemsDeclno);
 
}
