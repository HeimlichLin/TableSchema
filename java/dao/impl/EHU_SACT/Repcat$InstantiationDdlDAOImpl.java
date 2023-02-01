package com.doc.common.dao.impl; 
 
public class Repcat$InstantiationDdlDAOImpl extends GeneralDAOImpl<Repcat$InstantiationDdlPo> implements IRepcat$InstantiationDdlDAO { 
	public static final Repcat$InstantiationDdlDAOImpl INSTANCE = new Repcat$InstantiationDdlDAOImpl(); 
	public static final String TABLENAME = "REPCAT$_INSTANTIATION_DDL"; 

	public Repcat$InstantiationDdlDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Repcat$InstantiationDdlPo> CONVERTER = new MapConverter<Repcat$InstantiationDdlPo>() { 
 
		@Override 
		public Repcat$InstantiationDdlPo convert(final DataObject dataObject) { 
			final Repcat$InstantiationDdlPo repcat$InstantiationDdlPo = new Repcat$InstantiationDdlPo(); 
			repcat$InstantiationDdlPo.setRefreshTemplateId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$InstantiationDdlPo.COLUMNS.REFRESH_TEMPLATE_ID.name()))); 
			repcat$InstantiationDdlPo.setDdlText(); 
			repcat$InstantiationDdlPo.setDdlNum(BigDecimalUtils.formObj(dataObject.getValue(Repcat$InstantiationDdlPo.COLUMNS.DDL_NUM.name()))); 
			repcat$InstantiationDdlPo.setPhase(BigDecimalUtils.formObj(dataObject.getValue(Repcat$InstantiationDdlPo.COLUMNS.PHASE.name()))); 
			return repcat$InstantiationDdlPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Repcat$InstantiationDdlPo repcat$InstantiationDdlPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Repcat$InstantiationDdlPo.COLUMNS.REFRESH_TEMPLATE_ID.name(), repcat$InstantiationDdlPo.getRefreshTemplateId()); 
			dataObject.setValue(Repcat$InstantiationDdlPo.COLUMNS.DDL_TEXT.name(), repcat$InstantiationDdlPo.getDdlText()); 
			dataObject.setValue(Repcat$InstantiationDdlPo.COLUMNS.DDL_NUM.name(), repcat$InstantiationDdlPo.getDdlNum()); 
			dataObject.setValue(Repcat$InstantiationDdlPo.COLUMNS.PHASE.name(), repcat$InstantiationDdlPo.getPhase()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Repcat$InstantiationDdlPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Repcat$InstantiationDdlPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Repcat$InstantiationDdlPo.COLUMNS.REFRESH_TEMPLATE_ID.name(), po.getRefreshTemplateId()); 
		sqlWhere.add(Repcat$InstantiationDdlPo.COLUMNS.DDL_NUM.name(), po.getDdlNum()); 
		sqlWhere.add(Repcat$InstantiationDdlPo.COLUMNS.PHASE.name(), po.getPhase()); 
		return sqlWhere; 
	} 
 
} 
