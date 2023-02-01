package com.doc.common.dao.impl; 
 
public class AaaaaDAOImpl extends GeneralDAOImpl<AaaaaPo> implements AaaaaDAO { 
	public static final AaaaaDAOImpl INSTANCE = new AaaaaDAOImpl(); 
	public static final String TABLENAME = "AAAAA"; 

	public AaaaaDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<AaaaaPo> CONVERTER = new MapConverter<AaaaaPo>() { 
 
		@Override 
		public AaaaaPo convert(final DataObject dataObject) { 
			final AaaaaPo aaaaaPo = new AaaaaPo(); 
			aaaaaPo.setFf(dataObject.getString(AaaaaPo.COLUMNS.FF.name())); 
			aaaaaPo.setMwb(dataObject.getString(AaaaaPo.COLUMNS.MWB.name())); 
			aaaaaPo.setHwb(dataObject.getString(AaaaaPo.COLUMNS.HWB.name())); 
			aaaaaPo.setDeclnoOld(dataObject.getString(AaaaaPo.COLUMNS.DECLNO_OLD.name())); 
			aaaaaPo.setDecltypeOld(dataObject.getString(AaaaaPo.COLUMNS.DECLTYPE_OLD.name())); 
			aaaaaPo.setDeclnoNew(dataObject.getString(AaaaaPo.COLUMNS.DECLNO_NEW.name())); 
			aaaaaPo.setDecltypeNew(dataObject.getString(AaaaaPo.COLUMNS.DECLTYPE_NEW.name())); 
			aaaaaPo.setCrtDate(TimestampUtils.of(dataObject.getValue(AaaaaPo.COLUMNS.CRT_DATE.name()))); 
			aaaaaPo.setMemo(dataObject.getString(AaaaaPo.COLUMNS.MEMO.name())); 
			return aaaaaPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final AaaaaPo aaaaaPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(AaaaaPo.COLUMNS.FF.name(), aaaaaPo.getFf()); 
			dataObject.setValue(AaaaaPo.COLUMNS.MWB.name(), aaaaaPo.getMwb()); 
			dataObject.setValue(AaaaaPo.COLUMNS.HWB.name(), aaaaaPo.getHwb()); 
			dataObject.setValue(AaaaaPo.COLUMNS.DECLNO_OLD.name(), aaaaaPo.getDeclnoOld()); 
			dataObject.setValue(AaaaaPo.COLUMNS.DECLTYPE_OLD.name(), aaaaaPo.getDecltypeOld()); 
			dataObject.setValue(AaaaaPo.COLUMNS.DECLNO_NEW.name(), aaaaaPo.getDeclnoNew()); 
			dataObject.setValue(AaaaaPo.COLUMNS.DECLTYPE_NEW.name(), aaaaaPo.getDecltypeNew()); 
			dataObject.setValue(AaaaaPo.COLUMNS.CRT_DATE.name(), aaaaaPo.getCrtDate()); 
			dataObject.setValue(AaaaaPo.COLUMNS.MEMO.name(), aaaaaPo.getMemo()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<AaaaaPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(AaaaaPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
