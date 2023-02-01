package com.doc.common.dao.impl; 
 
public class IndeclarLogDAOImpl extends GeneralDAOImpl<IndeclarLogPo> implements IndeclarLogDAO { 
	public static final IndeclarLogDAOImpl INSTANCE = new IndeclarLogDAOImpl(); 
	public static final String TABLENAME = "INDECLAR_LOG"; 

	public IndeclarLogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<IndeclarLogPo> CONVERTER = new MapConverter<IndeclarLogPo>() { 
 
		@Override 
		public IndeclarLogPo convert(final DataObject dataObject) { 
			final IndeclarLogPo indeclarLogPo = new IndeclarLogPo(); 
			indeclarLogPo.setBfNo(dataObject.getString(IndeclarLogPo.COLUMNS.BF_NO.name())); 
			indeclarLogPo.setControlNo(dataObject.getString(IndeclarLogPo.COLUMNS.CONTROL_NO.name())); 
			indeclarLogPo.setLogRmk(dataObject.getString(IndeclarLogPo.COLUMNS.LOG_RMK.name())); 
			indeclarLogPo.setProcTime(dataObject.getString(IndeclarLogPo.COLUMNS.PROC_TIME.name())); 
			indeclarLogPo.setODeclNo(dataObject.getString(IndeclarLogPo.COLUMNS.O_DECL_NO.name())); 
			return indeclarLogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final IndeclarLogPo indeclarLogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(IndeclarLogPo.COLUMNS.BF_NO.name(), indeclarLogPo.getBfNo()); 
			dataObject.setValue(IndeclarLogPo.COLUMNS.CONTROL_NO.name(), indeclarLogPo.getControlNo()); 
			dataObject.setValue(IndeclarLogPo.COLUMNS.LOG_RMK.name(), indeclarLogPo.getLogRmk()); 
			dataObject.setValue(IndeclarLogPo.COLUMNS.PROC_TIME.name(), indeclarLogPo.getProcTime()); 
			dataObject.setValue(IndeclarLogPo.COLUMNS.O_DECL_NO.name(), indeclarLogPo.getODeclNo()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<IndeclarLogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(IndeclarLogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
