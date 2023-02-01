package com.doc.common.dao.impl; 
 
public class ExpresslogDAOImpl extends GeneralDAOImpl<ExpresslogPo> implements ExpresslogDAO { 
	public static final ExpresslogDAOImpl INSTANCE = new ExpresslogDAOImpl(); 
	public static final String TABLENAME = "EXPRESSLOG"; 

	public ExpresslogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ExpresslogPo> CONVERTER = new MapConverter<ExpresslogPo>() { 
 
		@Override 
		public ExpresslogPo convert(final DataObject dataObject) { 
			final ExpresslogPo expresslogPo = new ExpresslogPo(); 
			expresslogPo.setExpressid(dataObject.getString(ExpresslogPo.COLUMNS.EXPRESSID.name())); 
			expresslogPo.setExpresscname(dataObject.getString(ExpresslogPo.COLUMNS.EXPRESSCNAME.name())); 
			expresslogPo.setExpressename(dataObject.getString(ExpresslogPo.COLUMNS.EXPRESSENAME.name())); 
			expresslogPo.setExpresssname(dataObject.getString(ExpresslogPo.COLUMNS.EXPRESSSNAME.name())); 
			expresslogPo.setBan(dataObject.getString(ExpresslogPo.COLUMNS.BAN.name())); 
			expresslogPo.setBoxno(dataObject.getString(ExpresslogPo.COLUMNS.BOXNO.name())); 
			expresslogPo.setChargebox(dataObject.getString(ExpresslogPo.COLUMNS.CHARGEBOX.name())); 
			expresslogPo.setBaseref(BigDecimalUtils.formObj(dataObject.getValue(ExpresslogPo.COLUMNS.BASEREF.name()))); 
			expresslogPo.setCurrenttotal(BigDecimalUtils.formObj(dataObject.getValue(ExpresslogPo.COLUMNS.CURRENTTOTAL.name()))); 
			expresslogPo.setBaseline(BigDecimalUtils.formObj(dataObject.getValue(ExpresslogPo.COLUMNS.BASELINE.name()))); 
			expresslogPo.setOnlinebill(dataObject.getString(ExpresslogPo.COLUMNS.ONLINEBILL.name())); 
			expresslogPo.setOnlinerecp(dataObject.getString(ExpresslogPo.COLUMNS.ONLINERECP.name())); 
			expresslogPo.setFeeAlertdate(TimestampUtils.of(dataObject.getValue(ExpresslogPo.COLUMNS.FEE_ALERTDATE.name()))); 
			expresslogPo.setFeeRecoverdate(TimestampUtils.of(dataObject.getValue(ExpresslogPo.COLUMNS.FEE_RECOVERDATE.name()))); 
			expresslogPo.setFeeLogdate(TimestampUtils.of(dataObject.getValue(ExpresslogPo.COLUMNS.FEE_LOGDATE.name()))); 
			expresslogPo.setChargetype(dataObject.getString(ExpresslogPo.COLUMNS.CHARGETYPE.name())); 
			expresslogPo.setDiscounttype(dataObject.getString(ExpresslogPo.COLUMNS.DISCOUNTTYPE.name())); 
			expresslogPo.setLevel1(BigDecimalUtils.formObj(dataObject.getValue(ExpresslogPo.COLUMNS.LEVEL1.name()))); 
			expresslogPo.setDiscount1(BigDecimalUtils.formObj(dataObject.getValue(ExpresslogPo.COLUMNS.DISCOUNT1.name()))); 
			expresslogPo.setLevel2(BigDecimalUtils.formObj(dataObject.getValue(ExpresslogPo.COLUMNS.LEVEL2.name()))); 
			expresslogPo.setDiscount2(BigDecimalUtils.formObj(dataObject.getValue(ExpresslogPo.COLUMNS.DISCOUNT2.name()))); 
			expresslogPo.setLevel3(BigDecimalUtils.formObj(dataObject.getValue(ExpresslogPo.COLUMNS.LEVEL3.name()))); 
			expresslogPo.setDiscount3(BigDecimalUtils.formObj(dataObject.getValue(ExpresslogPo.COLUMNS.DISCOUNT3.name()))); 
			expresslogPo.setLevel4(BigDecimalUtils.formObj(dataObject.getValue(ExpresslogPo.COLUMNS.LEVEL4.name()))); 
			expresslogPo.setDiscount4(BigDecimalUtils.formObj(dataObject.getValue(ExpresslogPo.COLUMNS.DISCOUNT4.name()))); 
			expresslogPo.setLevel5(BigDecimalUtils.formObj(dataObject.getValue(ExpresslogPo.COLUMNS.LEVEL5.name()))); 
			expresslogPo.setDiscount5(BigDecimalUtils.formObj(dataObject.getValue(ExpresslogPo.COLUMNS.DISCOUNT5.name()))); 
			expresslogPo.setObcaccount(dataObject.getString(ExpresslogPo.COLUMNS.OBCACCOUNT.name())); 
			expresslogPo.setEhuaccount(dataObject.getString(ExpresslogPo.COLUMNS.EHUACCOUNT.name())); 
			expresslogPo.setWarningline(BigDecimalUtils.formObj(dataObject.getValue(ExpresslogPo.COLUMNS.WARNINGLINE.name()))); 
			expresslogPo.setStartdate(TimestampUtils.of(dataObject.getValue(ExpresslogPo.COLUMNS.STARTDATE.name()))); 
			expresslogPo.setEnddate(TimestampUtils.of(dataObject.getValue(ExpresslogPo.COLUMNS.ENDDATE.name()))); 
			expresslogPo.setImpaccount(dataObject.getString(ExpresslogPo.COLUMNS.IMPACCOUNT.name())); 
			expresslogPo.setExpressarea(dataObject.getString(ExpresslogPo.COLUMNS.EXPRESSAREA.name())); 
			expresslogPo.setPrttal(dataObject.getString(ExpresslogPo.COLUMNS.PRTTAL.name())); 
			expresslogPo.setMailname1(dataObject.getString(ExpresslogPo.COLUMNS.MAILNAME1.name())); 
			expresslogPo.setMailname2(dataObject.getString(ExpresslogPo.COLUMNS.MAILNAME2.name())); 
			expresslogPo.setMailadd1(dataObject.getString(ExpresslogPo.COLUMNS.MAILADD1.name())); 
			expresslogPo.setMailadd2(dataObject.getString(ExpresslogPo.COLUMNS.MAILADD2.name())); 
			expresslogPo.setStatus(dataObject.getString(ExpresslogPo.COLUMNS.STATUS.name())); 
			expresslogPo.setLastdate(dataObject.getString(ExpresslogPo.COLUMNS.LASTDATE.name())); 
			expresslogPo.setEdituser(dataObject.getString(ExpresslogPo.COLUMNS.EDITUSER.name())); 
			expresslogPo.setDiffduty(dataObject.getString(ExpresslogPo.COLUMNS.DIFFDUTY.name())); 
			expresslogPo.setVraccount(dataObject.getString(ExpresslogPo.COLUMNS.VRACCOUNT.name())); 
			return expresslogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ExpresslogPo expresslogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ExpresslogPo.COLUMNS.EXPRESSID.name(), expresslogPo.getExpressid()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.EXPRESSCNAME.name(), expresslogPo.getExpresscname()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.EXPRESSENAME.name(), expresslogPo.getExpressename()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.EXPRESSSNAME.name(), expresslogPo.getExpresssname()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.BAN.name(), expresslogPo.getBan()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.BOXNO.name(), expresslogPo.getBoxno()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.CHARGEBOX.name(), expresslogPo.getChargebox()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.BASEREF.name(), expresslogPo.getBaseref()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.CURRENTTOTAL.name(), expresslogPo.getCurrenttotal()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.BASELINE.name(), expresslogPo.getBaseline()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.ONLINEBILL.name(), expresslogPo.getOnlinebill()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.ONLINERECP.name(), expresslogPo.getOnlinerecp()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.FEE_ALERTDATE.name(), expresslogPo.getFeeAlertdate()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.FEE_RECOVERDATE.name(), expresslogPo.getFeeRecoverdate()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.FEE_LOGDATE.name(), expresslogPo.getFeeLogdate()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.CHARGETYPE.name(), expresslogPo.getChargetype()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.DISCOUNTTYPE.name(), expresslogPo.getDiscounttype()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.LEVEL1.name(), expresslogPo.getLevel1()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.DISCOUNT1.name(), expresslogPo.getDiscount1()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.LEVEL2.name(), expresslogPo.getLevel2()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.DISCOUNT2.name(), expresslogPo.getDiscount2()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.LEVEL3.name(), expresslogPo.getLevel3()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.DISCOUNT3.name(), expresslogPo.getDiscount3()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.LEVEL4.name(), expresslogPo.getLevel4()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.DISCOUNT4.name(), expresslogPo.getDiscount4()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.LEVEL5.name(), expresslogPo.getLevel5()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.DISCOUNT5.name(), expresslogPo.getDiscount5()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.OBCACCOUNT.name(), expresslogPo.getObcaccount()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.EHUACCOUNT.name(), expresslogPo.getEhuaccount()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.WARNINGLINE.name(), expresslogPo.getWarningline()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.STARTDATE.name(), expresslogPo.getStartdate()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.ENDDATE.name(), expresslogPo.getEnddate()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.IMPACCOUNT.name(), expresslogPo.getImpaccount()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.EXPRESSAREA.name(), expresslogPo.getExpressarea()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.PRTTAL.name(), expresslogPo.getPrttal()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.MAILNAME1.name(), expresslogPo.getMailname1()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.MAILNAME2.name(), expresslogPo.getMailname2()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.MAILADD1.name(), expresslogPo.getMailadd1()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.MAILADD2.name(), expresslogPo.getMailadd2()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.STATUS.name(), expresslogPo.getStatus()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.LASTDATE.name(), expresslogPo.getLastdate()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.EDITUSER.name(), expresslogPo.getEdituser()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.DIFFDUTY.name(), expresslogPo.getDiffduty()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.VRACCOUNT.name(), expresslogPo.getVraccount()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ExpresslogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ExpresslogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
