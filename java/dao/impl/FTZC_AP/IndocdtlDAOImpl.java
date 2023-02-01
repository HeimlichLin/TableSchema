package com.doc.common.dao.impl; 
 
public class IndocdtlDAOImpl extends GeneralDAOImpl<IndocdtlPo> implements IndocdtlDAO { 
	public static final IndocdtlDAOImpl INSTANCE = new IndocdtlDAOImpl(); 
	public static final String TABLENAME = "INDOCDTL"; 

	public IndocdtlDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<IndocdtlPo> CONVERTER = new MapConverter<IndocdtlPo>() { 
 
		@Override 
		public IndocdtlPo convert(final DataObject dataObject) { 
			final IndocdtlPo indocdtlPo = new IndocdtlPo(); 
			indocdtlPo.setBfNo(dataObject.getString(IndocdtlPo.COLUMNS.BF_NO.name())); 
			indocdtlPo.setDocNo(dataObject.getString(IndocdtlPo.COLUMNS.DOC_NO.name())); 
			indocdtlPo.setDocItem(dataObject.getString(IndocdtlPo.COLUMNS.DOC_ITEM.name())); 
			indocdtlPo.setCommodityNo(dataObject.getString(IndocdtlPo.COLUMNS.COMMODITY_NO.name())); 
			indocdtlPo.setGoodUnit(dataObject.getString(IndocdtlPo.COLUMNS.GOOD_UNIT.name())); 
			indocdtlPo.setGoodQty(BigDecimalUtils.formObj(dataObject.getValue(IndocdtlPo.COLUMNS.GOOD_QTY.name()))); 
			indocdtlPo.setVerifyQty(BigDecimalUtils.formObj(dataObject.getValue(IndocdtlPo.COLUMNS.VERIFY_QTY.name()))); 
			indocdtlPo.setVerifyStatus(dataObject.getString(IndocdtlPo.COLUMNS.VERIFY_STATUS.name())); 
			indocdtlPo.setCtmCode(dataObject.getString(IndocdtlPo.COLUMNS.CTM_CODE.name())); 
			indocdtlPo.setGoodKind(dataObject.getString(IndocdtlPo.COLUMNS.GOOD_KIND.name())); 
			indocdtlPo.setGoodsCode(dataObject.getString(IndocdtlPo.COLUMNS.GOODS_CODE.name())); 
			indocdtlPo.setDocType(dataObject.getString(IndocdtlPo.COLUMNS.DOC_TYPE.name())); 
			indocdtlPo.setBackQty(BigDecimalUtils.formObj(dataObject.getValue(IndocdtlPo.COLUMNS.BACK_QTY.name()))); 
			indocdtlPo.setRefGuid(dataObject.getString(IndocdtlPo.COLUMNS.REF_GUID.name())); 
			indocdtlPo.setRemark1(dataObject.getString(IndocdtlPo.COLUMNS.REMARK1.name())); 
			indocdtlPo.setCreateDate(dataObject.getString(IndocdtlPo.COLUMNS.CREATE_DATE.name())); 
			return indocdtlPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final IndocdtlPo indocdtlPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(IndocdtlPo.COLUMNS.BF_NO.name(), indocdtlPo.getBfNo()); 
			dataObject.setValue(IndocdtlPo.COLUMNS.DOC_NO.name(), indocdtlPo.getDocNo()); 
			dataObject.setValue(IndocdtlPo.COLUMNS.DOC_ITEM.name(), indocdtlPo.getDocItem()); 
			dataObject.setValue(IndocdtlPo.COLUMNS.COMMODITY_NO.name(), indocdtlPo.getCommodityNo()); 
			dataObject.setValue(IndocdtlPo.COLUMNS.GOOD_UNIT.name(), indocdtlPo.getGoodUnit()); 
			dataObject.setValue(IndocdtlPo.COLUMNS.GOOD_QTY.name(), indocdtlPo.getGoodQty()); 
			dataObject.setValue(IndocdtlPo.COLUMNS.VERIFY_QTY.name(), indocdtlPo.getVerifyQty()); 
			dataObject.setValue(IndocdtlPo.COLUMNS.VERIFY_STATUS.name(), indocdtlPo.getVerifyStatus()); 
			dataObject.setValue(IndocdtlPo.COLUMNS.CTM_CODE.name(), indocdtlPo.getCtmCode()); 
			dataObject.setValue(IndocdtlPo.COLUMNS.GOOD_KIND.name(), indocdtlPo.getGoodKind()); 
			dataObject.setValue(IndocdtlPo.COLUMNS.GOODS_CODE.name(), indocdtlPo.getGoodsCode()); 
			dataObject.setValue(IndocdtlPo.COLUMNS.DOC_TYPE.name(), indocdtlPo.getDocType()); 
			dataObject.setValue(IndocdtlPo.COLUMNS.BACK_QTY.name(), indocdtlPo.getBackQty()); 
			dataObject.setValue(IndocdtlPo.COLUMNS.REF_GUID.name(), indocdtlPo.getRefGuid()); 
			dataObject.setValue(IndocdtlPo.COLUMNS.REMARK1.name(), indocdtlPo.getRemark1()); 
			dataObject.setValue(IndocdtlPo.COLUMNS.CREATE_DATE.name(), indocdtlPo.getCreateDate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<IndocdtlPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(IndocdtlPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
