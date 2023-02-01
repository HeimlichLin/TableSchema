package com.doc.common.po.impl; 
 
public class ClmsL6T1Po implements IClmsL6T1Po {
 
	public enum COLUMNS {
		BONDNO("海關監管編號"), //
		REF_BILL_NO("參考單號"), //
		ITEM("參考項次"), //
		OIL_POST("原有儲位"), //
		NEW_POST("異動儲位"), //
		QTY("數量"), //
		CONFIRM_DATE("確認日期"), //
		CONTROL_NO("檔案"), //
		VERSION("版本"), //
		SEQ_NO("序號"), //
		I_CONFIRMED("是否完成(Y:完成；N:待執行；E:超過7日無進倉)") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String bondno;
	private String refBillNo;
	private BigDecimal item;
	private String oilPost;
	private String newPost;
	private BigDecimal qty;
	private String confirmDate;
	private String controlNo;
	private BigDecimal version;
	private BigDecimal seqNo;
	private String iConfirmed;

	@Override
	public String getBondno() {
		return this.bondno;
	}
 
	@Override
	public void setBondno(final String bondno) {
		this.bondno = bondno; 
	}
 
	@Override
	public String getRefBillNo() {
		return this.refBillNo;
	}
 
	@Override
	public void setRefBillNo(final String refBillNo) {
		this.refBillNo = refBillNo; 
	}
 
	@Override
	public BigDecimal getItem() {
		return this.item;
	}
 
	@Override
	public void setItem(final BigDecimal item) {
		this.item = item; 
	}
 
	@Override
	public String getOilPost() {
		return this.oilPost;
	}
 
	@Override
	public void setOilPost(final String oilPost) {
		this.oilPost = oilPost; 
	}
 
	@Override
	public String getNewPost() {
		return this.newPost;
	}
 
	@Override
	public void setNewPost(final String newPost) {
		this.newPost = newPost; 
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
	public String getConfirmDate() {
		return this.confirmDate;
	}
 
	@Override
	public void setConfirmDate(final String confirmDate) {
		this.confirmDate = confirmDate; 
	}
 
	@Override
	public String getControlNo() {
		return this.controlNo;
	}
 
	@Override
	public void setControlNo(final String controlNo) {
		this.controlNo = controlNo; 
	}
 
	@Override
	public BigDecimal getVersion() {
		return this.version;
	}
 
	@Override
	public void setVersion(final BigDecimal version) {
		this.version = version; 
	}
 
	@Override
	public BigDecimal getSeqNo() {
		return this.seqNo;
	}
 
	@Override
	public void setSeqNo(final BigDecimal seqNo) {
		this.seqNo = seqNo; 
	}
 
	@Override
	public String getIConfirmed() {
		return this.iConfirmed;
	}
 
	@Override
	public void setIConfirmed(final String iConfirmed) {
		this.iConfirmed = iConfirmed; 
	}
 
}
