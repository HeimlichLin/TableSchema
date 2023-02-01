package com.doc.common.dao.impl; 
 
public class Aq$InternetAgentsDAOImpl extends GeneralDAOImpl<Aq$InternetAgentsPo> implements IAq$InternetAgentsDAO { 
	public static final Aq$InternetAgentsDAOImpl INSTANCE = new Aq$InternetAgentsDAOImpl(); 
	public static final String TABLENAME = "AQ$_INTERNET_AGENTS"; 

	public Aq$InternetAgentsDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Aq$InternetAgentsPo> CONVERTER = new MapConverter<Aq$InternetAgentsPo>() { 
 
		@Override 
		public Aq$InternetAgentsPo convert(final DataObject dataObject) { 
			final Aq$InternetAgentsPo aq$InternetAgentsPo = new Aq$InternetAgentsPo(); 
			aq$InternetAgentsPo.setAgentName(dataObject.getString(Aq$InternetAgentsPo.COLUMNS.AGENT_NAME.name())); 
			aq$InternetAgentsPo.setProtocol(BigDecimalUtils.formObj(dataObject.getValue(Aq$InternetAgentsPo.COLUMNS.PROTOCOL.name()))); 
			aq$InternetAgentsPo.setSpare1(dataObject.getString(Aq$InternetAgentsPo.COLUMNS.SPARE1.name())); 
			return aq$InternetAgentsPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Aq$InternetAgentsPo aq$InternetAgentsPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Aq$InternetAgentsPo.COLUMNS.AGENT_NAME.name(), aq$InternetAgentsPo.getAgentName()); 
			dataObject.setValue(Aq$InternetAgentsPo.COLUMNS.PROTOCOL.name(), aq$InternetAgentsPo.getProtocol()); 
			dataObject.setValue(Aq$InternetAgentsPo.COLUMNS.SPARE1.name(), aq$InternetAgentsPo.getSpare1()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Aq$InternetAgentsPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Aq$InternetAgentsPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Aq$InternetAgentsPo.COLUMNS.AGENT_NAME.name(), po.getAgentName()); 
		return sqlWhere; 
	} 
 
} 
