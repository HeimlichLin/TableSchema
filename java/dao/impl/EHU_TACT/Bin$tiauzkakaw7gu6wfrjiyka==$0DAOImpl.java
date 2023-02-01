package com.doc.common.dao.impl; 
 
public class Bin$tiauzkakaw7gu6wfrjiyka==$0DAOImpl extends GeneralDAOImpl<Bin$tiauzkakaw7gu6wfrjiyka==$0Po> implements Bin$tiauzkakaw7gu6wfrjiyka==$0DAO { 
	public static final Bin$tiauzkakaw7gu6wfrjiyka==$0DAOImpl INSTANCE = new Bin$tiauzkakaw7gu6wfrjiyka==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$TIAUZKAKAW7GU6WFRJIYKA==$0"; 

	public Bin$tiauzkakaw7gu6wfrjiyka==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$tiauzkakaw7gu6wfrjiyka==$0Po> CONVERTER = new MapConverter<Bin$tiauzkakaw7gu6wfrjiyka==$0Po>() { 
 
		@Override 
		public Bin$tiauzkakaw7gu6wfrjiyka==$0Po convert(final DataObject dataObject) { 
			final Bin$tiauzkakaw7gu6wfrjiyka==$0Po bin$tiauzkakaw7gu6wfrjiyka==$0Po = new Bin$tiauzkakaw7gu6wfrjiyka==$0Po(); 
			return bin$tiauzkakaw7gu6wfrjiyka==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$tiauzkakaw7gu6wfrjiyka==$0Po bin$tiauzkakaw7gu6wfrjiyka==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$tiauzkakaw7gu6wfrjiyka==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$tiauzkakaw7gu6wfrjiyka==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
