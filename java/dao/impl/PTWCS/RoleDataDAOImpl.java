package com.doc.common.dao.impl; 
 
public class RoleDataDAOImpl extends GeneralDAOImpl<RoleDataPo> implements RoleDataDAO { 
	public static final RoleDataDAOImpl INSTANCE = new RoleDataDAOImpl(); 
	public static final String TABLENAME = "ROLE_DATA"; 

	public RoleDataDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<RoleDataPo> CONVERTER = new MapConverter<RoleDataPo>() { 
 
		@Override 
		public RoleDataPo convert(final DataObject dataObject) { 
			final RoleDataPo roleDataPo = new RoleDataPo(); 
			roleDataPo.setRoleId(dataObject.getString(RoleDataPo.COLUMNS.ROLE_ID.name())); 
			roleDataPo.setRoleName(dataObject.getString(RoleDataPo.COLUMNS.ROLE_NAME.name())); 
			roleDataPo.setRoleComment(dataObject.getString(RoleDataPo.COLUMNS.ROLE_COMMENT.name())); 
			return roleDataPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final RoleDataPo roleDataPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(RoleDataPo.COLUMNS.ROLE_ID.name(), roleDataPo.getRoleId()); 
			dataObject.setValue(RoleDataPo.COLUMNS.ROLE_NAME.name(), roleDataPo.getRoleName()); 
			dataObject.setValue(RoleDataPo.COLUMNS.ROLE_COMMENT.name(), roleDataPo.getRoleComment()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<RoleDataPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(RoleDataPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(RoleDataPo.COLUMNS.ROLE_ID.name(), po.getRoleId()); 
		return sqlWhere; 
	} 
 
} 
