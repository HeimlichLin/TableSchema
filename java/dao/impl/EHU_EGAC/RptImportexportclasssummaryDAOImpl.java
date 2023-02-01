package com.doc.common.dao.impl; 
 
public class RptImportexportclasssummaryDAOImpl extends GeneralDAOImpl<RptImportexportclasssummaryPo> implements RptImportexportclasssummaryDAO { 
	public static final RptImportexportclasssummaryDAOImpl INSTANCE = new RptImportexportclasssummaryDAOImpl(); 
	public static final String TABLENAME = "RPT_IMPORTEXPORTCLASSSUMMARY"; 

	public RptImportexportclasssummaryDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<RptImportexportclasssummaryPo> CONVERTER = new MapConverter<RptImportexportclasssummaryPo>() { 
 
		@Override 
		public RptImportexportclasssummaryPo convert(final DataObject dataObject) { 
			final RptImportexportclasssummaryPo rptImportexportclasssummaryPo = new RptImportexportclasssummaryPo(); 
			rptImportexportclasssummaryPo.setUniqueid(BigDecimalUtils.formObj(dataObject.getValue(RptImportexportclasssummaryPo.COLUMNS.UNIQUEID.name()))); 
			rptImportexportclasssummaryPo.setTranid(BigDecimalUtils.formObj(dataObject.getValue(RptImportexportclasssummaryPo.COLUMNS.TRANID.name()))); 
			rptImportexportclasssummaryPo.setExpressid(dataObject.getString(RptImportexportclasssummaryPo.COLUMNS.EXPRESSID.name())); 
			rptImportexportclasssummaryPo.setExpresscname(dataObject.getString(RptImportexportclasssummaryPo.COLUMNS.EXPRESSCNAME.name())); 
			rptImportexportclasssummaryPo.setC1piece(BigDecimalUtils.formObj(dataObject.getValue(RptImportexportclasssummaryPo.COLUMNS.C1PIECE.name()))); 
			rptImportexportclasssummaryPo.setC2piece(BigDecimalUtils.formObj(dataObject.getValue(RptImportexportclasssummaryPo.COLUMNS.C2PIECE.name()))); 
			rptImportexportclasssummaryPo.setC3piece(BigDecimalUtils.formObj(dataObject.getValue(RptImportexportclasssummaryPo.COLUMNS.C3PIECE.name()))); 
			rptImportexportclasssummaryPo.setTotalpiece(BigDecimalUtils.formObj(dataObject.getValue(RptImportexportclasssummaryPo.COLUMNS.TOTALPIECE.name()))); 
			rptImportexportclasssummaryPo.setC1weight(BigDecimalUtils.formObj(dataObject.getValue(RptImportexportclasssummaryPo.COLUMNS.C1WEIGHT.name()))); 
			rptImportexportclasssummaryPo.setC2weight(BigDecimalUtils.formObj(dataObject.getValue(RptImportexportclasssummaryPo.COLUMNS.C2WEIGHT.name()))); 
			rptImportexportclasssummaryPo.setC3weight(BigDecimalUtils.formObj(dataObject.getValue(RptImportexportclasssummaryPo.COLUMNS.C3WEIGHT.name()))); 
			rptImportexportclasssummaryPo.setTotalweight(BigDecimalUtils.formObj(dataObject.getValue(RptImportexportclasssummaryPo.COLUMNS.TOTALWEIGHT.name()))); 
			rptImportexportclasssummaryPo.setC1fee(BigDecimalUtils.formObj(dataObject.getValue(RptImportexportclasssummaryPo.COLUMNS.C1FEE.name()))); 
			rptImportexportclasssummaryPo.setC2fee(BigDecimalUtils.formObj(dataObject.getValue(RptImportexportclasssummaryPo.COLUMNS.C2FEE.name()))); 
			rptImportexportclasssummaryPo.setC3fee(BigDecimalUtils.formObj(dataObject.getValue(RptImportexportclasssummaryPo.COLUMNS.C3FEE.name()))); 
			rptImportexportclasssummaryPo.setTotalfee(BigDecimalUtils.formObj(dataObject.getValue(RptImportexportclasssummaryPo.COLUMNS.TOTALFEE.name()))); 
			rptImportexportclasssummaryPo.setCreatedate(TimestampUtils.of(dataObject.getValue(RptImportexportclasssummaryPo.COLUMNS.CREATEDATE.name()))); 
			return rptImportexportclasssummaryPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final RptImportexportclasssummaryPo rptImportexportclasssummaryPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(RptImportexportclasssummaryPo.COLUMNS.UNIQUEID.name(), rptImportexportclasssummaryPo.getUniqueid()); 
			dataObject.setValue(RptImportexportclasssummaryPo.COLUMNS.TRANID.name(), rptImportexportclasssummaryPo.getTranid()); 
			dataObject.setValue(RptImportexportclasssummaryPo.COLUMNS.EXPRESSID.name(), rptImportexportclasssummaryPo.getExpressid()); 
			dataObject.setValue(RptImportexportclasssummaryPo.COLUMNS.EXPRESSCNAME.name(), rptImportexportclasssummaryPo.getExpresscname()); 
			dataObject.setValue(RptImportexportclasssummaryPo.COLUMNS.C1PIECE.name(), rptImportexportclasssummaryPo.getC1piece()); 
			dataObject.setValue(RptImportexportclasssummaryPo.COLUMNS.C2PIECE.name(), rptImportexportclasssummaryPo.getC2piece()); 
			dataObject.setValue(RptImportexportclasssummaryPo.COLUMNS.C3PIECE.name(), rptImportexportclasssummaryPo.getC3piece()); 
			dataObject.setValue(RptImportexportclasssummaryPo.COLUMNS.TOTALPIECE.name(), rptImportexportclasssummaryPo.getTotalpiece()); 
			dataObject.setValue(RptImportexportclasssummaryPo.COLUMNS.C1WEIGHT.name(), rptImportexportclasssummaryPo.getC1weight()); 
			dataObject.setValue(RptImportexportclasssummaryPo.COLUMNS.C2WEIGHT.name(), rptImportexportclasssummaryPo.getC2weight()); 
			dataObject.setValue(RptImportexportclasssummaryPo.COLUMNS.C3WEIGHT.name(), rptImportexportclasssummaryPo.getC3weight()); 
			dataObject.setValue(RptImportexportclasssummaryPo.COLUMNS.TOTALWEIGHT.name(), rptImportexportclasssummaryPo.getTotalweight()); 
			dataObject.setValue(RptImportexportclasssummaryPo.COLUMNS.C1FEE.name(), rptImportexportclasssummaryPo.getC1fee()); 
			dataObject.setValue(RptImportexportclasssummaryPo.COLUMNS.C2FEE.name(), rptImportexportclasssummaryPo.getC2fee()); 
			dataObject.setValue(RptImportexportclasssummaryPo.COLUMNS.C3FEE.name(), rptImportexportclasssummaryPo.getC3fee()); 
			dataObject.setValue(RptImportexportclasssummaryPo.COLUMNS.TOTALFEE.name(), rptImportexportclasssummaryPo.getTotalfee()); 
			dataObject.setValue(RptImportexportclasssummaryPo.COLUMNS.CREATEDATE.name(), rptImportexportclasssummaryPo.getCreatedate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<RptImportexportclasssummaryPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(RptImportexportclasssummaryPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
