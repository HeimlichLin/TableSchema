package com.doc.common.po.impl; 
 
public class CocompanyPo implements ICocompanyPo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		COCOMP_NO("協力廠商編號"), //
		COCOMP_NAME("協力廠商名稱"), //
		SPECIALST("專責人員"), //
		TEL("電話"), //
		CTM_ADD("住址"), //
		STATUS("狀態:Y=啟用 N=停用") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String bfNo;
	private String cocompNo;
	private String cocompName;
	private String specialst;
	private String tel;
	private String ctmAdd;
	private String status;

	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
	}
 
	@Override
	public String getCocompNo() {
		return this.cocompNo;
	}
 
	@Override
	public void setCocompNo(final String cocompNo) {
		this.cocompNo = cocompNo; 
	}
 
	@Override
	public String getCocompName() {
		return this.cocompName;
	}
 
	@Override
	public void setCocompName(final String cocompName) {
		this.cocompName = cocompName; 
	}
 
	@Override
	public String getSpecialst() {
		return this.specialst;
	}
 
	@Override
	public void setSpecialst(final String specialst) {
		this.specialst = specialst; 
	}
 
	@Override
	public String getTel() {
		return this.tel;
	}
 
	@Override
	public void setTel(final String tel) {
		this.tel = tel; 
	}
 
	@Override
	public String getCtmAdd() {
		return this.ctmAdd;
	}
 
	@Override
	public void setCtmAdd(final String ctmAdd) {
		this.ctmAdd = ctmAdd; 
	}
 
	@Override
	public String getStatus() {
		return this.status;
	}
 
	@Override
	public void setStatus(final String status) {
		this.status = status; 
	}
 
}
