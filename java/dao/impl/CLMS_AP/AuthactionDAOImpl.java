package com.doc.common.dao.impl; 
 
public class AuthactionDAOImpl extends GeneralDAOImpl<AuthactionPo> implements AuthactionDAO { 
	public static final AuthactionDAOImpl INSTANCE = new AuthactionDAOImpl(); 
	public static final String TABLENAME = "AUTHACTION"; 

	public AuthactionDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<AuthactionPo> CONVERTER = new MapConverter<AuthactionPo>() { 
 
		@Override 
		public AuthactionPo convert(final DataObject dataObject) { 
			final AuthactionPo authactionPo = new AuthactionPo(); 
			authactionPo.setAuthid(dataObject.getString(AuthactionPo.COLUMNS.AUTHID.name())); 
			authactionPo.setBondno(dataObject.getString(AuthactionPo.COLUMNS.BONDNO.name())); 
			authactionPo.setActionid(dataObject.getString(AuthactionPo.COLUMNS.ACTIONID.name())); 
			return authactionPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final AuthactionPo authactionPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(AuthactionPo.COLUMNS.AUTHID.name(), authactionPo.getAuthid()); 
			dataObject.setValue(AuthactionPo.COLUMNS.BONDNO.name(), authactionPo.getBondno()); 
			dataObject.setValue(AuthactionPo.COLUMNS.ACTIONID.name(), authactionPo.getActionid()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<AuthactionPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(AuthactionPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(AuthactionPo.COLUMNS.AUTHID.name(), po.getAuthid()); 
		sqlWhere.add(AuthactionPo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(AuthactionPo.COLUMNS.ACTIONID.name(), po.getActionid()); 
		return sqlWhere; 
	} 
 
} 
