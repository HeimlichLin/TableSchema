package com.doc.common.dao.impl; 
 
public class Bin$vbgiztp+auzgu6wfrjkxfa==$0DAOImpl extends GeneralDAOImpl<Bin$vbgiztp+auzgu6wfrjkxfa==$0Po> implements Bin$vbgiztp+auzgu6wfrjkxfa==$0DAO { 
	public static final Bin$vbgiztp+auzgu6wfrjkxfa==$0DAOImpl INSTANCE = new Bin$vbgiztp+auzgu6wfrjkxfa==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$VBGIZTP+AUZGU6WFRJKXFA==$0"; 

	public Bin$vbgiztp+auzgu6wfrjkxfa==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$vbgiztp+auzgu6wfrjkxfa==$0Po> CONVERTER = new MapConverter<Bin$vbgiztp+auzgu6wfrjkxfa==$0Po>() { 
 
		@Override 
		public Bin$vbgiztp+auzgu6wfrjkxfa==$0Po convert(final DataObject dataObject) { 
			final Bin$vbgiztp+auzgu6wfrjkxfa==$0Po bin$vbgiztp+auzgu6wfrjkxfa==$0Po = new Bin$vbgiztp+auzgu6wfrjkxfa==$0Po(); 
			return bin$vbgiztp+auzgu6wfrjkxfa==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$vbgiztp+auzgu6wfrjkxfa==$0Po bin$vbgiztp+auzgu6wfrjkxfa==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$vbgiztp+auzgu6wfrjkxfa==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$vbgiztp+auzgu6wfrjkxfa==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
