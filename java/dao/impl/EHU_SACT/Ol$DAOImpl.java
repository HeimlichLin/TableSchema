package com.doc.common.dao.impl; 
 
public class Ol$DAOImpl extends GeneralDAOImpl<Ol$Po> implements IOl$DAO { 
	public static final Ol$DAOImpl INSTANCE = new Ol$DAOImpl(); 
	public static final String TABLENAME = "OL$"; 

	public Ol$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Ol$Po> CONVERTER = new MapConverter<Ol$Po>() { 
 
		@Override 
		public Ol$Po convert(final DataObject dataObject) { 
			final Ol$Po ol$Po = new Ol$Po(); 
			ol$Po.setOlName(dataObject.getString(Ol$Po.COLUMNS.OL_NAME.name())); 
			ol$Po.setSqlText(); 
			ol$Po.setTextlen(BigDecimalUtils.formObj(dataObject.getValue(Ol$Po.COLUMNS.TEXTLEN.name()))); 
			ol$Po.setSignature(); 
			ol$Po.setHashValue(BigDecimalUtils.formObj(dataObject.getValue(Ol$Po.COLUMNS.HASH_VALUE.name()))); 
			ol$Po.setHashValue2(BigDecimalUtils.formObj(dataObject.getValue(Ol$Po.COLUMNS.HASH_VALUE2.name()))); 
			ol$Po.setCategory(dataObject.getString(Ol$Po.COLUMNS.CATEGORY.name())); 
			ol$Po.setVersion(dataObject.getString(Ol$Po.COLUMNS.VERSION.name())); 
			ol$Po.setCreator(dataObject.getString(Ol$Po.COLUMNS.CREATOR.name())); 
			ol$Po.setTimestamp(TimestampUtils.of(dataObject.getValue(Ol$Po.COLUMNS.TIMESTAMP.name()))); 
			ol$Po.setFlags(BigDecimalUtils.formObj(dataObject.getValue(Ol$Po.COLUMNS.FLAGS.name()))); 
			ol$Po.setHintcount(BigDecimalUtils.formObj(dataObject.getValue(Ol$Po.COLUMNS.HINTCOUNT.name()))); 
			ol$Po.setSpare1(BigDecimalUtils.formObj(dataObject.getValue(Ol$Po.COLUMNS.SPARE1.name()))); 
			ol$Po.setSpare2(dataObject.getString(Ol$Po.COLUMNS.SPARE2.name())); 
			return ol$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Ol$Po ol$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Ol$Po.COLUMNS.OL_NAME.name(), ol$Po.getOlName()); 
			dataObject.setValue(Ol$Po.COLUMNS.SQL_TEXT.name(), ol$Po.getSqlText()); 
			dataObject.setValue(Ol$Po.COLUMNS.TEXTLEN.name(), ol$Po.getTextlen()); 
			dataObject.setValue(Ol$Po.COLUMNS.SIGNATURE.name(), ol$Po.getSignature()); 
			dataObject.setValue(Ol$Po.COLUMNS.HASH_VALUE.name(), ol$Po.getHashValue()); 
			dataObject.setValue(Ol$Po.COLUMNS.HASH_VALUE2.name(), ol$Po.getHashValue2()); 
			dataObject.setValue(Ol$Po.COLUMNS.CATEGORY.name(), ol$Po.getCategory()); 
			dataObject.setValue(Ol$Po.COLUMNS.VERSION.name(), ol$Po.getVersion()); 
			dataObject.setValue(Ol$Po.COLUMNS.CREATOR.name(), ol$Po.getCreator()); 
			dataObject.setValue(Ol$Po.COLUMNS.TIMESTAMP.name(), ol$Po.getTimestamp()); 
			dataObject.setValue(Ol$Po.COLUMNS.FLAGS.name(), ol$Po.getFlags()); 
			dataObject.setValue(Ol$Po.COLUMNS.HINTCOUNT.name(), ol$Po.getHintcount()); 
			dataObject.setValue(Ol$Po.COLUMNS.SPARE1.name(), ol$Po.getSpare1()); 
			dataObject.setValue(Ol$Po.COLUMNS.SPARE2.name(), ol$Po.getSpare2()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Ol$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Ol$Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
