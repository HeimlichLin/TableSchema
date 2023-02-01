package com.doc.common.dao.impl; 
 
public class UsrreltDAOImpl extends GeneralDAOImpl<UsrreltPo> implements UsrreltDAO { 
	public static final UsrreltDAOImpl INSTANCE = new UsrreltDAOImpl(); 
	public static final String TABLENAME = "USRRELT"; 

	public UsrreltDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<UsrreltPo> CONVERTER = new MapConverter<UsrreltPo>() { 
 
		@Override 
		public UsrreltPo convert(final DataObject dataObject) { 
			final UsrreltPo usrreltPo = new UsrreltPo(); 
			usrreltPo.setUserId(dataObject.getString(UsrreltPo.COLUMNS.USER_ID.name())); 
			usrreltPo.setBfNo(dataObject.getString(UsrreltPo.COLUMNS.BF_NO.name())); 
			return usrreltPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final UsrreltPo usrreltPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(UsrreltPo.COLUMNS.USER_ID.name(), usrreltPo.getUserId()); 
			dataObject.setValue(UsrreltPo.COLUMNS.BF_NO.name(), usrreltPo.getBfNo()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<UsrreltPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(UsrreltPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(UsrreltPo.COLUMNS.BF_NO.name(), po.getBfNo()); 
		return sqlWhere; 
	} 
 
} 
