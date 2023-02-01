package com.doc.common.dao.impl; 
 
public class Repcat$RepgroupPrivsDAOImpl extends GeneralDAOImpl<Repcat$RepgroupPrivsPo> implements IRepcat$RepgroupPrivsDAO { 
	public static final Repcat$RepgroupPrivsDAOImpl INSTANCE = new Repcat$RepgroupPrivsDAOImpl(); 
	public static final String TABLENAME = "REPCAT$_REPGROUP_PRIVS"; 

	public Repcat$RepgroupPrivsDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Repcat$RepgroupPrivsPo> CONVERTER = new MapConverter<Repcat$RepgroupPrivsPo>() { 
 
		@Override 
		public Repcat$RepgroupPrivsPo convert(final DataObject dataObject) { 
			final Repcat$RepgroupPrivsPo repcat$RepgroupPrivsPo = new Repcat$RepgroupPrivsPo(); 
			repcat$RepgroupPrivsPo.setUserid(BigDecimalUtils.formObj(dataObject.getValue(Repcat$RepgroupPrivsPo.COLUMNS.USERID.name()))); 
			repcat$RepgroupPrivsPo.setUsername(dataObject.getString(Repcat$RepgroupPrivsPo.COLUMNS.USERNAME.name())); 
			repcat$RepgroupPrivsPo.setGowner(dataObject.getString(Repcat$RepgroupPrivsPo.COLUMNS.GOWNER.name())); 
			repcat$RepgroupPrivsPo.setGowner(dataObject.getString(Repcat$RepgroupPrivsPo.COLUMNS.GOWNER.name())); 
			repcat$RepgroupPrivsPo.setGname(dataObject.getString(Repcat$RepgroupPrivsPo.COLUMNS.GNAME.name())); 
			repcat$RepgroupPrivsPo.setGname(dataObject.getString(Repcat$RepgroupPrivsPo.COLUMNS.GNAME.name())); 
			repcat$RepgroupPrivsPo.setGlobalFlag(BigDecimalUtils.formObj(dataObject.getValue(Repcat$RepgroupPrivsPo.COLUMNS.GLOBAL_FLAG.name()))); 
			repcat$RepgroupPrivsPo.setCreated(TimestampUtils.of(dataObject.getValue(Repcat$RepgroupPrivsPo.COLUMNS.CREATED.name()))); 
			repcat$RepgroupPrivsPo.setPrivilege(BigDecimalUtils.formObj(dataObject.getValue(Repcat$RepgroupPrivsPo.COLUMNS.PRIVILEGE.name()))); 
			return repcat$RepgroupPrivsPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Repcat$RepgroupPrivsPo repcat$RepgroupPrivsPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Repcat$RepgroupPrivsPo.COLUMNS.USERID.name(), repcat$RepgroupPrivsPo.getUserid()); 
			dataObject.setValue(Repcat$RepgroupPrivsPo.COLUMNS.USERNAME.name(), repcat$RepgroupPrivsPo.getUsername()); 
			dataObject.setValue(Repcat$RepgroupPrivsPo.COLUMNS.GOWNER.name(), repcat$RepgroupPrivsPo.getGowner()); 
			dataObject.setValue(Repcat$RepgroupPrivsPo.COLUMNS.GOWNER.name(), repcat$RepgroupPrivsPo.getGowner()); 
			dataObject.setValue(Repcat$RepgroupPrivsPo.COLUMNS.GNAME.name(), repcat$RepgroupPrivsPo.getGname()); 
			dataObject.setValue(Repcat$RepgroupPrivsPo.COLUMNS.GNAME.name(), repcat$RepgroupPrivsPo.getGname()); 
			dataObject.setValue(Repcat$RepgroupPrivsPo.COLUMNS.GLOBAL_FLAG.name(), repcat$RepgroupPrivsPo.getGlobalFlag()); 
			dataObject.setValue(Repcat$RepgroupPrivsPo.COLUMNS.CREATED.name(), repcat$RepgroupPrivsPo.getCreated()); 
			dataObject.setValue(Repcat$RepgroupPrivsPo.COLUMNS.PRIVILEGE.name(), repcat$RepgroupPrivsPo.getPrivilege()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Repcat$RepgroupPrivsPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Repcat$RepgroupPrivsPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Repcat$RepgroupPrivsPo.COLUMNS.USERNAME.name(), po.getUsername()); 
		sqlWhere.add(Repcat$RepgroupPrivsPo.COLUMNS.GOWNER.name(), po.getGowner()); 
		sqlWhere.add(Repcat$RepgroupPrivsPo.COLUMNS.GOWNER.name(), po.getGowner()); 
		sqlWhere.add(Repcat$RepgroupPrivsPo.COLUMNS.GNAME.name(), po.getGname()); 
		sqlWhere.add(Repcat$RepgroupPrivsPo.COLUMNS.GNAME.name(), po.getGname()); 
		return sqlWhere; 
	} 
 
} 
