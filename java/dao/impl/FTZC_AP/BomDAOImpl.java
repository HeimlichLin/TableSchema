package com.doc.common.dao.impl; 
 
public class BomDAOImpl extends GeneralDAOImpl<BomPo> implements BomDAO { 
	public static final BomDAOImpl INSTANCE = new BomDAOImpl(); 
	public static final String TABLENAME = "BOM"; 

	public BomDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<BomPo> CONVERTER = new MapConverter<BomPo>() { 
 
		@Override 
		public BomPo convert(final DataObject dataObject) { 
			final BomPo bomPo = new BomPo(); 
			bomPo.setBfNo(dataObject.getString(BomPo.COLUMNS.BF_NO.name())); 
			bomPo.setBfBomNo(dataObject.getString(BomPo.COLUMNS.BF_BOM_NO.name())); 
			bomPo.setBomNo(dataObject.getString(BomPo.COLUMNS.BOM_NO.name())); 
			bomPo.setVer(dataObject.getString(BomPo.COLUMNS.VER.name())); 
			bomPo.setProcess(dataObject.getString(BomPo.COLUMNS.PROCESS.name())); 
			bomPo.setBomDate(dataObject.getString(BomPo.COLUMNS.BOM_DATE.name())); 
			bomPo.setBomType(dataObject.getString(BomPo.COLUMNS.BOM_TYPE.name())); 
			bomPo.setWhs(dataObject.getString(BomPo.COLUMNS.WHS.name())); 
			bomPo.setApproveDocNo(dataObject.getString(BomPo.COLUMNS.APPROVE_DOC_NO.name())); 
			bomPo.setApproveDate(dataObject.getString(BomPo.COLUMNS.APPROVE_DATE.name())); 
			bomPo.setCtmCode(dataObject.getString(BomPo.COLUMNS.CTM_CODE.name())); 
			bomPo.setRemark(dataObject.getString(BomPo.COLUMNS.REMARK.name())); 
			bomPo.setUserId(dataObject.getString(BomPo.COLUMNS.USER_ID.name())); 
			bomPo.setExpired(dataObject.getString(BomPo.COLUMNS.EXPIRED.name())); 
			bomPo.setUseMark(dataObject.getString(BomPo.COLUMNS.USE_MARK.name())); 
			bomPo.setCocompNo(dataObject.getString(BomPo.COLUMNS.COCOMP_NO.name())); 
			return bomPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final BomPo bomPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(BomPo.COLUMNS.BF_NO.name(), bomPo.getBfNo()); 
			dataObject.setValue(BomPo.COLUMNS.BF_BOM_NO.name(), bomPo.getBfBomNo()); 
			dataObject.setValue(BomPo.COLUMNS.BOM_NO.name(), bomPo.getBomNo()); 
			dataObject.setValue(BomPo.COLUMNS.VER.name(), bomPo.getVer()); 
			dataObject.setValue(BomPo.COLUMNS.PROCESS.name(), bomPo.getProcess()); 
			dataObject.setValue(BomPo.COLUMNS.BOM_DATE.name(), bomPo.getBomDate()); 
			dataObject.setValue(BomPo.COLUMNS.BOM_TYPE.name(), bomPo.getBomType()); 
			dataObject.setValue(BomPo.COLUMNS.WHS.name(), bomPo.getWhs()); 
			dataObject.setValue(BomPo.COLUMNS.APPROVE_DOC_NO.name(), bomPo.getApproveDocNo()); 
			dataObject.setValue(BomPo.COLUMNS.APPROVE_DATE.name(), bomPo.getApproveDate()); 
			dataObject.setValue(BomPo.COLUMNS.CTM_CODE.name(), bomPo.getCtmCode()); 
			dataObject.setValue(BomPo.COLUMNS.REMARK.name(), bomPo.getRemark()); 
			dataObject.setValue(BomPo.COLUMNS.USER_ID.name(), bomPo.getUserId()); 
			dataObject.setValue(BomPo.COLUMNS.EXPIRED.name(), bomPo.getExpired()); 
			dataObject.setValue(BomPo.COLUMNS.USE_MARK.name(), bomPo.getUseMark()); 
			dataObject.setValue(BomPo.COLUMNS.COCOMP_NO.name(), bomPo.getCocompNo()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<BomPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(BomPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(BomPo.COLUMNS.BF_NO.name(), po.getBfNo()); 
		sqlWhere.add(BomPo.COLUMNS.BOM_NO.name(), po.getBomNo()); 
		sqlWhere.add(BomPo.COLUMNS.VER.name(), po.getVer()); 
		return sqlWhere; 
	} 
 
} 
