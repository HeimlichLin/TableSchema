package com.doc.common.po; 
 
public interface IDataProcessInfoPo {
 
	String getTransIdenId();
 
	void setTransIdenId(final String transIdenId);
 
	String getMsgType();
 
	void setMsgType(final String msgType);
 
	String getIndustry();
 
	void setIndustry(final String industry);
 
	String getStatus();
 
	void setStatus(final String status);
 
	String getFileName();
 
	void setFileName(final String fileName);
 
	String getFoodRegNum();
 
	void setFoodRegNum(final String foodRegNum);
 
	String getDataProcessNumber();
 
	void setDataProcessNumber(final String dataProcessNumber);
 
	String getDeleteMark();
 
	void setDeleteMark(final String deleteMark);
 
	String getDeleteReason();
 
	void setDeleteReason(final String deleteReason);
 
	java.sql.Timestamp getInterfaceChangeTime();
 
	void setInterfaceChangeTime(final java.sql.Timestamp interfaceChangeTime);
 
	String getInterfaceChangePerson();
 
	void setInterfaceChangePerson(final String interfaceChangePerson);
 
	String getInterfaceChangeIp();
 
	void setInterfaceChangeIp(final String interfaceChangeIp);
 
	java.sql.Timestamp getInterfacingChangeTime();
 
	void setInterfacingChangeTime(final java.sql.Timestamp interfacingChangeTime);
 
	String getInterfacingChangeSystem();
 
	void setInterfacingChangeSystem(final String interfacingChangeSystem);
 
	String getInterfacingChangeIp();
 
	void setInterfacingChangeIp(final String interfacingChangeIp);
 
	java.sql.Timestamp getInsertday();
 
	void setInsertday(final java.sql.Timestamp insertday);
 
	String getInsertPerson();
 
	void setInsertPerson(final String insertPerson);
 
	String getInsertPersonIp();
 
	void setInsertPersonIp(final String insertPersonIp);
 
	java.sql.Timestamp getUpdtime();
 
	void setUpdtime(final java.sql.Timestamp updtime);
 
	String getUpdatePerson();
 
	void setUpdatePerson(final String updatePerson);
 
	String getUpdatePersonIp();
 
	void setUpdatePersonIp(final String updatePersonIp);
 
}
