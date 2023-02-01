package com.doc.common.dao.impl; 
 
public class HistorycloudgciDAOImpl extends GeneralDAOImpl<HistorycloudgciPo> implements HistorycloudgciDAO { 
	public static final HistorycloudgciDAOImpl INSTANCE = new HistorycloudgciDAOImpl(); 
	public static final String TABLENAME = "HISTORYCLOUDGCI"; 

	public HistorycloudgciDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<HistorycloudgciPo> CONVERTER = new MapConverter<HistorycloudgciPo>() { 
 
		@Override 
		public HistorycloudgciPo convert(final DataObject dataObject) { 
			final HistorycloudgciPo historycloudgciPo = new HistorycloudgciPo(); 
			historycloudgciPo.setSn(BigDecimalUtils.formObj(dataObject.getValue(HistorycloudgciPo.COLUMNS.SN.name()))); 
			historycloudgciPo.setIe(dataObject.getString(HistorycloudgciPo.COLUMNS.IE.name())); 
			historycloudgciPo.setWorkarea(dataObject.getString(HistorycloudgciPo.COLUMNS.WORKAREA.name())); 
			historycloudgciPo.setMwb(dataObject.getString(HistorycloudgciPo.COLUMNS.MWB.name())); 
			historycloudgciPo.setHwb(dataObject.getString(HistorycloudgciPo.COLUMNS.HWB.name())); 
			historycloudgciPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(HistorycloudgciPo.COLUMNS.WEIGHT.name()))); 
			historycloudgciPo.setBoxno(dataObject.getString(HistorycloudgciPo.COLUMNS.BOXNO.name())); 
			historycloudgciPo.setDeclNo(dataObject.getString(HistorycloudgciPo.COLUMNS.DECL_NO.name())); 
			historycloudgciPo.setDeclType(dataObject.getString(HistorycloudgciPo.COLUMNS.DECL_TYPE.name())); 
			historycloudgciPo.setBagTotalQty(BigDecimalUtils.formObj(dataObject.getValue(HistorycloudgciPo.COLUMNS.BAG_TOTAL_QTY.name()))); 
			historycloudgciPo.setBagClearanceType(dataObject.getString(HistorycloudgciPo.COLUMNS.BAG_CLEARANCE_TYPE.name())); 
			historycloudgciPo.setGoodsReceivedQty(BigDecimalUtils.formObj(dataObject.getValue(HistorycloudgciPo.COLUMNS.GOODS_RECEIVED_QTY.name()))); 
			historycloudgciPo.setPackageTotalQty(BigDecimalUtils.formObj(dataObject.getValue(HistorycloudgciPo.COLUMNS.PACKAGE_TOTAL_QTY.name()))); 
			historycloudgciPo.setGcidate(TimestampUtils.of(dataObject.getValue(HistorycloudgciPo.COLUMNS.GCIDATE.name()))); 
			historycloudgciPo.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(HistorycloudgciPo.COLUMNS.GCIPIECE.name()))); 
			historycloudgciPo.setGciws(dataObject.getString(HistorycloudgciPo.COLUMNS.GCIWS.name())); 
			historycloudgciPo.setUserid(dataObject.getString(HistorycloudgciPo.COLUMNS.USERID.name())); 
			historycloudgciPo.setGciCustomsid(dataObject.getString(HistorycloudgciPo.COLUMNS.GCI_CUSTOMSID.name())); 
			historycloudgciPo.setResultCode(dataObject.getString(HistorycloudgciPo.COLUMNS.RESULT_CODE.name())); 
			historycloudgciPo.setResultMsg(dataObject.getString(HistorycloudgciPo.COLUMNS.RESULT_MSG.name())); 
			historycloudgciPo.setSendStatus(dataObject.getString(HistorycloudgciPo.COLUMNS.SEND_STATUS.name())); 
			historycloudgciPo.setSendQty(BigDecimalUtils.formObj(dataObject.getValue(HistorycloudgciPo.COLUMNS.SEND_QTY.name()))); 
			historycloudgciPo.setExpressid(dataObject.getString(HistorycloudgciPo.COLUMNS.EXPRESSID.name())); 
			historycloudgciPo.setFlightno(dataObject.getString(HistorycloudgciPo.COLUMNS.FLIGHTNO.name())); 
			historycloudgciPo.setFlightdest(dataObject.getString(HistorycloudgciPo.COLUMNS.FLIGHTDEST.name())); 
			historycloudgciPo.setChws(dataObject.getString(HistorycloudgciPo.COLUMNS.CHWS.name())); 
			historycloudgciPo.setCustomsgcidate(dataObject.getString(HistorycloudgciPo.COLUMNS.CUSTOMSGCIDATE.name())); 
			historycloudgciPo.setInRead(dataObject.getString(HistorycloudgciPo.COLUMNS.IN_READ.name())); 
			historycloudgciPo.setCrtDate(TimestampUtils.of(dataObject.getValue(HistorycloudgciPo.COLUMNS.CRT_DATE.name()))); 
			historycloudgciPo.setUptDt(TimestampUtils.of(dataObject.getValue(HistorycloudgciPo.COLUMNS.UPT_DT.name()))); 
			return historycloudgciPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final HistorycloudgciPo historycloudgciPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(HistorycloudgciPo.COLUMNS.SN.name(), historycloudgciPo.getSn()); 
			dataObject.setValue(HistorycloudgciPo.COLUMNS.IE.name(), historycloudgciPo.getIe()); 
			dataObject.setValue(HistorycloudgciPo.COLUMNS.WORKAREA.name(), historycloudgciPo.getWorkarea()); 
			dataObject.setValue(HistorycloudgciPo.COLUMNS.MWB.name(), historycloudgciPo.getMwb()); 
			dataObject.setValue(HistorycloudgciPo.COLUMNS.HWB.name(), historycloudgciPo.getHwb()); 
			dataObject.setValue(HistorycloudgciPo.COLUMNS.WEIGHT.name(), historycloudgciPo.getWeight()); 
			dataObject.setValue(HistorycloudgciPo.COLUMNS.BOXNO.name(), historycloudgciPo.getBoxno()); 
			dataObject.setValue(HistorycloudgciPo.COLUMNS.DECL_NO.name(), historycloudgciPo.getDeclNo()); 
			dataObject.setValue(HistorycloudgciPo.COLUMNS.DECL_TYPE.name(), historycloudgciPo.getDeclType()); 
			dataObject.setValue(HistorycloudgciPo.COLUMNS.BAG_TOTAL_QTY.name(), historycloudgciPo.getBagTotalQty()); 
			dataObject.setValue(HistorycloudgciPo.COLUMNS.BAG_CLEARANCE_TYPE.name(), historycloudgciPo.getBagClearanceType()); 
			dataObject.setValue(HistorycloudgciPo.COLUMNS.GOODS_RECEIVED_QTY.name(), historycloudgciPo.getGoodsReceivedQty()); 
			dataObject.setValue(HistorycloudgciPo.COLUMNS.PACKAGE_TOTAL_QTY.name(), historycloudgciPo.getPackageTotalQty()); 
			dataObject.setValue(HistorycloudgciPo.COLUMNS.GCIDATE.name(), historycloudgciPo.getGcidate()); 
			dataObject.setValue(HistorycloudgciPo.COLUMNS.GCIPIECE.name(), historycloudgciPo.getGcipiece()); 
			dataObject.setValue(HistorycloudgciPo.COLUMNS.GCIWS.name(), historycloudgciPo.getGciws()); 
			dataObject.setValue(HistorycloudgciPo.COLUMNS.USERID.name(), historycloudgciPo.getUserid()); 
			dataObject.setValue(HistorycloudgciPo.COLUMNS.GCI_CUSTOMSID.name(), historycloudgciPo.getGciCustomsid()); 
			dataObject.setValue(HistorycloudgciPo.COLUMNS.RESULT_CODE.name(), historycloudgciPo.getResultCode()); 
			dataObject.setValue(HistorycloudgciPo.COLUMNS.RESULT_MSG.name(), historycloudgciPo.getResultMsg()); 
			dataObject.setValue(HistorycloudgciPo.COLUMNS.SEND_STATUS.name(), historycloudgciPo.getSendStatus()); 
			dataObject.setValue(HistorycloudgciPo.COLUMNS.SEND_QTY.name(), historycloudgciPo.getSendQty()); 
			dataObject.setValue(HistorycloudgciPo.COLUMNS.EXPRESSID.name(), historycloudgciPo.getExpressid()); 
			dataObject.setValue(HistorycloudgciPo.COLUMNS.FLIGHTNO.name(), historycloudgciPo.getFlightno()); 
			dataObject.setValue(HistorycloudgciPo.COLUMNS.FLIGHTDEST.name(), historycloudgciPo.getFlightdest()); 
			dataObject.setValue(HistorycloudgciPo.COLUMNS.CHWS.name(), historycloudgciPo.getChws()); 
			dataObject.setValue(HistorycloudgciPo.COLUMNS.CUSTOMSGCIDATE.name(), historycloudgciPo.getCustomsgcidate()); 
			dataObject.setValue(HistorycloudgciPo.COLUMNS.IN_READ.name(), historycloudgciPo.getInRead()); 
			dataObject.setValue(HistorycloudgciPo.COLUMNS.CRT_DATE.name(), historycloudgciPo.getCrtDate()); 
			dataObject.setValue(HistorycloudgciPo.COLUMNS.UPT_DT.name(), historycloudgciPo.getUptDt()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<HistorycloudgciPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(HistorycloudgciPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
