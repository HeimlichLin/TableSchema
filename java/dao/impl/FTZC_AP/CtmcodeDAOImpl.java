package com.doc.common.dao.impl; 
 
public class CtmcodeDAOImpl extends GeneralDAOImpl<CtmcodePo> implements CtmcodeDAO { 
	public static final CtmcodeDAOImpl INSTANCE = new CtmcodeDAOImpl(); 
	public static final String TABLENAME = "CTMCODE"; 

	public CtmcodeDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<CtmcodePo> CONVERTER = new MapConverter<CtmcodePo>() { 
 
		@Override 
		public CtmcodePo convert(final DataObject dataObject) { 
			final CtmcodePo ctmcodePo = new CtmcodePo(); 
			ctmcodePo.setBfNo(dataObject.getString(CtmcodePo.COLUMNS.BF_NO.name())); 
			ctmcodePo.setCtmCode(dataObject.getString(CtmcodePo.COLUMNS.CTM_CODE.name())); 
			ctmcodePo.setCtmName(dataObject.getString(CtmcodePo.COLUMNS.CTM_NAME.name())); 
			ctmcodePo.setCtmUserId(dataObject.getString(CtmcodePo.COLUMNS.CTM_USER_ID.name())); 
			ctmcodePo.setCtmBan(dataObject.getString(CtmcodePo.COLUMNS.CTM_BAN.name())); 
			ctmcodePo.setCtmEname(dataObject.getString(CtmcodePo.COLUMNS.CTM_ENAME.name())); 
			ctmcodePo.setCtmAdd(dataObject.getString(CtmcodePo.COLUMNS.CTM_ADD.name())); 
			ctmcodePo.setStatus(dataObject.getString(CtmcodePo.COLUMNS.STATUS.name())); 
			ctmcodePo.setCreateDate(dataObject.getString(CtmcodePo.COLUMNS.CREATE_DATE.name())); 
			return ctmcodePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final CtmcodePo ctmcodePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(CtmcodePo.COLUMNS.BF_NO.name(), ctmcodePo.getBfNo()); 
			dataObject.setValue(CtmcodePo.COLUMNS.CTM_CODE.name(), ctmcodePo.getCtmCode()); 
			dataObject.setValue(CtmcodePo.COLUMNS.CTM_NAME.name(), ctmcodePo.getCtmName()); 
			dataObject.setValue(CtmcodePo.COLUMNS.CTM_USER_ID.name(), ctmcodePo.getCtmUserId()); 
			dataObject.setValue(CtmcodePo.COLUMNS.CTM_BAN.name(), ctmcodePo.getCtmBan()); 
			dataObject.setValue(CtmcodePo.COLUMNS.CTM_ENAME.name(), ctmcodePo.getCtmEname()); 
			dataObject.setValue(CtmcodePo.COLUMNS.CTM_ADD.name(), ctmcodePo.getCtmAdd()); 
			dataObject.setValue(CtmcodePo.COLUMNS.STATUS.name(), ctmcodePo.getStatus()); 
			dataObject.setValue(CtmcodePo.COLUMNS.CREATE_DATE.name(), ctmcodePo.getCreateDate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<CtmcodePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(CtmcodePo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(CtmcodePo.COLUMNS.BF_NO.name(), po.getBfNo()); 
		sqlWhere.add(CtmcodePo.COLUMNS.CTM_CODE.name(), po.getCtmCode()); 
		return sqlWhere; 
	} 
 
} 
