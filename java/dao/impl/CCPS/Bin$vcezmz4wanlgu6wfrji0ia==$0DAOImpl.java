package com.doc.common.dao.impl; 
 
public class Bin$vcezmz4wanlgu6wfrji0ia==$0DAOImpl extends GeneralDAOImpl<Bin$vcezmz4wanlgu6wfrji0ia==$0Po> implements Bin$vcezmz4wanlgu6wfrji0ia==$0DAO { 
	public static final Bin$vcezmz4wanlgu6wfrji0ia==$0DAOImpl INSTANCE = new Bin$vcezmz4wanlgu6wfrji0ia==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$VCEZMZ4WANLGU6WFRJI0IA==$0"; 

	public Bin$vcezmz4wanlgu6wfrji0ia==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$vcezmz4wanlgu6wfrji0ia==$0Po> CONVERTER = new MapConverter<Bin$vcezmz4wanlgu6wfrji0ia==$0Po>() { 
 
		@Override 
		public Bin$vcezmz4wanlgu6wfrji0ia==$0Po convert(final DataObject dataObject) { 
			final Bin$vcezmz4wanlgu6wfrji0ia==$0Po bin$vcezmz4wanlgu6wfrji0ia==$0Po = new Bin$vcezmz4wanlgu6wfrji0ia==$0Po(); 
			return bin$vcezmz4wanlgu6wfrji0ia==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$vcezmz4wanlgu6wfrji0ia==$0Po bin$vcezmz4wanlgu6wfrji0ia==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$vcezmz4wanlgu6wfrji0ia==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$vcezmz4wanlgu6wfrji0ia==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 