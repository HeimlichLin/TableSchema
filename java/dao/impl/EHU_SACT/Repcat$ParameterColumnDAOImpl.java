package com.doc.common.dao.impl; 
 
public class Repcat$ParameterColumnDAOImpl extends GeneralDAOImpl<Repcat$ParameterColumnPo> implements IRepcat$ParameterColumnDAO { 
	public static final Repcat$ParameterColumnDAOImpl INSTANCE = new Repcat$ParameterColumnDAOImpl(); 
	public static final String TABLENAME = "REPCAT$_PARAMETER_COLUMN"; 

	public Repcat$ParameterColumnDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Repcat$ParameterColumnPo> CONVERTER = new MapConverter<Repcat$ParameterColumnPo>() { 
 
		@Override 
		public Repcat$ParameterColumnPo convert(final DataObject dataObject) { 
			final Repcat$ParameterColumnPo repcat$ParameterColumnPo = new Repcat$ParameterColumnPo(); 
			repcat$ParameterColumnPo.setSname(dataObject.getString(Repcat$ParameterColumnPo.COLUMNS.SNAME.name())); 
			repcat$ParameterColumnPo.setOname(dataObject.getString(Repcat$ParameterColumnPo.COLUMNS.ONAME.name())); 
			repcat$ParameterColumnPo.setConflictTypeId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$ParameterColumnPo.COLUMNS.CONFLICT_TYPE_ID.name()))); 
			repcat$ParameterColumnPo.setReferenceName(dataObject.getString(Repcat$ParameterColumnPo.COLUMNS.REFERENCE_NAME.name())); 
			repcat$ParameterColumnPo.setSequenceNo(BigDecimalUtils.formObj(dataObject.getValue(Repcat$ParameterColumnPo.COLUMNS.SEQUENCE_NO.name()))); 
			repcat$ParameterColumnPo.setParameterTableName(dataObject.getString(Repcat$ParameterColumnPo.COLUMNS.PARAMETER_TABLE_NAME.name())); 
			repcat$ParameterColumnPo.setParameterColumnName(dataObject.getString(Repcat$ParameterColumnPo.COLUMNS.PARAMETER_COLUMN_NAME.name())); 
			repcat$ParameterColumnPo.setParameterSequenceNo(BigDecimalUtils.formObj(dataObject.getValue(Repcat$ParameterColumnPo.COLUMNS.PARAMETER_SEQUENCE_NO.name()))); 
			repcat$ParameterColumnPo.setColumnPos(BigDecimalUtils.formObj(dataObject.getValue(Repcat$ParameterColumnPo.COLUMNS.COLUMN_POS.name()))); 
			repcat$ParameterColumnPo.setAttributeSequenceNo(BigDecimalUtils.formObj(dataObject.getValue(Repcat$ParameterColumnPo.COLUMNS.ATTRIBUTE_SEQUENCE_NO.name()))); 
			return repcat$ParameterColumnPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Repcat$ParameterColumnPo repcat$ParameterColumnPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Repcat$ParameterColumnPo.COLUMNS.SNAME.name(), repcat$ParameterColumnPo.getSname()); 
			dataObject.setValue(Repcat$ParameterColumnPo.COLUMNS.ONAME.name(), repcat$ParameterColumnPo.getOname()); 
			dataObject.setValue(Repcat$ParameterColumnPo.COLUMNS.CONFLICT_TYPE_ID.name(), repcat$ParameterColumnPo.getConflictTypeId()); 
			dataObject.setValue(Repcat$ParameterColumnPo.COLUMNS.REFERENCE_NAME.name(), repcat$ParameterColumnPo.getReferenceName()); 
			dataObject.setValue(Repcat$ParameterColumnPo.COLUMNS.SEQUENCE_NO.name(), repcat$ParameterColumnPo.getSequenceNo()); 
			dataObject.setValue(Repcat$ParameterColumnPo.COLUMNS.PARAMETER_TABLE_NAME.name(), repcat$ParameterColumnPo.getParameterTableName()); 
			dataObject.setValue(Repcat$ParameterColumnPo.COLUMNS.PARAMETER_COLUMN_NAME.name(), repcat$ParameterColumnPo.getParameterColumnName()); 
			dataObject.setValue(Repcat$ParameterColumnPo.COLUMNS.PARAMETER_SEQUENCE_NO.name(), repcat$ParameterColumnPo.getParameterSequenceNo()); 
			dataObject.setValue(Repcat$ParameterColumnPo.COLUMNS.COLUMN_POS.name(), repcat$ParameterColumnPo.getColumnPos()); 
			dataObject.setValue(Repcat$ParameterColumnPo.COLUMNS.ATTRIBUTE_SEQUENCE_NO.name(), repcat$ParameterColumnPo.getAttributeSequenceNo()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Repcat$ParameterColumnPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Repcat$ParameterColumnPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Repcat$ParameterColumnPo.COLUMNS.SNAME.name(), po.getSname()); 
		sqlWhere.add(Repcat$ParameterColumnPo.COLUMNS.ONAME.name(), po.getOname()); 
		sqlWhere.add(Repcat$ParameterColumnPo.COLUMNS.CONFLICT_TYPE_ID.name(), po.getConflictTypeId()); 
		sqlWhere.add(Repcat$ParameterColumnPo.COLUMNS.REFERENCE_NAME.name(), po.getReferenceName()); 
		sqlWhere.add(Repcat$ParameterColumnPo.COLUMNS.SEQUENCE_NO.name(), po.getSequenceNo()); 
		sqlWhere.add(Repcat$ParameterColumnPo.COLUMNS.PARAMETER_TABLE_NAME.name(), po.getParameterTableName()); 
		sqlWhere.add(Repcat$ParameterColumnPo.COLUMNS.PARAMETER_SEQUENCE_NO.name(), po.getParameterSequenceNo()); 
		sqlWhere.add(Repcat$ParameterColumnPo.COLUMNS.COLUMN_POS.name(), po.getColumnPos()); 
		return sqlWhere; 
	} 
 
} 
