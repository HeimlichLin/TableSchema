package com.doc.common.dao.impl; 
 
public class TUserRolesDAOImpl extends GeneralDAOImpl<TUserRolesPo> implements TUserRolesDAO { 
	public static final TUserRolesDAOImpl INSTANCE = new TUserRolesDAOImpl(); 
	public static final String TABLENAME = "T_USER_ROLES"; 

	public TUserRolesDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TUserRolesPo> CONVERTER = new MapConverter<TUserRolesPo>() { 
 
		@Override 
		public TUserRolesPo convert(final DataObject dataObject) { 
			final TUserRolesPo tUserRolesPo = new TUserRolesPo(); 
			tUserRolesPo.setTUserId(BigDecimalUtils.formObj(dataObject.getValue(TUserRolesPo.COLUMNS.T_USER_ID.name()))); 
			tUserRolesPo.setRolesId(BigDecimalUtils.formObj(dataObject.getValue(TUserRolesPo.COLUMNS.ROLES_ID.name()))); 
			return tUserRolesPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TUserRolesPo tUserRolesPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TUserRolesPo.COLUMNS.T_USER_ID.name(), tUserRolesPo.getTUserId()); 
			dataObject.setValue(TUserRolesPo.COLUMNS.ROLES_ID.name(), tUserRolesPo.getRolesId()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TUserRolesPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TUserRolesPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(TUserRolesPo.COLUMNS.T_USER_ID.name(), po.getTUserId()); 
		sqlWhere.add(TUserRolesPo.COLUMNS.ROLES_ID.name(), po.getRolesId()); 
		return sqlWhere; 
	} 
 
} 
