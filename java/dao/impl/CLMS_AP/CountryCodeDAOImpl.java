package com.doc.common.dao.impl; 
 
public class CountryCodeDAOImpl extends GeneralDAOImpl<CountryCodePo> implements CountryCodeDAO { 
	public static final CountryCodeDAOImpl INSTANCE = new CountryCodeDAOImpl(); 
	public static final String TABLENAME = "COUNTRY_CODE"; 

	public CountryCodeDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<CountryCodePo> CONVERTER = new MapConverter<CountryCodePo>() { 
 
		@Override 
		public CountryCodePo convert(final DataObject dataObject) { 
			final CountryCodePo countryCodePo = new CountryCodePo(); 
			countryCodePo.setCountryid(dataObject.getString(CountryCodePo.COLUMNS.COUNTRYID.name())); 
			countryCodePo.setCountryName(dataObject.getString(CountryCodePo.COLUMNS.COUNTRY_NAME.name())); 
			countryCodePo.setCountryEName(dataObject.getString(CountryCodePo.COLUMNS.COUNTRY_E_NAME.name())); 
			countryCodePo.setLocation(dataObject.getString(CountryCodePo.COLUMNS.LOCATION.name())); 
			return countryCodePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final CountryCodePo countryCodePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(CountryCodePo.COLUMNS.COUNTRYID.name(), countryCodePo.getCountryid()); 
			dataObject.setValue(CountryCodePo.COLUMNS.COUNTRY_NAME.name(), countryCodePo.getCountryName()); 
			dataObject.setValue(CountryCodePo.COLUMNS.COUNTRY_E_NAME.name(), countryCodePo.getCountryEName()); 
			dataObject.setValue(CountryCodePo.COLUMNS.LOCATION.name(), countryCodePo.getLocation()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<CountryCodePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(CountryCodePo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(CountryCodePo.COLUMNS.COUNTRYID.name(), po.getCountryid()); 
		return sqlWhere; 
	} 
 
} 
