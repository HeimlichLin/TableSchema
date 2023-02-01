package com.doc.common.dao.impl; 
 
public class AutowriteoffDAOImpl extends GeneralDAOImpl<AutowriteoffPo> implements AutowriteoffDAO { 
	public static final AutowriteoffDAOImpl INSTANCE = new AutowriteoffDAOImpl(); 
	public static final String TABLENAME = "AUTOWRITEOFF"; 

	public AutowriteoffDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<AutowriteoffPo> CONVERTER = new MapConverter<AutowriteoffPo>() { 
 
		@Override 
		public AutowriteoffPo convert(final DataObject dataObject) { 
			final AutowriteoffPo autowriteoffPo = new AutowriteoffPo(); 
			autowriteoffPo.setBfNo(dataObject.getString(AutowriteoffPo.COLUMNS.BF_NO.name())); 
			autowriteoffPo.setDeclNo(dataObject.getString(AutowriteoffPo.COLUMNS.DECL_NO.name())); 
			autowriteoffPo.setCtmcode(dataObject.getString(AutowriteoffPo.COLUMNS.CTMCODE.name())); 
			autowriteoffPo.setCocompNo(dataObject.getString(AutowriteoffPo.COLUMNS.COCOMP_NO.name())); 
			autowriteoffPo.setInvtrytype(dataObject.getString(AutowriteoffPo.COLUMNS.INVTRYTYPE.name())); 
			autowriteoffPo.setStrType(dataObject.getString(AutowriteoffPo.COLUMNS.STR_TYPE.name())); 
			autowriteoffPo.setIoType(dataObject.getString(AutowriteoffPo.COLUMNS.IO_TYPE.name())); 
			autowriteoffPo.setCreateDate(dataObject.getString(AutowriteoffPo.COLUMNS.CREATE_DATE.name())); 
			autowriteoffPo.setWriteoffDate(dataObject.getString(AutowriteoffPo.COLUMNS.WRITEOFF_DATE.name())); 
			autowriteoffPo.setStatus(dataObject.getString(AutowriteoffPo.COLUMNS.STATUS.name())); 
			return autowriteoffPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final AutowriteoffPo autowriteoffPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(AutowriteoffPo.COLUMNS.BF_NO.name(), autowriteoffPo.getBfNo()); 
			dataObject.setValue(AutowriteoffPo.COLUMNS.DECL_NO.name(), autowriteoffPo.getDeclNo()); 
			dataObject.setValue(AutowriteoffPo.COLUMNS.CTMCODE.name(), autowriteoffPo.getCtmcode()); 
			dataObject.setValue(AutowriteoffPo.COLUMNS.COCOMP_NO.name(), autowriteoffPo.getCocompNo()); 
			dataObject.setValue(AutowriteoffPo.COLUMNS.INVTRYTYPE.name(), autowriteoffPo.getInvtrytype()); 
			dataObject.setValue(AutowriteoffPo.COLUMNS.STR_TYPE.name(), autowriteoffPo.getStrType()); 
			dataObject.setValue(AutowriteoffPo.COLUMNS.IO_TYPE.name(), autowriteoffPo.getIoType()); 
			dataObject.setValue(AutowriteoffPo.COLUMNS.CREATE_DATE.name(), autowriteoffPo.getCreateDate()); 
			dataObject.setValue(AutowriteoffPo.COLUMNS.WRITEOFF_DATE.name(), autowriteoffPo.getWriteoffDate()); 
			dataObject.setValue(AutowriteoffPo.COLUMNS.STATUS.name(), autowriteoffPo.getStatus()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<AutowriteoffPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(AutowriteoffPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
