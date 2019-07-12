package com.doc.common.bean; 
 
public class Msg5108sDo { 
 
	public enum COLUMNS { 
		BONDNO("null"), 
		PROCESSID("null"), 
		RESPONDCODE("null"), 
		AMENDCODE1("null"), 
		AMENDCODE2("null"), 
		AMENDCODE3("null"), 
		AMENDCODE4("null"), 
		AMENDCODE5("null"), 
		AMENDCODE6("null"), 
		AMENDCODE7("null"), 
		AMENDCODE8("null"), 
		AMENDCODE9("null"), 
		OLDMSGTYPE("null"), 
		OLDSERIALNO("null"), 
		VMNO("null"), 
		CONVEYANCE("null"), 
		VRNO("null"), 
		CONSIGNNUM("null"), 
		FINALNUM("null"), 
		RECEIPTNUM("null"), 
		EMPTYNUM("null"), 
		INTCTLNO("null"), 
		SENDTIME("null"), 
		MSGREFNO("null"), 
		CONTRNO("null") 
		; 
		final String name; 
	 
		private COLUMNS(final String name) { 
			this.name = name; 
		} 
	 
		public String getName() { 
			return this.name; 
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
	
	public String getBondno() { 
		return bondno; 
	} 
 
	public void setBondno(String bondno) { 
		this.bondno = bondno; 
	} 
 
	public String getProcessid() { 
		return processid; 
	} 
 
	public void setProcessid(String processid) { 
		this.processid = processid; 
	} 
 
	public String getRespondcode() { 
		return respondcode; 
	} 
 
	public void setRespondcode(String respondcode) { 
		this.respondcode = respondcode; 
	} 
 
	public String getAmendcode1() { 
		return amendcode1; 
	} 
 
	public void setAmendcode1(String amendcode1) { 
		this.amendcode1 = amendcode1; 
	} 
 
	public String getAmendcode2() { 
		return amendcode2; 
	} 
 
	public void setAmendcode2(String amendcode2) { 
		this.amendcode2 = amendcode2; 
	} 
 
	public String getAmendcode3() { 
		return amendcode3; 
	} 
 
	public void setAmendcode3(String amendcode3) { 
		this.amendcode3 = amendcode3; 
	} 
 
	public String getAmendcode4() { 
		return amendcode4; 
	} 
 
	public void setAmendcode4(String amendcode4) { 
		this.amendcode4 = amendcode4; 
	} 
 
	public String getAmendcode5() { 
		return amendcode5; 
	} 
 
	public void setAmendcode5(String amendcode5) { 
		this.amendcode5 = amendcode5; 
	} 
 
	public String getAmendcode6() { 
		return amendcode6; 
	} 
 
	public void setAmendcode6(String amendcode6) { 
		this.amendcode6 = amendcode6; 
	} 
 
	public String getAmendcode7() { 
		return amendcode7; 
	} 
 
	public void setAmendcode7(String amendcode7) { 
		this.amendcode7 = amendcode7; 
	} 
 
	public String getAmendcode8() { 
		return amendcode8; 
	} 
 
	public void setAmendcode8(String amendcode8) { 
		this.amendcode8 = amendcode8; 
	} 
 
	public String getAmendcode9() { 
		return amendcode9; 
	} 
 
	public void setAmendcode9(String amendcode9) { 
		this.amendcode9 = amendcode9; 
	} 
 
	public String getOldmsgtype() { 
		return oldmsgtype; 
	} 
 
	public void setOldmsgtype(String oldmsgtype) { 
		this.oldmsgtype = oldmsgtype; 
	} 
 
	public String getOldserialno() { 
		return oldserialno; 
	} 
 
	public void setOldserialno(String oldserialno) { 
		this.oldserialno = oldserialno; 
	} 
 
	public String getVmno() { 
		return vmno; 
	} 
 
	public void setVmno(String vmno) { 
		this.vmno = vmno; 
	} 
 
	public String getConveyance() { 
		return conveyance; 
	} 
 
	public void setConveyance(String conveyance) { 
		this.conveyance = conveyance; 
	} 
 
	public String getVrno() { 
		return vrno; 
	} 
 
	public void setVrno(String vrno) { 
		this.vrno = vrno; 
	} 
 
	public String getConsignnum() { 
		return consignnum; 
	} 
 
	public void setConsignnum(String consignnum) { 
		this.consignnum = consignnum; 
	} 
 
	public BigDecimal getFinalnum() { 
		return finalnum; 
	} 
 
	public void setFinalnum(BigDecimal finalnum) { 
		this.finalnum = finalnum; 
	} 
 
	public BigDecimal getReceiptnum() { 
		return receiptnum; 
	} 
 
	public void setReceiptnum(BigDecimal receiptnum) { 
		this.receiptnum = receiptnum; 
	} 
 
	public BigDecimal getEmptynum() { 
		return emptynum; 
	} 
 
	public void setEmptynum(BigDecimal emptynum) { 
		this.emptynum = emptynum; 
	} 
 
	public String getIntctlno() { 
		return intctlno; 
	} 
 
	public void setIntctlno(String intctlno) { 
		this.intctlno = intctlno; 
	} 
 
	public java.sql.Timestamp getSendtime() { 
		return sendtime; 
	} 
 
	public void setSendtime(java.sql.Timestamp sendtime) { 
		this.sendtime = sendtime; 
	} 
 
	public String getMsgrefno() { 
		return msgrefno; 
	} 
 
	public void setMsgrefno(String msgrefno) { 
		this.msgrefno = msgrefno; 
	} 
 
	public String getContrno() { 
		return contrno; 
	} 
 
	public void setContrno(String contrno) { 
		this.contrno = contrno; 
	} 
 
} 
