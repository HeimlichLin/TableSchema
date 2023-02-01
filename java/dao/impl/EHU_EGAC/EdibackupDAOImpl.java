package com.doc.common.dao.impl; 
 
public class EdibackupDAOImpl extends GeneralDAOImpl<EdibackupPo> implements EdibackupDAO { 
	public static final EdibackupDAOImpl INSTANCE = new EdibackupDAOImpl(); 
	public static final String TABLENAME = "EDIBACKUP"; 

	public EdibackupDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<EdibackupPo> CONVERTER = new MapConverter<EdibackupPo>() { 
 
		@Override 
		public EdibackupPo convert(final DataObject dataObject) { 
			final EdibackupPo edibackupPo = new EdibackupPo(); 
			edibackupPo.setControlno(dataObject.getString(EdibackupPo.COLUMNS.CONTROLNO.name())); 
			edibackupPo.setDeclno(dataObject.getString(EdibackupPo.COLUMNS.DECLNO.name())); 
			edibackupPo.setMwb(dataObject.getString(EdibackupPo.COLUMNS.MWB.name())); 
			edibackupPo.setHwb(dataObject.getString(EdibackupPo.COLUMNS.HWB.name())); 
			edibackupPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(EdibackupPo.COLUMNS.PIECE.name()))); 
			edibackupPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(EdibackupPo.COLUMNS.WEIGHT.name()))); 
			edibackupPo.setReleasedate(dataObject.getString(EdibackupPo.COLUMNS.RELEASEDATE.name())); 
			edibackupPo.setReleasetime(dataObject.getString(EdibackupPo.COLUMNS.RELEASETIME.name())); 
			edibackupPo.setLastupdate(TimestampUtils.of(dataObject.getValue(EdibackupPo.COLUMNS.LASTUPDATE.name()))); 
			edibackupPo.setClearancetype(dataObject.getString(EdibackupPo.COLUMNS.CLEARANCETYPE.name())); 
			edibackupPo.setTranstype(dataObject.getString(EdibackupPo.COLUMNS.TRANSTYPE.name())); 
			edibackupPo.setMessagetype(dataObject.getString(EdibackupPo.COLUMNS.MESSAGETYPE.name())); 
			edibackupPo.setDutyno(dataObject.getString(EdibackupPo.COLUMNS.DUTYNO.name())); 
			edibackupPo.setIe(dataObject.getString(EdibackupPo.COLUMNS.IE.name())); 
			edibackupPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(EdibackupPo.COLUMNS.GCIWEIGHT.name()))); 
			edibackupPo.setDutypayment(dataObject.getString(EdibackupPo.COLUMNS.DUTYPAYMENT.name())); 
			return edibackupPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final EdibackupPo edibackupPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(EdibackupPo.COLUMNS.CONTROLNO.name(), edibackupPo.getControlno()); 
			dataObject.setValue(EdibackupPo.COLUMNS.DECLNO.name(), edibackupPo.getDeclno()); 
			dataObject.setValue(EdibackupPo.COLUMNS.MWB.name(), edibackupPo.getMwb()); 
			dataObject.setValue(EdibackupPo.COLUMNS.HWB.name(), edibackupPo.getHwb()); 
			dataObject.setValue(EdibackupPo.COLUMNS.PIECE.name(), edibackupPo.getPiece()); 
			dataObject.setValue(EdibackupPo.COLUMNS.WEIGHT.name(), edibackupPo.getWeight()); 
			dataObject.setValue(EdibackupPo.COLUMNS.RELEASEDATE.name(), edibackupPo.getReleasedate()); 
			dataObject.setValue(EdibackupPo.COLUMNS.RELEASETIME.name(), edibackupPo.getReleasetime()); 
			dataObject.setValue(EdibackupPo.COLUMNS.LASTUPDATE.name(), edibackupPo.getLastupdate()); 
			dataObject.setValue(EdibackupPo.COLUMNS.CLEARANCETYPE.name(), edibackupPo.getClearancetype()); 
			dataObject.setValue(EdibackupPo.COLUMNS.TRANSTYPE.name(), edibackupPo.getTranstype()); 
			dataObject.setValue(EdibackupPo.COLUMNS.MESSAGETYPE.name(), edibackupPo.getMessagetype()); 
			dataObject.setValue(EdibackupPo.COLUMNS.DUTYNO.name(), edibackupPo.getDutyno()); 
			dataObject.setValue(EdibackupPo.COLUMNS.IE.name(), edibackupPo.getIe()); 
			dataObject.setValue(EdibackupPo.COLUMNS.GCIWEIGHT.name(), edibackupPo.getGciweight()); 
			dataObject.setValue(EdibackupPo.COLUMNS.DUTYPAYMENT.name(), edibackupPo.getDutypayment()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<EdibackupPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(EdibackupPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
