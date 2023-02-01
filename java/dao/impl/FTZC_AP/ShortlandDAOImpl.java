package com.doc.common.dao.impl; 
 
public class ShortlandDAOImpl extends GeneralDAOImpl<ShortlandPo> implements ShortlandDAO { 
	public static final ShortlandDAOImpl INSTANCE = new ShortlandDAOImpl(); 
	public static final String TABLENAME = "SHORTLAND"; 

	public ShortlandDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ShortlandPo> CONVERTER = new MapConverter<ShortlandPo>() { 
 
		@Override 
		public ShortlandPo convert(final DataObject dataObject) { 
			final ShortlandPo shortlandPo = new ShortlandPo(); 
			shortlandPo.setBfNo(dataObject.getString(ShortlandPo.COLUMNS.BF_NO.name())); 
			shortlandPo.setDeliverType(dataObject.getString(ShortlandPo.COLUMNS.DELIVER_TYPE.name())); 
			shortlandPo.setDeclNo(dataObject.getString(ShortlandPo.COLUMNS.DECL_NO.name())); 
			shortlandPo.setDeclType(dataObject.getString(ShortlandPo.COLUMNS.DECL_TYPE.name())); 
			shortlandPo.setItemNo(dataObject.getString(ShortlandPo.COLUMNS.ITEM_NO.name())); 
			shortlandPo.setDeclQty(BigDecimalUtils.formObj(dataObject.getValue(ShortlandPo.COLUMNS.DECL_QTY.name()))); 
			shortlandPo.setShortLandQty(BigDecimalUtils.formObj(dataObject.getValue(ShortlandPo.COLUMNS.SHORT_LAND_QTY.name()))); 
			shortlandPo.setPermitNo(dataObject.getString(ShortlandPo.COLUMNS.PERMIT_NO.name())); 
			shortlandPo.setPermitDate(dataObject.getString(ShortlandPo.COLUMNS.PERMIT_DATE.name())); 
			shortlandPo.setRemark(dataObject.getString(ShortlandPo.COLUMNS.REMARK.name())); 
			shortlandPo.setStorageArea(dataObject.getString(ShortlandPo.COLUMNS.STORAGE_AREA.name())); 
			shortlandPo.setODeclNo(dataObject.getString(ShortlandPo.COLUMNS.O_DECL_NO.name())); 
			shortlandPo.setOItemNo(BigDecimalUtils.formObj(dataObject.getValue(ShortlandPo.COLUMNS.O_ITEM_NO.name()))); 
			return shortlandPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ShortlandPo shortlandPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ShortlandPo.COLUMNS.BF_NO.name(), shortlandPo.getBfNo()); 
			dataObject.setValue(ShortlandPo.COLUMNS.DELIVER_TYPE.name(), shortlandPo.getDeliverType()); 
			dataObject.setValue(ShortlandPo.COLUMNS.DECL_NO.name(), shortlandPo.getDeclNo()); 
			dataObject.setValue(ShortlandPo.COLUMNS.DECL_TYPE.name(), shortlandPo.getDeclType()); 
			dataObject.setValue(ShortlandPo.COLUMNS.ITEM_NO.name(), shortlandPo.getItemNo()); 
			dataObject.setValue(ShortlandPo.COLUMNS.DECL_QTY.name(), shortlandPo.getDeclQty()); 
			dataObject.setValue(ShortlandPo.COLUMNS.SHORT_LAND_QTY.name(), shortlandPo.getShortLandQty()); 
			dataObject.setValue(ShortlandPo.COLUMNS.PERMIT_NO.name(), shortlandPo.getPermitNo()); 
			dataObject.setValue(ShortlandPo.COLUMNS.PERMIT_DATE.name(), shortlandPo.getPermitDate()); 
			dataObject.setValue(ShortlandPo.COLUMNS.REMARK.name(), shortlandPo.getRemark()); 
			dataObject.setValue(ShortlandPo.COLUMNS.STORAGE_AREA.name(), shortlandPo.getStorageArea()); 
			dataObject.setValue(ShortlandPo.COLUMNS.O_DECL_NO.name(), shortlandPo.getODeclNo()); 
			dataObject.setValue(ShortlandPo.COLUMNS.O_ITEM_NO.name(), shortlandPo.getOItemNo()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ShortlandPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ShortlandPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(ShortlandPo.COLUMNS.BF_NO.name(), po.getBfNo()); 
		sqlWhere.add(ShortlandPo.COLUMNS.DELIVER_TYPE.name(), po.getDeliverType()); 
		sqlWhere.add(ShortlandPo.COLUMNS.DECL_NO.name(), po.getDeclNo()); 
		sqlWhere.add(ShortlandPo.COLUMNS.ITEM_NO.name(), po.getItemNo()); 
		sqlWhere.add(ShortlandPo.COLUMNS.STORAGE_AREA.name(), po.getStorageArea()); 
		sqlWhere.add(ShortlandPo.COLUMNS.O_DECL_NO.name(), po.getODeclNo()); 
		sqlWhere.add(ShortlandPo.COLUMNS.O_ITEM_NO.name(), po.getOItemNo()); 
		return sqlWhere; 
	} 
 
} 
