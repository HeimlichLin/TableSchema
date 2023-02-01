package com.doc.common.po.impl; 
 
public class InoutmlogPo implements IInoutmlogPo {
 
	public enum COLUMNS {
		USER_ID("使用者"), //
		BF_NO("監管編號"), //
		DELIVER_NO("進出倉單號"), //
		LOG_DATM("異動時間"), //
		LOG_TABLE("異動TABLE"), //
		LOG_ACTION("異動行為ADU"), //
		LOG_COLUMN("異動欄位"), //
		LOG_NEW("新資料"), //
		LOG_OLD("舊資料"), //
		DELIVER_TYPE("進出倉別"), //
		LOG_PGM("紀錄程式"), //
		DELIVER_ITEM_NO("進出倉單項次"), //
		REMARK("修改紀錄備註"), //
		POST("儲位"), //
		VIEW_COLUMN("修改紀錄顯示欄位"), //
		DECL_NO("報單號碼"), //
		ITEM_NO("報單項次"), //
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
 
	private String userId;
	private String bfNo;
	private String deliverNo;
	private String logDatm;
	private String logTable;
	private String logAction;
	private String logColumn;
	private String logNew;
	private String logOld;
	private String deliverType;
	private String logPgm;
	private BigDecimal deliverItemNo;
	private String remark;
	private String post;
	private String viewColumn;
	private String declNo;
	private BigDecimal itemNo;
	private BigDecimal declSeqNo;

	@Override
	public String getUserId() {
		return this.userId;
	}
 
	@Override
	public void setUserId(final String userId) {
		this.userId = userId; 
	}
 
	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
	}
 
	@Override
	public String getDeliverNo() {
		return this.deliverNo;
	}
 
	@Override
	public void setDeliverNo(final String deliverNo) {
		this.deliverNo = deliverNo; 
	}
 
	@Override
	public String getLogDatm() {
		return this.logDatm;
	}
 
	@Override
	public void setLogDatm(final String logDatm) {
		this.logDatm = logDatm; 
	}
 
	@Override
	public String getLogTable() {
		return this.logTable;
	}
 
	@Override
	public void setLogTable(final String logTable) {
		this.logTable = logTable; 
	}
 
	@Override
	public String getLogAction() {
		return this.logAction;
	}
 
	@Override
	public void setLogAction(final String logAction) {
		this.logAction = logAction; 
	}
 
	@Override
	public String getLogColumn() {
		return this.logColumn;
	}
 
	@Override
	public void setLogColumn(final String logColumn) {
		this.logColumn = logColumn; 
	}
 
	@Override
	public String getLogNew() {
		return this.logNew;
	}
 
	@Override
	public void setLogNew(final String logNew) {
		this.logNew = logNew; 
	}
 
	@Override
	public String getLogOld() {
		return this.logOld;
	}
 
	@Override
	public void setLogOld(final String logOld) {
		this.logOld = logOld; 
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
	public String getLogPgm() {
		return this.logPgm;
	}
 
	@Override
	public void setLogPgm(final String logPgm) {
		this.logPgm = logPgm; 
	}
 
	@Override
	public BigDecimal getDeliverItemNo() {
		return this.deliverItemNo;
	}
 
	@Override
	public void setDeliverItemNo(final BigDecimal deliverItemNo) {
		this.deliverItemNo = deliverItemNo; 
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
	public String getPost() {
		return this.post;
	}
 
	@Override
	public void setPost(final String post) {
		this.post = post; 
	}
 
	@Override
	public String getViewColumn() {
		return this.viewColumn;
	}
 
	@Override
	public void setViewColumn(final String viewColumn) {
		this.viewColumn = viewColumn; 
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
	public BigDecimal getDeclSeqNo() {
		return this.declSeqNo;
	}
 
	@Override
	public void setDeclSeqNo(final BigDecimal declSeqNo) {
		this.declSeqNo = declSeqNo; 
	}
 
}
