package com.doc.common.dao.impl; 
 
public class Bin$tiauzkdoaw7gu6wfrjiyka==$0DAOImpl extends GeneralDAOImpl<Bin$tiauzkdoaw7gu6wfrjiyka==$0Po> implements Bin$tiauzkdoaw7gu6wfrjiyka==$0DAO { 
	public static final Bin$tiauzkdoaw7gu6wfrjiyka==$0DAOImpl INSTANCE = new Bin$tiauzkdoaw7gu6wfrjiyka==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$TIAUZKDOAW7GU6WFRJIYKA==$0"; 

	public Bin$tiauzkdoaw7gu6wfrjiyka==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$tiauzkdoaw7gu6wfrjiyka==$0Po> CONVERTER = new MapConverter<Bin$tiauzkdoaw7gu6wfrjiyka==$0Po>() { 
 
		@Override 
		public Bin$tiauzkdoaw7gu6wfrjiyka==$0Po convert(final DataObject dataObject) { 
			final Bin$tiauzkdoaw7gu6wfrjiyka==$0Po bin$tiauzkdoaw7gu6wfrjiyka==$0Po = new Bin$tiauzkdoaw7gu6wfrjiyka==$0Po(); 
			return bin$tiauzkdoaw7gu6wfrjiyka==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$tiauzkdoaw7gu6wfrjiyka==$0Po bin$tiauzkdoaw7gu6wfrjiyka==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$tiauzkdoaw7gu6wfrjiyka==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$tiauzkdoaw7gu6wfrjiyka==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
