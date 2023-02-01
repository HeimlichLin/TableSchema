package com.doc.common.dao.impl; 
 
public class FtzbBomTMessgDAOImpl extends GeneralDAOImpl<FtzbBomTMessgPo> implements FtzbBomTMessgDAO { 
	public static final FtzbBomTMessgDAOImpl INSTANCE = new FtzbBomTMessgDAOImpl(); 
	public static final String TABLENAME = "FTZB_BOM_T_MESSG"; 

	public FtzbBomTMessgDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<FtzbBomTMessgPo> CONVERTER = new MapConverter<FtzbBomTMessgPo>() { 
 
		@Override 
		public FtzbBomTMessgPo convert(final DataObject dataObject) { 
			final FtzbBomTMessgPo ftzbBomTMessgPo = new FtzbBomTMessgPo(); 
			ftzbBomTMessgPo.setBomfile(dataObject.getString(FtzbBomTMessgPo.COLUMNS.BOMFILE.name())); 
			ftzbBomTMessgPo.setMsgtype(dataObject.getString(FtzbBomTMessgPo.COLUMNS.MSGTYPE.name())); 
			ftzbBomTMessgPo.setCocompno(dataObject.getString(FtzbBomTMessgPo.COLUMNS.COCOMPNO.name())); 
			ftzbBomTMessgPo.setCtmcode(dataObject.getString(FtzbBomTMessgPo.COLUMNS.CTMCODE.name())); 
			ftzbBomTMessgPo.setBondno(dataObject.getString(FtzbBomTMessgPo.COLUMNS.BONDNO.name())); 
			ftzbBomTMessgPo.setProcess(dataObject.getString(FtzbBomTMessgPo.COLUMNS.PROCESS.name())); 
			ftzbBomTMessgPo.setBomdate(dataObject.getString(FtzbBomTMessgPo.COLUMNS.BOMDATE.name())); 
			ftzbBomTMessgPo.setGoodtype(dataObject.getString(FtzbBomTMessgPo.COLUMNS.GOODTYPE.name())); 
			ftzbBomTMessgPo.setPrdtno(dataObject.getString(FtzbBomTMessgPo.COLUMNS.PRDTNO.name())); 
			ftzbBomTMessgPo.setPrdtname(dataObject.getString(FtzbBomTMessgPo.COLUMNS.PRDTNAME.name())); 
			ftzbBomTMessgPo.setPrdtunit(dataObject.getString(FtzbBomTMessgPo.COLUMNS.PRDTUNIT.name())); 
			ftzbBomTMessgPo.setPartno(dataObject.getString(FtzbBomTMessgPo.COLUMNS.PARTNO.name())); 
			ftzbBomTMessgPo.setSerialno(BigDecimalUtils.formObj(dataObject.getValue(FtzbBomTMessgPo.COLUMNS.SERIALNO.name()))); 
			ftzbBomTMessgPo.setPartname(dataObject.getString(FtzbBomTMessgPo.COLUMNS.PARTNAME.name())); 
			ftzbBomTMessgPo.setUnitqty(BigDecimalUtils.formObj(dataObject.getValue(FtzbBomTMessgPo.COLUMNS.UNITQTY.name()))); 
			ftzbBomTMessgPo.setUnit(dataObject.getString(FtzbBomTMessgPo.COLUMNS.UNIT.name())); 
			ftzbBomTMessgPo.setBegindate(dataObject.getString(FtzbBomTMessgPo.COLUMNS.BEGINDATE.name())); 
			ftzbBomTMessgPo.setEnddate(dataObject.getString(FtzbBomTMessgPo.COLUMNS.ENDDATE.name())); 
			ftzbBomTMessgPo.setBomtype(dataObject.getString(FtzbBomTMessgPo.COLUMNS.BOMTYPE.name())); 
			ftzbBomTMessgPo.setPrdttype(dataObject.getString(FtzbBomTMessgPo.COLUMNS.PRDTTYPE.name())); 
			ftzbBomTMessgPo.setRecvdate(dataObject.getString(FtzbBomTMessgPo.COLUMNS.RECVDATE.name())); 
			ftzbBomTMessgPo.setIconfirmed(dataObject.getString(FtzbBomTMessgPo.COLUMNS.ICONFIRMED.name())); 
			ftzbBomTMessgPo.setBomno(dataObject.getString(FtzbBomTMessgPo.COLUMNS.BOMNO.name())); 
			ftzbBomTMessgPo.setApprovedno(dataObject.getString(FtzbBomTMessgPo.COLUMNS.APPROVEDNO.name())); 
			ftzbBomTMessgPo.setApproveddate(dataObject.getString(FtzbBomTMessgPo.COLUMNS.APPROVEDDATE.name())); 
			ftzbBomTMessgPo.setSeqno(BigDecimalUtils.formObj(dataObject.getValue(FtzbBomTMessgPo.COLUMNS.SEQNO.name()))); 
			return ftzbBomTMessgPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final FtzbBomTMessgPo ftzbBomTMessgPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(FtzbBomTMessgPo.COLUMNS.BOMFILE.name(), ftzbBomTMessgPo.getBomfile()); 
			dataObject.setValue(FtzbBomTMessgPo.COLUMNS.MSGTYPE.name(), ftzbBomTMessgPo.getMsgtype()); 
			dataObject.setValue(FtzbBomTMessgPo.COLUMNS.COCOMPNO.name(), ftzbBomTMessgPo.getCocompno()); 
			dataObject.setValue(FtzbBomTMessgPo.COLUMNS.CTMCODE.name(), ftzbBomTMessgPo.getCtmcode()); 
			dataObject.setValue(FtzbBomTMessgPo.COLUMNS.BONDNO.name(), ftzbBomTMessgPo.getBondno()); 
			dataObject.setValue(FtzbBomTMessgPo.COLUMNS.PROCESS.name(), ftzbBomTMessgPo.getProcess()); 
			dataObject.setValue(FtzbBomTMessgPo.COLUMNS.BOMDATE.name(), ftzbBomTMessgPo.getBomdate()); 
			dataObject.setValue(FtzbBomTMessgPo.COLUMNS.GOODTYPE.name(), ftzbBomTMessgPo.getGoodtype()); 
			dataObject.setValue(FtzbBomTMessgPo.COLUMNS.PRDTNO.name(), ftzbBomTMessgPo.getPrdtno()); 
			dataObject.setValue(FtzbBomTMessgPo.COLUMNS.PRDTNAME.name(), ftzbBomTMessgPo.getPrdtname()); 
			dataObject.setValue(FtzbBomTMessgPo.COLUMNS.PRDTUNIT.name(), ftzbBomTMessgPo.getPrdtunit()); 
			dataObject.setValue(FtzbBomTMessgPo.COLUMNS.PARTNO.name(), ftzbBomTMessgPo.getPartno()); 
			dataObject.setValue(FtzbBomTMessgPo.COLUMNS.SERIALNO.name(), ftzbBomTMessgPo.getSerialno()); 
			dataObject.setValue(FtzbBomTMessgPo.COLUMNS.PARTNAME.name(), ftzbBomTMessgPo.getPartname()); 
			dataObject.setValue(FtzbBomTMessgPo.COLUMNS.UNITQTY.name(), ftzbBomTMessgPo.getUnitqty()); 
			dataObject.setValue(FtzbBomTMessgPo.COLUMNS.UNIT.name(), ftzbBomTMessgPo.getUnit()); 
			dataObject.setValue(FtzbBomTMessgPo.COLUMNS.BEGINDATE.name(), ftzbBomTMessgPo.getBegindate()); 
			dataObject.setValue(FtzbBomTMessgPo.COLUMNS.ENDDATE.name(), ftzbBomTMessgPo.getEnddate()); 
			dataObject.setValue(FtzbBomTMessgPo.COLUMNS.BOMTYPE.name(), ftzbBomTMessgPo.getBomtype()); 
			dataObject.setValue(FtzbBomTMessgPo.COLUMNS.PRDTTYPE.name(), ftzbBomTMessgPo.getPrdttype()); 
			dataObject.setValue(FtzbBomTMessgPo.COLUMNS.RECVDATE.name(), ftzbBomTMessgPo.getRecvdate()); 
			dataObject.setValue(FtzbBomTMessgPo.COLUMNS.ICONFIRMED.name(), ftzbBomTMessgPo.getIconfirmed()); 
			dataObject.setValue(FtzbBomTMessgPo.COLUMNS.BOMNO.name(), ftzbBomTMessgPo.getBomno()); 
			dataObject.setValue(FtzbBomTMessgPo.COLUMNS.APPROVEDNO.name(), ftzbBomTMessgPo.getApprovedno()); 
			dataObject.setValue(FtzbBomTMessgPo.COLUMNS.APPROVEDDATE.name(), ftzbBomTMessgPo.getApproveddate()); 
			dataObject.setValue(FtzbBomTMessgPo.COLUMNS.SEQNO.name(), ftzbBomTMessgPo.getSeqno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<FtzbBomTMessgPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(FtzbBomTMessgPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
