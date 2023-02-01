package com.doc.common.dao.impl; 
 
public class FileInfDAOImpl extends GeneralDAOImpl<FileInfPo> implements FileInfDAO { 
	public static final FileInfDAOImpl INSTANCE = new FileInfDAOImpl(); 
	public static final String TABLENAME = "FILE_INF"; 

	public FileInfDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<FileInfPo> CONVERTER = new MapConverter<FileInfPo>() { 
 
		@Override 
		public FileInfPo convert(final DataObject dataObject) { 
			final FileInfPo fileInfPo = new FileInfPo(); 
			fileInfPo.setTransaction(dataObject.getString(FileInfPo.COLUMNS.TRANSACTION.name())); 
			fileInfPo.setContent(); 
			fileInfPo.setFileName(dataObject.getString(FileInfPo.COLUMNS.FILE_NAME.name())); 
			fileInfPo.setCreaTime(TimestampUtils.of(dataObject.getValue(FileInfPo.COLUMNS.CREA_TIME.name()))); 
			fileInfPo.setFileSize(BigDecimalUtils.formObj(dataObject.getValue(FileInfPo.COLUMNS.FILE_SIZE.name()))); 
			return fileInfPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final FileInfPo fileInfPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(FileInfPo.COLUMNS.TRANSACTION.name(), fileInfPo.getTransaction()); 
			dataObject.setValue(FileInfPo.COLUMNS.CONTENT.name(), fileInfPo.getContent()); 
			dataObject.setValue(FileInfPo.COLUMNS.FILE_NAME.name(), fileInfPo.getFileName()); 
			dataObject.setValue(FileInfPo.COLUMNS.CREA_TIME.name(), fileInfPo.getCreaTime()); 
			dataObject.setValue(FileInfPo.COLUMNS.FILE_SIZE.name(), fileInfPo.getFileSize()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<FileInfPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(FileInfPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(FileInfPo.COLUMNS.TRANSACTION.name(), po.getTransaction()); 
		return sqlWhere; 
	} 
 
} 
