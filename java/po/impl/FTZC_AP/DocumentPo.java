package com.doc.common.po.impl; 
 
public class DocumentPo implements IDocumentPo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		DOC_NO("文件單號"), //
		CREATE_DATE("文件生成日期"), //
		DOC_TYPE("文件類別:加工單(P)、拆料單(R)、維修單、檢測單(T)、報廢單(S)"), //
		CTM_CODE("客戶代碼"), //
		REF_DOC_NO("參考文件單號"), //
		REF_DOC_VER("參考文件版本"), //
		CREATOR("建置者"), //
		MODIFIER("異動者"), //
		STATUS("C:完成,E:逾期,R:還原,D:刪除"), //
		PERMIT_DATE("核准日期(報廢單使用)"), //
		PERMIT_DOC_NO("核准文號(報廢單使用)"), //
		REMARK1("目前提供報廢單的報廢方式"), //
		REMARK2("目前提供報廢單的報廢地點"), //
		REMARK3("null"), //
		DOC_DATE("申請日期"), //
		REF_DATE("報廢日期") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String bfNo;
	private String docNo;
	private String createDate;
	private String docType;
	private String ctmCode;
	private String refDocNo;
	private String refDocVer;
	private String creator;
	private String modifier;
	private String status;
	private String permitDate;
	private String permitDocNo;
	private String remark1;
	private String remark2;
	private String remark3;
	private String docDate;
	private String refDate;

	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
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
	public String getCreateDate() {
		return this.createDate;
	}
 
	@Override
	public void setCreateDate(final String createDate) {
		this.createDate = createDate; 
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
	public String getCtmCode() {
		return this.ctmCode;
	}
 
	@Override
	public void setCtmCode(final String ctmCode) {
		this.ctmCode = ctmCode; 
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
	public String getCreator() {
		return this.creator;
	}
 
	@Override
	public void setCreator(final String creator) {
		this.creator = creator; 
	}
 
	@Override
	public String getModifier() {
		return this.modifier;
	}
 
	@Override
	public void setModifier(final String modifier) {
		this.modifier = modifier; 
	}
 
	@Override
	public String getStatus() {
		return this.status;
	}
 
	@Override
	public void setStatus(final String status) {
		this.status = status; 
	}
 
	@Override
	public String getPermitDate() {
		return this.permitDate;
	}
 
	@Override
	public void setPermitDate(final String permitDate) {
		this.permitDate = permitDate; 
	}
 
	@Override
	public String getPermitDocNo() {
		return this.permitDocNo;
	}
 
	@Override
	public void setPermitDocNo(final String permitDocNo) {
		this.permitDocNo = permitDocNo; 
	}
 
	@Override
	public String getRemark1() {
		return this.remark1;
	}
 
	@Override
	public void setRemark1(final String remark1) {
		this.remark1 = remark1; 
	}
 
	@Override
	public String getRemark2() {
		return this.remark2;
	}
 
	@Override
	public void setRemark2(final String remark2) {
		this.remark2 = remark2; 
	}
 
	@Override
	public String getRemark3() {
		return this.remark3;
	}
 
	@Override
	public void setRemark3(final String remark3) {
		this.remark3 = remark3; 
	}
 
	@Override
	public String getDocDate() {
		return this.docDate;
	}
 
	@Override
	public void setDocDate(final String docDate) {
		this.docDate = docDate; 
	}
 
	@Override
	public String getRefDate() {
		return this.refDate;
	}
 
	@Override
	public void setRefDate(final String refDate) {
		this.refDate = refDate; 
	}
 
}
