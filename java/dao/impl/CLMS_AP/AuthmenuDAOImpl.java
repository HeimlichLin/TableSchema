package com.doc.common.dao.impl; 
 
public class AuthmenuDAOImpl extends GeneralDAOImpl<AuthmenuPo> implements AuthmenuDAO { 
	public static final AuthmenuDAOImpl INSTANCE = new AuthmenuDAOImpl(); 
	public static final String TABLENAME = "AUTHMENU"; 

	public AuthmenuDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<AuthmenuPo> CONVERTER = new MapConverter<AuthmenuPo>() { 
 
		@Override 
		public AuthmenuPo convert(final DataObject dataObject) { 
			final AuthmenuPo authmenuPo = new AuthmenuPo(); 
			authmenuPo.setAuthid(dataObject.getString(AuthmenuPo.COLUMNS.AUTHID.name())); 
			authmenuPo.setMenuid(dataObject.getString(AuthmenuPo.COLUMNS.MENUID.name())); 
			return authmenuPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final AuthmenuPo authmenuPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(AuthmenuPo.COLUMNS.AUTHID.name(), authmenuPo.getAuthid()); 
			dataObject.setValue(AuthmenuPo.COLUMNS.MENUID.name(), authmenuPo.getMenuid()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<AuthmenuPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(AuthmenuPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(AuthmenuPo.COLUMNS.AUTHID.name(), po.getAuthid()); 
		sqlWhere.add(AuthmenuPo.COLUMNS.MENUID.name(), po.getMenuid()); 
		return sqlWhere; 
	} 
 
} 
