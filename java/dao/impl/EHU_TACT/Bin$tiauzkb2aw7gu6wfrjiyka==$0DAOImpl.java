package com.doc.common.dao.impl; 
 
public class Bin$tiauzkb2aw7gu6wfrjiyka==$0DAOImpl extends GeneralDAOImpl<Bin$tiauzkb2aw7gu6wfrjiyka==$0Po> implements Bin$tiauzkb2aw7gu6wfrjiyka==$0DAO { 
	public static final Bin$tiauzkb2aw7gu6wfrjiyka==$0DAOImpl INSTANCE = new Bin$tiauzkb2aw7gu6wfrjiyka==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$TIAUZKB2AW7GU6WFRJIYKA==$0"; 

	public Bin$tiauzkb2aw7gu6wfrjiyka==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$tiauzkb2aw7gu6wfrjiyka==$0Po> CONVERTER = new MapConverter<Bin$tiauzkb2aw7gu6wfrjiyka==$0Po>() { 
 
		@Override 
		public Bin$tiauzkb2aw7gu6wfrjiyka==$0Po convert(final DataObject dataObject) { 
			final Bin$tiauzkb2aw7gu6wfrjiyka==$0Po bin$tiauzkb2aw7gu6wfrjiyka==$0Po = new Bin$tiauzkb2aw7gu6wfrjiyka==$0Po(); 
			return bin$tiauzkb2aw7gu6wfrjiyka==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$tiauzkb2aw7gu6wfrjiyka==$0Po bin$tiauzkb2aw7gu6wfrjiyka==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$tiauzkb2aw7gu6wfrjiyka==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$tiauzkb2aw7gu6wfrjiyka==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
