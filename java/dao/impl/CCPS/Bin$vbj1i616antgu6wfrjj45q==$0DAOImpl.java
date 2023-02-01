package com.doc.common.dao.impl; 
 
public class Bin$vbj1i616antgu6wfrjj45q==$0DAOImpl extends GeneralDAOImpl<Bin$vbj1i616antgu6wfrjj45q==$0Po> implements Bin$vbj1i616antgu6wfrjj45q==$0DAO { 
	public static final Bin$vbj1i616antgu6wfrjj45q==$0DAOImpl INSTANCE = new Bin$vbj1i616antgu6wfrjj45q==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$VBJ1I616ANTGU6WFRJJ45Q==$0"; 

	public Bin$vbj1i616antgu6wfrjj45q==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$vbj1i616antgu6wfrjj45q==$0Po> CONVERTER = new MapConverter<Bin$vbj1i616antgu6wfrjj45q==$0Po>() { 
 
		@Override 
		public Bin$vbj1i616antgu6wfrjj45q==$0Po convert(final DataObject dataObject) { 
			final Bin$vbj1i616antgu6wfrjj45q==$0Po bin$vbj1i616antgu6wfrjj45q==$0Po = new Bin$vbj1i616antgu6wfrjj45q==$0Po(); 
			return bin$vbj1i616antgu6wfrjj45q==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$vbj1i616antgu6wfrjj45q==$0Po bin$vbj1i616antgu6wfrjj45q==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$vbj1i616antgu6wfrjj45q==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$vbj1i616antgu6wfrjj45q==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
