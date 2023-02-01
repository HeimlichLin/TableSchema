package com.doc.common.dao.impl; 
 
public class Repcat$AuditAttributeDAOImpl extends GeneralDAOImpl<Repcat$AuditAttributePo> implements IRepcat$AuditAttributeDAO { 
	public static final Repcat$AuditAttributeDAOImpl INSTANCE = new Repcat$AuditAttributeDAOImpl(); 
	public static final String TABLENAME = "REPCAT$_AUDIT_ATTRIBUTE"; 

	public Repcat$AuditAttributeDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Repcat$AuditAttributePo> CONVERTER = new MapConverter<Repcat$AuditAttributePo>() { 
 
		@Override 
		public Repcat$AuditAttributePo convert(final DataObject dataObject) { 
			final Repcat$AuditAttributePo repcat$AuditAttributePo = new Repcat$AuditAttributePo(); 
			repcat$AuditAttributePo.setAttribute(dataObject.getString(Repcat$AuditAttributePo.COLUMNS.ATTRIBUTE.name())); 
			repcat$AuditAttributePo.setDataTypeId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$AuditAttributePo.COLUMNS.DATA_TYPE_ID.name()))); 
			repcat$AuditAttributePo.setDataLength(BigDecimalUtils.formObj(dataObject.getValue(Repcat$AuditAttributePo.COLUMNS.DATA_LENGTH.name()))); 
			repcat$AuditAttributePo.setSource(dataObject.getString(Repcat$AuditAttributePo.COLUMNS.SOURCE.name())); 
			return repcat$AuditAttributePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Repcat$AuditAttributePo repcat$AuditAttributePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Repcat$AuditAttributePo.COLUMNS.ATTRIBUTE.name(), repcat$AuditAttributePo.getAttribute()); 
			dataObject.setValue(Repcat$AuditAttributePo.COLUMNS.DATA_TYPE_ID.name(), repcat$AuditAttributePo.getDataTypeId()); 
			dataObject.setValue(Repcat$AuditAttributePo.COLUMNS.DATA_LENGTH.name(), repcat$AuditAttributePo.getDataLength()); 
			dataObject.setValue(Repcat$AuditAttributePo.COLUMNS.SOURCE.name(), repcat$AuditAttributePo.getSource()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Repcat$AuditAttributePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Repcat$AuditAttributePo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Repcat$AuditAttributePo.COLUMNS.ATTRIBUTE.name(), po.getAttribute()); 
		return sqlWhere; 
	} 
 
} 
