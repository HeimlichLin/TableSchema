package com.doc.common.dao.impl; 
 
public class WorkorderDAOImpl extends GeneralDAOImpl<WorkorderPo> implements WorkorderDAO { 
	public static final WorkorderDAOImpl INSTANCE = new WorkorderDAOImpl(); 
	public static final String TABLENAME = "WORKORDER"; 

	public WorkorderDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<WorkorderPo> CONVERTER = new MapConverter<WorkorderPo>() { 
 
		@Override 
		public WorkorderPo convert(final DataObject dataObject) { 
			final WorkorderPo workorderPo = new WorkorderPo(); 
			workorderPo.setBondno(dataObject.getString(WorkorderPo.COLUMNS.BONDNO.name())); 
			workorderPo.setWorkno(dataObject.getString(WorkorderPo.COLUMNS.WORKNO.name())); 
			workorderPo.setCtmcode(dataObject.getString(WorkorderPo.COLUMNS.CTMCODE.name())); 
			workorderPo.setPrdtno(dataObject.getString(WorkorderPo.COLUMNS.PRDTNO.name())); 
			workorderPo.setPrdtqty(BigDecimalUtils.formObj(dataObject.getValue(WorkorderPo.COLUMNS.PRDTQTY.name()))); 
			workorderPo.setRstrqty(BigDecimalUtils.formObj(dataObject.getValue(WorkorderPo.COLUMNS.RSTRQTY.name()))); 
			workorderPo.setPrdtunit(dataObject.getString(WorkorderPo.COLUMNS.PRDTUNIT.name())); 
			workorderPo.setReqrdate(dataObject.getString(WorkorderPo.COLUMNS.REQRDATE.name())); 
			workorderPo.setApplydate(dataObject.getString(WorkorderPo.COLUMNS.APPLYDATE.name())); 
			workorderPo.setApprovedno(dataObject.getString(WorkorderPo.COLUMNS.APPROVEDNO.name())); 
			workorderPo.setApproveddate(dataObject.getString(WorkorderPo.COLUMNS.APPROVEDDATE.name())); 
			workorderPo.setPrdtname(dataObject.getString(WorkorderPo.COLUMNS.PRDTNAME.name())); 
			workorderPo.setPrdtspec(dataObject.getString(WorkorderPo.COLUMNS.PRDTSPEC.name())); 
			workorderPo.setProcess(dataObject.getString(WorkorderPo.COLUMNS.PROCESS.name())); 
			workorderPo.setD8date(dataObject.getString(WorkorderPo.COLUMNS.D8DATE.name())); 
			return workorderPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final WorkorderPo workorderPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WorkorderPo.COLUMNS.BONDNO.name(), workorderPo.getBondno()); 
			dataObject.setValue(WorkorderPo.COLUMNS.WORKNO.name(), workorderPo.getWorkno()); 
			dataObject.setValue(WorkorderPo.COLUMNS.CTMCODE.name(), workorderPo.getCtmcode()); 
			dataObject.setValue(WorkorderPo.COLUMNS.PRDTNO.name(), workorderPo.getPrdtno()); 
			dataObject.setValue(WorkorderPo.COLUMNS.PRDTQTY.name(), workorderPo.getPrdtqty()); 
			dataObject.setValue(WorkorderPo.COLUMNS.RSTRQTY.name(), workorderPo.getRstrqty()); 
			dataObject.setValue(WorkorderPo.COLUMNS.PRDTUNIT.name(), workorderPo.getPrdtunit()); 
			dataObject.setValue(WorkorderPo.COLUMNS.REQRDATE.name(), workorderPo.getReqrdate()); 
			dataObject.setValue(WorkorderPo.COLUMNS.APPLYDATE.name(), workorderPo.getApplydate()); 
			dataObject.setValue(WorkorderPo.COLUMNS.APPROVEDNO.name(), workorderPo.getApprovedno()); 
			dataObject.setValue(WorkorderPo.COLUMNS.APPROVEDDATE.name(), workorderPo.getApproveddate()); 
			dataObject.setValue(WorkorderPo.COLUMNS.PRDTNAME.name(), workorderPo.getPrdtname()); 
			dataObject.setValue(WorkorderPo.COLUMNS.PRDTSPEC.name(), workorderPo.getPrdtspec()); 
			dataObject.setValue(WorkorderPo.COLUMNS.PROCESS.name(), workorderPo.getProcess()); 
			dataObject.setValue(WorkorderPo.COLUMNS.D8DATE.name(), workorderPo.getD8date()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<WorkorderPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(WorkorderPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(WorkorderPo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(WorkorderPo.COLUMNS.WORKNO.name(), po.getWorkno()); 
		sqlWhere.add(WorkorderPo.COLUMNS.CTMCODE.name(), po.getCtmcode()); 
		return sqlWhere; 
	} 
 
} 
