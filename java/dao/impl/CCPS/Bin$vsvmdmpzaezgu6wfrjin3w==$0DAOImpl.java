package com.doc.common.dao.impl; 
 
public class Bin$vsvmdmpzaezgu6wfrjin3w==$0DAOImpl extends GeneralDAOImpl<Bin$vsvmdmpzaezgu6wfrjin3w==$0Po> implements Bin$vsvmdmpzaezgu6wfrjin3w==$0DAO { 
	public static final Bin$vsvmdmpzaezgu6wfrjin3w==$0DAOImpl INSTANCE = new Bin$vsvmdmpzaezgu6wfrjin3w==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$VSVMDMPZAEZGU6WFRJIN3W==$0"; 

	public Bin$vsvmdmpzaezgu6wfrjin3w==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$vsvmdmpzaezgu6wfrjin3w==$0Po> CONVERTER = new MapConverter<Bin$vsvmdmpzaezgu6wfrjin3w==$0Po>() { 
 
		@Override 
		public Bin$vsvmdmpzaezgu6wfrjin3w==$0Po convert(final DataObject dataObject) { 
			final Bin$vsvmdmpzaezgu6wfrjin3w==$0Po bin$vsvmdmpzaezgu6wfrjin3w==$0Po = new Bin$vsvmdmpzaezgu6wfrjin3w==$0Po(); 
			return bin$vsvmdmpzaezgu6wfrjin3w==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$vsvmdmpzaezgu6wfrjin3w==$0Po bin$vsvmdmpzaezgu6wfrjin3w==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$vsvmdmpzaezgu6wfrjin3w==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$vsvmdmpzaezgu6wfrjin3w==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
