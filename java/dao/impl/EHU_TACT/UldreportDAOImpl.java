package com.doc.common.dao.impl; 
 
public class UldreportDAOImpl extends GeneralDAOImpl<UldreportPo> implements UldreportDAO { 
	public static final UldreportDAOImpl INSTANCE = new UldreportDAOImpl(); 
	public static final String TABLENAME = "ULDREPORT"; 

	public UldreportDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<UldreportPo> CONVERTER = new MapConverter<UldreportPo>() { 
 
		@Override 
		public UldreportPo convert(final DataObject dataObject) { 
			final UldreportPo uldreportPo = new UldreportPo(); 
			uldreportPo.setSealno(dataObject.getString(UldreportPo.COLUMNS.SEALNO.name())); 
			uldreportPo.setFlightdate(TimestampUtils.of(dataObject.getValue(UldreportPo.COLUMNS.FLIGHTDATE.name()))); 
			uldreportPo.setFlightno(dataObject.getString(UldreportPo.COLUMNS.FLIGHTNO.name())); 
			uldreportPo.setUldno(dataObject.getString(UldreportPo.COLUMNS.ULDNO.name())); 
			uldreportPo.setUldtype(dataObject.getString(UldreportPo.COLUMNS.ULDTYPE.name())); 
			uldreportPo.setUldvol(dataObject.getString(UldreportPo.COLUMNS.ULDVOL.name())); 
			uldreportPo.setMaxload(BigDecimalUtils.formObj(dataObject.getValue(UldreportPo.COLUMNS.MAXLOAD.name()))); 
			uldreportPo.setUldweight(BigDecimalUtils.formObj(dataObject.getValue(UldreportPo.COLUMNS.ULDWEIGHT.name()))); 
			uldreportPo.setPesize(dataObject.getString(UldreportPo.COLUMNS.PESIZE.name())); 
			uldreportPo.setPetop(dataObject.getString(UldreportPo.COLUMNS.PETOP.name())); 
			uldreportPo.setPebutton(dataObject.getString(UldreportPo.COLUMNS.PEBUTTON.name())); 
			uldreportPo.setRemark(dataObject.getString(UldreportPo.COLUMNS.REMARK.name())); 
			uldreportPo.setUserid(dataObject.getString(UldreportPo.COLUMNS.USERID.name())); 
			uldreportPo.setUldtime(TimestampUtils.of(dataObject.getValue(UldreportPo.COLUMNS.ULDTIME.name()))); 
			uldreportPo.setUldstatic(dataObject.getString(UldreportPo.COLUMNS.ULDSTATIC.name())); 
			uldreportPo.setAutofaxsta(dataObject.getString(UldreportPo.COLUMNS.AUTOFAXSTA.name())); 
			uldreportPo.setUldbas(dataObject.getString(UldreportPo.COLUMNS.ULDBAS.name())); 
			uldreportPo.setWorkarea(dataObject.getString(UldreportPo.COLUMNS.WORKAREA.name())); 
			uldreportPo.setStartload(dataObject.getString(UldreportPo.COLUMNS.STARTLOAD.name())); 
			uldreportPo.setLoad(BigDecimalUtils.formObj(dataObject.getValue(UldreportPo.COLUMNS.LOAD.name()))); 
			return uldreportPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final UldreportPo uldreportPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(UldreportPo.COLUMNS.SEALNO.name(), uldreportPo.getSealno()); 
			dataObject.setValue(UldreportPo.COLUMNS.FLIGHTDATE.name(), uldreportPo.getFlightdate()); 
			dataObject.setValue(UldreportPo.COLUMNS.FLIGHTNO.name(), uldreportPo.getFlightno()); 
			dataObject.setValue(UldreportPo.COLUMNS.ULDNO.name(), uldreportPo.getUldno()); 
			dataObject.setValue(UldreportPo.COLUMNS.ULDTYPE.name(), uldreportPo.getUldtype()); 
			dataObject.setValue(UldreportPo.COLUMNS.ULDVOL.name(), uldreportPo.getUldvol()); 
			dataObject.setValue(UldreportPo.COLUMNS.MAXLOAD.name(), uldreportPo.getMaxload()); 
			dataObject.setValue(UldreportPo.COLUMNS.ULDWEIGHT.name(), uldreportPo.getUldweight()); 
			dataObject.setValue(UldreportPo.COLUMNS.PESIZE.name(), uldreportPo.getPesize()); 
			dataObject.setValue(UldreportPo.COLUMNS.PETOP.name(), uldreportPo.getPetop()); 
			dataObject.setValue(UldreportPo.COLUMNS.PEBUTTON.name(), uldreportPo.getPebutton()); 
			dataObject.setValue(UldreportPo.COLUMNS.REMARK.name(), uldreportPo.getRemark()); 
			dataObject.setValue(UldreportPo.COLUMNS.USERID.name(), uldreportPo.getUserid()); 
			dataObject.setValue(UldreportPo.COLUMNS.ULDTIME.name(), uldreportPo.getUldtime()); 
			dataObject.setValue(UldreportPo.COLUMNS.ULDSTATIC.name(), uldreportPo.getUldstatic()); 
			dataObject.setValue(UldreportPo.COLUMNS.AUTOFAXSTA.name(), uldreportPo.getAutofaxsta()); 
			dataObject.setValue(UldreportPo.COLUMNS.ULDBAS.name(), uldreportPo.getUldbas()); 
			dataObject.setValue(UldreportPo.COLUMNS.WORKAREA.name(), uldreportPo.getWorkarea()); 
			dataObject.setValue(UldreportPo.COLUMNS.STARTLOAD.name(), uldreportPo.getStartload()); 
			dataObject.setValue(UldreportPo.COLUMNS.LOAD.name(), uldreportPo.getLoad()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<UldreportPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(UldreportPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
