package com.doc.common.dao.impl; 
 
public class PreInvtrybookDAOImpl extends GeneralDAOImpl<PreInvtrybookPo> implements PreInvtrybookDAO { 
	public static final PreInvtrybookDAOImpl INSTANCE = new PreInvtrybookDAOImpl(); 
	public static final String TABLENAME = "PRE_INVTRYBOOK"; 

	public PreInvtrybookDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<PreInvtrybookPo> CONVERTER = new MapConverter<PreInvtrybookPo>() { 
 
		@Override 
		public PreInvtrybookPo convert(final DataObject dataObject) { 
			final PreInvtrybookPo preInvtrybookPo = new PreInvtrybookPo(); 
			preInvtrybookPo.setBfNo(dataObject.getString(PreInvtrybookPo.COLUMNS.BF_NO.name())); 
			preInvtrybookPo.setInvYear(dataObject.getString(PreInvtrybookPo.COLUMNS.INV_YEAR.name())); 
			preInvtrybookPo.setInvItem(dataObject.getString(PreInvtrybookPo.COLUMNS.INV_ITEM.name())); 
			preInvtrybookPo.setInStorageArea(dataObject.getString(PreInvtrybookPo.COLUMNS.IN_STORAGE_AREA.name())); 
			preInvtrybookPo.setCommodityNo(dataObject.getString(PreInvtrybookPo.COLUMNS.COMMODITY_NO.name())); 
			preInvtrybookPo.setCardNo(dataObject.getString(PreInvtrybookPo.COLUMNS.CARD_NO.name())); 
			preInvtrybookPo.setGoodType(dataObject.getString(PreInvtrybookPo.COLUMNS.GOOD_TYPE.name())); 
			preInvtrybookPo.setGoodKind(dataObject.getString(PreInvtrybookPo.COLUMNS.GOOD_KIND.name())); 
			preInvtrybookPo.setGoodUnit(dataObject.getString(PreInvtrybookPo.COLUMNS.GOOD_UNIT.name())); 
			preInvtrybookPo.setGoodsSpec(dataObject.getString(PreInvtrybookPo.COLUMNS.GOODS_SPEC.name())); 
			preInvtrybookPo.setGoodsModel(dataObject.getString(PreInvtrybookPo.COLUMNS.GOODS_MODEL.name())); 
			preInvtrybookPo.setGoodsDesc(dataObject.getString(PreInvtrybookPo.COLUMNS.GOODS_DESC.name())); 
			preInvtrybookPo.setModifyDate(dataObject.getString(PreInvtrybookPo.COLUMNS.MODIFY_DATE.name())); 
			preInvtrybookPo.setInvDate(dataObject.getString(PreInvtrybookPo.COLUMNS.INV_DATE.name())); 
			preInvtrybookPo.setInvQty(BigDecimalUtils.formObj(dataObject.getValue(PreInvtrybookPo.COLUMNS.INV_QTY.name()))); 
			preInvtrybookPo.setBookQty(BigDecimalUtils.formObj(dataObject.getValue(PreInvtrybookPo.COLUMNS.BOOK_QTY.name()))); 
			preInvtrybookPo.setRemark(dataObject.getString(PreInvtrybookPo.COLUMNS.REMARK.name())); 
			preInvtrybookPo.setBomNo(dataObject.getString(PreInvtrybookPo.COLUMNS.BOM_NO.name())); 
			preInvtrybookPo.setBomDate(dataObject.getString(PreInvtrybookPo.COLUMNS.BOM_DATE.name())); 
			preInvtrybookPo.setArea(dataObject.getString(PreInvtrybookPo.COLUMNS.AREA.name())); 
			preInvtrybookPo.setBomVer(dataObject.getString(PreInvtrybookPo.COLUMNS.BOM_VER.name())); 
			preInvtrybookPo.setInout(dataObject.getString(PreInvtrybookPo.COLUMNS.INOUT.name())); 
			preInvtrybookPo.setCtmCode(dataObject.getString(PreInvtrybookPo.COLUMNS.CTM_CODE.name())); 
			preInvtrybookPo.setCocompNo(dataObject.getString(PreInvtrybookPo.COLUMNS.COCOMP_NO.name())); 
			preInvtrybookPo.setInGuid(dataObject.getString(PreInvtrybookPo.COLUMNS.IN_GUID.name())); 
			preInvtrybookPo.setInNo(dataObject.getString(PreInvtrybookPo.COLUMNS.IN_NO.name())); 
			preInvtrybookPo.setOpCode(dataObject.getString(PreInvtrybookPo.COLUMNS.OP_CODE.name())); 
			return preInvtrybookPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final PreInvtrybookPo preInvtrybookPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(PreInvtrybookPo.COLUMNS.BF_NO.name(), preInvtrybookPo.getBfNo()); 
			dataObject.setValue(PreInvtrybookPo.COLUMNS.INV_YEAR.name(), preInvtrybookPo.getInvYear()); 
			dataObject.setValue(PreInvtrybookPo.COLUMNS.INV_ITEM.name(), preInvtrybookPo.getInvItem()); 
			dataObject.setValue(PreInvtrybookPo.COLUMNS.IN_STORAGE_AREA.name(), preInvtrybookPo.getInStorageArea()); 
			dataObject.setValue(PreInvtrybookPo.COLUMNS.COMMODITY_NO.name(), preInvtrybookPo.getCommodityNo()); 
			dataObject.setValue(PreInvtrybookPo.COLUMNS.CARD_NO.name(), preInvtrybookPo.getCardNo()); 
			dataObject.setValue(PreInvtrybookPo.COLUMNS.GOOD_TYPE.name(), preInvtrybookPo.getGoodType()); 
			dataObject.setValue(PreInvtrybookPo.COLUMNS.GOOD_KIND.name(), preInvtrybookPo.getGoodKind()); 
			dataObject.setValue(PreInvtrybookPo.COLUMNS.GOOD_UNIT.name(), preInvtrybookPo.getGoodUnit()); 
			dataObject.setValue(PreInvtrybookPo.COLUMNS.GOODS_SPEC.name(), preInvtrybookPo.getGoodsSpec()); 
			dataObject.setValue(PreInvtrybookPo.COLUMNS.GOODS_MODEL.name(), preInvtrybookPo.getGoodsModel()); 
			dataObject.setValue(PreInvtrybookPo.COLUMNS.GOODS_DESC.name(), preInvtrybookPo.getGoodsDesc()); 
			dataObject.setValue(PreInvtrybookPo.COLUMNS.MODIFY_DATE.name(), preInvtrybookPo.getModifyDate()); 
			dataObject.setValue(PreInvtrybookPo.COLUMNS.INV_DATE.name(), preInvtrybookPo.getInvDate()); 
			dataObject.setValue(PreInvtrybookPo.COLUMNS.INV_QTY.name(), preInvtrybookPo.getInvQty()); 
			dataObject.setValue(PreInvtrybookPo.COLUMNS.BOOK_QTY.name(), preInvtrybookPo.getBookQty()); 
			dataObject.setValue(PreInvtrybookPo.COLUMNS.REMARK.name(), preInvtrybookPo.getRemark()); 
			dataObject.setValue(PreInvtrybookPo.COLUMNS.BOM_NO.name(), preInvtrybookPo.getBomNo()); 
			dataObject.setValue(PreInvtrybookPo.COLUMNS.BOM_DATE.name(), preInvtrybookPo.getBomDate()); 
			dataObject.setValue(PreInvtrybookPo.COLUMNS.AREA.name(), preInvtrybookPo.getArea()); 
			dataObject.setValue(PreInvtrybookPo.COLUMNS.BOM_VER.name(), preInvtrybookPo.getBomVer()); 
			dataObject.setValue(PreInvtrybookPo.COLUMNS.INOUT.name(), preInvtrybookPo.getInout()); 
			dataObject.setValue(PreInvtrybookPo.COLUMNS.CTM_CODE.name(), preInvtrybookPo.getCtmCode()); 
			dataObject.setValue(PreInvtrybookPo.COLUMNS.COCOMP_NO.name(), preInvtrybookPo.getCocompNo()); 
			dataObject.setValue(PreInvtrybookPo.COLUMNS.IN_GUID.name(), preInvtrybookPo.getInGuid()); 
			dataObject.setValue(PreInvtrybookPo.COLUMNS.IN_NO.name(), preInvtrybookPo.getInNo()); 
			dataObject.setValue(PreInvtrybookPo.COLUMNS.OP_CODE.name(), preInvtrybookPo.getOpCode()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<PreInvtrybookPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(PreInvtrybookPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
