package com.doc.common.dao.impl; 
 
public class WhApplyDAOImpl extends GeneralDAOImpl<WhApplyPo> implements WhApplyDAO { 
	public static final WhApplyDAOImpl INSTANCE = new WhApplyDAOImpl(); 
	public static final String TABLENAME = "WH_APPLY"; 

	public WhApplyDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<WhApplyPo> CONVERTER = new MapConverter<WhApplyPo>() { 
 
		@Override 
		public WhApplyPo convert(final DataObject dataObject) { 
			final WhApplyPo whApplyPo = new WhApplyPo(); 
			whApplyPo.setWhApplySerNo(dataObject.getString(WhApplyPo.COLUMNS.WH_APPLY_SER_NO.name())); 
			whApplyPo.setIeType(dataObject.getString(WhApplyPo.COLUMNS.IE_TYPE.name())); 
			whApplyPo.setSchedIoDtS(TimestampUtils.of(dataObject.getValue(WhApplyPo.COLUMNS.SCHED_IO_DT_S.name()))); 
			whApplyPo.setSchedIoDtE(TimestampUtils.of(dataObject.getValue(WhApplyPo.COLUMNS.SCHED_IO_DT_E.name()))); 
			whApplyPo.setWhUserName(dataObject.getString(WhApplyPo.COLUMNS.WH_USER_NAME.name())); 
			whApplyPo.setCompName(dataObject.getString(WhApplyPo.COLUMNS.COMP_NAME.name())); 
			whApplyPo.setDocType(dataObject.getString(WhApplyPo.COLUMNS.DOC_TYPE.name())); 
			whApplyPo.setDocNo(dataObject.getString(WhApplyPo.COLUMNS.DOC_NO.name())); 
			whApplyPo.setIcNo(dataObject.getString(WhApplyPo.COLUMNS.IC_NO.name())); 
			whApplyPo.setDeclNo(dataObject.getString(WhApplyPo.COLUMNS.DECL_NO.name())); 
			whApplyPo.setFlightNo(dataObject.getString(WhApplyPo.COLUMNS.FLIGHT_NO.name())); 
			whApplyPo.setMawbNo(dataObject.getString(WhApplyPo.COLUMNS.MAWB_NO.name())); 
			whApplyPo.setHawbNo(dataObject.getString(WhApplyPo.COLUMNS.HAWB_NO.name())); 
			whApplyPo.setWhCert(dataObject.getString(WhApplyPo.COLUMNS.WH_CERT.name())); 
			whApplyPo.setOthDocComment(dataObject.getString(WhApplyPo.COLUMNS.OTH_DOC_COMMENT.name())); 
			whApplyPo.setMainItemName(dataObject.getString(WhApplyPo.COLUMNS.MAIN_ITEM_NAME.name())); 
			whApplyPo.setSendApplyDt(TimestampUtils.of(dataObject.getValue(WhApplyPo.COLUMNS.SEND_APPLY_DT.name()))); 
			whApplyPo.setApprType(dataObject.getString(WhApplyPo.COLUMNS.APPR_TYPE.name())); 
			whApplyPo.setApprDate(TimestampUtils.of(dataObject.getValue(WhApplyPo.COLUMNS.APPR_DATE.name()))); 
			whApplyPo.setApprStatus(dataObject.getString(WhApplyPo.COLUMNS.APPR_STATUS.name())); 
			whApplyPo.setApprReason(dataObject.getString(WhApplyPo.COLUMNS.APPR_REASON.name())); 
			whApplyPo.setUpdateUser(dataObject.getString(WhApplyPo.COLUMNS.UPDATE_USER.name())); 
			whApplyPo.setUpdateDate(TimestampUtils.of(dataObject.getValue(WhApplyPo.COLUMNS.UPDATE_DATE.name()))); 
			return whApplyPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final WhApplyPo whApplyPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WhApplyPo.COLUMNS.WH_APPLY_SER_NO.name(), whApplyPo.getWhApplySerNo()); 
			dataObject.setValue(WhApplyPo.COLUMNS.IE_TYPE.name(), whApplyPo.getIeType()); 
			dataObject.setValue(WhApplyPo.COLUMNS.SCHED_IO_DT_S.name(), whApplyPo.getSchedIoDtS()); 
			dataObject.setValue(WhApplyPo.COLUMNS.SCHED_IO_DT_E.name(), whApplyPo.getSchedIoDtE()); 
			dataObject.setValue(WhApplyPo.COLUMNS.WH_USER_NAME.name(), whApplyPo.getWhUserName()); 
			dataObject.setValue(WhApplyPo.COLUMNS.COMP_NAME.name(), whApplyPo.getCompName()); 
			dataObject.setValue(WhApplyPo.COLUMNS.DOC_TYPE.name(), whApplyPo.getDocType()); 
			dataObject.setValue(WhApplyPo.COLUMNS.DOC_NO.name(), whApplyPo.getDocNo()); 
			dataObject.setValue(WhApplyPo.COLUMNS.IC_NO.name(), whApplyPo.getIcNo()); 
			dataObject.setValue(WhApplyPo.COLUMNS.DECL_NO.name(), whApplyPo.getDeclNo()); 
			dataObject.setValue(WhApplyPo.COLUMNS.FLIGHT_NO.name(), whApplyPo.getFlightNo()); 
			dataObject.setValue(WhApplyPo.COLUMNS.MAWB_NO.name(), whApplyPo.getMawbNo()); 
			dataObject.setValue(WhApplyPo.COLUMNS.HAWB_NO.name(), whApplyPo.getHawbNo()); 
			dataObject.setValue(WhApplyPo.COLUMNS.WH_CERT.name(), whApplyPo.getWhCert()); 
			dataObject.setValue(WhApplyPo.COLUMNS.OTH_DOC_COMMENT.name(), whApplyPo.getOthDocComment()); 
			dataObject.setValue(WhApplyPo.COLUMNS.MAIN_ITEM_NAME.name(), whApplyPo.getMainItemName()); 
			dataObject.setValue(WhApplyPo.COLUMNS.SEND_APPLY_DT.name(), whApplyPo.getSendApplyDt()); 
			dataObject.setValue(WhApplyPo.COLUMNS.APPR_TYPE.name(), whApplyPo.getApprType()); 
			dataObject.setValue(WhApplyPo.COLUMNS.APPR_DATE.name(), whApplyPo.getApprDate()); 
			dataObject.setValue(WhApplyPo.COLUMNS.APPR_STATUS.name(), whApplyPo.getApprStatus()); 
			dataObject.setValue(WhApplyPo.COLUMNS.APPR_REASON.name(), whApplyPo.getApprReason()); 
			dataObject.setValue(WhApplyPo.COLUMNS.UPDATE_USER.name(), whApplyPo.getUpdateUser()); 
			dataObject.setValue(WhApplyPo.COLUMNS.UPDATE_DATE.name(), whApplyPo.getUpdateDate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<WhApplyPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(WhApplyPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(WhApplyPo.COLUMNS.WH_APPLY_SER_NO.name(), po.getWhApplySerNo()); 
		return sqlWhere; 
	} 
 
} 
