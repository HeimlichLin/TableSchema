package com.doc.common.dao.impl; 
 
public class Bin$tiauzj/oaw7gu6wfrjiyka==$0DAOImpl extends GeneralDAOImpl<Bin$tiauzj/oaw7gu6wfrjiyka==$0Po> implements Bin$tiauzj/oaw7gu6wfrjiyka==$0DAO { 
	public static final Bin$tiauzj/oaw7gu6wfrjiyka==$0DAOImpl INSTANCE = new Bin$tiauzj/oaw7gu6wfrjiyka==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$TIAUZJ/OAW7GU6WFRJIYKA==$0"; 

	public Bin$tiauzj/oaw7gu6wfrjiyka==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$tiauzj/oaw7gu6wfrjiyka==$0Po> CONVERTER = new MapConverter<Bin$tiauzj/oaw7gu6wfrjiyka==$0Po>() { 
 
		@Override 
		public Bin$tiauzj/oaw7gu6wfrjiyka==$0Po convert(final DataObject dataObject) { 
			final Bin$tiauzj/oaw7gu6wfrjiyka==$0Po bin$tiauzj/oaw7gu6wfrjiyka==$0Po = new Bin$tiauzj/oaw7gu6wfrjiyka==$0Po(); 
			return bin$tiauzj/oaw7gu6wfrjiyka==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$tiauzj/oaw7gu6wfrjiyka==$0Po bin$tiauzj/oaw7gu6wfrjiyka==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$tiauzj/oaw7gu6wfrjiyka==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$tiauzj/oaw7gu6wfrjiyka==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
