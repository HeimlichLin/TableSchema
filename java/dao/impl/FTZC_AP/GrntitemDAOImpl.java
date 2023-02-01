package com.doc.common.dao.impl; 
 
public class GrntitemDAOImpl extends GeneralDAOImpl<GrntitemPo> implements GrntitemDAO { 
	public static final GrntitemDAOImpl INSTANCE = new GrntitemDAOImpl(); 
	public static final String TABLENAME = "GRNTITEM"; 

	public GrntitemDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<GrntitemPo> CONVERTER = new MapConverter<GrntitemPo>() { 
 
		@Override 
		public GrntitemPo convert(final DataObject dataObject) { 
			final GrntitemPo grntitemPo = new GrntitemPo(); 
			grntitemPo.setBfNo(dataObject.getString(GrntitemPo.COLUMNS.BF_NO.name())); 
			grntitemPo.setRefbillno(dataObject.getString(GrntitemPo.COLUMNS.REFBILLNO.name())); 
			grntitemPo.setDeclNo(dataObject.getString(GrntitemPo.COLUMNS.DECL_NO.name())); 
			grntitemPo.setItemNo(BigDecimalUtils.formObj(dataObject.getValue(GrntitemPo.COLUMNS.ITEM_NO.name()))); 
			grntitemPo.setStrpost(dataObject.getString(GrntitemPo.COLUMNS.STRPOST.name())); 
			grntitemPo.setDeclType(dataObject.getString(GrntitemPo.COLUMNS.DECL_TYPE.name())); 
			grntitemPo.setStrType(dataObject.getString(GrntitemPo.COLUMNS.STR_TYPE.name())); 
			grntitemPo.setStrDate(dataObject.getString(GrntitemPo.COLUMNS.STR_DATE.name())); 
			grntitemPo.setStrQty(BigDecimalUtils.formObj(dataObject.getValue(GrntitemPo.COLUMNS.STR_QTY.name()))); 
			grntitemPo.setValueAmt(BigDecimalUtils.formObj(dataObject.getValue(GrntitemPo.COLUMNS.VALUE_AMT.name()))); 
			grntitemPo.setDutyRate(BigDecimalUtils.formObj(dataObject.getValue(GrntitemPo.COLUMNS.DUTY_RATE.name()))); 
			grntitemPo.setAvlgrntAmt(BigDecimalUtils.formObj(dataObject.getValue(GrntitemPo.COLUMNS.AVLGRNT_AMT.name()))); 
			grntitemPo.setOrigDeclNo(dataObject.getString(GrntitemPo.COLUMNS.ORIG_DECL_NO.name())); 
			grntitemPo.setPrdtNo(dataObject.getString(GrntitemPo.COLUMNS.PRDT_NO.name())); 
			grntitemPo.setSerialNo(dataObject.getString(GrntitemPo.COLUMNS.SERIAL_NO.name())); 
			grntitemPo.setRmks(dataObject.getString(GrntitemPo.COLUMNS.RMKS.name())); 
			grntitemPo.setComdtaxRate(BigDecimalUtils.formObj(dataObject.getValue(GrntitemPo.COLUMNS.COMDTAX_RATE.name()))); 
			grntitemPo.setVataxRate(BigDecimalUtils.formObj(dataObject.getValue(GrntitemPo.COLUMNS.VATAX_RATE.name()))); 
			grntitemPo.setDeclQty(BigDecimalUtils.formObj(dataObject.getValue(GrntitemPo.COLUMNS.DECL_QTY.name()))); 
			grntitemPo.setTaxAmt(BigDecimalUtils.formObj(dataObject.getValue(GrntitemPo.COLUMNS.TAX_AMT.name()))); 
			grntitemPo.setIseval(dataObject.getString(GrntitemPo.COLUMNS.ISEVAL.name())); 
			grntitemPo.setOrigItemno(BigDecimalUtils.formObj(dataObject.getValue(GrntitemPo.COLUMNS.ORIG_ITEMNO.name()))); 
			grntitemPo.setCccCode(dataObject.getString(GrntitemPo.COLUMNS.CCC_CODE.name())); 
			grntitemPo.setItem(BigDecimalUtils.formObj(dataObject.getValue(GrntitemPo.COLUMNS.ITEM.name()))); 
			return grntitemPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final GrntitemPo grntitemPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(GrntitemPo.COLUMNS.BF_NO.name(), grntitemPo.getBfNo()); 
			dataObject.setValue(GrntitemPo.COLUMNS.REFBILLNO.name(), grntitemPo.getRefbillno()); 
			dataObject.setValue(GrntitemPo.COLUMNS.DECL_NO.name(), grntitemPo.getDeclNo()); 
			dataObject.setValue(GrntitemPo.COLUMNS.ITEM_NO.name(), grntitemPo.getItemNo()); 
			dataObject.setValue(GrntitemPo.COLUMNS.STRPOST.name(), grntitemPo.getStrpost()); 
			dataObject.setValue(GrntitemPo.COLUMNS.DECL_TYPE.name(), grntitemPo.getDeclType()); 
			dataObject.setValue(GrntitemPo.COLUMNS.STR_TYPE.name(), grntitemPo.getStrType()); 
			dataObject.setValue(GrntitemPo.COLUMNS.STR_DATE.name(), grntitemPo.getStrDate()); 
			dataObject.setValue(GrntitemPo.COLUMNS.STR_QTY.name(), grntitemPo.getStrQty()); 
			dataObject.setValue(GrntitemPo.COLUMNS.VALUE_AMT.name(), grntitemPo.getValueAmt()); 
			dataObject.setValue(GrntitemPo.COLUMNS.DUTY_RATE.name(), grntitemPo.getDutyRate()); 
			dataObject.setValue(GrntitemPo.COLUMNS.AVLGRNT_AMT.name(), grntitemPo.getAvlgrntAmt()); 
			dataObject.setValue(GrntitemPo.COLUMNS.ORIG_DECL_NO.name(), grntitemPo.getOrigDeclNo()); 
			dataObject.setValue(GrntitemPo.COLUMNS.PRDT_NO.name(), grntitemPo.getPrdtNo()); 
			dataObject.setValue(GrntitemPo.COLUMNS.SERIAL_NO.name(), grntitemPo.getSerialNo()); 
			dataObject.setValue(GrntitemPo.COLUMNS.RMKS.name(), grntitemPo.getRmks()); 
			dataObject.setValue(GrntitemPo.COLUMNS.COMDTAX_RATE.name(), grntitemPo.getComdtaxRate()); 
			dataObject.setValue(GrntitemPo.COLUMNS.VATAX_RATE.name(), grntitemPo.getVataxRate()); 
			dataObject.setValue(GrntitemPo.COLUMNS.DECL_QTY.name(), grntitemPo.getDeclQty()); 
			dataObject.setValue(GrntitemPo.COLUMNS.TAX_AMT.name(), grntitemPo.getTaxAmt()); 
			dataObject.setValue(GrntitemPo.COLUMNS.ISEVAL.name(), grntitemPo.getIseval()); 
			dataObject.setValue(GrntitemPo.COLUMNS.ORIG_ITEMNO.name(), grntitemPo.getOrigItemno()); 
			dataObject.setValue(GrntitemPo.COLUMNS.CCC_CODE.name(), grntitemPo.getCccCode()); 
			dataObject.setValue(GrntitemPo.COLUMNS.ITEM.name(), grntitemPo.getItem()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<GrntitemPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(GrntitemPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
