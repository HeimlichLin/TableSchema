package com.doc.common.dao.impl; 
 
public class T5201bakDAOImpl extends GeneralDAOImpl<T5201bakPo> implements T5201bakDAO { 
	public static final T5201bakDAOImpl INSTANCE = new T5201bakDAOImpl(); 
	public static final String TABLENAME = "T5201BAK"; 

	public T5201bakDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<T5201bakPo> CONVERTER = new MapConverter<T5201bakPo>() { 
 
		@Override 
		public T5201bakPo convert(final DataObject dataObject) { 
			final T5201bakPo t5201bakPo = new T5201bakPo(); 
			t5201bakPo.setControlno(dataObject.getString(T5201bakPo.COLUMNS.CONTROLNO.name())); 
			t5201bakPo.setMwb(dataObject.getString(T5201bakPo.COLUMNS.MWB.name())); 
			t5201bakPo.setHwb(dataObject.getString(T5201bakPo.COLUMNS.HWB.name())); 
			t5201bakPo.setTtype(dataObject.getString(T5201bakPo.COLUMNS.TTYPE.name())); 
			t5201bakPo.setMwbpiece(dataObject.getString(T5201bakPo.COLUMNS.MWBPIECE.name())); 
			t5201bakPo.setHwbpiece(dataObject.getString(T5201bakPo.COLUMNS.HWBPIECE.name())); 
			t5201bakPo.setWeight(dataObject.getString(T5201bakPo.COLUMNS.WEIGHT.name())); 
			t5201bakPo.setUnit(dataObject.getString(T5201bakPo.COLUMNS.UNIT.name())); 
			t5201bakPo.setGcidate(dataObject.getString(T5201bakPo.COLUMNS.GCIDATE.name())); 
			t5201bakPo.setGcitime(dataObject.getString(T5201bakPo.COLUMNS.GCITIME.name())); 
			t5201bakPo.setWarehouseno(dataObject.getString(T5201bakPo.COLUMNS.WAREHOUSENO.name())); 
			t5201bakPo.setStorage(dataObject.getString(T5201bakPo.COLUMNS.STORAGE.name())); 
			t5201bakPo.setStoragearea(dataObject.getString(T5201bakPo.COLUMNS.STORAGEAREA.name())); 
			t5201bakPo.setIndicator(dataObject.getString(T5201bakPo.COLUMNS.INDICATOR.name())); 
			t5201bakPo.setSenderid(dataObject.getString(T5201bakPo.COLUMNS.SENDERID.name())); 
			t5201bakPo.setSenderqualifier(dataObject.getString(T5201bakPo.COLUMNS.SENDERQUALIFIER.name())); 
			t5201bakPo.setReceiverid(dataObject.getString(T5201bakPo.COLUMNS.RECEIVERID.name())); 
			t5201bakPo.setReceiverqualifier(dataObject.getString(T5201bakPo.COLUMNS.RECEIVERQUALIFIER.name())); 
			t5201bakPo.setDecltype(dataObject.getString(T5201bakPo.COLUMNS.DECLTYPE.name())); 
			t5201bakPo.setTypecode(dataObject.getString(T5201bakPo.COLUMNS.TYPECODE.name())); 
			t5201bakPo.setWarehouseban(dataObject.getString(T5201bakPo.COLUMNS.WAREHOUSEBAN.name())); 
			t5201bakPo.setIdentitycode(dataObject.getString(T5201bakPo.COLUMNS.IDENTITYCODE.name())); 
			return t5201bakPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final T5201bakPo t5201bakPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(T5201bakPo.COLUMNS.CONTROLNO.name(), t5201bakPo.getControlno()); 
			dataObject.setValue(T5201bakPo.COLUMNS.MWB.name(), t5201bakPo.getMwb()); 
			dataObject.setValue(T5201bakPo.COLUMNS.HWB.name(), t5201bakPo.getHwb()); 
			dataObject.setValue(T5201bakPo.COLUMNS.TTYPE.name(), t5201bakPo.getTtype()); 
			dataObject.setValue(T5201bakPo.COLUMNS.MWBPIECE.name(), t5201bakPo.getMwbpiece()); 
			dataObject.setValue(T5201bakPo.COLUMNS.HWBPIECE.name(), t5201bakPo.getHwbpiece()); 
			dataObject.setValue(T5201bakPo.COLUMNS.WEIGHT.name(), t5201bakPo.getWeight()); 
			dataObject.setValue(T5201bakPo.COLUMNS.UNIT.name(), t5201bakPo.getUnit()); 
			dataObject.setValue(T5201bakPo.COLUMNS.GCIDATE.name(), t5201bakPo.getGcidate()); 
			dataObject.setValue(T5201bakPo.COLUMNS.GCITIME.name(), t5201bakPo.getGcitime()); 
			dataObject.setValue(T5201bakPo.COLUMNS.WAREHOUSENO.name(), t5201bakPo.getWarehouseno()); 
			dataObject.setValue(T5201bakPo.COLUMNS.STORAGE.name(), t5201bakPo.getStorage()); 
			dataObject.setValue(T5201bakPo.COLUMNS.STORAGEAREA.name(), t5201bakPo.getStoragearea()); 
			dataObject.setValue(T5201bakPo.COLUMNS.INDICATOR.name(), t5201bakPo.getIndicator()); 
			dataObject.setValue(T5201bakPo.COLUMNS.SENDERID.name(), t5201bakPo.getSenderid()); 
			dataObject.setValue(T5201bakPo.COLUMNS.SENDERQUALIFIER.name(), t5201bakPo.getSenderqualifier()); 
			dataObject.setValue(T5201bakPo.COLUMNS.RECEIVERID.name(), t5201bakPo.getReceiverid()); 
			dataObject.setValue(T5201bakPo.COLUMNS.RECEIVERQUALIFIER.name(), t5201bakPo.getReceiverqualifier()); 
			dataObject.setValue(T5201bakPo.COLUMNS.DECLTYPE.name(), t5201bakPo.getDecltype()); 
			dataObject.setValue(T5201bakPo.COLUMNS.TYPECODE.name(), t5201bakPo.getTypecode()); 
			dataObject.setValue(T5201bakPo.COLUMNS.WAREHOUSEBAN.name(), t5201bakPo.getWarehouseban()); 
			dataObject.setValue(T5201bakPo.COLUMNS.IDENTITYCODE.name(), t5201bakPo.getIdentitycode()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<T5201bakPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(T5201bakPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
