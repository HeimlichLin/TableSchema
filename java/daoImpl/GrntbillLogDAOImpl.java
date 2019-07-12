package com.doc.common.dao.impl; 
 
public class GrntbillLogDAOImpl extends GeneralDAOImpl<GrntbillLogDo> implements GrntbillLogDAOImpl { 
	public static final GrntbillLogDAOImpl INSTANCE = new GrntbillLogDAOImpl(); 
	public static final String TABLENAME = "GRNTBILL_LOG"; 

	public GrntbillLogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<GrntbillLogDo> CONVERTER = new MapConverter<GrntbillLogDo>() { 
 
		@Override 
		public GrntbillLogDo convert(final DataObject dataObject) { 
			final GrntbillLogDo grntbillLogDo = new GrntbillLogDo(); 
			grntbillLogDo.setBondno(dataObject.getString(GrntbillLogDo.COLUMNS.BONDNO.name())); 
			grntbillLogDo.setBillno(dataObject.getString(GrntbillLogDo.COLUMNS.BILLNO.name())); 
			grntbillLogDo.setDepsdate(dataObject.getString(GrntbillLogDo.COLUMNS.DEPSDATE.name())); 
			grntbillLogDo.setDepsamt(BigDecimalUtils.formObj(dataObject.getString(GrntbillLogDo.COLUMNS.DEPSAMT.name()))); 
			grntbillLogDo.setRmks(dataObject.getString(GrntbillLogDo.COLUMNS.RMKS.name())); 
			grntbillLogDo.setProcesstime(dataObject.getString(GrntbillLogDo.COLUMNS.PROCESSTIME.name())); 
			grntbillLogDo.setProcessstate(dataObject.getString(GrntbillLogDo.COLUMNS.PROCESSSTATE.name())); 
			grntbillLogDo.setMsgfun(dataObject.getString(GrntbillLogDo.COLUMNS.MSGFUN.name())); 
			grntbillLogDo.setValiddate(dataObject.getString(GrntbillLogDo.COLUMNS.VALIDDATE.name())); 
			return grntbillLogDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final GrntbillLogDo grntbillLogDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(GrntbillLogDo.COLUMNS.BONDNO.name(), grntbillLogDo.getBondno()); 
			dataObject.setValue(GrntbillLogDo.COLUMNS.BILLNO.name(), grntbillLogDo.getBillno()); 
			dataObject.setValue(GrntbillLogDo.COLUMNS.DEPSDATE.name(), grntbillLogDo.getDepsdate()); 
			dataObject.setValue(GrntbillLogDo.COLUMNS.DEPSAMT.name(), grntbillLogDo.getDepsamt()); 
			dataObject.setValue(GrntbillLogDo.COLUMNS.RMKS.name(), grntbillLogDo.getRmks()); 
			dataObject.setValue(GrntbillLogDo.COLUMNS.PROCESSTIME.name(), grntbillLogDo.getProcesstime()); 
			dataObject.setValue(GrntbillLogDo.COLUMNS.PROCESSSTATE.name(), grntbillLogDo.getProcessstate()); 
			dataObject.setValue(GrntbillLogDo.COLUMNS.MSGFUN.name(), grntbillLogDo.getMsgfun()); 
			dataObject.setValue(GrntbillLogDo.COLUMNS.VALIDDATE.name(), grntbillLogDo.getValiddate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<GrntbillLogDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(GrntbillLogDo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		return sqlWhere; 
	} 
 
} 
