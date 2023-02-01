package com.doc.common.dao.impl; 
 
public class Bin$thdsu/ooaf7gu6wfrjkdug==$0DAOImpl extends GeneralDAOImpl<Bin$thdsu/ooaf7gu6wfrjkdug==$0Po> implements Bin$thdsu/ooaf7gu6wfrjkdug==$0DAO { 
	public static final Bin$thdsu/ooaf7gu6wfrjkdug==$0DAOImpl INSTANCE = new Bin$thdsu/ooaf7gu6wfrjkdug==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$THDSU/OOAF7GU6WFRJKDUG==$0"; 

	public Bin$thdsu/ooaf7gu6wfrjkdug==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$thdsu/ooaf7gu6wfrjkdug==$0Po> CONVERTER = new MapConverter<Bin$thdsu/ooaf7gu6wfrjkdug==$0Po>() { 
 
		@Override 
		public Bin$thdsu/ooaf7gu6wfrjkdug==$0Po convert(final DataObject dataObject) { 
			final Bin$thdsu/ooaf7gu6wfrjkdug==$0Po bin$thdsu/ooaf7gu6wfrjkdug==$0Po = new Bin$thdsu/ooaf7gu6wfrjkdug==$0Po(); 
			return bin$thdsu/ooaf7gu6wfrjkdug==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$thdsu/ooaf7gu6wfrjkdug==$0Po bin$thdsu/ooaf7gu6wfrjkdug==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$thdsu/ooaf7gu6wfrjkdug==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$thdsu/ooaf7gu6wfrjkdug==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
