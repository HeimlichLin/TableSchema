package com.doc.common.po.impl; 
 
public class BomTPo implements IBomTPo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		BF_BOM_NO("用料清表編號(客戶自訂)"), //
		BOM_NO("用料清表編號(系統唯一)"), //
		VER("用料清表版本"), //
		PROCESS("加工方式"), //
		BOM_DATE("用料清表日期"), //
		BOM_TYPE("1成品2在製品(客戶參考欄位)"), //
		WHS("工時(客戶參考欄位)"), //
		APPROVE_DOC_NO("核准文號"), //
		APPROVE_DATE("核准日期"), //
		CTM_CODE("客戶欄位(貨主)"), //
		REMARK("客戶備註欄位"), //
		USER_ID("建置者/異動者"), //
		EXPIRED("失效註記"), //
		USE_MARK("使用者註記"), //
		COCOMP_NO("協力廠商") //
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
	private String bfBomNo;
	private String bomNo;
	private String ver;
	private String process;
	private String bomDate;
	private String bomType;
	private String whs;
	private String approveDocNo;
	private String approveDate;
	private String ctmCode;
	private String remark;
	private String userId;
	private String expired;
	private String useMark;
	private String cocompNo;

	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
	}
 
	@Override
	public String getBfBomNo() {
		return this.bfBomNo;
	}
 
	@Override
	public void setBfBomNo(final String bfBomNo) {
		this.bfBomNo = bfBomNo; 
	}
 
	@Override
	public String getBomNo() {
		return this.bomNo;
	}
 
	@Override
	public void setBomNo(final String bomNo) {
		this.bomNo = bomNo; 
	}
 
	@Override
	public String getVer() {
		return this.ver;
	}
 
	@Override
	public void setVer(final String ver) {
		this.ver = ver; 
	}
 
	@Override
	public String getProcess() {
		return this.process;
	}
 
	@Override
	public void setProcess(final String process) {
		this.process = process; 
	}
 
	@Override
	public String getBomDate() {
		return this.bomDate;
	}
 
	@Override
	public void setBomDate(final String bomDate) {
		this.bomDate = bomDate; 
	}
 
	@Override
	public String getBomType() {
		return this.bomType;
	}
 
	@Override
	public void setBomType(final String bomType) {
		this.bomType = bomType; 
	}
 
	@Override
	public String getWhs() {
		return this.whs;
	}
 
	@Override
	public void setWhs(final String whs) {
		this.whs = whs; 
	}
 
	@Override
	public String getApproveDocNo() {
		return this.approveDocNo;
	}
 
	@Override
	public void setApproveDocNo(final String approveDocNo) {
		this.approveDocNo = approveDocNo; 
	}
 
	@Override
	public String getApproveDate() {
		return this.approveDate;
	}
 
	@Override
	public void setApproveDate(final String approveDate) {
		this.approveDate = approveDate; 
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
	public String getRemark() {
		return this.remark;
	}
 
	@Override
	public void setRemark(final String remark) {
		this.remark = remark; 
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
	public String getExpired() {
		return this.expired;
	}
 
	@Override
	public void setExpired(final String expired) {
		this.expired = expired; 
	}
 
	@Override
	public String getUseMark() {
		return this.useMark;
	}
 
	@Override
	public void setUseMark(final String useMark) {
		this.useMark = useMark; 
	}
 
	@Override
	public String getCocompNo() {
		return this.cocompNo;
	}
 
	@Override
	public void setCocompNo(final String cocompNo) {
		this.cocompNo = cocompNo; 
	}
 
}
