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
			modlogPo.setBondno(dataObject.getString(ModlogPo.COLUMNS.BONDNO.name())); 
			modlogPo.setRefbillno(dataObject.getString(ModlogPo.COLUMNS.REFBILLNO.name())); 
			modlogPo.setItem(BigDecimalUtils.formObj(dataObject.getValue(ModlogPo.COLUMNS.ITEM.name()))); 
			modlogPo.setPost(dataObject.getString(ModlogPo.COLUMNS.POST.name())); 
			modlogPo.setStrtype(dataObject.getString(ModlogPo.COLUMNS.STRTYPE.name())); 
			modlogPo.setModifer(dataObject.getString(ModlogPo.COLUMNS.MODIFER.name())); 
			modlogPo.setModtime(TimestampUtils.of(dataObject.getValue(ModlogPo.COLUMNS.MODTIME.name()))); 
			modlogPo.setModitem(dataObject.getString(ModlogPo.COLUMNS.MODITEM.name())); 
			modlogPo.setOridata(dataObject.getString(ModlogPo.COLUMNS.ORIDATA.name())); 
			modlogPo.setModdata(dataObject.getString(ModlogPo.COLUMNS.MODDATA.name())); 
			modlogPo.setModfile(dataObject.getString(ModlogPo.COLUMNS.MODFILE.name())); 
			modlogPo.setRemks(dataObject.getString(ModlogPo.COLUMNS.REMKS.name())); 
			modlogPo.setDeclno(dataObject.getString(ModlogPo.COLUMNS.DECLNO.name())); 
			modlogPo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(ModlogPo.COLUMNS.ITEMNO.name()))); 
			modlogPo.setOdeclno(dataObject.getString(ModlogPo.COLUMNS.ODECLNO.name())); 
			modlogPo.setOitemno(dataObject.getString(ModlogPo.COLUMNS.OITEMNO.name())); 
			return modlogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ModlogPo modlogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ModlogPo.COLUMNS.BONDNO.name(), modlogPo.getBondno()); 
			dataObject.setValue(ModlogPo.COLUMNS.REFBILLNO.name(), modlogPo.getRefbillno()); 
			dataObject.setValue(ModlogPo.COLUMNS.ITEM.name(), modlogPo.getItem()); 
			dataObject.setValue(ModlogPo.COLUMNS.POST.name(), modlogPo.getPost()); 
			dataObject.setValue(ModlogPo.COLUMNS.STRTYPE.name(), modlogPo.getStrtype()); 
			dataObject.setValue(ModlogPo.COLUMNS.MODIFER.name(), modlogPo.getModifer()); 
			dataObject.setValue(ModlogPo.COLUMNS.MODTIME.name(), modlogPo.getModtime()); 
			dataObject.setValue(ModlogPo.COLUMNS.MODITEM.name(), modlogPo.getModitem()); 
			dataObject.setValue(ModlogPo.COLUMNS.ORIDATA.name(), modlogPo.getOridata()); 
			dataObject.setValue(ModlogPo.COLUMNS.MODDATA.name(), modlogPo.getModdata()); 
			dataObject.setValue(ModlogPo.COLUMNS.MODFILE.name(), modlogPo.getModfile()); 
			dataObject.setValue(ModlogPo.COLUMNS.REMKS.name(), modlogPo.getRemks()); 
			dataObject.setValue(ModlogPo.COLUMNS.DECLNO.name(), modlogPo.getDeclno()); 
			dataObject.setValue(ModlogPo.COLUMNS.ITEMNO.name(), modlogPo.getItemno()); 
			dataObject.setValue(ModlogPo.COLUMNS.ODECLNO.name(), modlogPo.getOdeclno()); 
			dataObject.setValue(ModlogPo.COLUMNS.OITEMNO.name(), modlogPo.getOitemno()); 
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
