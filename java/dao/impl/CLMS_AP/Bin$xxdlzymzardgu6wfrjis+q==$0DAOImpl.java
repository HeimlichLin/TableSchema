package com.doc.common.dao.impl; 
 
public class Bin$xxdlzymzardgu6wfrjis+q==$0DAOImpl extends GeneralDAOImpl<Bin$xxdlzymzardgu6wfrjis+q==$0Po> implements Bin$xxdlzymzardgu6wfrjis+q==$0DAO { 
	public static final Bin$xxdlzymzardgu6wfrjis+q==$0DAOImpl INSTANCE = new Bin$xxdlzymzardgu6wfrjis+q==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$XXDLZYMZARDGU6WFRJIS+Q==$0"; 

	public Bin$xxdlzymzardgu6wfrjis+q==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$xxdlzymzardgu6wfrjis+q==$0Po> CONVERTER = new MapConverter<Bin$xxdlzymzardgu6wfrjis+q==$0Po>() { 
 
		@Override 
		public Bin$xxdlzymzardgu6wfrjis+q==$0Po convert(final DataObject dataObject) { 
			final Bin$xxdlzymzardgu6wfrjis+q==$0Po bin$xxdlzymzardgu6wfrjis+q==$0Po = new Bin$xxdlzymzardgu6wfrjis+q==$0Po(); 
			return bin$xxdlzymzardgu6wfrjis+q==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$xxdlzymzardgu6wfrjis+q==$0Po bin$xxdlzymzardgu6wfrjis+q==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$xxdlzymzardgu6wfrjis+q==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$xxdlzymzardgu6wfrjis+q==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
