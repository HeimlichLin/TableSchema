package com.doc.common.dao.impl; 
 
public class AuthfuncDAOImpl extends GeneralDAOImpl<AuthfuncPo> implements AuthfuncDAO { 
	public static final AuthfuncDAOImpl INSTANCE = new AuthfuncDAOImpl(); 
	public static final String TABLENAME = "AUTHFUNC"; 

	public AuthfuncDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<AuthfuncPo> CONVERTER = new MapConverter<AuthfuncPo>() { 
 
		@Override 
		public AuthfuncPo convert(final DataObject dataObject) { 
			final AuthfuncPo authfuncPo = new AuthfuncPo(); 
			authfuncPo.setAuthid(dataObject.getString(AuthfuncPo.COLUMNS.AUTHID.name())); 
			authfuncPo.setFuncid(dataObject.getString(AuthfuncPo.COLUMNS.FUNCID.name())); 
			authfuncPo.setAuthname(dataObject.getString(AuthfuncPo.COLUMNS.AUTHNAME.name())); 
			authfuncPo.setRw(dataObject.getString(AuthfuncPo.COLUMNS.RW.name())); 
			return authfuncPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final AuthfuncPo authfuncPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(AuthfuncPo.COLUMNS.AUTHID.name(), authfuncPo.getAuthid()); 
			dataObject.setValue(AuthfuncPo.COLUMNS.FUNCID.name(), authfuncPo.getFuncid()); 
			dataObject.setValue(AuthfuncPo.COLUMNS.AUTHNAME.name(), authfuncPo.getAuthname()); 
			dataObject.setValue(AuthfuncPo.COLUMNS.RW.name(), authfuncPo.getRw()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<AuthfuncPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(AuthfuncPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(AuthfuncPo.COLUMNS.AUTHID.name(), po.getAuthid()); 
		sqlWhere.add(AuthfuncPo.COLUMNS.FUNCID.name(), po.getFuncid()); 
		return sqlWhere; 
	} 
 
} 
