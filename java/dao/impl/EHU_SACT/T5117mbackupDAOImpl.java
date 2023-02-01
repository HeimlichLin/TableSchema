package com.doc.common.dao.impl; 
 
public class T5117mbackupDAOImpl extends GeneralDAOImpl<T5117mbackupPo> implements T5117mbackupDAO { 
	public static final T5117mbackupDAOImpl INSTANCE = new T5117mbackupDAOImpl(); 
	public static final String TABLENAME = "T5117MBACKUP"; 

	public T5117mbackupDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<T5117mbackupPo> CONVERTER = new MapConverter<T5117mbackupPo>() { 
 
		@Override 
		public T5117mbackupPo convert(final DataObject dataObject) { 
			final T5117mbackupPo t5117mbackupPo = new T5117mbackupPo(); 
			t5117mbackupPo.setControlno(dataObject.getString(T5117mbackupPo.COLUMNS.CONTROLNO.name())); 
			t5117mbackupPo.setGcodate(dataObject.getString(T5117mbackupPo.COLUMNS.GCODATE.name())); 
			t5117mbackupPo.setWarehouseno(dataObject.getString(T5117mbackupPo.COLUMNS.WAREHOUSENO.name())); 
			t5117mbackupPo.setSenderid(dataObject.getString(T5117mbackupPo.COLUMNS.SENDERID.name())); 
			t5117mbackupPo.setSenderqualifier(dataObject.getString(T5117mbackupPo.COLUMNS.SENDERQUALIFIER.name())); 
			t5117mbackupPo.setReceiverid(dataObject.getString(T5117mbackupPo.COLUMNS.RECEIVERID.name())); 
			t5117mbackupPo.setReceiverqualifier(dataObject.getString(T5117mbackupPo.COLUMNS.RECEIVERQUALIFIER.name())); 
			t5117mbackupPo.setDecltype(dataObject.getString(T5117mbackupPo.COLUMNS.DECLTYPE.name())); 
			t5117mbackupPo.setIe(dataObject.getString(T5117mbackupPo.COLUMNS.IE.name())); 
			t5117mbackupPo.setTtype(dataObject.getString(T5117mbackupPo.COLUMNS.TTYPE.name())); 
			t5117mbackupPo.setBriefnote(dataObject.getString(T5117mbackupPo.COLUMNS.BRIEFNOTE.name())); 
			return t5117mbackupPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final T5117mbackupPo t5117mbackupPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(T5117mbackupPo.COLUMNS.CONTROLNO.name(), t5117mbackupPo.getControlno()); 
			dataObject.setValue(T5117mbackupPo.COLUMNS.GCODATE.name(), t5117mbackupPo.getGcodate()); 
			dataObject.setValue(T5117mbackupPo.COLUMNS.WAREHOUSENO.name(), t5117mbackupPo.getWarehouseno()); 
			dataObject.setValue(T5117mbackupPo.COLUMNS.SENDERID.name(), t5117mbackupPo.getSenderid()); 
			dataObject.setValue(T5117mbackupPo.COLUMNS.SENDERQUALIFIER.name(), t5117mbackupPo.getSenderqualifier()); 
			dataObject.setValue(T5117mbackupPo.COLUMNS.RECEIVERID.name(), t5117mbackupPo.getReceiverid()); 
			dataObject.setValue(T5117mbackupPo.COLUMNS.RECEIVERQUALIFIER.name(), t5117mbackupPo.getReceiverqualifier()); 
			dataObject.setValue(T5117mbackupPo.COLUMNS.DECLTYPE.name(), t5117mbackupPo.getDecltype()); 
			dataObject.setValue(T5117mbackupPo.COLUMNS.IE.name(), t5117mbackupPo.getIe()); 
			dataObject.setValue(T5117mbackupPo.COLUMNS.TTYPE.name(), t5117mbackupPo.getTtype()); 
			dataObject.setValue(T5117mbackupPo.COLUMNS.BRIEFNOTE.name(), t5117mbackupPo.getBriefnote()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<T5117mbackupPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(T5117mbackupPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
