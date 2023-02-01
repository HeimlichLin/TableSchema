package com.doc.common.po.impl; 
 
public class DhlImgdiTempPo implements IDhlImgdiTempPo {
 
	public enum COLUMNS {
		MWB("null"), //
		HWB("null"), //
		WAREHOUSE("null"), //
		SERVICE_CENTER("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String mwb;
	private String hwb;
	private String warehouse;
	private String serviceCenter;

	@Override
	public String getMwb() {
		return this.mwb;
	}
 
	@Override
	public void setMwb(final String mwb) {
		this.mwb = mwb; 
	}
 
	@Override
	public String getHwb() {
		return this.hwb;
	}
 
	@Override
	public void setHwb(final String hwb) {
		this.hwb = hwb; 
	}
 
	@Override
	public String getWarehouse() {
		return this.warehouse;
	}
 
	@Override
	public void setWarehouse(final String warehouse) {
		this.warehouse = warehouse; 
	}
 
	@Override
	public String getServiceCenter() {
		return this.serviceCenter;
	}
 
	@Override
	public void setServiceCenter(final String serviceCenter) {
		this.serviceCenter = serviceCenter; 
	}
 
}
