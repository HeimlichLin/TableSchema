package com.doc.common.dao.impl; 
 
public class Bin$vsanwq4hacbgu6wfrjj+xg==$0DAOImpl extends GeneralDAOImpl<Bin$vsanwq4hacbgu6wfrjj+xg==$0Po> implements Bin$vsanwq4hacbgu6wfrjj+xg==$0DAO { 
	public static final Bin$vsanwq4hacbgu6wfrjj+xg==$0DAOImpl INSTANCE = new Bin$vsanwq4hacbgu6wfrjj+xg==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$VSANWQ4HACBGU6WFRJJ+XG==$0"; 

	public Bin$vsanwq4hacbgu6wfrjj+xg==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$vsanwq4hacbgu6wfrjj+xg==$0Po> CONVERTER = new MapConverter<Bin$vsanwq4hacbgu6wfrjj+xg==$0Po>() { 
 
		@Override 
		public Bin$vsanwq4hacbgu6wfrjj+xg==$0Po convert(final DataObject dataObject) { 
			final Bin$vsanwq4hacbgu6wfrjj+xg==$0Po bin$vsanwq4hacbgu6wfrjj+xg==$0Po = new Bin$vsanwq4hacbgu6wfrjj+xg==$0Po(); 
			return bin$vsanwq4hacbgu6wfrjj+xg==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$vsanwq4hacbgu6wfrjj+xg==$0Po bin$vsanwq4hacbgu6wfrjj+xg==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$vsanwq4hacbgu6wfrjj+xg==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$vsanwq4hacbgu6wfrjj+xg==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
