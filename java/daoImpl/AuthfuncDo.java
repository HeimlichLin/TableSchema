package com.doc.common.dao.impl; 
 
public class AuthfuncDAO extends GeneralDAOImpl<AuthfuncDo> implements AuthfuncDAO { 
	public static final AuthfuncDAOImpl INSTANCE = new AuthfuncDAOImpl(); 
	public static final String TABLENAME = "AUTHFUNC"; 

	public AuthfuncDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<AuthfuncDo> CONVERTER = new MapConverter<AuthfuncDo>() { 
 
		@Override 
		public AuthfuncDo convert(final DataObject dataObject) { 
			final AuthfuncDo authfuncDo = new AuthfuncDo(); 
			authfuncDo.setAuthid(dataObject.getString(AuthfuncDo.COLUMNS.AUTHID.name())); 
			authfuncDo.setFuncid(dataObject.getString(AuthfuncDo.COLUMNS.FUNCID.name())); 
			authfuncDo.setAuthname(dataObject.getString(AuthfuncDo.COLUMNS.AUTHNAME.name())); 
			authfuncDo.setRw(dataObject.getString(AuthfuncDo.COLUMNS.RW.name())); 
			return authfuncDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final AuthfuncDo authfuncDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(AuthfuncDo.COLUMNS.AUTHID.name(), authfuncDo.getAuthid()); 
			dataObject.setValue(AuthfuncDo.COLUMNS.FUNCID.name(), authfuncDo.getFuncid()); 
			dataObject.setValue(AuthfuncDo.COLUMNS.AUTHNAME.name(), authfuncDo.getAuthname()); 
			dataObject.setValue(AuthfuncDo.COLUMNS.RW.name(), authfuncDo.getRw()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<AuthfuncDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(AuthfuncDo po) { 
		sqlWhere.add(AuthfuncDo.COLUMNS.AUTHNAME.name(), po.getAuthname()); 
		sqlWhere.add(AuthfuncDo.COLUMNS.RW.name(), po.getRw()); 
	} 
 
} 
