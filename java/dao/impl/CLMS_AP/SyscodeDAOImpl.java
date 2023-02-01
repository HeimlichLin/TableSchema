package com.doc.common.dao.impl; 
 
public class SyscodeDAOImpl extends GeneralDAOImpl<SyscodePo> implements SyscodeDAO { 
	public static final SyscodeDAOImpl INSTANCE = new SyscodeDAOImpl(); 
	public static final String TABLENAME = "SYSCODE"; 

	public SyscodeDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<SyscodePo> CONVERTER = new MapConverter<SyscodePo>() { 
 
		@Override 
		public SyscodePo convert(final DataObject dataObject) { 
			final SyscodePo syscodePo = new SyscodePo(); 
			syscodePo.setTypeId(dataObject.getString(SyscodePo.COLUMNS.TYPE_ID.name())); 
			syscodePo.setCodeId(dataObject.getString(SyscodePo.COLUMNS.CODE_ID.name())); 
			syscodePo.setCodeData1(dataObject.getString(SyscodePo.COLUMNS.CODE_DATA1.name())); 
			syscodePo.setCodeData2(dataObject.getString(SyscodePo.COLUMNS.CODE_DATA2.name())); 
			syscodePo.setCodeData3(dataObject.getString(SyscodePo.COLUMNS.CODE_DATA3.name())); 
			syscodePo.setCodeData4(dataObject.getString(SyscodePo.COLUMNS.CODE_DATA4.name())); 
			return syscodePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final SyscodePo syscodePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(SyscodePo.COLUMNS.TYPE_ID.name(), syscodePo.getTypeId()); 
			dataObject.setValue(SyscodePo.COLUMNS.CODE_ID.name(), syscodePo.getCodeId()); 
			dataObject.setValue(SyscodePo.COLUMNS.CODE_DATA1.name(), syscodePo.getCodeData1()); 
			dataObject.setValue(SyscodePo.COLUMNS.CODE_DATA2.name(), syscodePo.getCodeData2()); 
			dataObject.setValue(SyscodePo.COLUMNS.CODE_DATA3.name(), syscodePo.getCodeData3()); 
			dataObject.setValue(SyscodePo.COLUMNS.CODE_DATA4.name(), syscodePo.getCodeData4()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<SyscodePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(SyscodePo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
