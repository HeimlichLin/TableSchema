package com.doc.common.po.impl; 
 
public class AwbtempPo implements IAwbtempPo {
 
	public enum COLUMNS {
		AWB("null"), //
		HAWB("null"), //
		CREATEDATE("null"), //
		DELE("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String awb;
	private String hawb;
	private java.sql.Timestamp createdate;
	private String dele;

	@Override
	public String getAwb() {
		return this.awb;
	}
 
	@Override
	public void setAwb(final String awb) {
		this.awb = awb; 
	}
 
	@Override
	public String getHawb() {
		return this.hawb;
	}
 
	@Override
	public void setHawb(final String hawb) {
		this.hawb = hawb; 
	}
 
	@Override
	public java.sql.Timestamp getCreatedate() {
		return this.createdate;
	}
 
	@Override
	public void setCreatedate(final java.sql.Timestamp createdate) {
		this.createdate = createdate; 
	}
 
	@Override
	public String getDele() {
		return this.dele;
	}
 
	@Override
	public void setDele(final String dele) {
		this.dele = dele; 
	}
 
}
