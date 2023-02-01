package com.doc.common.dao.impl; 
 
public class BomdtlTDAOImpl extends GeneralDAOImpl<BomdtlTPo> implements BomdtlTDAO { 
	public static final BomdtlTDAOImpl INSTANCE = new BomdtlTDAOImpl(); 
	public static final String TABLENAME = "BOMDTL_T"; 

	public BomdtlTDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<BomdtlTPo> CONVERTER = new MapConverter<BomdtlTPo>() { 
 
		@Override 
		public BomdtlTPo convert(final DataObject dataObject) { 
			final BomdtlTPo bomdtlTPo = new BomdtlTPo(); 
			bomdtlTPo.setBfNo(dataObject.getString(BomdtlTPo.COLUMNS.BF_NO.name())); 
			bomdtlTPo.setBomNo(dataObject.getString(BomdtlTPo.COLUMNS.BOM_NO.name())); 
			bomdtlTPo.setVer(dataObject.getString(BomdtlTPo.COLUMNS.VER.name())); 
			bomdtlTPo.setParent(dataObject.getString(BomdtlTPo.COLUMNS.PARENT.name())); 
			bomdtlTPo.setItemNo(dataObject.getString(BomdtlTPo.COLUMNS.ITEM_NO.name())); 
			bomdtlTPo.setCommodityNo(dataObject.getString(BomdtlTPo.COLUMNS.COMMODITY_NO.name())); 
			bomdtlTPo.setMixQty(BigDecimalUtils.formObj(dataObject.getValue(BomdtlTPo.COLUMNS.MIX_QTY.name()))); 
			bomdtlTPo.setBadQty(BigDecimalUtils.formObj(dataObject.getValue(BomdtlTPo.COLUMNS.BAD_QTY.name()))); 
			bomdtlTPo.setUnitQty(BigDecimalUtils.formObj(dataObject.getValue(BomdtlTPo.COLUMNS.UNIT_QTY.name()))); 
			bomdtlTPo.setGoodsQty(BigDecimalUtils.formObj(dataObject.getValue(BomdtlTPo.COLUMNS.GOODS_QTY.name()))); 
			bomdtlTPo.setGoodsUnit(dataObject.getString(BomdtlTPo.COLUMNS.GOODS_UNIT.name())); 
			bomdtlTPo.setGoodsDesc(dataObject.getString(BomdtlTPo.COLUMNS.GOODS_DESC.name())); 
			bomdtlTPo.setGoodsModel(dataObject.getString(BomdtlTPo.COLUMNS.GOODS_MODEL.name())); 
			bomdtlTPo.setGoodsSpec(dataObject.getString(BomdtlTPo.COLUMNS.GOODS_SPEC.name())); 
			bomdtlTPo.setRemarks(dataObject.getString(BomdtlTPo.COLUMNS.REMARKS.name())); 
			bomdtlTPo.setMulti(dataObject.getString(BomdtlTPo.COLUMNS.MULTI.name())); 
			bomdtlTPo.setUserId(dataObject.getString(BomdtlTPo.COLUMNS.USER_ID.name())); 
			bomdtlTPo.setStartDate(dataObject.getString(BomdtlTPo.COLUMNS.START_DATE.name())); 
			bomdtlTPo.setEndDate(dataObject.getString(BomdtlTPo.COLUMNS.END_DATE.name())); 
			return bomdtlTPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final BomdtlTPo bomdtlTPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(BomdtlTPo.COLUMNS.BF_NO.name(), bomdtlTPo.getBfNo()); 
			dataObject.setValue(BomdtlTPo.COLUMNS.BOM_NO.name(), bomdtlTPo.getBomNo()); 
			dataObject.setValue(BomdtlTPo.COLUMNS.VER.name(), bomdtlTPo.getVer()); 
			dataObject.setValue(BomdtlTPo.COLUMNS.PARENT.name(), bomdtlTPo.getParent()); 
			dataObject.setValue(BomdtlTPo.COLUMNS.ITEM_NO.name(), bomdtlTPo.getItemNo()); 
			dataObject.setValue(BomdtlTPo.COLUMNS.COMMODITY_NO.name(), bomdtlTPo.getCommodityNo()); 
			dataObject.setValue(BomdtlTPo.COLUMNS.MIX_QTY.name(), bomdtlTPo.getMixQty()); 
			dataObject.setValue(BomdtlTPo.COLUMNS.BAD_QTY.name(), bomdtlTPo.getBadQty()); 
			dataObject.setValue(BomdtlTPo.COLUMNS.UNIT_QTY.name(), bomdtlTPo.getUnitQty()); 
			dataObject.setValue(BomdtlTPo.COLUMNS.GOODS_QTY.name(), bomdtlTPo.getGoodsQty()); 
			dataObject.setValue(BomdtlTPo.COLUMNS.GOODS_UNIT.name(), bomdtlTPo.getGoodsUnit()); 
			dataObject.setValue(BomdtlTPo.COLUMNS.GOODS_DESC.name(), bomdtlTPo.getGoodsDesc()); 
			dataObject.setValue(BomdtlTPo.COLUMNS.GOODS_MODEL.name(), bomdtlTPo.getGoodsModel()); 
			dataObject.setValue(BomdtlTPo.COLUMNS.GOODS_SPEC.name(), bomdtlTPo.getGoodsSpec()); 
			dataObject.setValue(BomdtlTPo.COLUMNS.REMARKS.name(), bomdtlTPo.getRemarks()); 
			dataObject.setValue(BomdtlTPo.COLUMNS.MULTI.name(), bomdtlTPo.getMulti()); 
			dataObject.setValue(BomdtlTPo.COLUMNS.USER_ID.name(), bomdtlTPo.getUserId()); 
			dataObject.setValue(BomdtlTPo.COLUMNS.START_DATE.name(), bomdtlTPo.getStartDate()); 
			dataObject.setValue(BomdtlTPo.COLUMNS.END_DATE.name(), bomdtlTPo.getEndDate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<BomdtlTPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(BomdtlTPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
