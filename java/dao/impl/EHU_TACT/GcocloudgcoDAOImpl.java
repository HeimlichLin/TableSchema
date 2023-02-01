package com.doc.common.dao.impl; 
 
public class GcocloudgcoDAOImpl extends GeneralDAOImpl<GcocloudgcoPo> implements GcocloudgcoDAO { 
	public static final GcocloudgcoDAOImpl INSTANCE = new GcocloudgcoDAOImpl(); 
	public static final String TABLENAME = "GCOCLOUDGCO"; 

	public GcocloudgcoDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<GcocloudgcoPo> CONVERTER = new MapConverter<GcocloudgcoPo>() { 
 
		@Override 
		public GcocloudgcoPo convert(final DataObject dataObject) { 
			final GcocloudgcoPo gcocloudgcoPo = new GcocloudgcoPo(); 
			gcocloudgcoPo.setSn(BigDecimalUtils.formObj(dataObject.getValue(GcocloudgcoPo.COLUMNS.SN.name()))); 
			gcocloudgcoPo.setIe(dataObject.getString(GcocloudgcoPo.COLUMNS.IE.name())); 
			gcocloudgcoPo.setWorkarea(dataObject.getString(GcocloudgcoPo.COLUMNS.WORKAREA.name())); 
			gcocloudgcoPo.setMwb(dataObject.getString(GcocloudgcoPo.COLUMNS.MWB.name())); 
			gcocloudgcoPo.setHwb(dataObject.getString(GcocloudgcoPo.COLUMNS.HWB.name())); 
			gcocloudgcoPo.setGcodate(TimestampUtils.of(dataObject.getValue(GcocloudgcoPo.COLUMNS.GCODATE.name()))); 
			gcocloudgcoPo.setResultCode(dataObject.getString(GcocloudgcoPo.COLUMNS.RESULT_CODE.name())); 
			gcocloudgcoPo.setResultMsg(dataObject.getString(GcocloudgcoPo.COLUMNS.RESULT_MSG.name())); 
			gcocloudgcoPo.setExtraCondition(dataObject.getString(GcocloudgcoPo.COLUMNS.EXTRA_CONDITION.name())); 
			gcocloudgcoPo.setSendStatus(dataObject.getString(GcocloudgcoPo.COLUMNS.SEND_STATUS.name())); 
			gcocloudgcoPo.setSendQty(BigDecimalUtils.formObj(dataObject.getValue(GcocloudgcoPo.COLUMNS.SEND_QTY.name()))); 
			gcocloudgcoPo.setDeclNo(dataObject.getString(GcocloudgcoPo.COLUMNS.DECL_NO.name())); 
			gcocloudgcoPo.setContainer(dataObject.getString(GcocloudgcoPo.COLUMNS.CONTAINER.name())); 
			gcocloudgcoPo.setFlightno(dataObject.getString(GcocloudgcoPo.COLUMNS.FLIGHTNO.name())); 
			gcocloudgcoPo.setFlightdest(dataObject.getString(GcocloudgcoPo.COLUMNS.FLIGHTDEST.name())); 
			gcocloudgcoPo.setChws(dataObject.getString(GcocloudgcoPo.COLUMNS.CHWS.name())); 
			gcocloudgcoPo.setGcosn(BigDecimalUtils.formObj(dataObject.getValue(GcocloudgcoPo.COLUMNS.GCOSN.name()))); 
			gcocloudgcoPo.setGcows(dataObject.getString(GcocloudgcoPo.COLUMNS.GCOWS.name())); 
			gcocloudgcoPo.setCustomsid(dataObject.getString(GcocloudgcoPo.COLUMNS.CUSTOMSID.name())); 
			gcocloudgcoPo.setWorkstation(dataObject.getString(GcocloudgcoPo.COLUMNS.WORKSTATION.name())); 
			gcocloudgcoPo.setIsRead(dataObject.getString(GcocloudgcoPo.COLUMNS.IS_READ.name())); 
			gcocloudgcoPo.setCustomsgcodate(dataObject.getString(GcocloudgcoPo.COLUMNS.CUSTOMSGCODATE.name())); 
			gcocloudgcoPo.setUserid(dataObject.getString(GcocloudgcoPo.COLUMNS.USERID.name())); 
			gcocloudgcoPo.setCrtDate(TimestampUtils.of(dataObject.getValue(GcocloudgcoPo.COLUMNS.CRT_DATE.name()))); 
			gcocloudgcoPo.setUptDt(TimestampUtils.of(dataObject.getValue(GcocloudgcoPo.COLUMNS.UPT_DT.name()))); 
			return gcocloudgcoPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final GcocloudgcoPo gcocloudgcoPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(GcocloudgcoPo.COLUMNS.SN.name(), gcocloudgcoPo.getSn()); 
			dataObject.setValue(GcocloudgcoPo.COLUMNS.IE.name(), gcocloudgcoPo.getIe()); 
			dataObject.setValue(GcocloudgcoPo.COLUMNS.WORKAREA.name(), gcocloudgcoPo.getWorkarea()); 
			dataObject.setValue(GcocloudgcoPo.COLUMNS.MWB.name(), gcocloudgcoPo.getMwb()); 
			dataObject.setValue(GcocloudgcoPo.COLUMNS.HWB.name(), gcocloudgcoPo.getHwb()); 
			dataObject.setValue(GcocloudgcoPo.COLUMNS.GCODATE.name(), gcocloudgcoPo.getGcodate()); 
			dataObject.setValue(GcocloudgcoPo.COLUMNS.RESULT_CODE.name(), gcocloudgcoPo.getResultCode()); 
			dataObject.setValue(GcocloudgcoPo.COLUMNS.RESULT_MSG.name(), gcocloudgcoPo.getResultMsg()); 
			dataObject.setValue(GcocloudgcoPo.COLUMNS.EXTRA_CONDITION.name(), gcocloudgcoPo.getExtraCondition()); 
			dataObject.setValue(GcocloudgcoPo.COLUMNS.SEND_STATUS.name(), gcocloudgcoPo.getSendStatus()); 
			dataObject.setValue(GcocloudgcoPo.COLUMNS.SEND_QTY.name(), gcocloudgcoPo.getSendQty()); 
			dataObject.setValue(GcocloudgcoPo.COLUMNS.DECL_NO.name(), gcocloudgcoPo.getDeclNo()); 
			dataObject.setValue(GcocloudgcoPo.COLUMNS.CONTAINER.name(), gcocloudgcoPo.getContainer()); 
			dataObject.setValue(GcocloudgcoPo.COLUMNS.FLIGHTNO.name(), gcocloudgcoPo.getFlightno()); 
			dataObject.setValue(GcocloudgcoPo.COLUMNS.FLIGHTDEST.name(), gcocloudgcoPo.getFlightdest()); 
			dataObject.setValue(GcocloudgcoPo.COLUMNS.CHWS.name(), gcocloudgcoPo.getChws()); 
			dataObject.setValue(GcocloudgcoPo.COLUMNS.GCOSN.name(), gcocloudgcoPo.getGcosn()); 
			dataObject.setValue(GcocloudgcoPo.COLUMNS.GCOWS.name(), gcocloudgcoPo.getGcows()); 
			dataObject.setValue(GcocloudgcoPo.COLUMNS.CUSTOMSID.name(), gcocloudgcoPo.getCustomsid()); 
			dataObject.setValue(GcocloudgcoPo.COLUMNS.WORKSTATION.name(), gcocloudgcoPo.getWorkstation()); 
			dataObject.setValue(GcocloudgcoPo.COLUMNS.IS_READ.name(), gcocloudgcoPo.getIsRead()); 
			dataObject.setValue(GcocloudgcoPo.COLUMNS.CUSTOMSGCODATE.name(), gcocloudgcoPo.getCustomsgcodate()); 
			dataObject.setValue(GcocloudgcoPo.COLUMNS.USERID.name(), gcocloudgcoPo.getUserid()); 
			dataObject.setValue(GcocloudgcoPo.COLUMNS.CRT_DATE.name(), gcocloudgcoPo.getCrtDate()); 
			dataObject.setValue(GcocloudgcoPo.COLUMNS.UPT_DT.name(), gcocloudgcoPo.getUptDt()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<GcocloudgcoPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(GcocloudgcoPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
