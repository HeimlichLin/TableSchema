package com.doc.common.dao.impl; 
 
public class GrntbillLogDAOImpl extends GeneralDAOImpl<GrntbillLogPo> implements GrntbillLogDAO { 
	public static final GrntbillLogDAOImpl INSTANCE = new GrntbillLogDAOImpl(); 
	public static final String TABLENAME = "GRNTBILL_LOG"; 

	public GrntbillLogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<GrntbillLogPo> CONVERTER = new MapConverter<GrntbillLogPo>() { 
 
		@Override 
		public GrntbillLogPo convert(final DataObject dataObject) { 
			final GrntbillLogPo grntbillLogPo = new GrntbillLogPo(); 
			grntbillLogPo.setBondno(dataObject.getString(GrntbillLogPo.COLUMNS.BONDNO.name())); 
			grntbillLogPo.setBillno(dataObject.getString(GrntbillLogPo.COLUMNS.BILLNO.name())); 
			grntbillLogPo.setDepsdate(dataObject.getString(GrntbillLogPo.COLUMNS.DEPSDATE.name())); 
			grntbillLogPo.setDepsamt(BigDecimalUtils.formObj(dataObject.getValue(GrntbillLogPo.COLUMNS.DEPSAMT.name()))); 
			grntbillLogPo.setRmks(dataObject.getString(GrntbillLogPo.COLUMNS.RMKS.name())); 
			grntbillLogPo.setProcesstime(dataObject.getString(GrntbillLogPo.COLUMNS.PROCESSTIME.name())); 
			grntbillLogPo.setProcessstate(dataObject.getString(GrntbillLogPo.COLUMNS.PROCESSSTATE.name())); 
			grntbillLogPo.setMsgfun(dataObject.getString(GrntbillLogPo.COLUMNS.MSGFUN.name())); 
			grntbillLogPo.setValiddate(dataObject.getString(GrntbillLogPo.COLUMNS.VALIDDATE.name())); 
			return grntbillLogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final GrntbillLogPo grntbillLogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(GrntbillLogPo.COLUMNS.BONDNO.name(), grntbillLogPo.getBondno()); 
			dataObject.setValue(GrntbillLogPo.COLUMNS.BILLNO.name(), grntbillLogPo.getBillno()); 
			dataObject.setValue(GrntbillLogPo.COLUMNS.DEPSDATE.name(), grntbillLogPo.getDepsdate()); 
			dataObject.setValue(GrntbillLogPo.COLUMNS.DEPSAMT.name(), grntbillLogPo.getDepsamt()); 
			dataObject.setValue(GrntbillLogPo.COLUMNS.RMKS.name(), grntbillLogPo.getRmks()); 
			dataObject.setValue(GrntbillLogPo.COLUMNS.PROCESSTIME.name(), grntbillLogPo.getProcesstime()); 
			dataObject.setValue(GrntbillLogPo.COLUMNS.PROCESSSTATE.name(), grntbillLogPo.getProcessstate()); 
			dataObject.setValue(GrntbillLogPo.COLUMNS.MSGFUN.name(), grntbillLogPo.getMsgfun()); 
			dataObject.setValue(GrntbillLogPo.COLUMNS.VALIDDATE.name(), grntbillLogPo.getValiddate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<GrntbillLogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(GrntbillLogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
