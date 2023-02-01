package com.doc.common.dao.impl; 
 
public class Repcat$ConflictDAOImpl extends GeneralDAOImpl<Repcat$ConflictPo> implements IRepcat$ConflictDAO { 
	public static final Repcat$ConflictDAOImpl INSTANCE = new Repcat$ConflictDAOImpl(); 
	public static final String TABLENAME = "REPCAT$_CONFLICT"; 

	public Repcat$ConflictDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Repcat$ConflictPo> CONVERTER = new MapConverter<Repcat$ConflictPo>() { 
 
		@Override 
		public Repcat$ConflictPo convert(final DataObject dataObject) { 
			final Repcat$ConflictPo repcat$ConflictPo = new Repcat$ConflictPo(); 
			repcat$ConflictPo.setSname(dataObject.getString(Repcat$ConflictPo.COLUMNS.SNAME.name())); 
			repcat$ConflictPo.setOname(dataObject.getString(Repcat$ConflictPo.COLUMNS.ONAME.name())); 
			repcat$ConflictPo.setConflictTypeId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$ConflictPo.COLUMNS.CONFLICT_TYPE_ID.name()))); 
			repcat$ConflictPo.setReferenceName(dataObject.getString(Repcat$ConflictPo.COLUMNS.REFERENCE_NAME.name())); 
			return repcat$ConflictPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Repcat$ConflictPo repcat$ConflictPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Repcat$ConflictPo.COLUMNS.SNAME.name(), repcat$ConflictPo.getSname()); 
			dataObject.setValue(Repcat$ConflictPo.COLUMNS.ONAME.name(), repcat$ConflictPo.getOname()); 
			dataObject.setValue(Repcat$ConflictPo.COLUMNS.CONFLICT_TYPE_ID.name(), repcat$ConflictPo.getConflictTypeId()); 
			dataObject.setValue(Repcat$ConflictPo.COLUMNS.REFERENCE_NAME.name(), repcat$ConflictPo.getReferenceName()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Repcat$ConflictPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Repcat$ConflictPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Repcat$ConflictPo.COLUMNS.SNAME.name(), po.getSname()); 
		sqlWhere.add(Repcat$ConflictPo.COLUMNS.ONAME.name(), po.getOname()); 
		sqlWhere.add(Repcat$ConflictPo.COLUMNS.CONFLICT_TYPE_ID.name(), po.getConflictTypeId()); 
		sqlWhere.add(Repcat$ConflictPo.COLUMNS.REFERENCE_NAME.name(), po.getReferenceName()); 
		return sqlWhere; 
	} 
 
} 
