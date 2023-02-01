package com.doc.common.dao.impl; 
 
public class Bin$tiauzkcnaw7gu6wfrjiyka==$0DAOImpl extends GeneralDAOImpl<Bin$tiauzkcnaw7gu6wfrjiyka==$0Po> implements Bin$tiauzkcnaw7gu6wfrjiyka==$0DAO { 
	public static final Bin$tiauzkcnaw7gu6wfrjiyka==$0DAOImpl INSTANCE = new Bin$tiauzkcnaw7gu6wfrjiyka==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$TIAUZKCNAW7GU6WFRJIYKA==$0"; 

	public Bin$tiauzkcnaw7gu6wfrjiyka==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$tiauzkcnaw7gu6wfrjiyka==$0Po> CONVERTER = new MapConverter<Bin$tiauzkcnaw7gu6wfrjiyka==$0Po>() { 
 
		@Override 
		public Bin$tiauzkcnaw7gu6wfrjiyka==$0Po convert(final DataObject dataObject) { 
			final Bin$tiauzkcnaw7gu6wfrjiyka==$0Po bin$tiauzkcnaw7gu6wfrjiyka==$0Po = new Bin$tiauzkcnaw7gu6wfrjiyka==$0Po(); 
			return bin$tiauzkcnaw7gu6wfrjiyka==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$tiauzkcnaw7gu6wfrjiyka==$0Po bin$tiauzkcnaw7gu6wfrjiyka==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$tiauzkcnaw7gu6wfrjiyka==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$tiauzkcnaw7gu6wfrjiyka==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
