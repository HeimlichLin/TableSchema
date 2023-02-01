package com.doc.common.dao.impl; 
 
public class GrntbillDAOImpl extends GeneralDAOImpl<GrntbillPo> implements GrntbillDAO { 
	public static final GrntbillDAOImpl INSTANCE = new GrntbillDAOImpl(); 
	public static final String TABLENAME = "GRNTBILL"; 

	public GrntbillDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<GrntbillPo> CONVERTER = new MapConverter<GrntbillPo>() { 
 
		@Override 
		public GrntbillPo convert(final DataObject dataObject) { 
			final GrntbillPo grntbillPo = new GrntbillPo(); 
			grntbillPo.setBondno(dataObject.getString(GrntbillPo.COLUMNS.BONDNO.name())); 
			grntbillPo.setBillno(dataObject.getString(GrntbillPo.COLUMNS.BILLNO.name())); 
			grntbillPo.setDepsdate(dataObject.getString(GrntbillPo.COLUMNS.DEPSDATE.name())); 
			grntbillPo.setDepsamt(BigDecimalUtils.formObj(dataObject.getValue(GrntbillPo.COLUMNS.DEPSAMT.name()))); 
			grntbillPo.setRmks(dataObject.getString(GrntbillPo.COLUMNS.RMKS.name())); 
			grntbillPo.setMsgfun(dataObject.getString(GrntbillPo.COLUMNS.MSGFUN.name())); 
			grntbillPo.setValiddate(dataObject.getString(GrntbillPo.COLUMNS.VALIDDATE.name())); 
			return grntbillPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final GrntbillPo grntbillPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(GrntbillPo.COLUMNS.BONDNO.name(), grntbillPo.getBondno()); 
			dataObject.setValue(GrntbillPo.COLUMNS.BILLNO.name(), grntbillPo.getBillno()); 
			dataObject.setValue(GrntbillPo.COLUMNS.DEPSDATE.name(), grntbillPo.getDepsdate()); 
			dataObject.setValue(GrntbillPo.COLUMNS.DEPSAMT.name(), grntbillPo.getDepsamt()); 
			dataObject.setValue(GrntbillPo.COLUMNS.RMKS.name(), grntbillPo.getRmks()); 
			dataObject.setValue(GrntbillPo.COLUMNS.MSGFUN.name(), grntbillPo.getMsgfun()); 
			dataObject.setValue(GrntbillPo.COLUMNS.VALIDDATE.name(), grntbillPo.getValiddate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<GrntbillPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(GrntbillPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(GrntbillPo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(GrntbillPo.COLUMNS.BILLNO.name(), po.getBillno()); 
		return sqlWhere; 
	} 
 
} 
