package com.doc.common.po.impl; 
 
public class WorkorderPo implements IWorkorderPo {
 
	public enum COLUMNS {
		BONDNO("監管編號"), //
		WORKNO("加工單號"), //
		CTMCODE("客戶代碼(客戶編碼)"), //
		PRDTNO("產品號碼(料號)"), //
		PRDTQTY("產品數量"), //
		RSTRQTY("進倉數量"), //
		PRDTUNIT("產品單位"), //
		REQRDATE("需求日期"), //
		APPLYDATE("申請日期"), //
		APPROVEDNO("核准文號"), //
		APPROVEDDATE("核准日期"), //
		PRDTNAME("產品名稱"), //
		PRDTSPEC("產品規格"), //
		PROCESS("加工方式"), //
		D8DATE("原進倉報單日期") //
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
	private String workno;
	private String ctmcode;
	private String prdtno;
	private BigDecimal prdtqty;
	private BigDecimal rstrqty;
	private String prdtunit;
	private String reqrdate;
	private String applydate;
	private String approvedno;
	private String approveddate;
	private String prdtname;
	private String prdtspec;
	private String process;
	private String d8date;

	@Override
	public String getBondno() {
		return this.bondno;
	}
 
	@Override
	public void setBondno(final String bondno) {
		this.bondno = bondno; 
	}
 
	@Override
	public String getWorkno() {
		return this.workno;
	}
 
	@Override
	public void setWorkno(final String workno) {
		this.workno = workno; 
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
	public String getPrdtno() {
		return this.prdtno;
	}
 
	@Override
	public void setPrdtno(final String prdtno) {
		this.prdtno = prdtno; 
	}
 
	@Override
	public BigDecimal getPrdtqty() {
		return this.prdtqty;
	}
 
	@Override
	public void setPrdtqty(final BigDecimal prdtqty) {
		this.prdtqty = prdtqty; 
	}
 
	@Override
	public BigDecimal getRstrqty() {
		return this.rstrqty;
	}
 
	@Override
	public void setRstrqty(final BigDecimal rstrqty) {
		this.rstrqty = rstrqty; 
	}
 
	@Override
	public String getPrdtunit() {
		return this.prdtunit;
	}
 
	@Override
	public void setPrdtunit(final String prdtunit) {
		this.prdtunit = prdtunit; 
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
	public String getApprovedno() {
		return this.approvedno;
	}
 
	@Override
	public void setApprovedno(final String approvedno) {
		this.approvedno = approvedno; 
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
	public String getPrdtname() {
		return this.prdtname;
	}
 
	@Override
	public void setPrdtname(final String prdtname) {
		this.prdtname = prdtname; 
	}
 
	@Override
	public String getPrdtspec() {
		return this.prdtspec;
	}
 
	@Override
	public void setPrdtspec(final String prdtspec) {
		this.prdtspec = prdtspec; 
	}
 
	@Override
	public String getProcess() {
		return this.process;
	}
 
	@Override
	public void setProcess(final String process) {
		this.process = process; 
	}
 
	@Override
	public String getD8date() {
		return this.d8date;
	}
 
	@Override
	public void setD8date(final String d8date) {
		this.d8date = d8date; 
	}
 
}
