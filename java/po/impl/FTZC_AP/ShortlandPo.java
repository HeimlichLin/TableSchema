package com.doc.common.po.impl; 
 
public class ShortlandPo implements IShortlandPo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		DELIVER_TYPE("進出倉類別"), //
		DECL_NO("報單號碼"), //
		DECL_TYPE("報單類別"), //
		ITEM_NO("報單項次"), //
		DECL_QTY("申報數量"), //
		SHORT_LAND_QTY("短溢卸OR短溢裝"), //
		PERMIT_NO("核准文號"), //
		PERMIT_DATE("核准日期"), //
		REMARK("備註"), //
		STORAGE_AREA("儲位"), //
		O_DECL_NO("原進倉報單號碼"), //
		O_ITEM_NO("原進倉報單項次") //
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
	private String deliverType;
	private String declNo;
	private String declType;
	private String itemNo;
	private BigDecimal declQty;
	private BigDecimal shortLandQty;
	private String permitNo;
	private String permitDate;
	private String remark;
	private String storageArea;
	private String oDeclNo;
	private BigDecimal oItemNo;

	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
	}
 
	@Override
	public String getDeliverType() {
		return this.deliverType;
	}
 
	@Override
	public void setDeliverType(final String deliverType) {
		this.deliverType = deliverType; 
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
	public String getItemNo() {
		return this.itemNo;
	}
 
	@Override
	public void setItemNo(final String itemNo) {
		this.itemNo = itemNo; 
	}
 
	@Override
	public BigDecimal getDeclQty() {
		return this.declQty;
	}
 
	@Override
	public void setDeclQty(final BigDecimal declQty) {
		this.declQty = declQty; 
	}
 
	@Override
	public BigDecimal getShortLandQty() {
		return this.shortLandQty;
	}
 
	@Override
	public void setShortLandQty(final BigDecimal shortLandQty) {
		this.shortLandQty = shortLandQty; 
	}
 
	@Override
	public String getPermitNo() {
		return this.permitNo;
	}
 
	@Override
	public void setPermitNo(final String permitNo) {
		this.permitNo = permitNo; 
	}
 
	@Override
	public String getPermitDate() {
		return this.permitDate;
	}
 
	@Override
	public void setPermitDate(final String permitDate) {
		this.permitDate = permitDate; 
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
	public String getStorageArea() {
		return this.storageArea;
	}
 
	@Override
	public void setStorageArea(final String storageArea) {
		this.storageArea = storageArea; 
	}
 
	@Override
	public String getODeclNo() {
		return this.oDeclNo;
	}
 
	@Override
	public void setODeclNo(final String oDeclNo) {
		this.oDeclNo = oDeclNo; 
	}
 
	@Override
	public BigDecimal getOItemNo() {
		return this.oItemNo;
	}
 
	@Override
	public void setOItemNo(final BigDecimal oItemNo) {
		this.oItemNo = oItemNo; 
	}
 
}
