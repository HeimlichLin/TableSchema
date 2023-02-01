package com.doc.common.po.impl; 
 
public class Ex5203mNPo implements IEx5203mNPo {
 
	public enum COLUMNS {
		OUT_BOND_WAREHOUSE_NO("監管編號"), //
		DECL_NO("報單號碼"), //
		DECL_TYPE("報單類別"), //
		AS_TYPE("海空運別"), //
		DECL_DATE("報關日期"), //
		DESTINATION_CODE("目的地代碼"), //
		EXPORTER_ID("出口人統一編號") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String outBondWarehouseNo;
	private String declNo;
	private String declType;
	private String asType;
	private String declDate;
	private String destinationCode;
	private String exporterId;

	@Override
	public String getOutBondWarehouseNo() {
		return this.outBondWarehouseNo;
	}
 
	@Override
	public void setOutBondWarehouseNo(final String outBondWarehouseNo) {
		this.outBondWarehouseNo = outBondWarehouseNo; 
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
	public String getDestinationCode() {
		return this.destinationCode;
	}
 
	@Override
	public void setDestinationCode(final String destinationCode) {
		this.destinationCode = destinationCode; 
	}
 
	@Override
	public String getExporterId() {
		return this.exporterId;
	}
 
	@Override
	public void setExporterId(final String exporterId) {
		this.exporterId = exporterId; 
	}
 
}
