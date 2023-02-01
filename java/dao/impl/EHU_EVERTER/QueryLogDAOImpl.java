package com.doc.common.dao.impl; 
 
public class QueryLogDAOImpl extends GeneralDAOImpl<QueryLogPo> implements QueryLogDAO { 
	public static final QueryLogDAOImpl INSTANCE = new QueryLogDAOImpl(); 
	public static final String TABLENAME = "QUERY_LOG"; 

	public QueryLogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<QueryLogPo> CONVERTER = new MapConverter<QueryLogPo>() { 
 
		@Override 
		public QueryLogPo convert(final DataObject dataObject) { 
			final QueryLogPo queryLogPo = new QueryLogPo(); 
			queryLogPo.setUId(dataObject.getString(QueryLogPo.COLUMNS.U_ID.name())); 
			queryLogPo.setUName(dataObject.getString(QueryLogPo.COLUMNS.U_NAME.name())); 
			queryLogPo.setUType(dataObject.getString(QueryLogPo.COLUMNS.U_TYPE.name())); 
			queryLogPo.setUCompany(dataObject.getString(QueryLogPo.COLUMNS.U_COMPANY.name())); 
			queryLogPo.setS1Pwd(dataObject.getString(QueryLogPo.COLUMNS.S1_PWD.name())); 
			queryLogPo.setUIp(dataObject.getString(QueryLogPo.COLUMNS.U_IP.name())); 
			queryLogPo.setEnterDate(dataObject.getString(QueryLogPo.COLUMNS.ENTER_DATE.name())); 
			return queryLogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final QueryLogPo queryLogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(QueryLogPo.COLUMNS.U_ID.name(), queryLogPo.getUId()); 
			dataObject.setValue(QueryLogPo.COLUMNS.U_NAME.name(), queryLogPo.getUName()); 
			dataObject.setValue(QueryLogPo.COLUMNS.U_TYPE.name(), queryLogPo.getUType()); 
			dataObject.setValue(QueryLogPo.COLUMNS.U_COMPANY.name(), queryLogPo.getUCompany()); 
			dataObject.setValue(QueryLogPo.COLUMNS.S1_PWD.name(), queryLogPo.getS1Pwd()); 
			dataObject.setValue(QueryLogPo.COLUMNS.U_IP.name(), queryLogPo.getUIp()); 
			dataObject.setValue(QueryLogPo.COLUMNS.ENTER_DATE.name(), queryLogPo.getEnterDate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<QueryLogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(QueryLogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
