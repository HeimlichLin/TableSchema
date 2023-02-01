package com.doc.common.dao.impl; 
 
public class ModelogDAOImpl extends GeneralDAOImpl<ModelogPo> implements ModelogDAO { 
	public static final ModelogDAOImpl INSTANCE = new ModelogDAOImpl(); 
	public static final String TABLENAME = "MODELOG"; 

	public ModelogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ModelogPo> CONVERTER = new MapConverter<ModelogPo>() { 
 
		@Override 
		public ModelogPo convert(final DataObject dataObject) { 
			final ModelogPo modelogPo = new ModelogPo(); 
			modelogPo.setItemNo(dataObject.getString(ModelogPo.COLUMNS.ITEM_NO.name())); 
			modelogPo.setModItem(dataObject.getString(ModelogPo.COLUMNS.MOD_ITEM.name())); 
			modelogPo.setOriData(dataObject.getString(ModelogPo.COLUMNS.ORI_DATA.name())); 
			modelogPo.setModData(dataObject.getString(ModelogPo.COLUMNS.MOD_DATA.name())); 
			modelogPo.setItem(dataObject.getString(ModelogPo.COLUMNS.ITEM.name())); 
			modelogPo.setPost(dataObject.getString(ModelogPo.COLUMNS.POST.name())); 
			modelogPo.setRemks(dataObject.getString(ModelogPo.COLUMNS.REMKS.name())); 
			modelogPo.setLogId(); 
			return modelogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ModelogPo modelogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ModelogPo.COLUMNS.ITEM_NO.name(), modelogPo.getItemNo()); 
			dataObject.setValue(ModelogPo.COLUMNS.MOD_ITEM.name(), modelogPo.getModItem()); 
			dataObject.setValue(ModelogPo.COLUMNS.ORI_DATA.name(), modelogPo.getOriData()); 
			dataObject.setValue(ModelogPo.COLUMNS.MOD_DATA.name(), modelogPo.getModData()); 
			dataObject.setValue(ModelogPo.COLUMNS.ITEM.name(), modelogPo.getItem()); 
			dataObject.setValue(ModelogPo.COLUMNS.POST.name(), modelogPo.getPost()); 
			dataObject.setValue(ModelogPo.COLUMNS.REMKS.name(), modelogPo.getRemks()); 
			dataObject.setValue(ModelogPo.COLUMNS.LOG_ID.name(), modelogPo.getLogId()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ModelogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ModelogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
