package com.doc.common.dao.impl; 
 
public class Bin$tiauzkaiaw7gu6wfrjiyka==$0DAOImpl extends GeneralDAOImpl<Bin$tiauzkaiaw7gu6wfrjiyka==$0Po> implements Bin$tiauzkaiaw7gu6wfrjiyka==$0DAO { 
	public static final Bin$tiauzkaiaw7gu6wfrjiyka==$0DAOImpl INSTANCE = new Bin$tiauzkaiaw7gu6wfrjiyka==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$TIAUZKAIAW7GU6WFRJIYKA==$0"; 

	public Bin$tiauzkaiaw7gu6wfrjiyka==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$tiauzkaiaw7gu6wfrjiyka==$0Po> CONVERTER = new MapConverter<Bin$tiauzkaiaw7gu6wfrjiyka==$0Po>() { 
 
		@Override 
		public Bin$tiauzkaiaw7gu6wfrjiyka==$0Po convert(final DataObject dataObject) { 
			final Bin$tiauzkaiaw7gu6wfrjiyka==$0Po bin$tiauzkaiaw7gu6wfrjiyka==$0Po = new Bin$tiauzkaiaw7gu6wfrjiyka==$0Po(); 
			return bin$tiauzkaiaw7gu6wfrjiyka==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$tiauzkaiaw7gu6wfrjiyka==$0Po bin$tiauzkaiaw7gu6wfrjiyka==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$tiauzkaiaw7gu6wfrjiyka==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$tiauzkaiaw7gu6wfrjiyka==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
