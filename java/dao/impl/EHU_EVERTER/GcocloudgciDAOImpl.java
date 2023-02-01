package com.doc.common.dao.impl; 
 
public class GcocloudgciDAOImpl extends GeneralDAOImpl<GcocloudgciPo> implements GcocloudgciDAO { 
	public static final GcocloudgciDAOImpl INSTANCE = new GcocloudgciDAOImpl(); 
	public static final String TABLENAME = "GCOCLOUDGCI"; 

	public GcocloudgciDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<GcocloudgciPo> CONVERTER = new MapConverter<GcocloudgciPo>() { 
 
		@Override 
		public GcocloudgciPo convert(final DataObject dataObject) { 
			final GcocloudgciPo gcocloudgciPo = new GcocloudgciPo(); 
			gcocloudgciPo.setSn(BigDecimalUtils.formObj(dataObject.getValue(GcocloudgciPo.COLUMNS.SN.name()))); 
			gcocloudgciPo.setIe(dataObject.getString(GcocloudgciPo.COLUMNS.IE.name())); 
			gcocloudgciPo.setWorkarea(dataObject.getString(GcocloudgciPo.COLUMNS.WORKAREA.name())); 
			gcocloudgciPo.setMwb(dataObject.getString(GcocloudgciPo.COLUMNS.MWB.name())); 
			gcocloudgciPo.setHwb(dataObject.getString(GcocloudgciPo.COLUMNS.HWB.name())); 
			gcocloudgciPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(GcocloudgciPo.COLUMNS.WEIGHT.name()))); 
			gcocloudgciPo.setBoxno(dataObject.getString(GcocloudgciPo.COLUMNS.BOXNO.name())); 
			gcocloudgciPo.setDeclNo(dataObject.getString(GcocloudgciPo.COLUMNS.DECL_NO.name())); 
			gcocloudgciPo.setDeclType(dataObject.getString(GcocloudgciPo.COLUMNS.DECL_TYPE.name())); 
			gcocloudgciPo.setBagTotalQty(BigDecimalUtils.formObj(dataObject.getValue(GcocloudgciPo.COLUMNS.BAG_TOTAL_QTY.name()))); 
			gcocloudgciPo.setBagClearanceType(dataObject.getString(GcocloudgciPo.COLUMNS.BAG_CLEARANCE_TYPE.name())); 
			gcocloudgciPo.setGoodsReceivedQty(BigDecimalUtils.formObj(dataObject.getValue(GcocloudgciPo.COLUMNS.GOODS_RECEIVED_QTY.name()))); 
			gcocloudgciPo.setPackageTotalQty(BigDecimalUtils.formObj(dataObject.getValue(GcocloudgciPo.COLUMNS.PACKAGE_TOTAL_QTY.name()))); 
			gcocloudgciPo.setGcidate(TimestampUtils.of(dataObject.getValue(GcocloudgciPo.COLUMNS.GCIDATE.name()))); 
			gcocloudgciPo.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(GcocloudgciPo.COLUMNS.GCIPIECE.name()))); 
			gcocloudgciPo.setGciws(dataObject.getString(GcocloudgciPo.COLUMNS.GCIWS.name())); 
			gcocloudgciPo.setUserid(dataObject.getString(GcocloudgciPo.COLUMNS.USERID.name())); 
			gcocloudgciPo.setGciCustomsid(dataObject.getString(GcocloudgciPo.COLUMNS.GCI_CUSTOMSID.name())); 
			gcocloudgciPo.setResultCode(dataObject.getString(GcocloudgciPo.COLUMNS.RESULT_CODE.name())); 
			gcocloudgciPo.setResultMsg(dataObject.getString(GcocloudgciPo.COLUMNS.RESULT_MSG.name())); 
			gcocloudgciPo.setSendStatus(dataObject.getString(GcocloudgciPo.COLUMNS.SEND_STATUS.name())); 
			gcocloudgciPo.setSendQty(BigDecimalUtils.formObj(dataObject.getValue(GcocloudgciPo.COLUMNS.SEND_QTY.name()))); 
			gcocloudgciPo.setExpressid(dataObject.getString(GcocloudgciPo.COLUMNS.EXPRESSID.name())); 
			gcocloudgciPo.setFlightno(dataObject.getString(GcocloudgciPo.COLUMNS.FLIGHTNO.name())); 
			gcocloudgciPo.setFlightdest(dataObject.getString(GcocloudgciPo.COLUMNS.FLIGHTDEST.name())); 
			gcocloudgciPo.setChws(dataObject.getString(GcocloudgciPo.COLUMNS.CHWS.name())); 
			gcocloudgciPo.setCustomsgcidate(dataObject.getString(GcocloudgciPo.COLUMNS.CUSTOMSGCIDATE.name())); 
			gcocloudgciPo.setInRead(dataObject.getString(GcocloudgciPo.COLUMNS.IN_READ.name())); 
			gcocloudgciPo.setCrtDate(TimestampUtils.of(dataObject.getValue(GcocloudgciPo.COLUMNS.CRT_DATE.name()))); 
			gcocloudgciPo.setUptDt(TimestampUtils.of(dataObject.getValue(GcocloudgciPo.COLUMNS.UPT_DT.name()))); 
			return gcocloudgciPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final GcocloudgciPo gcocloudgciPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(GcocloudgciPo.COLUMNS.SN.name(), gcocloudgciPo.getSn()); 
			dataObject.setValue(GcocloudgciPo.COLUMNS.IE.name(), gcocloudgciPo.getIe()); 
			dataObject.setValue(GcocloudgciPo.COLUMNS.WORKAREA.name(), gcocloudgciPo.getWorkarea()); 
			dataObject.setValue(GcocloudgciPo.COLUMNS.MWB.name(), gcocloudgciPo.getMwb()); 
			dataObject.setValue(GcocloudgciPo.COLUMNS.HWB.name(), gcocloudgciPo.getHwb()); 
			dataObject.setValue(GcocloudgciPo.COLUMNS.WEIGHT.name(), gcocloudgciPo.getWeight()); 
			dataObject.setValue(GcocloudgciPo.COLUMNS.BOXNO.name(), gcocloudgciPo.getBoxno()); 
			dataObject.setValue(GcocloudgciPo.COLUMNS.DECL_NO.name(), gcocloudgciPo.getDeclNo()); 
			dataObject.setValue(GcocloudgciPo.COLUMNS.DECL_TYPE.name(), gcocloudgciPo.getDeclType()); 
			dataObject.setValue(GcocloudgciPo.COLUMNS.BAG_TOTAL_QTY.name(), gcocloudgciPo.getBagTotalQty()); 
			dataObject.setValue(GcocloudgciPo.COLUMNS.BAG_CLEARANCE_TYPE.name(), gcocloudgciPo.getBagClearanceType()); 
			dataObject.setValue(GcocloudgciPo.COLUMNS.GOODS_RECEIVED_QTY.name(), gcocloudgciPo.getGoodsReceivedQty()); 
			dataObject.setValue(GcocloudgciPo.COLUMNS.PACKAGE_TOTAL_QTY.name(), gcocloudgciPo.getPackageTotalQty()); 
			dataObject.setValue(GcocloudgciPo.COLUMNS.GCIDATE.name(), gcocloudgciPo.getGcidate()); 
			dataObject.setValue(GcocloudgciPo.COLUMNS.GCIPIECE.name(), gcocloudgciPo.getGcipiece()); 
			dataObject.setValue(GcocloudgciPo.COLUMNS.GCIWS.name(), gcocloudgciPo.getGciws()); 
			dataObject.setValue(GcocloudgciPo.COLUMNS.USERID.name(), gcocloudgciPo.getUserid()); 
			dataObject.setValue(GcocloudgciPo.COLUMNS.GCI_CUSTOMSID.name(), gcocloudgciPo.getGciCustomsid()); 
			dataObject.setValue(GcocloudgciPo.COLUMNS.RESULT_CODE.name(), gcocloudgciPo.getResultCode()); 
			dataObject.setValue(GcocloudgciPo.COLUMNS.RESULT_MSG.name(), gcocloudgciPo.getResultMsg()); 
			dataObject.setValue(GcocloudgciPo.COLUMNS.SEND_STATUS.name(), gcocloudgciPo.getSendStatus()); 
			dataObject.setValue(GcocloudgciPo.COLUMNS.SEND_QTY.name(), gcocloudgciPo.getSendQty()); 
			dataObject.setValue(GcocloudgciPo.COLUMNS.EXPRESSID.name(), gcocloudgciPo.getExpressid()); 
			dataObject.setValue(GcocloudgciPo.COLUMNS.FLIGHTNO.name(), gcocloudgciPo.getFlightno()); 
			dataObject.setValue(GcocloudgciPo.COLUMNS.FLIGHTDEST.name(), gcocloudgciPo.getFlightdest()); 
			dataObject.setValue(GcocloudgciPo.COLUMNS.CHWS.name(), gcocloudgciPo.getChws()); 
			dataObject.setValue(GcocloudgciPo.COLUMNS.CUSTOMSGCIDATE.name(), gcocloudgciPo.getCustomsgcidate()); 
			dataObject.setValue(GcocloudgciPo.COLUMNS.IN_READ.name(), gcocloudgciPo.getInRead()); 
			dataObject.setValue(GcocloudgciPo.COLUMNS.CRT_DATE.name(), gcocloudgciPo.getCrtDate()); 
			dataObject.setValue(GcocloudgciPo.COLUMNS.UPT_DT.name(), gcocloudgciPo.getUptDt()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<GcocloudgciPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(GcocloudgciPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
