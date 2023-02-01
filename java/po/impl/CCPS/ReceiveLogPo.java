package com.doc.common.po.impl; 
 
public class ReceiveLogPo implements IReceiveLogPo {
 
	public enum COLUMNS {
		TRANS_IDEN_ID("交易識別碼"), //
		SYS_CODE("系統代號"), //
		IP("位址"), //
		FOOD_REG_NUM("食品登記字號"), //
		USER_ID("使用者代碼"), //
		SRC_INFO("來源資訊(郵箱、IP、FTP、WebService...)"), //
		RECV_MODE("接收模式"), //
		RECV_TIME("接收時間"), //
		STATUS("狀態"), //
		SAVE_PATH("存放路徑"), //
		SAVE_NAME("存放檔名"), //
		FILE_NAME("檔案名稱"), //
		REASON("原因"), //
		DATA_PROCESS_NUMBER("資料處理序號"), //
		BAN("統一編號") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String transIdenId;
	private String sysCode;
	private String ip;
	private String foodRegNum;
	private String userId;
	private String srcInfo;
	private String recvMode;
	private java.sql.Timestamp recvTime;
	private String status;
	private String savePath;
	private String saveName;
	private String fileName;
	private String reason;
	private String dataProcessNumber;
	private String ban;

	@Override
	public String getTransIdenId() {
		return this.transIdenId;
	}
 
	@Override
	public void setTransIdenId(final String transIdenId) {
		this.transIdenId = transIdenId; 
	}
 
	@Override
	public String getSysCode() {
		return this.sysCode;
	}
 
	@Override
	public void setSysCode(final String sysCode) {
		this.sysCode = sysCode; 
	}
 
	@Override
	public String getIp() {
		return this.ip;
	}
 
	@Override
	public void setIp(final String ip) {
		this.ip = ip; 
	}
 
	@Override
	public String getFoodRegNum() {
		return this.foodRegNum;
	}
 
	@Override
	public void setFoodRegNum(final String foodRegNum) {
		this.foodRegNum = foodRegNum; 
	}
 
	@Override
	public String getUserId() {
		return this.userId;
	}
 
	@Override
	public void setUserId(final String userId) {
		this.userId = userId; 
	}
 
	@Override
	public String getSrcInfo() {
		return this.srcInfo;
	}
 
	@Override
	public void setSrcInfo(final String srcInfo) {
		this.srcInfo = srcInfo; 
	}
 
	@Override
	public String getRecvMode() {
		return this.recvMode;
	}
 
	@Override
	public void setRecvMode(final String recvMode) {
		this.recvMode = recvMode; 
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
	public String getStatus() {
		return this.status;
	}
 
	@Override
	public void setStatus(final String status) {
		this.status = status; 
	}
 
	@Override
	public String getSavePath() {
		return this.savePath;
	}
 
	@Override
	public void setSavePath(final String savePath) {
		this.savePath = savePath; 
	}
 
	@Override
	public String getSaveName() {
		return this.saveName;
	}
 
	@Override
	public void setSaveName(final String saveName) {
		this.saveName = saveName; 
	}
 
	@Override
	public String getFileName() {
		return this.fileName;
	}
 
	@Override
	public void setFileName(final String fileName) {
		this.fileName = fileName; 
	}
 
	@Override
	public String getReason() {
		return this.reason;
	}
 
	@Override
	public void setReason(final String reason) {
		this.reason = reason; 
	}
 
	@Override
	public String getDataProcessNumber() {
		return this.dataProcessNumber;
	}
 
	@Override
	public void setDataProcessNumber(final String dataProcessNumber) {
		this.dataProcessNumber = dataProcessNumber; 
	}
 
	@Override
	public String getBan() {
		return this.ban;
	}
 
	@Override
	public void setBan(final String ban) {
		this.ban = ban; 
	}
 
}
