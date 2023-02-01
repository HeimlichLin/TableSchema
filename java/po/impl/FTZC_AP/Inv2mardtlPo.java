package com.doc.common.po.impl; 
 
public class Inv2mardtlPo implements IInv2mardtlPo {
 
	public enum COLUMNS {
		INV_M_ID("INV2MAR折合主檔ID"), //
		INV_M_TYPE("參考文件型態:目前有兩種(P)盤點折合；(S)銷售折合"), //
		INV_DTL_ITEM("明細項次"), //
		MAR_NO("原料料號"), //
		GOODS_UNIT("單位"), //
		UNIT_QTY("單位用量"), //
		MAR_QTY("原料用量"), //
		REF_GUID("參考GUID(此欄位暫無作用,因為折合回去的是加總數量,無法回對特定的GUID)"), //
		PLEVEL("註記加工階層"), //
		REMARK("出倉單號:原進倉號:原進倉作業代碼"), //
		PRDT_MARK("在製品註記,Y:在製品") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String invMId;
	private String invMType;
	private String invDtlItem;
	private String marNo;
	private String goodsUnit;
	private BigDecimal unitQty;
	private BigDecimal marQty;
	private String refGuid;
	private String plevel;
	private String remark;
	private String prdtMark;

	@Override
	public String getInvMId() {
		return this.invMId;
	}
 
	@Override
	public void setInvMId(final String invMId) {
		this.invMId = invMId; 
	}
 
	@Override
	public String getInvMType() {
		return this.invMType;
	}
 
	@Override
	public void setInvMType(final String invMType) {
		this.invMType = invMType; 
	}
 
	@Override
	public String getInvDtlItem() {
		return this.invDtlItem;
	}
 
	@Override
	public void setInvDtlItem(final String invDtlItem) {
		this.invDtlItem = invDtlItem; 
	}
 
	@Override
	public String getMarNo() {
		return this.marNo;
	}
 
	@Override
	public void setMarNo(final String marNo) {
		this.marNo = marNo; 
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
	public BigDecimal getUnitQty() {
		return this.unitQty;
	}
 
	@Override
	public void setUnitQty(final BigDecimal unitQty) {
		this.unitQty = unitQty; 
	}
 
	@Override
	public BigDecimal getMarQty() {
		return this.marQty;
	}
 
	@Override
	public void setMarQty(final BigDecimal marQty) {
		this.marQty = marQty; 
	}
 
	@Override
	public String getRefGuid() {
		return this.refGuid;
	}
 
	@Override
	public void setRefGuid(final String refGuid) {
		this.refGuid = refGuid; 
	}
 
	@Override
	public String getPlevel() {
		return this.plevel;
	}
 
	@Override
	public void setPlevel(final String plevel) {
		this.plevel = plevel; 
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
	public String getPrdtMark() {
		return this.prdtMark;
	}
 
	@Override
	public void setPrdtMark(final String prdtMark) {
		this.prdtMark = prdtMark; 
	}
 
}
