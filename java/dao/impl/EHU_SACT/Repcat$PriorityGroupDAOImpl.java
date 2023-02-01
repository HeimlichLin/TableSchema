package com.doc.common.dao.impl; 
 
public class Repcat$PriorityGroupDAOImpl extends GeneralDAOImpl<Repcat$PriorityGroupPo> implements IRepcat$PriorityGroupDAO { 
	public static final Repcat$PriorityGroupDAOImpl INSTANCE = new Repcat$PriorityGroupDAOImpl(); 
	public static final String TABLENAME = "REPCAT$_PRIORITY_GROUP"; 

	public Repcat$PriorityGroupDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Repcat$PriorityGroupPo> CONVERTER = new MapConverter<Repcat$PriorityGroupPo>() { 
 
		@Override 
		public Repcat$PriorityGroupPo convert(final DataObject dataObject) { 
			final Repcat$PriorityGroupPo repcat$PriorityGroupPo = new Repcat$PriorityGroupPo(); 
			repcat$PriorityGroupPo.setSname(dataObject.getString(Repcat$PriorityGroupPo.COLUMNS.SNAME.name())); 
			repcat$PriorityGroupPo.setSname(dataObject.getString(Repcat$PriorityGroupPo.COLUMNS.SNAME.name())); 
			repcat$PriorityGroupPo.setPriorityGroup(dataObject.getString(Repcat$PriorityGroupPo.COLUMNS.PRIORITY_GROUP.name())); 
			repcat$PriorityGroupPo.setPriorityGroup(dataObject.getString(Repcat$PriorityGroupPo.COLUMNS.PRIORITY_GROUP.name())); 
			repcat$PriorityGroupPo.setDataTypeId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$PriorityGroupPo.COLUMNS.DATA_TYPE_ID.name()))); 
			repcat$PriorityGroupPo.setFixedDataLength(BigDecimalUtils.formObj(dataObject.getValue(Repcat$PriorityGroupPo.COLUMNS.FIXED_DATA_LENGTH.name()))); 
			repcat$PriorityGroupPo.setPriorityComment(dataObject.getString(Repcat$PriorityGroupPo.COLUMNS.PRIORITY_COMMENT.name())); 
			return repcat$PriorityGroupPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Repcat$PriorityGroupPo repcat$PriorityGroupPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Repcat$PriorityGroupPo.COLUMNS.SNAME.name(), repcat$PriorityGroupPo.getSname()); 
			dataObject.setValue(Repcat$PriorityGroupPo.COLUMNS.SNAME.name(), repcat$PriorityGroupPo.getSname()); 
			dataObject.setValue(Repcat$PriorityGroupPo.COLUMNS.PRIORITY_GROUP.name(), repcat$PriorityGroupPo.getPriorityGroup()); 
			dataObject.setValue(Repcat$PriorityGroupPo.COLUMNS.PRIORITY_GROUP.name(), repcat$PriorityGroupPo.getPriorityGroup()); 
			dataObject.setValue(Repcat$PriorityGroupPo.COLUMNS.DATA_TYPE_ID.name(), repcat$PriorityGroupPo.getDataTypeId()); 
			dataObject.setValue(Repcat$PriorityGroupPo.COLUMNS.FIXED_DATA_LENGTH.name(), repcat$PriorityGroupPo.getFixedDataLength()); 
			dataObject.setValue(Repcat$PriorityGroupPo.COLUMNS.PRIORITY_COMMENT.name(), repcat$PriorityGroupPo.getPriorityComment()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Repcat$PriorityGroupPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Repcat$PriorityGroupPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Repcat$PriorityGroupPo.COLUMNS.SNAME.name(), po.getSname()); 
		sqlWhere.add(Repcat$PriorityGroupPo.COLUMNS.SNAME.name(), po.getSname()); 
		sqlWhere.add(Repcat$PriorityGroupPo.COLUMNS.PRIORITY_GROUP.name(), po.getPriorityGroup()); 
		sqlWhere.add(Repcat$PriorityGroupPo.COLUMNS.PRIORITY_GROUP.name(), po.getPriorityGroup()); 
		sqlWhere.add(Repcat$PriorityGroupPo.COLUMNS.DATA_TYPE_ID.name(), po.getDataTypeId()); 
		sqlWhere.add(Repcat$PriorityGroupPo.COLUMNS.FIXED_DATA_LENGTH.name(), po.getFixedDataLength()); 
		return sqlWhere; 
	} 
 
} 
