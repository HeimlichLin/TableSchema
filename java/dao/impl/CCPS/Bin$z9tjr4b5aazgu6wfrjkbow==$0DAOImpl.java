package com.doc.common.dao.impl; 
 
public class Bin$z9tjr4b5aazgu6wfrjkbow==$0DAOImpl extends GeneralDAOImpl<Bin$z9tjr4b5aazgu6wfrjkbow==$0Po> implements Bin$z9tjr4b5aazgu6wfrjkbow==$0DAO { 
	public static final Bin$z9tjr4b5aazgu6wfrjkbow==$0DAOImpl INSTANCE = new Bin$z9tjr4b5aazgu6wfrjkbow==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$Z9TJR4B5AAZGU6WFRJKBOW==$0"; 

	public Bin$z9tjr4b5aazgu6wfrjkbow==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$z9tjr4b5aazgu6wfrjkbow==$0Po> CONVERTER = new MapConverter<Bin$z9tjr4b5aazgu6wfrjkbow==$0Po>() { 
 
		@Override 
		public Bin$z9tjr4b5aazgu6wfrjkbow==$0Po convert(final DataObject dataObject) { 
			final Bin$z9tjr4b5aazgu6wfrjkbow==$0Po bin$z9tjr4b5aazgu6wfrjkbow==$0Po = new Bin$z9tjr4b5aazgu6wfrjkbow==$0Po(); 
			return bin$z9tjr4b5aazgu6wfrjkbow==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$z9tjr4b5aazgu6wfrjkbow==$0Po bin$z9tjr4b5aazgu6wfrjkbow==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$z9tjr4b5aazgu6wfrjkbow==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$z9tjr4b5aazgu6wfrjkbow==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
