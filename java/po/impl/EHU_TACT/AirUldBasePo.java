package com.doc.common.po.impl; 
 
public class AirUldBasePo implements IAirUldBasePo {
 
	public enum COLUMNS {
		ULD_CODE_BASE("null"), //
		ULD_SIZE_DSCR("null"), //
		CONVERT_VOL("null"), //
		UPD_USER("null"), //
		UPD_DATE("null"), //
		ULD_TYPE("null"), //
		MAX_LOAD("null"), //
		DSCR("null"), //
		PE_SIZE("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String uldCodeBase;
	private String uldSizeDscr;
	private BigDecimal convertVol;
	private String updUser;
	private java.sql.Timestamp updDate;
	private String uldType;
	private BigDecimal maxLoad;
	private String dscr;
	private String peSize;

	@Override
	public String getUldCodeBase() {
		return this.uldCodeBase;
	}
 
	@Override
	public void setUldCodeBase(final String uldCodeBase) {
		this.uldCodeBase = uldCodeBase; 
	}
 
	@Override
	public String getUldSizeDscr() {
		return this.uldSizeDscr;
	}
 
	@Override
	public void setUldSizeDscr(final String uldSizeDscr) {
		this.uldSizeDscr = uldSizeDscr; 
	}
 
	@Override
	public BigDecimal getConvertVol() {
		return this.convertVol;
	}
 
	@Override
	public void setConvertVol(final BigDecimal convertVol) {
		this.convertVol = convertVol; 
	}
 
	@Override
	public String getUpdUser() {
		return this.updUser;
	}
 
	@Override
	public void setUpdUser(final String updUser) {
		this.updUser = updUser; 
	}
 
	@Override
	public java.sql.Timestamp getUpdDate() {
		return this.updDate;
	}
 
	@Override
	public void setUpdDate(final java.sql.Timestamp updDate) {
		this.updDate = updDate; 
	}
 
	@Override
	public String getUldType() {
		return this.uldType;
	}
 
	@Override
	public void setUldType(final String uldType) {
		this.uldType = uldType; 
	}
 
	@Override
	public BigDecimal getMaxLoad() {
		return this.maxLoad;
	}
 
	@Override
	public void setMaxLoad(final BigDecimal maxLoad) {
		this.maxLoad = maxLoad; 
	}
 
	@Override
	public String getDscr() {
		return this.dscr;
	}
 
	@Override
	public void setDscr(final String dscr) {
		this.dscr = dscr; 
	}
 
	@Override
	public String getPeSize() {
		return this.peSize;
	}
 
	@Override
	public void setPeSize(final String peSize) {
		this.peSize = peSize; 
	}
 
}
