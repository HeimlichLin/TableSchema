package com.doc.common.dao.impl; 
 
public class UldmasterDAOImpl extends GeneralDAOImpl<UldmasterPo> implements UldmasterDAO { 
	public static final UldmasterDAOImpl INSTANCE = new UldmasterDAOImpl(); 
	public static final String TABLENAME = "ULDMASTER"; 

	public UldmasterDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<UldmasterPo> CONVERTER = new MapConverter<UldmasterPo>() { 
 
		@Override 
		public UldmasterPo convert(final DataObject dataObject) { 
			final UldmasterPo uldmasterPo = new UldmasterPo(); 
			uldmasterPo.setContainer(dataObject.getString(UldmasterPo.COLUMNS.CONTAINER.name())); 
			uldmasterPo.setFlightno(dataObject.getString(UldmasterPo.COLUMNS.FLIGHTNO.name())); 
			uldmasterPo.setFlightdate(TimestampUtils.of(dataObject.getValue(UldmasterPo.COLUMNS.FLIGHTDATE.name()))); 
			uldmasterPo.setFlightdest(dataObject.getString(UldmasterPo.COLUMNS.FLIGHTDEST.name())); 
			uldmasterPo.setConheight(BigDecimalUtils.formObj(dataObject.getValue(UldmasterPo.COLUMNS.CONHEIGHT.name()))); 
			uldmasterPo.setAirworthiness(dataObject.getString(UldmasterPo.COLUMNS.AIRWORTHINESS.name())); 
			uldmasterPo.setContype(dataObject.getString(UldmasterPo.COLUMNS.CONTYPE.name())); 
			uldmasterPo.setPessize(dataObject.getString(UldmasterPo.COLUMNS.PESSIZE.name())); 
			uldmasterPo.setPest(BigDecimalUtils.formObj(dataObject.getValue(UldmasterPo.COLUMNS.PEST.name()))); 
			uldmasterPo.setPesb(BigDecimalUtils.formObj(dataObject.getValue(UldmasterPo.COLUMNS.PESB.name()))); 
			uldmasterPo.setBweight(BigDecimalUtils.formObj(dataObject.getValue(UldmasterPo.COLUMNS.BWEIGHT.name()))); 
			uldmasterPo.setBweighttime(TimestampUtils.of(dataObject.getValue(UldmasterPo.COLUMNS.BWEIGHTTIME.name()))); 
			uldmasterPo.setEpcweight(BigDecimalUtils.formObj(dataObject.getValue(UldmasterPo.COLUMNS.EPCWEIGHT.name()))); 
			uldmasterPo.setEpcweighttime(TimestampUtils.of(dataObject.getValue(UldmasterPo.COLUMNS.EPCWEIGHTTIME.name()))); 
			uldmasterPo.setEpcwuserid(dataObject.getString(UldmasterPo.COLUMNS.EPCWUSERID.name())); 
			uldmasterPo.setTtlweight(BigDecimalUtils.formObj(dataObject.getValue(UldmasterPo.COLUMNS.TTLWEIGHT.name()))); 
			uldmasterPo.setTtlweighttime(TimestampUtils.of(dataObject.getValue(UldmasterPo.COLUMNS.TTLWEIGHTTIME.name()))); 
			uldmasterPo.setTtlwuserid(dataObject.getString(UldmasterPo.COLUMNS.TTLWUSERID.name())); 
			uldmasterPo.setCargoweight(BigDecimalUtils.formObj(dataObject.getValue(UldmasterPo.COLUMNS.CARGOWEIGHT.name()))); 
			uldmasterPo.setCargoweighttime(TimestampUtils.of(dataObject.getValue(UldmasterPo.COLUMNS.CARGOWEIGHTTIME.name()))); 
			uldmasterPo.setPesweight(BigDecimalUtils.formObj(dataObject.getValue(UldmasterPo.COLUMNS.PESWEIGHT.name()))); 
			uldmasterPo.setUldflag(dataObject.getString(UldmasterPo.COLUMNS.ULDFLAG.name())); 
			uldmasterPo.setAirlineid(dataObject.getString(UldmasterPo.COLUMNS.AIRLINEID.name())); 
			uldmasterPo.setSendmailtime(TimestampUtils.of(dataObject.getValue(UldmasterPo.COLUMNS.SENDMAILTIME.name()))); 
			uldmasterPo.setGcorangestartdate(TimestampUtils.of(dataObject.getValue(UldmasterPo.COLUMNS.GCORANGESTARTDATE.name()))); 
			uldmasterPo.setGcorangeenddate(TimestampUtils.of(dataObject.getValue(UldmasterPo.COLUMNS.GCORANGEENDDATE.name()))); 
			return uldmasterPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final UldmasterPo uldmasterPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(UldmasterPo.COLUMNS.CONTAINER.name(), uldmasterPo.getContainer()); 
			dataObject.setValue(UldmasterPo.COLUMNS.FLIGHTNO.name(), uldmasterPo.getFlightno()); 
			dataObject.setValue(UldmasterPo.COLUMNS.FLIGHTDATE.name(), uldmasterPo.getFlightdate()); 
			dataObject.setValue(UldmasterPo.COLUMNS.FLIGHTDEST.name(), uldmasterPo.getFlightdest()); 
			dataObject.setValue(UldmasterPo.COLUMNS.CONHEIGHT.name(), uldmasterPo.getConheight()); 
			dataObject.setValue(UldmasterPo.COLUMNS.AIRWORTHINESS.name(), uldmasterPo.getAirworthiness()); 
			dataObject.setValue(UldmasterPo.COLUMNS.CONTYPE.name(), uldmasterPo.getContype()); 
			dataObject.setValue(UldmasterPo.COLUMNS.PESSIZE.name(), uldmasterPo.getPessize()); 
			dataObject.setValue(UldmasterPo.COLUMNS.PEST.name(), uldmasterPo.getPest()); 
			dataObject.setValue(UldmasterPo.COLUMNS.PESB.name(), uldmasterPo.getPesb()); 
			dataObject.setValue(UldmasterPo.COLUMNS.BWEIGHT.name(), uldmasterPo.getBweight()); 
			dataObject.setValue(UldmasterPo.COLUMNS.BWEIGHTTIME.name(), uldmasterPo.getBweighttime()); 
			dataObject.setValue(UldmasterPo.COLUMNS.EPCWEIGHT.name(), uldmasterPo.getEpcweight()); 
			dataObject.setValue(UldmasterPo.COLUMNS.EPCWEIGHTTIME.name(), uldmasterPo.getEpcweighttime()); 
			dataObject.setValue(UldmasterPo.COLUMNS.EPCWUSERID.name(), uldmasterPo.getEpcwuserid()); 
			dataObject.setValue(UldmasterPo.COLUMNS.TTLWEIGHT.name(), uldmasterPo.getTtlweight()); 
			dataObject.setValue(UldmasterPo.COLUMNS.TTLWEIGHTTIME.name(), uldmasterPo.getTtlweighttime()); 
			dataObject.setValue(UldmasterPo.COLUMNS.TTLWUSERID.name(), uldmasterPo.getTtlwuserid()); 
			dataObject.setValue(UldmasterPo.COLUMNS.CARGOWEIGHT.name(), uldmasterPo.getCargoweight()); 
			dataObject.setValue(UldmasterPo.COLUMNS.CARGOWEIGHTTIME.name(), uldmasterPo.getCargoweighttime()); 
			dataObject.setValue(UldmasterPo.COLUMNS.PESWEIGHT.name(), uldmasterPo.getPesweight()); 
			dataObject.setValue(UldmasterPo.COLUMNS.ULDFLAG.name(), uldmasterPo.getUldflag()); 
			dataObject.setValue(UldmasterPo.COLUMNS.AIRLINEID.name(), uldmasterPo.getAirlineid()); 
			dataObject.setValue(UldmasterPo.COLUMNS.SENDMAILTIME.name(), uldmasterPo.getSendmailtime()); 
			dataObject.setValue(UldmasterPo.COLUMNS.GCORANGESTARTDATE.name(), uldmasterPo.getGcorangestartdate()); 
			dataObject.setValue(UldmasterPo.COLUMNS.GCORANGEENDDATE.name(), uldmasterPo.getGcorangeenddate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<UldmasterPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(UldmasterPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
