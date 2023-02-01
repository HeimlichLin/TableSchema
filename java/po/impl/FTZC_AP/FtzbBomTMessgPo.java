package com.doc.common.po.impl; 
 
public class FtzbBomTMessgPo implements IFtzbBomTMessgPo {
 
	public enum COLUMNS {
		BOMFILE("null"), //
		MSGTYPE("null"), //
		COCOMPNO("null"), //
		CTMCODE("null"), //
		BONDNO("null"), //
		PROCESS("null"), //
		BOMDATE("null"), //
		GOODTYPE("null"), //
		PRDTNO("null"), //
		PRDTNAME("null"), //
		PRDTUNIT("null"), //
		PARTNO("null"), //
		SERIALNO("null"), //
		PARTNAME("null"), //
		UNITQTY("null"), //
		UNIT("null"), //
		BEGINDATE("null"), //
		ENDDATE("null"), //
		BOMTYPE("null"), //
		PRDTTYPE("null"), //
		RECVDATE("null"), //
		ICONFIRMED("null"), //
		BOMNO("null"), //
		APPROVEDNO("null"), //
		APPROVEDDATE("null"), //
		SEQNO("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String bomfile;
	private String msgtype;
	private String cocompno;
	private String ctmcode;
	private String bondno;
	private String process;
	private String bomdate;
	private String goodtype;
	private String prdtno;
	private String prdtname;
	private String prdtunit;
	private String partno;
	private BigDecimal serialno;
	private String partname;
	private BigDecimal unitqty;
	private String unit;
	private String begindate;
	private String enddate;
	private String bomtype;
	private String prdttype;
	private String recvdate;
	private String iconfirmed;
	private String bomno;
	private String approvedno;
	private String approveddate;
	private BigDecimal seqno;

	@Override
	public String getBomfile() {
		return this.bomfile;
	}
 
	@Override
	public void setBomfile(final String bomfile) {
		this.bomfile = bomfile; 
	}
 
	@Override
	public String getMsgtype() {
		return this.msgtype;
	}
 
	@Override
	public void setMsgtype(final String msgtype) {
		this.msgtype = msgtype; 
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
	public String getCtmcode() {
		return this.ctmcode;
	}
 
	@Override
	public void setCtmcode(final String ctmcode) {
		this.ctmcode = ctmcode; 
	}
 
	@Override
	public String getBondno() {
		return this.bondno;
	}
 
	@Override
	public void setBondno(final String bondno) {
		this.bondno = bondno; 
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
	public String getBomdate() {
		return this.bomdate;
	}
 
	@Override
	public void setBomdate(final String bomdate) {
		this.bomdate = bomdate; 
	}
 
	@Override
	public String getGoodtype() {
		return this.goodtype;
	}
 
	@Override
	public void setGoodtype(final String goodtype) {
		this.goodtype = goodtype; 
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
	public String getPrdtunit() {
		return this.prdtunit;
	}
 
	@Override
	public void setPrdtunit(final String prdtunit) {
		this.prdtunit = prdtunit; 
	}
 
	@Override
	public String getPartno() {
		return this.partno;
	}
 
	@Override
	public void setPartno(final String partno) {
		this.partno = partno; 
	}
 
	@Override
	public BigDecimal getSerialno() {
		return this.serialno;
	}
 
	@Override
	public void setSerialno(final BigDecimal serialno) {
		this.serialno = serialno; 
	}
 
	@Override
	public String getPartname() {
		return this.partname;
	}
 
	@Override
	public void setPartname(final String partname) {
		this.partname = partname; 
	}
 
	@Override
	public BigDecimal getUnitqty() {
		return this.unitqty;
	}
 
	@Override
	public void setUnitqty(final BigDecimal unitqty) {
		this.unitqty = unitqty; 
	}
 
	@Override
	public String getUnit() {
		return this.unit;
	}
 
	@Override
	public void setUnit(final String unit) {
		this.unit = unit; 
	}
 
	@Override
	public String getBegindate() {
		return this.begindate;
	}
 
	@Override
	public void setBegindate(final String begindate) {
		this.begindate = begindate; 
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
	public String getBomtype() {
		return this.bomtype;
	}
 
	@Override
	public void setBomtype(final String bomtype) {
		this.bomtype = bomtype; 
	}
 
	@Override
	public String getPrdttype() {
		return this.prdttype;
	}
 
	@Override
	public void setPrdttype(final String prdttype) {
		this.prdttype = prdttype; 
	}
 
	@Override
	public String getRecvdate() {
		return this.recvdate;
	}
 
	@Override
	public void setRecvdate(final String recvdate) {
		this.recvdate = recvdate; 
	}
 
	@Override
	public String getIconfirmed() {
		return this.iconfirmed;
	}
 
	@Override
	public void setIconfirmed(final String iconfirmed) {
		this.iconfirmed = iconfirmed; 
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
	public BigDecimal getSeqno() {
		return this.seqno;
	}
 
	@Override
	public void setSeqno(final BigDecimal seqno) {
		this.seqno = seqno; 
	}
 
}
