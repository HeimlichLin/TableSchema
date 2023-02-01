package com.doc.common.dao.impl; 
 
public class PreOutdtlDAOImpl extends GeneralDAOImpl<PreOutdtlPo> implements PreOutdtlDAO { 
	public static final PreOutdtlDAOImpl INSTANCE = new PreOutdtlDAOImpl(); 
	public static final String TABLENAME = "PRE_OUTDTL"; 

	public PreOutdtlDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<PreOutdtlPo> CONVERTER = new MapConverter<PreOutdtlPo>() { 
 
		@Override 
		public PreOutdtlPo convert(final DataObject dataObject) { 
			final PreOutdtlPo preOutdtlPo = new PreOutdtlPo(); 
			preOutdtlPo.setBfNo(dataObject.getString(PreOutdtlPo.COLUMNS.BF_NO.name())); 
			preOutdtlPo.setODeclNo(dataObject.getString(PreOutdtlPo.COLUMNS.O_DECL_NO.name())); 
			preOutdtlPo.setOItemNo(BigDecimalUtils.formObj(dataObject.getValue(PreOutdtlPo.COLUMNS.O_ITEM_NO.name()))); 
			preOutdtlPo.setGoodsUnit(dataObject.getString(PreOutdtlPo.COLUMNS.GOODS_UNIT.name())); 
			preOutdtlPo.setOutStorageArea(dataObject.getString(PreOutdtlPo.COLUMNS.OUT_STORAGE_AREA.name())); 
			preOutdtlPo.setSumqty(BigDecimalUtils.formObj(dataObject.getValue(PreOutdtlPo.COLUMNS.SUMQTY.name()))); 
			preOutdtlPo.setCommodityNo(dataObject.getString(PreOutdtlPo.COLUMNS.COMMODITY_NO.name())); 
			return preOutdtlPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final PreOutdtlPo preOutdtlPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(PreOutdtlPo.COLUMNS.BF_NO.name(), preOutdtlPo.getBfNo()); 
			dataObject.setValue(PreOutdtlPo.COLUMNS.O_DECL_NO.name(), preOutdtlPo.getODeclNo()); 
			dataObject.setValue(PreOutdtlPo.COLUMNS.O_ITEM_NO.name(), preOutdtlPo.getOItemNo()); 
			dataObject.setValue(PreOutdtlPo.COLUMNS.GOODS_UNIT.name(), preOutdtlPo.getGoodsUnit()); 
			dataObject.setValue(PreOutdtlPo.COLUMNS.OUT_STORAGE_AREA.name(), preOutdtlPo.getOutStorageArea()); 
			dataObject.setValue(PreOutdtlPo.COLUMNS.SUMQTY.name(), preOutdtlPo.getSumqty()); 
			dataObject.setValue(PreOutdtlPo.COLUMNS.COMMODITY_NO.name(), preOutdtlPo.getCommodityNo()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<PreOutdtlPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(PreOutdtlPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
