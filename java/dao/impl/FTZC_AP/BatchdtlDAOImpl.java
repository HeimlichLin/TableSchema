package com.doc.common.dao.impl; 
 
public class BatchdtlDAOImpl extends GeneralDAOImpl<BatchdtlPo> implements BatchdtlDAO { 
	public static final BatchdtlDAOImpl INSTANCE = new BatchdtlDAOImpl(); 
	public static final String TABLENAME = "BATCHDTL"; 

	public BatchdtlDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<BatchdtlPo> CONVERTER = new MapConverter<BatchdtlPo>() { 
 
		@Override 
		public BatchdtlPo convert(final DataObject dataObject) { 
			final BatchdtlPo batchdtlPo = new BatchdtlPo(); 
			batchdtlPo.setBfNo(dataObject.getString(BatchdtlPo.COLUMNS.BF_NO.name())); 
			batchdtlPo.setTransId(dataObject.getString(BatchdtlPo.COLUMNS.TRANS_ID.name())); 
			batchdtlPo.setDeliverNo(dataObject.getString(BatchdtlPo.COLUMNS.DELIVER_NO.name())); 
			batchdtlPo.setItemNo(BigDecimalUtils.formObj(dataObject.getValue(BatchdtlPo.COLUMNS.ITEM_NO.name()))); 
			batchdtlPo.setDeliverType(dataObject.getString(BatchdtlPo.COLUMNS.DELIVER_TYPE.name())); 
			batchdtlPo.setSplitNo(dataObject.getString(BatchdtlPo.COLUMNS.SPLIT_NO.name())); 
			batchdtlPo.setDeliverQty(BigDecimalUtils.formObj(dataObject.getValue(BatchdtlPo.COLUMNS.DELIVER_QTY.name()))); 
			batchdtlPo.setDeliverDate(dataObject.getString(BatchdtlPo.COLUMNS.DELIVER_DATE.name())); 
			batchdtlPo.setUserId(dataObject.getString(BatchdtlPo.COLUMNS.USER_ID.name())); 
			batchdtlPo.setRemark(dataObject.getString(BatchdtlPo.COLUMNS.REMARK.name())); 
			return batchdtlPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final BatchdtlPo batchdtlPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(BatchdtlPo.COLUMNS.BF_NO.name(), batchdtlPo.getBfNo()); 
			dataObject.setValue(BatchdtlPo.COLUMNS.TRANS_ID.name(), batchdtlPo.getTransId()); 
			dataObject.setValue(BatchdtlPo.COLUMNS.DELIVER_NO.name(), batchdtlPo.getDeliverNo()); 
			dataObject.setValue(BatchdtlPo.COLUMNS.ITEM_NO.name(), batchdtlPo.getItemNo()); 
			dataObject.setValue(BatchdtlPo.COLUMNS.DELIVER_TYPE.name(), batchdtlPo.getDeliverType()); 
			dataObject.setValue(BatchdtlPo.COLUMNS.SPLIT_NO.name(), batchdtlPo.getSplitNo()); 
			dataObject.setValue(BatchdtlPo.COLUMNS.DELIVER_QTY.name(), batchdtlPo.getDeliverQty()); 
			dataObject.setValue(BatchdtlPo.COLUMNS.DELIVER_DATE.name(), batchdtlPo.getDeliverDate()); 
			dataObject.setValue(BatchdtlPo.COLUMNS.USER_ID.name(), batchdtlPo.getUserId()); 
			dataObject.setValue(BatchdtlPo.COLUMNS.REMARK.name(), batchdtlPo.getRemark()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<BatchdtlPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(BatchdtlPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(BatchdtlPo.COLUMNS.BF_NO.name(), po.getBfNo()); 
		sqlWhere.add(BatchdtlPo.COLUMNS.DELIVER_NO.name(), po.getDeliverNo()); 
		sqlWhere.add(BatchdtlPo.COLUMNS.ITEM_NO.name(), po.getItemNo()); 
		sqlWhere.add(BatchdtlPo.COLUMNS.DELIVER_TYPE.name(), po.getDeliverType()); 
		sqlWhere.add(BatchdtlPo.COLUMNS.SPLIT_NO.name(), po.getSplitNo()); 
		return sqlWhere; 
	} 
 
} 
