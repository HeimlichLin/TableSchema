package com.doc.common.dao.impl; 
 
public class AuthoritiesDAOImpl extends GeneralDAOImpl<AuthoritiesPo> implements AuthoritiesDAO { 
	public static final AuthoritiesDAOImpl INSTANCE = new AuthoritiesDAOImpl(); 
	public static final String TABLENAME = "AUTHORITIES"; 

	public AuthoritiesDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<AuthoritiesPo> CONVERTER = new MapConverter<AuthoritiesPo>() { 
 
		@Override 
		public AuthoritiesPo convert(final DataObject dataObject) { 
			final AuthoritiesPo authoritiesPo = new AuthoritiesPo(); 
			authoritiesPo.setUsername(dataObject.getString(AuthoritiesPo.COLUMNS.USERNAME.name())); 
			authoritiesPo.setAuthority(dataObject.getString(AuthoritiesPo.COLUMNS.AUTHORITY.name())); 
			return authoritiesPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final AuthoritiesPo authoritiesPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(AuthoritiesPo.COLUMNS.USERNAME.name(), authoritiesPo.getUsername()); 
			dataObject.setValue(AuthoritiesPo.COLUMNS.AUTHORITY.name(), authoritiesPo.getAuthority()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<AuthoritiesPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(AuthoritiesPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(AuthoritiesPo.COLUMNS.USERNAME.name(), po.getUsername()); 
		return sqlWhere; 
	} 
 
} 
