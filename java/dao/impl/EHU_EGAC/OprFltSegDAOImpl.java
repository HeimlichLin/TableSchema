package com.doc.common.dao.impl; 
 
public class OprFltSegDAOImpl extends GeneralDAOImpl<OprFltSegPo> implements OprFltSegDAO { 
	public static final OprFltSegDAOImpl INSTANCE = new OprFltSegDAOImpl(); 
	public static final String TABLENAME = "OPR_FLT_SEG"; 

	public OprFltSegDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<OprFltSegPo> CONVERTER = new MapConverter<OprFltSegPo>() { 
 
		@Override 
		public OprFltSegPo convert(final DataObject dataObject) { 
			final OprFltSegPo oprFltSegPo = new OprFltSegPo(); 
			oprFltSegPo.setFsuType(dataObject.getString(OprFltSegPo.COLUMNS.FSU_TYPE.name())); 
			oprFltSegPo.setCodFltCar(dataObject.getString(OprFltSegPo.COLUMNS.COD_FLT_CAR.name())); 
			oprFltSegPo.setCodFltNum(dataObject.getString(OprFltSegPo.COLUMNS.COD_FLT_NUM.name())); 
			oprFltSegPo.setCodAptBrd(dataObject.getString(OprFltSegPo.COLUMNS.COD_APT_BRD.name())); 
			oprFltSegPo.setCodAptOff(dataObject.getString(OprFltSegPo.COLUMNS.COD_APT_OFF.name())); 
			oprFltSegPo.setSendActive(dataObject.getString(OprFltSegPo.COLUMNS.SEND_ACTIVE.name())); 
			oprFltSegPo.setCreateDate(TimestampUtils.of(dataObject.getValue(OprFltSegPo.COLUMNS.CREATE_DATE.name()))); 
			oprFltSegPo.setModetype(dataObject.getString(OprFltSegPo.COLUMNS.MODETYPE.name())); 
			return oprFltSegPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final OprFltSegPo oprFltSegPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(OprFltSegPo.COLUMNS.FSU_TYPE.name(), oprFltSegPo.getFsuType()); 
			dataObject.setValue(OprFltSegPo.COLUMNS.COD_FLT_CAR.name(), oprFltSegPo.getCodFltCar()); 
			dataObject.setValue(OprFltSegPo.COLUMNS.COD_FLT_NUM.name(), oprFltSegPo.getCodFltNum()); 
			dataObject.setValue(OprFltSegPo.COLUMNS.COD_APT_BRD.name(), oprFltSegPo.getCodAptBrd()); 
			dataObject.setValue(OprFltSegPo.COLUMNS.COD_APT_OFF.name(), oprFltSegPo.getCodAptOff()); 
			dataObject.setValue(OprFltSegPo.COLUMNS.SEND_ACTIVE.name(), oprFltSegPo.getSendActive()); 
			dataObject.setValue(OprFltSegPo.COLUMNS.CREATE_DATE.name(), oprFltSegPo.getCreateDate()); 
			dataObject.setValue(OprFltSegPo.COLUMNS.MODETYPE.name(), oprFltSegPo.getModetype()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<OprFltSegPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(OprFltSegPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
