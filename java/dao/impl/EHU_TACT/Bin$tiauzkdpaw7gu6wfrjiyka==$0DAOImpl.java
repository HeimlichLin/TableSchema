package com.doc.common.dao.impl; 
 
public class Bin$tiauzkdpaw7gu6wfrjiyka==$0DAOImpl extends GeneralDAOImpl<Bin$tiauzkdpaw7gu6wfrjiyka==$0Po> implements Bin$tiauzkdpaw7gu6wfrjiyka==$0DAO { 
	public static final Bin$tiauzkdpaw7gu6wfrjiyka==$0DAOImpl INSTANCE = new Bin$tiauzkdpaw7gu6wfrjiyka==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$TIAUZKDPAW7GU6WFRJIYKA==$0"; 

	public Bin$tiauzkdpaw7gu6wfrjiyka==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$tiauzkdpaw7gu6wfrjiyka==$0Po> CONVERTER = new MapConverter<Bin$tiauzkdpaw7gu6wfrjiyka==$0Po>() { 
 
		@Override 
		public Bin$tiauzkdpaw7gu6wfrjiyka==$0Po convert(final DataObject dataObject) { 
			final Bin$tiauzkdpaw7gu6wfrjiyka==$0Po bin$tiauzkdpaw7gu6wfrjiyka==$0Po = new Bin$tiauzkdpaw7gu6wfrjiyka==$0Po(); 
			return bin$tiauzkdpaw7gu6wfrjiyka==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$tiauzkdpaw7gu6wfrjiyka==$0Po bin$tiauzkdpaw7gu6wfrjiyka==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$tiauzkdpaw7gu6wfrjiyka==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$tiauzkdpaw7gu6wfrjiyka==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
