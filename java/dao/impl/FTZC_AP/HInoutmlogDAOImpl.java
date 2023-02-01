package com.doc.common.dao.impl; 
 
public class HInoutmlogDAOImpl extends GeneralDAOImpl<HInoutmlogPo> implements HInoutmlogDAO { 
	public static final HInoutmlogDAOImpl INSTANCE = new HInoutmlogDAOImpl(); 
	public static final String TABLENAME = "H_INOUTMLOG"; 

	public HInoutmlogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<HInoutmlogPo> CONVERTER = new MapConverter<HInoutmlogPo>() { 
 
		@Override 
		public HInoutmlogPo convert(final DataObject dataObject) { 
			final HInoutmlogPo hInoutmlogPo = new HInoutmlogPo(); 
			hInoutmlogPo.setUserId(dataObject.getString(HInoutmlogPo.COLUMNS.USER_ID.name())); 
			hInoutmlogPo.setBfNo(dataObject.getString(HInoutmlogPo.COLUMNS.BF_NO.name())); 
			hInoutmlogPo.setDeliverNo(dataObject.getString(HInoutmlogPo.COLUMNS.DELIVER_NO.name())); 
			hInoutmlogPo.setLogDatm(dataObject.getString(HInoutmlogPo.COLUMNS.LOG_DATM.name())); 
			hInoutmlogPo.setLogTable(dataObject.getString(HInoutmlogPo.COLUMNS.LOG_TABLE.name())); 
			hInoutmlogPo.setLogAction(dataObject.getString(HInoutmlogPo.COLUMNS.LOG_ACTION.name())); 
			hInoutmlogPo.setLogColumn(dataObject.getString(HInoutmlogPo.COLUMNS.LOG_COLUMN.name())); 
			hInoutmlogPo.setLogNew(dataObject.getString(HInoutmlogPo.COLUMNS.LOG_NEW.name())); 
			hInoutmlogPo.setLogOld(dataObject.getString(HInoutmlogPo.COLUMNS.LOG_OLD.name())); 
			hInoutmlogPo.setDeliverType(dataObject.getString(HInoutmlogPo.COLUMNS.DELIVER_TYPE.name())); 
			hInoutmlogPo.setLogPgm(dataObject.getString(HInoutmlogPo.COLUMNS.LOG_PGM.name())); 
			hInoutmlogPo.setDeliverItemNo(BigDecimalUtils.formObj(dataObject.getValue(HInoutmlogPo.COLUMNS.DELIVER_ITEM_NO.name()))); 
			hInoutmlogPo.setRemark(dataObject.getString(HInoutmlogPo.COLUMNS.REMARK.name())); 
			hInoutmlogPo.setPost(dataObject.getString(HInoutmlogPo.COLUMNS.POST.name())); 
			hInoutmlogPo.setViewColumn(dataObject.getString(HInoutmlogPo.COLUMNS.VIEW_COLUMN.name())); 
			hInoutmlogPo.setDeclNo(dataObject.getString(HInoutmlogPo.COLUMNS.DECL_NO.name())); 
			hInoutmlogPo.setItemNo(BigDecimalUtils.formObj(dataObject.getValue(HInoutmlogPo.COLUMNS.ITEM_NO.name()))); 
			hInoutmlogPo.setDeclSeqNo(BigDecimalUtils.formObj(dataObject.getValue(HInoutmlogPo.COLUMNS.DECL_SEQ_NO.name()))); 
			return hInoutmlogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final HInoutmlogPo hInoutmlogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(HInoutmlogPo.COLUMNS.USER_ID.name(), hInoutmlogPo.getUserId()); 
			dataObject.setValue(HInoutmlogPo.COLUMNS.BF_NO.name(), hInoutmlogPo.getBfNo()); 
			dataObject.setValue(HInoutmlogPo.COLUMNS.DELIVER_NO.name(), hInoutmlogPo.getDeliverNo()); 
			dataObject.setValue(HInoutmlogPo.COLUMNS.LOG_DATM.name(), hInoutmlogPo.getLogDatm()); 
			dataObject.setValue(HInoutmlogPo.COLUMNS.LOG_TABLE.name(), hInoutmlogPo.getLogTable()); 
			dataObject.setValue(HInoutmlogPo.COLUMNS.LOG_ACTION.name(), hInoutmlogPo.getLogAction()); 
			dataObject.setValue(HInoutmlogPo.COLUMNS.LOG_COLUMN.name(), hInoutmlogPo.getLogColumn()); 
			dataObject.setValue(HInoutmlogPo.COLUMNS.LOG_NEW.name(), hInoutmlogPo.getLogNew()); 
			dataObject.setValue(HInoutmlogPo.COLUMNS.LOG_OLD.name(), hInoutmlogPo.getLogOld()); 
			dataObject.setValue(HInoutmlogPo.COLUMNS.DELIVER_TYPE.name(), hInoutmlogPo.getDeliverType()); 
			dataObject.setValue(HInoutmlogPo.COLUMNS.LOG_PGM.name(), hInoutmlogPo.getLogPgm()); 
			dataObject.setValue(HInoutmlogPo.COLUMNS.DELIVER_ITEM_NO.name(), hInoutmlogPo.getDeliverItemNo()); 
			dataObject.setValue(HInoutmlogPo.COLUMNS.REMARK.name(), hInoutmlogPo.getRemark()); 
			dataObject.setValue(HInoutmlogPo.COLUMNS.POST.name(), hInoutmlogPo.getPost()); 
			dataObject.setValue(HInoutmlogPo.COLUMNS.VIEW_COLUMN.name(), hInoutmlogPo.getViewColumn()); 
			dataObject.setValue(HInoutmlogPo.COLUMNS.DECL_NO.name(), hInoutmlogPo.getDeclNo()); 
			dataObject.setValue(HInoutmlogPo.COLUMNS.ITEM_NO.name(), hInoutmlogPo.getItemNo()); 
			dataObject.setValue(HInoutmlogPo.COLUMNS.DECL_SEQ_NO.name(), hInoutmlogPo.getDeclSeqNo()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<HInoutmlogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(HInoutmlogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
