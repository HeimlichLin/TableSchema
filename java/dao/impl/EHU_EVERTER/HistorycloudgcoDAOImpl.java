package com.doc.common.dao.impl; 
 
public class HistorycloudgcoDAOImpl extends GeneralDAOImpl<HistorycloudgcoPo> implements HistorycloudgcoDAO { 
	public static final HistorycloudgcoDAOImpl INSTANCE = new HistorycloudgcoDAOImpl(); 
	public static final String TABLENAME = "HISTORYCLOUDGCO"; 

	public HistorycloudgcoDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<HistorycloudgcoPo> CONVERTER = new MapConverter<HistorycloudgcoPo>() { 
 
		@Override 
		public HistorycloudgcoPo convert(final DataObject dataObject) { 
			final HistorycloudgcoPo historycloudgcoPo = new HistorycloudgcoPo(); 
			historycloudgcoPo.setSn(BigDecimalUtils.formObj(dataObject.getValue(HistorycloudgcoPo.COLUMNS.SN.name()))); 
			historycloudgcoPo.setIe(dataObject.getString(HistorycloudgcoPo.COLUMNS.IE.name())); 
			historycloudgcoPo.setWorkarea(dataObject.getString(HistorycloudgcoPo.COLUMNS.WORKAREA.name())); 
			historycloudgcoPo.setMwb(dataObject.getString(HistorycloudgcoPo.COLUMNS.MWB.name())); 
			historycloudgcoPo.setHwb(dataObject.getString(HistorycloudgcoPo.COLUMNS.HWB.name())); 
			historycloudgcoPo.setGcodate(TimestampUtils.of(dataObject.getValue(HistorycloudgcoPo.COLUMNS.GCODATE.name()))); 
			historycloudgcoPo.setResultCode(dataObject.getString(HistorycloudgcoPo.COLUMNS.RESULT_CODE.name())); 
			historycloudgcoPo.setResultMsg(dataObject.getString(HistorycloudgcoPo.COLUMNS.RESULT_MSG.name())); 
			historycloudgcoPo.setExtraCondition(dataObject.getString(HistorycloudgcoPo.COLUMNS.EXTRA_CONDITION.name())); 
			historycloudgcoPo.setSendStatus(dataObject.getString(HistorycloudgcoPo.COLUMNS.SEND_STATUS.name())); 
			historycloudgcoPo.setSendQty(BigDecimalUtils.formObj(dataObject.getValue(HistorycloudgcoPo.COLUMNS.SEND_QTY.name()))); 
			historycloudgcoPo.setDeclNo(dataObject.getString(HistorycloudgcoPo.COLUMNS.DECL_NO.name())); 
			historycloudgcoPo.setContainer(dataObject.getString(HistorycloudgcoPo.COLUMNS.CONTAINER.name())); 
			historycloudgcoPo.setFlightno(dataObject.getString(HistorycloudgcoPo.COLUMNS.FLIGHTNO.name())); 
			historycloudgcoPo.setFlightdest(dataObject.getString(HistorycloudgcoPo.COLUMNS.FLIGHTDEST.name())); 
			historycloudgcoPo.setChws(dataObject.getString(HistorycloudgcoPo.COLUMNS.CHWS.name())); 
			historycloudgcoPo.setGcosn(BigDecimalUtils.formObj(dataObject.getValue(HistorycloudgcoPo.COLUMNS.GCOSN.name()))); 
			historycloudgcoPo.setGcows(dataObject.getString(HistorycloudgcoPo.COLUMNS.GCOWS.name())); 
			historycloudgcoPo.setCustomsid(dataObject.getString(HistorycloudgcoPo.COLUMNS.CUSTOMSID.name())); 
			historycloudgcoPo.setWorkstation(dataObject.getString(HistorycloudgcoPo.COLUMNS.WORKSTATION.name())); 
			historycloudgcoPo.setIsRead(dataObject.getString(HistorycloudgcoPo.COLUMNS.IS_READ.name())); 
			historycloudgcoPo.setCustomsgcodate(dataObject.getString(HistorycloudgcoPo.COLUMNS.CUSTOMSGCODATE.name())); 
			historycloudgcoPo.setUserid(dataObject.getString(HistorycloudgcoPo.COLUMNS.USERID.name())); 
			historycloudgcoPo.setCrtDate(TimestampUtils.of(dataObject.getValue(HistorycloudgcoPo.COLUMNS.CRT_DATE.name()))); 
			historycloudgcoPo.setUptDt(TimestampUtils.of(dataObject.getValue(HistorycloudgcoPo.COLUMNS.UPT_DT.name()))); 
			return historycloudgcoPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final HistorycloudgcoPo historycloudgcoPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(HistorycloudgcoPo.COLUMNS.SN.name(), historycloudgcoPo.getSn()); 
			dataObject.setValue(HistorycloudgcoPo.COLUMNS.IE.name(), historycloudgcoPo.getIe()); 
			dataObject.setValue(HistorycloudgcoPo.COLUMNS.WORKAREA.name(), historycloudgcoPo.getWorkarea()); 
			dataObject.setValue(HistorycloudgcoPo.COLUMNS.MWB.name(), historycloudgcoPo.getMwb()); 
			dataObject.setValue(HistorycloudgcoPo.COLUMNS.HWB.name(), historycloudgcoPo.getHwb()); 
			dataObject.setValue(HistorycloudgcoPo.COLUMNS.GCODATE.name(), historycloudgcoPo.getGcodate()); 
			dataObject.setValue(HistorycloudgcoPo.COLUMNS.RESULT_CODE.name(), historycloudgcoPo.getResultCode()); 
			dataObject.setValue(HistorycloudgcoPo.COLUMNS.RESULT_MSG.name(), historycloudgcoPo.getResultMsg()); 
			dataObject.setValue(HistorycloudgcoPo.COLUMNS.EXTRA_CONDITION.name(), historycloudgcoPo.getExtraCondition()); 
			dataObject.setValue(HistorycloudgcoPo.COLUMNS.SEND_STATUS.name(), historycloudgcoPo.getSendStatus()); 
			dataObject.setValue(HistorycloudgcoPo.COLUMNS.SEND_QTY.name(), historycloudgcoPo.getSendQty()); 
			dataObject.setValue(HistorycloudgcoPo.COLUMNS.DECL_NO.name(), historycloudgcoPo.getDeclNo()); 
			dataObject.setValue(HistorycloudgcoPo.COLUMNS.CONTAINER.name(), historycloudgcoPo.getContainer()); 
			dataObject.setValue(HistorycloudgcoPo.COLUMNS.FLIGHTNO.name(), historycloudgcoPo.getFlightno()); 
			dataObject.setValue(HistorycloudgcoPo.COLUMNS.FLIGHTDEST.name(), historycloudgcoPo.getFlightdest()); 
			dataObject.setValue(HistorycloudgcoPo.COLUMNS.CHWS.name(), historycloudgcoPo.getChws()); 
			dataObject.setValue(HistorycloudgcoPo.COLUMNS.GCOSN.name(), historycloudgcoPo.getGcosn()); 
			dataObject.setValue(HistorycloudgcoPo.COLUMNS.GCOWS.name(), historycloudgcoPo.getGcows()); 
			dataObject.setValue(HistorycloudgcoPo.COLUMNS.CUSTOMSID.name(), historycloudgcoPo.getCustomsid()); 
			dataObject.setValue(HistorycloudgcoPo.COLUMNS.WORKSTATION.name(), historycloudgcoPo.getWorkstation()); 
			dataObject.setValue(HistorycloudgcoPo.COLUMNS.IS_READ.name(), historycloudgcoPo.getIsRead()); 
			dataObject.setValue(HistorycloudgcoPo.COLUMNS.CUSTOMSGCODATE.name(), historycloudgcoPo.getCustomsgcodate()); 
			dataObject.setValue(HistorycloudgcoPo.COLUMNS.USERID.name(), historycloudgcoPo.getUserid()); 
			dataObject.setValue(HistorycloudgcoPo.COLUMNS.CRT_DATE.name(), historycloudgcoPo.getCrtDate()); 
			dataObject.setValue(HistorycloudgcoPo.COLUMNS.UPT_DT.name(), historycloudgcoPo.getUptDt()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<HistorycloudgcoPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(HistorycloudgcoPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
