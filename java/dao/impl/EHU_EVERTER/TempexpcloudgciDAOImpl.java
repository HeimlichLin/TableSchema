package com.doc.common.dao.impl; 
 
public class TempexpcloudgciDAOImpl extends GeneralDAOImpl<TempexpcloudgciPo> implements TempexpcloudgciDAO { 
	public static final TempexpcloudgciDAOImpl INSTANCE = new TempexpcloudgciDAOImpl(); 
	public static final String TABLENAME = "TEMPEXPCLOUDGCI"; 

	public TempexpcloudgciDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TempexpcloudgciPo> CONVERTER = new MapConverter<TempexpcloudgciPo>() { 
 
		@Override 
		public TempexpcloudgciPo convert(final DataObject dataObject) { 
			final TempexpcloudgciPo tempexpcloudgciPo = new TempexpcloudgciPo(); 
			tempexpcloudgciPo.setSn(BigDecimalUtils.formObj(dataObject.getValue(TempexpcloudgciPo.COLUMNS.SN.name()))); 
			tempexpcloudgciPo.setIe(dataObject.getString(TempexpcloudgciPo.COLUMNS.IE.name())); 
			tempexpcloudgciPo.setWorkarea(dataObject.getString(TempexpcloudgciPo.COLUMNS.WORKAREA.name())); 
			tempexpcloudgciPo.setMwb(dataObject.getString(TempexpcloudgciPo.COLUMNS.MWB.name())); 
			tempexpcloudgciPo.setHwb(dataObject.getString(TempexpcloudgciPo.COLUMNS.HWB.name())); 
			tempexpcloudgciPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(TempexpcloudgciPo.COLUMNS.WEIGHT.name()))); 
			tempexpcloudgciPo.setBoxno(dataObject.getString(TempexpcloudgciPo.COLUMNS.BOXNO.name())); 
			tempexpcloudgciPo.setDeclNo(dataObject.getString(TempexpcloudgciPo.COLUMNS.DECL_NO.name())); 
			tempexpcloudgciPo.setDeclType(dataObject.getString(TempexpcloudgciPo.COLUMNS.DECL_TYPE.name())); 
			tempexpcloudgciPo.setBagTotalQty(BigDecimalUtils.formObj(dataObject.getValue(TempexpcloudgciPo.COLUMNS.BAG_TOTAL_QTY.name()))); 
			tempexpcloudgciPo.setBagClearanceType(dataObject.getString(TempexpcloudgciPo.COLUMNS.BAG_CLEARANCE_TYPE.name())); 
			tempexpcloudgciPo.setGoodsReceivedQty(BigDecimalUtils.formObj(dataObject.getValue(TempexpcloudgciPo.COLUMNS.GOODS_RECEIVED_QTY.name()))); 
			tempexpcloudgciPo.setPackageTotalQty(BigDecimalUtils.formObj(dataObject.getValue(TempexpcloudgciPo.COLUMNS.PACKAGE_TOTAL_QTY.name()))); 
			tempexpcloudgciPo.setGcidate(TimestampUtils.of(dataObject.getValue(TempexpcloudgciPo.COLUMNS.GCIDATE.name()))); 
			tempexpcloudgciPo.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(TempexpcloudgciPo.COLUMNS.GCIPIECE.name()))); 
			tempexpcloudgciPo.setGciws(dataObject.getString(TempexpcloudgciPo.COLUMNS.GCIWS.name())); 
			tempexpcloudgciPo.setUserid(dataObject.getString(TempexpcloudgciPo.COLUMNS.USERID.name())); 
			tempexpcloudgciPo.setGciCustomsid(dataObject.getString(TempexpcloudgciPo.COLUMNS.GCI_CUSTOMSID.name())); 
			tempexpcloudgciPo.setResultCode(dataObject.getString(TempexpcloudgciPo.COLUMNS.RESULT_CODE.name())); 
			tempexpcloudgciPo.setResultMsg(dataObject.getString(TempexpcloudgciPo.COLUMNS.RESULT_MSG.name())); 
			tempexpcloudgciPo.setSendStatus(dataObject.getString(TempexpcloudgciPo.COLUMNS.SEND_STATUS.name())); 
			tempexpcloudgciPo.setSendQty(BigDecimalUtils.formObj(dataObject.getValue(TempexpcloudgciPo.COLUMNS.SEND_QTY.name()))); 
			tempexpcloudgciPo.setExpressid(dataObject.getString(TempexpcloudgciPo.COLUMNS.EXPRESSID.name())); 
			tempexpcloudgciPo.setFlightno(dataObject.getString(TempexpcloudgciPo.COLUMNS.FLIGHTNO.name())); 
			tempexpcloudgciPo.setFlightdest(dataObject.getString(TempexpcloudgciPo.COLUMNS.FLIGHTDEST.name())); 
			tempexpcloudgciPo.setChws(dataObject.getString(TempexpcloudgciPo.COLUMNS.CHWS.name())); 
			tempexpcloudgciPo.setCustomsgcidate(dataObject.getString(TempexpcloudgciPo.COLUMNS.CUSTOMSGCIDATE.name())); 
			tempexpcloudgciPo.setInRead(dataObject.getString(TempexpcloudgciPo.COLUMNS.IN_READ.name())); 
			tempexpcloudgciPo.setCrtDate(TimestampUtils.of(dataObject.getValue(TempexpcloudgciPo.COLUMNS.CRT_DATE.name()))); 
			tempexpcloudgciPo.setUptDt(TimestampUtils.of(dataObject.getValue(TempexpcloudgciPo.COLUMNS.UPT_DT.name()))); 
			return tempexpcloudgciPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TempexpcloudgciPo tempexpcloudgciPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TempexpcloudgciPo.COLUMNS.SN.name(), tempexpcloudgciPo.getSn()); 
			dataObject.setValue(TempexpcloudgciPo.COLUMNS.IE.name(), tempexpcloudgciPo.getIe()); 
			dataObject.setValue(TempexpcloudgciPo.COLUMNS.WORKAREA.name(), tempexpcloudgciPo.getWorkarea()); 
			dataObject.setValue(TempexpcloudgciPo.COLUMNS.MWB.name(), tempexpcloudgciPo.getMwb()); 
			dataObject.setValue(TempexpcloudgciPo.COLUMNS.HWB.name(), tempexpcloudgciPo.getHwb()); 
			dataObject.setValue(TempexpcloudgciPo.COLUMNS.WEIGHT.name(), tempexpcloudgciPo.getWeight()); 
			dataObject.setValue(TempexpcloudgciPo.COLUMNS.BOXNO.name(), tempexpcloudgciPo.getBoxno()); 
			dataObject.setValue(TempexpcloudgciPo.COLUMNS.DECL_NO.name(), tempexpcloudgciPo.getDeclNo()); 
			dataObject.setValue(TempexpcloudgciPo.COLUMNS.DECL_TYPE.name(), tempexpcloudgciPo.getDeclType()); 
			dataObject.setValue(TempexpcloudgciPo.COLUMNS.BAG_TOTAL_QTY.name(), tempexpcloudgciPo.getBagTotalQty()); 
			dataObject.setValue(TempexpcloudgciPo.COLUMNS.BAG_CLEARANCE_TYPE.name(), tempexpcloudgciPo.getBagClearanceType()); 
			dataObject.setValue(TempexpcloudgciPo.COLUMNS.GOODS_RECEIVED_QTY.name(), tempexpcloudgciPo.getGoodsReceivedQty()); 
			dataObject.setValue(TempexpcloudgciPo.COLUMNS.PACKAGE_TOTAL_QTY.name(), tempexpcloudgciPo.getPackageTotalQty()); 
			dataObject.setValue(TempexpcloudgciPo.COLUMNS.GCIDATE.name(), tempexpcloudgciPo.getGcidate()); 
			dataObject.setValue(TempexpcloudgciPo.COLUMNS.GCIPIECE.name(), tempexpcloudgciPo.getGcipiece()); 
			dataObject.setValue(TempexpcloudgciPo.COLUMNS.GCIWS.name(), tempexpcloudgciPo.getGciws()); 
			dataObject.setValue(TempexpcloudgciPo.COLUMNS.USERID.name(), tempexpcloudgciPo.getUserid()); 
			dataObject.setValue(TempexpcloudgciPo.COLUMNS.GCI_CUSTOMSID.name(), tempexpcloudgciPo.getGciCustomsid()); 
			dataObject.setValue(TempexpcloudgciPo.COLUMNS.RESULT_CODE.name(), tempexpcloudgciPo.getResultCode()); 
			dataObject.setValue(TempexpcloudgciPo.COLUMNS.RESULT_MSG.name(), tempexpcloudgciPo.getResultMsg()); 
			dataObject.setValue(TempexpcloudgciPo.COLUMNS.SEND_STATUS.name(), tempexpcloudgciPo.getSendStatus()); 
			dataObject.setValue(TempexpcloudgciPo.COLUMNS.SEND_QTY.name(), tempexpcloudgciPo.getSendQty()); 
			dataObject.setValue(TempexpcloudgciPo.COLUMNS.EXPRESSID.name(), tempexpcloudgciPo.getExpressid()); 
			dataObject.setValue(TempexpcloudgciPo.COLUMNS.FLIGHTNO.name(), tempexpcloudgciPo.getFlightno()); 
			dataObject.setValue(TempexpcloudgciPo.COLUMNS.FLIGHTDEST.name(), tempexpcloudgciPo.getFlightdest()); 
			dataObject.setValue(TempexpcloudgciPo.COLUMNS.CHWS.name(), tempexpcloudgciPo.getChws()); 
			dataObject.setValue(TempexpcloudgciPo.COLUMNS.CUSTOMSGCIDATE.name(), tempexpcloudgciPo.getCustomsgcidate()); 
			dataObject.setValue(TempexpcloudgciPo.COLUMNS.IN_READ.name(), tempexpcloudgciPo.getInRead()); 
			dataObject.setValue(TempexpcloudgciPo.COLUMNS.CRT_DATE.name(), tempexpcloudgciPo.getCrtDate()); 
			dataObject.setValue(TempexpcloudgciPo.COLUMNS.UPT_DT.name(), tempexpcloudgciPo.getUptDt()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TempexpcloudgciPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TempexpcloudgciPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
