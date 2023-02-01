package com.doc.common.dao.impl; 
 
public class AuthinfDAOImpl extends GeneralDAOImpl<AuthinfPo> implements AuthinfDAO { 
	public static final AuthinfDAOImpl INSTANCE = new AuthinfDAOImpl(); 
	public static final String TABLENAME = "AUTHINF"; 

	public AuthinfDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<AuthinfPo> CONVERTER = new MapConverter<AuthinfPo>() { 
 
		@Override 
		public AuthinfPo convert(final DataObject dataObject) { 
			final AuthinfPo authinfPo = new AuthinfPo(); 
			authinfPo.setAuthid(dataObject.getString(AuthinfPo.COLUMNS.AUTHID.name())); 
			authinfPo.setAuthname(dataObject.getString(AuthinfPo.COLUMNS.AUTHNAME.name())); 
			return authinfPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final AuthinfPo authinfPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(AuthinfPo.COLUMNS.AUTHID.name(), authinfPo.getAuthid()); 
			dataObject.setValue(AuthinfPo.COLUMNS.AUTHNAME.name(), authinfPo.getAuthname()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<AuthinfPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(AuthinfPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(AuthinfPo.COLUMNS.AUTHID.name(), po.getAuthid()); 
		return sqlWhere; 
	} 
 
} 
