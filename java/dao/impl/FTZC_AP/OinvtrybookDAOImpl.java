package com.doc.common.dao.impl; 
 
public class OinvtrybookDAOImpl extends GeneralDAOImpl<OinvtrybookPo> implements OinvtrybookDAO { 
	public static final OinvtrybookDAOImpl INSTANCE = new OinvtrybookDAOImpl(); 
	public static final String TABLENAME = "OINVTRYBOOK"; 

	public OinvtrybookDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<OinvtrybookPo> CONVERTER = new MapConverter<OinvtrybookPo>() { 
 
		@Override 
		public OinvtrybookPo convert(final DataObject dataObject) { 
			final OinvtrybookPo oinvtrybookPo = new OinvtrybookPo(); 
			oinvtrybookPo.setBfNo(dataObject.getString(OinvtrybookPo.COLUMNS.BF_NO.name())); 
			oinvtrybookPo.setInvYear(BigDecimalUtils.formObj(dataObject.getValue(OinvtrybookPo.COLUMNS.INV_YEAR.name()))); 
			oinvtrybookPo.setInvItem(BigDecimalUtils.formObj(dataObject.getValue(OinvtrybookPo.COLUMNS.INV_ITEM.name()))); 
			oinvtrybookPo.setCommodityNo(dataObject.getString(OinvtrybookPo.COLUMNS.COMMODITY_NO.name())); 
			oinvtrybookPo.setGoodUnit(dataObject.getString(OinvtrybookPo.COLUMNS.GOOD_UNIT.name())); 
			oinvtrybookPo.setInvQty(BigDecimalUtils.formObj(dataObject.getValue(OinvtrybookPo.COLUMNS.INV_QTY.name()))); 
			oinvtrybookPo.setBookQty(BigDecimalUtils.formObj(dataObject.getValue(OinvtrybookPo.COLUMNS.BOOK_QTY.name()))); 
			oinvtrybookPo.setCardNo(dataObject.getString(OinvtrybookPo.COLUMNS.CARD_NO.name())); 
			oinvtrybookPo.setGoodsDesc(dataObject.getString(OinvtrybookPo.COLUMNS.GOODS_DESC.name())); 
			oinvtrybookPo.setInvDate(dataObject.getString(OinvtrybookPo.COLUMNS.INV_DATE.name())); 
			oinvtrybookPo.setRemark(dataObject.getString(OinvtrybookPo.COLUMNS.REMARK.name())); 
			oinvtrybookPo.setArea(dataObject.getString(OinvtrybookPo.COLUMNS.AREA.name())); 
			oinvtrybookPo.setCtmCode(dataObject.getString(OinvtrybookPo.COLUMNS.CTM_CODE.name())); 
			oinvtrybookPo.setCocompNo(dataObject.getString(OinvtrybookPo.COLUMNS.COCOMP_NO.name())); 
			oinvtrybookPo.setChecker1(dataObject.getString(OinvtrybookPo.COLUMNS.CHECKER1.name())); 
			return oinvtrybookPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final OinvtrybookPo oinvtrybookPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(OinvtrybookPo.COLUMNS.BF_NO.name(), oinvtrybookPo.getBfNo()); 
			dataObject.setValue(OinvtrybookPo.COLUMNS.INV_YEAR.name(), oinvtrybookPo.getInvYear()); 
			dataObject.setValue(OinvtrybookPo.COLUMNS.INV_ITEM.name(), oinvtrybookPo.getInvItem()); 
			dataObject.setValue(OinvtrybookPo.COLUMNS.COMMODITY_NO.name(), oinvtrybookPo.getCommodityNo()); 
			dataObject.setValue(OinvtrybookPo.COLUMNS.GOOD_UNIT.name(), oinvtrybookPo.getGoodUnit()); 
			dataObject.setValue(OinvtrybookPo.COLUMNS.INV_QTY.name(), oinvtrybookPo.getInvQty()); 
			dataObject.setValue(OinvtrybookPo.COLUMNS.BOOK_QTY.name(), oinvtrybookPo.getBookQty()); 
			dataObject.setValue(OinvtrybookPo.COLUMNS.CARD_NO.name(), oinvtrybookPo.getCardNo()); 
			dataObject.setValue(OinvtrybookPo.COLUMNS.GOODS_DESC.name(), oinvtrybookPo.getGoodsDesc()); 
			dataObject.setValue(OinvtrybookPo.COLUMNS.INV_DATE.name(), oinvtrybookPo.getInvDate()); 
			dataObject.setValue(OinvtrybookPo.COLUMNS.REMARK.name(), oinvtrybookPo.getRemark()); 
			dataObject.setValue(OinvtrybookPo.COLUMNS.AREA.name(), oinvtrybookPo.getArea()); 
			dataObject.setValue(OinvtrybookPo.COLUMNS.CTM_CODE.name(), oinvtrybookPo.getCtmCode()); 
			dataObject.setValue(OinvtrybookPo.COLUMNS.COCOMP_NO.name(), oinvtrybookPo.getCocompNo()); 
			dataObject.setValue(OinvtrybookPo.COLUMNS.CHECKER1.name(), oinvtrybookPo.getChecker1()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<OinvtrybookPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(OinvtrybookPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
