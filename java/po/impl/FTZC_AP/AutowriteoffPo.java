package com.doc.common.po.impl; 
 
public class AutowriteoffPo implements IAutowriteoffPo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		DECL_NO("報單號碼"), //
		CTMCODE("客戶代碼"), //
		COCOMP_NO("協力廠商"), //
		INVTRYTYPE("帳務類別 -:一般 V:成車"), //
		STR_TYPE("進出倉別 1:進 2:出"), //
		IO_TYPE("進出口別.I:進口.O:出口"), //
		CREATE_DATE("該筆資料產生日期時間"), //
		WRITEOFF_DATE("該筆資料核銷日期時間"), //
		STATUS("執行狀態1碼： N:待核銷、W:核銷中、C:核銷完畢。") //
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
	private String declNo;
	private String ctmcode;
	private String cocompNo;
	private String invtrytype;
	private String strType;
	private String ioType;
	private String createDate;
	private String writeoffDate;
	private String status;

	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
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
	public String getCtmcode() {
		return this.ctmcode;
	}
 
	@Override
	public void setCtmcode(final String ctmcode) {
		this.ctmcode = ctmcode; 
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
	public String getInvtrytype() {
		return this.invtrytype;
	}
 
	@Override
	public void setInvtrytype(final String invtrytype) {
		this.invtrytype = invtrytype; 
	}
 
	@Override
	public String getStrType() {
		return this.strType;
	}
 
	@Override
	public void setStrType(final String strType) {
		this.strType = strType; 
	}
 
	@Override
	public String getIoType() {
		return this.ioType;
	}
 
	@Override
	public void setIoType(final String ioType) {
		this.ioType = ioType; 
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
	public String getWriteoffDate() {
		return this.writeoffDate;
	}
 
	@Override
	public void setWriteoffDate(final String writeoffDate) {
		this.writeoffDate = writeoffDate; 
	}
 
	@Override
	public String getStatus() {
		return this.status;
	}
 
	@Override
	public void setStatus(final String status) {
		this.status = status; 
	}
 
}
