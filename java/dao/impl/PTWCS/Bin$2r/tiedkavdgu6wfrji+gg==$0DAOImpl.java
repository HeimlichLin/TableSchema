package com.doc.common.dao.impl; 
 
public class Bin$2r/tiedkavdgu6wfrji+gg==$0DAOImpl extends GeneralDAOImpl<Bin$2r/tiedkavdgu6wfrji+gg==$0Po> implements Bin$2r/tiedkavdgu6wfrji+gg==$0DAO { 
	public static final Bin$2r/tiedkavdgu6wfrji+gg==$0DAOImpl INSTANCE = new Bin$2r/tiedkavdgu6wfrji+gg==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$2R/TIEDKAVDGU6WFRJI+GG==$0"; 

	public Bin$2r/tiedkavdgu6wfrji+gg==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$2r/tiedkavdgu6wfrji+gg==$0Po> CONVERTER = new MapConverter<Bin$2r/tiedkavdgu6wfrji+gg==$0Po>() { 
 
		@Override 
		public Bin$2r/tiedkavdgu6wfrji+gg==$0Po convert(final DataObject dataObject) { 
			final Bin$2r/tiedkavdgu6wfrji+gg==$0Po bin$2r/tiedkavdgu6wfrji+gg==$0Po = new Bin$2r/tiedkavdgu6wfrji+gg==$0Po(); 
			return bin$2r/tiedkavdgu6wfrji+gg==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$2r/tiedkavdgu6wfrji+gg==$0Po bin$2r/tiedkavdgu6wfrji+gg==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$2r/tiedkavdgu6wfrji+gg==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$2r/tiedkavdgu6wfrji+gg==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
