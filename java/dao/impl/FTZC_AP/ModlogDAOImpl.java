package com.doc.common.dao.impl; 
 
public class ModlogDAOImpl extends GeneralDAOImpl<ModlogPo> implements ModlogDAO { 
	public static final ModlogDAOImpl INSTANCE = new ModlogDAOImpl(); 
	public static final String TABLENAME = "MODLOG"; 

	public ModlogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ModlogPo> CONVERTER = new MapConverter<ModlogPo>() { 
 
		@Override 
		public ModlogPo convert(final DataObject dataObject) { 
			final ModlogPo modlogPo = new ModlogPo(); 
			modlogPo.setBfNo(dataObject.getString(ModlogPo.COLUMNS.BF_NO.name())); 
			modlogPo.setRefBillNo(dataObject.getString(ModlogPo.COLUMNS.REF_BILL_NO.name())); 
			modlogPo.setStrType(dataObject.getString(ModlogPo.COLUMNS.STR_TYPE.name())); 
			modlogPo.setModifer(dataObject.getString(ModlogPo.COLUMNS.MODIFER.name())); 
			modlogPo.setModTime(dataObject.getString(ModlogPo.COLUMNS.MOD_TIME.name())); 
			modlogPo.setModFile(dataObject.getString(ModlogPo.COLUMNS.MOD_FILE.name())); 
			modlogPo.setControlNo(dataObject.getString(ModlogPo.COLUMNS.CONTROL_NO.name())); 
			modlogPo.setDeclType(dataObject.getString(ModlogPo.COLUMNS.DECL_TYPE.name())); 
			modlogPo.setItem(dataObject.getString(ModlogPo.COLUMNS.ITEM.name())); 
			modlogPo.setPost(dataObject.getString(ModlogPo.COLUMNS.POST.name())); 
			modlogPo.setModItem(dataObject.getString(ModlogPo.COLUMNS.MOD_ITEM.name())); 
			modlogPo.setOriData(dataObject.getString(ModlogPo.COLUMNS.ORI_DATA.name())); 
			modlogPo.setModData(dataObject.getString(ModlogPo.COLUMNS.MOD_DATA.name())); 
			modlogPo.setRemks(dataObject.getString(ModlogPo.COLUMNS.REMKS.name())); 
			modlogPo.setSerialNo(dataObject.getString(ModlogPo.COLUMNS.SERIAL_NO.name())); 
			modlogPo.setDeclNo(dataObject.getString(ModlogPo.COLUMNS.DECL_NO.name())); 
			modlogPo.setItemNo(dataObject.getString(ModlogPo.COLUMNS.ITEM_NO.name())); 
			modlogPo.setBatchNo(dataObject.getString(ModlogPo.COLUMNS.BATCH_NO.name())); 
			modlogPo.setDeclSeqNo(BigDecimalUtils.formObj(dataObject.getValue(ModlogPo.COLUMNS.DECL_SEQ_NO.name()))); 
			return modlogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ModlogPo modlogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ModlogPo.COLUMNS.BF_NO.name(), modlogPo.getBfNo()); 
			dataObject.setValue(ModlogPo.COLUMNS.REF_BILL_NO.name(), modlogPo.getRefBillNo()); 
			dataObject.setValue(ModlogPo.COLUMNS.STR_TYPE.name(), modlogPo.getStrType()); 
			dataObject.setValue(ModlogPo.COLUMNS.MODIFER.name(), modlogPo.getModifer()); 
			dataObject.setValue(ModlogPo.COLUMNS.MOD_TIME.name(), modlogPo.getModTime()); 
			dataObject.setValue(ModlogPo.COLUMNS.MOD_FILE.name(), modlogPo.getModFile()); 
			dataObject.setValue(ModlogPo.COLUMNS.CONTROL_NO.name(), modlogPo.getControlNo()); 
			dataObject.setValue(ModlogPo.COLUMNS.DECL_TYPE.name(), modlogPo.getDeclType()); 
			dataObject.setValue(ModlogPo.COLUMNS.ITEM.name(), modlogPo.getItem()); 
			dataObject.setValue(ModlogPo.COLUMNS.POST.name(), modlogPo.getPost()); 
			dataObject.setValue(ModlogPo.COLUMNS.MOD_ITEM.name(), modlogPo.getModItem()); 
			dataObject.setValue(ModlogPo.COLUMNS.ORI_DATA.name(), modlogPo.getOriData()); 
			dataObject.setValue(ModlogPo.COLUMNS.MOD_DATA.name(), modlogPo.getModData()); 
			dataObject.setValue(ModlogPo.COLUMNS.REMKS.name(), modlogPo.getRemks()); 
			dataObject.setValue(ModlogPo.COLUMNS.SERIAL_NO.name(), modlogPo.getSerialNo()); 
			dataObject.setValue(ModlogPo.COLUMNS.DECL_NO.name(), modlogPo.getDeclNo()); 
			dataObject.setValue(ModlogPo.COLUMNS.ITEM_NO.name(), modlogPo.getItemNo()); 
			dataObject.setValue(ModlogPo.COLUMNS.BATCH_NO.name(), modlogPo.getBatchNo()); 
			dataObject.setValue(ModlogPo.COLUMNS.DECL_SEQ_NO.name(), modlogPo.getDeclSeqNo()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ModlogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ModlogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
