package com.doc.common.po.impl; 
 
public class L4T3Po implements IL4T3Po {
 
	public enum COLUMNS {
		BF_NO("null"), //
		CONTROL_NO("null"), //
		SERIAL_NO("null"), //
		T1_SEQ_NO("null"), //
		SEQ_NO("null"), //
		DECL_NO("null"), //
		ITEM_NO("null"), //
		REF_BILL_NO("null"), //
		ITEM("null"), //
		DECL_TYPE("null"), //
		POST("null"), //
		STR_TYPE("null"), //
		MODIFER("null"), //
		MOD_TIME("null"), //
		MOD_ITEM("null"), //
		ORI_DATA("null"), //
		MOD_DATA("null"), //
		MOD_FILE("null"), //
		REMKS("null"), //
		BATCH_NO("null"), //
		DECL_SEQ_NO("報單序號(5205使用)") //
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
	private String serialNo;
	private BigDecimal t1SeqNo;
	private BigDecimal seqNo;
	private String declNo;
	private String itemNo;
	private String refBillNo;
	private String item;
	private String declType;
	private String post;
	private String strType;
	private String modifer;
	private java.sql.Timestamp modTime;
	private String modItem;
	private String oriData;
	private String modData;
	private String modFile;
	private String remks;
	private String batchNo;
	private BigDecimal declSeqNo;

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
	public String getSerialNo() {
		return this.serialNo;
	}
 
	@Override
	public void setSerialNo(final String serialNo) {
		this.serialNo = serialNo; 
	}
 
	@Override
	public BigDecimal getT1SeqNo() {
		return this.t1SeqNo;
	}
 
	@Override
	public void setT1SeqNo(final BigDecimal t1SeqNo) {
		this.t1SeqNo = t1SeqNo; 
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
	public String getDeclNo() {
		return this.declNo;
	}
 
	@Override
	public void setDeclNo(final String declNo) {
		this.declNo = declNo; 
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
	public String getDeclType() {
		return this.declType;
	}
 
	@Override
	public void setDeclType(final String declType) {
		this.declType = declType; 
	}
 
	@Override
	public String getPost() {
		return this.post;
	}
 
	@Override
	public void setPost(final String post) {
		this.post = post; 
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
	public String getModifer() {
		return this.modifer;
	}
 
	@Override
	public void setModifer(final String modifer) {
		this.modifer = modifer; 
	}
 
	@Override
	public java.sql.Timestamp getModTime() {
		return this.modTime;
	}
 
	@Override
	public void setModTime(final java.sql.Timestamp modTime) {
		this.modTime = modTime; 
	}
 
	@Override
	public String getModItem() {
		return this.modItem;
	}
 
	@Override
	public void setModItem(final String modItem) {
		this.modItem = modItem; 
	}
 
	@Override
	public String getOriData() {
		return this.oriData;
	}
 
	@Override
	public void setOriData(final String oriData) {
		this.oriData = oriData; 
	}
 
	@Override
	public String getModData() {
		return this.modData;
	}
 
	@Override
	public void setModData(final String modData) {
		this.modData = modData; 
	}
 
	@Override
	public String getModFile() {
		return this.modFile;
	}
 
	@Override
	public void setModFile(final String modFile) {
		this.modFile = modFile; 
	}
 
	@Override
	public String getRemks() {
		return this.remks;
	}
 
	@Override
	public void setRemks(final String remks) {
		this.remks = remks; 
	}
 
	@Override
	public String getBatchNo() {
		return this.batchNo;
	}
 
	@Override
	public void setBatchNo(final String batchNo) {
		this.batchNo = batchNo; 
	}
 
	@Override
	public BigDecimal getDeclSeqNo() {
		return this.declSeqNo;
	}
 
	@Override
	public void setDeclSeqNo(final BigDecimal declSeqNo) {
		this.declSeqNo = declSeqNo; 
	}
 
}
