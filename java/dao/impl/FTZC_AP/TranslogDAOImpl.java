package com.doc.common.dao.impl; 
 
public class TranslogDAOImpl extends GeneralDAOImpl<TranslogPo> implements TranslogDAO { 
	public static final TranslogDAOImpl INSTANCE = new TranslogDAOImpl(); 
	public static final String TABLENAME = "TRANSLOG"; 

	public TranslogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TranslogPo> CONVERTER = new MapConverter<TranslogPo>() { 
 
		@Override 
		public TranslogPo convert(final DataObject dataObject) { 
			final TranslogPo translogPo = new TranslogPo(); 
			translogPo.setSTable(dataObject.getString(TranslogPo.COLUMNS.S_TABLE.name())); 
			translogPo.setTransId(dataObject.getString(TranslogPo.COLUMNS.TRANS_ID.name())); 
			translogPo.setRmk(dataObject.getString(TranslogPo.COLUMNS.RMK.name())); 
			translogPo.setProcDatm(TimestampUtils.of(dataObject.getValue(TranslogPo.COLUMNS.PROC_DATM.name()))); 
			translogPo.setDaoNum(BigDecimalUtils.formObj(dataObject.getValue(TranslogPo.COLUMNS.DAO_NUM.name()))); 
			return translogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TranslogPo translogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TranslogPo.COLUMNS.S_TABLE.name(), translogPo.getSTable()); 
			dataObject.setValue(TranslogPo.COLUMNS.TRANS_ID.name(), translogPo.getTransId()); 
			dataObject.setValue(TranslogPo.COLUMNS.RMK.name(), translogPo.getRmk()); 
			dataObject.setValue(TranslogPo.COLUMNS.PROC_DATM.name(), translogPo.getProcDatm()); 
			dataObject.setValue(TranslogPo.COLUMNS.DAO_NUM.name(), translogPo.getDaoNum()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TranslogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TranslogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
