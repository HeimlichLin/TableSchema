package com.doc.common.dao.impl; 
 
public class StoragebookDAOImpl extends GeneralDAOImpl<StoragebookPo> implements StoragebookDAO { 
	public static final StoragebookDAOImpl INSTANCE = new StoragebookDAOImpl(); 
	public static final String TABLENAME = "STORAGEBOOK"; 

	public StoragebookDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<StoragebookPo> CONVERTER = new MapConverter<StoragebookPo>() { 
 
		@Override 
		public StoragebookPo convert(final DataObject dataObject) { 
			final StoragebookPo storagebookPo = new StoragebookPo(); 
			storagebookPo.setBfNo(dataObject.getString(StoragebookPo.COLUMNS.BF_NO.name())); 
			storagebookPo.setPlaceBfNo(dataObject.getString(StoragebookPo.COLUMNS.PLACE_BF_NO.name())); 
			storagebookPo.setStrType(dataObject.getString(StoragebookPo.COLUMNS.STR_TYPE.name())); 
			storagebookPo.setDeclNo(dataObject.getString(StoragebookPo.COLUMNS.DECL_NO.name())); 
			storagebookPo.setODeclNo(dataObject.getString(StoragebookPo.COLUMNS.O_DECL_NO.name())); 
			storagebookPo.setNoPkg(BigDecimalUtils.formObj(dataObject.getValue(StoragebookPo.COLUMNS.NO_PKG.name()))); 
			storagebookPo.setPkgUnit(dataObject.getString(StoragebookPo.COLUMNS.PKG_UNIT.name())); 
			storagebookPo.setGWgt(BigDecimalUtils.formObj(dataObject.getValue(StoragebookPo.COLUMNS.G_WGT.name()))); 
			storagebookPo.setContrNo(dataObject.getString(StoragebookPo.COLUMNS.CONTR_NO.name())); 
			storagebookPo.setStorageArea(dataObject.getString(StoragebookPo.COLUMNS.STORAGE_AREA.name())); 
			return storagebookPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final StoragebookPo storagebookPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(StoragebookPo.COLUMNS.BF_NO.name(), storagebookPo.getBfNo()); 
			dataObject.setValue(StoragebookPo.COLUMNS.PLACE_BF_NO.name(), storagebookPo.getPlaceBfNo()); 
			dataObject.setValue(StoragebookPo.COLUMNS.STR_TYPE.name(), storagebookPo.getStrType()); 
			dataObject.setValue(StoragebookPo.COLUMNS.DECL_NO.name(), storagebookPo.getDeclNo()); 
			dataObject.setValue(StoragebookPo.COLUMNS.O_DECL_NO.name(), storagebookPo.getODeclNo()); 
			dataObject.setValue(StoragebookPo.COLUMNS.NO_PKG.name(), storagebookPo.getNoPkg()); 
			dataObject.setValue(StoragebookPo.COLUMNS.PKG_UNIT.name(), storagebookPo.getPkgUnit()); 
			dataObject.setValue(StoragebookPo.COLUMNS.G_WGT.name(), storagebookPo.getGWgt()); 
			dataObject.setValue(StoragebookPo.COLUMNS.CONTR_NO.name(), storagebookPo.getContrNo()); 
			dataObject.setValue(StoragebookPo.COLUMNS.STORAGE_AREA.name(), storagebookPo.getStorageArea()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<StoragebookPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(StoragebookPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(StoragebookPo.COLUMNS.BF_NO.name(), po.getBfNo()); 
		sqlWhere.add(StoragebookPo.COLUMNS.PLACE_BF_NO.name(), po.getPlaceBfNo()); 
		sqlWhere.add(StoragebookPo.COLUMNS.STR_TYPE.name(), po.getStrType()); 
		sqlWhere.add(StoragebookPo.COLUMNS.DECL_NO.name(), po.getDeclNo()); 
		sqlWhere.add(StoragebookPo.COLUMNS.O_DECL_NO.name(), po.getODeclNo()); 
		return sqlWhere; 
	} 
 
} 
