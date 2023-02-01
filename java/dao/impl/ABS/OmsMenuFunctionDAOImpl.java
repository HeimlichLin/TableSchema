package com.doc.common.dao.impl; 
 
public class OmsMenuFunctionDAOImpl extends GeneralDAOImpl<OmsMenuFunctionPo> implements OmsMenuFunctionDAO { 
	public static final OmsMenuFunctionDAOImpl INSTANCE = new OmsMenuFunctionDAOImpl(); 
	public static final String TABLENAME = "OMS_MENU_FUNCTION"; 

	public OmsMenuFunctionDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final IConverter<OmsMenuFunctionPo> CONVERTER = new IConverter<OmsMenuFunctionPo>() { 
 
		@Override 
		public OmsMenuFunctionPo convert(final RowMap rowMap) { 
			final OmsMenuFunctionPo omsMenuFunctionPo = new OmsMenuFunctionPo(); 
			omsMenuFunctionPo.setProgramId(BigDecimalUtils.formObj(rowMap.getValue(OmsMenuFunctionPo.COLUMNS.PROGRAM_ID.name()))); 
			omsMenuFunctionPo.setParentId(BigDecimalUtils.formObj(rowMap.getValue(OmsMenuFunctionPo.COLUMNS.PARENT_ID.name()))); 
			omsMenuFunctionPo.setSort(BigDecimalUtils.formObj(rowMap.getValue(OmsMenuFunctionPo.COLUMNS.SORT.name()))); 
			omsMenuFunctionPo.setName(rowMap.getString(OmsMenuFunctionPo.COLUMNS.NAME.name())); 
			omsMenuFunctionPo.setPathProgram(rowMap.getString(OmsMenuFunctionPo.COLUMNS.PATH_PROGRAM.name())); 
			omsMenuFunctionPo.setCreationDate(TimestampUtils.of(rowMap.getValue(OmsMenuFunctionPo.COLUMNS.CREATION_DATE.name()))); 
			omsMenuFunctionPo.setCreatedBy(rowMap.getString(OmsMenuFunctionPo.COLUMNS.CREATED_BY.name())); 
			omsMenuFunctionPo.setLastUpdateDate(TimestampUtils.of(rowMap.getValue(OmsMenuFunctionPo.COLUMNS.LAST_UPDATE_DATE.name()))); 
			omsMenuFunctionPo.setLastUpdatedBy(rowMap.getString(OmsMenuFunctionPo.COLUMNS.LAST_UPDATED_BY.name())); 
			omsMenuFunctionPo.setLegalEntity(rowMap.getString(OmsMenuFunctionPo.COLUMNS.LEGAL_ENTITY.name())); 
			omsMenuFunctionPo.setProgramAlias(rowMap.getString(OmsMenuFunctionPo.COLUMNS.PROGRAM_ALIAS.name())); 
			return omsMenuFunctionPo; 
		} 
 
		@Override 
		public RowMap toRowMap(final OmsMenuFunctionPo omsMenuFunctionPo) { 
			final RowMap rowMap = new RowMap(); 
			rowMap.setValue(OmsMenuFunctionPo.COLUMNS.PROGRAM_ID.name(), omsMenuFunctionPo.getProgramId()); 
			rowMap.setValue(OmsMenuFunctionPo.COLUMNS.PARENT_ID.name(), omsMenuFunctionPo.getParentId()); 
			rowMap.setValue(OmsMenuFunctionPo.COLUMNS.SORT.name(), omsMenuFunctionPo.getSort()); 
			rowMap.setValue(OmsMenuFunctionPo.COLUMNS.NAME.name(), omsMenuFunctionPo.getName()); 
			rowMap.setValue(OmsMenuFunctionPo.COLUMNS.PATH_PROGRAM.name(), omsMenuFunctionPo.getPathProgram()); 
			rowMap.setValue(OmsMenuFunctionPo.COLUMNS.CREATION_DATE.name(), omsMenuFunctionPo.getCreationDate()); 
			rowMap.setValue(OmsMenuFunctionPo.COLUMNS.CREATED_BY.name(), omsMenuFunctionPo.getCreatedBy()); 
			rowMap.setValue(OmsMenuFunctionPo.COLUMNS.LAST_UPDATE_DATE.name(), omsMenuFunctionPo.getLastUpdateDate()); 
			rowMap.setValue(OmsMenuFunctionPo.COLUMNS.LAST_UPDATED_BY.name(), omsMenuFunctionPo.getLastUpdatedBy()); 
			rowMap.setValue(OmsMenuFunctionPo.COLUMNS.LEGAL_ENTITY.name(), omsMenuFunctionPo.getLegalEntity()); 
			rowMap.setValue(OmsMenuFunctionPo.COLUMNS.PROGRAM_ALIAS.name(), omsMenuFunctionPo.getProgramAlias()); 
			return rowMap; 
		} 
 
	}; 
 
	public IConverter<OmsMenuFunctionPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(OmsMenuFunctionPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
