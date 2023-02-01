package com.doc.common.dao.impl; 
 
public class OutdocdtlDAOImpl extends GeneralDAOImpl<OutdocdtlPo> implements OutdocdtlDAO { 
	public static final OutdocdtlDAOImpl INSTANCE = new OutdocdtlDAOImpl(); 
	public static final String TABLENAME = "OUTDOCDTL"; 

	public OutdocdtlDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<OutdocdtlPo> CONVERTER = new MapConverter<OutdocdtlPo>() { 
 
		@Override 
		public OutdocdtlPo convert(final DataObject dataObject) { 
			final OutdocdtlPo outdocdtlPo = new OutdocdtlPo(); 
			outdocdtlPo.setDocNo(dataObject.getString(OutdocdtlPo.COLUMNS.DOC_NO.name())); 
			outdocdtlPo.setBfNo(dataObject.getString(OutdocdtlPo.COLUMNS.BF_NO.name())); 
			outdocdtlPo.setDocItem(BigDecimalUtils.formObj(dataObject.getValue(OutdocdtlPo.COLUMNS.DOC_ITEM.name()))); 
			outdocdtlPo.setCommodityNo(dataObject.getString(OutdocdtlPo.COLUMNS.COMMODITY_NO.name())); 
			outdocdtlPo.setGoodUnit(dataObject.getString(OutdocdtlPo.COLUMNS.GOOD_UNIT.name())); 
			outdocdtlPo.setGoodQty(BigDecimalUtils.formObj(dataObject.getValue(OutdocdtlPo.COLUMNS.GOOD_QTY.name()))); 
			outdocdtlPo.setVerifyQty(BigDecimalUtils.formObj(dataObject.getValue(OutdocdtlPo.COLUMNS.VERIFY_QTY.name()))); 
			outdocdtlPo.setOutNo(dataObject.getString(OutdocdtlPo.COLUMNS.OUT_NO.name())); 
			outdocdtlPo.setOutItem(dataObject.getString(OutdocdtlPo.COLUMNS.OUT_ITEM.name())); 
			outdocdtlPo.setOutDate(dataObject.getString(OutdocdtlPo.COLUMNS.OUT_DATE.name())); 
			outdocdtlPo.setInStorageArea(dataObject.getString(OutdocdtlPo.COLUMNS.IN_STORAGE_AREA.name())); 
			outdocdtlPo.setODeclNo(dataObject.getString(OutdocdtlPo.COLUMNS.O_DECL_NO.name())); 
			outdocdtlPo.setODeclItem(dataObject.getString(OutdocdtlPo.COLUMNS.O_DECL_ITEM.name())); 
			outdocdtlPo.setODeclType(dataObject.getString(OutdocdtlPo.COLUMNS.O_DECL_TYPE.name())); 
			outdocdtlPo.setCtmCode(dataObject.getString(OutdocdtlPo.COLUMNS.CTM_CODE.name())); 
			outdocdtlPo.setGoodsCode(dataObject.getString(OutdocdtlPo.COLUMNS.GOODS_CODE.name())); 
			outdocdtlPo.setDocType(dataObject.getString(OutdocdtlPo.COLUMNS.DOC_TYPE.name())); 
			outdocdtlPo.setParentNo(dataObject.getString(OutdocdtlPo.COLUMNS.PARENT_NO.name())); 
			outdocdtlPo.setParentIten(dataObject.getString(OutdocdtlPo.COLUMNS.PARENT_ITEN.name())); 
			outdocdtlPo.setParentCommodityNo(dataObject.getString(OutdocdtlPo.COLUMNS.PARENT_COMMODITY_NO.name())); 
			outdocdtlPo.setParent(dataObject.getString(OutdocdtlPo.COLUMNS.PARENT.name())); 
			outdocdtlPo.setOOpCode(dataObject.getString(OutdocdtlPo.COLUMNS.O_OP_CODE.name())); 
			outdocdtlPo.setRemark1(dataObject.getString(OutdocdtlPo.COLUMNS.REMARK1.name())); 
			outdocdtlPo.setOutGuid(dataObject.getString(OutdocdtlPo.COLUMNS.OUT_GUID.name())); 
			outdocdtlPo.setCreateDate(dataObject.getString(OutdocdtlPo.COLUMNS.CREATE_DATE.name())); 
			outdocdtlPo.setBackQty(BigDecimalUtils.formObj(dataObject.getValue(OutdocdtlPo.COLUMNS.BACK_QTY.name()))); 
			return outdocdtlPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final OutdocdtlPo outdocdtlPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(OutdocdtlPo.COLUMNS.DOC_NO.name(), outdocdtlPo.getDocNo()); 
			dataObject.setValue(OutdocdtlPo.COLUMNS.BF_NO.name(), outdocdtlPo.getBfNo()); 
			dataObject.setValue(OutdocdtlPo.COLUMNS.DOC_ITEM.name(), outdocdtlPo.getDocItem()); 
			dataObject.setValue(OutdocdtlPo.COLUMNS.COMMODITY_NO.name(), outdocdtlPo.getCommodityNo()); 
			dataObject.setValue(OutdocdtlPo.COLUMNS.GOOD_UNIT.name(), outdocdtlPo.getGoodUnit()); 
			dataObject.setValue(OutdocdtlPo.COLUMNS.GOOD_QTY.name(), outdocdtlPo.getGoodQty()); 
			dataObject.setValue(OutdocdtlPo.COLUMNS.VERIFY_QTY.name(), outdocdtlPo.getVerifyQty()); 
			dataObject.setValue(OutdocdtlPo.COLUMNS.OUT_NO.name(), outdocdtlPo.getOutNo()); 
			dataObject.setValue(OutdocdtlPo.COLUMNS.OUT_ITEM.name(), outdocdtlPo.getOutItem()); 
			dataObject.setValue(OutdocdtlPo.COLUMNS.OUT_DATE.name(), outdocdtlPo.getOutDate()); 
			dataObject.setValue(OutdocdtlPo.COLUMNS.IN_STORAGE_AREA.name(), outdocdtlPo.getInStorageArea()); 
			dataObject.setValue(OutdocdtlPo.COLUMNS.O_DECL_NO.name(), outdocdtlPo.getODeclNo()); 
			dataObject.setValue(OutdocdtlPo.COLUMNS.O_DECL_ITEM.name(), outdocdtlPo.getODeclItem()); 
			dataObject.setValue(OutdocdtlPo.COLUMNS.O_DECL_TYPE.name(), outdocdtlPo.getODeclType()); 
			dataObject.setValue(OutdocdtlPo.COLUMNS.CTM_CODE.name(), outdocdtlPo.getCtmCode()); 
			dataObject.setValue(OutdocdtlPo.COLUMNS.GOODS_CODE.name(), outdocdtlPo.getGoodsCode()); 
			dataObject.setValue(OutdocdtlPo.COLUMNS.DOC_TYPE.name(), outdocdtlPo.getDocType()); 
			dataObject.setValue(OutdocdtlPo.COLUMNS.PARENT_NO.name(), outdocdtlPo.getParentNo()); 
			dataObject.setValue(OutdocdtlPo.COLUMNS.PARENT_ITEN.name(), outdocdtlPo.getParentIten()); 
			dataObject.setValue(OutdocdtlPo.COLUMNS.PARENT_COMMODITY_NO.name(), outdocdtlPo.getParentCommodityNo()); 
			dataObject.setValue(OutdocdtlPo.COLUMNS.PARENT.name(), outdocdtlPo.getParent()); 
			dataObject.setValue(OutdocdtlPo.COLUMNS.O_OP_CODE.name(), outdocdtlPo.getOOpCode()); 
			dataObject.setValue(OutdocdtlPo.COLUMNS.REMARK1.name(), outdocdtlPo.getRemark1()); 
			dataObject.setValue(OutdocdtlPo.COLUMNS.OUT_GUID.name(), outdocdtlPo.getOutGuid()); 
			dataObject.setValue(OutdocdtlPo.COLUMNS.CREATE_DATE.name(), outdocdtlPo.getCreateDate()); 
			dataObject.setValue(OutdocdtlPo.COLUMNS.BACK_QTY.name(), outdocdtlPo.getBackQty()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<OutdocdtlPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(OutdocdtlPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
