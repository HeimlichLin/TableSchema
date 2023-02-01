package com.doc.common.dao.impl; 
 
public class UserActionDAOImpl extends GeneralDAOImpl<UserActionPo> implements UserActionDAO { 
	public static final UserActionDAOImpl INSTANCE = new UserActionDAOImpl(); 
	public static final String TABLENAME = "USER_ACTION"; 

	public UserActionDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<UserActionPo> CONVERTER = new MapConverter<UserActionPo>() { 
 
		@Override 
		public UserActionPo convert(final DataObject dataObject) { 
			final UserActionPo userActionPo = new UserActionPo(); 
			userActionPo.setUserId(dataObject.getString(UserActionPo.COLUMNS.USER_ID.name())); 
			userActionPo.setBondNo(dataObject.getString(UserActionPo.COLUMNS.BOND_NO.name())); 
			userActionPo.setStartdate(dataObject.getString(UserActionPo.COLUMNS.STARTDATE.name())); 
			userActionPo.setEnddate(dataObject.getString(UserActionPo.COLUMNS.ENDDATE.name())); 
			userActionPo.setStarttime(dataObject.getString(UserActionPo.COLUMNS.STARTTIME.name())); 
			userActionPo.setEndtime(dataObject.getString(UserActionPo.COLUMNS.ENDTIME.name())); 
			userActionPo.setIp(dataObject.getString(UserActionPo.COLUMNS.IP.name())); 
			userActionPo.setUrl(dataObject.getString(UserActionPo.COLUMNS.URL.name())); 
			userActionPo.setAttribute(dataObject.getString(UserActionPo.COLUMNS.ATTRIBUTE.name())); 
			userActionPo.setDeclno(dataObject.getString(UserActionPo.COLUMNS.DECLNO.name())); 
			userActionPo.setMessage(dataObject.getString(UserActionPo.COLUMNS.MESSAGE.name())); 
			userActionPo.setClassname(dataObject.getString(UserActionPo.COLUMNS.CLASSNAME.name())); 
			userActionPo.setMethod(dataObject.getString(UserActionPo.COLUMNS.METHOD.name())); 
			userActionPo.setStatus(dataObject.getString(UserActionPo.COLUMNS.STATUS.name())); 
			userActionPo.setReturnAction(dataObject.getString(UserActionPo.COLUMNS.RETURN_ACTION.name())); 
			userActionPo.setActionname(dataObject.getString(UserActionPo.COLUMNS.ACTIONNAME.name())); 
			return userActionPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final UserActionPo userActionPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(UserActionPo.COLUMNS.USER_ID.name(), userActionPo.getUserId()); 
			dataObject.setValue(UserActionPo.COLUMNS.BOND_NO.name(), userActionPo.getBondNo()); 
			dataObject.setValue(UserActionPo.COLUMNS.STARTDATE.name(), userActionPo.getStartdate()); 
			dataObject.setValue(UserActionPo.COLUMNS.ENDDATE.name(), userActionPo.getEnddate()); 
			dataObject.setValue(UserActionPo.COLUMNS.STARTTIME.name(), userActionPo.getStarttime()); 
			dataObject.setValue(UserActionPo.COLUMNS.ENDTIME.name(), userActionPo.getEndtime()); 
			dataObject.setValue(UserActionPo.COLUMNS.IP.name(), userActionPo.getIp()); 
			dataObject.setValue(UserActionPo.COLUMNS.URL.name(), userActionPo.getUrl()); 
			dataObject.setValue(UserActionPo.COLUMNS.ATTRIBUTE.name(), userActionPo.getAttribute()); 
			dataObject.setValue(UserActionPo.COLUMNS.DECLNO.name(), userActionPo.getDeclno()); 
			dataObject.setValue(UserActionPo.COLUMNS.MESSAGE.name(), userActionPo.getMessage()); 
			dataObject.setValue(UserActionPo.COLUMNS.CLASSNAME.name(), userActionPo.getClassname()); 
			dataObject.setValue(UserActionPo.COLUMNS.METHOD.name(), userActionPo.getMethod()); 
			dataObject.setValue(UserActionPo.COLUMNS.STATUS.name(), userActionPo.getStatus()); 
			dataObject.setValue(UserActionPo.COLUMNS.RETURN_ACTION.name(), userActionPo.getReturnAction()); 
			dataObject.setValue(UserActionPo.COLUMNS.ACTIONNAME.name(), userActionPo.getActionname()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<UserActionPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(UserActionPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
