package com.doc.common.po.impl; 
 
public class EhuMsgSwitchPo implements IEhuMsgSwitchPo {
 
	public enum COLUMNS {
		EHUSTATUS("EHU ???? EDI / ??????; EDI/CLOUD"), //
		LASTUPDATE("??????"), //
		UPDATEUSERID("????????") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String ehustatus;
	private java.sql.Timestamp lastupdate;
	private String updateuserid;

	@Override
	public String getEhustatus() {
		return this.ehustatus;
	}
 
	@Override
	public void setEhustatus(final String ehustatus) {
		this.ehustatus = ehustatus; 
	}
 
	@Override
	public java.sql.Timestamp getLastupdate() {
		return this.lastupdate;
	}
 
	@Override
	public void setLastupdate(final java.sql.Timestamp lastupdate) {
		this.lastupdate = lastupdate; 
	}
 
	@Override
	public String getUpdateuserid() {
		return this.updateuserid;
	}
 
	@Override
	public void setUpdateuserid(final String updateuserid) {
		this.updateuserid = updateuserid; 
	}
 
}
