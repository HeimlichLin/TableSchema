package com.doc.common.dao.impl; 
 
public class Bin$vsvmdmp4aezgu6wfrjin3w==$0DAOImpl extends GeneralDAOImpl<Bin$vsvmdmp4aezgu6wfrjin3w==$0Po> implements Bin$vsvmdmp4aezgu6wfrjin3w==$0DAO { 
	public static final Bin$vsvmdmp4aezgu6wfrjin3w==$0DAOImpl INSTANCE = new Bin$vsvmdmp4aezgu6wfrjin3w==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$VSVMDMP4AEZGU6WFRJIN3W==$0"; 

	public Bin$vsvmdmp4aezgu6wfrjin3w==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$vsvmdmp4aezgu6wfrjin3w==$0Po> CONVERTER = new MapConverter<Bin$vsvmdmp4aezgu6wfrjin3w==$0Po>() { 
 
		@Override 
		public Bin$vsvmdmp4aezgu6wfrjin3w==$0Po convert(final DataObject dataObject) { 
			final Bin$vsvmdmp4aezgu6wfrjin3w==$0Po bin$vsvmdmp4aezgu6wfrjin3w==$0Po = new Bin$vsvmdmp4aezgu6wfrjin3w==$0Po(); 
			return bin$vsvmdmp4aezgu6wfrjin3w==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$vsvmdmp4aezgu6wfrjin3w==$0Po bin$vsvmdmp4aezgu6wfrjin3w==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$vsvmdmp4aezgu6wfrjin3w==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$vsvmdmp4aezgu6wfrjin3w==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
