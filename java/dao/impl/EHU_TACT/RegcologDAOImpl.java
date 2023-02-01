package com.doc.common.dao.impl; 
 
public class RegcologDAOImpl extends GeneralDAOImpl<RegcologPo> implements RegcologDAO { 
	public static final RegcologDAOImpl INSTANCE = new RegcologDAOImpl(); 
	public static final String TABLENAME = "REGCOLOG"; 

	public RegcologDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<RegcologPo> CONVERTER = new MapConverter<RegcologPo>() { 
 
		@Override 
		public RegcologPo convert(final DataObject dataObject) { 
			final RegcologPo regcologPo = new RegcologPo(); 
			regcologPo.setBagno(dataObject.getString(RegcologPo.COLUMNS.BAGNO.name())); 
			regcologPo.setDeclno(dataObject.getString(RegcologPo.COLUMNS.DECLNO.name())); 
			regcologPo.setMwb(dataObject.getString(RegcologPo.COLUMNS.MWB.name())); 
			regcologPo.setHwb(dataObject.getString(RegcologPo.COLUMNS.HWB.name())); 
			regcologPo.setExpbagno(dataObject.getString(RegcologPo.COLUMNS.EXPBAGNO.name())); 
			regcologPo.setReason(dataObject.getString(RegcologPo.COLUMNS.REASON.name())); 
			regcologPo.setIe(dataObject.getString(RegcologPo.COLUMNS.IE.name())); 
			regcologPo.setPridate2(TimestampUtils.of(dataObject.getValue(RegcologPo.COLUMNS.PRIDATE2.name()))); 
			regcologPo.setPriuser(dataObject.getString(RegcologPo.COLUMNS.PRIUSER.name())); 
			regcologPo.setPriws(dataObject.getString(RegcologPo.COLUMNS.PRIWS.name())); 
			regcologPo.setRedate(TimestampUtils.of(dataObject.getValue(RegcologPo.COLUMNS.REDATE.name()))); 
			regcologPo.setReuser(dataObject.getString(RegcologPo.COLUMNS.REUSER.name())); 
			regcologPo.setRews(dataObject.getString(RegcologPo.COLUMNS.REWS.name())); 
			return regcologPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final RegcologPo regcologPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(RegcologPo.COLUMNS.BAGNO.name(), regcologPo.getBagno()); 
			dataObject.setValue(RegcologPo.COLUMNS.DECLNO.name(), regcologPo.getDeclno()); 
			dataObject.setValue(RegcologPo.COLUMNS.MWB.name(), regcologPo.getMwb()); 
			dataObject.setValue(RegcologPo.COLUMNS.HWB.name(), regcologPo.getHwb()); 
			dataObject.setValue(RegcologPo.COLUMNS.EXPBAGNO.name(), regcologPo.getExpbagno()); 
			dataObject.setValue(RegcologPo.COLUMNS.REASON.name(), regcologPo.getReason()); 
			dataObject.setValue(RegcologPo.COLUMNS.IE.name(), regcologPo.getIe()); 
			dataObject.setValue(RegcologPo.COLUMNS.PRIDATE2.name(), regcologPo.getPridate2()); 
			dataObject.setValue(RegcologPo.COLUMNS.PRIUSER.name(), regcologPo.getPriuser()); 
			dataObject.setValue(RegcologPo.COLUMNS.PRIWS.name(), regcologPo.getPriws()); 
			dataObject.setValue(RegcologPo.COLUMNS.REDATE.name(), regcologPo.getRedate()); 
			dataObject.setValue(RegcologPo.COLUMNS.REUSER.name(), regcologPo.getReuser()); 
			dataObject.setValue(RegcologPo.COLUMNS.REWS.name(), regcologPo.getRews()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<RegcologPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(RegcologPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
