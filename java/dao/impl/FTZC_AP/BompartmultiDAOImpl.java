package com.doc.common.dao.impl; 
 
public class BompartmultiDAOImpl extends GeneralDAOImpl<BompartmultiPo> implements BompartmultiDAO { 
	public static final BompartmultiDAOImpl INSTANCE = new BompartmultiDAOImpl(); 
	public static final String TABLENAME = "BOMPARTMULTI"; 

	public BompartmultiDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<BompartmultiPo> CONVERTER = new MapConverter<BompartmultiPo>() { 
 
		@Override 
		public BompartmultiPo convert(final DataObject dataObject) { 
			final BompartmultiPo bompartmultiPo = new BompartmultiPo(); 
			bompartmultiPo.setBfNo(dataObject.getString(BompartmultiPo.COLUMNS.BF_NO.name())); 
			bompartmultiPo.setCtmCode(dataObject.getString(BompartmultiPo.COLUMNS.CTM_CODE.name())); 
			bompartmultiPo.setPrdtNo(dataObject.getString(BompartmultiPo.COLUMNS.PRDT_NO.name())); 
			bompartmultiPo.setCommodityNo(dataObject.getString(BompartmultiPo.COLUMNS.COMMODITY_NO.name())); 
			bompartmultiPo.setCommodityNo2(dataObject.getString(BompartmultiPo.COLUMNS.COMMODITY_NO2.name())); 
			bompartmultiPo.setUnitQty(BigDecimalUtils.formObj(dataObject.getValue(BompartmultiPo.COLUMNS.UNIT_QTY.name()))); 
			bompartmultiPo.setUpdTime(dataObject.getString(BompartmultiPo.COLUMNS.UPD_TIME.name())); 
			bompartmultiPo.setBomDate(dataObject.getString(BompartmultiPo.COLUMNS.BOM_DATE.name())); 
			bompartmultiPo.setGoodsUnit(dataObject.getString(BompartmultiPo.COLUMNS.GOODS_UNIT.name())); 
			bompartmultiPo.setGoodsDesc(dataObject.getString(BompartmultiPo.COLUMNS.GOODS_DESC.name())); 
			bompartmultiPo.setItemNo(BigDecimalUtils.formObj(dataObject.getValue(BompartmultiPo.COLUMNS.ITEM_NO.name()))); 
			bompartmultiPo.setBomNo(dataObject.getString(BompartmultiPo.COLUMNS.BOM_NO.name())); 
			bompartmultiPo.setVer(dataObject.getString(BompartmultiPo.COLUMNS.VER.name())); 
			return bompartmultiPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final BompartmultiPo bompartmultiPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(BompartmultiPo.COLUMNS.BF_NO.name(), bompartmultiPo.getBfNo()); 
			dataObject.setValue(BompartmultiPo.COLUMNS.CTM_CODE.name(), bompartmultiPo.getCtmCode()); 
			dataObject.setValue(BompartmultiPo.COLUMNS.PRDT_NO.name(), bompartmultiPo.getPrdtNo()); 
			dataObject.setValue(BompartmultiPo.COLUMNS.COMMODITY_NO.name(), bompartmultiPo.getCommodityNo()); 
			dataObject.setValue(BompartmultiPo.COLUMNS.COMMODITY_NO2.name(), bompartmultiPo.getCommodityNo2()); 
			dataObject.setValue(BompartmultiPo.COLUMNS.UNIT_QTY.name(), bompartmultiPo.getUnitQty()); 
			dataObject.setValue(BompartmultiPo.COLUMNS.UPD_TIME.name(), bompartmultiPo.getUpdTime()); 
			dataObject.setValue(BompartmultiPo.COLUMNS.BOM_DATE.name(), bompartmultiPo.getBomDate()); 
			dataObject.setValue(BompartmultiPo.COLUMNS.GOODS_UNIT.name(), bompartmultiPo.getGoodsUnit()); 
			dataObject.setValue(BompartmultiPo.COLUMNS.GOODS_DESC.name(), bompartmultiPo.getGoodsDesc()); 
			dataObject.setValue(BompartmultiPo.COLUMNS.ITEM_NO.name(), bompartmultiPo.getItemNo()); 
			dataObject.setValue(BompartmultiPo.COLUMNS.BOM_NO.name(), bompartmultiPo.getBomNo()); 
			dataObject.setValue(BompartmultiPo.COLUMNS.VER.name(), bompartmultiPo.getVer()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<BompartmultiPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(BompartmultiPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
