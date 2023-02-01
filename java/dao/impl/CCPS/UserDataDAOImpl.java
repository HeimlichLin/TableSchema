package com.doc.common.dao.impl; 
 
public class UserDataDAOImpl extends GeneralDAOImpl<UserDataPo> implements UserDataDAO { 
	public static final UserDataDAOImpl INSTANCE = new UserDataDAOImpl(); 
	public static final String TABLENAME = "USER_DATA"; 

	public UserDataDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<UserDataPo> CONVERTER = new MapConverter<UserDataPo>() { 
 
		@Override 
		public UserDataPo convert(final DataObject dataObject) { 
			final UserDataPo userDataPo = new UserDataPo(); 
			userDataPo.setUserSerNo(BigDecimalUtils.formObj(dataObject.getValue(UserDataPo.COLUMNS.USER_SER_NO.name()))); 
			userDataPo.setUserId(dataObject.getString(UserDataPo.COLUMNS.USER_ID.name())); 
			userDataPo.setUserPass(dataObject.getString(UserDataPo.COLUMNS.USER_PASS.name())); 
			userDataPo.setUserName(dataObject.getString(UserDataPo.COLUMNS.USER_NAME.name())); 
			return userDataPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final UserDataPo userDataPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(UserDataPo.COLUMNS.USER_SER_NO.name(), userDataPo.getUserSerNo()); 
			dataObject.setValue(UserDataPo.COLUMNS.USER_ID.name(), userDataPo.getUserId()); 
			dataObject.setValue(UserDataPo.COLUMNS.USER_PASS.name(), userDataPo.getUserPass()); 
			dataObject.setValue(UserDataPo.COLUMNS.USER_NAME.name(), userDataPo.getUserName()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<UserDataPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(UserDataPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(UserDataPo.COLUMNS.USER_SER_NO.name(), po.getUserSerNo()); 
		return sqlWhere; 
	} 
 
} 
