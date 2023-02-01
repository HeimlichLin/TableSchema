package com.doc.common.po.impl; 
 
public class UseraccountPo implements IUseraccountPo {
 
	public enum COLUMNS {
		U_ID("null"), //
		U_NAME("null"), //
		U_TYPE("null"), //
		U_COMPANY("null"), //
		U_DEP("null"), //
		U_TITLE("null"), //
		U_TEL("null"), //
		U_EXTEND_TEL("null"), //
		S1_PWD("null"), //
		S1_RIGHT("null"), //
		CREATE_DATE("null"), //
		CREATE_USER("null"), //
		MODIFY_DATE("null"), //
		MODIFY_USER("null"), //
		U_ACCOUNT("null"), //
		LOGIN_DATE("null"), //
		LOGIN_ERRTIMES("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String uId;
	private String uName;
	private String uType;
	private String uCompany;
	private String uDep;
	private String uTitle;
	private String uTel;
	private String uExtendTel;
	private String s1Pwd;
	private String s1Right;
	private String createDate;
	private String createUser;
	private String modifyDate;
	private String modifyUser;
	private String uAccount;
	private String loginDate;
	private BigDecimal loginErrtimes;

	@Override
	public String getUId() {
		return this.uId;
	}
 
	@Override
	public void setUId(final String uId) {
		this.uId = uId; 
	}
 
	@Override
	public String getUName() {
		return this.uName;
	}
 
	@Override
	public void setUName(final String uName) {
		this.uName = uName; 
	}
 
	@Override
	public String getUType() {
		return this.uType;
	}
 
	@Override
	public void setUType(final String uType) {
		this.uType = uType; 
	}
 
	@Override
	public String getUCompany() {
		return this.uCompany;
	}
 
	@Override
	public void setUCompany(final String uCompany) {
		this.uCompany = uCompany; 
	}
 
	@Override
	public String getUDep() {
		return this.uDep;
	}
 
	@Override
	public void setUDep(final String uDep) {
		this.uDep = uDep; 
	}
 
	@Override
	public String getUTitle() {
		return this.uTitle;
	}
 
	@Override
	public void setUTitle(final String uTitle) {
		this.uTitle = uTitle; 
	}
 
	@Override
	public String getUTel() {
		return this.uTel;
	}
 
	@Override
	public void setUTel(final String uTel) {
		this.uTel = uTel; 
	}
 
	@Override
	public String getUExtendTel() {
		return this.uExtendTel;
	}
 
	@Override
	public void setUExtendTel(final String uExtendTel) {
		this.uExtendTel = uExtendTel; 
	}
 
	@Override
	public String getS1Pwd() {
		return this.s1Pwd;
	}
 
	@Override
	public void setS1Pwd(final String s1Pwd) {
		this.s1Pwd = s1Pwd; 
	}
 
	@Override
	public String getS1Right() {
		return this.s1Right;
	}
 
	@Override
	public void setS1Right(final String s1Right) {
		this.s1Right = s1Right; 
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
	public String getCreateUser() {
		return this.createUser;
	}
 
	@Override
	public void setCreateUser(final String createUser) {
		this.createUser = createUser; 
	}
 
	@Override
	public String getModifyDate() {
		return this.modifyDate;
	}
 
	@Override
	public void setModifyDate(final String modifyDate) {
		this.modifyDate = modifyDate; 
	}
 
	@Override
	public String getModifyUser() {
		return this.modifyUser;
	}
 
	@Override
	public void setModifyUser(final String modifyUser) {
		this.modifyUser = modifyUser; 
	}
 
	@Override
	public String getUAccount() {
		return this.uAccount;
	}
 
	@Override
	public void setUAccount(final String uAccount) {
		this.uAccount = uAccount; 
	}
 
	@Override
	public String getLoginDate() {
		return this.loginDate;
	}
 
	@Override
	public void setLoginDate(final String loginDate) {
		this.loginDate = loginDate; 
	}
 
	@Override
	public BigDecimal getLoginErrtimes() {
		return this.loginErrtimes;
	}
 
	@Override
	public void setLoginErrtimes(final BigDecimal loginErrtimes) {
		this.loginErrtimes = loginErrtimes; 
	}
 
}
