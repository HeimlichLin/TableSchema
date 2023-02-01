package com.doc.common.dao.impl; 
 
public class Bin$tiauzkd2aw7gu6wfrjiyka==$0DAOImpl extends GeneralDAOImpl<Bin$tiauzkd2aw7gu6wfrjiyka==$0Po> implements Bin$tiauzkd2aw7gu6wfrjiyka==$0DAO { 
	public static final Bin$tiauzkd2aw7gu6wfrjiyka==$0DAOImpl INSTANCE = new Bin$tiauzkd2aw7gu6wfrjiyka==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$TIAUZKD2AW7GU6WFRJIYKA==$0"; 

	public Bin$tiauzkd2aw7gu6wfrjiyka==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$tiauzkd2aw7gu6wfrjiyka==$0Po> CONVERTER = new MapConverter<Bin$tiauzkd2aw7gu6wfrjiyka==$0Po>() { 
 
		@Override 
		public Bin$tiauzkd2aw7gu6wfrjiyka==$0Po convert(final DataObject dataObject) { 
			final Bin$tiauzkd2aw7gu6wfrjiyka==$0Po bin$tiauzkd2aw7gu6wfrjiyka==$0Po = new Bin$tiauzkd2aw7gu6wfrjiyka==$0Po(); 
			return bin$tiauzkd2aw7gu6wfrjiyka==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$tiauzkd2aw7gu6wfrjiyka==$0Po bin$tiauzkd2aw7gu6wfrjiyka==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$tiauzkd2aw7gu6wfrjiyka==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$tiauzkd2aw7gu6wfrjiyka==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
