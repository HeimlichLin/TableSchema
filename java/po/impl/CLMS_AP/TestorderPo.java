package com.doc.common.po.impl; 
 
public class TestorderPo implements ITestorderPo {
 
	public enum COLUMNS {
		BONDNO("監管編號"), //
		TESTNO("委外單號"), //
		CTMCODE("客戶編碼"), //
		SUBCODE("委外商代碼"), //
		REQRDATE("需求日期"), //
		APPLYDATE("申請日期"), //
		APPRVNO("核准文號"), //
		APPROVEDDATE("核准日期"), //
		DESTPLACE("運往地"), //
		TESTTYPE("類別"), //
		CONFIRMDATE("系統日期") //
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
	private String testno;
	private String ctmcode;
	private String subcode;
	private String reqrdate;
	private String applydate;
	private String apprvno;
	private String approveddate;
	private String destplace;
	private String testtype;
	private String confirmdate;

	@Override
	public String getBondno() {
		return this.bondno;
	}
 
	@Override
	public void setBondno(final String bondno) {
		this.bondno = bondno; 
	}
 
	@Override
	public String getTestno() {
		return this.testno;
	}
 
	@Override
	public void setTestno(final String testno) {
		this.testno = testno; 
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
	public String getSubcode() {
		return this.subcode;
	}
 
	@Override
	public void setSubcode(final String subcode) {
		this.subcode = subcode; 
	}
 
	@Override
	public String getReqrdate() {
		return this.reqrdate;
	}
 
	@Override
	public void setReqrdate(final String reqrdate) {
		this.reqrdate = reqrdate; 
	}
 
	@Override
	public String getApplydate() {
		return this.applydate;
	}
 
	@Override
	public void setApplydate(final String applydate) {
		this.applydate = applydate; 
	}
 
	@Override
	public String getApprvno() {
		return this.apprvno;
	}
 
	@Override
	public void setApprvno(final String apprvno) {
		this.apprvno = apprvno; 
	}
 
	@Override
	public String getApproveddate() {
		return this.approveddate;
	}
 
	@Override
	public void setApproveddate(final String approveddate) {
		this.approveddate = approveddate; 
	}
 
	@Override
	public String getDestplace() {
		return this.destplace;
	}
 
	@Override
	public void setDestplace(final String destplace) {
		this.destplace = destplace; 
	}
 
	@Override
	public String getTesttype() {
		return this.testtype;
	}
 
	@Override
	public void setTesttype(final String testtype) {
		this.testtype = testtype; 
	}
 
	@Override
	public String getConfirmdate() {
		return this.confirmdate;
	}
 
	@Override
	public void setConfirmdate(final String confirmdate) {
		this.confirmdate = confirmdate; 
	}
 
}
