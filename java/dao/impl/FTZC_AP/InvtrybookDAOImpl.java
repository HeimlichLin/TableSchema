package com.doc.common.dao.impl; 
 
public class InvtrybookDAOImpl extends GeneralDAOImpl<InvtrybookPo> implements InvtrybookDAO { 
	public static final InvtrybookDAOImpl INSTANCE = new InvtrybookDAOImpl(); 
	public static final String TABLENAME = "INVTRYBOOK"; 

	public InvtrybookDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<InvtrybookPo> CONVERTER = new MapConverter<InvtrybookPo>() { 
 
		@Override 
		public InvtrybookPo convert(final DataObject dataObject) { 
			final InvtrybookPo invtrybookPo = new InvtrybookPo(); 
			invtrybookPo.setBfNo(dataObject.getString(InvtrybookPo.COLUMNS.BF_NO.name())); 
			invtrybookPo.setInvYear(dataObject.getString(InvtrybookPo.COLUMNS.INV_YEAR.name())); 
			invtrybookPo.setInvItem(dataObject.getString(InvtrybookPo.COLUMNS.INV_ITEM.name())); 
			invtrybookPo.setInStorageArea(dataObject.getString(InvtrybookPo.COLUMNS.IN_STORAGE_AREA.name())); 
			invtrybookPo.setCommodityNo(dataObject.getString(InvtrybookPo.COLUMNS.COMMODITY_NO.name())); 
			invtrybookPo.setCardNo(dataObject.getString(InvtrybookPo.COLUMNS.CARD_NO.name())); 
			invtrybookPo.setGoodType(dataObject.getString(InvtrybookPo.COLUMNS.GOOD_TYPE.name())); 
			invtrybookPo.setGoodKind(dataObject.getString(InvtrybookPo.COLUMNS.GOOD_KIND.name())); 
			invtrybookPo.setGoodUnit(dataObject.getString(InvtrybookPo.COLUMNS.GOOD_UNIT.name())); 
			invtrybookPo.setGoodsSpec(dataObject.getString(InvtrybookPo.COLUMNS.GOODS_SPEC.name())); 
			invtrybookPo.setGoodsModel(dataObject.getString(InvtrybookPo.COLUMNS.GOODS_MODEL.name())); 
			invtrybookPo.setGoodsDesc(dataObject.getString(InvtrybookPo.COLUMNS.GOODS_DESC.name())); 
			invtrybookPo.setModifyDate(dataObject.getString(InvtrybookPo.COLUMNS.MODIFY_DATE.name())); 
			invtrybookPo.setInvDate(dataObject.getString(InvtrybookPo.COLUMNS.INV_DATE.name())); 
			invtrybookPo.setInvQty(BigDecimalUtils.formObj(dataObject.getValue(InvtrybookPo.COLUMNS.INV_QTY.name()))); 
			invtrybookPo.setBookQty(BigDecimalUtils.formObj(dataObject.getValue(InvtrybookPo.COLUMNS.BOOK_QTY.name()))); 
			invtrybookPo.setRemark(dataObject.getString(InvtrybookPo.COLUMNS.REMARK.name())); 
			invtrybookPo.setBomNo(dataObject.getString(InvtrybookPo.COLUMNS.BOM_NO.name())); 
			invtrybookPo.setBomDate(dataObject.getString(InvtrybookPo.COLUMNS.BOM_DATE.name())); 
			invtrybookPo.setArea(dataObject.getString(InvtrybookPo.COLUMNS.AREA.name())); 
			invtrybookPo.setBomVer(dataObject.getString(InvtrybookPo.COLUMNS.BOM_VER.name())); 
			invtrybookPo.setInout(dataObject.getString(InvtrybookPo.COLUMNS.INOUT.name())); 
			invtrybookPo.setCtmCode(dataObject.getString(InvtrybookPo.COLUMNS.CTM_CODE.name())); 
			invtrybookPo.setCocompNo(dataObject.getString(InvtrybookPo.COLUMNS.COCOMP_NO.name())); 
			invtrybookPo.setChecker1(dataObject.getString(InvtrybookPo.COLUMNS.CHECKER1.name())); 
			invtrybookPo.setChecker2(dataObject.getString(InvtrybookPo.COLUMNS.CHECKER2.name())); 
			invtrybookPo.setChecker3(dataObject.getString(InvtrybookPo.COLUMNS.CHECKER3.name())); 
			return invtrybookPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final InvtrybookPo invtrybookPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(InvtrybookPo.COLUMNS.BF_NO.name(), invtrybookPo.getBfNo()); 
			dataObject.setValue(InvtrybookPo.COLUMNS.INV_YEAR.name(), invtrybookPo.getInvYear()); 
			dataObject.setValue(InvtrybookPo.COLUMNS.INV_ITEM.name(), invtrybookPo.getInvItem()); 
			dataObject.setValue(InvtrybookPo.COLUMNS.IN_STORAGE_AREA.name(), invtrybookPo.getInStorageArea()); 
			dataObject.setValue(InvtrybookPo.COLUMNS.COMMODITY_NO.name(), invtrybookPo.getCommodityNo()); 
			dataObject.setValue(InvtrybookPo.COLUMNS.CARD_NO.name(), invtrybookPo.getCardNo()); 
			dataObject.setValue(InvtrybookPo.COLUMNS.GOOD_TYPE.name(), invtrybookPo.getGoodType()); 
			dataObject.setValue(InvtrybookPo.COLUMNS.GOOD_KIND.name(), invtrybookPo.getGoodKind()); 
			dataObject.setValue(InvtrybookPo.COLUMNS.GOOD_UNIT.name(), invtrybookPo.getGoodUnit()); 
			dataObject.setValue(InvtrybookPo.COLUMNS.GOODS_SPEC.name(), invtrybookPo.getGoodsSpec()); 
			dataObject.setValue(InvtrybookPo.COLUMNS.GOODS_MODEL.name(), invtrybookPo.getGoodsModel()); 
			dataObject.setValue(InvtrybookPo.COLUMNS.GOODS_DESC.name(), invtrybookPo.getGoodsDesc()); 
			dataObject.setValue(InvtrybookPo.COLUMNS.MODIFY_DATE.name(), invtrybookPo.getModifyDate()); 
			dataObject.setValue(InvtrybookPo.COLUMNS.INV_DATE.name(), invtrybookPo.getInvDate()); 
			dataObject.setValue(InvtrybookPo.COLUMNS.INV_QTY.name(), invtrybookPo.getInvQty()); 
			dataObject.setValue(InvtrybookPo.COLUMNS.BOOK_QTY.name(), invtrybookPo.getBookQty()); 
			dataObject.setValue(InvtrybookPo.COLUMNS.REMARK.name(), invtrybookPo.getRemark()); 
			dataObject.setValue(InvtrybookPo.COLUMNS.BOM_NO.name(), invtrybookPo.getBomNo()); 
			dataObject.setValue(InvtrybookPo.COLUMNS.BOM_DATE.name(), invtrybookPo.getBomDate()); 
			dataObject.setValue(InvtrybookPo.COLUMNS.AREA.name(), invtrybookPo.getArea()); 
			dataObject.setValue(InvtrybookPo.COLUMNS.BOM_VER.name(), invtrybookPo.getBomVer()); 
			dataObject.setValue(InvtrybookPo.COLUMNS.INOUT.name(), invtrybookPo.getInout()); 
			dataObject.setValue(InvtrybookPo.COLUMNS.CTM_CODE.name(), invtrybookPo.getCtmCode()); 
			dataObject.setValue(InvtrybookPo.COLUMNS.COCOMP_NO.name(), invtrybookPo.getCocompNo()); 
			dataObject.setValue(InvtrybookPo.COLUMNS.CHECKER1.name(), invtrybookPo.getChecker1()); 
			dataObject.setValue(InvtrybookPo.COLUMNS.CHECKER2.name(), invtrybookPo.getChecker2()); 
			dataObject.setValue(InvtrybookPo.COLUMNS.CHECKER3.name(), invtrybookPo.getChecker3()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<InvtrybookPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(InvtrybookPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
