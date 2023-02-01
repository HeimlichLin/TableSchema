package com.doc.common.dao.impl; 
 
public class GcoexpcloudgcoDAOImpl extends GeneralDAOImpl<GcoexpcloudgcoPo> implements GcoexpcloudgcoDAO { 
	public static final GcoexpcloudgcoDAOImpl INSTANCE = new GcoexpcloudgcoDAOImpl(); 
	public static final String TABLENAME = "GCOEXPCLOUDGCO"; 

	public GcoexpcloudgcoDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<GcoexpcloudgcoPo> CONVERTER = new MapConverter<GcoexpcloudgcoPo>() { 
 
		@Override 
		public GcoexpcloudgcoPo convert(final DataObject dataObject) { 
			final GcoexpcloudgcoPo gcoexpcloudgcoPo = new GcoexpcloudgcoPo(); 
			gcoexpcloudgcoPo.setSn(BigDecimalUtils.formObj(dataObject.getValue(GcoexpcloudgcoPo.COLUMNS.SN.name()))); 
			gcoexpcloudgcoPo.setIe(dataObject.getString(GcoexpcloudgcoPo.COLUMNS.IE.name())); 
			gcoexpcloudgcoPo.setWorkarea(dataObject.getString(GcoexpcloudgcoPo.COLUMNS.WORKAREA.name())); 
			gcoexpcloudgcoPo.setMwb(dataObject.getString(GcoexpcloudgcoPo.COLUMNS.MWB.name())); 
			gcoexpcloudgcoPo.setHwb(dataObject.getString(GcoexpcloudgcoPo.COLUMNS.HWB.name())); 
			gcoexpcloudgcoPo.setGcodate(TimestampUtils.of(dataObject.getValue(GcoexpcloudgcoPo.COLUMNS.GCODATE.name()))); 
			gcoexpcloudgcoPo.setResultCode(dataObject.getString(GcoexpcloudgcoPo.COLUMNS.RESULT_CODE.name())); 
			gcoexpcloudgcoPo.setResultMsg(dataObject.getString(GcoexpcloudgcoPo.COLUMNS.RESULT_MSG.name())); 
			gcoexpcloudgcoPo.setExtraCondition(dataObject.getString(GcoexpcloudgcoPo.COLUMNS.EXTRA_CONDITION.name())); 
			gcoexpcloudgcoPo.setSendStatus(dataObject.getString(GcoexpcloudgcoPo.COLUMNS.SEND_STATUS.name())); 
			gcoexpcloudgcoPo.setSendQty(BigDecimalUtils.formObj(dataObject.getValue(GcoexpcloudgcoPo.COLUMNS.SEND_QTY.name()))); 
			gcoexpcloudgcoPo.setDeclNo(dataObject.getString(GcoexpcloudgcoPo.COLUMNS.DECL_NO.name())); 
			gcoexpcloudgcoPo.setContainer(dataObject.getString(GcoexpcloudgcoPo.COLUMNS.CONTAINER.name())); 
			gcoexpcloudgcoPo.setFlightno(dataObject.getString(GcoexpcloudgcoPo.COLUMNS.FLIGHTNO.name())); 
			gcoexpcloudgcoPo.setFlightdest(dataObject.getString(GcoexpcloudgcoPo.COLUMNS.FLIGHTDEST.name())); 
			gcoexpcloudgcoPo.setChws(dataObject.getString(GcoexpcloudgcoPo.COLUMNS.CHWS.name())); 
			gcoexpcloudgcoPo.setGcosn(BigDecimalUtils.formObj(dataObject.getValue(GcoexpcloudgcoPo.COLUMNS.GCOSN.name()))); 
			gcoexpcloudgcoPo.setGcows(dataObject.getString(GcoexpcloudgcoPo.COLUMNS.GCOWS.name())); 
			gcoexpcloudgcoPo.setCustomsid(dataObject.getString(GcoexpcloudgcoPo.COLUMNS.CUSTOMSID.name())); 
			gcoexpcloudgcoPo.setWorkstation(dataObject.getString(GcoexpcloudgcoPo.COLUMNS.WORKSTATION.name())); 
			gcoexpcloudgcoPo.setIsRead(dataObject.getString(GcoexpcloudgcoPo.COLUMNS.IS_READ.name())); 
			gcoexpcloudgcoPo.setCustomsgcodate(dataObject.getString(GcoexpcloudgcoPo.COLUMNS.CUSTOMSGCODATE.name())); 
			gcoexpcloudgcoPo.setUserid(dataObject.getString(GcoexpcloudgcoPo.COLUMNS.USERID.name())); 
			gcoexpcloudgcoPo.setCrtDate(TimestampUtils.of(dataObject.getValue(GcoexpcloudgcoPo.COLUMNS.CRT_DATE.name()))); 
			gcoexpcloudgcoPo.setUptDt(TimestampUtils.of(dataObject.getValue(GcoexpcloudgcoPo.COLUMNS.UPT_DT.name()))); 
			return gcoexpcloudgcoPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final GcoexpcloudgcoPo gcoexpcloudgcoPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(GcoexpcloudgcoPo.COLUMNS.SN.name(), gcoexpcloudgcoPo.getSn()); 
			dataObject.setValue(GcoexpcloudgcoPo.COLUMNS.IE.name(), gcoexpcloudgcoPo.getIe()); 
			dataObject.setValue(GcoexpcloudgcoPo.COLUMNS.WORKAREA.name(), gcoexpcloudgcoPo.getWorkarea()); 
			dataObject.setValue(GcoexpcloudgcoPo.COLUMNS.MWB.name(), gcoexpcloudgcoPo.getMwb()); 
			dataObject.setValue(GcoexpcloudgcoPo.COLUMNS.HWB.name(), gcoexpcloudgcoPo.getHwb()); 
			dataObject.setValue(GcoexpcloudgcoPo.COLUMNS.GCODATE.name(), gcoexpcloudgcoPo.getGcodate()); 
			dataObject.setValue(GcoexpcloudgcoPo.COLUMNS.RESULT_CODE.name(), gcoexpcloudgcoPo.getResultCode()); 
			dataObject.setValue(GcoexpcloudgcoPo.COLUMNS.RESULT_MSG.name(), gcoexpcloudgcoPo.getResultMsg()); 
			dataObject.setValue(GcoexpcloudgcoPo.COLUMNS.EXTRA_CONDITION.name(), gcoexpcloudgcoPo.getExtraCondition()); 
			dataObject.setValue(GcoexpcloudgcoPo.COLUMNS.SEND_STATUS.name(), gcoexpcloudgcoPo.getSendStatus()); 
			dataObject.setValue(GcoexpcloudgcoPo.COLUMNS.SEND_QTY.name(), gcoexpcloudgcoPo.getSendQty()); 
			dataObject.setValue(GcoexpcloudgcoPo.COLUMNS.DECL_NO.name(), gcoexpcloudgcoPo.getDeclNo()); 
			dataObject.setValue(GcoexpcloudgcoPo.COLUMNS.CONTAINER.name(), gcoexpcloudgcoPo.getContainer()); 
			dataObject.setValue(GcoexpcloudgcoPo.COLUMNS.FLIGHTNO.name(), gcoexpcloudgcoPo.getFlightno()); 
			dataObject.setValue(GcoexpcloudgcoPo.COLUMNS.FLIGHTDEST.name(), gcoexpcloudgcoPo.getFlightdest()); 
			dataObject.setValue(GcoexpcloudgcoPo.COLUMNS.CHWS.name(), gcoexpcloudgcoPo.getChws()); 
			dataObject.setValue(GcoexpcloudgcoPo.COLUMNS.GCOSN.name(), gcoexpcloudgcoPo.getGcosn()); 
			dataObject.setValue(GcoexpcloudgcoPo.COLUMNS.GCOWS.name(), gcoexpcloudgcoPo.getGcows()); 
			dataObject.setValue(GcoexpcloudgcoPo.COLUMNS.CUSTOMSID.name(), gcoexpcloudgcoPo.getCustomsid()); 
			dataObject.setValue(GcoexpcloudgcoPo.COLUMNS.WORKSTATION.name(), gcoexpcloudgcoPo.getWorkstation()); 
			dataObject.setValue(GcoexpcloudgcoPo.COLUMNS.IS_READ.name(), gcoexpcloudgcoPo.getIsRead()); 
			dataObject.setValue(GcoexpcloudgcoPo.COLUMNS.CUSTOMSGCODATE.name(), gcoexpcloudgcoPo.getCustomsgcodate()); 
			dataObject.setValue(GcoexpcloudgcoPo.COLUMNS.USERID.name(), gcoexpcloudgcoPo.getUserid()); 
			dataObject.setValue(GcoexpcloudgcoPo.COLUMNS.CRT_DATE.name(), gcoexpcloudgcoPo.getCrtDate()); 
			dataObject.setValue(GcoexpcloudgcoPo.COLUMNS.UPT_DT.name(), gcoexpcloudgcoPo.getUptDt()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<GcoexpcloudgcoPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(GcoexpcloudgcoPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
