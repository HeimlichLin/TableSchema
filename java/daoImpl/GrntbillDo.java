package com.doc.common.dao.impl; 
 
public class GrntbillDAO extends GeneralDAOImpl<GrntbillDo> implements GrntbillDAO { 
	public static final GrntbillDAOImpl INSTANCE = new GrntbillDAOImpl(); 
	public static final String TABLENAME = "GRNTBILL"; 

	public GrntbillDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<GrntbillDo> CONVERTER = new MapConverter<GrntbillDo>() { 
 
		@Override 
		public GrntbillDo convert(final DataObject dataObject) { 
			final GrntbillDo grntbillDo = new GrntbillDo(); 
			grntbillDo.setBondno(dataObject.getString(GrntbillDo.COLUMNS.BONDNO.name())); 
			grntbillDo.setBillno(dataObject.getString(GrntbillDo.COLUMNS.BILLNO.name())); 
			grntbillDo.setDepsdate(dataObject.getString(GrntbillDo.COLUMNS.DEPSDATE.name())); 
			grntbillDo.setDepsamt(BigDecimalUtils.formObj(dataObject.getString(GrntbillDo.COLUMNS.DEPSAMT.name()))); 
			grntbillDo.setRmks(dataObject.getString(GrntbillDo.COLUMNS.RMKS.name())); 
			return grntbillDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final GrntbillDo grntbillDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(GrntbillDo.COLUMNS.BONDNO.name(), grntbillDo.getBondno()); 
			dataObject.setValue(GrntbillDo.COLUMNS.BILLNO.name(), grntbillDo.getBillno()); 
			dataObject.setValue(GrntbillDo.COLUMNS.DEPSDATE.name(), grntbillDo.getDepsdate()); 
			dataObject.setValue(GrntbillDo.COLUMNS.DEPSAMT.name(), grntbillDo.getDepsamt()); 
			dataObject.setValue(GrntbillDo.COLUMNS.RMKS.name(), grntbillDo.getRmks()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<GrntbillDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(GrntbillDo po) { 
		sqlWhere.add(GrntbillDo.COLUMNS.DEPSDATE.name(), po.getDepsdate()); 
		sqlWhere.add(GrntbillDo.COLUMNS.DEPSAMT.name(), po.getDepsamt()); 
		sqlWhere.add(GrntbillDo.COLUMNS.RMKS.name(), po.getRmks()); 
	} 
 
} 
