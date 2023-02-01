package com.doc.common.po.impl; 
 
public class DocIcSetPo implements IDocIcSetPo {
 
	public enum COLUMNS {
		DOC_TYPE("01.報關證
02.承攬證
03.長期證
04.身分證
05.其他證件"), //
		DOC_NO("證件號碼"), //
		ID("身分證號"), //
		NAME("姓名"), //
		COMP_NAME("公司名稱"), //
		PHOTO("相片"), //
		IC_NO("IC卡內碼"), //
		VALID_DEAD_LINE("有效期限"), //
		SUSPEND_MARK("Y：可用
N：停權"), //
		SUSPEND_DT_S("停權期間_起"), //
		SUSPEND_DT_E("停權期間_迄") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String docType;
	private String docNo;
	private String id;
	private String name;
	private String compName;
	private String photo;
	private String icNo;
	private java.sql.Timestamp validDeadLine;
	private String suspendMark;
	private java.sql.Timestamp suspendDtS;
	private java.sql.Timestamp suspendDtE;

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
	public String getId() {
		return this.id;
	}
 
	@Override
	public void setId(final String id) {
		this.id = id; 
	}
 
	@Override
	public String getName() {
		return this.name;
	}
 
	@Override
	public void setName(final String name) {
		this.name = name; 
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
	public String getPhoto() {
		return this.photo;
	}
 
	@Override
	public void setPhoto(final String photo) {
		this.photo = photo; 
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
	public java.sql.Timestamp getValidDeadLine() {
		return this.validDeadLine;
	}
 
	@Override
	public void setValidDeadLine(final java.sql.Timestamp validDeadLine) {
		this.validDeadLine = validDeadLine; 
	}
 
	@Override
	public String getSuspendMark() {
		return this.suspendMark;
	}
 
	@Override
	public void setSuspendMark(final String suspendMark) {
		this.suspendMark = suspendMark; 
	}
 
	@Override
	public java.sql.Timestamp getSuspendDtS() {
		return this.suspendDtS;
	}
 
	@Override
	public void setSuspendDtS(final java.sql.Timestamp suspendDtS) {
		this.suspendDtS = suspendDtS; 
	}
 
	@Override
	public java.sql.Timestamp getSuspendDtE() {
		return this.suspendDtE;
	}
 
	@Override
	public void setSuspendDtE(final java.sql.Timestamp suspendDtE) {
		this.suspendDtE = suspendDtE; 
	}
 
}
