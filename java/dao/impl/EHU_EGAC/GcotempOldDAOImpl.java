package com.doc.common.dao.impl; 
 
public class GcotempOldDAOImpl extends GeneralDAOImpl<GcotempOldPo> implements GcotempOldDAO { 
	public static final GcotempOldDAOImpl INSTANCE = new GcotempOldDAOImpl(); 
	public static final String TABLENAME = "GCOTEMP_OLD"; 

	public GcotempOldDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<GcotempOldPo> CONVERTER = new MapConverter<GcotempOldPo>() { 
 
		@Override 
		public GcotempOldPo convert(final DataObject dataObject) { 
			final GcotempOldPo gcotempOldPo = new GcotempOldPo(); 
			gcotempOldPo.setSn(BigDecimalUtils.formObj(dataObject.getValue(GcotempOldPo.COLUMNS.SN.name()))); 
			gcotempOldPo.setIe(dataObject.getString(GcotempOldPo.COLUMNS.IE.name())); 
			gcotempOldPo.setWorkarea(dataObject.getString(GcotempOldPo.COLUMNS.WORKAREA.name())); 
			gcotempOldPo.setMwb(dataObject.getString(GcotempOldPo.COLUMNS.MWB.name())); 
			gcotempOldPo.setHwb(dataObject.getString(GcotempOldPo.COLUMNS.HWB.name())); 
			gcotempOldPo.setGcodate(dataObject.getString(GcotempOldPo.COLUMNS.GCODATE.name())); 
			gcotempOldPo.setResultCode(dataObject.getString(GcotempOldPo.COLUMNS.RESULT_CODE.name())); 
			gcotempOldPo.setResultMsg(dataObject.getString(GcotempOldPo.COLUMNS.RESULT_MSG.name())); 
			gcotempOldPo.setExtraCondition(dataObject.getString(GcotempOldPo.COLUMNS.EXTRA_CONDITION.name())); 
			gcotempOldPo.setSendStatus(dataObject.getString(GcotempOldPo.COLUMNS.SEND_STATUS.name())); 
			gcotempOldPo.setSendQty(BigDecimalUtils.formObj(dataObject.getValue(GcotempOldPo.COLUMNS.SEND_QTY.name()))); 
			gcotempOldPo.setDeclNo(dataObject.getString(GcotempOldPo.COLUMNS.DECL_NO.name())); 
			gcotempOldPo.setContainer(dataObject.getString(GcotempOldPo.COLUMNS.CONTAINER.name())); 
			gcotempOldPo.setFlightno(dataObject.getString(GcotempOldPo.COLUMNS.FLIGHTNO.name())); 
			gcotempOldPo.setFlightdest(dataObject.getString(GcotempOldPo.COLUMNS.FLIGHTDEST.name())); 
			gcotempOldPo.setChws(dataObject.getString(GcotempOldPo.COLUMNS.CHWS.name())); 
			gcotempOldPo.setIsRead(dataObject.getString(GcotempOldPo.COLUMNS.IS_READ.name())); 
			gcotempOldPo.setIsMigration(dataObject.getString(GcotempOldPo.COLUMNS.IS_MIGRATION.name())); 
			gcotempOldPo.setUserid(dataObject.getString(GcotempOldPo.COLUMNS.USERID.name())); 
			gcotempOldPo.setCrtDate(TimestampUtils.of(dataObject.getValue(GcotempOldPo.COLUMNS.CRT_DATE.name()))); 
			gcotempOldPo.setUptDt(TimestampUtils.of(dataObject.getValue(GcotempOldPo.COLUMNS.UPT_DT.name()))); 
			return gcotempOldPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final GcotempOldPo gcotempOldPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(GcotempOldPo.COLUMNS.SN.name(), gcotempOldPo.getSn()); 
			dataObject.setValue(GcotempOldPo.COLUMNS.IE.name(), gcotempOldPo.getIe()); 
			dataObject.setValue(GcotempOldPo.COLUMNS.WORKAREA.name(), gcotempOldPo.getWorkarea()); 
			dataObject.setValue(GcotempOldPo.COLUMNS.MWB.name(), gcotempOldPo.getMwb()); 
			dataObject.setValue(GcotempOldPo.COLUMNS.HWB.name(), gcotempOldPo.getHwb()); 
			dataObject.setValue(GcotempOldPo.COLUMNS.GCODATE.name(), gcotempOldPo.getGcodate()); 
			dataObject.setValue(GcotempOldPo.COLUMNS.RESULT_CODE.name(), gcotempOldPo.getResultCode()); 
			dataObject.setValue(GcotempOldPo.COLUMNS.RESULT_MSG.name(), gcotempOldPo.getResultMsg()); 
			dataObject.setValue(GcotempOldPo.COLUMNS.EXTRA_CONDITION.name(), gcotempOldPo.getExtraCondition()); 
			dataObject.setValue(GcotempOldPo.COLUMNS.SEND_STATUS.name(), gcotempOldPo.getSendStatus()); 
			dataObject.setValue(GcotempOldPo.COLUMNS.SEND_QTY.name(), gcotempOldPo.getSendQty()); 
			dataObject.setValue(GcotempOldPo.COLUMNS.DECL_NO.name(), gcotempOldPo.getDeclNo()); 
			dataObject.setValue(GcotempOldPo.COLUMNS.CONTAINER.name(), gcotempOldPo.getContainer()); 
			dataObject.setValue(GcotempOldPo.COLUMNS.FLIGHTNO.name(), gcotempOldPo.getFlightno()); 
			dataObject.setValue(GcotempOldPo.COLUMNS.FLIGHTDEST.name(), gcotempOldPo.getFlightdest()); 
			dataObject.setValue(GcotempOldPo.COLUMNS.CHWS.name(), gcotempOldPo.getChws()); 
			dataObject.setValue(GcotempOldPo.COLUMNS.IS_READ.name(), gcotempOldPo.getIsRead()); 
			dataObject.setValue(GcotempOldPo.COLUMNS.IS_MIGRATION.name(), gcotempOldPo.getIsMigration()); 
			dataObject.setValue(GcotempOldPo.COLUMNS.USERID.name(), gcotempOldPo.getUserid()); 
			dataObject.setValue(GcotempOldPo.COLUMNS.CRT_DATE.name(), gcotempOldPo.getCrtDate()); 
			dataObject.setValue(GcotempOldPo.COLUMNS.UPT_DT.name(), gcotempOldPo.getUptDt()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<GcotempOldPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(GcotempOldPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
