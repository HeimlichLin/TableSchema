package com.doc.common.dao.impl; 
 
public class Bin$tiauzkaoaw7gu6wfrjiyka==$0DAOImpl extends GeneralDAOImpl<Bin$tiauzkaoaw7gu6wfrjiyka==$0Po> implements Bin$tiauzkaoaw7gu6wfrjiyka==$0DAO { 
	public static final Bin$tiauzkaoaw7gu6wfrjiyka==$0DAOImpl INSTANCE = new Bin$tiauzkaoaw7gu6wfrjiyka==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$TIAUZKAOAW7GU6WFRJIYKA==$0"; 

	public Bin$tiauzkaoaw7gu6wfrjiyka==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$tiauzkaoaw7gu6wfrjiyka==$0Po> CONVERTER = new MapConverter<Bin$tiauzkaoaw7gu6wfrjiyka==$0Po>() { 
 
		@Override 
		public Bin$tiauzkaoaw7gu6wfrjiyka==$0Po convert(final DataObject dataObject) { 
			final Bin$tiauzkaoaw7gu6wfrjiyka==$0Po bin$tiauzkaoaw7gu6wfrjiyka==$0Po = new Bin$tiauzkaoaw7gu6wfrjiyka==$0Po(); 
			return bin$tiauzkaoaw7gu6wfrjiyka==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$tiauzkaoaw7gu6wfrjiyka==$0Po bin$tiauzkaoaw7gu6wfrjiyka==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$tiauzkaoaw7gu6wfrjiyka==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$tiauzkaoaw7gu6wfrjiyka==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
