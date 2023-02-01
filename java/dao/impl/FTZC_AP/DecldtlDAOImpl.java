package com.doc.common.dao.impl; 
 
public class DecldtlDAOImpl extends GeneralDAOImpl<DecldtlPo> implements DecldtlDAO { 
	public static final DecldtlDAOImpl INSTANCE = new DecldtlDAOImpl(); 
	public static final String TABLENAME = "DECLDTL"; 

	public DecldtlDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DecldtlPo> CONVERTER = new MapConverter<DecldtlPo>() { 
 
		@Override 
		public DecldtlPo convert(final DataObject dataObject) { 
			final DecldtlPo decldtlPo = new DecldtlPo(); 
			decldtlPo.setBfNo(dataObject.getString(DecldtlPo.COLUMNS.BF_NO.name())); 
			decldtlPo.setDeclNo(dataObject.getString(DecldtlPo.COLUMNS.DECL_NO.name())); 
			decldtlPo.setItemNo(BigDecimalUtils.formObj(dataObject.getValue(DecldtlPo.COLUMNS.ITEM_NO.name()))); 
			decldtlPo.setPrdtNo(dataObject.getString(DecldtlPo.COLUMNS.PRDT_NO.name())); 
			decldtlPo.setDescrip(dataObject.getString(DecldtlPo.COLUMNS.DESCRIP.name())); 
			decldtlPo.setBrand(dataObject.getString(DecldtlPo.COLUMNS.BRAND.name())); 
			decldtlPo.setModel(dataObject.getString(DecldtlPo.COLUMNS.MODEL.name())); 
			decldtlPo.setSpec(dataObject.getString(DecldtlPo.COLUMNS.SPEC.name())); 
			decldtlPo.setNetWgt(BigDecimalUtils.formObj(dataObject.getValue(DecldtlPo.COLUMNS.NET_WGT.name()))); 
			decldtlPo.setQty(BigDecimalUtils.formObj(dataObject.getValue(DecldtlPo.COLUMNS.QTY.name()))); 
			decldtlPo.setUnit(dataObject.getString(DecldtlPo.COLUMNS.UNIT.name())); 
			decldtlPo.setUnitPrice(BigDecimalUtils.formObj(dataObject.getValue(DecldtlPo.COLUMNS.UNIT_PRICE.name()))); 
			decldtlPo.setCur(dataObject.getString(DecldtlPo.COLUMNS.CUR.name())); 
			decldtlPo.setValueAmt(BigDecimalUtils.formObj(dataObject.getValue(DecldtlPo.COLUMNS.VALUE_AMT.name()))); 
			decldtlPo.setValueQty(BigDecimalUtils.formObj(dataObject.getValue(DecldtlPo.COLUMNS.VALUE_QTY.name()))); 
			decldtlPo.setDutyRate(BigDecimalUtils.formObj(dataObject.getValue(DecldtlPo.COLUMNS.DUTY_RATE.name()))); 
			decldtlPo.setUnitDuty(BigDecimalUtils.formObj(dataObject.getValue(DecldtlPo.COLUMNS.UNIT_DUTY.name()))); 
			decldtlPo.setODeclNo(dataObject.getString(DecldtlPo.COLUMNS.O_DECL_NO.name())); 
			decldtlPo.setOItemNo(BigDecimalUtils.formObj(dataObject.getValue(DecldtlPo.COLUMNS.O_ITEM_NO.name()))); 
			decldtlPo.setCccCode(dataObject.getString(DecldtlPo.COLUMNS.CCC_CODE.name())); 
			decldtlPo.setComdTaxRate(BigDecimalUtils.formObj(dataObject.getValue(DecldtlPo.COLUMNS.COMD_TAX_RATE.name()))); 
			decldtlPo.setStrType(dataObject.getString(DecldtlPo.COLUMNS.STR_TYPE.name())); 
			decldtlPo.setDutyType(dataObject.getString(DecldtlPo.COLUMNS.DUTY_TYPE.name())); 
			decldtlPo.setStatMode(dataObject.getString(DecldtlPo.COLUMNS.STAT_MODE.name())); 
			decldtlPo.setGWgt(BigDecimalUtils.formObj(dataObject.getValue(DecldtlPo.COLUMNS.G_WGT.name()))); 
			decldtlPo.setProdCountry(dataObject.getString(DecldtlPo.COLUMNS.PROD_COUNTRY.name())); 
			decldtlPo.setOffLineDate(dataObject.getString(DecldtlPo.COLUMNS.OFF_LINE_DATE.name())); 
			decldtlPo.setUserId(dataObject.getString(DecldtlPo.COLUMNS.USER_ID.name())); 
			decldtlPo.setTransId(dataObject.getString(DecldtlPo.COLUMNS.TRANS_ID.name())); 
			decldtlPo.setMsgType(dataObject.getString(DecldtlPo.COLUMNS.MSG_TYPE.name())); 
			decldtlPo.setDeclSeqNo(BigDecimalUtils.formObj(dataObject.getValue(DecldtlPo.COLUMNS.DECL_SEQ_NO.name()))); 
			return decldtlPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DecldtlPo decldtlPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DecldtlPo.COLUMNS.BF_NO.name(), decldtlPo.getBfNo()); 
			dataObject.setValue(DecldtlPo.COLUMNS.DECL_NO.name(), decldtlPo.getDeclNo()); 
			dataObject.setValue(DecldtlPo.COLUMNS.ITEM_NO.name(), decldtlPo.getItemNo()); 
			dataObject.setValue(DecldtlPo.COLUMNS.PRDT_NO.name(), decldtlPo.getPrdtNo()); 
			dataObject.setValue(DecldtlPo.COLUMNS.DESCRIP.name(), decldtlPo.getDescrip()); 
			dataObject.setValue(DecldtlPo.COLUMNS.BRAND.name(), decldtlPo.getBrand()); 
			dataObject.setValue(DecldtlPo.COLUMNS.MODEL.name(), decldtlPo.getModel()); 
			dataObject.setValue(DecldtlPo.COLUMNS.SPEC.name(), decldtlPo.getSpec()); 
			dataObject.setValue(DecldtlPo.COLUMNS.NET_WGT.name(), decldtlPo.getNetWgt()); 
			dataObject.setValue(DecldtlPo.COLUMNS.QTY.name(), decldtlPo.getQty()); 
			dataObject.setValue(DecldtlPo.COLUMNS.UNIT.name(), decldtlPo.getUnit()); 
			dataObject.setValue(DecldtlPo.COLUMNS.UNIT_PRICE.name(), decldtlPo.getUnitPrice()); 
			dataObject.setValue(DecldtlPo.COLUMNS.CUR.name(), decldtlPo.getCur()); 
			dataObject.setValue(DecldtlPo.COLUMNS.VALUE_AMT.name(), decldtlPo.getValueAmt()); 
			dataObject.setValue(DecldtlPo.COLUMNS.VALUE_QTY.name(), decldtlPo.getValueQty()); 
			dataObject.setValue(DecldtlPo.COLUMNS.DUTY_RATE.name(), decldtlPo.getDutyRate()); 
			dataObject.setValue(DecldtlPo.COLUMNS.UNIT_DUTY.name(), decldtlPo.getUnitDuty()); 
			dataObject.setValue(DecldtlPo.COLUMNS.O_DECL_NO.name(), decldtlPo.getODeclNo()); 
			dataObject.setValue(DecldtlPo.COLUMNS.O_ITEM_NO.name(), decldtlPo.getOItemNo()); 
			dataObject.setValue(DecldtlPo.COLUMNS.CCC_CODE.name(), decldtlPo.getCccCode()); 
			dataObject.setValue(DecldtlPo.COLUMNS.COMD_TAX_RATE.name(), decldtlPo.getComdTaxRate()); 
			dataObject.setValue(DecldtlPo.COLUMNS.STR_TYPE.name(), decldtlPo.getStrType()); 
			dataObject.setValue(DecldtlPo.COLUMNS.DUTY_TYPE.name(), decldtlPo.getDutyType()); 
			dataObject.setValue(DecldtlPo.COLUMNS.STAT_MODE.name(), decldtlPo.getStatMode()); 
			dataObject.setValue(DecldtlPo.COLUMNS.G_WGT.name(), decldtlPo.getGWgt()); 
			dataObject.setValue(DecldtlPo.COLUMNS.PROD_COUNTRY.name(), decldtlPo.getProdCountry()); 
			dataObject.setValue(DecldtlPo.COLUMNS.OFF_LINE_DATE.name(), decldtlPo.getOffLineDate()); 
			dataObject.setValue(DecldtlPo.COLUMNS.USER_ID.name(), decldtlPo.getUserId()); 
			dataObject.setValue(DecldtlPo.COLUMNS.TRANS_ID.name(), decldtlPo.getTransId()); 
			dataObject.setValue(DecldtlPo.COLUMNS.MSG_TYPE.name(), decldtlPo.getMsgType()); 
			dataObject.setValue(DecldtlPo.COLUMNS.DECL_SEQ_NO.name(), decldtlPo.getDeclSeqNo()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DecldtlPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DecldtlPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
