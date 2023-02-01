package com.doc.common.dao.impl; 
 
public class InvtryrptDAOImpl extends GeneralDAOImpl<InvtryrptPo> implements InvtryrptDAO { 
	public static final InvtryrptDAOImpl INSTANCE = new InvtryrptDAOImpl(); 
	public static final String TABLENAME = "INVTRYRPT"; 

	public InvtryrptDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<InvtryrptPo> CONVERTER = new MapConverter<InvtryrptPo>() { 
 
		@Override 
		public InvtryrptPo convert(final DataObject dataObject) { 
			final InvtryrptPo invtryrptPo = new InvtryrptPo(); 
			invtryrptPo.setBfNo(dataObject.getString(InvtryrptPo.COLUMNS.BF_NO.name())); 
			invtryrptPo.setInvYear(dataObject.getString(InvtryrptPo.COLUMNS.INV_YEAR.name())); 
			invtryrptPo.setInvItem(BigDecimalUtils.formObj(dataObject.getValue(InvtryrptPo.COLUMNS.INV_ITEM.name()))); 
			invtryrptPo.setCommodityNo(dataObject.getString(InvtryrptPo.COLUMNS.COMMODITY_NO.name())); 
			invtryrptPo.setGoodType(dataObject.getString(InvtryrptPo.COLUMNS.GOOD_TYPE.name())); 
			invtryrptPo.setGoodKind(dataObject.getString(InvtryrptPo.COLUMNS.GOOD_KIND.name())); 
			invtryrptPo.setGoodUnit(dataObject.getString(InvtryrptPo.COLUMNS.GOOD_UNIT.name())); 
			invtryrptPo.setGoodsSpec(dataObject.getString(InvtryrptPo.COLUMNS.GOODS_SPEC.name())); 
			invtryrptPo.setGoodsModel(dataObject.getString(InvtryrptPo.COLUMNS.GOODS_MODEL.name())); 
			invtryrptPo.setGoodsDesc(dataObject.getString(InvtryrptPo.COLUMNS.GOODS_DESC.name())); 
			invtryrptPo.setModifyDate(dataObject.getString(InvtryrptPo.COLUMNS.MODIFY_DATE.name())); 
			invtryrptPo.setLastuntaxQty(BigDecimalUtils.formObj(dataObject.getValue(InvtryrptPo.COLUMNS.LASTUNTAX_QTY.name()))); 
			invtryrptPo.setUntaxQty(BigDecimalUtils.formObj(dataObject.getValue(InvtryrptPo.COLUMNS.UNTAX_QTY.name()))); 
			invtryrptPo.setLasttaxQty(BigDecimalUtils.formObj(dataObject.getValue(InvtryrptPo.COLUMNS.LASTTAX_QTY.name()))); 
			invtryrptPo.setTaxQty(BigDecimalUtils.formObj(dataObject.getValue(InvtryrptPo.COLUMNS.TAX_QTY.name()))); 
			invtryrptPo.setOut5Qty(BigDecimalUtils.formObj(dataObject.getValue(InvtryrptPo.COLUMNS.OUT5_QTY.name()))); 
			invtryrptPo.setOut6Qty(BigDecimalUtils.formObj(dataObject.getValue(InvtryrptPo.COLUMNS.OUT6_QTY.name()))); 
			invtryrptPo.setOut7Qty(BigDecimalUtils.formObj(dataObject.getValue(InvtryrptPo.COLUMNS.OUT7_QTY.name()))); 
			invtryrptPo.setOut8Qty(BigDecimalUtils.formObj(dataObject.getValue(InvtryrptPo.COLUMNS.OUT8_QTY.name()))); 
			invtryrptPo.setOut9Qty(BigDecimalUtils.formObj(dataObject.getValue(InvtryrptPo.COLUMNS.OUT9_QTY.name()))); 
			invtryrptPo.setOut10Qty(BigDecimalUtils.formObj(dataObject.getValue(InvtryrptPo.COLUMNS.OUT10_QTY.name()))); 
			invtryrptPo.setBookQty(BigDecimalUtils.formObj(dataObject.getValue(InvtryrptPo.COLUMNS.BOOK_QTY.name()))); 
			invtryrptPo.setInvQty(BigDecimalUtils.formObj(dataObject.getValue(InvtryrptPo.COLUMNS.INV_QTY.name()))); 
			invtryrptPo.setEarnQty(BigDecimalUtils.formObj(dataObject.getValue(InvtryrptPo.COLUMNS.EARN_QTY.name()))); 
			invtryrptPo.setLostQty(BigDecimalUtils.formObj(dataObject.getValue(InvtryrptPo.COLUMNS.LOST_QTY.name()))); 
			invtryrptPo.setAllowmissRate(BigDecimalUtils.formObj(dataObject.getValue(InvtryrptPo.COLUMNS.ALLOWMISS_RATE.name()))); 
			invtryrptPo.setAllowmissQty(BigDecimalUtils.formObj(dataObject.getValue(InvtryrptPo.COLUMNS.ALLOWMISS_QTY.name()))); 
			invtryrptPo.setPaytaxQty(BigDecimalUtils.formObj(dataObject.getValue(InvtryrptPo.COLUMNS.PAYTAX_QTY.name()))); 
			invtryrptPo.setNextuntaxQty(BigDecimalUtils.formObj(dataObject.getValue(InvtryrptPo.COLUMNS.NEXTUNTAX_QTY.name()))); 
			invtryrptPo.setNexttaxQty(BigDecimalUtils.formObj(dataObject.getValue(InvtryrptPo.COLUMNS.NEXTTAX_QTY.name()))); 
			invtryrptPo.setRemark(dataObject.getString(InvtryrptPo.COLUMNS.REMARK.name())); 
			invtryrptPo.setInout(dataObject.getString(InvtryrptPo.COLUMNS.INOUT.name())); 
			invtryrptPo.setCtmCode(dataObject.getString(InvtryrptPo.COLUMNS.CTM_CODE.name())); 
			invtryrptPo.setCocompNo(dataObject.getString(InvtryrptPo.COLUMNS.COCOMP_NO.name())); 
			invtryrptPo.setRtnCode(BigDecimalUtils.formObj(dataObject.getValue(InvtryrptPo.COLUMNS.RTN_CODE.name()))); 
			invtryrptPo.setErrCode(BigDecimalUtils.formObj(dataObject.getValue(InvtryrptPo.COLUMNS.ERR_CODE.name()))); 
			invtryrptPo.setErrDesc(dataObject.getString(InvtryrptPo.COLUMNS.ERR_DESC.name())); 
			invtryrptPo.setInvDate(dataObject.getString(InvtryrptPo.COLUMNS.INV_DATE.name())); 
			return invtryrptPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final InvtryrptPo invtryrptPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(InvtryrptPo.COLUMNS.BF_NO.name(), invtryrptPo.getBfNo()); 
			dataObject.setValue(InvtryrptPo.COLUMNS.INV_YEAR.name(), invtryrptPo.getInvYear()); 
			dataObject.setValue(InvtryrptPo.COLUMNS.INV_ITEM.name(), invtryrptPo.getInvItem()); 
			dataObject.setValue(InvtryrptPo.COLUMNS.COMMODITY_NO.name(), invtryrptPo.getCommodityNo()); 
			dataObject.setValue(InvtryrptPo.COLUMNS.GOOD_TYPE.name(), invtryrptPo.getGoodType()); 
			dataObject.setValue(InvtryrptPo.COLUMNS.GOOD_KIND.name(), invtryrptPo.getGoodKind()); 
			dataObject.setValue(InvtryrptPo.COLUMNS.GOOD_UNIT.name(), invtryrptPo.getGoodUnit()); 
			dataObject.setValue(InvtryrptPo.COLUMNS.GOODS_SPEC.name(), invtryrptPo.getGoodsSpec()); 
			dataObject.setValue(InvtryrptPo.COLUMNS.GOODS_MODEL.name(), invtryrptPo.getGoodsModel()); 
			dataObject.setValue(InvtryrptPo.COLUMNS.GOODS_DESC.name(), invtryrptPo.getGoodsDesc()); 
			dataObject.setValue(InvtryrptPo.COLUMNS.MODIFY_DATE.name(), invtryrptPo.getModifyDate()); 
			dataObject.setValue(InvtryrptPo.COLUMNS.LASTUNTAX_QTY.name(), invtryrptPo.getLastuntaxQty()); 
			dataObject.setValue(InvtryrptPo.COLUMNS.UNTAX_QTY.name(), invtryrptPo.getUntaxQty()); 
			dataObject.setValue(InvtryrptPo.COLUMNS.LASTTAX_QTY.name(), invtryrptPo.getLasttaxQty()); 
			dataObject.setValue(InvtryrptPo.COLUMNS.TAX_QTY.name(), invtryrptPo.getTaxQty()); 
			dataObject.setValue(InvtryrptPo.COLUMNS.OUT5_QTY.name(), invtryrptPo.getOut5Qty()); 
			dataObject.setValue(InvtryrptPo.COLUMNS.OUT6_QTY.name(), invtryrptPo.getOut6Qty()); 
			dataObject.setValue(InvtryrptPo.COLUMNS.OUT7_QTY.name(), invtryrptPo.getOut7Qty()); 
			dataObject.setValue(InvtryrptPo.COLUMNS.OUT8_QTY.name(), invtryrptPo.getOut8Qty()); 
			dataObject.setValue(InvtryrptPo.COLUMNS.OUT9_QTY.name(), invtryrptPo.getOut9Qty()); 
			dataObject.setValue(InvtryrptPo.COLUMNS.OUT10_QTY.name(), invtryrptPo.getOut10Qty()); 
			dataObject.setValue(InvtryrptPo.COLUMNS.BOOK_QTY.name(), invtryrptPo.getBookQty()); 
			dataObject.setValue(InvtryrptPo.COLUMNS.INV_QTY.name(), invtryrptPo.getInvQty()); 
			dataObject.setValue(InvtryrptPo.COLUMNS.EARN_QTY.name(), invtryrptPo.getEarnQty()); 
			dataObject.setValue(InvtryrptPo.COLUMNS.LOST_QTY.name(), invtryrptPo.getLostQty()); 
			dataObject.setValue(InvtryrptPo.COLUMNS.ALLOWMISS_RATE.name(), invtryrptPo.getAllowmissRate()); 
			dataObject.setValue(InvtryrptPo.COLUMNS.ALLOWMISS_QTY.name(), invtryrptPo.getAllowmissQty()); 
			dataObject.setValue(InvtryrptPo.COLUMNS.PAYTAX_QTY.name(), invtryrptPo.getPaytaxQty()); 
			dataObject.setValue(InvtryrptPo.COLUMNS.NEXTUNTAX_QTY.name(), invtryrptPo.getNextuntaxQty()); 
			dataObject.setValue(InvtryrptPo.COLUMNS.NEXTTAX_QTY.name(), invtryrptPo.getNexttaxQty()); 
			dataObject.setValue(InvtryrptPo.COLUMNS.REMARK.name(), invtryrptPo.getRemark()); 
			dataObject.setValue(InvtryrptPo.COLUMNS.INOUT.name(), invtryrptPo.getInout()); 
			dataObject.setValue(InvtryrptPo.COLUMNS.CTM_CODE.name(), invtryrptPo.getCtmCode()); 
			dataObject.setValue(InvtryrptPo.COLUMNS.COCOMP_NO.name(), invtryrptPo.getCocompNo()); 
			dataObject.setValue(InvtryrptPo.COLUMNS.RTN_CODE.name(), invtryrptPo.getRtnCode()); 
			dataObject.setValue(InvtryrptPo.COLUMNS.ERR_CODE.name(), invtryrptPo.getErrCode()); 
			dataObject.setValue(InvtryrptPo.COLUMNS.ERR_DESC.name(), invtryrptPo.getErrDesc()); 
			dataObject.setValue(InvtryrptPo.COLUMNS.INV_DATE.name(), invtryrptPo.getInvDate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<InvtryrptPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(InvtryrptPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
