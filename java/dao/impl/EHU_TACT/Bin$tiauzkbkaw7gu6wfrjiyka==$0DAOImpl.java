package com.doc.common.dao.impl; 
 
public class Bin$tiauzkbkaw7gu6wfrjiyka==$0DAOImpl extends GeneralDAOImpl<Bin$tiauzkbkaw7gu6wfrjiyka==$0Po> implements Bin$tiauzkbkaw7gu6wfrjiyka==$0DAO { 
	public static final Bin$tiauzkbkaw7gu6wfrjiyka==$0DAOImpl INSTANCE = new Bin$tiauzkbkaw7gu6wfrjiyka==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$TIAUZKBKAW7GU6WFRJIYKA==$0"; 

	public Bin$tiauzkbkaw7gu6wfrjiyka==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$tiauzkbkaw7gu6wfrjiyka==$0Po> CONVERTER = new MapConverter<Bin$tiauzkbkaw7gu6wfrjiyka==$0Po>() { 
 
		@Override 
		public Bin$tiauzkbkaw7gu6wfrjiyka==$0Po convert(final DataObject dataObject) { 
			final Bin$tiauzkbkaw7gu6wfrjiyka==$0Po bin$tiauzkbkaw7gu6wfrjiyka==$0Po = new Bin$tiauzkbkaw7gu6wfrjiyka==$0Po(); 
			return bin$tiauzkbkaw7gu6wfrjiyka==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$tiauzkbkaw7gu6wfrjiyka==$0Po bin$tiauzkbkaw7gu6wfrjiyka==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$tiauzkbkaw7gu6wfrjiyka==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$tiauzkbkaw7gu6wfrjiyka==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
