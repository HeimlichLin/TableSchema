package com.doc.common.po.impl; 
 
public class FtzbBomPo implements IFtzbBomPo {
 
	public enum COLUMNS {
		BONDNO("監管編號"), //
		CTMCODE("客戶代碼"), //
		PRDTNO("產品料號"), //
		PRDTNAME("產品名稱"), //
		PRDTSPEC("產品規格"), //
		PRDTUNIT("產品單位"), //
		PROCESS("加工方式
1:重整 2:加工 3:分類 4:分割 5:裝配 6:重裝 7:檢測 8:委外拆料"), //
		WHS("工時"), //
		APPROVEDNO("核准文號"), //
		BOMNO("用料清表編號"), //
		BOMDATE("用料清表日期"), //
		BOMTYPE("貨物狀態"), //
		COCOMPNO("協力廠商"), //
		RMK("備註"), //
		SEQNO("序號") //
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
	private String prdtno;
	private String prdtname;
	private String prdtspec;
	private String prdtunit;
	private String process;
	private BigDecimal whs;
	private String approvedno;
	private String bomno;
	private String bomdate;
	private String bomtype;
	private String cocompno;
	private String rmk;
	private BigDecimal seqno;

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
	public String getPrdtno() {
		return this.prdtno;
	}
 
	@Override
	public void setPrdtno(final String prdtno) {
		this.prdtno = prdtno; 
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
	public String getPrdtunit() {
		return this.prdtunit;
	}
 
	@Override
	public void setPrdtunit(final String prdtunit) {
		this.prdtunit = prdtunit; 
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
	public BigDecimal getWhs() {
		return this.whs;
	}
 
	@Override
	public void setWhs(final BigDecimal whs) {
		this.whs = whs; 
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
	public String getBomno() {
		return this.bomno;
	}
 
	@Override
	public void setBomno(final String bomno) {
		this.bomno = bomno; 
	}
 
	@Override
	public String getBomdate() {
		return this.bomdate;
	}
 
	@Override
	public void setBomdate(final String bomdate) {
		this.bomdate = bomdate; 
	}
 
	@Override
	public String getBomtype() {
		return this.bomtype;
	}
 
	@Override
	public void setBomtype(final String bomtype) {
		this.bomtype = bomtype; 
	}
 
	@Override
	public String getCocompno() {
		return this.cocompno;
	}
 
	@Override
	public void setCocompno(final String cocompno) {
		this.cocompno = cocompno; 
	}
 
	@Override
	public String getRmk() {
		return this.rmk;
	}
 
	@Override
	public void setRmk(final String rmk) {
		this.rmk = rmk; 
	}
 
	@Override
	public BigDecimal getSeqno() {
		return this.seqno;
	}
 
	@Override
	public void setSeqno(final BigDecimal seqno) {
		this.seqno = seqno; 
	}
 
}
