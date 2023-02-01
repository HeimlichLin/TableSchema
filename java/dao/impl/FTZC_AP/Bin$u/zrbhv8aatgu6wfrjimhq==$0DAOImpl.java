package com.doc.common.dao.impl; 
 
public class Bin$u/zrbhv8aatgu6wfrjimhq==$0DAOImpl extends GeneralDAOImpl<Bin$u/zrbhv8aatgu6wfrjimhq==$0Po> implements Bin$u/zrbhv8aatgu6wfrjimhq==$0DAO { 
	public static final Bin$u/zrbhv8aatgu6wfrjimhq==$0DAOImpl INSTANCE = new Bin$u/zrbhv8aatgu6wfrjimhq==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$U/ZRBHV8AATGU6WFRJIMHQ==$0"; 

	public Bin$u/zrbhv8aatgu6wfrjimhq==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$u/zrbhv8aatgu6wfrjimhq==$0Po> CONVERTER = new MapConverter<Bin$u/zrbhv8aatgu6wfrjimhq==$0Po>() { 
 
		@Override 
		public Bin$u/zrbhv8aatgu6wfrjimhq==$0Po convert(final DataObject dataObject) { 
			final Bin$u/zrbhv8aatgu6wfrjimhq==$0Po bin$u/zrbhv8aatgu6wfrjimhq==$0Po = new Bin$u/zrbhv8aatgu6wfrjimhq==$0Po(); 
			return bin$u/zrbhv8aatgu6wfrjimhq==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$u/zrbhv8aatgu6wfrjimhq==$0Po bin$u/zrbhv8aatgu6wfrjimhq==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$u/zrbhv8aatgu6wfrjimhq==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$u/zrbhv8aatgu6wfrjimhq==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
