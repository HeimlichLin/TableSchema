package com.doc.common.dao.impl; 
 
public class ExpV3DAOImpl extends GeneralDAOImpl<ExpV3Po> implements ExpV3DAO { 
	public static final ExpV3DAOImpl INSTANCE = new ExpV3DAOImpl(); 
	public static final String TABLENAME = "EXP_V3"; 

	public ExpV3DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ExpV3Po> CONVERTER = new MapConverter<ExpV3Po>() { 
 
		@Override 
		public ExpV3Po convert(final DataObject dataObject) { 
			final ExpV3Po expV3Po = new ExpV3Po(); 
			expV3Po.setExpressid(dataObject.getString(ExpV3Po.COLUMNS.EXPRESSID.name())); 
			expV3Po.setExpresscname(dataObject.getString(ExpV3Po.COLUMNS.EXPRESSCNAME.name())); 
			expV3Po.setExpressename(dataObject.getString(ExpV3Po.COLUMNS.EXPRESSENAME.name())); 
			expV3Po.setExpresssname(dataObject.getString(ExpV3Po.COLUMNS.EXPRESSSNAME.name())); 
			expV3Po.setBan(dataObject.getString(ExpV3Po.COLUMNS.BAN.name())); 
			expV3Po.setBoxno(dataObject.getString(ExpV3Po.COLUMNS.BOXNO.name())); 
			expV3Po.setChargebox(dataObject.getString(ExpV3Po.COLUMNS.CHARGEBOX.name())); 
			expV3Po.setBaseref(BigDecimalUtils.formObj(dataObject.getValue(ExpV3Po.COLUMNS.BASEREF.name()))); 
			expV3Po.setCurrenttotal(BigDecimalUtils.formObj(dataObject.getValue(ExpV3Po.COLUMNS.CURRENTTOTAL.name()))); 
			expV3Po.setBaseline(BigDecimalUtils.formObj(dataObject.getValue(ExpV3Po.COLUMNS.BASELINE.name()))); 
			expV3Po.setOnlinebill(dataObject.getString(ExpV3Po.COLUMNS.ONLINEBILL.name())); 
			expV3Po.setOnlinerecp(dataObject.getString(ExpV3Po.COLUMNS.ONLINERECP.name())); 
			expV3Po.setFeeAlertdate(TimestampUtils.of(dataObject.getValue(ExpV3Po.COLUMNS.FEE_ALERTDATE.name()))); 
			expV3Po.setFeeRecoverdate(TimestampUtils.of(dataObject.getValue(ExpV3Po.COLUMNS.FEE_RECOVERDATE.name()))); 
			expV3Po.setFeeLogdate(TimestampUtils.of(dataObject.getValue(ExpV3Po.COLUMNS.FEE_LOGDATE.name()))); 
			expV3Po.setChargetype(dataObject.getString(ExpV3Po.COLUMNS.CHARGETYPE.name())); 
			expV3Po.setDiscounttype(dataObject.getString(ExpV3Po.COLUMNS.DISCOUNTTYPE.name())); 
			expV3Po.setLevel1(BigDecimalUtils.formObj(dataObject.getValue(ExpV3Po.COLUMNS.LEVEL1.name()))); 
			expV3Po.setDiscount1(BigDecimalUtils.formObj(dataObject.getValue(ExpV3Po.COLUMNS.DISCOUNT1.name()))); 
			expV3Po.setLevel2(BigDecimalUtils.formObj(dataObject.getValue(ExpV3Po.COLUMNS.LEVEL2.name()))); 
			expV3Po.setDiscount2(BigDecimalUtils.formObj(dataObject.getValue(ExpV3Po.COLUMNS.DISCOUNT2.name()))); 
			expV3Po.setLevel3(BigDecimalUtils.formObj(dataObject.getValue(ExpV3Po.COLUMNS.LEVEL3.name()))); 
			expV3Po.setDiscount3(BigDecimalUtils.formObj(dataObject.getValue(ExpV3Po.COLUMNS.DISCOUNT3.name()))); 
			expV3Po.setLevel4(BigDecimalUtils.formObj(dataObject.getValue(ExpV3Po.COLUMNS.LEVEL4.name()))); 
			expV3Po.setDiscount4(BigDecimalUtils.formObj(dataObject.getValue(ExpV3Po.COLUMNS.DISCOUNT4.name()))); 
			expV3Po.setLevel5(BigDecimalUtils.formObj(dataObject.getValue(ExpV3Po.COLUMNS.LEVEL5.name()))); 
			expV3Po.setDiscount5(BigDecimalUtils.formObj(dataObject.getValue(ExpV3Po.COLUMNS.DISCOUNT5.name()))); 
			expV3Po.setObcaccount(dataObject.getString(ExpV3Po.COLUMNS.OBCACCOUNT.name())); 
			expV3Po.setEhuaccount(dataObject.getString(ExpV3Po.COLUMNS.EHUACCOUNT.name())); 
			expV3Po.setWarningline(BigDecimalUtils.formObj(dataObject.getValue(ExpV3Po.COLUMNS.WARNINGLINE.name()))); 
			return expV3Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final ExpV3Po expV3Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ExpV3Po.COLUMNS.EXPRESSID.name(), expV3Po.getExpressid()); 
			dataObject.setValue(ExpV3Po.COLUMNS.EXPRESSCNAME.name(), expV3Po.getExpresscname()); 
			dataObject.setValue(ExpV3Po.COLUMNS.EXPRESSENAME.name(), expV3Po.getExpressename()); 
			dataObject.setValue(ExpV3Po.COLUMNS.EXPRESSSNAME.name(), expV3Po.getExpresssname()); 
			dataObject.setValue(ExpV3Po.COLUMNS.BAN.name(), expV3Po.getBan()); 
			dataObject.setValue(ExpV3Po.COLUMNS.BOXNO.name(), expV3Po.getBoxno()); 
			dataObject.setValue(ExpV3Po.COLUMNS.CHARGEBOX.name(), expV3Po.getChargebox()); 
			dataObject.setValue(ExpV3Po.COLUMNS.BASEREF.name(), expV3Po.getBaseref()); 
			dataObject.setValue(ExpV3Po.COLUMNS.CURRENTTOTAL.name(), expV3Po.getCurrenttotal()); 
			dataObject.setValue(ExpV3Po.COLUMNS.BASELINE.name(), expV3Po.getBaseline()); 
			dataObject.setValue(ExpV3Po.COLUMNS.ONLINEBILL.name(), expV3Po.getOnlinebill()); 
			dataObject.setValue(ExpV3Po.COLUMNS.ONLINERECP.name(), expV3Po.getOnlinerecp()); 
			dataObject.setValue(ExpV3Po.COLUMNS.FEE_ALERTDATE.name(), expV3Po.getFeeAlertdate()); 
			dataObject.setValue(ExpV3Po.COLUMNS.FEE_RECOVERDATE.name(), expV3Po.getFeeRecoverdate()); 
			dataObject.setValue(ExpV3Po.COLUMNS.FEE_LOGDATE.name(), expV3Po.getFeeLogdate()); 
			dataObject.setValue(ExpV3Po.COLUMNS.CHARGETYPE.name(), expV3Po.getChargetype()); 
			dataObject.setValue(ExpV3Po.COLUMNS.DISCOUNTTYPE.name(), expV3Po.getDiscounttype()); 
			dataObject.setValue(ExpV3Po.COLUMNS.LEVEL1.name(), expV3Po.getLevel1()); 
			dataObject.setValue(ExpV3Po.COLUMNS.DISCOUNT1.name(), expV3Po.getDiscount1()); 
			dataObject.setValue(ExpV3Po.COLUMNS.LEVEL2.name(), expV3Po.getLevel2()); 
			dataObject.setValue(ExpV3Po.COLUMNS.DISCOUNT2.name(), expV3Po.getDiscount2()); 
			dataObject.setValue(ExpV3Po.COLUMNS.LEVEL3.name(), expV3Po.getLevel3()); 
			dataObject.setValue(ExpV3Po.COLUMNS.DISCOUNT3.name(), expV3Po.getDiscount3()); 
			dataObject.setValue(ExpV3Po.COLUMNS.LEVEL4.name(), expV3Po.getLevel4()); 
			dataObject.setValue(ExpV3Po.COLUMNS.DISCOUNT4.name(), expV3Po.getDiscount4()); 
			dataObject.setValue(ExpV3Po.COLUMNS.LEVEL5.name(), expV3Po.getLevel5()); 
			dataObject.setValue(ExpV3Po.COLUMNS.DISCOUNT5.name(), expV3Po.getDiscount5()); 
			dataObject.setValue(ExpV3Po.COLUMNS.OBCACCOUNT.name(), expV3Po.getObcaccount()); 
			dataObject.setValue(ExpV3Po.COLUMNS.EHUACCOUNT.name(), expV3Po.getEhuaccount()); 
			dataObject.setValue(ExpV3Po.COLUMNS.WARNINGLINE.name(), expV3Po.getWarningline()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ExpV3Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ExpV3Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
