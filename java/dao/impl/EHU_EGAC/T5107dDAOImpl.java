package com.doc.common.dao.impl; 
 
public class T5107dDAOImpl extends GeneralDAOImpl<T5107dPo> implements T5107dDAO { 
	public static final T5107dDAOImpl INSTANCE = new T5107dDAOImpl(); 
	public static final String TABLENAME = "T5107D"; 

	public T5107dDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<T5107dPo> CONVERTER = new MapConverter<T5107dPo>() { 
 
		@Override 
		public T5107dPo convert(final DataObject dataObject) { 
			final T5107dPo t5107dPo = new T5107dPo(); 
			t5107dPo.setDeclno(dataObject.getString(T5107dPo.COLUMNS.DECLNO.name())); 
			t5107dPo.setMwb(dataObject.getString(T5107dPo.COLUMNS.MWB.name())); 
			t5107dPo.setHwb(dataObject.getString(T5107dPo.COLUMNS.HWB.name())); 
			t5107dPo.setItemno(dataObject.getString(T5107dPo.COLUMNS.ITEMNO.name())); 
			t5107dPo.setRequiredcode1(dataObject.getString(T5107dPo.COLUMNS.REQUIREDCODE1.name())); 
			t5107dPo.setRequiredcode2(dataObject.getString(T5107dPo.COLUMNS.REQUIREDCODE2.name())); 
			t5107dPo.setRequiredcode3(dataObject.getString(T5107dPo.COLUMNS.REQUIREDCODE3.name())); 
			t5107dPo.setRequiredcode4(dataObject.getString(T5107dPo.COLUMNS.REQUIREDCODE4.name())); 
			t5107dPo.setRequiredcode5(dataObject.getString(T5107dPo.COLUMNS.REQUIREDCODE5.name())); 
			t5107dPo.setLastupdate(TimestampUtils.of(dataObject.getValue(T5107dPo.COLUMNS.LASTUPDATE.name()))); 
			t5107dPo.setRequiredcode6(dataObject.getString(T5107dPo.COLUMNS.REQUIREDCODE6.name())); 
			t5107dPo.setRequiredcode7(dataObject.getString(T5107dPo.COLUMNS.REQUIREDCODE7.name())); 
			t5107dPo.setRequiredcode8(dataObject.getString(T5107dPo.COLUMNS.REQUIREDCODE8.name())); 
			t5107dPo.setRequiredcode9(dataObject.getString(T5107dPo.COLUMNS.REQUIREDCODE9.name())); 
			return t5107dPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final T5107dPo t5107dPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(T5107dPo.COLUMNS.DECLNO.name(), t5107dPo.getDeclno()); 
			dataObject.setValue(T5107dPo.COLUMNS.MWB.name(), t5107dPo.getMwb()); 
			dataObject.setValue(T5107dPo.COLUMNS.HWB.name(), t5107dPo.getHwb()); 
			dataObject.setValue(T5107dPo.COLUMNS.ITEMNO.name(), t5107dPo.getItemno()); 
			dataObject.setValue(T5107dPo.COLUMNS.REQUIREDCODE1.name(), t5107dPo.getRequiredcode1()); 
			dataObject.setValue(T5107dPo.COLUMNS.REQUIREDCODE2.name(), t5107dPo.getRequiredcode2()); 
			dataObject.setValue(T5107dPo.COLUMNS.REQUIREDCODE3.name(), t5107dPo.getRequiredcode3()); 
			dataObject.setValue(T5107dPo.COLUMNS.REQUIREDCODE4.name(), t5107dPo.getRequiredcode4()); 
			dataObject.setValue(T5107dPo.COLUMNS.REQUIREDCODE5.name(), t5107dPo.getRequiredcode5()); 
			dataObject.setValue(T5107dPo.COLUMNS.LASTUPDATE.name(), t5107dPo.getLastupdate()); 
			dataObject.setValue(T5107dPo.COLUMNS.REQUIREDCODE6.name(), t5107dPo.getRequiredcode6()); 
			dataObject.setValue(T5107dPo.COLUMNS.REQUIREDCODE7.name(), t5107dPo.getRequiredcode7()); 
			dataObject.setValue(T5107dPo.COLUMNS.REQUIREDCODE8.name(), t5107dPo.getRequiredcode8()); 
			dataObject.setValue(T5107dPo.COLUMNS.REQUIREDCODE9.name(), t5107dPo.getRequiredcode9()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<T5107dPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(T5107dPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
