package com.doc.common.dao.impl; 
 
public class BomdtlDAOImpl extends GeneralDAOImpl<BomdtlPo> implements BomdtlDAO { 
	public static final BomdtlDAOImpl INSTANCE = new BomdtlDAOImpl(); 
	public static final String TABLENAME = "BOMDTL"; 

	public BomdtlDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<BomdtlPo> CONVERTER = new MapConverter<BomdtlPo>() { 
 
		@Override 
		public BomdtlPo convert(final DataObject dataObject) { 
			final BomdtlPo bomdtlPo = new BomdtlPo(); 
			bomdtlPo.setBfNo(dataObject.getString(BomdtlPo.COLUMNS.BF_NO.name())); 
			bomdtlPo.setBomNo(dataObject.getString(BomdtlPo.COLUMNS.BOM_NO.name())); 
			bomdtlPo.setVer(dataObject.getString(BomdtlPo.COLUMNS.VER.name())); 
			bomdtlPo.setParent(dataObject.getString(BomdtlPo.COLUMNS.PARENT.name())); 
			bomdtlPo.setItemNo(dataObject.getString(BomdtlPo.COLUMNS.ITEM_NO.name())); 
			bomdtlPo.setCommodityNo(dataObject.getString(BomdtlPo.COLUMNS.COMMODITY_NO.name())); 
			bomdtlPo.setMixQty(BigDecimalUtils.formObj(dataObject.getValue(BomdtlPo.COLUMNS.MIX_QTY.name()))); 
			bomdtlPo.setBadQty(BigDecimalUtils.formObj(dataObject.getValue(BomdtlPo.COLUMNS.BAD_QTY.name()))); 
			bomdtlPo.setUnitQty(BigDecimalUtils.formObj(dataObject.getValue(BomdtlPo.COLUMNS.UNIT_QTY.name()))); 
			bomdtlPo.setGoodsQty(BigDecimalUtils.formObj(dataObject.getValue(BomdtlPo.COLUMNS.GOODS_QTY.name()))); 
			bomdtlPo.setGoodsUnit(dataObject.getString(BomdtlPo.COLUMNS.GOODS_UNIT.name())); 
			bomdtlPo.setGoodsDesc(dataObject.getString(BomdtlPo.COLUMNS.GOODS_DESC.name())); 
			bomdtlPo.setGoodsModel(dataObject.getString(BomdtlPo.COLUMNS.GOODS_MODEL.name())); 
			bomdtlPo.setGoodsSpec(dataObject.getString(BomdtlPo.COLUMNS.GOODS_SPEC.name())); 
			bomdtlPo.setRemarks(dataObject.getString(BomdtlPo.COLUMNS.REMARKS.name())); 
			bomdtlPo.setMulti(dataObject.getString(BomdtlPo.COLUMNS.MULTI.name())); 
			bomdtlPo.setUserId(dataObject.getString(BomdtlPo.COLUMNS.USER_ID.name())); 
			bomdtlPo.setStartDate(dataObject.getString(BomdtlPo.COLUMNS.START_DATE.name())); 
			bomdtlPo.setEndDate(dataObject.getString(BomdtlPo.COLUMNS.END_DATE.name())); 
			return bomdtlPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final BomdtlPo bomdtlPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(BomdtlPo.COLUMNS.BF_NO.name(), bomdtlPo.getBfNo()); 
			dataObject.setValue(BomdtlPo.COLUMNS.BOM_NO.name(), bomdtlPo.getBomNo()); 
			dataObject.setValue(BomdtlPo.COLUMNS.VER.name(), bomdtlPo.getVer()); 
			dataObject.setValue(BomdtlPo.COLUMNS.PARENT.name(), bomdtlPo.getParent()); 
			dataObject.setValue(BomdtlPo.COLUMNS.ITEM_NO.name(), bomdtlPo.getItemNo()); 
			dataObject.setValue(BomdtlPo.COLUMNS.COMMODITY_NO.name(), bomdtlPo.getCommodityNo()); 
			dataObject.setValue(BomdtlPo.COLUMNS.MIX_QTY.name(), bomdtlPo.getMixQty()); 
			dataObject.setValue(BomdtlPo.COLUMNS.BAD_QTY.name(), bomdtlPo.getBadQty()); 
			dataObject.setValue(BomdtlPo.COLUMNS.UNIT_QTY.name(), bomdtlPo.getUnitQty()); 
			dataObject.setValue(BomdtlPo.COLUMNS.GOODS_QTY.name(), bomdtlPo.getGoodsQty()); 
			dataObject.setValue(BomdtlPo.COLUMNS.GOODS_UNIT.name(), bomdtlPo.getGoodsUnit()); 
			dataObject.setValue(BomdtlPo.COLUMNS.GOODS_DESC.name(), bomdtlPo.getGoodsDesc()); 
			dataObject.setValue(BomdtlPo.COLUMNS.GOODS_MODEL.name(), bomdtlPo.getGoodsModel()); 
			dataObject.setValue(BomdtlPo.COLUMNS.GOODS_SPEC.name(), bomdtlPo.getGoodsSpec()); 
			dataObject.setValue(BomdtlPo.COLUMNS.REMARKS.name(), bomdtlPo.getRemarks()); 
			dataObject.setValue(BomdtlPo.COLUMNS.MULTI.name(), bomdtlPo.getMulti()); 
			dataObject.setValue(BomdtlPo.COLUMNS.USER_ID.name(), bomdtlPo.getUserId()); 
			dataObject.setValue(BomdtlPo.COLUMNS.START_DATE.name(), bomdtlPo.getStartDate()); 
			dataObject.setValue(BomdtlPo.COLUMNS.END_DATE.name(), bomdtlPo.getEndDate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<BomdtlPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(BomdtlPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
