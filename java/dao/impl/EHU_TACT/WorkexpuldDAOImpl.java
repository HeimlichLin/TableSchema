package com.doc.common.dao.impl; 
 
public class WorkexpuldDAOImpl extends GeneralDAOImpl<WorkexpuldPo> implements WorkexpuldDAO { 
	public static final WorkexpuldDAOImpl INSTANCE = new WorkexpuldDAOImpl(); 
	public static final String TABLENAME = "WORKEXPULD"; 

	public WorkexpuldDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<WorkexpuldPo> CONVERTER = new MapConverter<WorkexpuldPo>() { 
 
		@Override 
		public WorkexpuldPo convert(final DataObject dataObject) { 
			final WorkexpuldPo workexpuldPo = new WorkexpuldPo(); 
			workexpuldPo.setContainer(dataObject.getString(WorkexpuldPo.COLUMNS.CONTAINER.name())); 
			workexpuldPo.setCreatedate(TimestampUtils.of(dataObject.getValue(WorkexpuldPo.COLUMNS.CREATEDATE.name()))); 
			workexpuldPo.setTotalweight(BigDecimalUtils.formObj(dataObject.getValue(WorkexpuldPo.COLUMNS.TOTALWEIGHT.name()))); 
			workexpuldPo.setUpdateuser(dataObject.getString(WorkexpuldPo.COLUMNS.UPDATEUSER.name())); 
			workexpuldPo.setLastupdate(TimestampUtils.of(dataObject.getValue(WorkexpuldPo.COLUMNS.LASTUPDATE.name()))); 
			workexpuldPo.setSendtime(TimestampUtils.of(dataObject.getValue(WorkexpuldPo.COLUMNS.SENDTIME.name()))); 
			workexpuldPo.setWorkarea(dataObject.getString(WorkexpuldPo.COLUMNS.WORKAREA.name())); 
			return workexpuldPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final WorkexpuldPo workexpuldPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WorkexpuldPo.COLUMNS.CONTAINER.name(), workexpuldPo.getContainer()); 
			dataObject.setValue(WorkexpuldPo.COLUMNS.CREATEDATE.name(), workexpuldPo.getCreatedate()); 
			dataObject.setValue(WorkexpuldPo.COLUMNS.TOTALWEIGHT.name(), workexpuldPo.getTotalweight()); 
			dataObject.setValue(WorkexpuldPo.COLUMNS.UPDATEUSER.name(), workexpuldPo.getUpdateuser()); 
			dataObject.setValue(WorkexpuldPo.COLUMNS.LASTUPDATE.name(), workexpuldPo.getLastupdate()); 
			dataObject.setValue(WorkexpuldPo.COLUMNS.SENDTIME.name(), workexpuldPo.getSendtime()); 
			dataObject.setValue(WorkexpuldPo.COLUMNS.WORKAREA.name(), workexpuldPo.getWorkarea()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<WorkexpuldPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(WorkexpuldPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
