package com.doc.common.dao.impl; 
 
public class Bin$visylodvaajgu6wfrjk5fa==$0DAOImpl extends GeneralDAOImpl<Bin$visylodvaajgu6wfrjk5fa==$0Po> implements Bin$visylodvaajgu6wfrjk5fa==$0DAO { 
	public static final Bin$visylodvaajgu6wfrjk5fa==$0DAOImpl INSTANCE = new Bin$visylodvaajgu6wfrjk5fa==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$VISYLODVAAJGU6WFRJK5FA==$0"; 

	public Bin$visylodvaajgu6wfrjk5fa==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$visylodvaajgu6wfrjk5fa==$0Po> CONVERTER = new MapConverter<Bin$visylodvaajgu6wfrjk5fa==$0Po>() { 
 
		@Override 
		public Bin$visylodvaajgu6wfrjk5fa==$0Po convert(final DataObject dataObject) { 
			final Bin$visylodvaajgu6wfrjk5fa==$0Po bin$visylodvaajgu6wfrjk5fa==$0Po = new Bin$visylodvaajgu6wfrjk5fa==$0Po(); 
			return bin$visylodvaajgu6wfrjk5fa==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$visylodvaajgu6wfrjk5fa==$0Po bin$visylodvaajgu6wfrjk5fa==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$visylodvaajgu6wfrjk5fa==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$visylodvaajgu6wfrjk5fa==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
