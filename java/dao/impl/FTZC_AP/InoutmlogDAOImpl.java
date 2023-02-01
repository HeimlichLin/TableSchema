package com.doc.common.dao.impl; 
 
public class InoutmlogDAOImpl extends GeneralDAOImpl<InoutmlogPo> implements InoutmlogDAO { 
	public static final InoutmlogDAOImpl INSTANCE = new InoutmlogDAOImpl(); 
	public static final String TABLENAME = "INOUTMLOG"; 

	public InoutmlogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<InoutmlogPo> CONVERTER = new MapConverter<InoutmlogPo>() { 
 
		@Override 
		public InoutmlogPo convert(final DataObject dataObject) { 
			final InoutmlogPo inoutmlogPo = new InoutmlogPo(); 
			inoutmlogPo.setUserId(dataObject.getString(InoutmlogPo.COLUMNS.USER_ID.name())); 
			inoutmlogPo.setBfNo(dataObject.getString(InoutmlogPo.COLUMNS.BF_NO.name())); 
			inoutmlogPo.setDeliverNo(dataObject.getString(InoutmlogPo.COLUMNS.DELIVER_NO.name())); 
			inoutmlogPo.setLogDatm(dataObject.getString(InoutmlogPo.COLUMNS.LOG_DATM.name())); 
			inoutmlogPo.setLogTable(dataObject.getString(InoutmlogPo.COLUMNS.LOG_TABLE.name())); 
			inoutmlogPo.setLogAction(dataObject.getString(InoutmlogPo.COLUMNS.LOG_ACTION.name())); 
			inoutmlogPo.setLogColumn(dataObject.getString(InoutmlogPo.COLUMNS.LOG_COLUMN.name())); 
			inoutmlogPo.setLogNew(dataObject.getString(InoutmlogPo.COLUMNS.LOG_NEW.name())); 
			inoutmlogPo.setLogOld(dataObject.getString(InoutmlogPo.COLUMNS.LOG_OLD.name())); 
			inoutmlogPo.setDeliverType(dataObject.getString(InoutmlogPo.COLUMNS.DELIVER_TYPE.name())); 
			inoutmlogPo.setLogPgm(dataObject.getString(InoutmlogPo.COLUMNS.LOG_PGM.name())); 
			inoutmlogPo.setDeliverItemNo(BigDecimalUtils.formObj(dataObject.getValue(InoutmlogPo.COLUMNS.DELIVER_ITEM_NO.name()))); 
			inoutmlogPo.setRemark(dataObject.getString(InoutmlogPo.COLUMNS.REMARK.name())); 
			inoutmlogPo.setPost(dataObject.getString(InoutmlogPo.COLUMNS.POST.name())); 
			inoutmlogPo.setViewColumn(dataObject.getString(InoutmlogPo.COLUMNS.VIEW_COLUMN.name())); 
			inoutmlogPo.setDeclNo(dataObject.getString(InoutmlogPo.COLUMNS.DECL_NO.name())); 
			inoutmlogPo.setItemNo(BigDecimalUtils.formObj(dataObject.getValue(InoutmlogPo.COLUMNS.ITEM_NO.name()))); 
			inoutmlogPo.setDeclSeqNo(BigDecimalUtils.formObj(dataObject.getValue(InoutmlogPo.COLUMNS.DECL_SEQ_NO.name()))); 
			return inoutmlogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final InoutmlogPo inoutmlogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(InoutmlogPo.COLUMNS.USER_ID.name(), inoutmlogPo.getUserId()); 
			dataObject.setValue(InoutmlogPo.COLUMNS.BF_NO.name(), inoutmlogPo.getBfNo()); 
			dataObject.setValue(InoutmlogPo.COLUMNS.DELIVER_NO.name(), inoutmlogPo.getDeliverNo()); 
			dataObject.setValue(InoutmlogPo.COLUMNS.LOG_DATM.name(), inoutmlogPo.getLogDatm()); 
			dataObject.setValue(InoutmlogPo.COLUMNS.LOG_TABLE.name(), inoutmlogPo.getLogTable()); 
			dataObject.setValue(InoutmlogPo.COLUMNS.LOG_ACTION.name(), inoutmlogPo.getLogAction()); 
			dataObject.setValue(InoutmlogPo.COLUMNS.LOG_COLUMN.name(), inoutmlogPo.getLogColumn()); 
			dataObject.setValue(InoutmlogPo.COLUMNS.LOG_NEW.name(), inoutmlogPo.getLogNew()); 
			dataObject.setValue(InoutmlogPo.COLUMNS.LOG_OLD.name(), inoutmlogPo.getLogOld()); 
			dataObject.setValue(InoutmlogPo.COLUMNS.DELIVER_TYPE.name(), inoutmlogPo.getDeliverType()); 
			dataObject.setValue(InoutmlogPo.COLUMNS.LOG_PGM.name(), inoutmlogPo.getLogPgm()); 
			dataObject.setValue(InoutmlogPo.COLUMNS.DELIVER_ITEM_NO.name(), inoutmlogPo.getDeliverItemNo()); 
			dataObject.setValue(InoutmlogPo.COLUMNS.REMARK.name(), inoutmlogPo.getRemark()); 
			dataObject.setValue(InoutmlogPo.COLUMNS.POST.name(), inoutmlogPo.getPost()); 
			dataObject.setValue(InoutmlogPo.COLUMNS.VIEW_COLUMN.name(), inoutmlogPo.getViewColumn()); 
			dataObject.setValue(InoutmlogPo.COLUMNS.DECL_NO.name(), inoutmlogPo.getDeclNo()); 
			dataObject.setValue(InoutmlogPo.COLUMNS.ITEM_NO.name(), inoutmlogPo.getItemNo()); 
			dataObject.setValue(InoutmlogPo.COLUMNS.DECL_SEQ_NO.name(), inoutmlogPo.getDeclSeqNo()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<InoutmlogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(InoutmlogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
