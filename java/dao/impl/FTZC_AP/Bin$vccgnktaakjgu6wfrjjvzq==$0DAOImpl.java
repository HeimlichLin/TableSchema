package com.doc.common.dao.impl; 
 
public class Bin$vccgnktaakjgu6wfrjjvzq==$0DAOImpl extends GeneralDAOImpl<Bin$vccgnktaakjgu6wfrjjvzq==$0Po> implements Bin$vccgnktaakjgu6wfrjjvzq==$0DAO { 
	public static final Bin$vccgnktaakjgu6wfrjjvzq==$0DAOImpl INSTANCE = new Bin$vccgnktaakjgu6wfrjjvzq==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$VCCGNKTAAKJGU6WFRJJVZQ==$0"; 

	public Bin$vccgnktaakjgu6wfrjjvzq==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$vccgnktaakjgu6wfrjjvzq==$0Po> CONVERTER = new MapConverter<Bin$vccgnktaakjgu6wfrjjvzq==$0Po>() { 
 
		@Override 
		public Bin$vccgnktaakjgu6wfrjjvzq==$0Po convert(final DataObject dataObject) { 
			final Bin$vccgnktaakjgu6wfrjjvzq==$0Po bin$vccgnktaakjgu6wfrjjvzq==$0Po = new Bin$vccgnktaakjgu6wfrjjvzq==$0Po(); 
			return bin$vccgnktaakjgu6wfrjjvzq==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$vccgnktaakjgu6wfrjjvzq==$0Po bin$vccgnktaakjgu6wfrjjvzq==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$vccgnktaakjgu6wfrjjvzq==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$vccgnktaakjgu6wfrjjvzq==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
