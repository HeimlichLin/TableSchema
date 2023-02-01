package com.doc.common.dao.impl; 
 
public class Bin$tiauzkcfaw7gu6wfrjiyka==$0DAOImpl extends GeneralDAOImpl<Bin$tiauzkcfaw7gu6wfrjiyka==$0Po> implements Bin$tiauzkcfaw7gu6wfrjiyka==$0DAO { 
	public static final Bin$tiauzkcfaw7gu6wfrjiyka==$0DAOImpl INSTANCE = new Bin$tiauzkcfaw7gu6wfrjiyka==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$TIAUZKCFAW7GU6WFRJIYKA==$0"; 

	public Bin$tiauzkcfaw7gu6wfrjiyka==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$tiauzkcfaw7gu6wfrjiyka==$0Po> CONVERTER = new MapConverter<Bin$tiauzkcfaw7gu6wfrjiyka==$0Po>() { 
 
		@Override 
		public Bin$tiauzkcfaw7gu6wfrjiyka==$0Po convert(final DataObject dataObject) { 
			final Bin$tiauzkcfaw7gu6wfrjiyka==$0Po bin$tiauzkcfaw7gu6wfrjiyka==$0Po = new Bin$tiauzkcfaw7gu6wfrjiyka==$0Po(); 
			return bin$tiauzkcfaw7gu6wfrjiyka==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$tiauzkcfaw7gu6wfrjiyka==$0Po bin$tiauzkcfaw7gu6wfrjiyka==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$tiauzkcfaw7gu6wfrjiyka==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$tiauzkcfaw7gu6wfrjiyka==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
