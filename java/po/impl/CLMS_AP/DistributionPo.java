package com.doc.common.po.impl; 
 
public class DistributionPo implements IDistributionPo {
 
	public enum COLUMNS {
		VALSYSTEM("null"), //
		MSGCODE("null"), //
		CONDTYPE("null"), //
		BOXNO("null"), //
		OWNERBAN("null"), //
		STGPLACE("null"), //
		DECLTYPE("null"), //
		SENDTYPE("null"), //
		DESTIN01("null"), //
		DESTIN02("null"), //
		DESTIN03("null"), //
		DESTIN04("null"), //
		DESTIN05("null"), //
		ACTIVEDATE("null"), //
		ENDDATE("null"), //
		STATUS("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String valsystem;
	private String msgcode;
	private String condtype;
	private String boxno;
	private String ownerban;
	private String stgplace;
	private String decltype;
	private String sendtype;
	private String destin01;
	private String destin02;
	private String destin03;
	private String destin04;
	private String destin05;
	private String activedate;
	private String enddate;
	private String status;

	@Override
	public String getValsystem() {
		return this.valsystem;
	}
 
	@Override
	public void setValsystem(final String valsystem) {
		this.valsystem = valsystem; 
	}
 
	@Override
	public String getMsgcode() {
		return this.msgcode;
	}
 
	@Override
	public void setMsgcode(final String msgcode) {
		this.msgcode = msgcode; 
	}
 
	@Override
	public String getCondtype() {
		return this.condtype;
	}
 
	@Override
	public void setCondtype(final String condtype) {
		this.condtype = condtype; 
	}
 
	@Override
	public String getBoxno() {
		return this.boxno;
	}
 
	@Override
	public void setBoxno(final String boxno) {
		this.boxno = boxno; 
	}
 
	@Override
	public String getOwnerban() {
		return this.ownerban;
	}
 
	@Override
	public void setOwnerban(final String ownerban) {
		this.ownerban = ownerban; 
	}
 
	@Override
	public String getStgplace() {
		return this.stgplace;
	}
 
	@Override
	public void setStgplace(final String stgplace) {
		this.stgplace = stgplace; 
	}
 
	@Override
	public String getDecltype() {
		return this.decltype;
	}
 
	@Override
	public void setDecltype(final String decltype) {
		this.decltype = decltype; 
	}
 
	@Override
	public String getSendtype() {
		return this.sendtype;
	}
 
	@Override
	public void setSendtype(final String sendtype) {
		this.sendtype = sendtype; 
	}
 
	@Override
	public String getDestin01() {
		return this.destin01;
	}
 
	@Override
	public void setDestin01(final String destin01) {
		this.destin01 = destin01; 
	}
 
	@Override
	public String getDestin02() {
		return this.destin02;
	}
 
	@Override
	public void setDestin02(final String destin02) {
		this.destin02 = destin02; 
	}
 
	@Override
	public String getDestin03() {
		return this.destin03;
	}
 
	@Override
	public void setDestin03(final String destin03) {
		this.destin03 = destin03; 
	}
 
	@Override
	public String getDestin04() {
		return this.destin04;
	}
 
	@Override
	public void setDestin04(final String destin04) {
		this.destin04 = destin04; 
	}
 
	@Override
	public String getDestin05() {
		return this.destin05;
	}
 
	@Override
	public void setDestin05(final String destin05) {
		this.destin05 = destin05; 
	}
 
	@Override
	public String getActivedate() {
		return this.activedate;
	}
 
	@Override
	public void setActivedate(final String activedate) {
		this.activedate = activedate; 
	}
 
	@Override
	public String getEnddate() {
		return this.enddate;
	}
 
	@Override
	public void setEnddate(final String enddate) {
		this.enddate = enddate; 
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
