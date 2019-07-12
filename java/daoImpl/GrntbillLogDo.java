package com.doc.common.dao.impl; 
 
public class GrntbillLogDAO extends GeneralDAOImpl<GrntbillLogDo> implements GrntbillLogDAO { 
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
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<GrntbillLogDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(GrntbillLogDo po) { 
		sqlWhere.add(GrntbillLogDo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(GrntbillLogDo.COLUMNS.BILLNO.name(), po.getBillno()); 
		sqlWhere.add(GrntbillLogDo.COLUMNS.DEPSDATE.name(), po.getDepsdate()); 
		sqlWhere.add(GrntbillLogDo.COLUMNS.DEPSAMT.name(), po.getDepsamt()); 
		sqlWhere.add(GrntbillLogDo.COLUMNS.RMKS.name(), po.getRmks()); 
		sqlWhere.add(GrntbillLogDo.COLUMNS.PROCESSTIME.name(), po.getProcesstime()); 
		sqlWhere.add(GrntbillLogDo.COLUMNS.PROCESSSTATE.name(), po.getProcessstate()); 
	} 
 
} 
