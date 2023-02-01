package com.doc.common.po.impl; 
 
public class BomdtldescPo implements IBomdtldescPo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		CTM_CODE("客戶欄位(貨主)"), //
		PRDT_NO("產品料號"), //
		PART_NO("原料號碼"), //
		BOM_DATE("用料清表日期"), //
		PART_NO2("原料號碼2"), //
		DESCRIP("備註") //
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
	private String ctmCode;
	private String prdtNo;
	private String partNo;
	private String bomDate;
	private String partNo2;
	private String descrip;

	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
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
	public String getPrdtNo() {
		return this.prdtNo;
	}
 
	@Override
	public void setPrdtNo(final String prdtNo) {
		this.prdtNo = prdtNo; 
	}
 
	@Override
	public String getPartNo() {
		return this.partNo;
	}
 
	@Override
	public void setPartNo(final String partNo) {
		this.partNo = partNo; 
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
	public String getPartNo2() {
		return this.partNo2;
	}
 
	@Override
	public void setPartNo2(final String partNo2) {
		this.partNo2 = partNo2; 
	}
 
	@Override
	public String getDescrip() {
		return this.descrip;
	}
 
	@Override
	public void setDescrip(final String descrip) {
		this.descrip = descrip; 
	}
 
}
