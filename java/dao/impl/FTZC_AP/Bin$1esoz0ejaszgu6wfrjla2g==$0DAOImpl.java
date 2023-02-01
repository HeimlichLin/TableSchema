package com.doc.common.dao.impl; 
 
public class Bin$1esoz0ejaszgu6wfrjla2g==$0DAOImpl extends GeneralDAOImpl<Bin$1esoz0ejaszgu6wfrjla2g==$0Po> implements Bin$1esoz0ejaszgu6wfrjla2g==$0DAO { 
	public static final Bin$1esoz0ejaszgu6wfrjla2g==$0DAOImpl INSTANCE = new Bin$1esoz0ejaszgu6wfrjla2g==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$1ESOZ0EJASZGU6WFRJLA2G==$0"; 

	public Bin$1esoz0ejaszgu6wfrjla2g==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$1esoz0ejaszgu6wfrjla2g==$0Po> CONVERTER = new MapConverter<Bin$1esoz0ejaszgu6wfrjla2g==$0Po>() { 
 
		@Override 
		public Bin$1esoz0ejaszgu6wfrjla2g==$0Po convert(final DataObject dataObject) { 
			final Bin$1esoz0ejaszgu6wfrjla2g==$0Po bin$1esoz0ejaszgu6wfrjla2g==$0Po = new Bin$1esoz0ejaszgu6wfrjla2g==$0Po(); 
			return bin$1esoz0ejaszgu6wfrjla2g==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$1esoz0ejaszgu6wfrjla2g==$0Po bin$1esoz0ejaszgu6wfrjla2g==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$1esoz0ejaszgu6wfrjla2g==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$1esoz0ejaszgu6wfrjla2g==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
