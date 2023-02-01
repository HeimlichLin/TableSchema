package com.doc.common.dao.impl; 
 
public class Bin$xmuywfkcan7gu6wfrjkq1w==$0DAOImpl extends GeneralDAOImpl<Bin$xmuywfkcan7gu6wfrjkq1w==$0Po> implements Bin$xmuywfkcan7gu6wfrjkq1w==$0DAO { 
	public static final Bin$xmuywfkcan7gu6wfrjkq1w==$0DAOImpl INSTANCE = new Bin$xmuywfkcan7gu6wfrjkq1w==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$XMUYWFKCAN7GU6WFRJKQ1W==$0"; 

	public Bin$xmuywfkcan7gu6wfrjkq1w==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$xmuywfkcan7gu6wfrjkq1w==$0Po> CONVERTER = new MapConverter<Bin$xmuywfkcan7gu6wfrjkq1w==$0Po>() { 
 
		@Override 
		public Bin$xmuywfkcan7gu6wfrjkq1w==$0Po convert(final DataObject dataObject) { 
			final Bin$xmuywfkcan7gu6wfrjkq1w==$0Po bin$xmuywfkcan7gu6wfrjkq1w==$0Po = new Bin$xmuywfkcan7gu6wfrjkq1w==$0Po(); 
			return bin$xmuywfkcan7gu6wfrjkq1w==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$xmuywfkcan7gu6wfrjkq1w==$0Po bin$xmuywfkcan7gu6wfrjkq1w==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$xmuywfkcan7gu6wfrjkq1w==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$xmuywfkcan7gu6wfrjkq1w==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
