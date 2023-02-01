package com.doc.common.po.impl; 
 
public class EhuimpinvTempPo implements IEhuimpinvTempPo {
 
	public enum COLUMNS {
		ABN_NO("null"), //
		EXPBAGNO("null"), //
		HOLDAREA("null"), //
		ULD_NO("null"), //
		PIC_FROM("null"), //
		PIC_TO("null"), //
		SCAN_BY("null"), //
		SCAN_TIME("null"), //
		WEIGHT("null"), //
		NOTE("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String abnNo;
	private String expbagno;
	private String holdarea;
	private String uldNo;
	private String picFrom;
	private String picTo;
	private String scanBy;
	private java.sql.Timestamp scanTime;
	private BigDecimal weight;
	private String note;

	@Override
	public String getAbnNo() {
		return this.abnNo;
	}
 
	@Override
	public void setAbnNo(final String abnNo) {
		this.abnNo = abnNo; 
	}
 
	@Override
	public String getExpbagno() {
		return this.expbagno;
	}
 
	@Override
	public void setExpbagno(final String expbagno) {
		this.expbagno = expbagno; 
	}
 
	@Override
	public String getHoldarea() {
		return this.holdarea;
	}
 
	@Override
	public void setHoldarea(final String holdarea) {
		this.holdarea = holdarea; 
	}
 
	@Override
	public String getUldNo() {
		return this.uldNo;
	}
 
	@Override
	public void setUldNo(final String uldNo) {
		this.uldNo = uldNo; 
	}
 
	@Override
	public String getPicFrom() {
		return this.picFrom;
	}
 
	@Override
	public void setPicFrom(final String picFrom) {
		this.picFrom = picFrom; 
	}
 
	@Override
	public String getPicTo() {
		return this.picTo;
	}
 
	@Override
	public void setPicTo(final String picTo) {
		this.picTo = picTo; 
	}
 
	@Override
	public String getScanBy() {
		return this.scanBy;
	}
 
	@Override
	public void setScanBy(final String scanBy) {
		this.scanBy = scanBy; 
	}
 
	@Override
	public java.sql.Timestamp getScanTime() {
		return this.scanTime;
	}
 
	@Override
	public void setScanTime(final java.sql.Timestamp scanTime) {
		this.scanTime = scanTime; 
	}
 
	@Override
	public BigDecimal getWeight() {
		return this.weight;
	}
 
	@Override
	public void setWeight(final BigDecimal weight) {
		this.weight = weight; 
	}
 
	@Override
	public String getNote() {
		return this.note;
	}
 
	@Override
	public void setNote(final String note) {
		this.note = note; 
	}
 
}
