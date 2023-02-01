package com.doc.common.dao.impl; 
 
public class T5117mDAOImpl extends GeneralDAOImpl<T5117mPo> implements T5117mDAO { 
	public static final T5117mDAOImpl INSTANCE = new T5117mDAOImpl(); 
	public static final String TABLENAME = "T5117M"; 

	public T5117mDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<T5117mPo> CONVERTER = new MapConverter<T5117mPo>() { 
 
		@Override 
		public T5117mPo convert(final DataObject dataObject) { 
			final T5117mPo t5117mPo = new T5117mPo(); 
			t5117mPo.setControlno(dataObject.getString(T5117mPo.COLUMNS.CONTROLNO.name())); 
			t5117mPo.setGcodate(dataObject.getString(T5117mPo.COLUMNS.GCODATE.name())); 
			t5117mPo.setWarehouseno(dataObject.getString(T5117mPo.COLUMNS.WAREHOUSENO.name())); 
			t5117mPo.setSenderid(dataObject.getString(T5117mPo.COLUMNS.SENDERID.name())); 
			t5117mPo.setSenderqualifier(dataObject.getString(T5117mPo.COLUMNS.SENDERQUALIFIER.name())); 
			t5117mPo.setReceiverid(dataObject.getString(T5117mPo.COLUMNS.RECEIVERID.name())); 
			t5117mPo.setReceiverqualifier(dataObject.getString(T5117mPo.COLUMNS.RECEIVERQUALIFIER.name())); 
			t5117mPo.setDecltype(dataObject.getString(T5117mPo.COLUMNS.DECLTYPE.name())); 
			t5117mPo.setIe(dataObject.getString(T5117mPo.COLUMNS.IE.name())); 
			t5117mPo.setTtype(dataObject.getString(T5117mPo.COLUMNS.TTYPE.name())); 
			t5117mPo.setBriefnote(dataObject.getString(T5117mPo.COLUMNS.BRIEFNOTE.name())); 
			return t5117mPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final T5117mPo t5117mPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(T5117mPo.COLUMNS.CONTROLNO.name(), t5117mPo.getControlno()); 
			dataObject.setValue(T5117mPo.COLUMNS.GCODATE.name(), t5117mPo.getGcodate()); 
			dataObject.setValue(T5117mPo.COLUMNS.WAREHOUSENO.name(), t5117mPo.getWarehouseno()); 
			dataObject.setValue(T5117mPo.COLUMNS.SENDERID.name(), t5117mPo.getSenderid()); 
			dataObject.setValue(T5117mPo.COLUMNS.SENDERQUALIFIER.name(), t5117mPo.getSenderqualifier()); 
			dataObject.setValue(T5117mPo.COLUMNS.RECEIVERID.name(), t5117mPo.getReceiverid()); 
			dataObject.setValue(T5117mPo.COLUMNS.RECEIVERQUALIFIER.name(), t5117mPo.getReceiverqualifier()); 
			dataObject.setValue(T5117mPo.COLUMNS.DECLTYPE.name(), t5117mPo.getDecltype()); 
			dataObject.setValue(T5117mPo.COLUMNS.IE.name(), t5117mPo.getIe()); 
			dataObject.setValue(T5117mPo.COLUMNS.TTYPE.name(), t5117mPo.getTtype()); 
			dataObject.setValue(T5117mPo.COLUMNS.BRIEFNOTE.name(), t5117mPo.getBriefnote()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<T5117mPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(T5117mPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
