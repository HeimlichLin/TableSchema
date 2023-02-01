package com.doc.common.dao.impl; 
 
public class Bin$visylodzaajgu6wfrjk5fa==$0DAOImpl extends GeneralDAOImpl<Bin$visylodzaajgu6wfrjk5fa==$0Po> implements Bin$visylodzaajgu6wfrjk5fa==$0DAO { 
	public static final Bin$visylodzaajgu6wfrjk5fa==$0DAOImpl INSTANCE = new Bin$visylodzaajgu6wfrjk5fa==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$VISYLODZAAJGU6WFRJK5FA==$0"; 

	public Bin$visylodzaajgu6wfrjk5fa==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$visylodzaajgu6wfrjk5fa==$0Po> CONVERTER = new MapConverter<Bin$visylodzaajgu6wfrjk5fa==$0Po>() { 
 
		@Override 
		public Bin$visylodzaajgu6wfrjk5fa==$0Po convert(final DataObject dataObject) { 
			final Bin$visylodzaajgu6wfrjk5fa==$0Po bin$visylodzaajgu6wfrjk5fa==$0Po = new Bin$visylodzaajgu6wfrjk5fa==$0Po(); 
			return bin$visylodzaajgu6wfrjk5fa==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$visylodzaajgu6wfrjk5fa==$0Po bin$visylodzaajgu6wfrjk5fa==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$visylodzaajgu6wfrjk5fa==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$visylodzaajgu6wfrjk5fa==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
