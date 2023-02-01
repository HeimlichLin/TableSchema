package com.doc.common.dao.impl; 
 
public class Express00iTempDAOImpl extends GeneralDAOImpl<Express00iTempPo> implements Express00iTempDAO { 
	public static final Express00iTempDAOImpl INSTANCE = new Express00iTempDAOImpl(); 
	public static final String TABLENAME = "EXPRESS00I_TEMP"; 

	public Express00iTempDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Express00iTempPo> CONVERTER = new MapConverter<Express00iTempPo>() { 
 
		@Override 
		public Express00iTempPo convert(final DataObject dataObject) { 
			final Express00iTempPo express00iTempPo = new Express00iTempPo(); 
			express00iTempPo.setDeclno(dataObject.getString(Express00iTempPo.COLUMNS.DECLNO.name())); 
			express00iTempPo.setMwb(dataObject.getString(Express00iTempPo.COLUMNS.MWB.name())); 
			express00iTempPo.setHwb(dataObject.getString(Express00iTempPo.COLUMNS.HWB.name())); 
			express00iTempPo.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(Express00iTempPo.COLUMNS.GCIPIECE.name()))); 
			express00iTempPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(Express00iTempPo.COLUMNS.GCIWEIGHT.name()))); 
			express00iTempPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(Express00iTempPo.COLUMNS.WEIGHT.name()))); 
			express00iTempPo.setBagfee(BigDecimalUtils.formObj(dataObject.getValue(Express00iTempPo.COLUMNS.BAGFEE.name()))); 
			express00iTempPo.setFlightno(dataObject.getString(Express00iTempPo.COLUMNS.FLIGHTNO.name())); 
			express00iTempPo.setDecltype(dataObject.getString(Express00iTempPo.COLUMNS.DECLTYPE.name())); 
			express00iTempPo.setClearancetype(dataObject.getString(Express00iTempPo.COLUMNS.CLEARANCETYPE.name())); 
			return express00iTempPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Express00iTempPo express00iTempPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Express00iTempPo.COLUMNS.DECLNO.name(), express00iTempPo.getDeclno()); 
			dataObject.setValue(Express00iTempPo.COLUMNS.MWB.name(), express00iTempPo.getMwb()); 
			dataObject.setValue(Express00iTempPo.COLUMNS.HWB.name(), express00iTempPo.getHwb()); 
			dataObject.setValue(Express00iTempPo.COLUMNS.GCIPIECE.name(), express00iTempPo.getGcipiece()); 
			dataObject.setValue(Express00iTempPo.COLUMNS.GCIWEIGHT.name(), express00iTempPo.getGciweight()); 
			dataObject.setValue(Express00iTempPo.COLUMNS.WEIGHT.name(), express00iTempPo.getWeight()); 
			dataObject.setValue(Express00iTempPo.COLUMNS.BAGFEE.name(), express00iTempPo.getBagfee()); 
			dataObject.setValue(Express00iTempPo.COLUMNS.FLIGHTNO.name(), express00iTempPo.getFlightno()); 
			dataObject.setValue(Express00iTempPo.COLUMNS.DECLTYPE.name(), express00iTempPo.getDecltype()); 
			dataObject.setValue(Express00iTempPo.COLUMNS.CLEARANCETYPE.name(), express00iTempPo.getClearancetype()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Express00iTempPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Express00iTempPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
