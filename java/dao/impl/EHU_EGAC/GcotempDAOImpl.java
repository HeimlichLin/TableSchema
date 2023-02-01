package com.doc.common.dao.impl; 
 
public class GcotempDAOImpl extends GeneralDAOImpl<GcotempPo> implements GcotempDAO { 
	public static final GcotempDAOImpl INSTANCE = new GcotempDAOImpl(); 
	public static final String TABLENAME = "GCOTEMP"; 

	public GcotempDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<GcotempPo> CONVERTER = new MapConverter<GcotempPo>() { 
 
		@Override 
		public GcotempPo convert(final DataObject dataObject) { 
			final GcotempPo gcotempPo = new GcotempPo(); 
			gcotempPo.setSn(BigDecimalUtils.formObj(dataObject.getValue(GcotempPo.COLUMNS.SN.name()))); 
			gcotempPo.setIe(dataObject.getString(GcotempPo.COLUMNS.IE.name())); 
			gcotempPo.setWorkarea(dataObject.getString(GcotempPo.COLUMNS.WORKAREA.name())); 
			gcotempPo.setHwb(dataObject.getString(GcotempPo.COLUMNS.HWB.name())); 
			gcotempPo.setGcodate(dataObject.getString(GcotempPo.COLUMNS.GCODATE.name())); 
			gcotempPo.setUserid(dataObject.getString(GcotempPo.COLUMNS.USERID.name())); 
			gcotempPo.setResultCode(dataObject.getString(GcotempPo.COLUMNS.RESULT_CODE.name())); 
			gcotempPo.setResultMsg(dataObject.getString(GcotempPo.COLUMNS.RESULT_MSG.name())); 
			gcotempPo.setDeclNo(dataObject.getString(GcotempPo.COLUMNS.DECL_NO.name())); 
			gcotempPo.setExtraCondition(dataObject.getString(GcotempPo.COLUMNS.EXTRA_CONDITION.name())); 
			gcotempPo.setContainer(dataObject.getString(GcotempPo.COLUMNS.CONTAINER.name())); 
			gcotempPo.setFlightno(dataObject.getString(GcotempPo.COLUMNS.FLIGHTNO.name())); 
			gcotempPo.setFlightdest(dataObject.getString(GcotempPo.COLUMNS.FLIGHTDEST.name())); 
			gcotempPo.setSendStatus(dataObject.getString(GcotempPo.COLUMNS.SEND_STATUS.name())); 
			gcotempPo.setSendQty(BigDecimalUtils.formObj(dataObject.getValue(GcotempPo.COLUMNS.SEND_QTY.name()))); 
			gcotempPo.setChws(dataObject.getString(GcotempPo.COLUMNS.CHWS.name())); 
			gcotempPo.setMwb(dataObject.getString(GcotempPo.COLUMNS.MWB.name())); 
			gcotempPo.setIsRead(dataObject.getString(GcotempPo.COLUMNS.IS_READ.name())); 
			gcotempPo.setUptDt(TimestampUtils.of(dataObject.getValue(GcotempPo.COLUMNS.UPT_DT.name()))); 
			gcotempPo.setCrtDate(TimestampUtils.of(dataObject.getValue(GcotempPo.COLUMNS.CRT_DATE.name()))); 
			gcotempPo.setIsMigration(dataObject.getString(GcotempPo.COLUMNS.IS_MIGRATION.name())); 
			gcotempPo.setCustomsid(dataObject.getString(GcotempPo.COLUMNS.CUSTOMSID.name())); 
			gcotempPo.setGcows(dataObject.getString(GcotempPo.COLUMNS.GCOWS.name())); 
			return gcotempPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final GcotempPo gcotempPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(GcotempPo.COLUMNS.SN.name(), gcotempPo.getSn()); 
			dataObject.setValue(GcotempPo.COLUMNS.IE.name(), gcotempPo.getIe()); 
			dataObject.setValue(GcotempPo.COLUMNS.WORKAREA.name(), gcotempPo.getWorkarea()); 
			dataObject.setValue(GcotempPo.COLUMNS.HWB.name(), gcotempPo.getHwb()); 
			dataObject.setValue(GcotempPo.COLUMNS.GCODATE.name(), gcotempPo.getGcodate()); 
			dataObject.setValue(GcotempPo.COLUMNS.USERID.name(), gcotempPo.getUserid()); 
			dataObject.setValue(GcotempPo.COLUMNS.RESULT_CODE.name(), gcotempPo.getResultCode()); 
			dataObject.setValue(GcotempPo.COLUMNS.RESULT_MSG.name(), gcotempPo.getResultMsg()); 
			dataObject.setValue(GcotempPo.COLUMNS.DECL_NO.name(), gcotempPo.getDeclNo()); 
			dataObject.setValue(GcotempPo.COLUMNS.EXTRA_CONDITION.name(), gcotempPo.getExtraCondition()); 
			dataObject.setValue(GcotempPo.COLUMNS.CONTAINER.name(), gcotempPo.getContainer()); 
			dataObject.setValue(GcotempPo.COLUMNS.FLIGHTNO.name(), gcotempPo.getFlightno()); 
			dataObject.setValue(GcotempPo.COLUMNS.FLIGHTDEST.name(), gcotempPo.getFlightdest()); 
			dataObject.setValue(GcotempPo.COLUMNS.SEND_STATUS.name(), gcotempPo.getSendStatus()); 
			dataObject.setValue(GcotempPo.COLUMNS.SEND_QTY.name(), gcotempPo.getSendQty()); 
			dataObject.setValue(GcotempPo.COLUMNS.CHWS.name(), gcotempPo.getChws()); 
			dataObject.setValue(GcotempPo.COLUMNS.MWB.name(), gcotempPo.getMwb()); 
			dataObject.setValue(GcotempPo.COLUMNS.IS_READ.name(), gcotempPo.getIsRead()); 
			dataObject.setValue(GcotempPo.COLUMNS.UPT_DT.name(), gcotempPo.getUptDt()); 
			dataObject.setValue(GcotempPo.COLUMNS.CRT_DATE.name(), gcotempPo.getCrtDate()); 
			dataObject.setValue(GcotempPo.COLUMNS.IS_MIGRATION.name(), gcotempPo.getIsMigration()); 
			dataObject.setValue(GcotempPo.COLUMNS.CUSTOMSID.name(), gcotempPo.getCustomsid()); 
			dataObject.setValue(GcotempPo.COLUMNS.GCOWS.name(), gcotempPo.getGcows()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<GcotempPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(GcotempPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
