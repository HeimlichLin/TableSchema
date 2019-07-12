package com.doc.common.bean; 
 
public class InoutDo { 
 
	public enum COLUMNS { 
		TRANS_ID("交易ID"), 
		BF_NO("監管編號"), 
		DELIVER_TYPE("進出倉類別"), 
		DELIVER_NO("進出倉單號"), 
		INVTRY_TYPE("帳務別"), 
		CTM_CODE("客戶代碼"), 
		COCOMP_NO("協力廠商"), 
		DECL_NO("進出倉報單號碼"), 
		DECL_TYPE("進出倉報單類別"), 
		REF_DOC_NO("進出倉參考文件號碼
"), 
		REF_DOC_VER("進出倉參考文件版本"), 
		BATCH_STATUS("null"), 
		USER_ID("null"), 
		DECL_SEQ_NO("報單序號(5205使用)"), 
		MAWB_NO("主提單號"), 
		HAWB_NO("分提單號") 
		; 
		final String name; 
	 
		private COLUMNS(final String name) { 
			this.name = name; 
		} 
	 
		public String getName() { 
			return this.name; 
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
	
	public String getTransId() { 
		return transId; 
	} 
 
	public void setTransId(String transId) { 
		this.transId = transId; 
	} 
 
	public String getBfNo() { 
		return bfNo; 
	} 
 
	public void setBfNo(String bfNo) { 
		this.bfNo = bfNo; 
	} 
 
	public String getDeliverType() { 
		return deliverType; 
	} 
 
	public void setDeliverType(String deliverType) { 
		this.deliverType = deliverType; 
	} 
 
	public String getDeliverNo() { 
		return deliverNo; 
	} 
 
	public void setDeliverNo(String deliverNo) { 
		this.deliverNo = deliverNo; 
	} 
 
	public String getInvtryType() { 
		return invtryType; 
	} 
 
	public void setInvtryType(String invtryType) { 
		this.invtryType = invtryType; 
	} 
 
	public String getCtmCode() { 
		return ctmCode; 
	} 
 
	public void setCtmCode(String ctmCode) { 
		this.ctmCode = ctmCode; 
	} 
 
	public String getCocompNo() { 
		return cocompNo; 
	} 
 
	public void setCocompNo(String cocompNo) { 
		this.cocompNo = cocompNo; 
	} 
 
	public String getDeclNo() { 
		return declNo; 
	} 
 
	public void setDeclNo(String declNo) { 
		this.declNo = declNo; 
	} 
 
	public String getDeclType() { 
		return declType; 
	} 
 
	public void setDeclType(String declType) { 
		this.declType = declType; 
	} 
 
	public String getRefDocNo() { 
		return refDocNo; 
	} 
 
	public void setRefDocNo(String refDocNo) { 
		this.refDocNo = refDocNo; 
	} 
 
	public String getRefDocVer() { 
		return refDocVer; 
	} 
 
	public void setRefDocVer(String refDocVer) { 
		this.refDocVer = refDocVer; 
	} 
 
	public String getBatchStatus() { 
		return batchStatus; 
	} 
 
	public void setBatchStatus(String batchStatus) { 
		this.batchStatus = batchStatus; 
	} 
 
	public String getUserId() { 
		return userId; 
	} 
 
	public void setUserId(String userId) { 
		this.userId = userId; 
	} 
 
	public BigDecimal getDeclSeqNo() { 
		return declSeqNo; 
	} 
 
	public void setDeclSeqNo(BigDecimal declSeqNo) { 
		this.declSeqNo = declSeqNo; 
	} 
 
	public String getMawbNo() { 
		return mawbNo; 
	} 
 
	public void setMawbNo(String mawbNo) { 
		this.mawbNo = mawbNo; 
	} 
 
	public String getHawbNo() { 
		return hawbNo; 
	} 
 
	public void setHawbNo(String hawbNo) { 
		this.hawbNo = hawbNo; 
	} 
 
} 
