package com.doc.common.po.impl; 
 
public class StoragebookPo implements IStoragebookPo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		PLACE_BF_NO("寄存港區事業監管編號"), //
		STR_TYPE("進出倉別 1:進 2:出"), //
		DECL_NO("報單號碼"), //
		O_DECL_NO("原進倉報單號碼"), //
		NO_PKG("件數"), //
		PKG_UNIT("件數單位"), //
		G_WGT("總重量"), //
		CONTR_NO("貨櫃號碼"), //
		STORAGE_AREA("儲位") //
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
	private String placeBfNo;
	private String strType;
	private String declNo;
	private String oDeclNo;
	private BigDecimal noPkg;
	private String pkgUnit;
	private BigDecimal gWgt;
	private String contrNo;
	private String storageArea;

	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
	}
 
	@Override
	public String getPlaceBfNo() {
		return this.placeBfNo;
	}
 
	@Override
	public void setPlaceBfNo(final String placeBfNo) {
		this.placeBfNo = placeBfNo; 
	}
 
	@Override
	public String getStrType() {
		return this.strType;
	}
 
	@Override
	public void setStrType(final String strType) {
		this.strType = strType; 
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
	public String getODeclNo() {
		return this.oDeclNo;
	}
 
	@Override
	public void setODeclNo(final String oDeclNo) {
		this.oDeclNo = oDeclNo; 
	}
 
	@Override
	public BigDecimal getNoPkg() {
		return this.noPkg;
	}
 
	@Override
	public void setNoPkg(final BigDecimal noPkg) {
		this.noPkg = noPkg; 
	}
 
	@Override
	public String getPkgUnit() {
		return this.pkgUnit;
	}
 
	@Override
	public void setPkgUnit(final String pkgUnit) {
		this.pkgUnit = pkgUnit; 
	}
 
	@Override
	public BigDecimal getGWgt() {
		return this.gWgt;
	}
 
	@Override
	public void setGWgt(final BigDecimal gWgt) {
		this.gWgt = gWgt; 
	}
 
	@Override
	public String getContrNo() {
		return this.contrNo;
	}
 
	@Override
	public void setContrNo(final String contrNo) {
		this.contrNo = contrNo; 
	}
 
	@Override
	public String getStorageArea() {
		return this.storageArea;
	}
 
	@Override
	public void setStorageArea(final String storageArea) {
		this.storageArea = storageArea; 
	}
 
}
