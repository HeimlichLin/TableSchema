package com.doc.common.po.impl; 
 
public class Im5105mNPo implements IIm5105mNPo {
 
	public enum COLUMNS {
		IN_BOND_WAREHOUSE_NO("監管編號"), //
		DECL_NO("報單號碼"), //
		DECL_TYPE("報單類別"), //
		AS_TYPE("海空運別"), //
		DECL_DATE("報關日期"), //
		LOAD_PORT_CODE("裝貨港代碼"), //
		DUTY_PAYER_ID("進口人(納稅義務人)統一編號") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String inBondWarehouseNo;
	private String declNo;
	private String declType;
	private String asType;
	private String declDate;
	private String loadPortCode;
	private String dutyPayerId;

	@Override
	public String getInBondWarehouseNo() {
		return this.inBondWarehouseNo;
	}
 
	@Override
	public void setInBondWarehouseNo(final String inBondWarehouseNo) {
		this.inBondWarehouseNo = inBondWarehouseNo; 
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
	public String getDeclType() {
		return this.declType;
	}
 
	@Override
	public void setDeclType(final String declType) {
		this.declType = declType; 
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
	public String getDeclDate() {
		return this.declDate;
	}
 
	@Override
	public void setDeclDate(final String declDate) {
		this.declDate = declDate; 
	}
 
	@Override
	public String getLoadPortCode() {
		return this.loadPortCode;
	}
 
	@Override
	public void setLoadPortCode(final String loadPortCode) {
		this.loadPortCode = loadPortCode; 
	}
 
	@Override
	public String getDutyPayerId() {
		return this.dutyPayerId;
	}
 
	@Override
	public void setDutyPayerId(final String dutyPayerId) {
		this.dutyPayerId = dutyPayerId; 
	}
 
}
