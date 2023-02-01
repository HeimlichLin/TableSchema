package com.doc.common.dao.impl; 
 
public class Aq$InternetAgentPrivsDAOImpl extends GeneralDAOImpl<Aq$InternetAgentPrivsPo> implements IAq$InternetAgentPrivsDAO { 
	public static final Aq$InternetAgentPrivsDAOImpl INSTANCE = new Aq$InternetAgentPrivsDAOImpl(); 
	public static final String TABLENAME = "AQ$_INTERNET_AGENT_PRIVS"; 

	public Aq$InternetAgentPrivsDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Aq$InternetAgentPrivsPo> CONVERTER = new MapConverter<Aq$InternetAgentPrivsPo>() { 
 
		@Override 
		public Aq$InternetAgentPrivsPo convert(final DataObject dataObject) { 
			final Aq$InternetAgentPrivsPo aq$InternetAgentPrivsPo = new Aq$InternetAgentPrivsPo(); 
			aq$InternetAgentPrivsPo.setAgentName(dataObject.getString(Aq$InternetAgentPrivsPo.COLUMNS.AGENT_NAME.name())); 
			aq$InternetAgentPrivsPo.setDbUsername(dataObject.getString(Aq$InternetAgentPrivsPo.COLUMNS.DB_USERNAME.name())); 
			return aq$InternetAgentPrivsPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Aq$InternetAgentPrivsPo aq$InternetAgentPrivsPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Aq$InternetAgentPrivsPo.COLUMNS.AGENT_NAME.name(), aq$InternetAgentPrivsPo.getAgentName()); 
			dataObject.setValue(Aq$InternetAgentPrivsPo.COLUMNS.DB_USERNAME.name(), aq$InternetAgentPrivsPo.getDbUsername()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Aq$InternetAgentPrivsPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Aq$InternetAgentPrivsPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Aq$InternetAgentPrivsPo.COLUMNS.AGENT_NAME.name(), po.getAgentName()); 
		sqlWhere.add(Aq$InternetAgentPrivsPo.COLUMNS.DB_USERNAME.name(), po.getDbUsername()); 
		return sqlWhere; 
	} 
 
} 
