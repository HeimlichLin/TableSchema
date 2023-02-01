package com.doc.common.dao.impl; 
 
public class FtzbBomTLogDAOImpl extends GeneralDAOImpl<FtzbBomTLogPo> implements FtzbBomTLogDAO { 
	public static final FtzbBomTLogDAOImpl INSTANCE = new FtzbBomTLogDAOImpl(); 
	public static final String TABLENAME = "FTZB_BOM_T_LOG"; 

	public FtzbBomTLogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<FtzbBomTLogPo> CONVERTER = new MapConverter<FtzbBomTLogPo>() { 
 
		@Override 
		public FtzbBomTLogPo convert(final DataObject dataObject) { 
			final FtzbBomTLogPo ftzbBomTLogPo = new FtzbBomTLogPo(); 
			ftzbBomTLogPo.setBondno(dataObject.getString(FtzbBomTLogPo.COLUMNS.BONDNO.name())); 
			ftzbBomTLogPo.setBomfile(dataObject.getString(FtzbBomTLogPo.COLUMNS.BOMFILE.name())); 
			ftzbBomTLogPo.setBomdate(dataObject.getString(FtzbBomTLogPo.COLUMNS.BOMDATE.name())); 
			ftzbBomTLogPo.setPrdtno(dataObject.getString(FtzbBomTLogPo.COLUMNS.PRDTNO.name())); 
			ftzbBomTLogPo.setPartno(dataObject.getString(FtzbBomTLogPo.COLUMNS.PARTNO.name())); 
			ftzbBomTLogPo.setBomstatus(dataObject.getString(FtzbBomTLogPo.COLUMNS.BOMSTATUS.name())); 
			ftzbBomTLogPo.setBommsg(dataObject.getString(FtzbBomTLogPo.COLUMNS.BOMMSG.name())); 
			ftzbBomTLogPo.setRecvdate(dataObject.getString(FtzbBomTLogPo.COLUMNS.RECVDATE.name())); 
			ftzbBomTLogPo.setCocompno(dataObject.getString(FtzbBomTLogPo.COLUMNS.COCOMPNO.name())); 
			ftzbBomTLogPo.setSeqno(BigDecimalUtils.formObj(dataObject.getValue(FtzbBomTLogPo.COLUMNS.SEQNO.name()))); 
			ftzbBomTLogPo.setSerialno(BigDecimalUtils.formObj(dataObject.getValue(FtzbBomTLogPo.COLUMNS.SERIALNO.name()))); 
			return ftzbBomTLogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final FtzbBomTLogPo ftzbBomTLogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(FtzbBomTLogPo.COLUMNS.BONDNO.name(), ftzbBomTLogPo.getBondno()); 
			dataObject.setValue(FtzbBomTLogPo.COLUMNS.BOMFILE.name(), ftzbBomTLogPo.getBomfile()); 
			dataObject.setValue(FtzbBomTLogPo.COLUMNS.BOMDATE.name(), ftzbBomTLogPo.getBomdate()); 
			dataObject.setValue(FtzbBomTLogPo.COLUMNS.PRDTNO.name(), ftzbBomTLogPo.getPrdtno()); 
			dataObject.setValue(FtzbBomTLogPo.COLUMNS.PARTNO.name(), ftzbBomTLogPo.getPartno()); 
			dataObject.setValue(FtzbBomTLogPo.COLUMNS.BOMSTATUS.name(), ftzbBomTLogPo.getBomstatus()); 
			dataObject.setValue(FtzbBomTLogPo.COLUMNS.BOMMSG.name(), ftzbBomTLogPo.getBommsg()); 
			dataObject.setValue(FtzbBomTLogPo.COLUMNS.RECVDATE.name(), ftzbBomTLogPo.getRecvdate()); 
			dataObject.setValue(FtzbBomTLogPo.COLUMNS.COCOMPNO.name(), ftzbBomTLogPo.getCocompno()); 
			dataObject.setValue(FtzbBomTLogPo.COLUMNS.SEQNO.name(), ftzbBomTLogPo.getSeqno()); 
			dataObject.setValue(FtzbBomTLogPo.COLUMNS.SERIALNO.name(), ftzbBomTLogPo.getSerialno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<FtzbBomTLogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(FtzbBomTLogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
