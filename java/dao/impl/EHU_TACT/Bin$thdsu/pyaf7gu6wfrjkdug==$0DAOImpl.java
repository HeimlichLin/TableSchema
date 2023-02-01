package com.doc.common.dao.impl; 
 
public class Bin$thdsu/pyaf7gu6wfrjkdug==$0DAOImpl extends GeneralDAOImpl<Bin$thdsu/pyaf7gu6wfrjkdug==$0Po> implements Bin$thdsu/pyaf7gu6wfrjkdug==$0DAO { 
	public static final Bin$thdsu/pyaf7gu6wfrjkdug==$0DAOImpl INSTANCE = new Bin$thdsu/pyaf7gu6wfrjkdug==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$THDSU/PYAF7GU6WFRJKDUG==$0"; 

	public Bin$thdsu/pyaf7gu6wfrjkdug==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$thdsu/pyaf7gu6wfrjkdug==$0Po> CONVERTER = new MapConverter<Bin$thdsu/pyaf7gu6wfrjkdug==$0Po>() { 
 
		@Override 
		public Bin$thdsu/pyaf7gu6wfrjkdug==$0Po convert(final DataObject dataObject) { 
			final Bin$thdsu/pyaf7gu6wfrjkdug==$0Po bin$thdsu/pyaf7gu6wfrjkdug==$0Po = new Bin$thdsu/pyaf7gu6wfrjkdug==$0Po(); 
			return bin$thdsu/pyaf7gu6wfrjkdug==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$thdsu/pyaf7gu6wfrjkdug==$0Po bin$thdsu/pyaf7gu6wfrjkdug==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$thdsu/pyaf7gu6wfrjkdug==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$thdsu/pyaf7gu6wfrjkdug==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
