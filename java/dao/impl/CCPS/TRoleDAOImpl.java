package com.doc.common.dao.impl; 
 
public class TRoleDAOImpl extends GeneralDAOImpl<TRolePo> implements TRoleDAO { 
	public static final TRoleDAOImpl INSTANCE = new TRoleDAOImpl(); 
	public static final String TABLENAME = "T_ROLE"; 

	public TRoleDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TRolePo> CONVERTER = new MapConverter<TRolePo>() { 
 
		@Override 
		public TRolePo convert(final DataObject dataObject) { 
			final TRolePo tRolePo = new TRolePo(); 
			tRolePo.setId(BigDecimalUtils.formObj(dataObject.getValue(TRolePo.COLUMNS.ID.name()))); 
			tRolePo.setName(dataObject.getString(TRolePo.COLUMNS.NAME.name())); 
			tRolePo.setNameZh(dataObject.getString(TRolePo.COLUMNS.NAME_ZH.name())); 
			return tRolePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TRolePo tRolePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TRolePo.COLUMNS.ID.name(), tRolePo.getId()); 
			dataObject.setValue(TRolePo.COLUMNS.NAME.name(), tRolePo.getName()); 
			dataObject.setValue(TRolePo.COLUMNS.NAME_ZH.name(), tRolePo.getNameZh()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TRolePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TRolePo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(TRolePo.COLUMNS.ID.name(), po.getId()); 
		return sqlWhere; 
	} 
 
} 
