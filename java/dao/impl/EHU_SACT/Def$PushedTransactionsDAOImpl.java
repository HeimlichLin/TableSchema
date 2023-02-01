package com.doc.common.dao.impl; 
 
public class Def$PushedTransactionsDAOImpl extends GeneralDAOImpl<Def$PushedTransactionsPo> implements IDef$PushedTransactionsDAO { 
	public static final Def$PushedTransactionsDAOImpl INSTANCE = new Def$PushedTransactionsDAOImpl(); 
	public static final String TABLENAME = "DEF$_PUSHED_TRANSACTIONS"; 

	public Def$PushedTransactionsDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Def$PushedTransactionsPo> CONVERTER = new MapConverter<Def$PushedTransactionsPo>() { 
 
		@Override 
		public Def$PushedTransactionsPo convert(final DataObject dataObject) { 
			final Def$PushedTransactionsPo def$PushedTransactionsPo = new Def$PushedTransactionsPo(); 
			def$PushedTransactionsPo.setSourceSiteId(BigDecimalUtils.formObj(dataObject.getValue(Def$PushedTransactionsPo.COLUMNS.SOURCE_SITE_ID.name()))); 
			def$PushedTransactionsPo.setLastTranId(BigDecimalUtils.formObj(dataObject.getValue(Def$PushedTransactionsPo.COLUMNS.LAST_TRAN_ID.name()))); 
			def$PushedTransactionsPo.setDisabled(dataObject.getString(Def$PushedTransactionsPo.COLUMNS.DISABLED.name())); 
			def$PushedTransactionsPo.setSourceSite(dataObject.getString(Def$PushedTransactionsPo.COLUMNS.SOURCE_SITE.name())); 
			return def$PushedTransactionsPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Def$PushedTransactionsPo def$PushedTransactionsPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Def$PushedTransactionsPo.COLUMNS.SOURCE_SITE_ID.name(), def$PushedTransactionsPo.getSourceSiteId()); 
			dataObject.setValue(Def$PushedTransactionsPo.COLUMNS.LAST_TRAN_ID.name(), def$PushedTransactionsPo.getLastTranId()); 
			dataObject.setValue(Def$PushedTransactionsPo.COLUMNS.DISABLED.name(), def$PushedTransactionsPo.getDisabled()); 
			dataObject.setValue(Def$PushedTransactionsPo.COLUMNS.SOURCE_SITE.name(), def$PushedTransactionsPo.getSourceSite()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Def$PushedTransactionsPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Def$PushedTransactionsPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Def$PushedTransactionsPo.COLUMNS.SOURCE_SITE_ID.name(), po.getSourceSiteId()); 
		return sqlWhere; 
	} 
 
} 
