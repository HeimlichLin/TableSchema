package com.doc.common.dao.impl; 
 
public class Bin$2nsqttk6aqbgu6wfrjklzw==$0DAOImpl extends GeneralDAOImpl<Bin$2nsqttk6aqbgu6wfrjklzw==$0Po> implements Bin$2nsqttk6aqbgu6wfrjklzw==$0DAO { 
	public static final Bin$2nsqttk6aqbgu6wfrjklzw==$0DAOImpl INSTANCE = new Bin$2nsqttk6aqbgu6wfrjklzw==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$2NSQTTK6AQBGU6WFRJKLZW==$0"; 

	public Bin$2nsqttk6aqbgu6wfrjklzw==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$2nsqttk6aqbgu6wfrjklzw==$0Po> CONVERTER = new MapConverter<Bin$2nsqttk6aqbgu6wfrjklzw==$0Po>() { 
 
		@Override 
		public Bin$2nsqttk6aqbgu6wfrjklzw==$0Po convert(final DataObject dataObject) { 
			final Bin$2nsqttk6aqbgu6wfrjklzw==$0Po bin$2nsqttk6aqbgu6wfrjklzw==$0Po = new Bin$2nsqttk6aqbgu6wfrjklzw==$0Po(); 
			return bin$2nsqttk6aqbgu6wfrjklzw==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$2nsqttk6aqbgu6wfrjklzw==$0Po bin$2nsqttk6aqbgu6wfrjklzw==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$2nsqttk6aqbgu6wfrjklzw==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$2nsqttk6aqbgu6wfrjklzw==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
