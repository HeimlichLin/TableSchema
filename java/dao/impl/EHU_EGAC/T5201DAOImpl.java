package com.doc.common.dao.impl; 
 
public class T5201DAOImpl extends GeneralDAOImpl<T5201Po> implements T5201DAO { 
	public static final T5201DAOImpl INSTANCE = new T5201DAOImpl(); 
	public static final String TABLENAME = "T5201"; 

	public T5201DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<T5201Po> CONVERTER = new MapConverter<T5201Po>() { 
 
		@Override 
		public T5201Po convert(final DataObject dataObject) { 
			final T5201Po t5201Po = new T5201Po(); 
			t5201Po.setControlno(dataObject.getString(T5201Po.COLUMNS.CONTROLNO.name())); 
			t5201Po.setMwb(dataObject.getString(T5201Po.COLUMNS.MWB.name())); 
			t5201Po.setHwb(dataObject.getString(T5201Po.COLUMNS.HWB.name())); 
			t5201Po.setTtype(dataObject.getString(T5201Po.COLUMNS.TTYPE.name())); 
			t5201Po.setMwbpiece(dataObject.getString(T5201Po.COLUMNS.MWBPIECE.name())); 
			t5201Po.setHwbpiece(dataObject.getString(T5201Po.COLUMNS.HWBPIECE.name())); 
			t5201Po.setWeight(dataObject.getString(T5201Po.COLUMNS.WEIGHT.name())); 
			t5201Po.setUnit(dataObject.getString(T5201Po.COLUMNS.UNIT.name())); 
			t5201Po.setGcidate(dataObject.getString(T5201Po.COLUMNS.GCIDATE.name())); 
			t5201Po.setGcitime(dataObject.getString(T5201Po.COLUMNS.GCITIME.name())); 
			t5201Po.setWarehouseno(dataObject.getString(T5201Po.COLUMNS.WAREHOUSENO.name())); 
			t5201Po.setStorage(dataObject.getString(T5201Po.COLUMNS.STORAGE.name())); 
			t5201Po.setStoragearea(dataObject.getString(T5201Po.COLUMNS.STORAGEAREA.name())); 
			t5201Po.setIndicator(dataObject.getString(T5201Po.COLUMNS.INDICATOR.name())); 
			t5201Po.setSenderid(dataObject.getString(T5201Po.COLUMNS.SENDERID.name())); 
			t5201Po.setSenderqualifier(dataObject.getString(T5201Po.COLUMNS.SENDERQUALIFIER.name())); 
			t5201Po.setReceiverid(dataObject.getString(T5201Po.COLUMNS.RECEIVERID.name())); 
			t5201Po.setReceiverqualifier(dataObject.getString(T5201Po.COLUMNS.RECEIVERQUALIFIER.name())); 
			t5201Po.setDecltype(dataObject.getString(T5201Po.COLUMNS.DECLTYPE.name())); 
			t5201Po.setBriefnote(dataObject.getString(T5201Po.COLUMNS.BRIEFNOTE.name())); 
			t5201Po.setSendstatus(dataObject.getString(T5201Po.COLUMNS.SENDSTATUS.name())); 
			return t5201Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final T5201Po t5201Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(T5201Po.COLUMNS.CONTROLNO.name(), t5201Po.getControlno()); 
			dataObject.setValue(T5201Po.COLUMNS.MWB.name(), t5201Po.getMwb()); 
			dataObject.setValue(T5201Po.COLUMNS.HWB.name(), t5201Po.getHwb()); 
			dataObject.setValue(T5201Po.COLUMNS.TTYPE.name(), t5201Po.getTtype()); 
			dataObject.setValue(T5201Po.COLUMNS.MWBPIECE.name(), t5201Po.getMwbpiece()); 
			dataObject.setValue(T5201Po.COLUMNS.HWBPIECE.name(), t5201Po.getHwbpiece()); 
			dataObject.setValue(T5201Po.COLUMNS.WEIGHT.name(), t5201Po.getWeight()); 
			dataObject.setValue(T5201Po.COLUMNS.UNIT.name(), t5201Po.getUnit()); 
			dataObject.setValue(T5201Po.COLUMNS.GCIDATE.name(), t5201Po.getGcidate()); 
			dataObject.setValue(T5201Po.COLUMNS.GCITIME.name(), t5201Po.getGcitime()); 
			dataObject.setValue(T5201Po.COLUMNS.WAREHOUSENO.name(), t5201Po.getWarehouseno()); 
			dataObject.setValue(T5201Po.COLUMNS.STORAGE.name(), t5201Po.getStorage()); 
			dataObject.setValue(T5201Po.COLUMNS.STORAGEAREA.name(), t5201Po.getStoragearea()); 
			dataObject.setValue(T5201Po.COLUMNS.INDICATOR.name(), t5201Po.getIndicator()); 
			dataObject.setValue(T5201Po.COLUMNS.SENDERID.name(), t5201Po.getSenderid()); 
			dataObject.setValue(T5201Po.COLUMNS.SENDERQUALIFIER.name(), t5201Po.getSenderqualifier()); 
			dataObject.setValue(T5201Po.COLUMNS.RECEIVERID.name(), t5201Po.getReceiverid()); 
			dataObject.setValue(T5201Po.COLUMNS.RECEIVERQUALIFIER.name(), t5201Po.getReceiverqualifier()); 
			dataObject.setValue(T5201Po.COLUMNS.DECLTYPE.name(), t5201Po.getDecltype()); 
			dataObject.setValue(T5201Po.COLUMNS.BRIEFNOTE.name(), t5201Po.getBriefnote()); 
			dataObject.setValue(T5201Po.COLUMNS.SENDSTATUS.name(), t5201Po.getSendstatus()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<T5201Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(T5201Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
