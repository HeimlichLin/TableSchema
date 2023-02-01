package com.doc.common.dao.impl; 
 
public class GcitempOldDAOImpl extends GeneralDAOImpl<GcitempOldPo> implements GcitempOldDAO { 
	public static final GcitempOldDAOImpl INSTANCE = new GcitempOldDAOImpl(); 
	public static final String TABLENAME = "GCITEMP_OLD"; 

	public GcitempOldDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<GcitempOldPo> CONVERTER = new MapConverter<GcitempOldPo>() { 
 
		@Override 
		public GcitempOldPo convert(final DataObject dataObject) { 
			final GcitempOldPo gcitempOldPo = new GcitempOldPo(); 
			gcitempOldPo.setSn(BigDecimalUtils.formObj(dataObject.getValue(GcitempOldPo.COLUMNS.SN.name()))); 
			gcitempOldPo.setIe(dataObject.getString(GcitempOldPo.COLUMNS.IE.name())); 
			gcitempOldPo.setWorkarea(dataObject.getString(GcitempOldPo.COLUMNS.WORKAREA.name())); 
			gcitempOldPo.setMwb(dataObject.getString(GcitempOldPo.COLUMNS.MWB.name())); 
			gcitempOldPo.setHwb(dataObject.getString(GcitempOldPo.COLUMNS.HWB.name())); 
			gcitempOldPo.setGcidate(dataObject.getString(GcitempOldPo.COLUMNS.GCIDATE.name())); 
			gcitempOldPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(GcitempOldPo.COLUMNS.WEIGHT.name()))); 
			gcitempOldPo.setBoxno(dataObject.getString(GcitempOldPo.COLUMNS.BOXNO.name())); 
			gcitempOldPo.setDeclNo(dataObject.getString(GcitempOldPo.COLUMNS.DECL_NO.name())); 
			gcitempOldPo.setDeclType(dataObject.getString(GcitempOldPo.COLUMNS.DECL_TYPE.name())); 
			gcitempOldPo.setBagTotalQty(BigDecimalUtils.formObj(dataObject.getValue(GcitempOldPo.COLUMNS.BAG_TOTAL_QTY.name()))); 
			gcitempOldPo.setBagClearanceType(dataObject.getString(GcitempOldPo.COLUMNS.BAG_CLEARANCE_TYPE.name())); 
			gcitempOldPo.setGoodsReceivedQty(BigDecimalUtils.formObj(dataObject.getValue(GcitempOldPo.COLUMNS.GOODS_RECEIVED_QTY.name()))); 
			gcitempOldPo.setPackageTotalQty(BigDecimalUtils.formObj(dataObject.getValue(GcitempOldPo.COLUMNS.PACKAGE_TOTAL_QTY.name()))); 
			gcitempOldPo.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(GcitempOldPo.COLUMNS.GCIPIECE.name()))); 
			gcitempOldPo.setGcopiece(BigDecimalUtils.formObj(dataObject.getValue(GcitempOldPo.COLUMNS.GCOPIECE.name()))); 
			gcitempOldPo.setResultCode(dataObject.getString(GcitempOldPo.COLUMNS.RESULT_CODE.name())); 
			gcitempOldPo.setResultMsg(dataObject.getString(GcitempOldPo.COLUMNS.RESULT_MSG.name())); 
			gcitempOldPo.setExtraCondition(dataObject.getString(GcitempOldPo.COLUMNS.EXTRA_CONDITION.name())); 
			gcitempOldPo.setSendStatus(dataObject.getString(GcitempOldPo.COLUMNS.SEND_STATUS.name())); 
			gcitempOldPo.setSendQty(BigDecimalUtils.formObj(dataObject.getValue(GcitempOldPo.COLUMNS.SEND_QTY.name()))); 
			gcitempOldPo.setExpressid(dataObject.getString(GcitempOldPo.COLUMNS.EXPRESSID.name())); 
			gcitempOldPo.setFlightno(dataObject.getString(GcitempOldPo.COLUMNS.FLIGHTNO.name())); 
			gcitempOldPo.setFlightdest(dataObject.getString(GcitempOldPo.COLUMNS.FLIGHTDEST.name())); 
			gcitempOldPo.setChws(dataObject.getString(GcitempOldPo.COLUMNS.CHWS.name())); 
			gcitempOldPo.setWorkstation(dataObject.getString(GcitempOldPo.COLUMNS.WORKSTATION.name())); 
			gcitempOldPo.setInRead(dataObject.getString(GcitempOldPo.COLUMNS.IN_READ.name())); 
			gcitempOldPo.setIsMigration(dataObject.getString(GcitempOldPo.COLUMNS.IS_MIGRATION.name())); 
			gcitempOldPo.setOutRead(dataObject.getString(GcitempOldPo.COLUMNS.OUT_READ.name())); 
			gcitempOldPo.setUserid(dataObject.getString(GcitempOldPo.COLUMNS.USERID.name())); 
			gcitempOldPo.setCrtDate(TimestampUtils.of(dataObject.getValue(GcitempOldPo.COLUMNS.CRT_DATE.name()))); 
			gcitempOldPo.setUptDt(TimestampUtils.of(dataObject.getValue(GcitempOldPo.COLUMNS.UPT_DT.name()))); 
			return gcitempOldPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final GcitempOldPo gcitempOldPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(GcitempOldPo.COLUMNS.SN.name(), gcitempOldPo.getSn()); 
			dataObject.setValue(GcitempOldPo.COLUMNS.IE.name(), gcitempOldPo.getIe()); 
			dataObject.setValue(GcitempOldPo.COLUMNS.WORKAREA.name(), gcitempOldPo.getWorkarea()); 
			dataObject.setValue(GcitempOldPo.COLUMNS.MWB.name(), gcitempOldPo.getMwb()); 
			dataObject.setValue(GcitempOldPo.COLUMNS.HWB.name(), gcitempOldPo.getHwb()); 
			dataObject.setValue(GcitempOldPo.COLUMNS.GCIDATE.name(), gcitempOldPo.getGcidate()); 
			dataObject.setValue(GcitempOldPo.COLUMNS.WEIGHT.name(), gcitempOldPo.getWeight()); 
			dataObject.setValue(GcitempOldPo.COLUMNS.BOXNO.name(), gcitempOldPo.getBoxno()); 
			dataObject.setValue(GcitempOldPo.COLUMNS.DECL_NO.name(), gcitempOldPo.getDeclNo()); 
			dataObject.setValue(GcitempOldPo.COLUMNS.DECL_TYPE.name(), gcitempOldPo.getDeclType()); 
			dataObject.setValue(GcitempOldPo.COLUMNS.BAG_TOTAL_QTY.name(), gcitempOldPo.getBagTotalQty()); 
			dataObject.setValue(GcitempOldPo.COLUMNS.BAG_CLEARANCE_TYPE.name(), gcitempOldPo.getBagClearanceType()); 
			dataObject.setValue(GcitempOldPo.COLUMNS.GOODS_RECEIVED_QTY.name(), gcitempOldPo.getGoodsReceivedQty()); 
			dataObject.setValue(GcitempOldPo.COLUMNS.PACKAGE_TOTAL_QTY.name(), gcitempOldPo.getPackageTotalQty()); 
			dataObject.setValue(GcitempOldPo.COLUMNS.GCIPIECE.name(), gcitempOldPo.getGcipiece()); 
			dataObject.setValue(GcitempOldPo.COLUMNS.GCOPIECE.name(), gcitempOldPo.getGcopiece()); 
			dataObject.setValue(GcitempOldPo.COLUMNS.RESULT_CODE.name(), gcitempOldPo.getResultCode()); 
			dataObject.setValue(GcitempOldPo.COLUMNS.RESULT_MSG.name(), gcitempOldPo.getResultMsg()); 
			dataObject.setValue(GcitempOldPo.COLUMNS.EXTRA_CONDITION.name(), gcitempOldPo.getExtraCondition()); 
			dataObject.setValue(GcitempOldPo.COLUMNS.SEND_STATUS.name(), gcitempOldPo.getSendStatus()); 
			dataObject.setValue(GcitempOldPo.COLUMNS.SEND_QTY.name(), gcitempOldPo.getSendQty()); 
			dataObject.setValue(GcitempOldPo.COLUMNS.EXPRESSID.name(), gcitempOldPo.getExpressid()); 
			dataObject.setValue(GcitempOldPo.COLUMNS.FLIGHTNO.name(), gcitempOldPo.getFlightno()); 
			dataObject.setValue(GcitempOldPo.COLUMNS.FLIGHTDEST.name(), gcitempOldPo.getFlightdest()); 
			dataObject.setValue(GcitempOldPo.COLUMNS.CHWS.name(), gcitempOldPo.getChws()); 
			dataObject.setValue(GcitempOldPo.COLUMNS.WORKSTATION.name(), gcitempOldPo.getWorkstation()); 
			dataObject.setValue(GcitempOldPo.COLUMNS.IN_READ.name(), gcitempOldPo.getInRead()); 
			dataObject.setValue(GcitempOldPo.COLUMNS.IS_MIGRATION.name(), gcitempOldPo.getIsMigration()); 
			dataObject.setValue(GcitempOldPo.COLUMNS.OUT_READ.name(), gcitempOldPo.getOutRead()); 
			dataObject.setValue(GcitempOldPo.COLUMNS.USERID.name(), gcitempOldPo.getUserid()); 
			dataObject.setValue(GcitempOldPo.COLUMNS.CRT_DATE.name(), gcitempOldPo.getCrtDate()); 
			dataObject.setValue(GcitempOldPo.COLUMNS.UPT_DT.name(), gcitempOldPo.getUptDt()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<GcitempOldPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(GcitempOldPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
