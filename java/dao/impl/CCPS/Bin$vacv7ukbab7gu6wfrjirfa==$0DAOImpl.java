package com.doc.common.dao.impl; 
 
public class Bin$vacv7ukbab7gu6wfrjirfa==$0DAOImpl extends GeneralDAOImpl<Bin$vacv7ukbab7gu6wfrjirfa==$0Po> implements Bin$vacv7ukbab7gu6wfrjirfa==$0DAO { 
	public static final Bin$vacv7ukbab7gu6wfrjirfa==$0DAOImpl INSTANCE = new Bin$vacv7ukbab7gu6wfrjirfa==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$VACV7UKBAB7GU6WFRJIRFA==$0"; 

	public Bin$vacv7ukbab7gu6wfrjirfa==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$vacv7ukbab7gu6wfrjirfa==$0Po> CONVERTER = new MapConverter<Bin$vacv7ukbab7gu6wfrjirfa==$0Po>() { 
 
		@Override 
		public Bin$vacv7ukbab7gu6wfrjirfa==$0Po convert(final DataObject dataObject) { 
			final Bin$vacv7ukbab7gu6wfrjirfa==$0Po bin$vacv7ukbab7gu6wfrjirfa==$0Po = new Bin$vacv7ukbab7gu6wfrjirfa==$0Po(); 
			return bin$vacv7ukbab7gu6wfrjirfa==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$vacv7ukbab7gu6wfrjirfa==$0Po bin$vacv7ukbab7gu6wfrjirfa==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$vacv7ukbab7gu6wfrjirfa==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$vacv7ukbab7gu6wfrjirfa==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
