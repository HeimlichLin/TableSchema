package com.doc.common.dao.impl; 
 
public class GcitempDAOImpl extends GeneralDAOImpl<GcitempPo> implements GcitempDAO { 
	public static final GcitempDAOImpl INSTANCE = new GcitempDAOImpl(); 
	public static final String TABLENAME = "GCITEMP"; 

	public GcitempDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<GcitempPo> CONVERTER = new MapConverter<GcitempPo>() { 
 
		@Override 
		public GcitempPo convert(final DataObject dataObject) { 
			final GcitempPo gcitempPo = new GcitempPo(); 
			gcitempPo.setIe(dataObject.getString(GcitempPo.COLUMNS.IE.name())); 
			gcitempPo.setWorkarea(dataObject.getString(GcitempPo.COLUMNS.WORKAREA.name())); 
			gcitempPo.setHwb(dataObject.getString(GcitempPo.COLUMNS.HWB.name())); 
			gcitempPo.setGcidate(dataObject.getString(GcitempPo.COLUMNS.GCIDATE.name())); 
			gcitempPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(GcitempPo.COLUMNS.WEIGHT.name()))); 
			gcitempPo.setBoxno(dataObject.getString(GcitempPo.COLUMNS.BOXNO.name())); 
			gcitempPo.setDeclNo(dataObject.getString(GcitempPo.COLUMNS.DECL_NO.name())); 
			gcitempPo.setDeclType(dataObject.getString(GcitempPo.COLUMNS.DECL_TYPE.name())); 
			gcitempPo.setBagTotalQty(BigDecimalUtils.formObj(dataObject.getValue(GcitempPo.COLUMNS.BAG_TOTAL_QTY.name()))); 
			gcitempPo.setBagClearanceType(dataObject.getString(GcitempPo.COLUMNS.BAG_CLEARANCE_TYPE.name())); 
			gcitempPo.setGoodsReceivedQty(BigDecimalUtils.formObj(dataObject.getValue(GcitempPo.COLUMNS.GOODS_RECEIVED_QTY.name()))); 
			gcitempPo.setPackageTotalQty(BigDecimalUtils.formObj(dataObject.getValue(GcitempPo.COLUMNS.PACKAGE_TOTAL_QTY.name()))); 
			gcitempPo.setResultCode(dataObject.getString(GcitempPo.COLUMNS.RESULT_CODE.name())); 
			gcitempPo.setResultMsg(dataObject.getString(GcitempPo.COLUMNS.RESULT_MSG.name())); 
			gcitempPo.setExtraCondition(dataObject.getString(GcitempPo.COLUMNS.EXTRA_CONDITION.name())); 
			gcitempPo.setUserid(dataObject.getString(GcitempPo.COLUMNS.USERID.name())); 
			gcitempPo.setSendStatus(dataObject.getString(GcitempPo.COLUMNS.SEND_STATUS.name())); 
			gcitempPo.setSendQty(BigDecimalUtils.formObj(dataObject.getValue(GcitempPo.COLUMNS.SEND_QTY.name()))); 
			gcitempPo.setExpressid(dataObject.getString(GcitempPo.COLUMNS.EXPRESSID.name())); 
			gcitempPo.setFlightno(dataObject.getString(GcitempPo.COLUMNS.FLIGHTNO.name())); 
			gcitempPo.setFlightdest(dataObject.getString(GcitempPo.COLUMNS.FLIGHTDEST.name())); 
			gcitempPo.setMwb(dataObject.getString(GcitempPo.COLUMNS.MWB.name())); 
			gcitempPo.setChws(dataObject.getString(GcitempPo.COLUMNS.CHWS.name())); 
			gcitempPo.setCrtDate(TimestampUtils.of(dataObject.getValue(GcitempPo.COLUMNS.CRT_DATE.name()))); 
			gcitempPo.setWorkstation(dataObject.getString(GcitempPo.COLUMNS.WORKSTATION.name())); 
			gcitempPo.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(GcitempPo.COLUMNS.GCIPIECE.name()))); 
			gcitempPo.setGcidate2(TimestampUtils.of(dataObject.getValue(GcitempPo.COLUMNS.GCIDATE2.name()))); 
			gcitempPo.setUptDt(TimestampUtils.of(dataObject.getValue(GcitempPo.COLUMNS.UPT_DT.name()))); 
			gcitempPo.setInRead(dataObject.getString(GcitempPo.COLUMNS.IN_READ.name())); 
			gcitempPo.setSn(BigDecimalUtils.formObj(dataObject.getValue(GcitempPo.COLUMNS.SN.name()))); 
			gcitempPo.setOutRead(dataObject.getString(GcitempPo.COLUMNS.OUT_READ.name())); 
			gcitempPo.setIsMigration(dataObject.getString(GcitempPo.COLUMNS.IS_MIGRATION.name())); 
			gcitempPo.setGcopiece(dataObject.getString(GcitempPo.COLUMNS.GCOPIECE.name())); 
			gcitempPo.setCustomsid(dataObject.getString(GcitempPo.COLUMNS.CUSTOMSID.name())); 
			gcitempPo.setGciws(dataObject.getString(GcitempPo.COLUMNS.GCIWS.name())); 
			gcitempPo.setGcows(dataObject.getString(GcitempPo.COLUMNS.GCOWS.name())); 
			return gcitempPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final GcitempPo gcitempPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(GcitempPo.COLUMNS.IE.name(), gcitempPo.getIe()); 
			dataObject.setValue(GcitempPo.COLUMNS.WORKAREA.name(), gcitempPo.getWorkarea()); 
			dataObject.setValue(GcitempPo.COLUMNS.HWB.name(), gcitempPo.getHwb()); 
			dataObject.setValue(GcitempPo.COLUMNS.GCIDATE.name(), gcitempPo.getGcidate()); 
			dataObject.setValue(GcitempPo.COLUMNS.WEIGHT.name(), gcitempPo.getWeight()); 
			dataObject.setValue(GcitempPo.COLUMNS.BOXNO.name(), gcitempPo.getBoxno()); 
			dataObject.setValue(GcitempPo.COLUMNS.DECL_NO.name(), gcitempPo.getDeclNo()); 
			dataObject.setValue(GcitempPo.COLUMNS.DECL_TYPE.name(), gcitempPo.getDeclType()); 
			dataObject.setValue(GcitempPo.COLUMNS.BAG_TOTAL_QTY.name(), gcitempPo.getBagTotalQty()); 
			dataObject.setValue(GcitempPo.COLUMNS.BAG_CLEARANCE_TYPE.name(), gcitempPo.getBagClearanceType()); 
			dataObject.setValue(GcitempPo.COLUMNS.GOODS_RECEIVED_QTY.name(), gcitempPo.getGoodsReceivedQty()); 
			dataObject.setValue(GcitempPo.COLUMNS.PACKAGE_TOTAL_QTY.name(), gcitempPo.getPackageTotalQty()); 
			dataObject.setValue(GcitempPo.COLUMNS.RESULT_CODE.name(), gcitempPo.getResultCode()); 
			dataObject.setValue(GcitempPo.COLUMNS.RESULT_MSG.name(), gcitempPo.getResultMsg()); 
			dataObject.setValue(GcitempPo.COLUMNS.EXTRA_CONDITION.name(), gcitempPo.getExtraCondition()); 
			dataObject.setValue(GcitempPo.COLUMNS.USERID.name(), gcitempPo.getUserid()); 
			dataObject.setValue(GcitempPo.COLUMNS.SEND_STATUS.name(), gcitempPo.getSendStatus()); 
			dataObject.setValue(GcitempPo.COLUMNS.SEND_QTY.name(), gcitempPo.getSendQty()); 
			dataObject.setValue(GcitempPo.COLUMNS.EXPRESSID.name(), gcitempPo.getExpressid()); 
			dataObject.setValue(GcitempPo.COLUMNS.FLIGHTNO.name(), gcitempPo.getFlightno()); 
			dataObject.setValue(GcitempPo.COLUMNS.FLIGHTDEST.name(), gcitempPo.getFlightdest()); 
			dataObject.setValue(GcitempPo.COLUMNS.MWB.name(), gcitempPo.getMwb()); 
			dataObject.setValue(GcitempPo.COLUMNS.CHWS.name(), gcitempPo.getChws()); 
			dataObject.setValue(GcitempPo.COLUMNS.CRT_DATE.name(), gcitempPo.getCrtDate()); 
			dataObject.setValue(GcitempPo.COLUMNS.WORKSTATION.name(), gcitempPo.getWorkstation()); 
			dataObject.setValue(GcitempPo.COLUMNS.GCIPIECE.name(), gcitempPo.getGcipiece()); 
			dataObject.setValue(GcitempPo.COLUMNS.GCIDATE2.name(), gcitempPo.getGcidate2()); 
			dataObject.setValue(GcitempPo.COLUMNS.UPT_DT.name(), gcitempPo.getUptDt()); 
			dataObject.setValue(GcitempPo.COLUMNS.IN_READ.name(), gcitempPo.getInRead()); 
			dataObject.setValue(GcitempPo.COLUMNS.SN.name(), gcitempPo.getSn()); 
			dataObject.setValue(GcitempPo.COLUMNS.OUT_READ.name(), gcitempPo.getOutRead()); 
			dataObject.setValue(GcitempPo.COLUMNS.IS_MIGRATION.name(), gcitempPo.getIsMigration()); 
			dataObject.setValue(GcitempPo.COLUMNS.GCOPIECE.name(), gcitempPo.getGcopiece()); 
			dataObject.setValue(GcitempPo.COLUMNS.CUSTOMSID.name(), gcitempPo.getCustomsid()); 
			dataObject.setValue(GcitempPo.COLUMNS.GCIWS.name(), gcitempPo.getGciws()); 
			dataObject.setValue(GcitempPo.COLUMNS.GCOWS.name(), gcitempPo.getGcows()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<GcitempPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(GcitempPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
