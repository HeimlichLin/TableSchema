package com.doc.common.po.impl; 
 
public class WhRecPo implements IWhRecPo {
 
	public enum COLUMNS {
		WH_REC_SER_NO("yyyyMMddHHMMssSSS+三位流水號"), //
		AC_ID("參考：管制點資料檔"), //
		DOC_TYPE("參考：證件對應IC卡設定"), //
		DOC_NO("參考：證件對應IC卡設定"), //
		IC_NO("參考：證件對應IC卡設定"), //
		WH_DT("入倉日期時間"), //
		WH_COMMENT("入倉備註"), //
		WH_APPLY_SER_NO("參考：入倉申請"), //
		WRITE_TYPE("0：系統介接
1：線上作業"), //
		IO_TYPE("1:入倉
2：出倉
3：抽核
9：其他") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String whRecSerNo;
	private String acId;
	private String docType;
	private String docNo;
	private String icNo;
	private java.sql.Timestamp whDt;
	private String whComment;
	private String whApplySerNo;
	private String writeType;
	private String ioType;

	@Override
	public String getWhRecSerNo() {
		return this.whRecSerNo;
	}
 
	@Override
	public void setWhRecSerNo(final String whRecSerNo) {
		this.whRecSerNo = whRecSerNo; 
	}
 
	@Override
	public String getAcId() {
		return this.acId;
	}
 
	@Override
	public void setAcId(final String acId) {
		this.acId = acId; 
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
	public java.sql.Timestamp getWhDt() {
		return this.whDt;
	}
 
	@Override
	public void setWhDt(final java.sql.Timestamp whDt) {
		this.whDt = whDt; 
	}
 
	@Override
	public String getWhComment() {
		return this.whComment;
	}
 
	@Override
	public void setWhComment(final String whComment) {
		this.whComment = whComment; 
	}
 
	@Override
	public String getWhApplySerNo() {
		return this.whApplySerNo;
	}
 
	@Override
	public void setWhApplySerNo(final String whApplySerNo) {
		this.whApplySerNo = whApplySerNo; 
	}
 
	@Override
	public String getWriteType() {
		return this.writeType;
	}
 
	@Override
	public void setWriteType(final String writeType) {
		this.writeType = writeType; 
	}
 
	@Override
	public String getIoType() {
		return this.ioType;
	}
 
	@Override
	public void setIoType(final String ioType) {
		this.ioType = ioType; 
	}
 
}
