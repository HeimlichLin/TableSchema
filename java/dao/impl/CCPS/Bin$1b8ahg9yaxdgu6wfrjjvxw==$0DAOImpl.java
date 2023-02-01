package com.doc.common.dao.impl; 
 
public class Bin$1b8ahg9yaxdgu6wfrjjvxw==$0DAOImpl extends GeneralDAOImpl<Bin$1b8ahg9yaxdgu6wfrjjvxw==$0Po> implements Bin$1b8ahg9yaxdgu6wfrjjvxw==$0DAO { 
	public static final Bin$1b8ahg9yaxdgu6wfrjjvxw==$0DAOImpl INSTANCE = new Bin$1b8ahg9yaxdgu6wfrjjvxw==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$1B8AHG9YAXDGU6WFRJJVXW==$0"; 

	public Bin$1b8ahg9yaxdgu6wfrjjvxw==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$1b8ahg9yaxdgu6wfrjjvxw==$0Po> CONVERTER = new MapConverter<Bin$1b8ahg9yaxdgu6wfrjjvxw==$0Po>() { 
 
		@Override 
		public Bin$1b8ahg9yaxdgu6wfrjjvxw==$0Po convert(final DataObject dataObject) { 
			final Bin$1b8ahg9yaxdgu6wfrjjvxw==$0Po bin$1b8ahg9yaxdgu6wfrjjvxw==$0Po = new Bin$1b8ahg9yaxdgu6wfrjjvxw==$0Po(); 
			return bin$1b8ahg9yaxdgu6wfrjjvxw==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$1b8ahg9yaxdgu6wfrjjvxw==$0Po bin$1b8ahg9yaxdgu6wfrjjvxw==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$1b8ahg9yaxdgu6wfrjjvxw==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$1b8ahg9yaxdgu6wfrjjvxw==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
