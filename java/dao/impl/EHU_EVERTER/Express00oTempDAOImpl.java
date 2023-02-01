package com.doc.common.dao.impl; 
 
public class Express00oTempDAOImpl extends GeneralDAOImpl<Express00oTempPo> implements Express00oTempDAO { 
	public static final Express00oTempDAOImpl INSTANCE = new Express00oTempDAOImpl(); 
	public static final String TABLENAME = "EXPRESS00O_TEMP"; 

	public Express00oTempDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Express00oTempPo> CONVERTER = new MapConverter<Express00oTempPo>() { 
 
		@Override 
		public Express00oTempPo convert(final DataObject dataObject) { 
			final Express00oTempPo express00oTempPo = new Express00oTempPo(); 
			express00oTempPo.setDeclno(dataObject.getString(Express00oTempPo.COLUMNS.DECLNO.name())); 
			express00oTempPo.setMwb(dataObject.getString(Express00oTempPo.COLUMNS.MWB.name())); 
			express00oTempPo.setHwb(dataObject.getString(Express00oTempPo.COLUMNS.HWB.name())); 
			express00oTempPo.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(Express00oTempPo.COLUMNS.GCIPIECE.name()))); 
			express00oTempPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(Express00oTempPo.COLUMNS.GCIWEIGHT.name()))); 
			express00oTempPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(Express00oTempPo.COLUMNS.WEIGHT.name()))); 
			express00oTempPo.setBagfee(BigDecimalUtils.formObj(dataObject.getValue(Express00oTempPo.COLUMNS.BAGFEE.name()))); 
			express00oTempPo.setFlightno(dataObject.getString(Express00oTempPo.COLUMNS.FLIGHTNO.name())); 
			express00oTempPo.setDecltype(dataObject.getString(Express00oTempPo.COLUMNS.DECLTYPE.name())); 
			express00oTempPo.setClearancetype(dataObject.getString(Express00oTempPo.COLUMNS.CLEARANCETYPE.name())); 
			return express00oTempPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Express00oTempPo express00oTempPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Express00oTempPo.COLUMNS.DECLNO.name(), express00oTempPo.getDeclno()); 
			dataObject.setValue(Express00oTempPo.COLUMNS.MWB.name(), express00oTempPo.getMwb()); 
			dataObject.setValue(Express00oTempPo.COLUMNS.HWB.name(), express00oTempPo.getHwb()); 
			dataObject.setValue(Express00oTempPo.COLUMNS.GCIPIECE.name(), express00oTempPo.getGcipiece()); 
			dataObject.setValue(Express00oTempPo.COLUMNS.GCIWEIGHT.name(), express00oTempPo.getGciweight()); 
			dataObject.setValue(Express00oTempPo.COLUMNS.WEIGHT.name(), express00oTempPo.getWeight()); 
			dataObject.setValue(Express00oTempPo.COLUMNS.BAGFEE.name(), express00oTempPo.getBagfee()); 
			dataObject.setValue(Express00oTempPo.COLUMNS.FLIGHTNO.name(), express00oTempPo.getFlightno()); 
			dataObject.setValue(Express00oTempPo.COLUMNS.DECLTYPE.name(), express00oTempPo.getDecltype()); 
			dataObject.setValue(Express00oTempPo.COLUMNS.CLEARANCETYPE.name(), express00oTempPo.getClearancetype()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Express00oTempPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Express00oTempPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
