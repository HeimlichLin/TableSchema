package com.doc.common.dao.impl; 
 
public class UseraccountDAOImpl extends GeneralDAOImpl<UseraccountPo> implements UseraccountDAO { 
	public static final UseraccountDAOImpl INSTANCE = new UseraccountDAOImpl(); 
	public static final String TABLENAME = "USERACCOUNT"; 

	public UseraccountDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<UseraccountPo> CONVERTER = new MapConverter<UseraccountPo>() { 
 
		@Override 
		public UseraccountPo convert(final DataObject dataObject) { 
			final UseraccountPo useraccountPo = new UseraccountPo(); 
			useraccountPo.setUId(dataObject.getString(UseraccountPo.COLUMNS.U_ID.name())); 
			useraccountPo.setUName(dataObject.getString(UseraccountPo.COLUMNS.U_NAME.name())); 
			useraccountPo.setUType(dataObject.getString(UseraccountPo.COLUMNS.U_TYPE.name())); 
			useraccountPo.setUCompany(dataObject.getString(UseraccountPo.COLUMNS.U_COMPANY.name())); 
			useraccountPo.setUDep(dataObject.getString(UseraccountPo.COLUMNS.U_DEP.name())); 
			useraccountPo.setUTitle(dataObject.getString(UseraccountPo.COLUMNS.U_TITLE.name())); 
			useraccountPo.setUTel(dataObject.getString(UseraccountPo.COLUMNS.U_TEL.name())); 
			useraccountPo.setUExtendTel(dataObject.getString(UseraccountPo.COLUMNS.U_EXTEND_TEL.name())); 
			useraccountPo.setS1Pwd(dataObject.getString(UseraccountPo.COLUMNS.S1_PWD.name())); 
			useraccountPo.setS1Right(dataObject.getString(UseraccountPo.COLUMNS.S1_RIGHT.name())); 
			useraccountPo.setCreateDate(dataObject.getString(UseraccountPo.COLUMNS.CREATE_DATE.name())); 
			useraccountPo.setCreateUser(dataObject.getString(UseraccountPo.COLUMNS.CREATE_USER.name())); 
			useraccountPo.setModifyDate(dataObject.getString(UseraccountPo.COLUMNS.MODIFY_DATE.name())); 
			useraccountPo.setModifyUser(dataObject.getString(UseraccountPo.COLUMNS.MODIFY_USER.name())); 
			useraccountPo.setUAccount(dataObject.getString(UseraccountPo.COLUMNS.U_ACCOUNT.name())); 
			useraccountPo.setLoginDate(dataObject.getString(UseraccountPo.COLUMNS.LOGIN_DATE.name())); 
			useraccountPo.setLoginErrtimes(BigDecimalUtils.formObj(dataObject.getValue(UseraccountPo.COLUMNS.LOGIN_ERRTIMES.name()))); 
			return useraccountPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final UseraccountPo useraccountPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(UseraccountPo.COLUMNS.U_ID.name(), useraccountPo.getUId()); 
			dataObject.setValue(UseraccountPo.COLUMNS.U_NAME.name(), useraccountPo.getUName()); 
			dataObject.setValue(UseraccountPo.COLUMNS.U_TYPE.name(), useraccountPo.getUType()); 
			dataObject.setValue(UseraccountPo.COLUMNS.U_COMPANY.name(), useraccountPo.getUCompany()); 
			dataObject.setValue(UseraccountPo.COLUMNS.U_DEP.name(), useraccountPo.getUDep()); 
			dataObject.setValue(UseraccountPo.COLUMNS.U_TITLE.name(), useraccountPo.getUTitle()); 
			dataObject.setValue(UseraccountPo.COLUMNS.U_TEL.name(), useraccountPo.getUTel()); 
			dataObject.setValue(UseraccountPo.COLUMNS.U_EXTEND_TEL.name(), useraccountPo.getUExtendTel()); 
			dataObject.setValue(UseraccountPo.COLUMNS.S1_PWD.name(), useraccountPo.getS1Pwd()); 
			dataObject.setValue(UseraccountPo.COLUMNS.S1_RIGHT.name(), useraccountPo.getS1Right()); 
			dataObject.setValue(UseraccountPo.COLUMNS.CREATE_DATE.name(), useraccountPo.getCreateDate()); 
			dataObject.setValue(UseraccountPo.COLUMNS.CREATE_USER.name(), useraccountPo.getCreateUser()); 
			dataObject.setValue(UseraccountPo.COLUMNS.MODIFY_DATE.name(), useraccountPo.getModifyDate()); 
			dataObject.setValue(UseraccountPo.COLUMNS.MODIFY_USER.name(), useraccountPo.getModifyUser()); 
			dataObject.setValue(UseraccountPo.COLUMNS.U_ACCOUNT.name(), useraccountPo.getUAccount()); 
			dataObject.setValue(UseraccountPo.COLUMNS.LOGIN_DATE.name(), useraccountPo.getLoginDate()); 
			dataObject.setValue(UseraccountPo.COLUMNS.LOGIN_ERRTIMES.name(), useraccountPo.getLoginErrtimes()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<UseraccountPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(UseraccountPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(UseraccountPo.COLUMNS.U_ID.name(), po.getUId()); 
		return sqlWhere; 
	} 
 
} 
