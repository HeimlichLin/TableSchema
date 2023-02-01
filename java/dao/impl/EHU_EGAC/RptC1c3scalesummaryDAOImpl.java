package com.doc.common.dao.impl; 
 
public class RptC1c3scalesummaryDAOImpl extends GeneralDAOImpl<RptC1c3scalesummaryPo> implements RptC1c3scalesummaryDAO { 
	public static final RptC1c3scalesummaryDAOImpl INSTANCE = new RptC1c3scalesummaryDAOImpl(); 
	public static final String TABLENAME = "RPT_C1C3SCALESUMMARY"; 

	public RptC1c3scalesummaryDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<RptC1c3scalesummaryPo> CONVERTER = new MapConverter<RptC1c3scalesummaryPo>() { 
 
		@Override 
		public RptC1c3scalesummaryPo convert(final DataObject dataObject) { 
			final RptC1c3scalesummaryPo rptC1c3scalesummaryPo = new RptC1c3scalesummaryPo(); 
			rptC1c3scalesummaryPo.setUniqueid(BigDecimalUtils.formObj(dataObject.getValue(RptC1c3scalesummaryPo.COLUMNS.UNIQUEID.name()))); 
			rptC1c3scalesummaryPo.setTranid(BigDecimalUtils.formObj(dataObject.getValue(RptC1c3scalesummaryPo.COLUMNS.TRANID.name()))); 
			rptC1c3scalesummaryPo.setReportdate(dataObject.getString(RptC1c3scalesummaryPo.COLUMNS.REPORTDATE.name())); 
			rptC1c3scalesummaryPo.setExpressid(dataObject.getString(RptC1c3scalesummaryPo.COLUMNS.EXPRESSID.name())); 
			rptC1c3scalesummaryPo.setExpresscname(dataObject.getString(RptC1c3scalesummaryPo.COLUMNS.EXPRESSCNAME.name())); 
			rptC1c3scalesummaryPo.setBoxno(dataObject.getString(RptC1c3scalesummaryPo.COLUMNS.BOXNO.name())); 
			rptC1c3scalesummaryPo.setCnlc1(BigDecimalUtils.formObj(dataObject.getValue(RptC1c3scalesummaryPo.COLUMNS.CNLC1.name()))); 
			rptC1c3scalesummaryPo.setTtlc1(BigDecimalUtils.formObj(dataObject.getValue(RptC1c3scalesummaryPo.COLUMNS.TTLC1.name()))); 
			rptC1c3scalesummaryPo.setTtlc2(BigDecimalUtils.formObj(dataObject.getValue(RptC1c3scalesummaryPo.COLUMNS.TTLC2.name()))); 
			rptC1c3scalesummaryPo.setTtlc3(BigDecimalUtils.formObj(dataObject.getValue(RptC1c3scalesummaryPo.COLUMNS.TTLC3.name()))); 
			rptC1c3scalesummaryPo.setTotalqty(BigDecimalUtils.formObj(dataObject.getValue(RptC1c3scalesummaryPo.COLUMNS.TOTALQTY.name()))); 
			rptC1c3scalesummaryPo.setCnlc1Pct(BigDecimalUtils.formObj(dataObject.getValue(RptC1c3scalesummaryPo.COLUMNS.CNLC1_PCT.name()))); 
			rptC1c3scalesummaryPo.setC2Pct(BigDecimalUtils.formObj(dataObject.getValue(RptC1c3scalesummaryPo.COLUMNS.C2_PCT.name()))); 
			rptC1c3scalesummaryPo.setC3Pct(BigDecimalUtils.formObj(dataObject.getValue(RptC1c3scalesummaryPo.COLUMNS.C3_PCT.name()))); 
			rptC1c3scalesummaryPo.setOthPct(BigDecimalUtils.formObj(dataObject.getValue(RptC1c3scalesummaryPo.COLUMNS.OTH_PCT.name()))); 
			rptC1c3scalesummaryPo.setCreatedate(TimestampUtils.of(dataObject.getValue(RptC1c3scalesummaryPo.COLUMNS.CREATEDATE.name()))); 
			rptC1c3scalesummaryPo.setCnlc1Tpct(BigDecimalUtils.formObj(dataObject.getValue(RptC1c3scalesummaryPo.COLUMNS.CNLC1_TPCT.name()))); 
			rptC1c3scalesummaryPo.setC2Tpct(BigDecimalUtils.formObj(dataObject.getValue(RptC1c3scalesummaryPo.COLUMNS.C2_TPCT.name()))); 
			rptC1c3scalesummaryPo.setC3Tpct(BigDecimalUtils.formObj(dataObject.getValue(RptC1c3scalesummaryPo.COLUMNS.C3_TPCT.name()))); 
			rptC1c3scalesummaryPo.setOthTpct(BigDecimalUtils.formObj(dataObject.getValue(RptC1c3scalesummaryPo.COLUMNS.OTH_TPCT.name()))); 
			return rptC1c3scalesummaryPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final RptC1c3scalesummaryPo rptC1c3scalesummaryPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(RptC1c3scalesummaryPo.COLUMNS.UNIQUEID.name(), rptC1c3scalesummaryPo.getUniqueid()); 
			dataObject.setValue(RptC1c3scalesummaryPo.COLUMNS.TRANID.name(), rptC1c3scalesummaryPo.getTranid()); 
			dataObject.setValue(RptC1c3scalesummaryPo.COLUMNS.REPORTDATE.name(), rptC1c3scalesummaryPo.getReportdate()); 
			dataObject.setValue(RptC1c3scalesummaryPo.COLUMNS.EXPRESSID.name(), rptC1c3scalesummaryPo.getExpressid()); 
			dataObject.setValue(RptC1c3scalesummaryPo.COLUMNS.EXPRESSCNAME.name(), rptC1c3scalesummaryPo.getExpresscname()); 
			dataObject.setValue(RptC1c3scalesummaryPo.COLUMNS.BOXNO.name(), rptC1c3scalesummaryPo.getBoxno()); 
			dataObject.setValue(RptC1c3scalesummaryPo.COLUMNS.CNLC1.name(), rptC1c3scalesummaryPo.getCnlc1()); 
			dataObject.setValue(RptC1c3scalesummaryPo.COLUMNS.TTLC1.name(), rptC1c3scalesummaryPo.getTtlc1()); 
			dataObject.setValue(RptC1c3scalesummaryPo.COLUMNS.TTLC2.name(), rptC1c3scalesummaryPo.getTtlc2()); 
			dataObject.setValue(RptC1c3scalesummaryPo.COLUMNS.TTLC3.name(), rptC1c3scalesummaryPo.getTtlc3()); 
			dataObject.setValue(RptC1c3scalesummaryPo.COLUMNS.TOTALQTY.name(), rptC1c3scalesummaryPo.getTotalqty()); 
			dataObject.setValue(RptC1c3scalesummaryPo.COLUMNS.CNLC1_PCT.name(), rptC1c3scalesummaryPo.getCnlc1Pct()); 
			dataObject.setValue(RptC1c3scalesummaryPo.COLUMNS.C2_PCT.name(), rptC1c3scalesummaryPo.getC2Pct()); 
			dataObject.setValue(RptC1c3scalesummaryPo.COLUMNS.C3_PCT.name(), rptC1c3scalesummaryPo.getC3Pct()); 
			dataObject.setValue(RptC1c3scalesummaryPo.COLUMNS.OTH_PCT.name(), rptC1c3scalesummaryPo.getOthPct()); 
			dataObject.setValue(RptC1c3scalesummaryPo.COLUMNS.CREATEDATE.name(), rptC1c3scalesummaryPo.getCreatedate()); 
			dataObject.setValue(RptC1c3scalesummaryPo.COLUMNS.CNLC1_TPCT.name(), rptC1c3scalesummaryPo.getCnlc1Tpct()); 
			dataObject.setValue(RptC1c3scalesummaryPo.COLUMNS.C2_TPCT.name(), rptC1c3scalesummaryPo.getC2Tpct()); 
			dataObject.setValue(RptC1c3scalesummaryPo.COLUMNS.C3_TPCT.name(), rptC1c3scalesummaryPo.getC3Tpct()); 
			dataObject.setValue(RptC1c3scalesummaryPo.COLUMNS.OTH_TPCT.name(), rptC1c3scalesummaryPo.getOthTpct()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<RptC1c3scalesummaryPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(RptC1c3scalesummaryPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
