package com.doc.common.dao.impl; 
 
public class Bin$tiauzkdnaw7gu6wfrjiyka==$0DAOImpl extends GeneralDAOImpl<Bin$tiauzkdnaw7gu6wfrjiyka==$0Po> implements Bin$tiauzkdnaw7gu6wfrjiyka==$0DAO { 
	public static final Bin$tiauzkdnaw7gu6wfrjiyka==$0DAOImpl INSTANCE = new Bin$tiauzkdnaw7gu6wfrjiyka==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$TIAUZKDNAW7GU6WFRJIYKA==$0"; 

	public Bin$tiauzkdnaw7gu6wfrjiyka==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$tiauzkdnaw7gu6wfrjiyka==$0Po> CONVERTER = new MapConverter<Bin$tiauzkdnaw7gu6wfrjiyka==$0Po>() { 
 
		@Override 
		public Bin$tiauzkdnaw7gu6wfrjiyka==$0Po convert(final DataObject dataObject) { 
			final Bin$tiauzkdnaw7gu6wfrjiyka==$0Po bin$tiauzkdnaw7gu6wfrjiyka==$0Po = new Bin$tiauzkdnaw7gu6wfrjiyka==$0Po(); 
			return bin$tiauzkdnaw7gu6wfrjiyka==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$tiauzkdnaw7gu6wfrjiyka==$0Po bin$tiauzkdnaw7gu6wfrjiyka==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$tiauzkdnaw7gu6wfrjiyka==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$tiauzkdnaw7gu6wfrjiyka==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
