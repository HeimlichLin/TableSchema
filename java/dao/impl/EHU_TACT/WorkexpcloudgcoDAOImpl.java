package com.doc.common.dao.impl; 
 
public class WorkexpcloudgcoDAOImpl extends GeneralDAOImpl<WorkexpcloudgcoPo> implements WorkexpcloudgcoDAO { 
	public static final WorkexpcloudgcoDAOImpl INSTANCE = new WorkexpcloudgcoDAOImpl(); 
	public static final String TABLENAME = "WORKEXPCLOUDGCO"; 

	public WorkexpcloudgcoDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<WorkexpcloudgcoPo> CONVERTER = new MapConverter<WorkexpcloudgcoPo>() { 
 
		@Override 
		public WorkexpcloudgcoPo convert(final DataObject dataObject) { 
			final WorkexpcloudgcoPo workexpcloudgcoPo = new WorkexpcloudgcoPo(); 
			workexpcloudgcoPo.setSn(BigDecimalUtils.formObj(dataObject.getValue(WorkexpcloudgcoPo.COLUMNS.SN.name()))); 
			workexpcloudgcoPo.setIe(dataObject.getString(WorkexpcloudgcoPo.COLUMNS.IE.name())); 
			workexpcloudgcoPo.setWorkarea(dataObject.getString(WorkexpcloudgcoPo.COLUMNS.WORKAREA.name())); 
			workexpcloudgcoPo.setMwb(dataObject.getString(WorkexpcloudgcoPo.COLUMNS.MWB.name())); 
			workexpcloudgcoPo.setHwb(dataObject.getString(WorkexpcloudgcoPo.COLUMNS.HWB.name())); 
			workexpcloudgcoPo.setGcodate(TimestampUtils.of(dataObject.getValue(WorkexpcloudgcoPo.COLUMNS.GCODATE.name()))); 
			workexpcloudgcoPo.setResultCode(dataObject.getString(WorkexpcloudgcoPo.COLUMNS.RESULT_CODE.name())); 
			workexpcloudgcoPo.setResultMsg(dataObject.getString(WorkexpcloudgcoPo.COLUMNS.RESULT_MSG.name())); 
			workexpcloudgcoPo.setExtraCondition(dataObject.getString(WorkexpcloudgcoPo.COLUMNS.EXTRA_CONDITION.name())); 
			workexpcloudgcoPo.setSendStatus(dataObject.getString(WorkexpcloudgcoPo.COLUMNS.SEND_STATUS.name())); 
			workexpcloudgcoPo.setSendQty(BigDecimalUtils.formObj(dataObject.getValue(WorkexpcloudgcoPo.COLUMNS.SEND_QTY.name()))); 
			workexpcloudgcoPo.setDeclNo(dataObject.getString(WorkexpcloudgcoPo.COLUMNS.DECL_NO.name())); 
			workexpcloudgcoPo.setContainer(dataObject.getString(WorkexpcloudgcoPo.COLUMNS.CONTAINER.name())); 
			workexpcloudgcoPo.setFlightno(dataObject.getString(WorkexpcloudgcoPo.COLUMNS.FLIGHTNO.name())); 
			workexpcloudgcoPo.setFlightdest(dataObject.getString(WorkexpcloudgcoPo.COLUMNS.FLIGHTDEST.name())); 
			workexpcloudgcoPo.setChws(dataObject.getString(WorkexpcloudgcoPo.COLUMNS.CHWS.name())); 
			workexpcloudgcoPo.setGcosn(BigDecimalUtils.formObj(dataObject.getValue(WorkexpcloudgcoPo.COLUMNS.GCOSN.name()))); 
			workexpcloudgcoPo.setGcows(dataObject.getString(WorkexpcloudgcoPo.COLUMNS.GCOWS.name())); 
			workexpcloudgcoPo.setCustomsid(dataObject.getString(WorkexpcloudgcoPo.COLUMNS.CUSTOMSID.name())); 
			workexpcloudgcoPo.setWorkstation(dataObject.getString(WorkexpcloudgcoPo.COLUMNS.WORKSTATION.name())); 
			workexpcloudgcoPo.setIsRead(dataObject.getString(WorkexpcloudgcoPo.COLUMNS.IS_READ.name())); 
			workexpcloudgcoPo.setCustomsgcodate(dataObject.getString(WorkexpcloudgcoPo.COLUMNS.CUSTOMSGCODATE.name())); 
			workexpcloudgcoPo.setUserid(dataObject.getString(WorkexpcloudgcoPo.COLUMNS.USERID.name())); 
			workexpcloudgcoPo.setCrtDate(TimestampUtils.of(dataObject.getValue(WorkexpcloudgcoPo.COLUMNS.CRT_DATE.name()))); 
			workexpcloudgcoPo.setUptDt(TimestampUtils.of(dataObject.getValue(WorkexpcloudgcoPo.COLUMNS.UPT_DT.name()))); 
			return workexpcloudgcoPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final WorkexpcloudgcoPo workexpcloudgcoPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WorkexpcloudgcoPo.COLUMNS.SN.name(), workexpcloudgcoPo.getSn()); 
			dataObject.setValue(WorkexpcloudgcoPo.COLUMNS.IE.name(), workexpcloudgcoPo.getIe()); 
			dataObject.setValue(WorkexpcloudgcoPo.COLUMNS.WORKAREA.name(), workexpcloudgcoPo.getWorkarea()); 
			dataObject.setValue(WorkexpcloudgcoPo.COLUMNS.MWB.name(), workexpcloudgcoPo.getMwb()); 
			dataObject.setValue(WorkexpcloudgcoPo.COLUMNS.HWB.name(), workexpcloudgcoPo.getHwb()); 
			dataObject.setValue(WorkexpcloudgcoPo.COLUMNS.GCODATE.name(), workexpcloudgcoPo.getGcodate()); 
			dataObject.setValue(WorkexpcloudgcoPo.COLUMNS.RESULT_CODE.name(), workexpcloudgcoPo.getResultCode()); 
			dataObject.setValue(WorkexpcloudgcoPo.COLUMNS.RESULT_MSG.name(), workexpcloudgcoPo.getResultMsg()); 
			dataObject.setValue(WorkexpcloudgcoPo.COLUMNS.EXTRA_CONDITION.name(), workexpcloudgcoPo.getExtraCondition()); 
			dataObject.setValue(WorkexpcloudgcoPo.COLUMNS.SEND_STATUS.name(), workexpcloudgcoPo.getSendStatus()); 
			dataObject.setValue(WorkexpcloudgcoPo.COLUMNS.SEND_QTY.name(), workexpcloudgcoPo.getSendQty()); 
			dataObject.setValue(WorkexpcloudgcoPo.COLUMNS.DECL_NO.name(), workexpcloudgcoPo.getDeclNo()); 
			dataObject.setValue(WorkexpcloudgcoPo.COLUMNS.CONTAINER.name(), workexpcloudgcoPo.getContainer()); 
			dataObject.setValue(WorkexpcloudgcoPo.COLUMNS.FLIGHTNO.name(), workexpcloudgcoPo.getFlightno()); 
			dataObject.setValue(WorkexpcloudgcoPo.COLUMNS.FLIGHTDEST.name(), workexpcloudgcoPo.getFlightdest()); 
			dataObject.setValue(WorkexpcloudgcoPo.COLUMNS.CHWS.name(), workexpcloudgcoPo.getChws()); 
			dataObject.setValue(WorkexpcloudgcoPo.COLUMNS.GCOSN.name(), workexpcloudgcoPo.getGcosn()); 
			dataObject.setValue(WorkexpcloudgcoPo.COLUMNS.GCOWS.name(), workexpcloudgcoPo.getGcows()); 
			dataObject.setValue(WorkexpcloudgcoPo.COLUMNS.CUSTOMSID.name(), workexpcloudgcoPo.getCustomsid()); 
			dataObject.setValue(WorkexpcloudgcoPo.COLUMNS.WORKSTATION.name(), workexpcloudgcoPo.getWorkstation()); 
			dataObject.setValue(WorkexpcloudgcoPo.COLUMNS.IS_READ.name(), workexpcloudgcoPo.getIsRead()); 
			dataObject.setValue(WorkexpcloudgcoPo.COLUMNS.CUSTOMSGCODATE.name(), workexpcloudgcoPo.getCustomsgcodate()); 
			dataObject.setValue(WorkexpcloudgcoPo.COLUMNS.USERID.name(), workexpcloudgcoPo.getUserid()); 
			dataObject.setValue(WorkexpcloudgcoPo.COLUMNS.CRT_DATE.name(), workexpcloudgcoPo.getCrtDate()); 
			dataObject.setValue(WorkexpcloudgcoPo.COLUMNS.UPT_DT.name(), workexpcloudgcoPo.getUptDt()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<WorkexpcloudgcoPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(WorkexpcloudgcoPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
