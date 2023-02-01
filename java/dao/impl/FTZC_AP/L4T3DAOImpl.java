package com.doc.common.dao.impl; 
 
public class L4T3DAOImpl extends GeneralDAOImpl<L4T3Po> implements L4T3DAO { 
	public static final L4T3DAOImpl INSTANCE = new L4T3DAOImpl(); 
	public static final String TABLENAME = "L4_T3"; 

	public L4T3DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<L4T3Po> CONVERTER = new MapConverter<L4T3Po>() { 
 
		@Override 
		public L4T3Po convert(final DataObject dataObject) { 
			final L4T3Po l4T3Po = new L4T3Po(); 
			l4T3Po.setBfNo(dataObject.getString(L4T3Po.COLUMNS.BF_NO.name())); 
			l4T3Po.setControlNo(dataObject.getString(L4T3Po.COLUMNS.CONTROL_NO.name())); 
			l4T3Po.setSerialNo(dataObject.getString(L4T3Po.COLUMNS.SERIAL_NO.name())); 
			l4T3Po.setT1SeqNo(BigDecimalUtils.formObj(dataObject.getValue(L4T3Po.COLUMNS.T1_SEQ_NO.name()))); 
			l4T3Po.setSeqNo(BigDecimalUtils.formObj(dataObject.getValue(L4T3Po.COLUMNS.SEQ_NO.name()))); 
			l4T3Po.setDeclNo(dataObject.getString(L4T3Po.COLUMNS.DECL_NO.name())); 
			l4T3Po.setItemNo(dataObject.getString(L4T3Po.COLUMNS.ITEM_NO.name())); 
			l4T3Po.setRefBillNo(dataObject.getString(L4T3Po.COLUMNS.REF_BILL_NO.name())); 
			l4T3Po.setItem(dataObject.getString(L4T3Po.COLUMNS.ITEM.name())); 
			l4T3Po.setDeclType(dataObject.getString(L4T3Po.COLUMNS.DECL_TYPE.name())); 
			l4T3Po.setPost(dataObject.getString(L4T3Po.COLUMNS.POST.name())); 
			l4T3Po.setStrType(dataObject.getString(L4T3Po.COLUMNS.STR_TYPE.name())); 
			l4T3Po.setModifer(dataObject.getString(L4T3Po.COLUMNS.MODIFER.name())); 
			l4T3Po.setModTime(TimestampUtils.of(dataObject.getValue(L4T3Po.COLUMNS.MOD_TIME.name()))); 
			l4T3Po.setModItem(dataObject.getString(L4T3Po.COLUMNS.MOD_ITEM.name())); 
			l4T3Po.setOriData(dataObject.getString(L4T3Po.COLUMNS.ORI_DATA.name())); 
			l4T3Po.setModData(dataObject.getString(L4T3Po.COLUMNS.MOD_DATA.name())); 
			l4T3Po.setModFile(dataObject.getString(L4T3Po.COLUMNS.MOD_FILE.name())); 
			l4T3Po.setRemks(dataObject.getString(L4T3Po.COLUMNS.REMKS.name())); 
			l4T3Po.setBatchNo(dataObject.getString(L4T3Po.COLUMNS.BATCH_NO.name())); 
			l4T3Po.setDeclSeqNo(BigDecimalUtils.formObj(dataObject.getValue(L4T3Po.COLUMNS.DECL_SEQ_NO.name()))); 
			return l4T3Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final L4T3Po l4T3Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(L4T3Po.COLUMNS.BF_NO.name(), l4T3Po.getBfNo()); 
			dataObject.setValue(L4T3Po.COLUMNS.CONTROL_NO.name(), l4T3Po.getControlNo()); 
			dataObject.setValue(L4T3Po.COLUMNS.SERIAL_NO.name(), l4T3Po.getSerialNo()); 
			dataObject.setValue(L4T3Po.COLUMNS.T1_SEQ_NO.name(), l4T3Po.getT1SeqNo()); 
			dataObject.setValue(L4T3Po.COLUMNS.SEQ_NO.name(), l4T3Po.getSeqNo()); 
			dataObject.setValue(L4T3Po.COLUMNS.DECL_NO.name(), l4T3Po.getDeclNo()); 
			dataObject.setValue(L4T3Po.COLUMNS.ITEM_NO.name(), l4T3Po.getItemNo()); 
			dataObject.setValue(L4T3Po.COLUMNS.REF_BILL_NO.name(), l4T3Po.getRefBillNo()); 
			dataObject.setValue(L4T3Po.COLUMNS.ITEM.name(), l4T3Po.getItem()); 
			dataObject.setValue(L4T3Po.COLUMNS.DECL_TYPE.name(), l4T3Po.getDeclType()); 
			dataObject.setValue(L4T3Po.COLUMNS.POST.name(), l4T3Po.getPost()); 
			dataObject.setValue(L4T3Po.COLUMNS.STR_TYPE.name(), l4T3Po.getStrType()); 
			dataObject.setValue(L4T3Po.COLUMNS.MODIFER.name(), l4T3Po.getModifer()); 
			dataObject.setValue(L4T3Po.COLUMNS.MOD_TIME.name(), l4T3Po.getModTime()); 
			dataObject.setValue(L4T3Po.COLUMNS.MOD_ITEM.name(), l4T3Po.getModItem()); 
			dataObject.setValue(L4T3Po.COLUMNS.ORI_DATA.name(), l4T3Po.getOriData()); 
			dataObject.setValue(L4T3Po.COLUMNS.MOD_DATA.name(), l4T3Po.getModData()); 
			dataObject.setValue(L4T3Po.COLUMNS.MOD_FILE.name(), l4T3Po.getModFile()); 
			dataObject.setValue(L4T3Po.COLUMNS.REMKS.name(), l4T3Po.getRemks()); 
			dataObject.setValue(L4T3Po.COLUMNS.BATCH_NO.name(), l4T3Po.getBatchNo()); 
			dataObject.setValue(L4T3Po.COLUMNS.DECL_SEQ_NO.name(), l4T3Po.getDeclSeqNo()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<L4T3Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(L4T3Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
