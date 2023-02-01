package com.doc.common.po; 
 
public interface IOtgMsgLogMnetPo {
 
	String getCodMsgTyp();
 
	void setCodMsgTyp(final String codMsgTyp);
 
	java.sql.Timestamp getDatMsgLog();
 
	void setDatMsgLog(final java.sql.Timestamp datMsgLog);
 
	String getCodSeqNum();
 
	void setCodSeqNum(final String codSeqNum);
 
	String getCodMsgVer();
 
	void setCodMsgVer(final String codMsgVer);
 
	String getDesMsgHdr();
 
	void setDesMsgHdr(final String desMsgHdr);
 
	String getMintNum();
 
	void setMintNum(final String mintNum);
 
	String getSitaNum();
 
	void setSitaNum(final String sitaNum);
 
	String getDesErr();
 
	void setDesErr(final String desErr);
 
	String getDesMsg();
 
	void setDesMsg(final String desMsg);
 
	String getFlgMnet();
 
	void setFlgMnet(final String flgMnet);
 
	String getCodDstAdd();
 
	void setCodDstAdd(final String codDstAdd);
 
	String getTlxPriCod();
 
	void setTlxPriCod(final String tlxPriCod);
 
	String getOriChgCod();
 
	void setOriChgCod(final String oriChgCod);
 
	String getCodEvaAcc();
 
	void setCodEvaAcc(final String codEvaAcc);
 
	String getCodOriAdd();
 
	void setCodOriAdd(final String codOriAdd);
 
}
