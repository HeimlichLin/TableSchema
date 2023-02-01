package com.doc.common.dao.impl; 
 
public class Bin$tiauzkahaw7gu6wfrjiyka==$0DAOImpl extends GeneralDAOImpl<Bin$tiauzkahaw7gu6wfrjiyka==$0Po> implements Bin$tiauzkahaw7gu6wfrjiyka==$0DAO { 
	public static final Bin$tiauzkahaw7gu6wfrjiyka==$0DAOImpl INSTANCE = new Bin$tiauzkahaw7gu6wfrjiyka==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$TIAUZKAHAW7GU6WFRJIYKA==$0"; 

	public Bin$tiauzkahaw7gu6wfrjiyka==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$tiauzkahaw7gu6wfrjiyka==$0Po> CONVERTER = new MapConverter<Bin$tiauzkahaw7gu6wfrjiyka==$0Po>() { 
 
		@Override 
		public Bin$tiauzkahaw7gu6wfrjiyka==$0Po convert(final DataObject dataObject) { 
			final Bin$tiauzkahaw7gu6wfrjiyka==$0Po bin$tiauzkahaw7gu6wfrjiyka==$0Po = new Bin$tiauzkahaw7gu6wfrjiyka==$0Po(); 
			return bin$tiauzkahaw7gu6wfrjiyka==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$tiauzkahaw7gu6wfrjiyka==$0Po bin$tiauzkahaw7gu6wfrjiyka==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$tiauzkahaw7gu6wfrjiyka==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$tiauzkahaw7gu6wfrjiyka==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
