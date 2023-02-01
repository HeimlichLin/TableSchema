package com.doc.common.dao.impl; 
 
public class SitadlvDAOImpl extends GeneralDAOImpl<SitadlvPo> implements SitadlvDAO { 
	public static final SitadlvDAOImpl INSTANCE = new SitadlvDAOImpl(); 
	public static final String TABLENAME = "SITADLV"; 

	public SitadlvDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<SitadlvPo> CONVERTER = new MapConverter<SitadlvPo>() { 
 
		@Override 
		public SitadlvPo convert(final DataObject dataObject) { 
			final SitadlvPo sitadlvPo = new SitadlvPo(); 
			sitadlvPo.setAwb(dataObject.getString(SitadlvPo.COLUMNS.AWB.name())); 
			sitadlvPo.setFlightdate(dataObject.getString(SitadlvPo.COLUMNS.FLIGHTDATE.name())); 
			sitadlvPo.setFlightno(dataObject.getString(SitadlvPo.COLUMNS.FLIGHTNO.name())); 
			sitadlvPo.setPc(BigDecimalUtils.formObj(dataObject.getValue(SitadlvPo.COLUMNS.PC.name()))); 
			sitadlvPo.setProcess(dataObject.getString(SitadlvPo.COLUMNS.PROCESS.name())); 
			sitadlvPo.setProcesstime(dataObject.getString(SitadlvPo.COLUMNS.PROCESSTIME.name())); 
			sitadlvPo.setInpc(BigDecimalUtils.formObj(dataObject.getValue(SitadlvPo.COLUMNS.INPC.name()))); 
			return sitadlvPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final SitadlvPo sitadlvPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(SitadlvPo.COLUMNS.AWB.name(), sitadlvPo.getAwb()); 
			dataObject.setValue(SitadlvPo.COLUMNS.FLIGHTDATE.name(), sitadlvPo.getFlightdate()); 
			dataObject.setValue(SitadlvPo.COLUMNS.FLIGHTNO.name(), sitadlvPo.getFlightno()); 
			dataObject.setValue(SitadlvPo.COLUMNS.PC.name(), sitadlvPo.getPc()); 
			dataObject.setValue(SitadlvPo.COLUMNS.PROCESS.name(), sitadlvPo.getProcess()); 
			dataObject.setValue(SitadlvPo.COLUMNS.PROCESSTIME.name(), sitadlvPo.getProcesstime()); 
			dataObject.setValue(SitadlvPo.COLUMNS.INPC.name(), sitadlvPo.getInpc()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<SitadlvPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(SitadlvPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
