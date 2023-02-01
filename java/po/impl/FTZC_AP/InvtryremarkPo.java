package com.doc.common.po.impl; 
 
public class InvtryremarkPo implements IInvtryremarkPo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		INV_YEAR("盤點年度"), //
		COMMODITY_NO("料號"), //
		REMARK("備註") //
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
	private String invYear;
	private String commodityNo;
	private String remark;

	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
	}
 
	@Override
	public String getInvYear() {
		return this.invYear;
	}
 
	@Override
	public void setInvYear(final String invYear) {
		this.invYear = invYear; 
	}
 
	@Override
	public String getCommodityNo() {
		return this.commodityNo;
	}
 
	@Override
	public void setCommodityNo(final String commodityNo) {
		this.commodityNo = commodityNo; 
	}
 
	@Override
	public String getRemark() {
		return this.remark;
	}
 
	@Override
	public void setRemark(final String remark) {
		this.remark = remark; 
	}
 
}
