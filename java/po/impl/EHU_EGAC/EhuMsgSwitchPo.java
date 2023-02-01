package com.doc.common.po.impl; 
 
public class EhuMsgSwitchPo implements IEhuMsgSwitchPo {
 
	public enum COLUMNS {
		EHUSTATUS("EHU 系統目前 EDI / 雲端運作模式; EDI/CLOUD"), //
		LASTUPDATE("最後更新日期"), //
		UPDATEUSERID("最後更新人員帳號"), //
		LINETYPE("EHU雲端傳送線路狀態: TV-關貿專線傳送, EGAC-榮儲自有Internet線路傳送") //
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
	private String linetype;

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
 
	@Override
	public String getLinetype() {
		return this.linetype;
	}
 
	@Override
	public void setLinetype(final String linetype) {
		this.linetype = linetype; 
	}
 
}
