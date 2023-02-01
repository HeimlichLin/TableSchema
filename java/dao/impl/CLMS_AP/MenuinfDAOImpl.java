package com.doc.common.dao.impl; 
 
public class MenuinfDAOImpl extends GeneralDAOImpl<MenuinfPo> implements MenuinfDAO { 
	public static final MenuinfDAOImpl INSTANCE = new MenuinfDAOImpl(); 
	public static final String TABLENAME = "MENUINF"; 

	public MenuinfDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<MenuinfPo> CONVERTER = new MapConverter<MenuinfPo>() { 
 
		@Override 
		public MenuinfPo convert(final DataObject dataObject) { 
			final MenuinfPo menuinfPo = new MenuinfPo(); 
			menuinfPo.setMenuid(dataObject.getString(MenuinfPo.COLUMNS.MENUID.name())); 
			menuinfPo.setRootid(dataObject.getString(MenuinfPo.COLUMNS.ROOTID.name())); 
			menuinfPo.setMenuname(dataObject.getString(MenuinfPo.COLUMNS.MENUNAME.name())); 
			menuinfPo.setUrl(dataObject.getString(MenuinfPo.COLUMNS.URL.name())); 
			menuinfPo.setIsHide(dataObject.getString(MenuinfPo.COLUMNS.IS_HIDE.name())); 
			menuinfPo.setMenuSort(dataObject.getString(MenuinfPo.COLUMNS.MENU_SORT.name())); 
			menuinfPo.setIsCommon(dataObject.getString(MenuinfPo.COLUMNS.IS_COMMON.name())); 
			return menuinfPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final MenuinfPo menuinfPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(MenuinfPo.COLUMNS.MENUID.name(), menuinfPo.getMenuid()); 
			dataObject.setValue(MenuinfPo.COLUMNS.ROOTID.name(), menuinfPo.getRootid()); 
			dataObject.setValue(MenuinfPo.COLUMNS.MENUNAME.name(), menuinfPo.getMenuname()); 
			dataObject.setValue(MenuinfPo.COLUMNS.URL.name(), menuinfPo.getUrl()); 
			dataObject.setValue(MenuinfPo.COLUMNS.IS_HIDE.name(), menuinfPo.getIsHide()); 
			dataObject.setValue(MenuinfPo.COLUMNS.MENU_SORT.name(), menuinfPo.getMenuSort()); 
			dataObject.setValue(MenuinfPo.COLUMNS.IS_COMMON.name(), menuinfPo.getIsCommon()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<MenuinfPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(MenuinfPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(MenuinfPo.COLUMNS.MENUID.name(), po.getMenuid()); 
		return sqlWhere; 
	} 
 
} 
