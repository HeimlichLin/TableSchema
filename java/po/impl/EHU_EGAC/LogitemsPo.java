package com.doc.common.po.impl; 
 
public class LogitemsPo implements ILogitemsPo {
 
	public enum COLUMNS {
		ITEMS_BAGNO("null"), //
		ITEMS_HWB("null"), //
		ITEMS_MWB("null"), //
		ITEMS_ITEMNO("null"), //
		ITEMS_EXPBAGNO("null"), //
		ITEMS_GCIDATE("null"), //
		ITEMS_GCIWEIGHT("null"), //
		ITEMS_GCODATE("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String itemsBagno;
	private String itemsHwb;
	private String itemsMwb;
	private BigDecimal itemsItemno;
	private String itemsExpbagno;
	private java.sql.Timestamp itemsGcidate;
	private BigDecimal itemsGciweight;
	private java.sql.Timestamp itemsGcodate;

	@Override
	public String getItemsBagno() {
		return this.itemsBagno;
	}
 
	@Override
	public void setItemsBagno(final String itemsBagno) {
		this.itemsBagno = itemsBagno; 
	}
 
	@Override
	public String getItemsHwb() {
		return this.itemsHwb;
	}
 
	@Override
	public void setItemsHwb(final String itemsHwb) {
		this.itemsHwb = itemsHwb; 
	}
 
	@Override
	public String getItemsMwb() {
		return this.itemsMwb;
	}
 
	@Override
	public void setItemsMwb(final String itemsMwb) {
		this.itemsMwb = itemsMwb; 
	}
 
	@Override
	public BigDecimal getItemsItemno() {
		return this.itemsItemno;
	}
 
	@Override
	public void setItemsItemno(final BigDecimal itemsItemno) {
		this.itemsItemno = itemsItemno; 
	}
 
	@Override
	public String getItemsExpbagno() {
		return this.itemsExpbagno;
	}
 
	@Override
	public void setItemsExpbagno(final String itemsExpbagno) {
		this.itemsExpbagno = itemsExpbagno; 
	}
 
	@Override
	public java.sql.Timestamp getItemsGcidate() {
		return this.itemsGcidate;
	}
 
	@Override
	public void setItemsGcidate(final java.sql.Timestamp itemsGcidate) {
		this.itemsGcidate = itemsGcidate; 
	}
 
	@Override
	public BigDecimal getItemsGciweight() {
		return this.itemsGciweight;
	}
 
	@Override
	public void setItemsGciweight(final BigDecimal itemsGciweight) {
		this.itemsGciweight = itemsGciweight; 
	}
 
	@Override
	public java.sql.Timestamp getItemsGcodate() {
		return this.itemsGcodate;
	}
 
	@Override
	public void setItemsGcodate(final java.sql.Timestamp itemsGcodate) {
		this.itemsGcodate = itemsGcodate; 
	}
 
}
