package com.doc.common.dao.impl; 
 
public class GcoexpcloudgciDAOImpl extends GeneralDAOImpl<GcoexpcloudgciPo> implements GcoexpcloudgciDAO { 
	public static final GcoexpcloudgciDAOImpl INSTANCE = new GcoexpcloudgciDAOImpl(); 
	public static final String TABLENAME = "GCOEXPCLOUDGCI"; 

	public GcoexpcloudgciDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<GcoexpcloudgciPo> CONVERTER = new MapConverter<GcoexpcloudgciPo>() { 
 
		@Override 
		public GcoexpcloudgciPo convert(final DataObject dataObject) { 
			final GcoexpcloudgciPo gcoexpcloudgciPo = new GcoexpcloudgciPo(); 
			gcoexpcloudgciPo.setSn(BigDecimalUtils.formObj(dataObject.getValue(GcoexpcloudgciPo.COLUMNS.SN.name()))); 
			gcoexpcloudgciPo.setIe(dataObject.getString(GcoexpcloudgciPo.COLUMNS.IE.name())); 
			gcoexpcloudgciPo.setWorkarea(dataObject.getString(GcoexpcloudgciPo.COLUMNS.WORKAREA.name())); 
			gcoexpcloudgciPo.setMwb(dataObject.getString(GcoexpcloudgciPo.COLUMNS.MWB.name())); 
			gcoexpcloudgciPo.setHwb(dataObject.getString(GcoexpcloudgciPo.COLUMNS.HWB.name())); 
			gcoexpcloudgciPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(GcoexpcloudgciPo.COLUMNS.WEIGHT.name()))); 
			gcoexpcloudgciPo.setBoxno(dataObject.getString(GcoexpcloudgciPo.COLUMNS.BOXNO.name())); 
			gcoexpcloudgciPo.setDeclNo(dataObject.getString(GcoexpcloudgciPo.COLUMNS.DECL_NO.name())); 
			gcoexpcloudgciPo.setDeclType(dataObject.getString(GcoexpcloudgciPo.COLUMNS.DECL_TYPE.name())); 
			gcoexpcloudgciPo.setBagTotalQty(BigDecimalUtils.formObj(dataObject.getValue(GcoexpcloudgciPo.COLUMNS.BAG_TOTAL_QTY.name()))); 
			gcoexpcloudgciPo.setBagClearanceType(dataObject.getString(GcoexpcloudgciPo.COLUMNS.BAG_CLEARANCE_TYPE.name())); 
			gcoexpcloudgciPo.setGoodsReceivedQty(BigDecimalUtils.formObj(dataObject.getValue(GcoexpcloudgciPo.COLUMNS.GOODS_RECEIVED_QTY.name()))); 
			gcoexpcloudgciPo.setPackageTotalQty(BigDecimalUtils.formObj(dataObject.getValue(GcoexpcloudgciPo.COLUMNS.PACKAGE_TOTAL_QTY.name()))); 
			gcoexpcloudgciPo.setGcidate(TimestampUtils.of(dataObject.getValue(GcoexpcloudgciPo.COLUMNS.GCIDATE.name()))); 
			gcoexpcloudgciPo.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(GcoexpcloudgciPo.COLUMNS.GCIPIECE.name()))); 
			gcoexpcloudgciPo.setGciws(dataObject.getString(GcoexpcloudgciPo.COLUMNS.GCIWS.name())); 
			gcoexpcloudgciPo.setUserid(dataObject.getString(GcoexpcloudgciPo.COLUMNS.USERID.name())); 
			gcoexpcloudgciPo.setGciCustomsid(dataObject.getString(GcoexpcloudgciPo.COLUMNS.GCI_CUSTOMSID.name())); 
			gcoexpcloudgciPo.setResultCode(dataObject.getString(GcoexpcloudgciPo.COLUMNS.RESULT_CODE.name())); 
			gcoexpcloudgciPo.setResultMsg(dataObject.getString(GcoexpcloudgciPo.COLUMNS.RESULT_MSG.name())); 
			gcoexpcloudgciPo.setSendStatus(dataObject.getString(GcoexpcloudgciPo.COLUMNS.SEND_STATUS.name())); 
			gcoexpcloudgciPo.setSendQty(BigDecimalUtils.formObj(dataObject.getValue(GcoexpcloudgciPo.COLUMNS.SEND_QTY.name()))); 
			gcoexpcloudgciPo.setExpressid(dataObject.getString(GcoexpcloudgciPo.COLUMNS.EXPRESSID.name())); 
			gcoexpcloudgciPo.setFlightno(dataObject.getString(GcoexpcloudgciPo.COLUMNS.FLIGHTNO.name())); 
			gcoexpcloudgciPo.setFlightdest(dataObject.getString(GcoexpcloudgciPo.COLUMNS.FLIGHTDEST.name())); 
			gcoexpcloudgciPo.setChws(dataObject.getString(GcoexpcloudgciPo.COLUMNS.CHWS.name())); 
			gcoexpcloudgciPo.setCustomsgcidate(dataObject.getString(GcoexpcloudgciPo.COLUMNS.CUSTOMSGCIDATE.name())); 
			gcoexpcloudgciPo.setInRead(dataObject.getString(GcoexpcloudgciPo.COLUMNS.IN_READ.name())); 
			gcoexpcloudgciPo.setCrtDate(TimestampUtils.of(dataObject.getValue(GcoexpcloudgciPo.COLUMNS.CRT_DATE.name()))); 
			gcoexpcloudgciPo.setUptDt(TimestampUtils.of(dataObject.getValue(GcoexpcloudgciPo.COLUMNS.UPT_DT.name()))); 
			return gcoexpcloudgciPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final GcoexpcloudgciPo gcoexpcloudgciPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(GcoexpcloudgciPo.COLUMNS.SN.name(), gcoexpcloudgciPo.getSn()); 
			dataObject.setValue(GcoexpcloudgciPo.COLUMNS.IE.name(), gcoexpcloudgciPo.getIe()); 
			dataObject.setValue(GcoexpcloudgciPo.COLUMNS.WORKAREA.name(), gcoexpcloudgciPo.getWorkarea()); 
			dataObject.setValue(GcoexpcloudgciPo.COLUMNS.MWB.name(), gcoexpcloudgciPo.getMwb()); 
			dataObject.setValue(GcoexpcloudgciPo.COLUMNS.HWB.name(), gcoexpcloudgciPo.getHwb()); 
			dataObject.setValue(GcoexpcloudgciPo.COLUMNS.WEIGHT.name(), gcoexpcloudgciPo.getWeight()); 
			dataObject.setValue(GcoexpcloudgciPo.COLUMNS.BOXNO.name(), gcoexpcloudgciPo.getBoxno()); 
			dataObject.setValue(GcoexpcloudgciPo.COLUMNS.DECL_NO.name(), gcoexpcloudgciPo.getDeclNo()); 
			dataObject.setValue(GcoexpcloudgciPo.COLUMNS.DECL_TYPE.name(), gcoexpcloudgciPo.getDeclType()); 
			dataObject.setValue(GcoexpcloudgciPo.COLUMNS.BAG_TOTAL_QTY.name(), gcoexpcloudgciPo.getBagTotalQty()); 
			dataObject.setValue(GcoexpcloudgciPo.COLUMNS.BAG_CLEARANCE_TYPE.name(), gcoexpcloudgciPo.getBagClearanceType()); 
			dataObject.setValue(GcoexpcloudgciPo.COLUMNS.GOODS_RECEIVED_QTY.name(), gcoexpcloudgciPo.getGoodsReceivedQty()); 
			dataObject.setValue(GcoexpcloudgciPo.COLUMNS.PACKAGE_TOTAL_QTY.name(), gcoexpcloudgciPo.getPackageTotalQty()); 
			dataObject.setValue(GcoexpcloudgciPo.COLUMNS.GCIDATE.name(), gcoexpcloudgciPo.getGcidate()); 
			dataObject.setValue(GcoexpcloudgciPo.COLUMNS.GCIPIECE.name(), gcoexpcloudgciPo.getGcipiece()); 
			dataObject.setValue(GcoexpcloudgciPo.COLUMNS.GCIWS.name(), gcoexpcloudgciPo.getGciws()); 
			dataObject.setValue(GcoexpcloudgciPo.COLUMNS.USERID.name(), gcoexpcloudgciPo.getUserid()); 
			dataObject.setValue(GcoexpcloudgciPo.COLUMNS.GCI_CUSTOMSID.name(), gcoexpcloudgciPo.getGciCustomsid()); 
			dataObject.setValue(GcoexpcloudgciPo.COLUMNS.RESULT_CODE.name(), gcoexpcloudgciPo.getResultCode()); 
			dataObject.setValue(GcoexpcloudgciPo.COLUMNS.RESULT_MSG.name(), gcoexpcloudgciPo.getResultMsg()); 
			dataObject.setValue(GcoexpcloudgciPo.COLUMNS.SEND_STATUS.name(), gcoexpcloudgciPo.getSendStatus()); 
			dataObject.setValue(GcoexpcloudgciPo.COLUMNS.SEND_QTY.name(), gcoexpcloudgciPo.getSendQty()); 
			dataObject.setValue(GcoexpcloudgciPo.COLUMNS.EXPRESSID.name(), gcoexpcloudgciPo.getExpressid()); 
			dataObject.setValue(GcoexpcloudgciPo.COLUMNS.FLIGHTNO.name(), gcoexpcloudgciPo.getFlightno()); 
			dataObject.setValue(GcoexpcloudgciPo.COLUMNS.FLIGHTDEST.name(), gcoexpcloudgciPo.getFlightdest()); 
			dataObject.setValue(GcoexpcloudgciPo.COLUMNS.CHWS.name(), gcoexpcloudgciPo.getChws()); 
			dataObject.setValue(GcoexpcloudgciPo.COLUMNS.CUSTOMSGCIDATE.name(), gcoexpcloudgciPo.getCustomsgcidate()); 
			dataObject.setValue(GcoexpcloudgciPo.COLUMNS.IN_READ.name(), gcoexpcloudgciPo.getInRead()); 
			dataObject.setValue(GcoexpcloudgciPo.COLUMNS.CRT_DATE.name(), gcoexpcloudgciPo.getCrtDate()); 
			dataObject.setValue(GcoexpcloudgciPo.COLUMNS.UPT_DT.name(), gcoexpcloudgciPo.getUptDt()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<GcoexpcloudgciPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(GcoexpcloudgciPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
