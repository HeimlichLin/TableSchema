package com.doc.common.dao.impl; 
 
public class WorkpictureDAOImpl extends GeneralDAOImpl<WorkpicturePo> implements WorkpictureDAO { 
	public static final WorkpictureDAOImpl INSTANCE = new WorkpictureDAOImpl(); 
	public static final String TABLENAME = "WORKPICTURE"; 

	public WorkpictureDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<WorkpicturePo> CONVERTER = new MapConverter<WorkpicturePo>() { 
 
		@Override 
		public WorkpicturePo convert(final DataObject dataObject) { 
			final WorkpicturePo workpicturePo = new WorkpicturePo(); 
			workpicturePo.setInday(TimestampUtils.of(dataObject.getValue(WorkpicturePo.COLUMNS.INDAY.name()))); 
			workpicturePo.setExpressid(dataObject.getString(WorkpicturePo.COLUMNS.EXPRESSID.name())); 
			workpicturePo.setExpresssname(dataObject.getString(WorkpicturePo.COLUMNS.EXPRESSSNAME.name())); 
			workpicturePo.setNumberonbag(dataObject.getString(WorkpicturePo.COLUMNS.NUMBERONBAG.name())); 
			workpicturePo.setMd5(dataObject.getString(WorkpicturePo.COLUMNS.MD5.name())); 
			workpicturePo.setRemark(dataObject.getString(WorkpicturePo.COLUMNS.REMARK.name())); 
			workpicturePo.setUserid(dataObject.getString(WorkpicturePo.COLUMNS.USERID.name())); 
			workpicturePo.setUploaddate(TimestampUtils.of(dataObject.getValue(WorkpicturePo.COLUMNS.UPLOADDATE.name()))); 
			return workpicturePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final WorkpicturePo workpicturePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WorkpicturePo.COLUMNS.INDAY.name(), workpicturePo.getInday()); 
			dataObject.setValue(WorkpicturePo.COLUMNS.EXPRESSID.name(), workpicturePo.getExpressid()); 
			dataObject.setValue(WorkpicturePo.COLUMNS.EXPRESSSNAME.name(), workpicturePo.getExpresssname()); 
			dataObject.setValue(WorkpicturePo.COLUMNS.NUMBERONBAG.name(), workpicturePo.getNumberonbag()); 
			dataObject.setValue(WorkpicturePo.COLUMNS.MD5.name(), workpicturePo.getMd5()); 
			dataObject.setValue(WorkpicturePo.COLUMNS.REMARK.name(), workpicturePo.getRemark()); 
			dataObject.setValue(WorkpicturePo.COLUMNS.USERID.name(), workpicturePo.getUserid()); 
			dataObject.setValue(WorkpicturePo.COLUMNS.UPLOADDATE.name(), workpicturePo.getUploaddate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<WorkpicturePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(WorkpicturePo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
