package com.doc.common.dao.impl; 
 
public class Bin$vbgiztp8auzgu6wfrjkxfa==$0DAOImpl extends GeneralDAOImpl<Bin$vbgiztp8auzgu6wfrjkxfa==$0Po> implements Bin$vbgiztp8auzgu6wfrjkxfa==$0DAO { 
	public static final Bin$vbgiztp8auzgu6wfrjkxfa==$0DAOImpl INSTANCE = new Bin$vbgiztp8auzgu6wfrjkxfa==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$VBGIZTP8AUZGU6WFRJKXFA==$0"; 

	public Bin$vbgiztp8auzgu6wfrjkxfa==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$vbgiztp8auzgu6wfrjkxfa==$0Po> CONVERTER = new MapConverter<Bin$vbgiztp8auzgu6wfrjkxfa==$0Po>() { 
 
		@Override 
		public Bin$vbgiztp8auzgu6wfrjkxfa==$0Po convert(final DataObject dataObject) { 
			final Bin$vbgiztp8auzgu6wfrjkxfa==$0Po bin$vbgiztp8auzgu6wfrjkxfa==$0Po = new Bin$vbgiztp8auzgu6wfrjkxfa==$0Po(); 
			return bin$vbgiztp8auzgu6wfrjkxfa==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$vbgiztp8auzgu6wfrjkxfa==$0Po bin$vbgiztp8auzgu6wfrjkxfa==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$vbgiztp8auzgu6wfrjkxfa==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$vbgiztp8auzgu6wfrjkxfa==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
