package com.doc.common.dao.impl; 
 
public class L4T2DAOImpl extends GeneralDAOImpl<L4T2Po> implements L4T2DAO { 
	public static final L4T2DAOImpl INSTANCE = new L4T2DAOImpl(); 
	public static final String TABLENAME = "L4_T2"; 

	public L4T2DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<L4T2Po> CONVERTER = new MapConverter<L4T2Po>() { 
 
		@Override 
		public L4T2Po convert(final DataObject dataObject) { 
			final L4T2Po l4T2Po = new L4T2Po(); 
			l4T2Po.setControlNo(dataObject.getString(L4T2Po.COLUMNS.CONTROL_NO.name())); 
			l4T2Po.setSerialNo(BigDecimalUtils.formObj(dataObject.getValue(L4T2Po.COLUMNS.SERIAL_NO.name()))); 
			l4T2Po.setSeqNo(BigDecimalUtils.formObj(dataObject.getValue(L4T2Po.COLUMNS.SEQ_NO.name()))); 
			l4T2Po.setRefBillNo(dataObject.getString(L4T2Po.COLUMNS.REF_BILL_NO.name())); 
			l4T2Po.setItem(dataObject.getString(L4T2Po.COLUMNS.ITEM.name())); 
			l4T2Po.setPrdtNo(dataObject.getString(L4T2Po.COLUMNS.PRDT_NO.name())); 
			l4T2Po.setRQty(BigDecimalUtils.formObj(dataObject.getValue(L4T2Po.COLUMNS.R_QTY.name()))); 
			l4T2Po.setRUnit(dataObject.getString(L4T2Po.COLUMNS.R_UNIT.name())); 
			l4T2Po.setRPost(dataObject.getString(L4T2Po.COLUMNS.R_POST.name())); 
			l4T2Po.setRDate(dataObject.getString(L4T2Po.COLUMNS.R_DATE.name())); 
			l4T2Po.setBatchNo(dataObject.getString(L4T2Po.COLUMNS.BATCH_NO.name())); 
			l4T2Po.setDeclNo(dataObject.getString(L4T2Po.COLUMNS.DECL_NO.name())); 
			l4T2Po.setDeclType(dataObject.getString(L4T2Po.COLUMNS.DECL_TYPE.name())); 
			l4T2Po.setItemNo(dataObject.getString(L4T2Po.COLUMNS.ITEM_NO.name())); 
			l4T2Po.setODeclNo(dataObject.getString(L4T2Po.COLUMNS.O_DECL_NO.name())); 
			l4T2Po.setOItemNo(dataObject.getString(L4T2Po.COLUMNS.O_ITEM_NO.name())); 
			l4T2Po.setOpType(dataObject.getString(L4T2Po.COLUMNS.OP_TYPE.name())); 
			l4T2Po.setCccCode(dataObject.getString(L4T2Po.COLUMNS.CCC_CODE.name())); 
			l4T2Po.setTradePrdtNo(dataObject.getString(L4T2Po.COLUMNS.TRADE_PRDT_NO.name())); 
			l4T2Po.setUserId(dataObject.getString(L4T2Po.COLUMNS.USER_ID.name())); 
			l4T2Po.setUnitPrice(BigDecimalUtils.formObj(dataObject.getValue(L4T2Po.COLUMNS.UNIT_PRICE.name()))); 
			l4T2Po.setValueAmt(dataObject.getString(L4T2Po.COLUMNS.VALUE_AMT.name())); 
			l4T2Po.setDutyRate(BigDecimalUtils.formObj(dataObject.getValue(L4T2Po.COLUMNS.DUTY_RATE.name()))); 
			l4T2Po.setComdTaxRate(BigDecimalUtils.formObj(dataObject.getValue(L4T2Po.COLUMNS.COMD_TAX_RATE.name()))); 
			l4T2Po.setDeclQty(BigDecimalUtils.formObj(dataObject.getValue(L4T2Po.COLUMNS.DECL_QTY.name()))); 
			l4T2Po.setDutyType(dataObject.getString(L4T2Po.COLUMNS.DUTY_TYPE.name())); 
			l4T2Po.setStatMode(dataObject.getString(L4T2Po.COLUMNS.STAT_MODE.name())); 
			l4T2Po.setNetWgt(BigDecimalUtils.formObj(dataObject.getValue(L4T2Po.COLUMNS.NET_WGT.name()))); 
			l4T2Po.setGross(BigDecimalUtils.formObj(dataObject.getValue(L4T2Po.COLUMNS.GROSS.name()))); 
			l4T2Po.setMakePlace(dataObject.getString(L4T2Po.COLUMNS.MAKE_PLACE.name())); 
			l4T2Po.setCur(dataObject.getString(L4T2Po.COLUMNS.CUR.name())); 
			l4T2Po.setSpec(dataObject.getString(L4T2Po.COLUMNS.SPEC.name())); 
			l4T2Po.setModel(dataObject.getString(L4T2Po.COLUMNS.MODEL.name())); 
			l4T2Po.setNoPkg(BigDecimalUtils.formObj(dataObject.getValue(L4T2Po.COLUMNS.NO_PKG.name()))); 
			l4T2Po.setFtzNo(dataObject.getString(L4T2Po.COLUMNS.FTZ_NO.name())); 
			l4T2Po.setBomNo(dataObject.getString(L4T2Po.COLUMNS.BOM_NO.name())); 
			l4T2Po.setL4Time(TimestampUtils.of(dataObject.getValue(L4T2Po.COLUMNS.L4_TIME.name()))); 
			l4T2Po.setIConfirmed(dataObject.getString(L4T2Po.COLUMNS.I_CONFIRMED.name())); 
			l4T2Po.setDescrip(dataObject.getString(L4T2Po.COLUMNS.DESCRIP.name())); 
			l4T2Po.setStrType(dataObject.getString(L4T2Po.COLUMNS.STR_TYPE.name())); 
			l4T2Po.setT1SeqNo(BigDecimalUtils.formObj(dataObject.getValue(L4T2Po.COLUMNS.T1_SEQ_NO.name()))); 
			l4T2Po.setRemks(dataObject.getString(L4T2Po.COLUMNS.REMKS.name())); 
			l4T2Po.setRptType(dataObject.getString(L4T2Po.COLUMNS.RPT_TYPE.name())); 
			l4T2Po.setOpConfig(dataObject.getString(L4T2Po.COLUMNS.OP_CONFIG.name())); 
			l4T2Po.setDeclSeqNo(BigDecimalUtils.formObj(dataObject.getValue(L4T2Po.COLUMNS.DECL_SEQ_NO.name()))); 
			return l4T2Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final L4T2Po l4T2Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(L4T2Po.COLUMNS.CONTROL_NO.name(), l4T2Po.getControlNo()); 
			dataObject.setValue(L4T2Po.COLUMNS.SERIAL_NO.name(), l4T2Po.getSerialNo()); 
			dataObject.setValue(L4T2Po.COLUMNS.SEQ_NO.name(), l4T2Po.getSeqNo()); 
			dataObject.setValue(L4T2Po.COLUMNS.REF_BILL_NO.name(), l4T2Po.getRefBillNo()); 
			dataObject.setValue(L4T2Po.COLUMNS.ITEM.name(), l4T2Po.getItem()); 
			dataObject.setValue(L4T2Po.COLUMNS.PRDT_NO.name(), l4T2Po.getPrdtNo()); 
			dataObject.setValue(L4T2Po.COLUMNS.R_QTY.name(), l4T2Po.getRQty()); 
			dataObject.setValue(L4T2Po.COLUMNS.R_UNIT.name(), l4T2Po.getRUnit()); 
			dataObject.setValue(L4T2Po.COLUMNS.R_POST.name(), l4T2Po.getRPost()); 
			dataObject.setValue(L4T2Po.COLUMNS.R_DATE.name(), l4T2Po.getRDate()); 
			dataObject.setValue(L4T2Po.COLUMNS.BATCH_NO.name(), l4T2Po.getBatchNo()); 
			dataObject.setValue(L4T2Po.COLUMNS.DECL_NO.name(), l4T2Po.getDeclNo()); 
			dataObject.setValue(L4T2Po.COLUMNS.DECL_TYPE.name(), l4T2Po.getDeclType()); 
			dataObject.setValue(L4T2Po.COLUMNS.ITEM_NO.name(), l4T2Po.getItemNo()); 
			dataObject.setValue(L4T2Po.COLUMNS.O_DECL_NO.name(), l4T2Po.getODeclNo()); 
			dataObject.setValue(L4T2Po.COLUMNS.O_ITEM_NO.name(), l4T2Po.getOItemNo()); 
			dataObject.setValue(L4T2Po.COLUMNS.OP_TYPE.name(), l4T2Po.getOpType()); 
			dataObject.setValue(L4T2Po.COLUMNS.CCC_CODE.name(), l4T2Po.getCccCode()); 
			dataObject.setValue(L4T2Po.COLUMNS.TRADE_PRDT_NO.name(), l4T2Po.getTradePrdtNo()); 
			dataObject.setValue(L4T2Po.COLUMNS.USER_ID.name(), l4T2Po.getUserId()); 
			dataObject.setValue(L4T2Po.COLUMNS.UNIT_PRICE.name(), l4T2Po.getUnitPrice()); 
			dataObject.setValue(L4T2Po.COLUMNS.VALUE_AMT.name(), l4T2Po.getValueAmt()); 
			dataObject.setValue(L4T2Po.COLUMNS.DUTY_RATE.name(), l4T2Po.getDutyRate()); 
			dataObject.setValue(L4T2Po.COLUMNS.COMD_TAX_RATE.name(), l4T2Po.getComdTaxRate()); 
			dataObject.setValue(L4T2Po.COLUMNS.DECL_QTY.name(), l4T2Po.getDeclQty()); 
			dataObject.setValue(L4T2Po.COLUMNS.DUTY_TYPE.name(), l4T2Po.getDutyType()); 
			dataObject.setValue(L4T2Po.COLUMNS.STAT_MODE.name(), l4T2Po.getStatMode()); 
			dataObject.setValue(L4T2Po.COLUMNS.NET_WGT.name(), l4T2Po.getNetWgt()); 
			dataObject.setValue(L4T2Po.COLUMNS.GROSS.name(), l4T2Po.getGross()); 
			dataObject.setValue(L4T2Po.COLUMNS.MAKE_PLACE.name(), l4T2Po.getMakePlace()); 
			dataObject.setValue(L4T2Po.COLUMNS.CUR.name(), l4T2Po.getCur()); 
			dataObject.setValue(L4T2Po.COLUMNS.SPEC.name(), l4T2Po.getSpec()); 
			dataObject.setValue(L4T2Po.COLUMNS.MODEL.name(), l4T2Po.getModel()); 
			dataObject.setValue(L4T2Po.COLUMNS.NO_PKG.name(), l4T2Po.getNoPkg()); 
			dataObject.setValue(L4T2Po.COLUMNS.FTZ_NO.name(), l4T2Po.getFtzNo()); 
			dataObject.setValue(L4T2Po.COLUMNS.BOM_NO.name(), l4T2Po.getBomNo()); 
			dataObject.setValue(L4T2Po.COLUMNS.L4_TIME.name(), l4T2Po.getL4Time()); 
			dataObject.setValue(L4T2Po.COLUMNS.I_CONFIRMED.name(), l4T2Po.getIConfirmed()); 
			dataObject.setValue(L4T2Po.COLUMNS.DESCRIP.name(), l4T2Po.getDescrip()); 
			dataObject.setValue(L4T2Po.COLUMNS.STR_TYPE.name(), l4T2Po.getStrType()); 
			dataObject.setValue(L4T2Po.COLUMNS.T1_SEQ_NO.name(), l4T2Po.getT1SeqNo()); 
			dataObject.setValue(L4T2Po.COLUMNS.REMKS.name(), l4T2Po.getRemks()); 
			dataObject.setValue(L4T2Po.COLUMNS.RPT_TYPE.name(), l4T2Po.getRptType()); 
			dataObject.setValue(L4T2Po.COLUMNS.OP_CONFIG.name(), l4T2Po.getOpConfig()); 
			dataObject.setValue(L4T2Po.COLUMNS.DECL_SEQ_NO.name(), l4T2Po.getDeclSeqNo()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<L4T2Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(L4T2Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
