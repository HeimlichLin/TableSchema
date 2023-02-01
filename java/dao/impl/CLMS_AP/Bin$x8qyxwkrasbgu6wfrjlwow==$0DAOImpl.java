package com.doc.common.dao.impl; 
 
public class Bin$x8qyxwkrasbgu6wfrjlwow==$0DAOImpl extends GeneralDAOImpl<Bin$x8qyxwkrasbgu6wfrjlwow==$0Po> implements Bin$x8qyxwkrasbgu6wfrjlwow==$0DAO { 
	public static final Bin$x8qyxwkrasbgu6wfrjlwow==$0DAOImpl INSTANCE = new Bin$x8qyxwkrasbgu6wfrjlwow==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$X8QYXWKRASBGU6WFRJLWOW==$0"; 

	public Bin$x8qyxwkrasbgu6wfrjlwow==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$x8qyxwkrasbgu6wfrjlwow==$0Po> CONVERTER = new MapConverter<Bin$x8qyxwkrasbgu6wfrjlwow==$0Po>() { 
 
		@Override 
		public Bin$x8qyxwkrasbgu6wfrjlwow==$0Po convert(final DataObject dataObject) { 
			final Bin$x8qyxwkrasbgu6wfrjlwow==$0Po bin$x8qyxwkrasbgu6wfrjlwow==$0Po = new Bin$x8qyxwkrasbgu6wfrjlwow==$0Po(); 
			return bin$x8qyxwkrasbgu6wfrjlwow==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$x8qyxwkrasbgu6wfrjlwow==$0Po bin$x8qyxwkrasbgu6wfrjlwow==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$x8qyxwkrasbgu6wfrjlwow==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$x8qyxwkrasbgu6wfrjlwow==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
