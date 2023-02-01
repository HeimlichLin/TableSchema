package com.doc.common.dao.impl; 
 
public class OinvtryrptDAOImpl extends GeneralDAOImpl<OinvtryrptPo> implements OinvtryrptDAO { 
	public static final OinvtryrptDAOImpl INSTANCE = new OinvtryrptDAOImpl(); 
	public static final String TABLENAME = "OINVTRYRPT"; 

	public OinvtryrptDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<OinvtryrptPo> CONVERTER = new MapConverter<OinvtryrptPo>() { 
 
		@Override 
		public OinvtryrptPo convert(final DataObject dataObject) { 
			final OinvtryrptPo oinvtryrptPo = new OinvtryrptPo(); 
			oinvtryrptPo.setBfNo(dataObject.getString(OinvtryrptPo.COLUMNS.BF_NO.name())); 
			oinvtryrptPo.setInvYear(BigDecimalUtils.formObj(dataObject.getValue(OinvtryrptPo.COLUMNS.INV_YEAR.name()))); 
			oinvtryrptPo.setInvItem(BigDecimalUtils.formObj(dataObject.getValue(OinvtryrptPo.COLUMNS.INV_ITEM.name()))); 
			oinvtryrptPo.setCommodityNo(dataObject.getString(OinvtryrptPo.COLUMNS.COMMODITY_NO.name())); 
			oinvtryrptPo.setGoodUnit(dataObject.getString(OinvtryrptPo.COLUMNS.GOOD_UNIT.name())); 
			oinvtryrptPo.setGoodsDesc(dataObject.getString(OinvtryrptPo.COLUMNS.GOODS_DESC.name())); 
			oinvtryrptPo.setLastQty(BigDecimalUtils.formObj(dataObject.getValue(OinvtryrptPo.COLUMNS.LAST_QTY.name()))); 
			oinvtryrptPo.setQty(BigDecimalUtils.formObj(dataObject.getValue(OinvtryrptPo.COLUMNS.QTY.name()))); 
			oinvtryrptPo.setOut1Qty(BigDecimalUtils.formObj(dataObject.getValue(OinvtryrptPo.COLUMNS.OUT1_QTY.name()))); 
			oinvtryrptPo.setOut2Qty(BigDecimalUtils.formObj(dataObject.getValue(OinvtryrptPo.COLUMNS.OUT2_QTY.name()))); 
			oinvtryrptPo.setOut3Qty(BigDecimalUtils.formObj(dataObject.getValue(OinvtryrptPo.COLUMNS.OUT3_QTY.name()))); 
			oinvtryrptPo.setOut4Qty(BigDecimalUtils.formObj(dataObject.getValue(OinvtryrptPo.COLUMNS.OUT4_QTY.name()))); 
			oinvtryrptPo.setOut5Qty(BigDecimalUtils.formObj(dataObject.getValue(OinvtryrptPo.COLUMNS.OUT5_QTY.name()))); 
			oinvtryrptPo.setOut6Qty(BigDecimalUtils.formObj(dataObject.getValue(OinvtryrptPo.COLUMNS.OUT6_QTY.name()))); 
			oinvtryrptPo.setBookQty(BigDecimalUtils.formObj(dataObject.getValue(OinvtryrptPo.COLUMNS.BOOK_QTY.name()))); 
			oinvtryrptPo.setInvQty(BigDecimalUtils.formObj(dataObject.getValue(OinvtryrptPo.COLUMNS.INV_QTY.name()))); 
			oinvtryrptPo.setEarnQty(BigDecimalUtils.formObj(dataObject.getValue(OinvtryrptPo.COLUMNS.EARN_QTY.name()))); 
			oinvtryrptPo.setLostQty(BigDecimalUtils.formObj(dataObject.getValue(OinvtryrptPo.COLUMNS.LOST_QTY.name()))); 
			oinvtryrptPo.setAllowmissRate(BigDecimalUtils.formObj(dataObject.getValue(OinvtryrptPo.COLUMNS.ALLOWMISS_RATE.name()))); 
			oinvtryrptPo.setAllowmissQty(BigDecimalUtils.formObj(dataObject.getValue(OinvtryrptPo.COLUMNS.ALLOWMISS_QTY.name()))); 
			oinvtryrptPo.setPaytaxQty(BigDecimalUtils.formObj(dataObject.getValue(OinvtryrptPo.COLUMNS.PAYTAX_QTY.name()))); 
			oinvtryrptPo.setNextQty(BigDecimalUtils.formObj(dataObject.getValue(OinvtryrptPo.COLUMNS.NEXT_QTY.name()))); 
			oinvtryrptPo.setRemark(dataObject.getString(OinvtryrptPo.COLUMNS.REMARK.name())); 
			oinvtryrptPo.setCtmCode(dataObject.getString(OinvtryrptPo.COLUMNS.CTM_CODE.name())); 
			oinvtryrptPo.setCocompNo(dataObject.getString(OinvtryrptPo.COLUMNS.COCOMP_NO.name())); 
			oinvtryrptPo.setInvDate(dataObject.getString(OinvtryrptPo.COLUMNS.INV_DATE.name())); 
			return oinvtryrptPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final OinvtryrptPo oinvtryrptPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(OinvtryrptPo.COLUMNS.BF_NO.name(), oinvtryrptPo.getBfNo()); 
			dataObject.setValue(OinvtryrptPo.COLUMNS.INV_YEAR.name(), oinvtryrptPo.getInvYear()); 
			dataObject.setValue(OinvtryrptPo.COLUMNS.INV_ITEM.name(), oinvtryrptPo.getInvItem()); 
			dataObject.setValue(OinvtryrptPo.COLUMNS.COMMODITY_NO.name(), oinvtryrptPo.getCommodityNo()); 
			dataObject.setValue(OinvtryrptPo.COLUMNS.GOOD_UNIT.name(), oinvtryrptPo.getGoodUnit()); 
			dataObject.setValue(OinvtryrptPo.COLUMNS.GOODS_DESC.name(), oinvtryrptPo.getGoodsDesc()); 
			dataObject.setValue(OinvtryrptPo.COLUMNS.LAST_QTY.name(), oinvtryrptPo.getLastQty()); 
			dataObject.setValue(OinvtryrptPo.COLUMNS.QTY.name(), oinvtryrptPo.getQty()); 
			dataObject.setValue(OinvtryrptPo.COLUMNS.OUT1_QTY.name(), oinvtryrptPo.getOut1Qty()); 
			dataObject.setValue(OinvtryrptPo.COLUMNS.OUT2_QTY.name(), oinvtryrptPo.getOut2Qty()); 
			dataObject.setValue(OinvtryrptPo.COLUMNS.OUT3_QTY.name(), oinvtryrptPo.getOut3Qty()); 
			dataObject.setValue(OinvtryrptPo.COLUMNS.OUT4_QTY.name(), oinvtryrptPo.getOut4Qty()); 
			dataObject.setValue(OinvtryrptPo.COLUMNS.OUT5_QTY.name(), oinvtryrptPo.getOut5Qty()); 
			dataObject.setValue(OinvtryrptPo.COLUMNS.OUT6_QTY.name(), oinvtryrptPo.getOut6Qty()); 
			dataObject.setValue(OinvtryrptPo.COLUMNS.BOOK_QTY.name(), oinvtryrptPo.getBookQty()); 
			dataObject.setValue(OinvtryrptPo.COLUMNS.INV_QTY.name(), oinvtryrptPo.getInvQty()); 
			dataObject.setValue(OinvtryrptPo.COLUMNS.EARN_QTY.name(), oinvtryrptPo.getEarnQty()); 
			dataObject.setValue(OinvtryrptPo.COLUMNS.LOST_QTY.name(), oinvtryrptPo.getLostQty()); 
			dataObject.setValue(OinvtryrptPo.COLUMNS.ALLOWMISS_RATE.name(), oinvtryrptPo.getAllowmissRate()); 
			dataObject.setValue(OinvtryrptPo.COLUMNS.ALLOWMISS_QTY.name(), oinvtryrptPo.getAllowmissQty()); 
			dataObject.setValue(OinvtryrptPo.COLUMNS.PAYTAX_QTY.name(), oinvtryrptPo.getPaytaxQty()); 
			dataObject.setValue(OinvtryrptPo.COLUMNS.NEXT_QTY.name(), oinvtryrptPo.getNextQty()); 
			dataObject.setValue(OinvtryrptPo.COLUMNS.REMARK.name(), oinvtryrptPo.getRemark()); 
			dataObject.setValue(OinvtryrptPo.COLUMNS.CTM_CODE.name(), oinvtryrptPo.getCtmCode()); 
			dataObject.setValue(OinvtryrptPo.COLUMNS.COCOMP_NO.name(), oinvtryrptPo.getCocompNo()); 
			dataObject.setValue(OinvtryrptPo.COLUMNS.INV_DATE.name(), oinvtryrptPo.getInvDate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<OinvtryrptPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(OinvtryrptPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
