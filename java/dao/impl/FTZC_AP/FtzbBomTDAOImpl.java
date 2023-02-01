package com.doc.common.dao.impl; 
 
public class FtzbBomTDAOImpl extends GeneralDAOImpl<FtzbBomTPo> implements FtzbBomTDAO { 
	public static final FtzbBomTDAOImpl INSTANCE = new FtzbBomTDAOImpl(); 
	public static final String TABLENAME = "FTZB_BOM_T"; 

	public FtzbBomTDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<FtzbBomTPo> CONVERTER = new MapConverter<FtzbBomTPo>() { 
 
		@Override 
		public FtzbBomTPo convert(final DataObject dataObject) { 
			final FtzbBomTPo ftzbBomTPo = new FtzbBomTPo(); 
			ftzbBomTPo.setBondno(dataObject.getString(FtzbBomTPo.COLUMNS.BONDNO.name())); 
			ftzbBomTPo.setCtmcode(dataObject.getString(FtzbBomTPo.COLUMNS.CTMCODE.name())); 
			ftzbBomTPo.setProcess(dataObject.getString(FtzbBomTPo.COLUMNS.PROCESS.name())); 
			ftzbBomTPo.setBomdate(dataObject.getString(FtzbBomTPo.COLUMNS.BOMDATE.name())); 
			ftzbBomTPo.setGoodtype(dataObject.getString(FtzbBomTPo.COLUMNS.GOODTYPE.name())); 
			ftzbBomTPo.setPrdtno(dataObject.getString(FtzbBomTPo.COLUMNS.PRDTNO.name())); 
			ftzbBomTPo.setPrdtname(dataObject.getString(FtzbBomTPo.COLUMNS.PRDTNAME.name())); 
			ftzbBomTPo.setPrdtunit(dataObject.getString(FtzbBomTPo.COLUMNS.PRDTUNIT.name())); 
			ftzbBomTPo.setRecvdate(dataObject.getString(FtzbBomTPo.COLUMNS.RECVDATE.name())); 
			ftzbBomTPo.setCocompno(dataObject.getString(FtzbBomTPo.COLUMNS.COCOMPNO.name())); 
			ftzbBomTPo.setApproveddate(dataObject.getString(FtzbBomTPo.COLUMNS.APPROVEDDATE.name())); 
			ftzbBomTPo.setBomno(dataObject.getString(FtzbBomTPo.COLUMNS.BOMNO.name())); 
			ftzbBomTPo.setApprovedno(dataObject.getString(FtzbBomTPo.COLUMNS.APPROVEDNO.name())); 
			ftzbBomTPo.setSeqno(BigDecimalUtils.formObj(dataObject.getValue(FtzbBomTPo.COLUMNS.SEQNO.name()))); 
			return ftzbBomTPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final FtzbBomTPo ftzbBomTPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(FtzbBomTPo.COLUMNS.BONDNO.name(), ftzbBomTPo.getBondno()); 
			dataObject.setValue(FtzbBomTPo.COLUMNS.CTMCODE.name(), ftzbBomTPo.getCtmcode()); 
			dataObject.setValue(FtzbBomTPo.COLUMNS.PROCESS.name(), ftzbBomTPo.getProcess()); 
			dataObject.setValue(FtzbBomTPo.COLUMNS.BOMDATE.name(), ftzbBomTPo.getBomdate()); 
			dataObject.setValue(FtzbBomTPo.COLUMNS.GOODTYPE.name(), ftzbBomTPo.getGoodtype()); 
			dataObject.setValue(FtzbBomTPo.COLUMNS.PRDTNO.name(), ftzbBomTPo.getPrdtno()); 
			dataObject.setValue(FtzbBomTPo.COLUMNS.PRDTNAME.name(), ftzbBomTPo.getPrdtname()); 
			dataObject.setValue(FtzbBomTPo.COLUMNS.PRDTUNIT.name(), ftzbBomTPo.getPrdtunit()); 
			dataObject.setValue(FtzbBomTPo.COLUMNS.RECVDATE.name(), ftzbBomTPo.getRecvdate()); 
			dataObject.setValue(FtzbBomTPo.COLUMNS.COCOMPNO.name(), ftzbBomTPo.getCocompno()); 
			dataObject.setValue(FtzbBomTPo.COLUMNS.APPROVEDDATE.name(), ftzbBomTPo.getApproveddate()); 
			dataObject.setValue(FtzbBomTPo.COLUMNS.BOMNO.name(), ftzbBomTPo.getBomno()); 
			dataObject.setValue(FtzbBomTPo.COLUMNS.APPROVEDNO.name(), ftzbBomTPo.getApprovedno()); 
			dataObject.setValue(FtzbBomTPo.COLUMNS.SEQNO.name(), ftzbBomTPo.getSeqno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<FtzbBomTPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(FtzbBomTPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(FtzbBomTPo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(FtzbBomTPo.COLUMNS.BOMDATE.name(), po.getBomdate()); 
		sqlWhere.add(FtzbBomTPo.COLUMNS.PRDTNO.name(), po.getPrdtno()); 
		return sqlWhere; 
	} 
 
} 
