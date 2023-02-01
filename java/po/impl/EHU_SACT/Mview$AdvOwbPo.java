package com.doc.common.po.impl; 
 
public class Mview$AdvOwbPo implements IMview$AdvOwbPo {
 
	public enum COLUMNS {
		RUNID#("null"), //
		OBJNAME("null"), //
		OWNERNAME("null"), //
		MVSCRIPT("null"), //
		INDEXSCRIPT("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal runid#;
	private String objname;
	private String ownername;
	private String mvscript;
	private String indexscript;

	@Override
	public BigDecimal getRunid#() {
		return this.runid#;
	}
 
	@Override
	public void setRunid#(final BigDecimal runid#) {
		this.runid# = runid#; 
	}
 
	@Override
	public String getObjname() {
		return this.objname;
	}
 
	@Override
	public void setObjname(final String objname) {
		this.objname = objname; 
	}
 
	@Override
	public String getOwnername() {
		return this.ownername;
	}
 
	@Override
	public void setOwnername(final String ownername) {
		this.ownername = ownername; 
	}
 
	@Override
	public String getMvscript() {
		return this.mvscript;
	}
 
	@Override
	public void setMvscript(final String mvscript) {
		this.mvscript = mvscript; 
	}
 
	@Override
	public String getIndexscript() {
		return this.indexscript;
	}
 
	@Override
	public void setIndexscript(final String indexscript) {
		this.indexscript = indexscript; 
	}
 
}
