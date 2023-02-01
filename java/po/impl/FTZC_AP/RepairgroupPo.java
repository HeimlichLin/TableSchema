package com.doc.common.po.impl; 
 
public class RepairgroupPo implements IRepairgroupPo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		GROUP_MONTH("彙總年月"), //
		VERSION("版次"), //
		COMMODITY_NO("料號"), //
		GOODS_UNIT("單位"), //
		GROUP_QTY("彙總數量"), //
		CREATE_DATE("建檔日期"), //
		SEND_DATE("送件日期"), //
		GROUP_NO("彙總文號"), //
		REMARK("備註"), //
		CLASS_NO("類別代號") //
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
	private String groupMonth;
	private String version;
	private String commodityNo;
	private String goodsUnit;
	private BigDecimal groupQty;
	private String createDate;
	private String sendDate;
	private String groupNo;
	private String remark;
	private String classNo;

	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
	}
 
	@Override
	public String getGroupMonth() {
		return this.groupMonth;
	}
 
	@Override
	public void setGroupMonth(final String groupMonth) {
		this.groupMonth = groupMonth; 
	}
 
	@Override
	public String getVersion() {
		return this.version;
	}
 
	@Override
	public void setVersion(final String version) {
		this.version = version; 
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
	public String getGoodsUnit() {
		return this.goodsUnit;
	}
 
	@Override
	public void setGoodsUnit(final String goodsUnit) {
		this.goodsUnit = goodsUnit; 
	}
 
	@Override
	public BigDecimal getGroupQty() {
		return this.groupQty;
	}
 
	@Override
	public void setGroupQty(final BigDecimal groupQty) {
		this.groupQty = groupQty; 
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
	public String getSendDate() {
		return this.sendDate;
	}
 
	@Override
	public void setSendDate(final String sendDate) {
		this.sendDate = sendDate; 
	}
 
	@Override
	public String getGroupNo() {
		return this.groupNo;
	}
 
	@Override
	public void setGroupNo(final String groupNo) {
		this.groupNo = groupNo; 
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
	public String getClassNo() {
		return this.classNo;
	}
 
	@Override
	public void setClassNo(final String classNo) {
		this.classNo = classNo; 
	}
 
}
