package com.doc.common.dao.impl; 
 
public class Repcat$TemplateRefgroupsDAOImpl extends GeneralDAOImpl<Repcat$TemplateRefgroupsPo> implements IRepcat$TemplateRefgroupsDAO { 
	public static final Repcat$TemplateRefgroupsDAOImpl INSTANCE = new Repcat$TemplateRefgroupsDAOImpl(); 
	public static final String TABLENAME = "REPCAT$_TEMPLATE_REFGROUPS"; 

	public Repcat$TemplateRefgroupsDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Repcat$TemplateRefgroupsPo> CONVERTER = new MapConverter<Repcat$TemplateRefgroupsPo>() { 
 
		@Override 
		public Repcat$TemplateRefgroupsPo convert(final DataObject dataObject) { 
			final Repcat$TemplateRefgroupsPo repcat$TemplateRefgroupsPo = new Repcat$TemplateRefgroupsPo(); 
			repcat$TemplateRefgroupsPo.setRefreshGroupId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$TemplateRefgroupsPo.COLUMNS.REFRESH_GROUP_ID.name()))); 
			repcat$TemplateRefgroupsPo.setRefreshGroupName(dataObject.getString(Repcat$TemplateRefgroupsPo.COLUMNS.REFRESH_GROUP_NAME.name())); 
			repcat$TemplateRefgroupsPo.setRefreshTemplateId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$TemplateRefgroupsPo.COLUMNS.REFRESH_TEMPLATE_ID.name()))); 
			repcat$TemplateRefgroupsPo.setRollbackSeg(dataObject.getString(Repcat$TemplateRefgroupsPo.COLUMNS.ROLLBACK_SEG.name())); 
			repcat$TemplateRefgroupsPo.setStartDate(dataObject.getString(Repcat$TemplateRefgroupsPo.COLUMNS.START_DATE.name())); 
			repcat$TemplateRefgroupsPo.setInterval(dataObject.getString(Repcat$TemplateRefgroupsPo.COLUMNS.INTERVAL.name())); 
			return repcat$TemplateRefgroupsPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Repcat$TemplateRefgroupsPo repcat$TemplateRefgroupsPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Repcat$TemplateRefgroupsPo.COLUMNS.REFRESH_GROUP_ID.name(), repcat$TemplateRefgroupsPo.getRefreshGroupId()); 
			dataObject.setValue(Repcat$TemplateRefgroupsPo.COLUMNS.REFRESH_GROUP_NAME.name(), repcat$TemplateRefgroupsPo.getRefreshGroupName()); 
			dataObject.setValue(Repcat$TemplateRefgroupsPo.COLUMNS.REFRESH_TEMPLATE_ID.name(), repcat$TemplateRefgroupsPo.getRefreshTemplateId()); 
			dataObject.setValue(Repcat$TemplateRefgroupsPo.COLUMNS.ROLLBACK_SEG.name(), repcat$TemplateRefgroupsPo.getRollbackSeg()); 
			dataObject.setValue(Repcat$TemplateRefgroupsPo.COLUMNS.START_DATE.name(), repcat$TemplateRefgroupsPo.getStartDate()); 
			dataObject.setValue(Repcat$TemplateRefgroupsPo.COLUMNS.INTERVAL.name(), repcat$TemplateRefgroupsPo.getInterval()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Repcat$TemplateRefgroupsPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Repcat$TemplateRefgroupsPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Repcat$TemplateRefgroupsPo.COLUMNS.REFRESH_GROUP_ID.name(), po.getRefreshGroupId()); 
		sqlWhere.add(Repcat$TemplateRefgroupsPo.COLUMNS.REFRESH_TEMPLATE_ID.name(), po.getRefreshTemplateId()); 
		return sqlWhere; 
	} 
 
} 
