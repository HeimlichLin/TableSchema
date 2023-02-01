package com.doc.common.po.impl; 
 
public class N1AT1Po implements IN1AT1Po {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		CONTROL_NO("上傳檔名"), //
		RECV_TIME("接收時間"), //
		VERSION("上傳版次"), //
		SEQ_NO("資料序號"), //
		REF_BILL_NO("參考單號"), //
		ITEM("參考項次"), //
		OUT_STORAGE_AREA("進出倉儲位"), //
		COMMODITY_NO("料號"), //
		DECL_NO("報單號碼"), //
		ITEM_NO("報單項次"), //
		DECL_TYPE("報單類別"), //
		EXTEND_DATE("展延期限"), //
		EXTEND_DOC("展延文號"), //
		I_CONFIRMED("是否更新") //
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
	private String controlNo;
	private java.sql.Timestamp recvTime;
	private BigDecimal version;
	private BigDecimal seqNo;
	private String refBillNo;
	private String item;
	private String outStorageArea;
	private String commodityNo;
	private String declNo;
	private BigDecimal itemNo;
	private String declType;
	private String extendDate;
	private String extendDoc;
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
	public String getControlNo() {
		return this.controlNo;
	}
 
	@Override
	public void setControlNo(final String controlNo) {
		this.controlNo = controlNo; 
	}
 
	@Override
	public java.sql.Timestamp getRecvTime() {
		return this.recvTime;
	}
 
	@Override
	public void setRecvTime(final java.sql.Timestamp recvTime) {
		this.recvTime = recvTime; 
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
	public String getRefBillNo() {
		return this.refBillNo;
	}
 
	@Override
	public void setRefBillNo(final String refBillNo) {
		this.refBillNo = refBillNo; 
	}
 
	@Override
	public String getItem() {
		return this.item;
	}
 
	@Override
	public void setItem(final String item) {
		this.item = item; 
	}
 
	@Override
	public String getOutStorageArea() {
		return this.outStorageArea;
	}
 
	@Override
	public void setOutStorageArea(final String outStorageArea) {
		this.outStorageArea = outStorageArea; 
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
	public String getDeclNo() {
		return this.declNo;
	}
 
	@Override
	public void setDeclNo(final String declNo) {
		this.declNo = declNo; 
	}
 
	@Override
	public BigDecimal getItemNo() {
		return this.itemNo;
	}
 
	@Override
	public void setItemNo(final BigDecimal itemNo) {
		this.itemNo = itemNo; 
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
	public String getExtendDate() {
		return this.extendDate;
	}
 
	@Override
	public void setExtendDate(final String extendDate) {
		this.extendDate = extendDate; 
	}
 
	@Override
	public String getExtendDoc() {
		return this.extendDoc;
	}
 
	@Override
	public void setExtendDoc(final String extendDoc) {
		this.extendDoc = extendDoc; 
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
