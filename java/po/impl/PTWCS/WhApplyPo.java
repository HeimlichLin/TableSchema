package com.doc.common.po.impl; 
 
public class WhApplyPo implements IWhApplyPo {
 
	public enum COLUMNS {
		WH_APPLY_SER_NO("yyyyMMddHHMMssSSS+三位流水號"), //
		IE_TYPE("01.快遞
02.進口
03.出口
04.轉口
05.機放"), //
		SCHED_IO_DT_S("申請日限制為當日起7日內
每一申請案之進出倉時間最長不得超過12小時"), //
		SCHED_IO_DT_E("申請日限制為當日起7日內
每一申請案之進出倉時間最長不得超過12小時"), //
		WH_USER_NAME("入倉人員姓名"), //
		COMP_NAME("參考：證件對應IC卡設定"), //
		DOC_TYPE("參考：證件對應IC卡設定"), //
		DOC_NO("參考：證件對應IC卡設定"), //
		IC_NO("參考：證件對應IC卡設定"), //
		DECL_NO("報單號碼"), //
		FLIGHT_NO("班機號碼"), //
		MAWB_NO("主提單主托單號碼"), //
		HAWB_NO("分提單分托運單號碼"), //
		WH_CERT("進倉證明"), //
		OTH_DOC_COMMENT("其他補充文件及說明"), //
		MAIN_ITEM_NAME("主要貨物名稱"), //
		SEND_APPLY_DT("送出申請日期時間"), //
		APPR_TYPE("多事由不同核定方式優先順序：海關櫃檯核發>海關線上核定>自動同意
0：自動同意
1：海關線上核定
2：海關櫃檯核發
"), //
		APPR_DATE("准駁時間"), //
		APPR_STATUS("01：新申請
02：同意
03：不同意
04：待補文件
05：補件後尚未核定
06：雖已補件，但仍有待補文件
07：已逾期：入倉結束日期、時間已逾目前系統日期、時間者，不得再進行修改准駁結果"), //
		APPR_REASON("准駁原因"), //
		UPDATE_USER("更新使用者"), //
		UPDATE_DATE("更新日期") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String whApplySerNo;
	private String ieType;
	private java.sql.Timestamp schedIoDtS;
	private java.sql.Timestamp schedIoDtE;
	private String whUserName;
	private String compName;
	private String docType;
	private String docNo;
	private String icNo;
	private String declNo;
	private String flightNo;
	private String mawbNo;
	private String hawbNo;
	private String whCert;
	private String othDocComment;
	private String mainItemName;
	private java.sql.Timestamp sendApplyDt;
	private String apprType;
	private java.sql.Timestamp apprDate;
	private String apprStatus;
	private String apprReason;
	private String updateUser;
	private java.sql.Timestamp updateDate;

	@Override
	public String getWhApplySerNo() {
		return this.whApplySerNo;
	}
 
	@Override
	public void setWhApplySerNo(final String whApplySerNo) {
		this.whApplySerNo = whApplySerNo; 
	}
 
	@Override
	public String getIeType() {
		return this.ieType;
	}
 
	@Override
	public void setIeType(final String ieType) {
		this.ieType = ieType; 
	}
 
	@Override
	public java.sql.Timestamp getSchedIoDtS() {
		return this.schedIoDtS;
	}
 
	@Override
	public void setSchedIoDtS(final java.sql.Timestamp schedIoDtS) {
		this.schedIoDtS = schedIoDtS; 
	}
 
	@Override
	public java.sql.Timestamp getSchedIoDtE() {
		return this.schedIoDtE;
	}
 
	@Override
	public void setSchedIoDtE(final java.sql.Timestamp schedIoDtE) {
		this.schedIoDtE = schedIoDtE; 
	}
 
	@Override
	public String getWhUserName() {
		return this.whUserName;
	}
 
	@Override
	public void setWhUserName(final String whUserName) {
		this.whUserName = whUserName; 
	}
 
	@Override
	public String getCompName() {
		return this.compName;
	}
 
	@Override
	public void setCompName(final String compName) {
		this.compName = compName; 
	}
 
	@Override
	public String getDocType() {
		return this.docType;
	}
 
	@Override
	public void setDocType(final String docType) {
		this.docType = docType; 
	}
 
	@Override
	public String getDocNo() {
		return this.docNo;
	}
 
	@Override
	public void setDocNo(final String docNo) {
		this.docNo = docNo; 
	}
 
	@Override
	public String getIcNo() {
		return this.icNo;
	}
 
	@Override
	public void setIcNo(final String icNo) {
		this.icNo = icNo; 
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
	public String getFlightNo() {
		return this.flightNo;
	}
 
	@Override
	public void setFlightNo(final String flightNo) {
		this.flightNo = flightNo; 
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
 
	@Override
	public String getWhCert() {
		return this.whCert;
	}
 
	@Override
	public void setWhCert(final String whCert) {
		this.whCert = whCert; 
	}
 
	@Override
	public String getOthDocComment() {
		return this.othDocComment;
	}
 
	@Override
	public void setOthDocComment(final String othDocComment) {
		this.othDocComment = othDocComment; 
	}
 
	@Override
	public String getMainItemName() {
		return this.mainItemName;
	}
 
	@Override
	public void setMainItemName(final String mainItemName) {
		this.mainItemName = mainItemName; 
	}
 
	@Override
	public java.sql.Timestamp getSendApplyDt() {
		return this.sendApplyDt;
	}
 
	@Override
	public void setSendApplyDt(final java.sql.Timestamp sendApplyDt) {
		this.sendApplyDt = sendApplyDt; 
	}
 
	@Override
	public String getApprType() {
		return this.apprType;
	}
 
	@Override
	public void setApprType(final String apprType) {
		this.apprType = apprType; 
	}
 
	@Override
	public java.sql.Timestamp getApprDate() {
		return this.apprDate;
	}
 
	@Override
	public void setApprDate(final java.sql.Timestamp apprDate) {
		this.apprDate = apprDate; 
	}
 
	@Override
	public String getApprStatus() {
		return this.apprStatus;
	}
 
	@Override
	public void setApprStatus(final String apprStatus) {
		this.apprStatus = apprStatus; 
	}
 
	@Override
	public String getApprReason() {
		return this.apprReason;
	}
 
	@Override
	public void setApprReason(final String apprReason) {
		this.apprReason = apprReason; 
	}
 
	@Override
	public String getUpdateUser() {
		return this.updateUser;
	}
 
	@Override
	public void setUpdateUser(final String updateUser) {
		this.updateUser = updateUser; 
	}
 
	@Override
	public java.sql.Timestamp getUpdateDate() {
		return this.updateDate;
	}
 
	@Override
	public void setUpdateDate(final java.sql.Timestamp updateDate) {
		this.updateDate = updateDate; 
	}
 
}
