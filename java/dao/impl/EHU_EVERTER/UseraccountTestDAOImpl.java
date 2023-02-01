package com.doc.common.dao.impl; 
 
public class UseraccountTestDAOImpl extends GeneralDAOImpl<UseraccountTestPo> implements UseraccountTestDAO { 
	public static final UseraccountTestDAOImpl INSTANCE = new UseraccountTestDAOImpl(); 
	public static final String TABLENAME = "USERACCOUNT_TEST"; 

	public UseraccountTestDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<UseraccountTestPo> CONVERTER = new MapConverter<UseraccountTestPo>() { 
 
		@Override 
		public UseraccountTestPo convert(final DataObject dataObject) { 
			final UseraccountTestPo useraccountTestPo = new UseraccountTestPo(); 
			useraccountTestPo.setUId(dataObject.getString(UseraccountTestPo.COLUMNS.U_ID.name())); 
			useraccountTestPo.setUName(dataObject.getString(UseraccountTestPo.COLUMNS.U_NAME.name())); 
			useraccountTestPo.setUType(dataObject.getString(UseraccountTestPo.COLUMNS.U_TYPE.name())); 
			useraccountTestPo.setUCompany(dataObject.getString(UseraccountTestPo.COLUMNS.U_COMPANY.name())); 
			useraccountTestPo.setUDep(dataObject.getString(UseraccountTestPo.COLUMNS.U_DEP.name())); 
			useraccountTestPo.setUTitle(dataObject.getString(UseraccountTestPo.COLUMNS.U_TITLE.name())); 
			useraccountTestPo.setUTel(dataObject.getString(UseraccountTestPo.COLUMNS.U_TEL.name())); 
			useraccountTestPo.setUExtendTel(dataObject.getString(UseraccountTestPo.COLUMNS.U_EXTEND_TEL.name())); 
			useraccountTestPo.setS1Pwd(dataObject.getString(UseraccountTestPo.COLUMNS.S1_PWD.name())); 
			useraccountTestPo.setS1Right(dataObject.getString(UseraccountTestPo.COLUMNS.S1_RIGHT.name())); 
			useraccountTestPo.setCreateDate(dataObject.getString(UseraccountTestPo.COLUMNS.CREATE_DATE.name())); 
			useraccountTestPo.setCreateUser(dataObject.getString(UseraccountTestPo.COLUMNS.CREATE_USER.name())); 
			useraccountTestPo.setModifyDate(dataObject.getString(UseraccountTestPo.COLUMNS.MODIFY_DATE.name())); 
			useraccountTestPo.setModifyUser(dataObject.getString(UseraccountTestPo.COLUMNS.MODIFY_USER.name())); 
			useraccountTestPo.setUAccount(dataObject.getString(UseraccountTestPo.COLUMNS.U_ACCOUNT.name())); 
			return useraccountTestPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final UseraccountTestPo useraccountTestPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(UseraccountTestPo.COLUMNS.U_ID.name(), useraccountTestPo.getUId()); 
			dataObject.setValue(UseraccountTestPo.COLUMNS.U_NAME.name(), useraccountTestPo.getUName()); 
			dataObject.setValue(UseraccountTestPo.COLUMNS.U_TYPE.name(), useraccountTestPo.getUType()); 
			dataObject.setValue(UseraccountTestPo.COLUMNS.U_COMPANY.name(), useraccountTestPo.getUCompany()); 
			dataObject.setValue(UseraccountTestPo.COLUMNS.U_DEP.name(), useraccountTestPo.getUDep()); 
			dataObject.setValue(UseraccountTestPo.COLUMNS.U_TITLE.name(), useraccountTestPo.getUTitle()); 
			dataObject.setValue(UseraccountTestPo.COLUMNS.U_TEL.name(), useraccountTestPo.getUTel()); 
			dataObject.setValue(UseraccountTestPo.COLUMNS.U_EXTEND_TEL.name(), useraccountTestPo.getUExtendTel()); 
			dataObject.setValue(UseraccountTestPo.COLUMNS.S1_PWD.name(), useraccountTestPo.getS1Pwd()); 
			dataObject.setValue(UseraccountTestPo.COLUMNS.S1_RIGHT.name(), useraccountTestPo.getS1Right()); 
			dataObject.setValue(UseraccountTestPo.COLUMNS.CREATE_DATE.name(), useraccountTestPo.getCreateDate()); 
			dataObject.setValue(UseraccountTestPo.COLUMNS.CREATE_USER.name(), useraccountTestPo.getCreateUser()); 
			dataObject.setValue(UseraccountTestPo.COLUMNS.MODIFY_DATE.name(), useraccountTestPo.getModifyDate()); 
			dataObject.setValue(UseraccountTestPo.COLUMNS.MODIFY_USER.name(), useraccountTestPo.getModifyUser()); 
			dataObject.setValue(UseraccountTestPo.COLUMNS.U_ACCOUNT.name(), useraccountTestPo.getUAccount()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<UseraccountTestPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(UseraccountTestPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
