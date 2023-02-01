package com.doc.common.po.impl; 
 
public class L6T1Po implements IL6T1Po {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		REF_BILL_NO("參考單號"), //
		ITEM("參考項次"), //
		OIL_POST("原儲位"), //
		NEW_POST("新儲位"), //
		QTY("移倉數量"), //
		CONFIRM_DATE("訊息/移倉日期

"), //
		CONTROL_NO("上傳檔名"), //
		VERSION("null"), //
		SEQ_NO("資料序號"), //
		I_CONFIRMED("移倉作業狀態") //
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
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
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
