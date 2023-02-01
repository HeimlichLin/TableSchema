package com.doc.common.dao.impl; 
 
public class Bin$2kys//9zavjgu6wfrjip5q==$0DAOImpl extends GeneralDAOImpl<Bin$2kys//9zavjgu6wfrjip5q==$0Po> implements Bin$2kys//9zavjgu6wfrjip5q==$0DAO { 
	public static final Bin$2kys//9zavjgu6wfrjip5q==$0DAOImpl INSTANCE = new Bin$2kys//9zavjgu6wfrjip5q==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$2KYS//9ZAVJGU6WFRJIP5Q==$0"; 

	public Bin$2kys//9zavjgu6wfrjip5q==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$2kys//9zavjgu6wfrjip5q==$0Po> CONVERTER = new MapConverter<Bin$2kys//9zavjgu6wfrjip5q==$0Po>() { 
 
		@Override 
		public Bin$2kys//9zavjgu6wfrjip5q==$0Po convert(final DataObject dataObject) { 
			final Bin$2kys//9zavjgu6wfrjip5q==$0Po bin$2kys//9zavjgu6wfrjip5q==$0Po = new Bin$2kys//9zavjgu6wfrjip5q==$0Po(); 
			return bin$2kys//9zavjgu6wfrjip5q==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$2kys//9zavjgu6wfrjip5q==$0Po bin$2kys//9zavjgu6wfrjip5q==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$2kys//9zavjgu6wfrjip5q==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$2kys//9zavjgu6wfrjip5q==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
