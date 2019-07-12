package com.doc.common.dao.impl; 
 
public class WorkorderDAOImpl extends GeneralDAOImpl<WorkorderDo> implements WorkorderDAOImpl { 
	public static final WorkorderDAOImpl INSTANCE = new WorkorderDAOImpl(); 
	public static final String TABLENAME = "WORKORDER"; 

	public WorkorderDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<WorkorderDo> CONVERTER = new MapConverter<WorkorderDo>() { 
 
		@Override 
		public WorkorderDo convert(final DataObject dataObject) { 
			final WorkorderDo workorderDo = new WorkorderDo(); 
			workorderDo.setBondno(dataObject.getString(WorkorderDo.COLUMNS.BONDNO.name())); 
			workorderDo.setWorkno(dataObject.getString(WorkorderDo.COLUMNS.WORKNO.name())); 
			workorderDo.setCtmcode(dataObject.getString(WorkorderDo.COLUMNS.CTMCODE.name())); 
			workorderDo.setPrdtno(dataObject.getString(WorkorderDo.COLUMNS.PRDTNO.name())); 
			workorderDo.setPrdtqty(BigDecimalUtils.formObj(dataObject.getString(WorkorderDo.COLUMNS.PRDTQTY.name()))); 
			workorderDo.setRstrqty(BigDecimalUtils.formObj(dataObject.getString(WorkorderDo.COLUMNS.RSTRQTY.name()))); 
			workorderDo.setPrdtunit(dataObject.getString(WorkorderDo.COLUMNS.PRDTUNIT.name())); 
			workorderDo.setReqrdate(dataObject.getString(WorkorderDo.COLUMNS.REQRDATE.name())); 
			workorderDo.setApplydate(dataObject.getString(WorkorderDo.COLUMNS.APPLYDATE.name())); 
			workorderDo.setApprovedno(dataObject.getString(WorkorderDo.COLUMNS.APPROVEDNO.name())); 
			workorderDo.setApproveddate(dataObject.getString(WorkorderDo.COLUMNS.APPROVEDDATE.name())); 
			workorderDo.setPrdtname(dataObject.getString(WorkorderDo.COLUMNS.PRDTNAME.name())); 
			workorderDo.setPrdtspec(dataObject.getString(WorkorderDo.COLUMNS.PRDTSPEC.name())); 
			workorderDo.setProcess(dataObject.getString(WorkorderDo.COLUMNS.PROCESS.name())); 
			workorderDo.setD8date(dataObject.getString(WorkorderDo.COLUMNS.D8DATE.name())); 
			return workorderDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final WorkorderDo workorderDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WorkorderDo.COLUMNS.BONDNO.name(), workorderDo.getBondno()); 
			dataObject.setValue(WorkorderDo.COLUMNS.WORKNO.name(), workorderDo.getWorkno()); 
			dataObject.setValue(WorkorderDo.COLUMNS.CTMCODE.name(), workorderDo.getCtmcode()); 
			dataObject.setValue(WorkorderDo.COLUMNS.PRDTNO.name(), workorderDo.getPrdtno()); 
			dataObject.setValue(WorkorderDo.COLUMNS.PRDTQTY.name(), workorderDo.getPrdtqty()); 
			dataObject.setValue(WorkorderDo.COLUMNS.RSTRQTY.name(), workorderDo.getRstrqty()); 
			dataObject.setValue(WorkorderDo.COLUMNS.PRDTUNIT.name(), workorderDo.getPrdtunit()); 
			dataObject.setValue(WorkorderDo.COLUMNS.REQRDATE.name(), workorderDo.getReqrdate()); 
			dataObject.setValue(WorkorderDo.COLUMNS.APPLYDATE.name(), workorderDo.getApplydate()); 
			dataObject.setValue(WorkorderDo.COLUMNS.APPROVEDNO.name(), workorderDo.getApprovedno()); 
			dataObject.setValue(WorkorderDo.COLUMNS.APPROVEDDATE.name(), workorderDo.getApproveddate()); 
			dataObject.setValue(WorkorderDo.COLUMNS.PRDTNAME.name(), workorderDo.getPrdtname()); 
			dataObject.setValue(WorkorderDo.COLUMNS.PRDTSPEC.name(), workorderDo.getPrdtspec()); 
			dataObject.setValue(WorkorderDo.COLUMNS.PROCESS.name(), workorderDo.getProcess()); 
			dataObject.setValue(WorkorderDo.COLUMNS.D8DATE.name(), workorderDo.getD8date()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<WorkorderDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(WorkorderDo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(WorkorderDo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(WorkorderDo.COLUMNS.WORKNO.name(), po.getWorkno()); 
		sqlWhere.add(WorkorderDo.COLUMNS.CTMCODE.name(), po.getCtmcode()); 
		return sqlWhere; 
	} 
 
} 
