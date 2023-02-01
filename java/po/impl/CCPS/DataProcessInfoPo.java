package com.doc.common.po.impl; 
 
public class DataProcessInfoPo implements IDataProcessInfoPo {
 
	public enum COLUMNS {
		TRANS_IDEN_ID("交易識別碼"), //
		MSG_TYPE("訊息別"), //
		INDUSTRY("產業別"), //
		STATUS("狀態"), //
		FILE_NAME("檔案名稱"), //
		FOOD_REG_NUM("食品登記字號"), //
		DATA_PROCESS_NUMBER("資料處理序號"), //
		DELETE_MARK("刪除註記"), //
		DELETE_REASON("刪除理由"), //
		INTERFACE_CHANGE_TIME("介面異動時間"), //
		INTERFACE_CHANGE_PERSON("介面異動者"), //
		INTERFACE_CHANGE_IP("介面異動者IP"), //
		INTERFACING_CHANGE_TIME("介接異動時間"), //
		INTERFACING_CHANGE_SYSTEM("介接異動系統"), //
		INTERFACING_CHANGE_IP("介接異動系統IP"), //
		INSERTDAY("建檔時間"), //
		INSERT_PERSON("建檔者"), //
		INSERT_PERSON_IP("建檔者IP"), //
		UPDTIME("最後異動時間"), //
		UPDATE_PERSON("最後異動者"), //
		UPDATE_PERSON_IP("最後異動者IP") //
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
	private String msgType;
	private String industry;
	private String status;
	private String fileName;
	private String foodRegNum;
	private String dataProcessNumber;
	private String deleteMark;
	private String deleteReason;
	private java.sql.Timestamp interfaceChangeTime;
	private String interfaceChangePerson;
	private String interfaceChangeIp;
	private java.sql.Timestamp interfacingChangeTime;
	private String interfacingChangeSystem;
	private String interfacingChangeIp;
	private java.sql.Timestamp insertday;
	private String insertPerson;
	private String insertPersonIp;
	private java.sql.Timestamp updtime;
	private String updatePerson;
	private String updatePersonIp;

	@Override
	public String getTransIdenId() {
		return this.transIdenId;
	}
 
	@Override
	public void setTransIdenId(final String transIdenId) {
		this.transIdenId = transIdenId; 
	}
 
	@Override
	public String getMsgType() {
		return this.msgType;
	}
 
	@Override
	public void setMsgType(final String msgType) {
		this.msgType = msgType; 
	}
 
	@Override
	public String getIndustry() {
		return this.industry;
	}
 
	@Override
	public void setIndustry(final String industry) {
		this.industry = industry; 
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
	public String getFileName() {
		return this.fileName;
	}
 
	@Override
	public void setFileName(final String fileName) {
		this.fileName = fileName; 
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
	public String getDataProcessNumber() {
		return this.dataProcessNumber;
	}
 
	@Override
	public void setDataProcessNumber(final String dataProcessNumber) {
		this.dataProcessNumber = dataProcessNumber; 
	}
 
	@Override
	public String getDeleteMark() {
		return this.deleteMark;
	}
 
	@Override
	public void setDeleteMark(final String deleteMark) {
		this.deleteMark = deleteMark; 
	}
 
	@Override
	public String getDeleteReason() {
		return this.deleteReason;
	}
 
	@Override
	public void setDeleteReason(final String deleteReason) {
		this.deleteReason = deleteReason; 
	}
 
	@Override
	public java.sql.Timestamp getInterfaceChangeTime() {
		return this.interfaceChangeTime;
	}
 
	@Override
	public void setInterfaceChangeTime(final java.sql.Timestamp interfaceChangeTime) {
		this.interfaceChangeTime = interfaceChangeTime; 
	}
 
	@Override
	public String getInterfaceChangePerson() {
		return this.interfaceChangePerson;
	}
 
	@Override
	public void setInterfaceChangePerson(final String interfaceChangePerson) {
		this.interfaceChangePerson = interfaceChangePerson; 
	}
 
	@Override
	public String getInterfaceChangeIp() {
		return this.interfaceChangeIp;
	}
 
	@Override
	public void setInterfaceChangeIp(final String interfaceChangeIp) {
		this.interfaceChangeIp = interfaceChangeIp; 
	}
 
	@Override
	public java.sql.Timestamp getInterfacingChangeTime() {
		return this.interfacingChangeTime;
	}
 
	@Override
	public void setInterfacingChangeTime(final java.sql.Timestamp interfacingChangeTime) {
		this.interfacingChangeTime = interfacingChangeTime; 
	}
 
	@Override
	public String getInterfacingChangeSystem() {
		return this.interfacingChangeSystem;
	}
 
	@Override
	public void setInterfacingChangeSystem(final String interfacingChangeSystem) {
		this.interfacingChangeSystem = interfacingChangeSystem; 
	}
 
	@Override
	public String getInterfacingChangeIp() {
		return this.interfacingChangeIp;
	}
 
	@Override
	public void setInterfacingChangeIp(final String interfacingChangeIp) {
		this.interfacingChangeIp = interfacingChangeIp; 
	}
 
	@Override
	public java.sql.Timestamp getInsertday() {
		return this.insertday;
	}
 
	@Override
	public void setInsertday(final java.sql.Timestamp insertday) {
		this.insertday = insertday; 
	}
 
	@Override
	public String getInsertPerson() {
		return this.insertPerson;
	}
 
	@Override
	public void setInsertPerson(final String insertPerson) {
		this.insertPerson = insertPerson; 
	}
 
	@Override
	public String getInsertPersonIp() {
		return this.insertPersonIp;
	}
 
	@Override
	public void setInsertPersonIp(final String insertPersonIp) {
		this.insertPersonIp = insertPersonIp; 
	}
 
	@Override
	public java.sql.Timestamp getUpdtime() {
		return this.updtime;
	}
 
	@Override
	public void setUpdtime(final java.sql.Timestamp updtime) {
		this.updtime = updtime; 
	}
 
	@Override
	public String getUpdatePerson() {
		return this.updatePerson;
	}
 
	@Override
	public void setUpdatePerson(final String updatePerson) {
		this.updatePerson = updatePerson; 
	}
 
	@Override
	public String getUpdatePersonIp() {
		return this.updatePersonIp;
	}
 
	@Override
	public void setUpdatePersonIp(final String updatePersonIp) {
		this.updatePersonIp = updatePersonIp; 
	}
 
}
