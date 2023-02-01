package com.doc.common.dao.impl; 
 
public class OriginCountryCodeDAOImpl extends GeneralDAOImpl<OriginCountryCodePo> implements OriginCountryCodeDAO { 
	public static final OriginCountryCodeDAOImpl INSTANCE = new OriginCountryCodeDAOImpl(); 
	public static final String TABLENAME = "ORIGIN_COUNTRY_CODE"; 

	public OriginCountryCodeDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<OriginCountryCodePo> CONVERTER = new MapConverter<OriginCountryCodePo>() { 
 
		@Override 
		public OriginCountryCodePo convert(final DataObject dataObject) { 
			final OriginCountryCodePo originCountryCodePo = new OriginCountryCodePo(); 
			originCountryCodePo.setOriginCountryCode(dataObject.getString(OriginCountryCodePo.COLUMNS.ORIGIN_COUNTRY_CODE.name())); 
			originCountryCodePo.setOriginCountryName(dataObject.getString(OriginCountryCodePo.COLUMNS.ORIGIN_COUNTRY_NAME.name())); 
			originCountryCodePo.setOriginCountryEngName(dataObject.getString(OriginCountryCodePo.COLUMNS.ORIGIN_COUNTRY_ENG_NAME.name())); 
			return originCountryCodePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final OriginCountryCodePo originCountryCodePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(OriginCountryCodePo.COLUMNS.ORIGIN_COUNTRY_CODE.name(), originCountryCodePo.getOriginCountryCode()); 
			dataObject.setValue(OriginCountryCodePo.COLUMNS.ORIGIN_COUNTRY_NAME.name(), originCountryCodePo.getOriginCountryName()); 
			dataObject.setValue(OriginCountryCodePo.COLUMNS.ORIGIN_COUNTRY_ENG_NAME.name(), originCountryCodePo.getOriginCountryEngName()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<OriginCountryCodePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(OriginCountryCodePo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
