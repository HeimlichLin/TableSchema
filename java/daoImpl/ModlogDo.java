package com.doc.common.dao.impl; 
 
public class ModlogDAO extends GeneralDAOImpl<ModlogDo> implements ModlogDAO { 
	public static final ModlogDAOImpl INSTANCE = new ModlogDAOImpl(); 
	public static final String TABLENAME = "MODLOG"; 

	public ModlogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<ModlogDo> CONVERTER = new MapConverter<ModlogDo>() { 
 
		@Override 
		public ModlogDo convert(final DataObject dataObject) { 
			final ModlogDo modlogDo = new ModlogDo(); 
			modlogDo.setBondno(dataObject.getString(ModlogDo.COLUMNS.BONDNO.name())); 
			modlogDo.setRefbillno(dataObject.getString(ModlogDo.COLUMNS.REFBILLNO.name())); 
			modlogDo.setItem(BigDecimalUtils.formObj(dataObject.getString(ModlogDo.COLUMNS.ITEM.name()))); 
			modlogDo.setPost(dataObject.getString(ModlogDo.COLUMNS.POST.name())); 
			modlogDo.setStrtype(dataObject.getString(ModlogDo.COLUMNS.STRTYPE.name())); 
			modlogDo.setModifer(dataObject.getString(ModlogDo.COLUMNS.MODIFER.name())); 
			modlogDo.setModtime(CommUtils.objConver2Time(dataObject.getString(ModlogDo.COLUMNS.MODTIME.name()))); 
			modlogDo.setModitem(dataObject.getString(ModlogDo.COLUMNS.MODITEM.name())); 
			modlogDo.setOridata(dataObject.getString(ModlogDo.COLUMNS.ORIDATA.name())); 
			modlogDo.setModdata(dataObject.getString(ModlogDo.COLUMNS.MODDATA.name())); 
			modlogDo.setModfile(dataObject.getString(ModlogDo.COLUMNS.MODFILE.name())); 
			modlogDo.setRemks(dataObject.getString(ModlogDo.COLUMNS.REMKS.name())); 
			modlogDo.setDeclno(dataObject.getString(ModlogDo.COLUMNS.DECLNO.name())); 
			modlogDo.setItemno(BigDecimalUtils.formObj(dataObject.getString(ModlogDo.COLUMNS.ITEMNO.name()))); 
			modlogDo.setOdeclno(dataObject.getString(ModlogDo.COLUMNS.ODECLNO.name())); 
			modlogDo.setOitemno(dataObject.getString(ModlogDo.COLUMNS.OITEMNO.name())); 
			return modlogDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ModlogDo modlogDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ModlogDo.COLUMNS.BONDNO.name(), modlogDo.getBondno()); 
			dataObject.setValue(ModlogDo.COLUMNS.REFBILLNO.name(), modlogDo.getRefbillno()); 
			dataObject.setValue(ModlogDo.COLUMNS.ITEM.name(), modlogDo.getItem()); 
			dataObject.setValue(ModlogDo.COLUMNS.POST.name(), modlogDo.getPost()); 
			dataObject.setValue(ModlogDo.COLUMNS.STRTYPE.name(), modlogDo.getStrtype()); 
			dataObject.setValue(ModlogDo.COLUMNS.MODIFER.name(), modlogDo.getModifer()); 
			dataObject.setValue(ModlogDo.COLUMNS.MODTIME.name(), modlogDo.getModtime()); 
			dataObject.setValue(ModlogDo.COLUMNS.MODITEM.name(), modlogDo.getModitem()); 
			dataObject.setValue(ModlogDo.COLUMNS.ORIDATA.name(), modlogDo.getOridata()); 
			dataObject.setValue(ModlogDo.COLUMNS.MODDATA.name(), modlogDo.getModdata()); 
			dataObject.setValue(ModlogDo.COLUMNS.MODFILE.name(), modlogDo.getModfile()); 
			dataObject.setValue(ModlogDo.COLUMNS.REMKS.name(), modlogDo.getRemks()); 
			dataObject.setValue(ModlogDo.COLUMNS.DECLNO.name(), modlogDo.getDeclno()); 
			dataObject.setValue(ModlogDo.COLUMNS.ITEMNO.name(), modlogDo.getItemno()); 
			dataObject.setValue(ModlogDo.COLUMNS.ODECLNO.name(), modlogDo.getOdeclno()); 
			dataObject.setValue(ModlogDo.COLUMNS.OITEMNO.name(), modlogDo.getOitemno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ModlogDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ModlogDo po) { 
		sqlWhere.add(ModlogDo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(ModlogDo.COLUMNS.REFBILLNO.name(), po.getRefbillno()); 
		sqlWhere.add(ModlogDo.COLUMNS.ITEM.name(), po.getItem()); 
		sqlWhere.add(ModlogDo.COLUMNS.POST.name(), po.getPost()); 
		sqlWhere.add(ModlogDo.COLUMNS.STRTYPE.name(), po.getStrtype()); 
		sqlWhere.add(ModlogDo.COLUMNS.MODIFER.name(), po.getModifer()); 
		sqlWhere.add(ModlogDo.COLUMNS.MODTIME.name(), po.getModtime()); 
		sqlWhere.add(ModlogDo.COLUMNS.MODITEM.name(), po.getModitem()); 
		sqlWhere.add(ModlogDo.COLUMNS.ORIDATA.name(), po.getOridata()); 
		sqlWhere.add(ModlogDo.COLUMNS.MODDATA.name(), po.getModdata()); 
		sqlWhere.add(ModlogDo.COLUMNS.MODFILE.name(), po.getModfile()); 
		sqlWhere.add(ModlogDo.COLUMNS.REMKS.name(), po.getRemks()); 
		sqlWhere.add(ModlogDo.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(ModlogDo.COLUMNS.ITEMNO.name(), po.getItemno()); 
		sqlWhere.add(ModlogDo.COLUMNS.ODECLNO.name(), po.getOdeclno()); 
		sqlWhere.add(ModlogDo.COLUMNS.OITEMNO.name(), po.getOitemno()); 
	} 
 
} 
