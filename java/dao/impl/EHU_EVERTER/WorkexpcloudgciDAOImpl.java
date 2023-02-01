package com.doc.common.dao.impl; 
 
public class WorkexpcloudgciDAOImpl extends GeneralDAOImpl<WorkexpcloudgciPo> implements WorkexpcloudgciDAO { 
	public static final WorkexpcloudgciDAOImpl INSTANCE = new WorkexpcloudgciDAOImpl(); 
	public static final String TABLENAME = "WORKEXPCLOUDGCI"; 

	public WorkexpcloudgciDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<WorkexpcloudgciPo> CONVERTER = new MapConverter<WorkexpcloudgciPo>() { 
 
		@Override 
		public WorkexpcloudgciPo convert(final DataObject dataObject) { 
			final WorkexpcloudgciPo workexpcloudgciPo = new WorkexpcloudgciPo(); 
			workexpcloudgciPo.setSn(BigDecimalUtils.formObj(dataObject.getValue(WorkexpcloudgciPo.COLUMNS.SN.name()))); 
			workexpcloudgciPo.setIe(dataObject.getString(WorkexpcloudgciPo.COLUMNS.IE.name())); 
			workexpcloudgciPo.setWorkarea(dataObject.getString(WorkexpcloudgciPo.COLUMNS.WORKAREA.name())); 
			workexpcloudgciPo.setMwb(dataObject.getString(WorkexpcloudgciPo.COLUMNS.MWB.name())); 
			workexpcloudgciPo.setHwb(dataObject.getString(WorkexpcloudgciPo.COLUMNS.HWB.name())); 
			workexpcloudgciPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(WorkexpcloudgciPo.COLUMNS.WEIGHT.name()))); 
			workexpcloudgciPo.setBoxno(dataObject.getString(WorkexpcloudgciPo.COLUMNS.BOXNO.name())); 
			workexpcloudgciPo.setDeclNo(dataObject.getString(WorkexpcloudgciPo.COLUMNS.DECL_NO.name())); 
			workexpcloudgciPo.setDeclType(dataObject.getString(WorkexpcloudgciPo.COLUMNS.DECL_TYPE.name())); 
			workexpcloudgciPo.setBagTotalQty(BigDecimalUtils.formObj(dataObject.getValue(WorkexpcloudgciPo.COLUMNS.BAG_TOTAL_QTY.name()))); 
			workexpcloudgciPo.setBagClearanceType(dataObject.getString(WorkexpcloudgciPo.COLUMNS.BAG_CLEARANCE_TYPE.name())); 
			workexpcloudgciPo.setGoodsReceivedQty(BigDecimalUtils.formObj(dataObject.getValue(WorkexpcloudgciPo.COLUMNS.GOODS_RECEIVED_QTY.name()))); 
			workexpcloudgciPo.setPackageTotalQty(BigDecimalUtils.formObj(dataObject.getValue(WorkexpcloudgciPo.COLUMNS.PACKAGE_TOTAL_QTY.name()))); 
			workexpcloudgciPo.setGcidate(TimestampUtils.of(dataObject.getValue(WorkexpcloudgciPo.COLUMNS.GCIDATE.name()))); 
			workexpcloudgciPo.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(WorkexpcloudgciPo.COLUMNS.GCIPIECE.name()))); 
			workexpcloudgciPo.setGciws(dataObject.getString(WorkexpcloudgciPo.COLUMNS.GCIWS.name())); 
			workexpcloudgciPo.setUserid(dataObject.getString(WorkexpcloudgciPo.COLUMNS.USERID.name())); 
			workexpcloudgciPo.setGciCustomsid(dataObject.getString(WorkexpcloudgciPo.COLUMNS.GCI_CUSTOMSID.name())); 
			workexpcloudgciPo.setResultCode(dataObject.getString(WorkexpcloudgciPo.COLUMNS.RESULT_CODE.name())); 
			workexpcloudgciPo.setResultMsg(dataObject.getString(WorkexpcloudgciPo.COLUMNS.RESULT_MSG.name())); 
			workexpcloudgciPo.setSendStatus(dataObject.getString(WorkexpcloudgciPo.COLUMNS.SEND_STATUS.name())); 
			workexpcloudgciPo.setSendQty(BigDecimalUtils.formObj(dataObject.getValue(WorkexpcloudgciPo.COLUMNS.SEND_QTY.name()))); 
			workexpcloudgciPo.setExpressid(dataObject.getString(WorkexpcloudgciPo.COLUMNS.EXPRESSID.name())); 
			workexpcloudgciPo.setFlightno(dataObject.getString(WorkexpcloudgciPo.COLUMNS.FLIGHTNO.name())); 
			workexpcloudgciPo.setFlightdest(dataObject.getString(WorkexpcloudgciPo.COLUMNS.FLIGHTDEST.name())); 
			workexpcloudgciPo.setChws(dataObject.getString(WorkexpcloudgciPo.COLUMNS.CHWS.name())); 
			workexpcloudgciPo.setCustomsgcidate(dataObject.getString(WorkexpcloudgciPo.COLUMNS.CUSTOMSGCIDATE.name())); 
			workexpcloudgciPo.setInRead(dataObject.getString(WorkexpcloudgciPo.COLUMNS.IN_READ.name())); 
			workexpcloudgciPo.setCrtDate(TimestampUtils.of(dataObject.getValue(WorkexpcloudgciPo.COLUMNS.CRT_DATE.name()))); 
			workexpcloudgciPo.setUptDt(TimestampUtils.of(dataObject.getValue(WorkexpcloudgciPo.COLUMNS.UPT_DT.name()))); 
			return workexpcloudgciPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final WorkexpcloudgciPo workexpcloudgciPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WorkexpcloudgciPo.COLUMNS.SN.name(), workexpcloudgciPo.getSn()); 
			dataObject.setValue(WorkexpcloudgciPo.COLUMNS.IE.name(), workexpcloudgciPo.getIe()); 
			dataObject.setValue(WorkexpcloudgciPo.COLUMNS.WORKAREA.name(), workexpcloudgciPo.getWorkarea()); 
			dataObject.setValue(WorkexpcloudgciPo.COLUMNS.MWB.name(), workexpcloudgciPo.getMwb()); 
			dataObject.setValue(WorkexpcloudgciPo.COLUMNS.HWB.name(), workexpcloudgciPo.getHwb()); 
			dataObject.setValue(WorkexpcloudgciPo.COLUMNS.WEIGHT.name(), workexpcloudgciPo.getWeight()); 
			dataObject.setValue(WorkexpcloudgciPo.COLUMNS.BOXNO.name(), workexpcloudgciPo.getBoxno()); 
			dataObject.setValue(WorkexpcloudgciPo.COLUMNS.DECL_NO.name(), workexpcloudgciPo.getDeclNo()); 
			dataObject.setValue(WorkexpcloudgciPo.COLUMNS.DECL_TYPE.name(), workexpcloudgciPo.getDeclType()); 
			dataObject.setValue(WorkexpcloudgciPo.COLUMNS.BAG_TOTAL_QTY.name(), workexpcloudgciPo.getBagTotalQty()); 
			dataObject.setValue(WorkexpcloudgciPo.COLUMNS.BAG_CLEARANCE_TYPE.name(), workexpcloudgciPo.getBagClearanceType()); 
			dataObject.setValue(WorkexpcloudgciPo.COLUMNS.GOODS_RECEIVED_QTY.name(), workexpcloudgciPo.getGoodsReceivedQty()); 
			dataObject.setValue(WorkexpcloudgciPo.COLUMNS.PACKAGE_TOTAL_QTY.name(), workexpcloudgciPo.getPackageTotalQty()); 
			dataObject.setValue(WorkexpcloudgciPo.COLUMNS.GCIDATE.name(), workexpcloudgciPo.getGcidate()); 
			dataObject.setValue(WorkexpcloudgciPo.COLUMNS.GCIPIECE.name(), workexpcloudgciPo.getGcipiece()); 
			dataObject.setValue(WorkexpcloudgciPo.COLUMNS.GCIWS.name(), workexpcloudgciPo.getGciws()); 
			dataObject.setValue(WorkexpcloudgciPo.COLUMNS.USERID.name(), workexpcloudgciPo.getUserid()); 
			dataObject.setValue(WorkexpcloudgciPo.COLUMNS.GCI_CUSTOMSID.name(), workexpcloudgciPo.getGciCustomsid()); 
			dataObject.setValue(WorkexpcloudgciPo.COLUMNS.RESULT_CODE.name(), workexpcloudgciPo.getResultCode()); 
			dataObject.setValue(WorkexpcloudgciPo.COLUMNS.RESULT_MSG.name(), workexpcloudgciPo.getResultMsg()); 
			dataObject.setValue(WorkexpcloudgciPo.COLUMNS.SEND_STATUS.name(), workexpcloudgciPo.getSendStatus()); 
			dataObject.setValue(WorkexpcloudgciPo.COLUMNS.SEND_QTY.name(), workexpcloudgciPo.getSendQty()); 
			dataObject.setValue(WorkexpcloudgciPo.COLUMNS.EXPRESSID.name(), workexpcloudgciPo.getExpressid()); 
			dataObject.setValue(WorkexpcloudgciPo.COLUMNS.FLIGHTNO.name(), workexpcloudgciPo.getFlightno()); 
			dataObject.setValue(WorkexpcloudgciPo.COLUMNS.FLIGHTDEST.name(), workexpcloudgciPo.getFlightdest()); 
			dataObject.setValue(WorkexpcloudgciPo.COLUMNS.CHWS.name(), workexpcloudgciPo.getChws()); 
			dataObject.setValue(WorkexpcloudgciPo.COLUMNS.CUSTOMSGCIDATE.name(), workexpcloudgciPo.getCustomsgcidate()); 
			dataObject.setValue(WorkexpcloudgciPo.COLUMNS.IN_READ.name(), workexpcloudgciPo.getInRead()); 
			dataObject.setValue(WorkexpcloudgciPo.COLUMNS.CRT_DATE.name(), workexpcloudgciPo.getCrtDate()); 
			dataObject.setValue(WorkexpcloudgciPo.COLUMNS.UPT_DT.name(), workexpcloudgciPo.getUptDt()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<WorkexpcloudgciPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(WorkexpcloudgciPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
