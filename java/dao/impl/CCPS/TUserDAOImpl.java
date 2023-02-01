package com.doc.common.dao.impl; 
 
public class TUserDAOImpl extends GeneralDAOImpl<TUserPo> implements TUserDAO { 
	public static final TUserDAOImpl INSTANCE = new TUserDAOImpl(); 
	public static final String TABLENAME = "T_USER"; 

	public TUserDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TUserPo> CONVERTER = new MapConverter<TUserPo>() { 
 
		@Override 
		public TUserPo convert(final DataObject dataObject) { 
			final TUserPo tUserPo = new TUserPo(); 
			tUserPo.setId(BigDecimalUtils.formObj(dataObject.getValue(TUserPo.COLUMNS.ID.name()))); 
			tUserPo.setEnabled(BigDecimalUtils.formObj(dataObject.getValue(TUserPo.COLUMNS.ENABLED.name()))); 
			tUserPo.setPassword(dataObject.getString(TUserPo.COLUMNS.PASSWORD.name())); 
			tUserPo.setUsername(dataObject.getString(TUserPo.COLUMNS.USERNAME.name())); 
			tUserPo.setAccountNonExpired(BigDecimalUtils.formObj(dataObject.getValue(TUserPo.COLUMNS.ACCOUNT_NON_EXPIRED.name()))); 
			tUserPo.setAccountNonLocked(BigDecimalUtils.formObj(dataObject.getValue(TUserPo.COLUMNS.ACCOUNT_NON_LOCKED.name()))); 
			tUserPo.setCredentialsNonExpired(BigDecimalUtils.formObj(dataObject.getValue(TUserPo.COLUMNS.CREDENTIALS_NON_EXPIRED.name()))); 
			tUserPo.setUsernameZh(dataObject.getString(TUserPo.COLUMNS.USERNAME_ZH.name())); 
			return tUserPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TUserPo tUserPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TUserPo.COLUMNS.ID.name(), tUserPo.getId()); 
			dataObject.setValue(TUserPo.COLUMNS.ENABLED.name(), tUserPo.getEnabled()); 
			dataObject.setValue(TUserPo.COLUMNS.PASSWORD.name(), tUserPo.getPassword()); 
			dataObject.setValue(TUserPo.COLUMNS.USERNAME.name(), tUserPo.getUsername()); 
			dataObject.setValue(TUserPo.COLUMNS.ACCOUNT_NON_EXPIRED.name(), tUserPo.getAccountNonExpired()); 
			dataObject.setValue(TUserPo.COLUMNS.ACCOUNT_NON_LOCKED.name(), tUserPo.getAccountNonLocked()); 
			dataObject.setValue(TUserPo.COLUMNS.CREDENTIALS_NON_EXPIRED.name(), tUserPo.getCredentialsNonExpired()); 
			dataObject.setValue(TUserPo.COLUMNS.USERNAME_ZH.name(), tUserPo.getUsernameZh()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TUserPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TUserPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(TUserPo.COLUMNS.ID.name(), po.getId()); 
		return sqlWhere; 
	} 
 
} 
