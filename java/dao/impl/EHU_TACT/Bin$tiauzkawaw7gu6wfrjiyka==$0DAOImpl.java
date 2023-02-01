package com.doc.common.dao.impl; 
 
public class Bin$tiauzkawaw7gu6wfrjiyka==$0DAOImpl extends GeneralDAOImpl<Bin$tiauzkawaw7gu6wfrjiyka==$0Po> implements Bin$tiauzkawaw7gu6wfrjiyka==$0DAO { 
	public static final Bin$tiauzkawaw7gu6wfrjiyka==$0DAOImpl INSTANCE = new Bin$tiauzkawaw7gu6wfrjiyka==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$TIAUZKAWAW7GU6WFRJIYKA==$0"; 

	public Bin$tiauzkawaw7gu6wfrjiyka==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$tiauzkawaw7gu6wfrjiyka==$0Po> CONVERTER = new MapConverter<Bin$tiauzkawaw7gu6wfrjiyka==$0Po>() { 
 
		@Override 
		public Bin$tiauzkawaw7gu6wfrjiyka==$0Po convert(final DataObject dataObject) { 
			final Bin$tiauzkawaw7gu6wfrjiyka==$0Po bin$tiauzkawaw7gu6wfrjiyka==$0Po = new Bin$tiauzkawaw7gu6wfrjiyka==$0Po(); 
			return bin$tiauzkawaw7gu6wfrjiyka==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$tiauzkawaw7gu6wfrjiyka==$0Po bin$tiauzkawaw7gu6wfrjiyka==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$tiauzkawaw7gu6wfrjiyka==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$tiauzkawaw7gu6wfrjiyka==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
