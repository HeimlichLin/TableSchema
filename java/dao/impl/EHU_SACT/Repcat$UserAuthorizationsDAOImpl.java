package com.doc.common.dao.impl; 
 
public class Repcat$UserAuthorizationsDAOImpl extends GeneralDAOImpl<Repcat$UserAuthorizationsPo> implements IRepcat$UserAuthorizationsDAO { 
	public static final Repcat$UserAuthorizationsDAOImpl INSTANCE = new Repcat$UserAuthorizationsDAOImpl(); 
	public static final String TABLENAME = "REPCAT$_USER_AUTHORIZATIONS"; 

	public Repcat$UserAuthorizationsDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Repcat$UserAuthorizationsPo> CONVERTER = new MapConverter<Repcat$UserAuthorizationsPo>() { 
 
		@Override 
		public Repcat$UserAuthorizationsPo convert(final DataObject dataObject) { 
			final Repcat$UserAuthorizationsPo repcat$UserAuthorizationsPo = new Repcat$UserAuthorizationsPo(); 
			repcat$UserAuthorizationsPo.setUserAuthorizationId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$UserAuthorizationsPo.COLUMNS.USER_AUTHORIZATION_ID.name()))); 
			repcat$UserAuthorizationsPo.setUserId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$UserAuthorizationsPo.COLUMNS.USER_ID.name()))); 
			repcat$UserAuthorizationsPo.setRefreshTemplateId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$UserAuthorizationsPo.COLUMNS.REFRESH_TEMPLATE_ID.name()))); 
			repcat$UserAuthorizationsPo.setRefreshTemplateId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$UserAuthorizationsPo.COLUMNS.REFRESH_TEMPLATE_ID.name()))); 
			return repcat$UserAuthorizationsPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Repcat$UserAuthorizationsPo repcat$UserAuthorizationsPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Repcat$UserAuthorizationsPo.COLUMNS.USER_AUTHORIZATION_ID.name(), repcat$UserAuthorizationsPo.getUserAuthorizationId()); 
			dataObject.setValue(Repcat$UserAuthorizationsPo.COLUMNS.USER_ID.name(), repcat$UserAuthorizationsPo.getUserId()); 
			dataObject.setValue(Repcat$UserAuthorizationsPo.COLUMNS.REFRESH_TEMPLATE_ID.name(), repcat$UserAuthorizationsPo.getRefreshTemplateId()); 
			dataObject.setValue(Repcat$UserAuthorizationsPo.COLUMNS.REFRESH_TEMPLATE_ID.name(), repcat$UserAuthorizationsPo.getRefreshTemplateId()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Repcat$UserAuthorizationsPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Repcat$UserAuthorizationsPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Repcat$UserAuthorizationsPo.COLUMNS.USER_AUTHORIZATION_ID.name(), po.getUserAuthorizationId()); 
		sqlWhere.add(Repcat$UserAuthorizationsPo.COLUMNS.USER_ID.name(), po.getUserId()); 
		sqlWhere.add(Repcat$UserAuthorizationsPo.COLUMNS.REFRESH_TEMPLATE_ID.name(), po.getRefreshTemplateId()); 
		sqlWhere.add(Repcat$UserAuthorizationsPo.COLUMNS.REFRESH_TEMPLATE_ID.name(), po.getRefreshTemplateId()); 
		return sqlWhere; 
	} 
 
} 
