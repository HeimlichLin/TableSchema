package com.doc.common.dao.impl; 
 
public class ClearancetypeTempDAOImpl extends GeneralDAOImpl<ClearancetypeTempPo> implements ClearancetypeTempDAO { 
	public static final ClearancetypeTempDAOImpl INSTANCE = new ClearancetypeTempDAOImpl(); 
	public static final String TABLENAME = "CLEARANCETYPE_TEMP"; 

	public ClearancetypeTempDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ClearancetypeTempPo> CONVERTER = new MapConverter<ClearancetypeTempPo>() { 
 
		@Override 
		public ClearancetypeTempPo convert(final DataObject dataObject) { 
			final ClearancetypeTempPo clearancetypeTempPo = new ClearancetypeTempPo(); 
			clearancetypeTempPo.setDeclno(dataObject.getString(ClearancetypeTempPo.COLUMNS.DECLNO.name())); 
			clearancetypeTempPo.setMwb(dataObject.getString(ClearancetypeTempPo.COLUMNS.MWB.name())); 
			clearancetypeTempPo.setHwb(dataObject.getString(ClearancetypeTempPo.COLUMNS.HWB.name())); 
			clearancetypeTempPo.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(ClearancetypeTempPo.COLUMNS.GCIPIECE.name()))); 
			clearancetypeTempPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(ClearancetypeTempPo.COLUMNS.GCIWEIGHT.name()))); 
			clearancetypeTempPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(ClearancetypeTempPo.COLUMNS.WEIGHT.name()))); 
			clearancetypeTempPo.setBagfee(BigDecimalUtils.formObj(dataObject.getValue(ClearancetypeTempPo.COLUMNS.BAGFEE.name()))); 
			clearancetypeTempPo.setFlightno(dataObject.getString(ClearancetypeTempPo.COLUMNS.FLIGHTNO.name())); 
			clearancetypeTempPo.setDecltype(dataObject.getString(ClearancetypeTempPo.COLUMNS.DECLTYPE.name())); 
			clearancetypeTempPo.setClearancetype(dataObject.getString(ClearancetypeTempPo.COLUMNS.CLEARANCETYPE.name())); 
			return clearancetypeTempPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ClearancetypeTempPo clearancetypeTempPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ClearancetypeTempPo.COLUMNS.DECLNO.name(), clearancetypeTempPo.getDeclno()); 
			dataObject.setValue(ClearancetypeTempPo.COLUMNS.MWB.name(), clearancetypeTempPo.getMwb()); 
			dataObject.setValue(ClearancetypeTempPo.COLUMNS.HWB.name(), clearancetypeTempPo.getHwb()); 
			dataObject.setValue(ClearancetypeTempPo.COLUMNS.GCIPIECE.name(), clearancetypeTempPo.getGcipiece()); 
			dataObject.setValue(ClearancetypeTempPo.COLUMNS.GCIWEIGHT.name(), clearancetypeTempPo.getGciweight()); 
			dataObject.setValue(ClearancetypeTempPo.COLUMNS.WEIGHT.name(), clearancetypeTempPo.getWeight()); 
			dataObject.setValue(ClearancetypeTempPo.COLUMNS.BAGFEE.name(), clearancetypeTempPo.getBagfee()); 
			dataObject.setValue(ClearancetypeTempPo.COLUMNS.FLIGHTNO.name(), clearancetypeTempPo.getFlightno()); 
			dataObject.setValue(ClearancetypeTempPo.COLUMNS.DECLTYPE.name(), clearancetypeTempPo.getDecltype()); 
			dataObject.setValue(ClearancetypeTempPo.COLUMNS.CLEARANCETYPE.name(), clearancetypeTempPo.getClearancetype()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ClearancetypeTempPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ClearancetypeTempPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(ClearancetypeTempPo.COLUMNS.MWB.name(), po.getMwb()); 
		sqlWhere.add(ClearancetypeTempPo.COLUMNS.HWB.name(), po.getHwb()); 
		return sqlWhere; 
	} 
 
} 
