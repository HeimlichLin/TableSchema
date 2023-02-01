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
			syscodePo.setCodeType(); 
			syscodePo.setCodeId(); 
			syscodePo.setCodeComment(); 
			syscodePo.setCodeRef1(); 
			syscodePo.setCodeRef2(); 
			syscodePo.setCodeRef3(); 
			syscodePo.setCodeProcess(); 
			return syscodePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final SyscodePo syscodePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(SyscodePo.COLUMNS.CODE_TYPE.name(), syscodePo.getCodeType()); 
			dataObject.setValue(SyscodePo.COLUMNS.CODE_ID.name(), syscodePo.getCodeId()); 
			dataObject.setValue(SyscodePo.COLUMNS.CODE_COMMENT.name(), syscodePo.getCodeComment()); 
			dataObject.setValue(SyscodePo.COLUMNS.CODE_REF1.name(), syscodePo.getCodeRef1()); 
			dataObject.setValue(SyscodePo.COLUMNS.CODE_REF2.name(), syscodePo.getCodeRef2()); 
			dataObject.setValue(SyscodePo.COLUMNS.CODE_REF3.name(), syscodePo.getCodeRef3()); 
			dataObject.setValue(SyscodePo.COLUMNS.CODE_PROCESS.name(), syscodePo.getCodeProcess()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<SyscodePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(SyscodePo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(SyscodePo.COLUMNS.CODE_TYPE.name(), po.getCodeType()); 
		sqlWhere.add(SyscodePo.COLUMNS.CODE_ID.name(), po.getCodeId()); 
		return sqlWhere; 
	} 
 
} 
