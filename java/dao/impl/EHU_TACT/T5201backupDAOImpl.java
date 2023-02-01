package com.doc.common.dao.impl; 
 
public class T5201backupDAOImpl extends GeneralDAOImpl<T5201backupPo> implements T5201backupDAO { 
	public static final T5201backupDAOImpl INSTANCE = new T5201backupDAOImpl(); 
	public static final String TABLENAME = "T5201BACKUP"; 

	public T5201backupDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<T5201backupPo> CONVERTER = new MapConverter<T5201backupPo>() { 
 
		@Override 
		public T5201backupPo convert(final DataObject dataObject) { 
			final T5201backupPo t5201backupPo = new T5201backupPo(); 
			t5201backupPo.setControlno(dataObject.getString(T5201backupPo.COLUMNS.CONTROLNO.name())); 
			t5201backupPo.setMwb(dataObject.getString(T5201backupPo.COLUMNS.MWB.name())); 
			t5201backupPo.setHwb(dataObject.getString(T5201backupPo.COLUMNS.HWB.name())); 
			t5201backupPo.setTtype(dataObject.getString(T5201backupPo.COLUMNS.TTYPE.name())); 
			t5201backupPo.setMwbpiece(dataObject.getString(T5201backupPo.COLUMNS.MWBPIECE.name())); 
			t5201backupPo.setHwbpiece(dataObject.getString(T5201backupPo.COLUMNS.HWBPIECE.name())); 
			t5201backupPo.setWeight(dataObject.getString(T5201backupPo.COLUMNS.WEIGHT.name())); 
			t5201backupPo.setUnit(dataObject.getString(T5201backupPo.COLUMNS.UNIT.name())); 
			t5201backupPo.setGcidate(dataObject.getString(T5201backupPo.COLUMNS.GCIDATE.name())); 
			t5201backupPo.setGcitime(dataObject.getString(T5201backupPo.COLUMNS.GCITIME.name())); 
			t5201backupPo.setWarehouseno(dataObject.getString(T5201backupPo.COLUMNS.WAREHOUSENO.name())); 
			t5201backupPo.setStorage(dataObject.getString(T5201backupPo.COLUMNS.STORAGE.name())); 
			t5201backupPo.setStoragearea(dataObject.getString(T5201backupPo.COLUMNS.STORAGEAREA.name())); 
			t5201backupPo.setIndicator(dataObject.getString(T5201backupPo.COLUMNS.INDICATOR.name())); 
			t5201backupPo.setSenderid(dataObject.getString(T5201backupPo.COLUMNS.SENDERID.name())); 
			t5201backupPo.setSenderqualifier(dataObject.getString(T5201backupPo.COLUMNS.SENDERQUALIFIER.name())); 
			t5201backupPo.setReceiverid(dataObject.getString(T5201backupPo.COLUMNS.RECEIVERID.name())); 
			t5201backupPo.setReceiverqualifier(dataObject.getString(T5201backupPo.COLUMNS.RECEIVERQUALIFIER.name())); 
			t5201backupPo.setDecltype(dataObject.getString(T5201backupPo.COLUMNS.DECLTYPE.name())); 
			t5201backupPo.setTypecode(dataObject.getString(T5201backupPo.COLUMNS.TYPECODE.name())); 
			t5201backupPo.setWarehouseban(dataObject.getString(T5201backupPo.COLUMNS.WAREHOUSEBAN.name())); 
			t5201backupPo.setIdentitycode(dataObject.getString(T5201backupPo.COLUMNS.IDENTITYCODE.name())); 
			return t5201backupPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final T5201backupPo t5201backupPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(T5201backupPo.COLUMNS.CONTROLNO.name(), t5201backupPo.getControlno()); 
			dataObject.setValue(T5201backupPo.COLUMNS.MWB.name(), t5201backupPo.getMwb()); 
			dataObject.setValue(T5201backupPo.COLUMNS.HWB.name(), t5201backupPo.getHwb()); 
			dataObject.setValue(T5201backupPo.COLUMNS.TTYPE.name(), t5201backupPo.getTtype()); 
			dataObject.setValue(T5201backupPo.COLUMNS.MWBPIECE.name(), t5201backupPo.getMwbpiece()); 
			dataObject.setValue(T5201backupPo.COLUMNS.HWBPIECE.name(), t5201backupPo.getHwbpiece()); 
			dataObject.setValue(T5201backupPo.COLUMNS.WEIGHT.name(), t5201backupPo.getWeight()); 
			dataObject.setValue(T5201backupPo.COLUMNS.UNIT.name(), t5201backupPo.getUnit()); 
			dataObject.setValue(T5201backupPo.COLUMNS.GCIDATE.name(), t5201backupPo.getGcidate()); 
			dataObject.setValue(T5201backupPo.COLUMNS.GCITIME.name(), t5201backupPo.getGcitime()); 
			dataObject.setValue(T5201backupPo.COLUMNS.WAREHOUSENO.name(), t5201backupPo.getWarehouseno()); 
			dataObject.setValue(T5201backupPo.COLUMNS.STORAGE.name(), t5201backupPo.getStorage()); 
			dataObject.setValue(T5201backupPo.COLUMNS.STORAGEAREA.name(), t5201backupPo.getStoragearea()); 
			dataObject.setValue(T5201backupPo.COLUMNS.INDICATOR.name(), t5201backupPo.getIndicator()); 
			dataObject.setValue(T5201backupPo.COLUMNS.SENDERID.name(), t5201backupPo.getSenderid()); 
			dataObject.setValue(T5201backupPo.COLUMNS.SENDERQUALIFIER.name(), t5201backupPo.getSenderqualifier()); 
			dataObject.setValue(T5201backupPo.COLUMNS.RECEIVERID.name(), t5201backupPo.getReceiverid()); 
			dataObject.setValue(T5201backupPo.COLUMNS.RECEIVERQUALIFIER.name(), t5201backupPo.getReceiverqualifier()); 
			dataObject.setValue(T5201backupPo.COLUMNS.DECLTYPE.name(), t5201backupPo.getDecltype()); 
			dataObject.setValue(T5201backupPo.COLUMNS.TYPECODE.name(), t5201backupPo.getTypecode()); 
			dataObject.setValue(T5201backupPo.COLUMNS.WAREHOUSEBAN.name(), t5201backupPo.getWarehouseban()); 
			dataObject.setValue(T5201backupPo.COLUMNS.IDENTITYCODE.name(), t5201backupPo.getIdentitycode()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<T5201backupPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(T5201backupPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
