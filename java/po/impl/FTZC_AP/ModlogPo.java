package com.doc.common.po.impl; 
 
public class ModlogPo implements IModlogPo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		REF_BILL_NO("參考單號"), //
		STR_TYPE("進出倉別： 1：進倉； 2：出倉"), //
		MODIFER("修改者"), //
		MOD_TIME("修改時間"), //
		MOD_FILE("異動紀錄種類： 1：報單資料； 2：進出倉資料； 3：保證金資料"), //
		CONTROL_NO("自主上傳之交換控制碼"), //
		DECL_TYPE("報單類別"), //
		ITEM("項次"), //
		POST("儲位"), //
		MOD_ITEM("修改項目"), //
		ORI_DATA("原始資料"), //
		MOD_DATA("修改後資料"), //
		REMKS("備註"), //
		SERIAL_NO("流水號"), //
		DECL_NO("報單號碼"), //
		ITEM_NO("報單項次"), //
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
	private String refBillNo;
	private String strType;
	private String modifer;
	private String modTime;
	private String modFile;
	private String controlNo;
	private String declType;
	private String item;
	private String post;
	private String modItem;
	private String oriData;
	private String modData;
	private String remks;
	private String serialNo;
	private String declNo;
	private String itemNo;
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
	public String getRefBillNo() {
		return this.refBillNo;
	}
 
	@Override
	public void setRefBillNo(final String refBillNo) {
		this.refBillNo = refBillNo; 
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
	public String getModTime() {
		return this.modTime;
	}
 
	@Override
	public void setModTime(final String modTime) {
		this.modTime = modTime; 
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
	public String getControlNo() {
		return this.controlNo;
	}
 
	@Override
	public void setControlNo(final String controlNo) {
		this.controlNo = controlNo; 
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
	public String getItem() {
		return this.item;
	}
 
	@Override
	public void setItem(final String item) {
		this.item = item; 
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
	public String getRemks() {
		return this.remks;
	}
 
	@Override
	public void setRemks(final String remks) {
		this.remks = remks; 
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
