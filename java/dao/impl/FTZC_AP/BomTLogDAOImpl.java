package com.doc.common.dao.impl; 
 
public class BomTLogDAOImpl extends GeneralDAOImpl<BomTLogPo> implements BomTLogDAO { 
	public static final BomTLogDAOImpl INSTANCE = new BomTLogDAOImpl(); 
	public static final String TABLENAME = "BOM_T_LOG"; 

	public BomTLogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<BomTLogPo> CONVERTER = new MapConverter<BomTLogPo>() { 
 
		@Override 
		public BomTLogPo convert(final DataObject dataObject) { 
			final BomTLogPo bomTLogPo = new BomTLogPo(); 
			bomTLogPo.setBfNo(dataObject.getString(BomTLogPo.COLUMNS.BF_NO.name())); 
			bomTLogPo.setBomFile(dataObject.getString(BomTLogPo.COLUMNS.BOM_FILE.name())); 
			bomTLogPo.setBomDate(dataObject.getString(BomTLogPo.COLUMNS.BOM_DATE.name())); 
			bomTLogPo.setPrdtNo(dataObject.getString(BomTLogPo.COLUMNS.PRDT_NO.name())); 
			bomTLogPo.setPartNo(dataObject.getString(BomTLogPo.COLUMNS.PART_NO.name())); 
			bomTLogPo.setBomStatus(dataObject.getString(BomTLogPo.COLUMNS.BOM_STATUS.name())); 
			bomTLogPo.setBomMsg(dataObject.getString(BomTLogPo.COLUMNS.BOM_MSG.name())); 
			bomTLogPo.setRecvDate(dataObject.getString(BomTLogPo.COLUMNS.RECV_DATE.name())); 
			bomTLogPo.setCocompNo(dataObject.getString(BomTLogPo.COLUMNS.COCOMP_NO.name())); 
			bomTLogPo.setSeqNo(BigDecimalUtils.formObj(dataObject.getValue(BomTLogPo.COLUMNS.SEQ_NO.name()))); 
			bomTLogPo.setSerialNo(BigDecimalUtils.formObj(dataObject.getValue(BomTLogPo.COLUMNS.SERIAL_NO.name()))); 
			return bomTLogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final BomTLogPo bomTLogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(BomTLogPo.COLUMNS.BF_NO.name(), bomTLogPo.getBfNo()); 
			dataObject.setValue(BomTLogPo.COLUMNS.BOM_FILE.name(), bomTLogPo.getBomFile()); 
			dataObject.setValue(BomTLogPo.COLUMNS.BOM_DATE.name(), bomTLogPo.getBomDate()); 
			dataObject.setValue(BomTLogPo.COLUMNS.PRDT_NO.name(), bomTLogPo.getPrdtNo()); 
			dataObject.setValue(BomTLogPo.COLUMNS.PART_NO.name(), bomTLogPo.getPartNo()); 
			dataObject.setValue(BomTLogPo.COLUMNS.BOM_STATUS.name(), bomTLogPo.getBomStatus()); 
			dataObject.setValue(BomTLogPo.COLUMNS.BOM_MSG.name(), bomTLogPo.getBomMsg()); 
			dataObject.setValue(BomTLogPo.COLUMNS.RECV_DATE.name(), bomTLogPo.getRecvDate()); 
			dataObject.setValue(BomTLogPo.COLUMNS.COCOMP_NO.name(), bomTLogPo.getCocompNo()); 
			dataObject.setValue(BomTLogPo.COLUMNS.SEQ_NO.name(), bomTLogPo.getSeqNo()); 
			dataObject.setValue(BomTLogPo.COLUMNS.SERIAL_NO.name(), bomTLogPo.getSerialNo()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<BomTLogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(BomTLogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
