package com.doc.common.dao.impl; 
 
public class SyscodeDAOImpl extends GeneralDAOImpl<SyscodeDo> implements SyscodeDAOImpl { 
	public static final SyscodeDAOImpl INSTANCE = new SyscodeDAOImpl(); 
	public static final String TABLENAME = "SYSCODE"; 

	public SyscodeDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<SyscodeDo> CONVERTER = new MapConverter<SyscodeDo>() { 
 
		@Override 
		public SyscodeDo convert(final DataObject dataObject) { 
			final SyscodeDo syscodeDo = new SyscodeDo(); 
			syscodeDo.setTypeId(dataObject.getString(SyscodeDo.COLUMNS.TYPE_ID.name())); 
			syscodeDo.setCodeId(dataObject.getString(SyscodeDo.COLUMNS.CODE_ID.name())); 
			syscodeDo.setCodeData1(dataObject.getString(SyscodeDo.COLUMNS.CODE_DATA1.name())); 
			syscodeDo.setCodeData2(dataObject.getString(SyscodeDo.COLUMNS.CODE_DATA2.name())); 
			syscodeDo.setCodeData3(dataObject.getString(SyscodeDo.COLUMNS.CODE_DATA3.name())); 
			syscodeDo.setCodeData4(dataObject.getString(SyscodeDo.COLUMNS.CODE_DATA4.name())); 
			return syscodeDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final SyscodeDo syscodeDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(SyscodeDo.COLUMNS.TYPE_ID.name(), syscodeDo.getTypeId()); 
			dataObject.setValue(SyscodeDo.COLUMNS.CODE_ID.name(), syscodeDo.getCodeId()); 
			dataObject.setValue(SyscodeDo.COLUMNS.CODE_DATA1.name(), syscodeDo.getCodeData1()); 
			dataObject.setValue(SyscodeDo.COLUMNS.CODE_DATA2.name(), syscodeDo.getCodeData2()); 
			dataObject.setValue(SyscodeDo.COLUMNS.CODE_DATA3.name(), syscodeDo.getCodeData3()); 
			dataObject.setValue(SyscodeDo.COLUMNS.CODE_DATA4.name(), syscodeDo.getCodeData4()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<SyscodeDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(SyscodeDo po) { 
	} 
 
} 
