package com.doc.common.dao.impl; 
 
public class Cmn06mDAOImpl extends GeneralDAOImpl<Cmn06mPo> implements Cmn06mDAO { 
	public static final Cmn06mDAOImpl INSTANCE = new Cmn06mDAOImpl(); 
	public static final String TABLENAME = "CMN06M"; 

	public Cmn06mDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Cmn06mPo> CONVERTER = new MapConverter<Cmn06mPo>() { 
 
		@Override 
		public Cmn06mPo convert(final DataObject dataObject) { 
			final Cmn06mPo cmn06mPo = new Cmn06mPo(); 
			cmn06mPo.setCmn06mDesAirport(dataObject.getString(Cmn06mPo.COLUMNS.CMN06M_DES_AIRPORT.name())); 
			cmn06mPo.setCmn06mArea(BigDecimalUtils.formObj(dataObject.getValue(Cmn06mPo.COLUMNS.CMN06M_AREA.name()))); 
			cmn06mPo.setCmn06mAreaCode(dataObject.getString(Cmn06mPo.COLUMNS.CMN06M_AREA_CODE.name())); 
			cmn06mPo.setCmn06mAreaName(dataObject.getString(Cmn06mPo.COLUMNS.CMN06M_AREA_NAME.name())); 
			cmn06mPo.setCmn06mAreaState(dataObject.getString(Cmn06mPo.COLUMNS.CMN06M_AREA_STATE.name())); 
			return cmn06mPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Cmn06mPo cmn06mPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Cmn06mPo.COLUMNS.CMN06M_DES_AIRPORT.name(), cmn06mPo.getCmn06mDesAirport()); 
			dataObject.setValue(Cmn06mPo.COLUMNS.CMN06M_AREA.name(), cmn06mPo.getCmn06mArea()); 
			dataObject.setValue(Cmn06mPo.COLUMNS.CMN06M_AREA_CODE.name(), cmn06mPo.getCmn06mAreaCode()); 
			dataObject.setValue(Cmn06mPo.COLUMNS.CMN06M_AREA_NAME.name(), cmn06mPo.getCmn06mAreaName()); 
			dataObject.setValue(Cmn06mPo.COLUMNS.CMN06M_AREA_STATE.name(), cmn06mPo.getCmn06mAreaState()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Cmn06mPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Cmn06mPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
