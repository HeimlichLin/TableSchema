package com.doc.common.dao.impl; 
 
public class ExpV2DAOImpl extends GeneralDAOImpl<ExpV2Po> implements ExpV2DAO { 
	public static final ExpV2DAOImpl INSTANCE = new ExpV2DAOImpl(); 
	public static final String TABLENAME = "EXP_V2"; 

	public ExpV2DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ExpV2Po> CONVERTER = new MapConverter<ExpV2Po>() { 
 
		@Override 
		public ExpV2Po convert(final DataObject dataObject) { 
			final ExpV2Po expV2Po = new ExpV2Po(); 
			expV2Po.setExpressid(dataObject.getString(ExpV2Po.COLUMNS.EXPRESSID.name())); 
			expV2Po.setExpresscname(dataObject.getString(ExpV2Po.COLUMNS.EXPRESSCNAME.name())); 
			expV2Po.setExpressename(dataObject.getString(ExpV2Po.COLUMNS.EXPRESSENAME.name())); 
			expV2Po.setBan(dataObject.getString(ExpV2Po.COLUMNS.BAN.name())); 
			expV2Po.setBoxno(dataObject.getString(ExpV2Po.COLUMNS.BOXNO.name())); 
			expV2Po.setChargebox(dataObject.getString(ExpV2Po.COLUMNS.CHARGEBOX.name())); 
			expV2Po.setGuarantee(BigDecimalUtils.formObj(dataObject.getValue(ExpV2Po.COLUMNS.GUARANTEE.name()))); 
			expV2Po.setBaseline(BigDecimalUtils.formObj(dataObject.getValue(ExpV2Po.COLUMNS.BASELINE.name()))); 
			expV2Po.setLowerestline(BigDecimalUtils.formObj(dataObject.getValue(ExpV2Po.COLUMNS.LOWERESTLINE.name()))); 
			expV2Po.setGuaranteebase(BigDecimalUtils.formObj(dataObject.getValue(ExpV2Po.COLUMNS.GUARANTEEBASE.name()))); 
			expV2Po.setEhuaccount(dataObject.getString(ExpV2Po.COLUMNS.EHUACCOUNT.name())); 
			expV2Po.setObcaccount(dataObject.getString(ExpV2Po.COLUMNS.OBCACCOUNT.name())); 
			expV2Po.setDiscounttype(dataObject.getString(ExpV2Po.COLUMNS.DISCOUNTTYPE.name())); 
			expV2Po.setLevel1(BigDecimalUtils.formObj(dataObject.getValue(ExpV2Po.COLUMNS.LEVEL1.name()))); 
			expV2Po.setDiscount1(BigDecimalUtils.formObj(dataObject.getValue(ExpV2Po.COLUMNS.DISCOUNT1.name()))); 
			expV2Po.setLevel2(BigDecimalUtils.formObj(dataObject.getValue(ExpV2Po.COLUMNS.LEVEL2.name()))); 
			expV2Po.setDiscount2(BigDecimalUtils.formObj(dataObject.getValue(ExpV2Po.COLUMNS.DISCOUNT2.name()))); 
			expV2Po.setLevel3(BigDecimalUtils.formObj(dataObject.getValue(ExpV2Po.COLUMNS.LEVEL3.name()))); 
			expV2Po.setDiscount3(BigDecimalUtils.formObj(dataObject.getValue(ExpV2Po.COLUMNS.DISCOUNT3.name()))); 
			expV2Po.setLevel4(BigDecimalUtils.formObj(dataObject.getValue(ExpV2Po.COLUMNS.LEVEL4.name()))); 
			expV2Po.setDiscount4(BigDecimalUtils.formObj(dataObject.getValue(ExpV2Po.COLUMNS.DISCOUNT4.name()))); 
			expV2Po.setLevel5(BigDecimalUtils.formObj(dataObject.getValue(ExpV2Po.COLUMNS.LEVEL5.name()))); 
			expV2Po.setDiscount5(BigDecimalUtils.formObj(dataObject.getValue(ExpV2Po.COLUMNS.DISCOUNT5.name()))); 
			return expV2Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final ExpV2Po expV2Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ExpV2Po.COLUMNS.EXPRESSID.name(), expV2Po.getExpressid()); 
			dataObject.setValue(ExpV2Po.COLUMNS.EXPRESSCNAME.name(), expV2Po.getExpresscname()); 
			dataObject.setValue(ExpV2Po.COLUMNS.EXPRESSENAME.name(), expV2Po.getExpressename()); 
			dataObject.setValue(ExpV2Po.COLUMNS.BAN.name(), expV2Po.getBan()); 
			dataObject.setValue(ExpV2Po.COLUMNS.BOXNO.name(), expV2Po.getBoxno()); 
			dataObject.setValue(ExpV2Po.COLUMNS.CHARGEBOX.name(), expV2Po.getChargebox()); 
			dataObject.setValue(ExpV2Po.COLUMNS.GUARANTEE.name(), expV2Po.getGuarantee()); 
			dataObject.setValue(ExpV2Po.COLUMNS.BASELINE.name(), expV2Po.getBaseline()); 
			dataObject.setValue(ExpV2Po.COLUMNS.LOWERESTLINE.name(), expV2Po.getLowerestline()); 
			dataObject.setValue(ExpV2Po.COLUMNS.GUARANTEEBASE.name(), expV2Po.getGuaranteebase()); 
			dataObject.setValue(ExpV2Po.COLUMNS.EHUACCOUNT.name(), expV2Po.getEhuaccount()); 
			dataObject.setValue(ExpV2Po.COLUMNS.OBCACCOUNT.name(), expV2Po.getObcaccount()); 
			dataObject.setValue(ExpV2Po.COLUMNS.DISCOUNTTYPE.name(), expV2Po.getDiscounttype()); 
			dataObject.setValue(ExpV2Po.COLUMNS.LEVEL1.name(), expV2Po.getLevel1()); 
			dataObject.setValue(ExpV2Po.COLUMNS.DISCOUNT1.name(), expV2Po.getDiscount1()); 
			dataObject.setValue(ExpV2Po.COLUMNS.LEVEL2.name(), expV2Po.getLevel2()); 
			dataObject.setValue(ExpV2Po.COLUMNS.DISCOUNT2.name(), expV2Po.getDiscount2()); 
			dataObject.setValue(ExpV2Po.COLUMNS.LEVEL3.name(), expV2Po.getLevel3()); 
			dataObject.setValue(ExpV2Po.COLUMNS.DISCOUNT3.name(), expV2Po.getDiscount3()); 
			dataObject.setValue(ExpV2Po.COLUMNS.LEVEL4.name(), expV2Po.getLevel4()); 
			dataObject.setValue(ExpV2Po.COLUMNS.DISCOUNT4.name(), expV2Po.getDiscount4()); 
			dataObject.setValue(ExpV2Po.COLUMNS.LEVEL5.name(), expV2Po.getLevel5()); 
			dataObject.setValue(ExpV2Po.COLUMNS.DISCOUNT5.name(), expV2Po.getDiscount5()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ExpV2Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ExpV2Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
