package com.doc.common.po.impl; 
 
public class CtmcodePo implements ICtmcodePo {
 
	public enum COLUMNS {
		BONDNO("監管編號"), //
		CTMCODE("客戶編碼"), //
		CTMNAME("客戶名稱"), //
		CTMID("客戶使用代碼"), //
		CTMBAN("客戶統一編號"), //
		CTMENGNAME("客戶英文名稱"), //
		CTMADD("客戶地址") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String bondno;
	private String ctmcode;
	private String ctmname;
	private String ctmid;
	private String ctmban;
	private String ctmengname;
	private String ctmadd;

	@Override
	public String getBondno() {
		return this.bondno;
	}
 
	@Override
	public void setBondno(final String bondno) {
		this.bondno = bondno; 
	}
 
	@Override
	public String getCtmcode() {
		return this.ctmcode;
	}
 
	@Override
	public void setCtmcode(final String ctmcode) {
		this.ctmcode = ctmcode; 
	}
 
	@Override
	public String getCtmname() {
		return this.ctmname;
	}
 
	@Override
	public void setCtmname(final String ctmname) {
		this.ctmname = ctmname; 
	}
 
	@Override
	public String getCtmid() {
		return this.ctmid;
	}
 
	@Override
	public void setCtmid(final String ctmid) {
		this.ctmid = ctmid; 
	}
 
	@Override
	public String getCtmban() {
		return this.ctmban;
	}
 
	@Override
	public void setCtmban(final String ctmban) {
		this.ctmban = ctmban; 
	}
 
	@Override
	public String getCtmengname() {
		return this.ctmengname;
	}
 
	@Override
	public void setCtmengname(final String ctmengname) {
		this.ctmengname = ctmengname; 
	}
 
	@Override
	public String getCtmadd() {
		return this.ctmadd;
	}
 
	@Override
	public void setCtmadd(final String ctmadd) {
		this.ctmadd = ctmadd; 
	}
 
}
