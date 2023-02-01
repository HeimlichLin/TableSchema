package com.doc.common.dao.impl; 
 
public class Repcat$AuditColumnDAOImpl extends GeneralDAOImpl<Repcat$AuditColumnPo> implements IRepcat$AuditColumnDAO { 
	public static final Repcat$AuditColumnDAOImpl INSTANCE = new Repcat$AuditColumnDAOImpl(); 
	public static final String TABLENAME = "REPCAT$_AUDIT_COLUMN"; 

	public Repcat$AuditColumnDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Repcat$AuditColumnPo> CONVERTER = new MapConverter<Repcat$AuditColumnPo>() { 
 
		@Override 
		public Repcat$AuditColumnPo convert(final DataObject dataObject) { 
			final Repcat$AuditColumnPo repcat$AuditColumnPo = new Repcat$AuditColumnPo(); 
			repcat$AuditColumnPo.setSname(dataObject.getString(Repcat$AuditColumnPo.COLUMNS.SNAME.name())); 
			repcat$AuditColumnPo.setOname(dataObject.getString(Repcat$AuditColumnPo.COLUMNS.ONAME.name())); 
			repcat$AuditColumnPo.setColumnName(dataObject.getString(Repcat$AuditColumnPo.COLUMNS.COLUMN_NAME.name())); 
			repcat$AuditColumnPo.setBaseSname(dataObject.getString(Repcat$AuditColumnPo.COLUMNS.BASE_SNAME.name())); 
			repcat$AuditColumnPo.setBaseOname(dataObject.getString(Repcat$AuditColumnPo.COLUMNS.BASE_ONAME.name())); 
			repcat$AuditColumnPo.setBaseConflictTypeId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$AuditColumnPo.COLUMNS.BASE_CONFLICT_TYPE_ID.name()))); 
			repcat$AuditColumnPo.setBaseReferenceName(dataObject.getString(Repcat$AuditColumnPo.COLUMNS.BASE_REFERENCE_NAME.name())); 
			repcat$AuditColumnPo.setAttribute(dataObject.getString(Repcat$AuditColumnPo.COLUMNS.ATTRIBUTE.name())); 
			return repcat$AuditColumnPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Repcat$AuditColumnPo repcat$AuditColumnPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Repcat$AuditColumnPo.COLUMNS.SNAME.name(), repcat$AuditColumnPo.getSname()); 
			dataObject.setValue(Repcat$AuditColumnPo.COLUMNS.ONAME.name(), repcat$AuditColumnPo.getOname()); 
			dataObject.setValue(Repcat$AuditColumnPo.COLUMNS.COLUMN_NAME.name(), repcat$AuditColumnPo.getColumnName()); 
			dataObject.setValue(Repcat$AuditColumnPo.COLUMNS.BASE_SNAME.name(), repcat$AuditColumnPo.getBaseSname()); 
			dataObject.setValue(Repcat$AuditColumnPo.COLUMNS.BASE_ONAME.name(), repcat$AuditColumnPo.getBaseOname()); 
			dataObject.setValue(Repcat$AuditColumnPo.COLUMNS.BASE_CONFLICT_TYPE_ID.name(), repcat$AuditColumnPo.getBaseConflictTypeId()); 
			dataObject.setValue(Repcat$AuditColumnPo.COLUMNS.BASE_REFERENCE_NAME.name(), repcat$AuditColumnPo.getBaseReferenceName()); 
			dataObject.setValue(Repcat$AuditColumnPo.COLUMNS.ATTRIBUTE.name(), repcat$AuditColumnPo.getAttribute()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Repcat$AuditColumnPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Repcat$AuditColumnPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Repcat$AuditColumnPo.COLUMNS.SNAME.name(), po.getSname()); 
		sqlWhere.add(Repcat$AuditColumnPo.COLUMNS.ONAME.name(), po.getOname()); 
		sqlWhere.add(Repcat$AuditColumnPo.COLUMNS.COLUMN_NAME.name(), po.getColumnName()); 
		sqlWhere.add(Repcat$AuditColumnPo.COLUMNS.BASE_SNAME.name(), po.getBaseSname()); 
		sqlWhere.add(Repcat$AuditColumnPo.COLUMNS.BASE_ONAME.name(), po.getBaseOname()); 
		sqlWhere.add(Repcat$AuditColumnPo.COLUMNS.BASE_CONFLICT_TYPE_ID.name(), po.getBaseConflictTypeId()); 
		sqlWhere.add(Repcat$AuditColumnPo.COLUMNS.BASE_REFERENCE_NAME.name(), po.getBaseReferenceName()); 
		sqlWhere.add(Repcat$AuditColumnPo.COLUMNS.ATTRIBUTE.name(), po.getAttribute()); 
		return sqlWhere; 
	} 
 
} 
