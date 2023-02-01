package com.doc.common.dao.impl; 
 
public class Bin$z8coukppattgu6wfrjl2mg==$0DAOImpl extends GeneralDAOImpl<Bin$z8coukppattgu6wfrjl2mg==$0Po> implements Bin$z8coukppattgu6wfrjl2mg==$0DAO { 
	public static final Bin$z8coukppattgu6wfrjl2mg==$0DAOImpl INSTANCE = new Bin$z8coukppattgu6wfrjl2mg==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$Z8COUKPPATTGU6WFRJL2MG==$0"; 

	public Bin$z8coukppattgu6wfrjl2mg==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$z8coukppattgu6wfrjl2mg==$0Po> CONVERTER = new MapConverter<Bin$z8coukppattgu6wfrjl2mg==$0Po>() { 
 
		@Override 
		public Bin$z8coukppattgu6wfrjl2mg==$0Po convert(final DataObject dataObject) { 
			final Bin$z8coukppattgu6wfrjl2mg==$0Po bin$z8coukppattgu6wfrjl2mg==$0Po = new Bin$z8coukppattgu6wfrjl2mg==$0Po(); 
			return bin$z8coukppattgu6wfrjl2mg==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$z8coukppattgu6wfrjl2mg==$0Po bin$z8coukppattgu6wfrjl2mg==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$z8coukppattgu6wfrjl2mg==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$z8coukppattgu6wfrjl2mg==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
