package com.doc.common.dao.impl; 
 
public class Bin$2lqp0m3+aw7gu6wfrjjzfg==$0DAOImpl extends GeneralDAOImpl<Bin$2lqp0m3+aw7gu6wfrjjzfg==$0Po> implements Bin$2lqp0m3+aw7gu6wfrjjzfg==$0DAO { 
	public static final Bin$2lqp0m3+aw7gu6wfrjjzfg==$0DAOImpl INSTANCE = new Bin$2lqp0m3+aw7gu6wfrjjzfg==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$2LQP0M3+AW7GU6WFRJJZFG==$0"; 

	public Bin$2lqp0m3+aw7gu6wfrjjzfg==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$2lqp0m3+aw7gu6wfrjjzfg==$0Po> CONVERTER = new MapConverter<Bin$2lqp0m3+aw7gu6wfrjjzfg==$0Po>() { 
 
		@Override 
		public Bin$2lqp0m3+aw7gu6wfrjjzfg==$0Po convert(final DataObject dataObject) { 
			final Bin$2lqp0m3+aw7gu6wfrjjzfg==$0Po bin$2lqp0m3+aw7gu6wfrjjzfg==$0Po = new Bin$2lqp0m3+aw7gu6wfrjjzfg==$0Po(); 
			return bin$2lqp0m3+aw7gu6wfrjjzfg==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$2lqp0m3+aw7gu6wfrjjzfg==$0Po bin$2lqp0m3+aw7gu6wfrjjzfg==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$2lqp0m3+aw7gu6wfrjjzfg==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$2lqp0m3+aw7gu6wfrjjzfg==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
