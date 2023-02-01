package com.doc.common.dao.impl; 
 
public class Bin$vavy1desawbgu6wfrjkqmq==$0DAOImpl extends GeneralDAOImpl<Bin$vavy1desawbgu6wfrjkqmq==$0Po> implements Bin$vavy1desawbgu6wfrjkqmq==$0DAO { 
	public static final Bin$vavy1desawbgu6wfrjkqmq==$0DAOImpl INSTANCE = new Bin$vavy1desawbgu6wfrjkqmq==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$VAVY1DESAWBGU6WFRJKQMQ==$0"; 

	public Bin$vavy1desawbgu6wfrjkqmq==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$vavy1desawbgu6wfrjkqmq==$0Po> CONVERTER = new MapConverter<Bin$vavy1desawbgu6wfrjkqmq==$0Po>() { 
 
		@Override 
		public Bin$vavy1desawbgu6wfrjkqmq==$0Po convert(final DataObject dataObject) { 
			final Bin$vavy1desawbgu6wfrjkqmq==$0Po bin$vavy1desawbgu6wfrjkqmq==$0Po = new Bin$vavy1desawbgu6wfrjkqmq==$0Po(); 
			return bin$vavy1desawbgu6wfrjkqmq==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$vavy1desawbgu6wfrjkqmq==$0Po bin$vavy1desawbgu6wfrjkqmq==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$vavy1desawbgu6wfrjkqmq==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$vavy1desawbgu6wfrjkqmq==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
