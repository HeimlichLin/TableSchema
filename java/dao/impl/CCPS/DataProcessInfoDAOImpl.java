package com.doc.common.dao.impl; 
 
public class DataProcessInfoDAOImpl extends GeneralDAOImpl<DataProcessInfoPo> implements DataProcessInfoDAO { 
	public static final DataProcessInfoDAOImpl INSTANCE = new DataProcessInfoDAOImpl(); 
	public static final String TABLENAME = "DATA_PROCESS_INFO"; 

	public DataProcessInfoDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DataProcessInfoPo> CONVERTER = new MapConverter<DataProcessInfoPo>() { 
 
		@Override 
		public DataProcessInfoPo convert(final DataObject dataObject) { 
			final DataProcessInfoPo dataProcessInfoPo = new DataProcessInfoPo(); 
			dataProcessInfoPo.setTransIdenId(dataObject.getString(DataProcessInfoPo.COLUMNS.TRANS_IDEN_ID.name())); 
			dataProcessInfoPo.setMsgType(dataObject.getString(DataProcessInfoPo.COLUMNS.MSG_TYPE.name())); 
			dataProcessInfoPo.setIndustry(dataObject.getString(DataProcessInfoPo.COLUMNS.INDUSTRY.name())); 
			dataProcessInfoPo.setStatus(dataObject.getString(DataProcessInfoPo.COLUMNS.STATUS.name())); 
			dataProcessInfoPo.setFileName(dataObject.getString(DataProcessInfoPo.COLUMNS.FILE_NAME.name())); 
			dataProcessInfoPo.setFoodRegNum(dataObject.getString(DataProcessInfoPo.COLUMNS.FOOD_REG_NUM.name())); 
			dataProcessInfoPo.setDataProcessNumber(dataObject.getString(DataProcessInfoPo.COLUMNS.DATA_PROCESS_NUMBER.name())); 
			dataProcessInfoPo.setDeleteMark(dataObject.getString(DataProcessInfoPo.COLUMNS.DELETE_MARK.name())); 
			dataProcessInfoPo.setDeleteReason(dataObject.getString(DataProcessInfoPo.COLUMNS.DELETE_REASON.name())); 
			dataProcessInfoPo.setInterfaceChangeTime(TimestampUtils.of(dataObject.getValue(DataProcessInfoPo.COLUMNS.INTERFACE_CHANGE_TIME.name()))); 
			dataProcessInfoPo.setInterfaceChangePerson(dataObject.getString(DataProcessInfoPo.COLUMNS.INTERFACE_CHANGE_PERSON.name())); 
			dataProcessInfoPo.setInterfaceChangeIp(dataObject.getString(DataProcessInfoPo.COLUMNS.INTERFACE_CHANGE_IP.name())); 
			dataProcessInfoPo.setInterfacingChangeTime(TimestampUtils.of(dataObject.getValue(DataProcessInfoPo.COLUMNS.INTERFACING_CHANGE_TIME.name()))); 
			dataProcessInfoPo.setInterfacingChangeSystem(dataObject.getString(DataProcessInfoPo.COLUMNS.INTERFACING_CHANGE_SYSTEM.name())); 
			dataProcessInfoPo.setInterfacingChangeIp(dataObject.getString(DataProcessInfoPo.COLUMNS.INTERFACING_CHANGE_IP.name())); 
			dataProcessInfoPo.setInsertday(TimestampUtils.of(dataObject.getValue(DataProcessInfoPo.COLUMNS.INSERTDAY.name()))); 
			dataProcessInfoPo.setInsertPerson(dataObject.getString(DataProcessInfoPo.COLUMNS.INSERT_PERSON.name())); 
			dataProcessInfoPo.setInsertPersonIp(dataObject.getString(DataProcessInfoPo.COLUMNS.INSERT_PERSON_IP.name())); 
			dataProcessInfoPo.setUpdtime(TimestampUtils.of(dataObject.getValue(DataProcessInfoPo.COLUMNS.UPDTIME.name()))); 
			dataProcessInfoPo.setUpdatePerson(dataObject.getString(DataProcessInfoPo.COLUMNS.UPDATE_PERSON.name())); 
			dataProcessInfoPo.setUpdatePersonIp(dataObject.getString(DataProcessInfoPo.COLUMNS.UPDATE_PERSON_IP.name())); 
			return dataProcessInfoPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DataProcessInfoPo dataProcessInfoPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DataProcessInfoPo.COLUMNS.TRANS_IDEN_ID.name(), dataProcessInfoPo.getTransIdenId()); 
			dataObject.setValue(DataProcessInfoPo.COLUMNS.MSG_TYPE.name(), dataProcessInfoPo.getMsgType()); 
			dataObject.setValue(DataProcessInfoPo.COLUMNS.INDUSTRY.name(), dataProcessInfoPo.getIndustry()); 
			dataObject.setValue(DataProcessInfoPo.COLUMNS.STATUS.name(), dataProcessInfoPo.getStatus()); 
			dataObject.setValue(DataProcessInfoPo.COLUMNS.FILE_NAME.name(), dataProcessInfoPo.getFileName()); 
			dataObject.setValue(DataProcessInfoPo.COLUMNS.FOOD_REG_NUM.name(), dataProcessInfoPo.getFoodRegNum()); 
			dataObject.setValue(DataProcessInfoPo.COLUMNS.DATA_PROCESS_NUMBER.name(), dataProcessInfoPo.getDataProcessNumber()); 
			dataObject.setValue(DataProcessInfoPo.COLUMNS.DELETE_MARK.name(), dataProcessInfoPo.getDeleteMark()); 
			dataObject.setValue(DataProcessInfoPo.COLUMNS.DELETE_REASON.name(), dataProcessInfoPo.getDeleteReason()); 
			dataObject.setValue(DataProcessInfoPo.COLUMNS.INTERFACE_CHANGE_TIME.name(), dataProcessInfoPo.getInterfaceChangeTime()); 
			dataObject.setValue(DataProcessInfoPo.COLUMNS.INTERFACE_CHANGE_PERSON.name(), dataProcessInfoPo.getInterfaceChangePerson()); 
			dataObject.setValue(DataProcessInfoPo.COLUMNS.INTERFACE_CHANGE_IP.name(), dataProcessInfoPo.getInterfaceChangeIp()); 
			dataObject.setValue(DataProcessInfoPo.COLUMNS.INTERFACING_CHANGE_TIME.name(), dataProcessInfoPo.getInterfacingChangeTime()); 
			dataObject.setValue(DataProcessInfoPo.COLUMNS.INTERFACING_CHANGE_SYSTEM.name(), dataProcessInfoPo.getInterfacingChangeSystem()); 
			dataObject.setValue(DataProcessInfoPo.COLUMNS.INTERFACING_CHANGE_IP.name(), dataProcessInfoPo.getInterfacingChangeIp()); 
			dataObject.setValue(DataProcessInfoPo.COLUMNS.INSERTDAY.name(), dataProcessInfoPo.getInsertday()); 
			dataObject.setValue(DataProcessInfoPo.COLUMNS.INSERT_PERSON.name(), dataProcessInfoPo.getInsertPerson()); 
			dataObject.setValue(DataProcessInfoPo.COLUMNS.INSERT_PERSON_IP.name(), dataProcessInfoPo.getInsertPersonIp()); 
			dataObject.setValue(DataProcessInfoPo.COLUMNS.UPDTIME.name(), dataProcessInfoPo.getUpdtime()); 
			dataObject.setValue(DataProcessInfoPo.COLUMNS.UPDATE_PERSON.name(), dataProcessInfoPo.getUpdatePerson()); 
			dataObject.setValue(DataProcessInfoPo.COLUMNS.UPDATE_PERSON_IP.name(), dataProcessInfoPo.getUpdatePersonIp()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DataProcessInfoPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DataProcessInfoPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(DataProcessInfoPo.COLUMNS.TRANS_IDEN_ID.name(), po.getTransIdenId()); 
		sqlWhere.add(DataProcessInfoPo.COLUMNS.MSG_TYPE.name(), po.getMsgType()); 
		return sqlWhere; 
	} 
 
} 
