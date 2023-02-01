package com.doc.common.po.impl; 
 
public class GrntbillPo implements IGrntbillPo {
 
	public enum COLUMNS {
		BONDNO("監管編號"), //
		BILLNO("保證金單號"), //
		DEPSDATE("繳納日期"), //
		DEPSAMT("繳納金額"), //
		RMKS("備註"), //
		MSGFUN("異動別"), //
		VALIDDATE("擔保有效(截止)日期") //
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
	private String billno;
	private String depsdate;
	private BigDecimal depsamt;
	private String rmks;
	private String msgfun;
	private String validdate;

	@Override
	public String getBondno() {
		return this.bondno;
	}
 
	@Override
	public void setBondno(final String bondno) {
		this.bondno = bondno; 
	}
 
	@Override
	public String getBillno() {
		return this.billno;
	}
 
	@Override
	public void setBillno(final String billno) {
		this.billno = billno; 
	}
 
	@Override
	public String getDepsdate() {
		return this.depsdate;
	}
 
	@Override
	public void setDepsdate(final String depsdate) {
		this.depsdate = depsdate; 
	}
 
	@Override
	public BigDecimal getDepsamt() {
		return this.depsamt;
	}
 
	@Override
	public void setDepsamt(final BigDecimal depsamt) {
		this.depsamt = depsamt; 
	}
 
	@Override
	public String getRmks() {
		return this.rmks;
	}
 
	@Override
	public void setRmks(final String rmks) {
		this.rmks = rmks; 
	}
 
	@Override
	public String getMsgfun() {
		return this.msgfun;
	}
 
	@Override
	public void setMsgfun(final String msgfun) {
		this.msgfun = msgfun; 
	}
 
	@Override
	public String getValiddate() {
		return this.validdate;
	}
 
	@Override
	public void setValiddate(final String validdate) {
		this.validdate = validdate; 
	}
 
}
