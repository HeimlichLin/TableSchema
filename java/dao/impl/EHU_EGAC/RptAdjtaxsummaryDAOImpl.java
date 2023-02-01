package com.doc.common.dao.impl; 
 
public class RptAdjtaxsummaryDAOImpl extends GeneralDAOImpl<RptAdjtaxsummaryPo> implements RptAdjtaxsummaryDAO { 
	public static final RptAdjtaxsummaryDAOImpl INSTANCE = new RptAdjtaxsummaryDAOImpl(); 
	public static final String TABLENAME = "RPT_ADJTAXSUMMARY"; 

	public RptAdjtaxsummaryDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<RptAdjtaxsummaryPo> CONVERTER = new MapConverter<RptAdjtaxsummaryPo>() { 
 
		@Override 
		public RptAdjtaxsummaryPo convert(final DataObject dataObject) { 
			final RptAdjtaxsummaryPo rptAdjtaxsummaryPo = new RptAdjtaxsummaryPo(); 
			rptAdjtaxsummaryPo.setUniqueid(BigDecimalUtils.formObj(dataObject.getValue(RptAdjtaxsummaryPo.COLUMNS.UNIQUEID.name()))); 
			rptAdjtaxsummaryPo.setTranid(BigDecimalUtils.formObj(dataObject.getValue(RptAdjtaxsummaryPo.COLUMNS.TRANID.name()))); 
			rptAdjtaxsummaryPo.setReportdate(dataObject.getString(RptAdjtaxsummaryPo.COLUMNS.REPORTDATE.name())); 
			rptAdjtaxsummaryPo.setExpressid(dataObject.getString(RptAdjtaxsummaryPo.COLUMNS.EXPRESSID.name())); 
			rptAdjtaxsummaryPo.setExpresscname(dataObject.getString(RptAdjtaxsummaryPo.COLUMNS.EXPRESSCNAME.name())); 
			rptAdjtaxsummaryPo.setBoxno(dataObject.getString(RptAdjtaxsummaryPo.COLUMNS.BOXNO.name())); 
			rptAdjtaxsummaryPo.setAdjhwbamtx3(BigDecimalUtils.formObj(dataObject.getValue(RptAdjtaxsummaryPo.COLUMNS.ADJHWBAMTX3.name()))); 
			rptAdjtaxsummaryPo.setTtlhwbamtx3(BigDecimalUtils.formObj(dataObject.getValue(RptAdjtaxsummaryPo.COLUMNS.TTLHWBAMTX3.name()))); 
			rptAdjtaxsummaryPo.setAdjtaxamtx3(BigDecimalUtils.formObj(dataObject.getValue(RptAdjtaxsummaryPo.COLUMNS.ADJTAXAMTX3.name()))); 
			rptAdjtaxsummaryPo.setTtltax(BigDecimalUtils.formObj(dataObject.getValue(RptAdjtaxsummaryPo.COLUMNS.TTLTAX.name()))); 
			rptAdjtaxsummaryPo.setTtlwgt(BigDecimalUtils.formObj(dataObject.getValue(RptAdjtaxsummaryPo.COLUMNS.TTLWGT.name()))); 
			rptAdjtaxsummaryPo.setTaxqtyPct(BigDecimalUtils.formObj(dataObject.getValue(RptAdjtaxsummaryPo.COLUMNS.TAXQTY_PCT.name()))); 
			rptAdjtaxsummaryPo.setAdjtaxbefamt(BigDecimalUtils.formObj(dataObject.getValue(RptAdjtaxsummaryPo.COLUMNS.ADJTAXBEFAMT.name()))); 
			rptAdjtaxsummaryPo.setAvgwgttax(BigDecimalUtils.formObj(dataObject.getValue(RptAdjtaxsummaryPo.COLUMNS.AVGWGTTAX.name()))); 
			rptAdjtaxsummaryPo.setCreatedate(TimestampUtils.of(dataObject.getValue(RptAdjtaxsummaryPo.COLUMNS.CREATEDATE.name()))); 
			return rptAdjtaxsummaryPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final RptAdjtaxsummaryPo rptAdjtaxsummaryPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(RptAdjtaxsummaryPo.COLUMNS.UNIQUEID.name(), rptAdjtaxsummaryPo.getUniqueid()); 
			dataObject.setValue(RptAdjtaxsummaryPo.COLUMNS.TRANID.name(), rptAdjtaxsummaryPo.getTranid()); 
			dataObject.setValue(RptAdjtaxsummaryPo.COLUMNS.REPORTDATE.name(), rptAdjtaxsummaryPo.getReportdate()); 
			dataObject.setValue(RptAdjtaxsummaryPo.COLUMNS.EXPRESSID.name(), rptAdjtaxsummaryPo.getExpressid()); 
			dataObject.setValue(RptAdjtaxsummaryPo.COLUMNS.EXPRESSCNAME.name(), rptAdjtaxsummaryPo.getExpresscname()); 
			dataObject.setValue(RptAdjtaxsummaryPo.COLUMNS.BOXNO.name(), rptAdjtaxsummaryPo.getBoxno()); 
			dataObject.setValue(RptAdjtaxsummaryPo.COLUMNS.ADJHWBAMTX3.name(), rptAdjtaxsummaryPo.getAdjhwbamtx3()); 
			dataObject.setValue(RptAdjtaxsummaryPo.COLUMNS.TTLHWBAMTX3.name(), rptAdjtaxsummaryPo.getTtlhwbamtx3()); 
			dataObject.setValue(RptAdjtaxsummaryPo.COLUMNS.ADJTAXAMTX3.name(), rptAdjtaxsummaryPo.getAdjtaxamtx3()); 
			dataObject.setValue(RptAdjtaxsummaryPo.COLUMNS.TTLTAX.name(), rptAdjtaxsummaryPo.getTtltax()); 
			dataObject.setValue(RptAdjtaxsummaryPo.COLUMNS.TTLWGT.name(), rptAdjtaxsummaryPo.getTtlwgt()); 
			dataObject.setValue(RptAdjtaxsummaryPo.COLUMNS.TAXQTY_PCT.name(), rptAdjtaxsummaryPo.getTaxqtyPct()); 
			dataObject.setValue(RptAdjtaxsummaryPo.COLUMNS.ADJTAXBEFAMT.name(), rptAdjtaxsummaryPo.getAdjtaxbefamt()); 
			dataObject.setValue(RptAdjtaxsummaryPo.COLUMNS.AVGWGTTAX.name(), rptAdjtaxsummaryPo.getAvgwgttax()); 
			dataObject.setValue(RptAdjtaxsummaryPo.COLUMNS.CREATEDATE.name(), rptAdjtaxsummaryPo.getCreatedate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<RptAdjtaxsummaryPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(RptAdjtaxsummaryPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
