package com.doc.common.dao.impl; 
 
public class BomTDAOImpl extends GeneralDAOImpl<BomTPo> implements BomTDAO { 
	public static final BomTDAOImpl INSTANCE = new BomTDAOImpl(); 
	public static final String TABLENAME = "BOM_T"; 

	public BomTDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<BomTPo> CONVERTER = new MapConverter<BomTPo>() { 
 
		@Override 
		public BomTPo convert(final DataObject dataObject) { 
			final BomTPo bomTPo = new BomTPo(); 
			bomTPo.setBfNo(dataObject.getString(BomTPo.COLUMNS.BF_NO.name())); 
			bomTPo.setBfBomNo(dataObject.getString(BomTPo.COLUMNS.BF_BOM_NO.name())); 
			bomTPo.setBomNo(dataObject.getString(BomTPo.COLUMNS.BOM_NO.name())); 
			bomTPo.setVer(dataObject.getString(BomTPo.COLUMNS.VER.name())); 
			bomTPo.setProcess(dataObject.getString(BomTPo.COLUMNS.PROCESS.name())); 
			bomTPo.setBomDate(dataObject.getString(BomTPo.COLUMNS.BOM_DATE.name())); 
			bomTPo.setBomType(dataObject.getString(BomTPo.COLUMNS.BOM_TYPE.name())); 
			bomTPo.setWhs(dataObject.getString(BomTPo.COLUMNS.WHS.name())); 
			bomTPo.setApproveDocNo(dataObject.getString(BomTPo.COLUMNS.APPROVE_DOC_NO.name())); 
			bomTPo.setApproveDate(dataObject.getString(BomTPo.COLUMNS.APPROVE_DATE.name())); 
			bomTPo.setCtmCode(dataObject.getString(BomTPo.COLUMNS.CTM_CODE.name())); 
			bomTPo.setRemark(dataObject.getString(BomTPo.COLUMNS.REMARK.name())); 
			bomTPo.setUserId(dataObject.getString(BomTPo.COLUMNS.USER_ID.name())); 
			bomTPo.setExpired(dataObject.getString(BomTPo.COLUMNS.EXPIRED.name())); 
			bomTPo.setUseMark(dataObject.getString(BomTPo.COLUMNS.USE_MARK.name())); 
			bomTPo.setCocompNo(dataObject.getString(BomTPo.COLUMNS.COCOMP_NO.name())); 
			return bomTPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final BomTPo bomTPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(BomTPo.COLUMNS.BF_NO.name(), bomTPo.getBfNo()); 
			dataObject.setValue(BomTPo.COLUMNS.BF_BOM_NO.name(), bomTPo.getBfBomNo()); 
			dataObject.setValue(BomTPo.COLUMNS.BOM_NO.name(), bomTPo.getBomNo()); 
			dataObject.setValue(BomTPo.COLUMNS.VER.name(), bomTPo.getVer()); 
			dataObject.setValue(BomTPo.COLUMNS.PROCESS.name(), bomTPo.getProcess()); 
			dataObject.setValue(BomTPo.COLUMNS.BOM_DATE.name(), bomTPo.getBomDate()); 
			dataObject.setValue(BomTPo.COLUMNS.BOM_TYPE.name(), bomTPo.getBomType()); 
			dataObject.setValue(BomTPo.COLUMNS.WHS.name(), bomTPo.getWhs()); 
			dataObject.setValue(BomTPo.COLUMNS.APPROVE_DOC_NO.name(), bomTPo.getApproveDocNo()); 
			dataObject.setValue(BomTPo.COLUMNS.APPROVE_DATE.name(), bomTPo.getApproveDate()); 
			dataObject.setValue(BomTPo.COLUMNS.CTM_CODE.name(), bomTPo.getCtmCode()); 
			dataObject.setValue(BomTPo.COLUMNS.REMARK.name(), bomTPo.getRemark()); 
			dataObject.setValue(BomTPo.COLUMNS.USER_ID.name(), bomTPo.getUserId()); 
			dataObject.setValue(BomTPo.COLUMNS.EXPIRED.name(), bomTPo.getExpired()); 
			dataObject.setValue(BomTPo.COLUMNS.USE_MARK.name(), bomTPo.getUseMark()); 
			dataObject.setValue(BomTPo.COLUMNS.COCOMP_NO.name(), bomTPo.getCocompNo()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<BomTPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(BomTPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
