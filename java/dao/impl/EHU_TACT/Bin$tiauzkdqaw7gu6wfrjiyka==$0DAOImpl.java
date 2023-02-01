package com.doc.common.dao.impl; 
 
public class Bin$tiauzkdqaw7gu6wfrjiyka==$0DAOImpl extends GeneralDAOImpl<Bin$tiauzkdqaw7gu6wfrjiyka==$0Po> implements Bin$tiauzkdqaw7gu6wfrjiyka==$0DAO { 
	public static final Bin$tiauzkdqaw7gu6wfrjiyka==$0DAOImpl INSTANCE = new Bin$tiauzkdqaw7gu6wfrjiyka==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$TIAUZKDQAW7GU6WFRJIYKA==$0"; 

	public Bin$tiauzkdqaw7gu6wfrjiyka==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$tiauzkdqaw7gu6wfrjiyka==$0Po> CONVERTER = new MapConverter<Bin$tiauzkdqaw7gu6wfrjiyka==$0Po>() { 
 
		@Override 
		public Bin$tiauzkdqaw7gu6wfrjiyka==$0Po convert(final DataObject dataObject) { 
			final Bin$tiauzkdqaw7gu6wfrjiyka==$0Po bin$tiauzkdqaw7gu6wfrjiyka==$0Po = new Bin$tiauzkdqaw7gu6wfrjiyka==$0Po(); 
			return bin$tiauzkdqaw7gu6wfrjiyka==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$tiauzkdqaw7gu6wfrjiyka==$0Po bin$tiauzkdqaw7gu6wfrjiyka==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$tiauzkdqaw7gu6wfrjiyka==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$tiauzkdqaw7gu6wfrjiyka==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
