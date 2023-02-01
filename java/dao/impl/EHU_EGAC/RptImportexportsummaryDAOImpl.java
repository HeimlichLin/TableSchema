package com.doc.common.dao.impl; 
 
public class RptImportexportsummaryDAOImpl extends GeneralDAOImpl<RptImportexportsummaryPo> implements RptImportexportsummaryDAO { 
	public static final RptImportexportsummaryDAOImpl INSTANCE = new RptImportexportsummaryDAOImpl(); 
	public static final String TABLENAME = "RPT_IMPORTEXPORTSUMMARY"; 

	public RptImportexportsummaryDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<RptImportexportsummaryPo> CONVERTER = new MapConverter<RptImportexportsummaryPo>() { 
 
		@Override 
		public RptImportexportsummaryPo convert(final DataObject dataObject) { 
			final RptImportexportsummaryPo rptImportexportsummaryPo = new RptImportexportsummaryPo(); 
			rptImportexportsummaryPo.setUniqueid(BigDecimalUtils.formObj(dataObject.getValue(RptImportexportsummaryPo.COLUMNS.UNIQUEID.name()))); 
			rptImportexportsummaryPo.setTranid(BigDecimalUtils.formObj(dataObject.getValue(RptImportexportsummaryPo.COLUMNS.TRANID.name()))); 
			rptImportexportsummaryPo.setHwbfee(BigDecimalUtils.formObj(dataObject.getValue(RptImportexportsummaryPo.COLUMNS.HWBFEE.name()))); 
			rptImportexportsummaryPo.setMwb(dataObject.getString(RptImportexportsummaryPo.COLUMNS.MWB.name())); 
			rptImportexportsummaryPo.setHwb(dataObject.getString(RptImportexportsummaryPo.COLUMNS.HWB.name())); 
			rptImportexportsummaryPo.setDecltype(dataObject.getString(RptImportexportsummaryPo.COLUMNS.DECLTYPE.name())); 
			rptImportexportsummaryPo.setDeclno(dataObject.getString(RptImportexportsummaryPo.COLUMNS.DECLNO.name())); 
			rptImportexportsummaryPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(RptImportexportsummaryPo.COLUMNS.PIECE.name()))); 
			rptImportexportsummaryPo.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(RptImportexportsummaryPo.COLUMNS.GCIPIECE.name()))); 
			rptImportexportsummaryPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(RptImportexportsummaryPo.COLUMNS.GCIWEIGHT.name()))); 
			rptImportexportsummaryPo.setGcidate1(TimestampUtils.of(dataObject.getValue(RptImportexportsummaryPo.COLUMNS.GCIDATE1.name()))); 
			rptImportexportsummaryPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(RptImportexportsummaryPo.COLUMNS.WEIGHT.name()))); 
			rptImportexportsummaryPo.setGcopiece(BigDecimalUtils.formObj(dataObject.getValue(RptImportexportsummaryPo.COLUMNS.GCOPIECE.name()))); 
			rptImportexportsummaryPo.setGcodate1(TimestampUtils.of(dataObject.getValue(RptImportexportsummaryPo.COLUMNS.GCODATE1.name()))); 
			rptImportexportsummaryPo.setReleasetime(TimestampUtils.of(dataObject.getValue(RptImportexportsummaryPo.COLUMNS.RELEASETIME.name()))); 
			rptImportexportsummaryPo.setClearancetype(dataObject.getString(RptImportexportsummaryPo.COLUMNS.CLEARANCETYPE.name())); 
			rptImportexportsummaryPo.setClosemark(dataObject.getString(RptImportexportsummaryPo.COLUMNS.CLOSEMARK.name())); 
			rptImportexportsummaryPo.setExpressid(dataObject.getString(RptImportexportsummaryPo.COLUMNS.EXPRESSID.name())); 
			rptImportexportsummaryPo.setAirlineid(dataObject.getString(RptImportexportsummaryPo.COLUMNS.AIRLINEID.name())); 
			rptImportexportsummaryPo.setFlightno(dataObject.getString(RptImportexportsummaryPo.COLUMNS.FLIGHTNO.name())); 
			rptImportexportsummaryPo.setBaghwb(BigDecimalUtils.formObj(dataObject.getValue(RptImportexportsummaryPo.COLUMNS.BAGHWB.name()))); 
			rptImportexportsummaryPo.setCreatedate(TimestampUtils.of(dataObject.getValue(RptImportexportsummaryPo.COLUMNS.CREATEDATE.name()))); 
			return rptImportexportsummaryPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final RptImportexportsummaryPo rptImportexportsummaryPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(RptImportexportsummaryPo.COLUMNS.UNIQUEID.name(), rptImportexportsummaryPo.getUniqueid()); 
			dataObject.setValue(RptImportexportsummaryPo.COLUMNS.TRANID.name(), rptImportexportsummaryPo.getTranid()); 
			dataObject.setValue(RptImportexportsummaryPo.COLUMNS.HWBFEE.name(), rptImportexportsummaryPo.getHwbfee()); 
			dataObject.setValue(RptImportexportsummaryPo.COLUMNS.MWB.name(), rptImportexportsummaryPo.getMwb()); 
			dataObject.setValue(RptImportexportsummaryPo.COLUMNS.HWB.name(), rptImportexportsummaryPo.getHwb()); 
			dataObject.setValue(RptImportexportsummaryPo.COLUMNS.DECLTYPE.name(), rptImportexportsummaryPo.getDecltype()); 
			dataObject.setValue(RptImportexportsummaryPo.COLUMNS.DECLNO.name(), rptImportexportsummaryPo.getDeclno()); 
			dataObject.setValue(RptImportexportsummaryPo.COLUMNS.PIECE.name(), rptImportexportsummaryPo.getPiece()); 
			dataObject.setValue(RptImportexportsummaryPo.COLUMNS.GCIPIECE.name(), rptImportexportsummaryPo.getGcipiece()); 
			dataObject.setValue(RptImportexportsummaryPo.COLUMNS.GCIWEIGHT.name(), rptImportexportsummaryPo.getGciweight()); 
			dataObject.setValue(RptImportexportsummaryPo.COLUMNS.GCIDATE1.name(), rptImportexportsummaryPo.getGcidate1()); 
			dataObject.setValue(RptImportexportsummaryPo.COLUMNS.WEIGHT.name(), rptImportexportsummaryPo.getWeight()); 
			dataObject.setValue(RptImportexportsummaryPo.COLUMNS.GCOPIECE.name(), rptImportexportsummaryPo.getGcopiece()); 
			dataObject.setValue(RptImportexportsummaryPo.COLUMNS.GCODATE1.name(), rptImportexportsummaryPo.getGcodate1()); 
			dataObject.setValue(RptImportexportsummaryPo.COLUMNS.RELEASETIME.name(), rptImportexportsummaryPo.getReleasetime()); 
			dataObject.setValue(RptImportexportsummaryPo.COLUMNS.CLEARANCETYPE.name(), rptImportexportsummaryPo.getClearancetype()); 
			dataObject.setValue(RptImportexportsummaryPo.COLUMNS.CLOSEMARK.name(), rptImportexportsummaryPo.getClosemark()); 
			dataObject.setValue(RptImportexportsummaryPo.COLUMNS.EXPRESSID.name(), rptImportexportsummaryPo.getExpressid()); 
			dataObject.setValue(RptImportexportsummaryPo.COLUMNS.AIRLINEID.name(), rptImportexportsummaryPo.getAirlineid()); 
			dataObject.setValue(RptImportexportsummaryPo.COLUMNS.FLIGHTNO.name(), rptImportexportsummaryPo.getFlightno()); 
			dataObject.setValue(RptImportexportsummaryPo.COLUMNS.BAGHWB.name(), rptImportexportsummaryPo.getBaghwb()); 
			dataObject.setValue(RptImportexportsummaryPo.COLUMNS.CREATEDATE.name(), rptImportexportsummaryPo.getCreatedate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<RptImportexportsummaryPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(RptImportexportsummaryPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
