package com.doc.common.dao.impl; 
 
public class BomTMessgDAOImpl extends GeneralDAOImpl<BomTMessgPo> implements BomTMessgDAO { 
	public static final BomTMessgDAOImpl INSTANCE = new BomTMessgDAOImpl(); 
	public static final String TABLENAME = "BOM_T_MESSG"; 

	public BomTMessgDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<BomTMessgPo> CONVERTER = new MapConverter<BomTMessgPo>() { 
 
		@Override 
		public BomTMessgPo convert(final DataObject dataObject) { 
			final BomTMessgPo bomTMessgPo = new BomTMessgPo(); 
			bomTMessgPo.setBomFile(dataObject.getString(BomTMessgPo.COLUMNS.BOM_FILE.name())); 
			bomTMessgPo.setMsgType(dataObject.getString(BomTMessgPo.COLUMNS.MSG_TYPE.name())); 
			bomTMessgPo.setCocompNo(dataObject.getString(BomTMessgPo.COLUMNS.COCOMP_NO.name())); 
			bomTMessgPo.setCtmCode(dataObject.getString(BomTMessgPo.COLUMNS.CTM_CODE.name())); 
			bomTMessgPo.setBfNo(dataObject.getString(BomTMessgPo.COLUMNS.BF_NO.name())); 
			bomTMessgPo.setProcess(dataObject.getString(BomTMessgPo.COLUMNS.PROCESS.name())); 
			bomTMessgPo.setBomDate(dataObject.getString(BomTMessgPo.COLUMNS.BOM_DATE.name())); 
			bomTMessgPo.setGoodsType(dataObject.getString(BomTMessgPo.COLUMNS.GOODS_TYPE.name())); 
			bomTMessgPo.setPrdtNo(dataObject.getString(BomTMessgPo.COLUMNS.PRDT_NO.name())); 
			bomTMessgPo.setPrdtName(dataObject.getString(BomTMessgPo.COLUMNS.PRDT_NAME.name())); 
			bomTMessgPo.setPrdtUnit(dataObject.getString(BomTMessgPo.COLUMNS.PRDT_UNIT.name())); 
			bomTMessgPo.setPartNo(dataObject.getString(BomTMessgPo.COLUMNS.PART_NO.name())); 
			bomTMessgPo.setSerialNo(BigDecimalUtils.formObj(dataObject.getValue(BomTMessgPo.COLUMNS.SERIAL_NO.name()))); 
			bomTMessgPo.setPartName(dataObject.getString(BomTMessgPo.COLUMNS.PART_NAME.name())); 
			bomTMessgPo.setUnitQty(BigDecimalUtils.formObj(dataObject.getValue(BomTMessgPo.COLUMNS.UNIT_QTY.name()))); 
			bomTMessgPo.setUnit(dataObject.getString(BomTMessgPo.COLUMNS.UNIT.name())); 
			bomTMessgPo.setBeginDate(dataObject.getString(BomTMessgPo.COLUMNS.BEGIN_DATE.name())); 
			bomTMessgPo.setEndDate(dataObject.getString(BomTMessgPo.COLUMNS.END_DATE.name())); 
			bomTMessgPo.setBomType(dataObject.getString(BomTMessgPo.COLUMNS.BOM_TYPE.name())); 
			bomTMessgPo.setPrdtType(dataObject.getString(BomTMessgPo.COLUMNS.PRDT_TYPE.name())); 
			bomTMessgPo.setRecvDate(dataObject.getString(BomTMessgPo.COLUMNS.RECV_DATE.name())); 
			bomTMessgPo.setIconfirmed(dataObject.getString(BomTMessgPo.COLUMNS.ICONFIRMED.name())); 
			bomTMessgPo.setBomNo(dataObject.getString(BomTMessgPo.COLUMNS.BOM_NO.name())); 
			bomTMessgPo.setApproveNo(dataObject.getString(BomTMessgPo.COLUMNS.APPROVE_NO.name())); 
			bomTMessgPo.setApproveDate(dataObject.getString(BomTMessgPo.COLUMNS.APPROVE_DATE.name())); 
			bomTMessgPo.setSeqNo(BigDecimalUtils.formObj(dataObject.getValue(BomTMessgPo.COLUMNS.SEQ_NO.name()))); 
			return bomTMessgPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final BomTMessgPo bomTMessgPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(BomTMessgPo.COLUMNS.BOM_FILE.name(), bomTMessgPo.getBomFile()); 
			dataObject.setValue(BomTMessgPo.COLUMNS.MSG_TYPE.name(), bomTMessgPo.getMsgType()); 
			dataObject.setValue(BomTMessgPo.COLUMNS.COCOMP_NO.name(), bomTMessgPo.getCocompNo()); 
			dataObject.setValue(BomTMessgPo.COLUMNS.CTM_CODE.name(), bomTMessgPo.getCtmCode()); 
			dataObject.setValue(BomTMessgPo.COLUMNS.BF_NO.name(), bomTMessgPo.getBfNo()); 
			dataObject.setValue(BomTMessgPo.COLUMNS.PROCESS.name(), bomTMessgPo.getProcess()); 
			dataObject.setValue(BomTMessgPo.COLUMNS.BOM_DATE.name(), bomTMessgPo.getBomDate()); 
			dataObject.setValue(BomTMessgPo.COLUMNS.GOODS_TYPE.name(), bomTMessgPo.getGoodsType()); 
			dataObject.setValue(BomTMessgPo.COLUMNS.PRDT_NO.name(), bomTMessgPo.getPrdtNo()); 
			dataObject.setValue(BomTMessgPo.COLUMNS.PRDT_NAME.name(), bomTMessgPo.getPrdtName()); 
			dataObject.setValue(BomTMessgPo.COLUMNS.PRDT_UNIT.name(), bomTMessgPo.getPrdtUnit()); 
			dataObject.setValue(BomTMessgPo.COLUMNS.PART_NO.name(), bomTMessgPo.getPartNo()); 
			dataObject.setValue(BomTMessgPo.COLUMNS.SERIAL_NO.name(), bomTMessgPo.getSerialNo()); 
			dataObject.setValue(BomTMessgPo.COLUMNS.PART_NAME.name(), bomTMessgPo.getPartName()); 
			dataObject.setValue(BomTMessgPo.COLUMNS.UNIT_QTY.name(), bomTMessgPo.getUnitQty()); 
			dataObject.setValue(BomTMessgPo.COLUMNS.UNIT.name(), bomTMessgPo.getUnit()); 
			dataObject.setValue(BomTMessgPo.COLUMNS.BEGIN_DATE.name(), bomTMessgPo.getBeginDate()); 
			dataObject.setValue(BomTMessgPo.COLUMNS.END_DATE.name(), bomTMessgPo.getEndDate()); 
			dataObject.setValue(BomTMessgPo.COLUMNS.BOM_TYPE.name(), bomTMessgPo.getBomType()); 
			dataObject.setValue(BomTMessgPo.COLUMNS.PRDT_TYPE.name(), bomTMessgPo.getPrdtType()); 
			dataObject.setValue(BomTMessgPo.COLUMNS.RECV_DATE.name(), bomTMessgPo.getRecvDate()); 
			dataObject.setValue(BomTMessgPo.COLUMNS.ICONFIRMED.name(), bomTMessgPo.getIconfirmed()); 
			dataObject.setValue(BomTMessgPo.COLUMNS.BOM_NO.name(), bomTMessgPo.getBomNo()); 
			dataObject.setValue(BomTMessgPo.COLUMNS.APPROVE_NO.name(), bomTMessgPo.getApproveNo()); 
			dataObject.setValue(BomTMessgPo.COLUMNS.APPROVE_DATE.name(), bomTMessgPo.getApproveDate()); 
			dataObject.setValue(BomTMessgPo.COLUMNS.SEQ_NO.name(), bomTMessgPo.getSeqNo()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<BomTMessgPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(BomTMessgPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
