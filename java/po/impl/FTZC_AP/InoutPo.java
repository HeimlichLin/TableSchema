package com.doc.common.po.impl; 
 
public class InoutPo implements IInoutPo {
 
	public enum COLUMNS {
		TRANS_ID("交易ID"), //
		BF_NO("監管編號"), //
		DELIVER_TYPE("進出倉類別"), //
		DELIVER_NO("進出倉單號"), //
		INVTRY_TYPE("帳務別"), //
		CTM_CODE("客戶代碼"), //
		COCOMP_NO("協力廠商"), //
		DECL_NO("進出倉報單號碼"), //
		DECL_TYPE("進出倉報單類別"), //
		REF_DOC_NO("進出倉參考文件號碼
"), //
		REF_DOC_VER("進出倉參考文件版本"), //
		BATCH_STATUS("null"), //
		USER_ID("null"), //
		DECL_SEQ_NO("報單序號(5205使用)"), //
		MAWB_NO("主提單號"), //
		HAWB_NO("分提單號") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String transId;
	private String bfNo;
	private String deliverType;
	private String deliverNo;
	private String invtryType;
	private String ctmCode;
	private String cocompNo;
	private String declNo;
	private String declType;
	private String refDocNo;
	private String refDocVer;
	private String batchStatus;
	private String userId;
	private BigDecimal declSeqNo;
	private String mawbNo;
	private String hawbNo;

	@Override
	public String getTransId() {
		return this.transId;
	}
 
	@Override
	public void setTransId(final String transId) {
		this.transId = transId; 
	}
 
	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
	}
 
	@Override
	public String getDeliverType() {
		return this.deliverType;
	}
 
	@Override
	public void setDeliverType(final String deliverType) {
		this.deliverType = deliverType; 
	}
 
	@Override
	public String getDeliverNo() {
		return this.deliverNo;
	}
 
	@Override
	public void setDeliverNo(final String deliverNo) {
		this.deliverNo = deliverNo; 
	}
 
	@Override
	public String getInvtryType() {
		return this.invtryType;
	}
 
	@Override
	public void setInvtryType(final String invtryType) {
		this.invtryType = invtryType; 
	}
 
	@Override
	public String getCtmCode() {
		return this.ctmCode;
	}
 
	@Override
	public void setCtmCode(final String ctmCode) {
		this.ctmCode = ctmCode; 
	}
 
	@Override
	public String getCocompNo() {
		return this.cocompNo;
	}
 
	@Override
	public void setCocompNo(final String cocompNo) {
		this.cocompNo = cocompNo; 
	}
 
	@Override
	public String getDeclNo() {
		return this.declNo;
	}
 
	@Override
	public void setDeclNo(final String declNo) {
		this.declNo = declNo; 
	}
 
	@Override
	public String getDeclType() {
		return this.declType;
	}
 
	@Override
	public void setDeclType(final String declType) {
		this.declType = declType; 
	}
 
	@Override
	public String getRefDocNo() {
		return this.refDocNo;
	}
 
	@Override
	public void setRefDocNo(final String refDocNo) {
		this.refDocNo = refDocNo; 
	}
 
	@Override
	public String getRefDocVer() {
		return this.refDocVer;
	}
 
	@Override
	public void setRefDocVer(final String refDocVer) {
		this.refDocVer = refDocVer; 
	}
 
	@Override
	public String getBatchStatus() {
		return this.batchStatus;
	}
 
	@Override
	public void setBatchStatus(final String batchStatus) {
		this.batchStatus = batchStatus; 
	}
 
	@Override
	public String getUserId() {
		return this.userId;
	}
 
	@Override
	public void setUserId(final String userId) {
		this.userId = userId; 
	}
 
	@Override
	public BigDecimal getDeclSeqNo() {
		return this.declSeqNo;
	}
 
	@Override
	public void setDeclSeqNo(final BigDecimal declSeqNo) {
		this.declSeqNo = declSeqNo; 
	}
 
	@Override
	public String getMawbNo() {
		return this.mawbNo;
	}
 
	@Override
	public void setMawbNo(final String mawbNo) {
		this.mawbNo = mawbNo; 
	}
 
	@Override
	public String getHawbNo() {
		return this.hawbNo;
	}
 
	@Override
	public void setHawbNo(final String hawbNo) {
		this.hawbNo = hawbNo; 
	}
 
}
