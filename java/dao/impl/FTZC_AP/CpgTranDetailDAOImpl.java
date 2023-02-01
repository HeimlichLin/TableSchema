package com.doc.common.dao.impl; 
 
public class CpgTranDetailDAOImpl extends GeneralDAOImpl<CpgTranDetailPo> implements CpgTranDetailDAO { 
	public static final CpgTranDetailDAOImpl INSTANCE = new CpgTranDetailDAOImpl(); 
	public static final String TABLENAME = "CPG_TRAN_DETAIL"; 

	public CpgTranDetailDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<CpgTranDetailPo> CONVERTER = new MapConverter<CpgTranDetailPo>() { 
 
		@Override 
		public CpgTranDetailPo convert(final DataObject dataObject) { 
			final CpgTranDetailPo cpgTranDetailPo = new CpgTranDetailPo(); 
			cpgTranDetailPo.setFilename(dataObject.getString(CpgTranDetailPo.COLUMNS.FILENAME.name())); 
			cpgTranDetailPo.setPostno(dataObject.getString(CpgTranDetailPo.COLUMNS.POSTNO.name())); 
			cpgTranDetailPo.setPostspecialaccount(dataObject.getString(CpgTranDetailPo.COLUMNS.POSTSPECIALACCOUNT.name())); 
			cpgTranDetailPo.setPosttype(dataObject.getString(CpgTranDetailPo.COLUMNS.POSTTYPE.name())); 
			cpgTranDetailPo.setType(dataObject.getString(CpgTranDetailPo.COLUMNS.TYPE.name())); 
			cpgTranDetailPo.setYear(dataObject.getString(CpgTranDetailPo.COLUMNS.YEAR.name())); 
			cpgTranDetailPo.setCountrycode(dataObject.getString(CpgTranDetailPo.COLUMNS.COUNTRYCODE.name())); 
			cpgTranDetailPo.setExchangeagency(dataObject.getString(CpgTranDetailPo.COLUMNS.EXCHANGEAGENCY.name())); 
			cpgTranDetailPo.setTotalpackageno(BigDecimalUtils.formObj(dataObject.getValue(CpgTranDetailPo.COLUMNS.TOTALPACKAGENO.name()))); 
			cpgTranDetailPo.setGoodtotalpackageyear(dataObject.getString(CpgTranDetailPo.COLUMNS.GOODTOTALPACKAGEYEAR.name())); 
			cpgTranDetailPo.setGoodtotalpackageno(dataObject.getString(CpgTranDetailPo.COLUMNS.GOODTOTALPACKAGENO.name())); 
			return cpgTranDetailPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final CpgTranDetailPo cpgTranDetailPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(CpgTranDetailPo.COLUMNS.FILENAME.name(), cpgTranDetailPo.getFilename()); 
			dataObject.setValue(CpgTranDetailPo.COLUMNS.POSTNO.name(), cpgTranDetailPo.getPostno()); 
			dataObject.setValue(CpgTranDetailPo.COLUMNS.POSTSPECIALACCOUNT.name(), cpgTranDetailPo.getPostspecialaccount()); 
			dataObject.setValue(CpgTranDetailPo.COLUMNS.POSTTYPE.name(), cpgTranDetailPo.getPosttype()); 
			dataObject.setValue(CpgTranDetailPo.COLUMNS.TYPE.name(), cpgTranDetailPo.getType()); 
			dataObject.setValue(CpgTranDetailPo.COLUMNS.YEAR.name(), cpgTranDetailPo.getYear()); 
			dataObject.setValue(CpgTranDetailPo.COLUMNS.COUNTRYCODE.name(), cpgTranDetailPo.getCountrycode()); 
			dataObject.setValue(CpgTranDetailPo.COLUMNS.EXCHANGEAGENCY.name(), cpgTranDetailPo.getExchangeagency()); 
			dataObject.setValue(CpgTranDetailPo.COLUMNS.TOTALPACKAGENO.name(), cpgTranDetailPo.getTotalpackageno()); 
			dataObject.setValue(CpgTranDetailPo.COLUMNS.GOODTOTALPACKAGEYEAR.name(), cpgTranDetailPo.getGoodtotalpackageyear()); 
			dataObject.setValue(CpgTranDetailPo.COLUMNS.GOODTOTALPACKAGENO.name(), cpgTranDetailPo.getGoodtotalpackageno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<CpgTranDetailPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(CpgTranDetailPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
