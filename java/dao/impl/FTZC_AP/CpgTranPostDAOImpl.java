package com.doc.common.dao.impl; 
 
public class CpgTranPostDAOImpl extends GeneralDAOImpl<CpgTranPostPo> implements CpgTranPostDAO { 
	public static final CpgTranPostDAOImpl INSTANCE = new CpgTranPostDAOImpl(); 
	public static final String TABLENAME = "CPG_TRAN_POST"; 

	public CpgTranPostDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<CpgTranPostPo> CONVERTER = new MapConverter<CpgTranPostPo>() { 
 
		@Override 
		public CpgTranPostPo convert(final DataObject dataObject) { 
			final CpgTranPostPo cpgTranPostPo = new CpgTranPostPo(); 
			cpgTranPostPo.setFilename(dataObject.getString(CpgTranPostPo.COLUMNS.FILENAME.name())); 
			cpgTranPostPo.setPostmblno(dataObject.getString(CpgTranPostPo.COLUMNS.POSTMBLNO.name())); 
			cpgTranPostPo.setOrircvfile(dataObject.getString(CpgTranPostPo.COLUMNS.ORIRCVFILE.name())); 
			cpgTranPostPo.setFlightno(dataObject.getString(CpgTranPostPo.COLUMNS.FLIGHTNO.name())); 
			cpgTranPostPo.setFlightdatetime(dataObject.getString(CpgTranPostPo.COLUMNS.FLIGHTDATETIME.name())); 
			cpgTranPostPo.setPosttype(dataObject.getString(CpgTranPostPo.COLUMNS.POSTTYPE.name())); 
			cpgTranPostPo.setPostspecialaccount(dataObject.getString(CpgTranPostPo.COLUMNS.POSTSPECIALACCOUNT.name())); 
			cpgTranPostPo.setType(dataObject.getString(CpgTranPostPo.COLUMNS.TYPE.name())); 
			cpgTranPostPo.setYear(dataObject.getString(CpgTranPostPo.COLUMNS.YEAR.name())); 
			cpgTranPostPo.setCountrycode(dataObject.getString(CpgTranPostPo.COLUMNS.COUNTRYCODE.name())); 
			cpgTranPostPo.setExchangeagency(dataObject.getString(CpgTranPostPo.COLUMNS.EXCHANGEAGENCY.name())); 
			cpgTranPostPo.setTotalpackageno(BigDecimalUtils.formObj(dataObject.getValue(CpgTranPostPo.COLUMNS.TOTALPACKAGENO.name()))); 
			cpgTranPostPo.setGoodtotalpackageyear(dataObject.getString(CpgTranPostPo.COLUMNS.GOODTOTALPACKAGEYEAR.name())); 
			cpgTranPostPo.setGoodtotalpackageno(dataObject.getString(CpgTranPostPo.COLUMNS.GOODTOTALPACKAGENO.name())); 
			return cpgTranPostPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final CpgTranPostPo cpgTranPostPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(CpgTranPostPo.COLUMNS.FILENAME.name(), cpgTranPostPo.getFilename()); 
			dataObject.setValue(CpgTranPostPo.COLUMNS.POSTMBLNO.name(), cpgTranPostPo.getPostmblno()); 
			dataObject.setValue(CpgTranPostPo.COLUMNS.ORIRCVFILE.name(), cpgTranPostPo.getOrircvfile()); 
			dataObject.setValue(CpgTranPostPo.COLUMNS.FLIGHTNO.name(), cpgTranPostPo.getFlightno()); 
			dataObject.setValue(CpgTranPostPo.COLUMNS.FLIGHTDATETIME.name(), cpgTranPostPo.getFlightdatetime()); 
			dataObject.setValue(CpgTranPostPo.COLUMNS.POSTTYPE.name(), cpgTranPostPo.getPosttype()); 
			dataObject.setValue(CpgTranPostPo.COLUMNS.POSTSPECIALACCOUNT.name(), cpgTranPostPo.getPostspecialaccount()); 
			dataObject.setValue(CpgTranPostPo.COLUMNS.TYPE.name(), cpgTranPostPo.getType()); 
			dataObject.setValue(CpgTranPostPo.COLUMNS.YEAR.name(), cpgTranPostPo.getYear()); 
			dataObject.setValue(CpgTranPostPo.COLUMNS.COUNTRYCODE.name(), cpgTranPostPo.getCountrycode()); 
			dataObject.setValue(CpgTranPostPo.COLUMNS.EXCHANGEAGENCY.name(), cpgTranPostPo.getExchangeagency()); 
			dataObject.setValue(CpgTranPostPo.COLUMNS.TOTALPACKAGENO.name(), cpgTranPostPo.getTotalpackageno()); 
			dataObject.setValue(CpgTranPostPo.COLUMNS.GOODTOTALPACKAGEYEAR.name(), cpgTranPostPo.getGoodtotalpackageyear()); 
			dataObject.setValue(CpgTranPostPo.COLUMNS.GOODTOTALPACKAGENO.name(), cpgTranPostPo.getGoodtotalpackageno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<CpgTranPostPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(CpgTranPostPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
