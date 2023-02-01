package com.doc.common.dao.impl; 
 
public class ExpressDAOImpl extends GeneralDAOImpl<ExpressPo> implements ExpressDAO { 
	public static final ExpressDAOImpl INSTANCE = new ExpressDAOImpl(); 
	public static final String TABLENAME = "EXPRESS"; 

	public ExpressDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ExpressPo> CONVERTER = new MapConverter<ExpressPo>() { 
 
		@Override 
		public ExpressPo convert(final DataObject dataObject) { 
			final ExpressPo expressPo = new ExpressPo(); 
			expressPo.setExpressid(dataObject.getString(ExpressPo.COLUMNS.EXPRESSID.name())); 
			expressPo.setExpresscname(dataObject.getString(ExpressPo.COLUMNS.EXPRESSCNAME.name())); 
			expressPo.setExpressename(dataObject.getString(ExpressPo.COLUMNS.EXPRESSENAME.name())); 
			expressPo.setExpresssname(dataObject.getString(ExpressPo.COLUMNS.EXPRESSSNAME.name())); 
			expressPo.setBan(dataObject.getString(ExpressPo.COLUMNS.BAN.name())); 
			expressPo.setBoxno(dataObject.getString(ExpressPo.COLUMNS.BOXNO.name())); 
			expressPo.setChargebox(dataObject.getString(ExpressPo.COLUMNS.CHARGEBOX.name())); 
			expressPo.setBaseref(BigDecimalUtils.formObj(dataObject.getValue(ExpressPo.COLUMNS.BASEREF.name()))); 
			expressPo.setCurrenttotal(BigDecimalUtils.formObj(dataObject.getValue(ExpressPo.COLUMNS.CURRENTTOTAL.name()))); 
			expressPo.setBaseline(BigDecimalUtils.formObj(dataObject.getValue(ExpressPo.COLUMNS.BASELINE.name()))); 
			expressPo.setOnlinebill(dataObject.getString(ExpressPo.COLUMNS.ONLINEBILL.name())); 
			expressPo.setOnlinerecp(dataObject.getString(ExpressPo.COLUMNS.ONLINERECP.name())); 
			expressPo.setFeeAlertdate(TimestampUtils.of(dataObject.getValue(ExpressPo.COLUMNS.FEE_ALERTDATE.name()))); 
			expressPo.setFeeRecoverdate(TimestampUtils.of(dataObject.getValue(ExpressPo.COLUMNS.FEE_RECOVERDATE.name()))); 
			expressPo.setFeeLogdate(TimestampUtils.of(dataObject.getValue(ExpressPo.COLUMNS.FEE_LOGDATE.name()))); 
			expressPo.setChargetype(dataObject.getString(ExpressPo.COLUMNS.CHARGETYPE.name())); 
			expressPo.setDiscounttype(dataObject.getString(ExpressPo.COLUMNS.DISCOUNTTYPE.name())); 
			expressPo.setLevel1(BigDecimalUtils.formObj(dataObject.getValue(ExpressPo.COLUMNS.LEVEL1.name()))); 
			expressPo.setDiscount1(BigDecimalUtils.formObj(dataObject.getValue(ExpressPo.COLUMNS.DISCOUNT1.name()))); 
			expressPo.setLevel2(BigDecimalUtils.formObj(dataObject.getValue(ExpressPo.COLUMNS.LEVEL2.name()))); 
			expressPo.setDiscount2(BigDecimalUtils.formObj(dataObject.getValue(ExpressPo.COLUMNS.DISCOUNT2.name()))); 
			expressPo.setLevel3(BigDecimalUtils.formObj(dataObject.getValue(ExpressPo.COLUMNS.LEVEL3.name()))); 
			expressPo.setDiscount3(BigDecimalUtils.formObj(dataObject.getValue(ExpressPo.COLUMNS.DISCOUNT3.name()))); 
			expressPo.setLevel4(BigDecimalUtils.formObj(dataObject.getValue(ExpressPo.COLUMNS.LEVEL4.name()))); 
			expressPo.setDiscount4(BigDecimalUtils.formObj(dataObject.getValue(ExpressPo.COLUMNS.DISCOUNT4.name()))); 
			expressPo.setLevel5(BigDecimalUtils.formObj(dataObject.getValue(ExpressPo.COLUMNS.LEVEL5.name()))); 
			expressPo.setDiscount5(BigDecimalUtils.formObj(dataObject.getValue(ExpressPo.COLUMNS.DISCOUNT5.name()))); 
			expressPo.setObcaccount(dataObject.getString(ExpressPo.COLUMNS.OBCACCOUNT.name())); 
			expressPo.setEhuaccount(dataObject.getString(ExpressPo.COLUMNS.EHUACCOUNT.name())); 
			expressPo.setWarningline(BigDecimalUtils.formObj(dataObject.getValue(ExpressPo.COLUMNS.WARNINGLINE.name()))); 
			expressPo.setStartdate(TimestampUtils.of(dataObject.getValue(ExpressPo.COLUMNS.STARTDATE.name()))); 
			expressPo.setEnddate(TimestampUtils.of(dataObject.getValue(ExpressPo.COLUMNS.ENDDATE.name()))); 
			expressPo.setImpaccount(dataObject.getString(ExpressPo.COLUMNS.IMPACCOUNT.name())); 
			expressPo.setExpressarea(dataObject.getString(ExpressPo.COLUMNS.EXPRESSAREA.name())); 
			expressPo.setPrttal(dataObject.getString(ExpressPo.COLUMNS.PRTTAL.name())); 
			expressPo.setMailname1(dataObject.getString(ExpressPo.COLUMNS.MAILNAME1.name())); 
			expressPo.setMailname2(dataObject.getString(ExpressPo.COLUMNS.MAILNAME2.name())); 
			expressPo.setMailadd1(dataObject.getString(ExpressPo.COLUMNS.MAILADD1.name())); 
			expressPo.setMailadd2(dataObject.getString(ExpressPo.COLUMNS.MAILADD2.name())); 
			expressPo.setDiffduty(dataObject.getString(ExpressPo.COLUMNS.DIFFDUTY.name())); 
			expressPo.setVraccount(dataObject.getString(ExpressPo.COLUMNS.VRACCOUNT.name())); 
			return expressPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ExpressPo expressPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ExpressPo.COLUMNS.EXPRESSID.name(), expressPo.getExpressid()); 
			dataObject.setValue(ExpressPo.COLUMNS.EXPRESSCNAME.name(), expressPo.getExpresscname()); 
			dataObject.setValue(ExpressPo.COLUMNS.EXPRESSENAME.name(), expressPo.getExpressename()); 
			dataObject.setValue(ExpressPo.COLUMNS.EXPRESSSNAME.name(), expressPo.getExpresssname()); 
			dataObject.setValue(ExpressPo.COLUMNS.BAN.name(), expressPo.getBan()); 
			dataObject.setValue(ExpressPo.COLUMNS.BOXNO.name(), expressPo.getBoxno()); 
			dataObject.setValue(ExpressPo.COLUMNS.CHARGEBOX.name(), expressPo.getChargebox()); 
			dataObject.setValue(ExpressPo.COLUMNS.BASEREF.name(), expressPo.getBaseref()); 
			dataObject.setValue(ExpressPo.COLUMNS.CURRENTTOTAL.name(), expressPo.getCurrenttotal()); 
			dataObject.setValue(ExpressPo.COLUMNS.BASELINE.name(), expressPo.getBaseline()); 
			dataObject.setValue(ExpressPo.COLUMNS.ONLINEBILL.name(), expressPo.getOnlinebill()); 
			dataObject.setValue(ExpressPo.COLUMNS.ONLINERECP.name(), expressPo.getOnlinerecp()); 
			dataObject.setValue(ExpressPo.COLUMNS.FEE_ALERTDATE.name(), expressPo.getFeeAlertdate()); 
			dataObject.setValue(ExpressPo.COLUMNS.FEE_RECOVERDATE.name(), expressPo.getFeeRecoverdate()); 
			dataObject.setValue(ExpressPo.COLUMNS.FEE_LOGDATE.name(), expressPo.getFeeLogdate()); 
			dataObject.setValue(ExpressPo.COLUMNS.CHARGETYPE.name(), expressPo.getChargetype()); 
			dataObject.setValue(ExpressPo.COLUMNS.DISCOUNTTYPE.name(), expressPo.getDiscounttype()); 
			dataObject.setValue(ExpressPo.COLUMNS.LEVEL1.name(), expressPo.getLevel1()); 
			dataObject.setValue(ExpressPo.COLUMNS.DISCOUNT1.name(), expressPo.getDiscount1()); 
			dataObject.setValue(ExpressPo.COLUMNS.LEVEL2.name(), expressPo.getLevel2()); 
			dataObject.setValue(ExpressPo.COLUMNS.DISCOUNT2.name(), expressPo.getDiscount2()); 
			dataObject.setValue(ExpressPo.COLUMNS.LEVEL3.name(), expressPo.getLevel3()); 
			dataObject.setValue(ExpressPo.COLUMNS.DISCOUNT3.name(), expressPo.getDiscount3()); 
			dataObject.setValue(ExpressPo.COLUMNS.LEVEL4.name(), expressPo.getLevel4()); 
			dataObject.setValue(ExpressPo.COLUMNS.DISCOUNT4.name(), expressPo.getDiscount4()); 
			dataObject.setValue(ExpressPo.COLUMNS.LEVEL5.name(), expressPo.getLevel5()); 
			dataObject.setValue(ExpressPo.COLUMNS.DISCOUNT5.name(), expressPo.getDiscount5()); 
			dataObject.setValue(ExpressPo.COLUMNS.OBCACCOUNT.name(), expressPo.getObcaccount()); 
			dataObject.setValue(ExpressPo.COLUMNS.EHUACCOUNT.name(), expressPo.getEhuaccount()); 
			dataObject.setValue(ExpressPo.COLUMNS.WARNINGLINE.name(), expressPo.getWarningline()); 
			dataObject.setValue(ExpressPo.COLUMNS.STARTDATE.name(), expressPo.getStartdate()); 
			dataObject.setValue(ExpressPo.COLUMNS.ENDDATE.name(), expressPo.getEnddate()); 
			dataObject.setValue(ExpressPo.COLUMNS.IMPACCOUNT.name(), expressPo.getImpaccount()); 
			dataObject.setValue(ExpressPo.COLUMNS.EXPRESSAREA.name(), expressPo.getExpressarea()); 
			dataObject.setValue(ExpressPo.COLUMNS.PRTTAL.name(), expressPo.getPrttal()); 
			dataObject.setValue(ExpressPo.COLUMNS.MAILNAME1.name(), expressPo.getMailname1()); 
			dataObject.setValue(ExpressPo.COLUMNS.MAILNAME2.name(), expressPo.getMailname2()); 
			dataObject.setValue(ExpressPo.COLUMNS.MAILADD1.name(), expressPo.getMailadd1()); 
			dataObject.setValue(ExpressPo.COLUMNS.MAILADD2.name(), expressPo.getMailadd2()); 
			dataObject.setValue(ExpressPo.COLUMNS.DIFFDUTY.name(), expressPo.getDiffduty()); 
			dataObject.setValue(ExpressPo.COLUMNS.VRACCOUNT.name(), expressPo.getVraccount()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ExpressPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ExpressPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
