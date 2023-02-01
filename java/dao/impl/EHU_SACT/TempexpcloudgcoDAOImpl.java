package com.doc.common.dao.impl; 
 
public class TempexpcloudgcoDAOImpl extends GeneralDAOImpl<TempexpcloudgcoPo> implements TempexpcloudgcoDAO { 
	public static final TempexpcloudgcoDAOImpl INSTANCE = new TempexpcloudgcoDAOImpl(); 
	public static final String TABLENAME = "TEMPEXPCLOUDGCO"; 

	public TempexpcloudgcoDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TempexpcloudgcoPo> CONVERTER = new MapConverter<TempexpcloudgcoPo>() { 
 
		@Override 
		public TempexpcloudgcoPo convert(final DataObject dataObject) { 
			final TempexpcloudgcoPo tempexpcloudgcoPo = new TempexpcloudgcoPo(); 
			tempexpcloudgcoPo.setSn(BigDecimalUtils.formObj(dataObject.getValue(TempexpcloudgcoPo.COLUMNS.SN.name()))); 
			tempexpcloudgcoPo.setIe(dataObject.getString(TempexpcloudgcoPo.COLUMNS.IE.name())); 
			tempexpcloudgcoPo.setWorkarea(dataObject.getString(TempexpcloudgcoPo.COLUMNS.WORKAREA.name())); 
			tempexpcloudgcoPo.setMwb(dataObject.getString(TempexpcloudgcoPo.COLUMNS.MWB.name())); 
			tempexpcloudgcoPo.setHwb(dataObject.getString(TempexpcloudgcoPo.COLUMNS.HWB.name())); 
			tempexpcloudgcoPo.setGcodate(TimestampUtils.of(dataObject.getValue(TempexpcloudgcoPo.COLUMNS.GCODATE.name()))); 
			tempexpcloudgcoPo.setResultCode(dataObject.getString(TempexpcloudgcoPo.COLUMNS.RESULT_CODE.name())); 
			tempexpcloudgcoPo.setResultMsg(dataObject.getString(TempexpcloudgcoPo.COLUMNS.RESULT_MSG.name())); 
			tempexpcloudgcoPo.setExtraCondition(dataObject.getString(TempexpcloudgcoPo.COLUMNS.EXTRA_CONDITION.name())); 
			tempexpcloudgcoPo.setSendStatus(dataObject.getString(TempexpcloudgcoPo.COLUMNS.SEND_STATUS.name())); 
			tempexpcloudgcoPo.setSendQty(BigDecimalUtils.formObj(dataObject.getValue(TempexpcloudgcoPo.COLUMNS.SEND_QTY.name()))); 
			tempexpcloudgcoPo.setDeclNo(dataObject.getString(TempexpcloudgcoPo.COLUMNS.DECL_NO.name())); 
			tempexpcloudgcoPo.setContainer(dataObject.getString(TempexpcloudgcoPo.COLUMNS.CONTAINER.name())); 
			tempexpcloudgcoPo.setFlightno(dataObject.getString(TempexpcloudgcoPo.COLUMNS.FLIGHTNO.name())); 
			tempexpcloudgcoPo.setFlightdest(dataObject.getString(TempexpcloudgcoPo.COLUMNS.FLIGHTDEST.name())); 
			tempexpcloudgcoPo.setChws(dataObject.getString(TempexpcloudgcoPo.COLUMNS.CHWS.name())); 
			tempexpcloudgcoPo.setGcosn(BigDecimalUtils.formObj(dataObject.getValue(TempexpcloudgcoPo.COLUMNS.GCOSN.name()))); 
			tempexpcloudgcoPo.setGcows(dataObject.getString(TempexpcloudgcoPo.COLUMNS.GCOWS.name())); 
			tempexpcloudgcoPo.setCustomsid(dataObject.getString(TempexpcloudgcoPo.COLUMNS.CUSTOMSID.name())); 
			tempexpcloudgcoPo.setWorkstation(dataObject.getString(TempexpcloudgcoPo.COLUMNS.WORKSTATION.name())); 
			tempexpcloudgcoPo.setIsRead(dataObject.getString(TempexpcloudgcoPo.COLUMNS.IS_READ.name())); 
			tempexpcloudgcoPo.setCustomsgcodate(dataObject.getString(TempexpcloudgcoPo.COLUMNS.CUSTOMSGCODATE.name())); 
			tempexpcloudgcoPo.setUserid(dataObject.getString(TempexpcloudgcoPo.COLUMNS.USERID.name())); 
			tempexpcloudgcoPo.setCrtDate(TimestampUtils.of(dataObject.getValue(TempexpcloudgcoPo.COLUMNS.CRT_DATE.name()))); 
			tempexpcloudgcoPo.setUptDt(TimestampUtils.of(dataObject.getValue(TempexpcloudgcoPo.COLUMNS.UPT_DT.name()))); 
			return tempexpcloudgcoPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TempexpcloudgcoPo tempexpcloudgcoPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TempexpcloudgcoPo.COLUMNS.SN.name(), tempexpcloudgcoPo.getSn()); 
			dataObject.setValue(TempexpcloudgcoPo.COLUMNS.IE.name(), tempexpcloudgcoPo.getIe()); 
			dataObject.setValue(TempexpcloudgcoPo.COLUMNS.WORKAREA.name(), tempexpcloudgcoPo.getWorkarea()); 
			dataObject.setValue(TempexpcloudgcoPo.COLUMNS.MWB.name(), tempexpcloudgcoPo.getMwb()); 
			dataObject.setValue(TempexpcloudgcoPo.COLUMNS.HWB.name(), tempexpcloudgcoPo.getHwb()); 
			dataObject.setValue(TempexpcloudgcoPo.COLUMNS.GCODATE.name(), tempexpcloudgcoPo.getGcodate()); 
			dataObject.setValue(TempexpcloudgcoPo.COLUMNS.RESULT_CODE.name(), tempexpcloudgcoPo.getResultCode()); 
			dataObject.setValue(TempexpcloudgcoPo.COLUMNS.RESULT_MSG.name(), tempexpcloudgcoPo.getResultMsg()); 
			dataObject.setValue(TempexpcloudgcoPo.COLUMNS.EXTRA_CONDITION.name(), tempexpcloudgcoPo.getExtraCondition()); 
			dataObject.setValue(TempexpcloudgcoPo.COLUMNS.SEND_STATUS.name(), tempexpcloudgcoPo.getSendStatus()); 
			dataObject.setValue(TempexpcloudgcoPo.COLUMNS.SEND_QTY.name(), tempexpcloudgcoPo.getSendQty()); 
			dataObject.setValue(TempexpcloudgcoPo.COLUMNS.DECL_NO.name(), tempexpcloudgcoPo.getDeclNo()); 
			dataObject.setValue(TempexpcloudgcoPo.COLUMNS.CONTAINER.name(), tempexpcloudgcoPo.getContainer()); 
			dataObject.setValue(TempexpcloudgcoPo.COLUMNS.FLIGHTNO.name(), tempexpcloudgcoPo.getFlightno()); 
			dataObject.setValue(TempexpcloudgcoPo.COLUMNS.FLIGHTDEST.name(), tempexpcloudgcoPo.getFlightdest()); 
			dataObject.setValue(TempexpcloudgcoPo.COLUMNS.CHWS.name(), tempexpcloudgcoPo.getChws()); 
			dataObject.setValue(TempexpcloudgcoPo.COLUMNS.GCOSN.name(), tempexpcloudgcoPo.getGcosn()); 
			dataObject.setValue(TempexpcloudgcoPo.COLUMNS.GCOWS.name(), tempexpcloudgcoPo.getGcows()); 
			dataObject.setValue(TempexpcloudgcoPo.COLUMNS.CUSTOMSID.name(), tempexpcloudgcoPo.getCustomsid()); 
			dataObject.setValue(TempexpcloudgcoPo.COLUMNS.WORKSTATION.name(), tempexpcloudgcoPo.getWorkstation()); 
			dataObject.setValue(TempexpcloudgcoPo.COLUMNS.IS_READ.name(), tempexpcloudgcoPo.getIsRead()); 
			dataObject.setValue(TempexpcloudgcoPo.COLUMNS.CUSTOMSGCODATE.name(), tempexpcloudgcoPo.getCustomsgcodate()); 
			dataObject.setValue(TempexpcloudgcoPo.COLUMNS.USERID.name(), tempexpcloudgcoPo.getUserid()); 
			dataObject.setValue(TempexpcloudgcoPo.COLUMNS.CRT_DATE.name(), tempexpcloudgcoPo.getCrtDate()); 
			dataObject.setValue(TempexpcloudgcoPo.COLUMNS.UPT_DT.name(), tempexpcloudgcoPo.getUptDt()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TempexpcloudgcoPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TempexpcloudgcoPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
