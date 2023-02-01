package com.doc.common.dao.impl; 
 
public class Bin$visylodxaajgu6wfrjk5fa==$0DAOImpl extends GeneralDAOImpl<Bin$visylodxaajgu6wfrjk5fa==$0Po> implements Bin$visylodxaajgu6wfrjk5fa==$0DAO { 
	public static final Bin$visylodxaajgu6wfrjk5fa==$0DAOImpl INSTANCE = new Bin$visylodxaajgu6wfrjk5fa==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$VISYLODXAAJGU6WFRJK5FA==$0"; 

	public Bin$visylodxaajgu6wfrjk5fa==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$visylodxaajgu6wfrjk5fa==$0Po> CONVERTER = new MapConverter<Bin$visylodxaajgu6wfrjk5fa==$0Po>() { 
 
		@Override 
		public Bin$visylodxaajgu6wfrjk5fa==$0Po convert(final DataObject dataObject) { 
			final Bin$visylodxaajgu6wfrjk5fa==$0Po bin$visylodxaajgu6wfrjk5fa==$0Po = new Bin$visylodxaajgu6wfrjk5fa==$0Po(); 
			return bin$visylodxaajgu6wfrjk5fa==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$visylodxaajgu6wfrjk5fa==$0Po bin$visylodxaajgu6wfrjk5fa==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$visylodxaajgu6wfrjk5fa==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$visylodxaajgu6wfrjk5fa==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
