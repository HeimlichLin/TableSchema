package com.doc.common.po.impl; 
 
public class DeclmailboxPo implements IDeclmailboxPo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		DECL_NO("報單號碼"), //
		DECL_DATE("報單申報日期"), //
		AS_TYPE("海空運別.
S:海運.A:空運
"), //
		ITEM_NO("報單項次"), //
		MAILBOX_NO("郵務發遞單號碼
13碼英數字
"), //
		PRDT_NO("料號"), //
		DESCRIP("貨名"), //
		QTY("數量"), //
		UNIT("單位"), //
		REMARK("備註"), //
		W_GUID("null") //
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
	private String declDate;
	private String asType;
	private BigDecimal itemNo;
	private String mailboxNo;
	private String prdtNo;
	private String descrip;
	private BigDecimal qty;
	private String unit;
	private String remark;
	private String wGuid;

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
	public String getDeclDate() {
		return this.declDate;
	}
 
	@Override
	public void setDeclDate(final String declDate) {
		this.declDate = declDate; 
	}
 
	@Override
	public String getAsType() {
		return this.asType;
	}
 
	@Override
	public void setAsType(final String asType) {
		this.asType = asType; 
	}
 
	@Override
	public BigDecimal getItemNo() {
		return this.itemNo;
	}
 
	@Override
	public void setItemNo(final BigDecimal itemNo) {
		this.itemNo = itemNo; 
	}
 
	@Override
	public String getMailboxNo() {
		return this.mailboxNo;
	}
 
	@Override
	public void setMailboxNo(final String mailboxNo) {
		this.mailboxNo = mailboxNo; 
	}
 
	@Override
	public String getPrdtNo() {
		return this.prdtNo;
	}
 
	@Override
	public void setPrdtNo(final String prdtNo) {
		this.prdtNo = prdtNo; 
	}
 
	@Override
	public String getDescrip() {
		return this.descrip;
	}
 
	@Override
	public void setDescrip(final String descrip) {
		this.descrip = descrip; 
	}
 
	@Override
	public BigDecimal getQty() {
		return this.qty;
	}
 
	@Override
	public void setQty(final BigDecimal qty) {
		this.qty = qty; 
	}
 
	@Override
	public String getUnit() {
		return this.unit;
	}
 
	@Override
	public void setUnit(final String unit) {
		this.unit = unit; 
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
	public String getWGuid() {
		return this.wGuid;
	}
 
	@Override
	public void setWGuid(final String wGuid) {
		this.wGuid = wGuid; 
	}
 
}
