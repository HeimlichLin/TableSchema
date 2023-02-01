package com.doc.common.dao.impl; 
 
public class UldoperatorDAOImpl extends GeneralDAOImpl<UldoperatorPo> implements UldoperatorDAO { 
	public static final UldoperatorDAOImpl INSTANCE = new UldoperatorDAOImpl(); 
	public static final String TABLENAME = "ULDOPERATOR"; 

	public UldoperatorDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<UldoperatorPo> CONVERTER = new MapConverter<UldoperatorPo>() { 
 
		@Override 
		public UldoperatorPo convert(final DataObject dataObject) { 
			final UldoperatorPo uldoperatorPo = new UldoperatorPo(); 
			uldoperatorPo.setUldno(dataObject.getString(UldoperatorPo.COLUMNS.ULDNO.name())); 
			uldoperatorPo.setOpid(dataObject.getString(UldoperatorPo.COLUMNS.OPID.name())); 
			uldoperatorPo.setFlightdate(TimestampUtils.of(dataObject.getValue(UldoperatorPo.COLUMNS.FLIGHTDATE.name()))); 
			uldoperatorPo.setOpnumber(BigDecimalUtils.formObj(dataObject.getValue(UldoperatorPo.COLUMNS.OPNUMBER.name()))); 
			uldoperatorPo.setFlightno(dataObject.getString(UldoperatorPo.COLUMNS.FLIGHTNO.name())); 
			return uldoperatorPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final UldoperatorPo uldoperatorPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(UldoperatorPo.COLUMNS.ULDNO.name(), uldoperatorPo.getUldno()); 
			dataObject.setValue(UldoperatorPo.COLUMNS.OPID.name(), uldoperatorPo.getOpid()); 
			dataObject.setValue(UldoperatorPo.COLUMNS.FLIGHTDATE.name(), uldoperatorPo.getFlightdate()); 
			dataObject.setValue(UldoperatorPo.COLUMNS.OPNUMBER.name(), uldoperatorPo.getOpnumber()); 
			dataObject.setValue(UldoperatorPo.COLUMNS.FLIGHTNO.name(), uldoperatorPo.getFlightno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<UldoperatorPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(UldoperatorPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
