package com.doc.common.po.impl; 
 
public class WarehsePo implements IWarehsePo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		POST_CODE("縣市別"), //
		BOND_BAN("統一編號"), //
		BOND_NAME("業者名稱"), //
		SPECIALST("專責人員"), //
		BOND_ADD("倉庫地址"), //
		BOND_ID("業者帳號"), //
		BOND_PW("業者密碼"), //
		AUTHORITY("角色代碼"), //
		RCV_ID("接收代碼"), //
		SEP_ID("傳送代碼"), //
		CUSTOMS_OFFICE("關別代號"), //
		RECV_FLAG("傳送訊息註記"), //
		BOND_TYPE("倉庫類別"), //
		STATUS("帳號狀態"), //
		ACTIVE_DATE("啟用日期"), //
		END_DATE("截止日期"), //
		CHARGE_DATE("收費日期"), //
		TEL("電話號碼"), //
		FAX("傳真號碼"), //
		ANCY("正式/測試 監管編號"), //
		T5_FLAG("是否提供T5訊息)") //
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
	private String postCode;
	private String bondBan;
	private String bondName;
	private String specialst;
	private String bondAdd;
	private String bondId;
	private String bondPw;
	private String authority;
	private String rcvId;
	private String sepId;
	private String customsOffice;
	private String recvFlag;
	private String bondType;
	private String status;
	private java.sql.Timestamp activeDate;
	private java.sql.Timestamp endDate;
	private java.sql.Timestamp chargeDate;
	private String tel;
	private String fax;
	private String ancy;
	private String t5Flag;

	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
	}
 
	@Override
	public String getPostCode() {
		return this.postCode;
	}
 
	@Override
	public void setPostCode(final String postCode) {
		this.postCode = postCode; 
	}
 
	@Override
	public String getBondBan() {
		return this.bondBan;
	}
 
	@Override
	public void setBondBan(final String bondBan) {
		this.bondBan = bondBan; 
	}
 
	@Override
	public String getBondName() {
		return this.bondName;
	}
 
	@Override
	public void setBondName(final String bondName) {
		this.bondName = bondName; 
	}
 
	@Override
	public String getSpecialst() {
		return this.specialst;
	}
 
	@Override
	public void setSpecialst(final String specialst) {
		this.specialst = specialst; 
	}
 
	@Override
	public String getBondAdd() {
		return this.bondAdd;
	}
 
	@Override
	public void setBondAdd(final String bondAdd) {
		this.bondAdd = bondAdd; 
	}
 
	@Override
	public String getBondId() {
		return this.bondId;
	}
 
	@Override
	public void setBondId(final String bondId) {
		this.bondId = bondId; 
	}
 
	@Override
	public String getBondPw() {
		return this.bondPw;
	}
 
	@Override
	public void setBondPw(final String bondPw) {
		this.bondPw = bondPw; 
	}
 
	@Override
	public String getAuthority() {
		return this.authority;
	}
 
	@Override
	public void setAuthority(final String authority) {
		this.authority = authority; 
	}
 
	@Override
	public String getRcvId() {
		return this.rcvId;
	}
 
	@Override
	public void setRcvId(final String rcvId) {
		this.rcvId = rcvId; 
	}
 
	@Override
	public String getSepId() {
		return this.sepId;
	}
 
	@Override
	public void setSepId(final String sepId) {
		this.sepId = sepId; 
	}
 
	@Override
	public String getCustomsOffice() {
		return this.customsOffice;
	}
 
	@Override
	public void setCustomsOffice(final String customsOffice) {
		this.customsOffice = customsOffice; 
	}
 
	@Override
	public String getRecvFlag() {
		return this.recvFlag;
	}
 
	@Override
	public void setRecvFlag(final String recvFlag) {
		this.recvFlag = recvFlag; 
	}
 
	@Override
	public String getBondType() {
		return this.bondType;
	}
 
	@Override
	public void setBondType(final String bondType) {
		this.bondType = bondType; 
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
	public java.sql.Timestamp getActiveDate() {
		return this.activeDate;
	}
 
	@Override
	public void setActiveDate(final java.sql.Timestamp activeDate) {
		this.activeDate = activeDate; 
	}
 
	@Override
	public java.sql.Timestamp getEndDate() {
		return this.endDate;
	}
 
	@Override
	public void setEndDate(final java.sql.Timestamp endDate) {
		this.endDate = endDate; 
	}
 
	@Override
	public java.sql.Timestamp getChargeDate() {
		return this.chargeDate;
	}
 
	@Override
	public void setChargeDate(final java.sql.Timestamp chargeDate) {
		this.chargeDate = chargeDate; 
	}
 
	@Override
	public String getTel() {
		return this.tel;
	}
 
	@Override
	public void setTel(final String tel) {
		this.tel = tel; 
	}
 
	@Override
	public String getFax() {
		return this.fax;
	}
 
	@Override
	public void setFax(final String fax) {
		this.fax = fax; 
	}
 
	@Override
	public String getAncy() {
		return this.ancy;
	}
 
	@Override
	public void setAncy(final String ancy) {
		this.ancy = ancy; 
	}
 
	@Override
	public String getT5Flag() {
		return this.t5Flag;
	}
 
	@Override
	public void setT5Flag(final String t5Flag) {
		this.t5Flag = t5Flag; 
	}
 
}
