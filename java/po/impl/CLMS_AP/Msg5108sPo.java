package com.doc.common.po.impl; 
 
public class Msg5108sPo implements IMsg5108sPo {
 
	public enum COLUMNS {
		BONDNO("null"), //
		PROCESSID("null"), //
		RESPONDCODE("null"), //
		AMENDCODE1("null"), //
		AMENDCODE2("null"), //
		AMENDCODE3("null"), //
		AMENDCODE4("null"), //
		AMENDCODE5("null"), //
		AMENDCODE6("null"), //
		AMENDCODE7("null"), //
		AMENDCODE8("null"), //
		AMENDCODE9("null"), //
		OLDMSGTYPE("null"), //
		OLDSERIALNO("null"), //
		VMNO("null"), //
		CONVEYANCE("null"), //
		VRNO("null"), //
		CONSIGNNUM("null"), //
		FINALNUM("null"), //
		RECEIPTNUM("null"), //
		EMPTYNUM("null"), //
		INTCTLNO("null"), //
		SENDTIME("null"), //
		MSGREFNO("null"), //
		CONTRNO("null") //
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
	private String processid;
	private String respondcode;
	private String amendcode1;
	private String amendcode2;
	private String amendcode3;
	private String amendcode4;
	private String amendcode5;
	private String amendcode6;
	private String amendcode7;
	private String amendcode8;
	private String amendcode9;
	private String oldmsgtype;
	private String oldserialno;
	private String vmno;
	private String conveyance;
	private String vrno;
	private String consignnum;
	private BigDecimal finalnum;
	private BigDecimal receiptnum;
	private BigDecimal emptynum;
	private String intctlno;
	private java.sql.Timestamp sendtime;
	private String msgrefno;
	private String contrno;

	@Override
	public String getBondno() {
		return this.bondno;
	}
 
	@Override
	public void setBondno(final String bondno) {
		this.bondno = bondno; 
	}
 
	@Override
	public String getProcessid() {
		return this.processid;
	}
 
	@Override
	public void setProcessid(final String processid) {
		this.processid = processid; 
	}
 
	@Override
	public String getRespondcode() {
		return this.respondcode;
	}
 
	@Override
	public void setRespondcode(final String respondcode) {
		this.respondcode = respondcode; 
	}
 
	@Override
	public String getAmendcode1() {
		return this.amendcode1;
	}
 
	@Override
	public void setAmendcode1(final String amendcode1) {
		this.amendcode1 = amendcode1; 
	}
 
	@Override
	public String getAmendcode2() {
		return this.amendcode2;
	}
 
	@Override
	public void setAmendcode2(final String amendcode2) {
		this.amendcode2 = amendcode2; 
	}
 
	@Override
	public String getAmendcode3() {
		return this.amendcode3;
	}
 
	@Override
	public void setAmendcode3(final String amendcode3) {
		this.amendcode3 = amendcode3; 
	}
 
	@Override
	public String getAmendcode4() {
		return this.amendcode4;
	}
 
	@Override
	public void setAmendcode4(final String amendcode4) {
		this.amendcode4 = amendcode4; 
	}
 
	@Override
	public String getAmendcode5() {
		return this.amendcode5;
	}
 
	@Override
	public void setAmendcode5(final String amendcode5) {
		this.amendcode5 = amendcode5; 
	}
 
	@Override
	public String getAmendcode6() {
		return this.amendcode6;
	}
 
	@Override
	public void setAmendcode6(final String amendcode6) {
		this.amendcode6 = amendcode6; 
	}
 
	@Override
	public String getAmendcode7() {
		return this.amendcode7;
	}
 
	@Override
	public void setAmendcode7(final String amendcode7) {
		this.amendcode7 = amendcode7; 
	}
 
	@Override
	public String getAmendcode8() {
		return this.amendcode8;
	}
 
	@Override
	public void setAmendcode8(final String amendcode8) {
		this.amendcode8 = amendcode8; 
	}
 
	@Override
	public String getAmendcode9() {
		return this.amendcode9;
	}
 
	@Override
	public void setAmendcode9(final String amendcode9) {
		this.amendcode9 = amendcode9; 
	}
 
	@Override
	public String getOldmsgtype() {
		return this.oldmsgtype;
	}
 
	@Override
	public void setOldmsgtype(final String oldmsgtype) {
		this.oldmsgtype = oldmsgtype; 
	}
 
	@Override
	public String getOldserialno() {
		return this.oldserialno;
	}
 
	@Override
	public void setOldserialno(final String oldserialno) {
		this.oldserialno = oldserialno; 
	}
 
	@Override
	public String getVmno() {
		return this.vmno;
	}
 
	@Override
	public void setVmno(final String vmno) {
		this.vmno = vmno; 
	}
 
	@Override
	public String getConveyance() {
		return this.conveyance;
	}
 
	@Override
	public void setConveyance(final String conveyance) {
		this.conveyance = conveyance; 
	}
 
	@Override
	public String getVrno() {
		return this.vrno;
	}
 
	@Override
	public void setVrno(final String vrno) {
		this.vrno = vrno; 
	}
 
	@Override
	public String getConsignnum() {
		return this.consignnum;
	}
 
	@Override
	public void setConsignnum(final String consignnum) {
		this.consignnum = consignnum; 
	}
 
	@Override
	public BigDecimal getFinalnum() {
		return this.finalnum;
	}
 
	@Override
	public void setFinalnum(final BigDecimal finalnum) {
		this.finalnum = finalnum; 
	}
 
	@Override
	public BigDecimal getReceiptnum() {
		return this.receiptnum;
	}
 
	@Override
	public void setReceiptnum(final BigDecimal receiptnum) {
		this.receiptnum = receiptnum; 
	}
 
	@Override
	public BigDecimal getEmptynum() {
		return this.emptynum;
	}
 
	@Override
	public void setEmptynum(final BigDecimal emptynum) {
		this.emptynum = emptynum; 
	}
 
	@Override
	public String getIntctlno() {
		return this.intctlno;
	}
 
	@Override
	public void setIntctlno(final String intctlno) {
		this.intctlno = intctlno; 
	}
 
	@Override
	public java.sql.Timestamp getSendtime() {
		return this.sendtime;
	}
 
	@Override
	public void setSendtime(final java.sql.Timestamp sendtime) {
		this.sendtime = sendtime; 
	}
 
	@Override
	public String getMsgrefno() {
		return this.msgrefno;
	}
 
	@Override
	public void setMsgrefno(final String msgrefno) {
		this.msgrefno = msgrefno; 
	}
 
	@Override
	public String getContrno() {
		return this.contrno;
	}
 
	@Override
	public void setContrno(final String contrno) {
		this.contrno = contrno; 
	}
 
}
