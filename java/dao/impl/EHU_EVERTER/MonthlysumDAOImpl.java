package com.doc.common.dao.impl; 
 
public class MonthlysumDAOImpl extends GeneralDAOImpl<MonthlysumPo> implements MonthlysumDAO { 
	public static final MonthlysumDAOImpl INSTANCE = new MonthlysumDAOImpl(); 
	public static final String TABLENAME = "MONTHLYSUM"; 

	public MonthlysumDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<MonthlysumPo> CONVERTER = new MapConverter<MonthlysumPo>() { 
 
		@Override 
		public MonthlysumPo convert(final DataObject dataObject) { 
			final MonthlysumPo monthlysumPo = new MonthlysumPo(); 
			monthlysumPo.setYymm(dataObject.getString(MonthlysumPo.COLUMNS.YYMM.name())); 
			monthlysumPo.setBagtype(dataObject.getString(MonthlysumPo.COLUMNS.BAGTYPE.name())); 
			monthlysumPo.setCustype(dataObject.getString(MonthlysumPo.COLUMNS.CUSTYPE.name())); 
			monthlysumPo.setCusid(dataObject.getString(MonthlysumPo.COLUMNS.CUSID.name())); 
			monthlysumPo.setExpcount(BigDecimalUtils.formObj(dataObject.getValue(MonthlysumPo.COLUMNS.EXPCOUNT.name()))); 
			monthlysumPo.setExppiece(BigDecimalUtils.formObj(dataObject.getValue(MonthlysumPo.COLUMNS.EXPPIECE.name()))); 
			monthlysumPo.setExpweight(BigDecimalUtils.formObj(dataObject.getValue(MonthlysumPo.COLUMNS.EXPWEIGHT.name()))); 
			monthlysumPo.setImpcount(BigDecimalUtils.formObj(dataObject.getValue(MonthlysumPo.COLUMNS.IMPCOUNT.name()))); 
			monthlysumPo.setImppiece(BigDecimalUtils.formObj(dataObject.getValue(MonthlysumPo.COLUMNS.IMPPIECE.name()))); 
			monthlysumPo.setImpweight(BigDecimalUtils.formObj(dataObject.getValue(MonthlysumPo.COLUMNS.IMPWEIGHT.name()))); 
			monthlysumPo.setTotcount(BigDecimalUtils.formObj(dataObject.getValue(MonthlysumPo.COLUMNS.TOTCOUNT.name()))); 
			monthlysumPo.setTotpiece(BigDecimalUtils.formObj(dataObject.getValue(MonthlysumPo.COLUMNS.TOTPIECE.name()))); 
			monthlysumPo.setTotweight(BigDecimalUtils.formObj(dataObject.getValue(MonthlysumPo.COLUMNS.TOTWEIGHT.name()))); 
			monthlysumPo.setTransdate(dataObject.getString(MonthlysumPo.COLUMNS.TRANSDATE.name())); 
			monthlysumPo.setTransuser(dataObject.getString(MonthlysumPo.COLUMNS.TRANSUSER.name())); 
			return monthlysumPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final MonthlysumPo monthlysumPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(MonthlysumPo.COLUMNS.YYMM.name(), monthlysumPo.getYymm()); 
			dataObject.setValue(MonthlysumPo.COLUMNS.BAGTYPE.name(), monthlysumPo.getBagtype()); 
			dataObject.setValue(MonthlysumPo.COLUMNS.CUSTYPE.name(), monthlysumPo.getCustype()); 
			dataObject.setValue(MonthlysumPo.COLUMNS.CUSID.name(), monthlysumPo.getCusid()); 
			dataObject.setValue(MonthlysumPo.COLUMNS.EXPCOUNT.name(), monthlysumPo.getExpcount()); 
			dataObject.setValue(MonthlysumPo.COLUMNS.EXPPIECE.name(), monthlysumPo.getExppiece()); 
			dataObject.setValue(MonthlysumPo.COLUMNS.EXPWEIGHT.name(), monthlysumPo.getExpweight()); 
			dataObject.setValue(MonthlysumPo.COLUMNS.IMPCOUNT.name(), monthlysumPo.getImpcount()); 
			dataObject.setValue(MonthlysumPo.COLUMNS.IMPPIECE.name(), monthlysumPo.getImppiece()); 
			dataObject.setValue(MonthlysumPo.COLUMNS.IMPWEIGHT.name(), monthlysumPo.getImpweight()); 
			dataObject.setValue(MonthlysumPo.COLUMNS.TOTCOUNT.name(), monthlysumPo.getTotcount()); 
			dataObject.setValue(MonthlysumPo.COLUMNS.TOTPIECE.name(), monthlysumPo.getTotpiece()); 
			dataObject.setValue(MonthlysumPo.COLUMNS.TOTWEIGHT.name(), monthlysumPo.getTotweight()); 
			dataObject.setValue(MonthlysumPo.COLUMNS.TRANSDATE.name(), monthlysumPo.getTransdate()); 
			dataObject.setValue(MonthlysumPo.COLUMNS.TRANSUSER.name(), monthlysumPo.getTransuser()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<MonthlysumPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(MonthlysumPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(MonthlysumPo.COLUMNS.YYMM.name(), po.getYymm()); 
		sqlWhere.add(MonthlysumPo.COLUMNS.BAGTYPE.name(), po.getBagtype()); 
		sqlWhere.add(MonthlysumPo.COLUMNS.CUSTYPE.name(), po.getCustype()); 
		sqlWhere.add(MonthlysumPo.COLUMNS.CUSID.name(), po.getCusid()); 
		return sqlWhere; 
	} 
 
} 
