package com.doc.common.dao.impl; 
 
public class FtzbBomDAOImpl extends GeneralDAOImpl<FtzbBomPo> implements FtzbBomDAO { 
	public static final FtzbBomDAOImpl INSTANCE = new FtzbBomDAOImpl(); 
	public static final String TABLENAME = "FTZB_BOM"; 

	public FtzbBomDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<FtzbBomPo> CONVERTER = new MapConverter<FtzbBomPo>() { 
 
		@Override 
		public FtzbBomPo convert(final DataObject dataObject) { 
			final FtzbBomPo ftzbBomPo = new FtzbBomPo(); 
			ftzbBomPo.setBondno(dataObject.getString(FtzbBomPo.COLUMNS.BONDNO.name())); 
			ftzbBomPo.setCtmcode(dataObject.getString(FtzbBomPo.COLUMNS.CTMCODE.name())); 
			ftzbBomPo.setPrdtno(dataObject.getString(FtzbBomPo.COLUMNS.PRDTNO.name())); 
			ftzbBomPo.setPrdtname(dataObject.getString(FtzbBomPo.COLUMNS.PRDTNAME.name())); 
			ftzbBomPo.setPrdtspec(dataObject.getString(FtzbBomPo.COLUMNS.PRDTSPEC.name())); 
			ftzbBomPo.setPrdtunit(dataObject.getString(FtzbBomPo.COLUMNS.PRDTUNIT.name())); 
			ftzbBomPo.setProcess(dataObject.getString(FtzbBomPo.COLUMNS.PROCESS.name())); 
			ftzbBomPo.setWhs(BigDecimalUtils.formObj(dataObject.getValue(FtzbBomPo.COLUMNS.WHS.name()))); 
			ftzbBomPo.setApprovedno(dataObject.getString(FtzbBomPo.COLUMNS.APPROVEDNO.name())); 
			ftzbBomPo.setBomno(dataObject.getString(FtzbBomPo.COLUMNS.BOMNO.name())); 
			ftzbBomPo.setBomdate(dataObject.getString(FtzbBomPo.COLUMNS.BOMDATE.name())); 
			ftzbBomPo.setBomtype(dataObject.getString(FtzbBomPo.COLUMNS.BOMTYPE.name())); 
			ftzbBomPo.setCocompno(dataObject.getString(FtzbBomPo.COLUMNS.COCOMPNO.name())); 
			ftzbBomPo.setRmk(dataObject.getString(FtzbBomPo.COLUMNS.RMK.name())); 
			ftzbBomPo.setSeqno(BigDecimalUtils.formObj(dataObject.getValue(FtzbBomPo.COLUMNS.SEQNO.name()))); 
			return ftzbBomPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final FtzbBomPo ftzbBomPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(FtzbBomPo.COLUMNS.BONDNO.name(), ftzbBomPo.getBondno()); 
			dataObject.setValue(FtzbBomPo.COLUMNS.CTMCODE.name(), ftzbBomPo.getCtmcode()); 
			dataObject.setValue(FtzbBomPo.COLUMNS.PRDTNO.name(), ftzbBomPo.getPrdtno()); 
			dataObject.setValue(FtzbBomPo.COLUMNS.PRDTNAME.name(), ftzbBomPo.getPrdtname()); 
			dataObject.setValue(FtzbBomPo.COLUMNS.PRDTSPEC.name(), ftzbBomPo.getPrdtspec()); 
			dataObject.setValue(FtzbBomPo.COLUMNS.PRDTUNIT.name(), ftzbBomPo.getPrdtunit()); 
			dataObject.setValue(FtzbBomPo.COLUMNS.PROCESS.name(), ftzbBomPo.getProcess()); 
			dataObject.setValue(FtzbBomPo.COLUMNS.WHS.name(), ftzbBomPo.getWhs()); 
			dataObject.setValue(FtzbBomPo.COLUMNS.APPROVEDNO.name(), ftzbBomPo.getApprovedno()); 
			dataObject.setValue(FtzbBomPo.COLUMNS.BOMNO.name(), ftzbBomPo.getBomno()); 
			dataObject.setValue(FtzbBomPo.COLUMNS.BOMDATE.name(), ftzbBomPo.getBomdate()); 
			dataObject.setValue(FtzbBomPo.COLUMNS.BOMTYPE.name(), ftzbBomPo.getBomtype()); 
			dataObject.setValue(FtzbBomPo.COLUMNS.COCOMPNO.name(), ftzbBomPo.getCocompno()); 
			dataObject.setValue(FtzbBomPo.COLUMNS.RMK.name(), ftzbBomPo.getRmk()); 
			dataObject.setValue(FtzbBomPo.COLUMNS.SEQNO.name(), ftzbBomPo.getSeqno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<FtzbBomPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(FtzbBomPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
