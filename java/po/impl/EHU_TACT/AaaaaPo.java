package com.doc.common.po.impl; 
 
public class AaaaaPo implements IAaaaaPo {
 
	public enum COLUMNS {
		FF("null"), //
		MWB("null"), //
		HWB("null"), //
		DECLNO_OLD("null"), //
		DECLTYPE_OLD("null"), //
		DECLNO_NEW("null"), //
		DECLTYPE_NEW("null"), //
		CRT_DATE("null"), //
		MEMO("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String ff;
	private String mwb;
	private String hwb;
	private String declnoOld;
	private String decltypeOld;
	private String declnoNew;
	private String decltypeNew;
	private java.sql.Timestamp crtDate;
	private String memo;

	@Override
	public String getFf() {
		return this.ff;
	}
 
	@Override
	public void setFf(final String ff) {
		this.ff = ff; 
	}
 
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
	public String getDeclnoOld() {
		return this.declnoOld;
	}
 
	@Override
	public void setDeclnoOld(final String declnoOld) {
		this.declnoOld = declnoOld; 
	}
 
	@Override
	public String getDecltypeOld() {
		return this.decltypeOld;
	}
 
	@Override
	public void setDecltypeOld(final String decltypeOld) {
		this.decltypeOld = decltypeOld; 
	}
 
	@Override
	public String getDeclnoNew() {
		return this.declnoNew;
	}
 
	@Override
	public void setDeclnoNew(final String declnoNew) {
		this.declnoNew = declnoNew; 
	}
 
	@Override
	public String getDecltypeNew() {
		return this.decltypeNew;
	}
 
	@Override
	public void setDecltypeNew(final String decltypeNew) {
		this.decltypeNew = decltypeNew; 
	}
 
	@Override
	public java.sql.Timestamp getCrtDate() {
		return this.crtDate;
	}
 
	@Override
	public void setCrtDate(final java.sql.Timestamp crtDate) {
		this.crtDate = crtDate; 
	}
 
	@Override
	public String getMemo() {
		return this.memo;
	}
 
	@Override
	public void setMemo(final String memo) {
		this.memo = memo; 
	}
 
}
