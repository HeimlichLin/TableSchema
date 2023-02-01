package com.doc.common.dao.impl; 
 
public class UldtypeDAOImpl extends GeneralDAOImpl<UldtypePo> implements UldtypeDAO { 
	public static final UldtypeDAOImpl INSTANCE = new UldtypeDAOImpl(); 
	public static final String TABLENAME = "ULDTYPE"; 

	public UldtypeDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<UldtypePo> CONVERTER = new MapConverter<UldtypePo>() { 
 
		@Override 
		public UldtypePo convert(final DataObject dataObject) { 
			final UldtypePo uldtypePo = new UldtypePo(); 
			uldtypePo.setAirlineid(dataObject.getString(UldtypePo.COLUMNS.AIRLINEID.name())); 
			uldtypePo.setUldtype(dataObject.getString(UldtypePo.COLUMNS.ULDTYPE.name())); 
			uldtypePo.setUldweight(BigDecimalUtils.formObj(dataObject.getValue(UldtypePo.COLUMNS.ULDWEIGHT.name()))); 
			return uldtypePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final UldtypePo uldtypePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(UldtypePo.COLUMNS.AIRLINEID.name(), uldtypePo.getAirlineid()); 
			dataObject.setValue(UldtypePo.COLUMNS.ULDTYPE.name(), uldtypePo.getUldtype()); 
			dataObject.setValue(UldtypePo.COLUMNS.ULDWEIGHT.name(), uldtypePo.getUldweight()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<UldtypePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(UldtypePo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
