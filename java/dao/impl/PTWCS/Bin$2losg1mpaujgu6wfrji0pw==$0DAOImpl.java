package com.doc.common.dao.impl; 
 
public class Bin$2losg1mpaujgu6wfrji0pw==$0DAOImpl extends GeneralDAOImpl<Bin$2losg1mpaujgu6wfrji0pw==$0Po> implements Bin$2losg1mpaujgu6wfrji0pw==$0DAO { 
	public static final Bin$2losg1mpaujgu6wfrji0pw==$0DAOImpl INSTANCE = new Bin$2losg1mpaujgu6wfrji0pw==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$2LOSG1MPAUJGU6WFRJI0PW==$0"; 

	public Bin$2losg1mpaujgu6wfrji0pw==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$2losg1mpaujgu6wfrji0pw==$0Po> CONVERTER = new MapConverter<Bin$2losg1mpaujgu6wfrji0pw==$0Po>() { 
 
		@Override 
		public Bin$2losg1mpaujgu6wfrji0pw==$0Po convert(final DataObject dataObject) { 
			final Bin$2losg1mpaujgu6wfrji0pw==$0Po bin$2losg1mpaujgu6wfrji0pw==$0Po = new Bin$2losg1mpaujgu6wfrji0pw==$0Po(); 
			return bin$2losg1mpaujgu6wfrji0pw==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$2losg1mpaujgu6wfrji0pw==$0Po bin$2losg1mpaujgu6wfrji0pw==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$2losg1mpaujgu6wfrji0pw==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$2losg1mpaujgu6wfrji0pw==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
