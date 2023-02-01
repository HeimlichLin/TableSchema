package com.doc.common.dao.impl; 
 
public class Bin$tiauzkcdaw7gu6wfrjiyka==$0DAOImpl extends GeneralDAOImpl<Bin$tiauzkcdaw7gu6wfrjiyka==$0Po> implements Bin$tiauzkcdaw7gu6wfrjiyka==$0DAO { 
	public static final Bin$tiauzkcdaw7gu6wfrjiyka==$0DAOImpl INSTANCE = new Bin$tiauzkcdaw7gu6wfrjiyka==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$TIAUZKCDAW7GU6WFRJIYKA==$0"; 

	public Bin$tiauzkcdaw7gu6wfrjiyka==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$tiauzkcdaw7gu6wfrjiyka==$0Po> CONVERTER = new MapConverter<Bin$tiauzkcdaw7gu6wfrjiyka==$0Po>() { 
 
		@Override 
		public Bin$tiauzkcdaw7gu6wfrjiyka==$0Po convert(final DataObject dataObject) { 
			final Bin$tiauzkcdaw7gu6wfrjiyka==$0Po bin$tiauzkcdaw7gu6wfrjiyka==$0Po = new Bin$tiauzkcdaw7gu6wfrjiyka==$0Po(); 
			return bin$tiauzkcdaw7gu6wfrjiyka==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$tiauzkcdaw7gu6wfrjiyka==$0Po bin$tiauzkcdaw7gu6wfrjiyka==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$tiauzkcdaw7gu6wfrjiyka==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$tiauzkcdaw7gu6wfrjiyka==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
