package com.doc.common.dao.impl; 
 
public class Bin$2sqiltr6anjgu6wfrjl2mg==$0DAOImpl extends GeneralDAOImpl<Bin$2sqiltr6anjgu6wfrjl2mg==$0Po> implements Bin$2sqiltr6anjgu6wfrjl2mg==$0DAO { 
	public static final Bin$2sqiltr6anjgu6wfrjl2mg==$0DAOImpl INSTANCE = new Bin$2sqiltr6anjgu6wfrjl2mg==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$2SQILTR6ANJGU6WFRJL2MG==$0"; 

	public Bin$2sqiltr6anjgu6wfrjl2mg==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$2sqiltr6anjgu6wfrjl2mg==$0Po> CONVERTER = new MapConverter<Bin$2sqiltr6anjgu6wfrjl2mg==$0Po>() { 
 
		@Override 
		public Bin$2sqiltr6anjgu6wfrjl2mg==$0Po convert(final DataObject dataObject) { 
			final Bin$2sqiltr6anjgu6wfrjl2mg==$0Po bin$2sqiltr6anjgu6wfrjl2mg==$0Po = new Bin$2sqiltr6anjgu6wfrjl2mg==$0Po(); 
			return bin$2sqiltr6anjgu6wfrjl2mg==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$2sqiltr6anjgu6wfrjl2mg==$0Po bin$2sqiltr6anjgu6wfrjl2mg==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$2sqiltr6anjgu6wfrjl2mg==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$2sqiltr6anjgu6wfrjl2mg==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
