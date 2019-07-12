package com.doc.common.dao.impl; 
 
public class AuthinfDAOImpl extends GeneralDAOImpl<AuthinfDo> implements AuthinfDAOImpl { 
	public static final AuthinfDAOImpl INSTANCE = new AuthinfDAOImpl(); 
	public static final String TABLENAME = "AUTHINF"; 

	public AuthinfDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<AuthinfDo> CONVERTER = new MapConverter<AuthinfDo>() { 
 
		@Override 
		public AuthinfDo convert(final DataObject dataObject) { 
			final AuthinfDo authinfDo = new AuthinfDo(); 
			authinfDo.setAuthid(dataObject.getString(AuthinfDo.COLUMNS.AUTHID.name())); 
			authinfDo.setAuthname(dataObject.getString(AuthinfDo.COLUMNS.AUTHNAME.name())); 
			return authinfDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final AuthinfDo authinfDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(AuthinfDo.COLUMNS.AUTHID.name(), authinfDo.getAuthid()); 
			dataObject.setValue(AuthinfDo.COLUMNS.AUTHNAME.name(), authinfDo.getAuthname()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<AuthinfDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(AuthinfDo po) { 
		sqlWhere.add(AuthinfDo.COLUMNS.AUTHID.name(), po.getAuthid()); 
	} 
 
} 
