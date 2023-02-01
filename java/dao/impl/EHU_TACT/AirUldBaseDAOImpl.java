package com.doc.common.dao.impl; 
 
public class AirUldBaseDAOImpl extends GeneralDAOImpl<AirUldBasePo> implements AirUldBaseDAO { 
	public static final AirUldBaseDAOImpl INSTANCE = new AirUldBaseDAOImpl(); 
	public static final String TABLENAME = "AIR_ULD_BASE"; 

	public AirUldBaseDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<AirUldBasePo> CONVERTER = new MapConverter<AirUldBasePo>() { 
 
		@Override 
		public AirUldBasePo convert(final DataObject dataObject) { 
			final AirUldBasePo airUldBasePo = new AirUldBasePo(); 
			airUldBasePo.setUldCodeBase(dataObject.getString(AirUldBasePo.COLUMNS.ULD_CODE_BASE.name())); 
			airUldBasePo.setUldSizeDscr(dataObject.getString(AirUldBasePo.COLUMNS.ULD_SIZE_DSCR.name())); 
			airUldBasePo.setConvertVol(BigDecimalUtils.formObj(dataObject.getValue(AirUldBasePo.COLUMNS.CONVERT_VOL.name()))); 
			airUldBasePo.setUpdUser(dataObject.getString(AirUldBasePo.COLUMNS.UPD_USER.name())); 
			airUldBasePo.setUpdDate(TimestampUtils.of(dataObject.getValue(AirUldBasePo.COLUMNS.UPD_DATE.name()))); 
			airUldBasePo.setUldType(dataObject.getString(AirUldBasePo.COLUMNS.ULD_TYPE.name())); 
			airUldBasePo.setMaxLoad(BigDecimalUtils.formObj(dataObject.getValue(AirUldBasePo.COLUMNS.MAX_LOAD.name()))); 
			airUldBasePo.setDscr(dataObject.getString(AirUldBasePo.COLUMNS.DSCR.name())); 
			airUldBasePo.setPeSize(dataObject.getString(AirUldBasePo.COLUMNS.PE_SIZE.name())); 
			return airUldBasePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final AirUldBasePo airUldBasePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(AirUldBasePo.COLUMNS.ULD_CODE_BASE.name(), airUldBasePo.getUldCodeBase()); 
			dataObject.setValue(AirUldBasePo.COLUMNS.ULD_SIZE_DSCR.name(), airUldBasePo.getUldSizeDscr()); 
			dataObject.setValue(AirUldBasePo.COLUMNS.CONVERT_VOL.name(), airUldBasePo.getConvertVol()); 
			dataObject.setValue(AirUldBasePo.COLUMNS.UPD_USER.name(), airUldBasePo.getUpdUser()); 
			dataObject.setValue(AirUldBasePo.COLUMNS.UPD_DATE.name(), airUldBasePo.getUpdDate()); 
			dataObject.setValue(AirUldBasePo.COLUMNS.ULD_TYPE.name(), airUldBasePo.getUldType()); 
			dataObject.setValue(AirUldBasePo.COLUMNS.MAX_LOAD.name(), airUldBasePo.getMaxLoad()); 
			dataObject.setValue(AirUldBasePo.COLUMNS.DSCR.name(), airUldBasePo.getDscr()); 
			dataObject.setValue(AirUldBasePo.COLUMNS.PE_SIZE.name(), airUldBasePo.getPeSize()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<AirUldBasePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(AirUldBasePo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
