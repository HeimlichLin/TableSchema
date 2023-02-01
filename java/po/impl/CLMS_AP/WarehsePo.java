package com.doc.common.po.impl; 
 
public class WarehsePo implements IWarehsePo {
 
	public enum COLUMNS {
		POSTCODE("地區碼"), //
		BONDNO("監管編號"), //
		BONDBAN("倉儲業統一編碼"), //
		BONDNAME("保稅倉儲業"), //
		SPECIALST("專責人員"), //
		BONDADD("保稅倉儲業地址"), //
		BONDID("倉儲業代碼"), //
		BONDPW("倉儲業密碼"), //
		AUTHORITY("使用權限"), //
		RCVID("收件人代碼"), //
		SEPID("Sepower代碼"), //
		CUSTOMSOFFICE("關別"), //
		RECV_FLAG("准單接收註記"), //
		BONDTYPE("倉庫別"), //
		STATUS("狀態"), //
		ACTIVEDATE("啟用日期"), //
		ENDDATE("截止日期"), //
		CHARGEDATE("收費日期"), //
		TEL("電話"), //
		FAX("傳真"), //
		COFFICER("null"), //
		CUSTOM_FLAG("null"), //
		AUTOCONFIRM("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String postcode;
	private String bondno;
	private String bondban;
	private String bondname;
	private String specialst;
	private String bondadd;
	private String bondid;
	private String bondpw;
	private String authority;
	private String rcvid;
	private String sepid;
	private String customsoffice;
	private String recvFlag;
	private String bondtype;
	private String status;
	private java.sql.Timestamp activedate;
	private java.sql.Timestamp enddate;
	private java.sql.Timestamp chargedate;
	private String tel;
	private String fax;
	private String cofficer;
	private String customFlag;
	private String autoconfirm;

	@Override
	public String getPostcode() {
		return this.postcode;
	}
 
	@Override
	public void setPostcode(final String postcode) {
		this.postcode = postcode; 
	}
 
	@Override
	public String getBondno() {
		return this.bondno;
	}
 
	@Override
	public void setBondno(final String bondno) {
		this.bondno = bondno; 
	}
 
	@Override
	public String getBondban() {
		return this.bondban;
	}
 
	@Override
	public void setBondban(final String bondban) {
		this.bondban = bondban; 
	}
 
	@Override
	public String getBondname() {
		return this.bondname;
	}
 
	@Override
	public void setBondname(final String bondname) {
		this.bondname = bondname; 
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
	public String getBondadd() {
		return this.bondadd;
	}
 
	@Override
	public void setBondadd(final String bondadd) {
		this.bondadd = bondadd; 
	}
 
	@Override
	public String getBondid() {
		return this.bondid;
	}
 
	@Override
	public void setBondid(final String bondid) {
		this.bondid = bondid; 
	}
 
	@Override
	public String getBondpw() {
		return this.bondpw;
	}
 
	@Override
	public void setBondpw(final String bondpw) {
		this.bondpw = bondpw; 
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
	public String getRcvid() {
		return this.rcvid;
	}
 
	@Override
	public void setRcvid(final String rcvid) {
		this.rcvid = rcvid; 
	}
 
	@Override
	public String getSepid() {
		return this.sepid;
	}
 
	@Override
	public void setSepid(final String sepid) {
		this.sepid = sepid; 
	}
 
	@Override
	public String getCustomsoffice() {
		return this.customsoffice;
	}
 
	@Override
	public void setCustomsoffice(final String customsoffice) {
		this.customsoffice = customsoffice; 
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
	public String getBondtype() {
		return this.bondtype;
	}
 
	@Override
	public void setBondtype(final String bondtype) {
		this.bondtype = bondtype; 
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
	public java.sql.Timestamp getActivedate() {
		return this.activedate;
	}
 
	@Override
	public void setActivedate(final java.sql.Timestamp activedate) {
		this.activedate = activedate; 
	}
 
	@Override
	public java.sql.Timestamp getEnddate() {
		return this.enddate;
	}
 
	@Override
	public void setEnddate(final java.sql.Timestamp enddate) {
		this.enddate = enddate; 
	}
 
	@Override
	public java.sql.Timestamp getChargedate() {
		return this.chargedate;
	}
 
	@Override
	public void setChargedate(final java.sql.Timestamp chargedate) {
		this.chargedate = chargedate; 
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
	public String getCofficer() {
		return this.cofficer;
	}
 
	@Override
	public void setCofficer(final String cofficer) {
		this.cofficer = cofficer; 
	}
 
	@Override
	public String getCustomFlag() {
		return this.customFlag;
	}
 
	@Override
	public void setCustomFlag(final String customFlag) {
		this.customFlag = customFlag; 
	}
 
	@Override
	public String getAutoconfirm() {
		return this.autoconfirm;
	}
 
	@Override
	public void setAutoconfirm(final String autoconfirm) {
		this.autoconfirm = autoconfirm; 
	}
 
}
