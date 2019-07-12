package com.doc.common.dao.impl; 
 
public class TranslogDAO extends GeneralDAOImpl<TranslogDo> implements TranslogDAO { 
	public static final TranslogDAOImpl INSTANCE = new TranslogDAOImpl(); 
	public static final String TABLENAME = "TRANSLOG"; 

	public TranslogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<TranslogDo> CONVERTER = new MapConverter<TranslogDo>() { 
 
		@Override 
		public TranslogDo convert(final DataObject dataObject) { 
			final TranslogDo translogDo = new TranslogDo(); 
			translogDo.setSTable(dataObject.getString(TranslogDo.COLUMNS.S_TABLE.name())); 
			translogDo.setTransId(dataObject.getString(TranslogDo.COLUMNS.TRANS_ID.name())); 
			translogDo.setRmk(dataObject.getString(TranslogDo.COLUMNS.RMK.name())); 
			translogDo.setProcDatm(CommUtils.objConver2Time(dataObject.getString(TranslogDo.COLUMNS.PROC_DATM.name()))); 
			translogDo.setDaoNum(BigDecimalUtils.formObj(dataObject.getString(TranslogDo.COLUMNS.DAO_NUM.name()))); 
			return translogDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TranslogDo translogDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TranslogDo.COLUMNS.S_TABLE.name(), translogDo.getSTable()); 
			dataObject.setValue(TranslogDo.COLUMNS.TRANS_ID.name(), translogDo.getTransId()); 
			dataObject.setValue(TranslogDo.COLUMNS.RMK.name(), translogDo.getRmk()); 
			dataObject.setValue(TranslogDo.COLUMNS.PROC_DATM.name(), translogDo.getProcDatm()); 
			dataObject.setValue(TranslogDo.COLUMNS.DAO_NUM.name(), translogDo.getDaoNum()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TranslogDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TranslogDo po) { 
		sqlWhere.add(TranslogDo.COLUMNS.S_TABLE.name(), po.getSTable()); 
		sqlWhere.add(TranslogDo.COLUMNS.TRANS_ID.name(), po.getTransId()); 
		sqlWhere.add(TranslogDo.COLUMNS.RMK.name(), po.getRmk()); 
		sqlWhere.add(TranslogDo.COLUMNS.PROC_DATM.name(), po.getProcDatm()); 
		sqlWhere.add(TranslogDo.COLUMNS.DAO_NUM.name(), po.getDaoNum()); 
	} 
 
} 
