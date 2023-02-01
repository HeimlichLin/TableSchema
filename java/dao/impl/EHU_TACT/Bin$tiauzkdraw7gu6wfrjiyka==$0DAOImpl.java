package com.doc.common.dao.impl; 
 
public class Bin$tiauzkdraw7gu6wfrjiyka==$0DAOImpl extends GeneralDAOImpl<Bin$tiauzkdraw7gu6wfrjiyka==$0Po> implements Bin$tiauzkdraw7gu6wfrjiyka==$0DAO { 
	public static final Bin$tiauzkdraw7gu6wfrjiyka==$0DAOImpl INSTANCE = new Bin$tiauzkdraw7gu6wfrjiyka==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$TIAUZKDRAW7GU6WFRJIYKA==$0"; 

	public Bin$tiauzkdraw7gu6wfrjiyka==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$tiauzkdraw7gu6wfrjiyka==$0Po> CONVERTER = new MapConverter<Bin$tiauzkdraw7gu6wfrjiyka==$0Po>() { 
 
		@Override 
		public Bin$tiauzkdraw7gu6wfrjiyka==$0Po convert(final DataObject dataObject) { 
			final Bin$tiauzkdraw7gu6wfrjiyka==$0Po bin$tiauzkdraw7gu6wfrjiyka==$0Po = new Bin$tiauzkdraw7gu6wfrjiyka==$0Po(); 
			return bin$tiauzkdraw7gu6wfrjiyka==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$tiauzkdraw7gu6wfrjiyka==$0Po bin$tiauzkdraw7gu6wfrjiyka==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$tiauzkdraw7gu6wfrjiyka==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$tiauzkdraw7gu6wfrjiyka==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
