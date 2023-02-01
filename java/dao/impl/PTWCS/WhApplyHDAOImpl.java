package com.doc.common.dao.impl; 
 
public class WhApplyHDAOImpl extends GeneralDAOImpl<WhApplyHPo> implements WhApplyHDAO { 
	public static final WhApplyHDAOImpl INSTANCE = new WhApplyHDAOImpl(); 
	public static final String TABLENAME = "WH_APPLY_H"; 

	public WhApplyHDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<WhApplyHPo> CONVERTER = new MapConverter<WhApplyHPo>() { 
 
		@Override 
		public WhApplyHPo convert(final DataObject dataObject) { 
			final WhApplyHPo whApplyHPo = new WhApplyHPo(); 
			whApplyHPo.setRecordNo(dataObject.getString(WhApplyHPo.COLUMNS.RECORD_NO.name())); 
			whApplyHPo.setWhApplySerNo(dataObject.getString(WhApplyHPo.COLUMNS.WH_APPLY_SER_NO.name())); 
			whApplyHPo.setIeType(dataObject.getString(WhApplyHPo.COLUMNS.IE_TYPE.name())); 
			whApplyHPo.setSchedIoDtS(TimestampUtils.of(dataObject.getValue(WhApplyHPo.COLUMNS.SCHED_IO_DT_S.name()))); 
			whApplyHPo.setSchedIoDtE(TimestampUtils.of(dataObject.getValue(WhApplyHPo.COLUMNS.SCHED_IO_DT_E.name()))); 
			whApplyHPo.setWhUserName(dataObject.getString(WhApplyHPo.COLUMNS.WH_USER_NAME.name())); 
			whApplyHPo.setCompName(dataObject.getString(WhApplyHPo.COLUMNS.COMP_NAME.name())); 
			whApplyHPo.setDocType(dataObject.getString(WhApplyHPo.COLUMNS.DOC_TYPE.name())); 
			whApplyHPo.setDocNo(dataObject.getString(WhApplyHPo.COLUMNS.DOC_NO.name())); 
			whApplyHPo.setIcNo(dataObject.getString(WhApplyHPo.COLUMNS.IC_NO.name())); 
			whApplyHPo.setDeclNo(dataObject.getString(WhApplyHPo.COLUMNS.DECL_NO.name())); 
			whApplyHPo.setFlightNo(dataObject.getString(WhApplyHPo.COLUMNS.FLIGHT_NO.name())); 
			whApplyHPo.setMawbNo(dataObject.getString(WhApplyHPo.COLUMNS.MAWB_NO.name())); 
			whApplyHPo.setHawbNo(dataObject.getString(WhApplyHPo.COLUMNS.HAWB_NO.name())); 
			whApplyHPo.setWhCert(dataObject.getString(WhApplyHPo.COLUMNS.WH_CERT.name())); 
			whApplyHPo.setOthDocComment(dataObject.getString(WhApplyHPo.COLUMNS.OTH_DOC_COMMENT.name())); 
			whApplyHPo.setMainItemName(dataObject.getString(WhApplyHPo.COLUMNS.MAIN_ITEM_NAME.name())); 
			whApplyHPo.setSendApplyDt(TimestampUtils.of(dataObject.getValue(WhApplyHPo.COLUMNS.SEND_APPLY_DT.name()))); 
			whApplyHPo.setApprType(dataObject.getString(WhApplyHPo.COLUMNS.APPR_TYPE.name())); 
			whApplyHPo.setApprDate(TimestampUtils.of(dataObject.getValue(WhApplyHPo.COLUMNS.APPR_DATE.name()))); 
			whApplyHPo.setApprStatus(dataObject.getString(WhApplyHPo.COLUMNS.APPR_STATUS.name())); 
			whApplyHPo.setApprReason(dataObject.getString(WhApplyHPo.COLUMNS.APPR_REASON.name())); 
			whApplyHPo.setUpdateUser(dataObject.getString(WhApplyHPo.COLUMNS.UPDATE_USER.name())); 
			whApplyHPo.setUpdateDate(TimestampUtils.of(dataObject.getValue(WhApplyHPo.COLUMNS.UPDATE_DATE.name()))); 
			return whApplyHPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final WhApplyHPo whApplyHPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WhApplyHPo.COLUMNS.RECORD_NO.name(), whApplyHPo.getRecordNo()); 
			dataObject.setValue(WhApplyHPo.COLUMNS.WH_APPLY_SER_NO.name(), whApplyHPo.getWhApplySerNo()); 
			dataObject.setValue(WhApplyHPo.COLUMNS.IE_TYPE.name(), whApplyHPo.getIeType()); 
			dataObject.setValue(WhApplyHPo.COLUMNS.SCHED_IO_DT_S.name(), whApplyHPo.getSchedIoDtS()); 
			dataObject.setValue(WhApplyHPo.COLUMNS.SCHED_IO_DT_E.name(), whApplyHPo.getSchedIoDtE()); 
			dataObject.setValue(WhApplyHPo.COLUMNS.WH_USER_NAME.name(), whApplyHPo.getWhUserName()); 
			dataObject.setValue(WhApplyHPo.COLUMNS.COMP_NAME.name(), whApplyHPo.getCompName()); 
			dataObject.setValue(WhApplyHPo.COLUMNS.DOC_TYPE.name(), whApplyHPo.getDocType()); 
			dataObject.setValue(WhApplyHPo.COLUMNS.DOC_NO.name(), whApplyHPo.getDocNo()); 
			dataObject.setValue(WhApplyHPo.COLUMNS.IC_NO.name(), whApplyHPo.getIcNo()); 
			dataObject.setValue(WhApplyHPo.COLUMNS.DECL_NO.name(), whApplyHPo.getDeclNo()); 
			dataObject.setValue(WhApplyHPo.COLUMNS.FLIGHT_NO.name(), whApplyHPo.getFlightNo()); 
			dataObject.setValue(WhApplyHPo.COLUMNS.MAWB_NO.name(), whApplyHPo.getMawbNo()); 
			dataObject.setValue(WhApplyHPo.COLUMNS.HAWB_NO.name(), whApplyHPo.getHawbNo()); 
			dataObject.setValue(WhApplyHPo.COLUMNS.WH_CERT.name(), whApplyHPo.getWhCert()); 
			dataObject.setValue(WhApplyHPo.COLUMNS.OTH_DOC_COMMENT.name(), whApplyHPo.getOthDocComment()); 
			dataObject.setValue(WhApplyHPo.COLUMNS.MAIN_ITEM_NAME.name(), whApplyHPo.getMainItemName()); 
			dataObject.setValue(WhApplyHPo.COLUMNS.SEND_APPLY_DT.name(), whApplyHPo.getSendApplyDt()); 
			dataObject.setValue(WhApplyHPo.COLUMNS.APPR_TYPE.name(), whApplyHPo.getApprType()); 
			dataObject.setValue(WhApplyHPo.COLUMNS.APPR_DATE.name(), whApplyHPo.getApprDate()); 
			dataObject.setValue(WhApplyHPo.COLUMNS.APPR_STATUS.name(), whApplyHPo.getApprStatus()); 
			dataObject.setValue(WhApplyHPo.COLUMNS.APPR_REASON.name(), whApplyHPo.getApprReason()); 
			dataObject.setValue(WhApplyHPo.COLUMNS.UPDATE_USER.name(), whApplyHPo.getUpdateUser()); 
			dataObject.setValue(WhApplyHPo.COLUMNS.UPDATE_DATE.name(), whApplyHPo.getUpdateDate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<WhApplyHPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(WhApplyHPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(WhApplyHPo.COLUMNS.RECORD_NO.name(), po.getRecordNo()); 
		sqlWhere.add(WhApplyHPo.COLUMNS.WH_APPLY_SER_NO.name(), po.getWhApplySerNo()); 
		return sqlWhere; 
	} 
 
} 
