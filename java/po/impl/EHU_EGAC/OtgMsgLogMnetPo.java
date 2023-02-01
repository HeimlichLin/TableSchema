package com.doc.common.po.impl; 
 
public class OtgMsgLogMnetPo implements IOtgMsgLogMnetPo {
 
	public enum COLUMNS {
		COD_MSG_TYP("null"), //
		DAT_MSG_LOG("null"), //
		COD_SEQ_NUM("null"), //
		COD_MSG_VER("null"), //
		DES_MSG_HDR("null"), //
		MINT_NUM("null"), //
		SITA_NUM("null"), //
		DES_ERR("null"), //
		DES_MSG("null"), //
		FLG_MNET("null"), //
		COD_DST_ADD("null"), //
		TLX_PRI_COD("null"), //
		ORI_CHG_COD("null"), //
		COD_EVA_ACC("null"), //
		COD_ORI_ADD("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String codMsgTyp;
	private java.sql.Timestamp datMsgLog;
	private String codSeqNum;
	private String codMsgVer;
	private String desMsgHdr;
	private String mintNum;
	private String sitaNum;
	private String desErr;
	private String desMsg;
	private String flgMnet;
	private String codDstAdd;
	private String tlxPriCod;
	private String oriChgCod;
	private String codEvaAcc;
	private String codOriAdd;

	@Override
	public String getCodMsgTyp() {
		return this.codMsgTyp;
	}
 
	@Override
	public void setCodMsgTyp(final String codMsgTyp) {
		this.codMsgTyp = codMsgTyp; 
	}
 
	@Override
	public java.sql.Timestamp getDatMsgLog() {
		return this.datMsgLog;
	}
 
	@Override
	public void setDatMsgLog(final java.sql.Timestamp datMsgLog) {
		this.datMsgLog = datMsgLog; 
	}
 
	@Override
	public String getCodSeqNum() {
		return this.codSeqNum;
	}
 
	@Override
	public void setCodSeqNum(final String codSeqNum) {
		this.codSeqNum = codSeqNum; 
	}
 
	@Override
	public String getCodMsgVer() {
		return this.codMsgVer;
	}
 
	@Override
	public void setCodMsgVer(final String codMsgVer) {
		this.codMsgVer = codMsgVer; 
	}
 
	@Override
	public String getDesMsgHdr() {
		return this.desMsgHdr;
	}
 
	@Override
	public void setDesMsgHdr(final String desMsgHdr) {
		this.desMsgHdr = desMsgHdr; 
	}
 
	@Override
	public String getMintNum() {
		return this.mintNum;
	}
 
	@Override
	public void setMintNum(final String mintNum) {
		this.mintNum = mintNum; 
	}
 
	@Override
	public String getSitaNum() {
		return this.sitaNum;
	}
 
	@Override
	public void setSitaNum(final String sitaNum) {
		this.sitaNum = sitaNum; 
	}
 
	@Override
	public String getDesErr() {
		return this.desErr;
	}
 
	@Override
	public void setDesErr(final String desErr) {
		this.desErr = desErr; 
	}
 
	@Override
	public String getDesMsg() {
		return this.desMsg;
	}
 
	@Override
	public void setDesMsg(final String desMsg) {
		this.desMsg = desMsg; 
	}
 
	@Override
	public String getFlgMnet() {
		return this.flgMnet;
	}
 
	@Override
	public void setFlgMnet(final String flgMnet) {
		this.flgMnet = flgMnet; 
	}
 
	@Override
	public String getCodDstAdd() {
		return this.codDstAdd;
	}
 
	@Override
	public void setCodDstAdd(final String codDstAdd) {
		this.codDstAdd = codDstAdd; 
	}
 
	@Override
	public String getTlxPriCod() {
		return this.tlxPriCod;
	}
 
	@Override
	public void setTlxPriCod(final String tlxPriCod) {
		this.tlxPriCod = tlxPriCod; 
	}
 
	@Override
	public String getOriChgCod() {
		return this.oriChgCod;
	}
 
	@Override
	public void setOriChgCod(final String oriChgCod) {
		this.oriChgCod = oriChgCod; 
	}
 
	@Override
	public String getCodEvaAcc() {
		return this.codEvaAcc;
	}
 
	@Override
	public void setCodEvaAcc(final String codEvaAcc) {
		this.codEvaAcc = codEvaAcc; 
	}
 
	@Override
	public String getCodOriAdd() {
		return this.codOriAdd;
	}
 
	@Override
	public void setCodOriAdd(final String codOriAdd) {
		this.codOriAdd = codOriAdd; 
	}
 
}
