package com.doc.common.dao.impl; 
 
public class Express00TempDAOImpl extends GeneralDAOImpl<Express00TempPo> implements Express00TempDAO { 
	public static final Express00TempDAOImpl INSTANCE = new Express00TempDAOImpl(); 
	public static final String TABLENAME = "EXPRESS00_TEMP"; 

	public Express00TempDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Express00TempPo> CONVERTER = new MapConverter<Express00TempPo>() { 
 
		@Override 
		public Express00TempPo convert(final DataObject dataObject) { 
			final Express00TempPo express00TempPo = new Express00TempPo(); 
			express00TempPo.setDeclno(dataObject.getString(Express00TempPo.COLUMNS.DECLNO.name())); 
			express00TempPo.setMwb(dataObject.getString(Express00TempPo.COLUMNS.MWB.name())); 
			express00TempPo.setHwb(dataObject.getString(Express00TempPo.COLUMNS.HWB.name())); 
			express00TempPo.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(Express00TempPo.COLUMNS.GCIPIECE.name()))); 
			express00TempPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(Express00TempPo.COLUMNS.GCIWEIGHT.name()))); 
			express00TempPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(Express00TempPo.COLUMNS.WEIGHT.name()))); 
			express00TempPo.setBagfee(BigDecimalUtils.formObj(dataObject.getValue(Express00TempPo.COLUMNS.BAGFEE.name()))); 
			express00TempPo.setFlightno(dataObject.getString(Express00TempPo.COLUMNS.FLIGHTNO.name())); 
			express00TempPo.setDecltype(dataObject.getString(Express00TempPo.COLUMNS.DECLTYPE.name())); 
			express00TempPo.setClearancetype(dataObject.getString(Express00TempPo.COLUMNS.CLEARANCETYPE.name())); 
			return express00TempPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Express00TempPo express00TempPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Express00TempPo.COLUMNS.DECLNO.name(), express00TempPo.getDeclno()); 
			dataObject.setValue(Express00TempPo.COLUMNS.MWB.name(), express00TempPo.getMwb()); 
			dataObject.setValue(Express00TempPo.COLUMNS.HWB.name(), express00TempPo.getHwb()); 
			dataObject.setValue(Express00TempPo.COLUMNS.GCIPIECE.name(), express00TempPo.getGcipiece()); 
			dataObject.setValue(Express00TempPo.COLUMNS.GCIWEIGHT.name(), express00TempPo.getGciweight()); 
			dataObject.setValue(Express00TempPo.COLUMNS.WEIGHT.name(), express00TempPo.getWeight()); 
			dataObject.setValue(Express00TempPo.COLUMNS.BAGFEE.name(), express00TempPo.getBagfee()); 
			dataObject.setValue(Express00TempPo.COLUMNS.FLIGHTNO.name(), express00TempPo.getFlightno()); 
			dataObject.setValue(Express00TempPo.COLUMNS.DECLTYPE.name(), express00TempPo.getDecltype()); 
			dataObject.setValue(Express00TempPo.COLUMNS.CLEARANCETYPE.name(), express00TempPo.getClearancetype()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Express00TempPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Express00TempPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
