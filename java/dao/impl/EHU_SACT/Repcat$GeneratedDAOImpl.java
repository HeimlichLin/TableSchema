package com.doc.common.dao.impl; 
 
public class Repcat$GeneratedDAOImpl extends GeneralDAOImpl<Repcat$GeneratedPo> implements IRepcat$GeneratedDAO { 
	public static final Repcat$GeneratedDAOImpl INSTANCE = new Repcat$GeneratedDAOImpl(); 
	public static final String TABLENAME = "REPCAT$_GENERATED"; 

	public Repcat$GeneratedDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Repcat$GeneratedPo> CONVERTER = new MapConverter<Repcat$GeneratedPo>() { 
 
		@Override 
		public Repcat$GeneratedPo convert(final DataObject dataObject) { 
			final Repcat$GeneratedPo repcat$GeneratedPo = new Repcat$GeneratedPo(); 
			repcat$GeneratedPo.setSname(dataObject.getString(Repcat$GeneratedPo.COLUMNS.SNAME.name())); 
			repcat$GeneratedPo.setOname(dataObject.getString(Repcat$GeneratedPo.COLUMNS.ONAME.name())); 
			repcat$GeneratedPo.setType(BigDecimalUtils.formObj(dataObject.getValue(Repcat$GeneratedPo.COLUMNS.TYPE.name()))); 
			repcat$GeneratedPo.setReason(BigDecimalUtils.formObj(dataObject.getValue(Repcat$GeneratedPo.COLUMNS.REASON.name()))); 
			repcat$GeneratedPo.setBaseSname(dataObject.getString(Repcat$GeneratedPo.COLUMNS.BASE_SNAME.name())); 
			repcat$GeneratedPo.setBaseSname(dataObject.getString(Repcat$GeneratedPo.COLUMNS.BASE_SNAME.name())); 
			repcat$GeneratedPo.setBaseOname(dataObject.getString(Repcat$GeneratedPo.COLUMNS.BASE_ONAME.name())); 
			repcat$GeneratedPo.setBaseOname(dataObject.getString(Repcat$GeneratedPo.COLUMNS.BASE_ONAME.name())); 
			repcat$GeneratedPo.setBaseType(BigDecimalUtils.formObj(dataObject.getValue(Repcat$GeneratedPo.COLUMNS.BASE_TYPE.name()))); 
			repcat$GeneratedPo.setBaseType(BigDecimalUtils.formObj(dataObject.getValue(Repcat$GeneratedPo.COLUMNS.BASE_TYPE.name()))); 
			repcat$GeneratedPo.setPackagePrefix(dataObject.getString(Repcat$GeneratedPo.COLUMNS.PACKAGE_PREFIX.name())); 
			repcat$GeneratedPo.setProcedurePrefix(dataObject.getString(Repcat$GeneratedPo.COLUMNS.PROCEDURE_PREFIX.name())); 
			repcat$GeneratedPo.setDistributed(dataObject.getString(Repcat$GeneratedPo.COLUMNS.DISTRIBUTED.name())); 
			return repcat$GeneratedPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Repcat$GeneratedPo repcat$GeneratedPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Repcat$GeneratedPo.COLUMNS.SNAME.name(), repcat$GeneratedPo.getSname()); 
			dataObject.setValue(Repcat$GeneratedPo.COLUMNS.ONAME.name(), repcat$GeneratedPo.getOname()); 
			dataObject.setValue(Repcat$GeneratedPo.COLUMNS.TYPE.name(), repcat$GeneratedPo.getType()); 
			dataObject.setValue(Repcat$GeneratedPo.COLUMNS.REASON.name(), repcat$GeneratedPo.getReason()); 
			dataObject.setValue(Repcat$GeneratedPo.COLUMNS.BASE_SNAME.name(), repcat$GeneratedPo.getBaseSname()); 
			dataObject.setValue(Repcat$GeneratedPo.COLUMNS.BASE_SNAME.name(), repcat$GeneratedPo.getBaseSname()); 
			dataObject.setValue(Repcat$GeneratedPo.COLUMNS.BASE_ONAME.name(), repcat$GeneratedPo.getBaseOname()); 
			dataObject.setValue(Repcat$GeneratedPo.COLUMNS.BASE_ONAME.name(), repcat$GeneratedPo.getBaseOname()); 
			dataObject.setValue(Repcat$GeneratedPo.COLUMNS.BASE_TYPE.name(), repcat$GeneratedPo.getBaseType()); 
			dataObject.setValue(Repcat$GeneratedPo.COLUMNS.BASE_TYPE.name(), repcat$GeneratedPo.getBaseType()); 
			dataObject.setValue(Repcat$GeneratedPo.COLUMNS.PACKAGE_PREFIX.name(), repcat$GeneratedPo.getPackagePrefix()); 
			dataObject.setValue(Repcat$GeneratedPo.COLUMNS.PROCEDURE_PREFIX.name(), repcat$GeneratedPo.getProcedurePrefix()); 
			dataObject.setValue(Repcat$GeneratedPo.COLUMNS.DISTRIBUTED.name(), repcat$GeneratedPo.getDistributed()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Repcat$GeneratedPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Repcat$GeneratedPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Repcat$GeneratedPo.COLUMNS.SNAME.name(), po.getSname()); 
		sqlWhere.add(Repcat$GeneratedPo.COLUMNS.ONAME.name(), po.getOname()); 
		sqlWhere.add(Repcat$GeneratedPo.COLUMNS.TYPE.name(), po.getType()); 
		sqlWhere.add(Repcat$GeneratedPo.COLUMNS.BASE_SNAME.name(), po.getBaseSname()); 
		sqlWhere.add(Repcat$GeneratedPo.COLUMNS.BASE_SNAME.name(), po.getBaseSname()); 
		sqlWhere.add(Repcat$GeneratedPo.COLUMNS.BASE_ONAME.name(), po.getBaseOname()); 
		sqlWhere.add(Repcat$GeneratedPo.COLUMNS.BASE_ONAME.name(), po.getBaseOname()); 
		sqlWhere.add(Repcat$GeneratedPo.COLUMNS.BASE_TYPE.name(), po.getBaseType()); 
		sqlWhere.add(Repcat$GeneratedPo.COLUMNS.BASE_TYPE.name(), po.getBaseType()); 
		return sqlWhere; 
	} 
 
} 
