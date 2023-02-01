package com.doc.common.dao.impl; 
 
public class OutdtlDAOImpl extends GeneralDAOImpl<OutdtlPo> implements OutdtlDAO { 
	public static final OutdtlDAOImpl INSTANCE = new OutdtlDAOImpl(); 
	public static final String TABLENAME = "OUTDTL"; 

	public OutdtlDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<OutdtlPo> CONVERTER = new MapConverter<OutdtlPo>() { 
 
		@Override 
		public OutdtlPo convert(final DataObject dataObject) { 
			final OutdtlPo outdtlPo = new OutdtlPo(); 
			outdtlPo.setBfNo(dataObject.getString(OutdtlPo.COLUMNS.BF_NO.name())); 
			outdtlPo.setOutNo(dataObject.getString(OutdtlPo.COLUMNS.OUT_NO.name())); 
			outdtlPo.setOutItemNo(BigDecimalUtils.formObj(dataObject.getValue(OutdtlPo.COLUMNS.OUT_ITEM_NO.name()))); 
			outdtlPo.setDeclType(dataObject.getString(OutdtlPo.COLUMNS.DECL_TYPE.name())); 
			outdtlPo.setDeclNo(dataObject.getString(OutdtlPo.COLUMNS.DECL_NO.name())); 
			outdtlPo.setItemNo(BigDecimalUtils.formObj(dataObject.getValue(OutdtlPo.COLUMNS.ITEM_NO.name()))); 
			outdtlPo.setDutyType(dataObject.getString(OutdtlPo.COLUMNS.DUTY_TYPE.name())); 
			outdtlPo.setStatMode(dataObject.getString(OutdtlPo.COLUMNS.STAT_MODE.name())); 
			outdtlPo.setCommodityNo(dataObject.getString(OutdtlPo.COLUMNS.COMMODITY_NO.name())); 
			outdtlPo.setGoodsQty(BigDecimalUtils.formObj(dataObject.getValue(OutdtlPo.COLUMNS.GOODS_QTY.name()))); 
			outdtlPo.setGoodsUnit(dataObject.getString(OutdtlPo.COLUMNS.GOODS_UNIT.name())); 
			outdtlPo.setOutStorageArea(dataObject.getString(OutdtlPo.COLUMNS.OUT_STORAGE_AREA.name())); 
			outdtlPo.setOutDate(dataObject.getString(OutdtlPo.COLUMNS.OUT_DATE.name())); 
			outdtlPo.setGoodsDesc(dataObject.getString(OutdtlPo.COLUMNS.GOODS_DESC.name())); 
			outdtlPo.setGoodsModel(dataObject.getString(OutdtlPo.COLUMNS.GOODS_MODEL.name())); 
			outdtlPo.setGoodsSpec(dataObject.getString(OutdtlPo.COLUMNS.GOODS_SPEC.name())); 
			outdtlPo.setCur(dataObject.getString(OutdtlPo.COLUMNS.CUR.name())); 
			outdtlPo.setGoodsUnitPrice(BigDecimalUtils.formObj(dataObject.getValue(OutdtlPo.COLUMNS.GOODS_UNIT_PRICE.name()))); 
			outdtlPo.setDutyRate(BigDecimalUtils.formObj(dataObject.getValue(OutdtlPo.COLUMNS.DUTY_RATE.name()))); 
			outdtlPo.setCustomValueAmt(BigDecimalUtils.formObj(dataObject.getValue(OutdtlPo.COLUMNS.CUSTOM_VALUE_AMT.name()))); 
			outdtlPo.setCccCode(dataObject.getString(OutdtlPo.COLUMNS.CCC_CODE.name())); 
			outdtlPo.setVerifyStatus(dataObject.getString(OutdtlPo.COLUMNS.VERIFY_STATUS.name())); 
			outdtlPo.setFtzNo(dataObject.getString(OutdtlPo.COLUMNS.FTZ_NO.name())); 
			outdtlPo.setFtzItem(BigDecimalUtils.formObj(dataObject.getValue(OutdtlPo.COLUMNS.FTZ_ITEM.name()))); 
			outdtlPo.setMnNo(dataObject.getString(OutdtlPo.COLUMNS.MN_NO.name())); 
			outdtlPo.setMnDeclType(dataObject.getString(OutdtlPo.COLUMNS.MN_DECL_TYPE.name())); 
			outdtlPo.setMnDeclNo(dataObject.getString(OutdtlPo.COLUMNS.MN_DECL_NO.name())); 
			outdtlPo.setMnSeqNo(BigDecimalUtils.formObj(dataObject.getValue(OutdtlPo.COLUMNS.MN_SEQ_NO.name()))); 
			outdtlPo.setMnMark(dataObject.getString(OutdtlPo.COLUMNS.MN_MARK.name())); 
			outdtlPo.setDocPermitNo(dataObject.getString(OutdtlPo.COLUMNS.DOC_PERMIT_NO.name())); 
			outdtlPo.setDocPermitDate(dataObject.getString(OutdtlPo.COLUMNS.DOC_PERMIT_DATE.name())); 
			outdtlPo.setDocPermitMark(dataObject.getString(OutdtlPo.COLUMNS.DOC_PERMIT_MARK.name())); 
			outdtlPo.setTotalOutQty(BigDecimalUtils.formObj(dataObject.getValue(OutdtlPo.COLUMNS.TOTAL_OUT_QTY.name()))); 
			outdtlPo.setSplitMark(dataObject.getString(OutdtlPo.COLUMNS.SPLIT_MARK.name())); 
			outdtlPo.setEditMark(dataObject.getString(OutdtlPo.COLUMNS.EDIT_MARK.name())); 
			outdtlPo.setTransId(dataObject.getString(OutdtlPo.COLUMNS.TRANS_ID.name())); 
			outdtlPo.setOpCode(dataObject.getString(OutdtlPo.COLUMNS.OP_CODE.name())); 
			outdtlPo.setUserId(dataObject.getString(OutdtlPo.COLUMNS.USER_ID.name())); 
			outdtlPo.setRemark(dataObject.getString(OutdtlPo.COLUMNS.REMARK.name())); 
			outdtlPo.setNetWeight(BigDecimalUtils.formObj(dataObject.getValue(OutdtlPo.COLUMNS.NET_WEIGHT.name()))); 
			outdtlPo.setODeclNo(dataObject.getString(OutdtlPo.COLUMNS.O_DECL_NO.name())); 
			outdtlPo.setOItemNo(BigDecimalUtils.formObj(dataObject.getValue(OutdtlPo.COLUMNS.O_ITEM_NO.name()))); 
			outdtlPo.setOOpCode(dataObject.getString(OutdtlPo.COLUMNS.O_OP_CODE.name())); 
			outdtlPo.setGuid(dataObject.getString(OutdtlPo.COLUMNS.GUID.name())); 
			outdtlPo.setOInGuid(dataObject.getString(OutdtlPo.COLUMNS.O_IN_GUID.name())); 
			outdtlPo.setBalMark(dataObject.getString(OutdtlPo.COLUMNS.BAL_MARK.name())); 
			outdtlPo.setRefDocDate(dataObject.getString(OutdtlPo.COLUMNS.REF_DOC_DATE.name())); 
			outdtlPo.setRefDocNo(dataObject.getString(OutdtlPo.COLUMNS.REF_DOC_NO.name())); 
			outdtlPo.setRefDocVer(dataObject.getString(OutdtlPo.COLUMNS.REF_DOC_VER.name())); 
			outdtlPo.setMnGroupDate(dataObject.getString(OutdtlPo.COLUMNS.MN_GROUP_DATE.name())); 
			outdtlPo.setGoodsCode(dataObject.getString(OutdtlPo.COLUMNS.GOODS_CODE.name())); 
			outdtlPo.setPgmRemark(dataObject.getString(OutdtlPo.COLUMNS.PGM_REMARK.name())); 
			outdtlPo.setDeclSeqNo(BigDecimalUtils.formObj(dataObject.getValue(OutdtlPo.COLUMNS.DECL_SEQ_NO.name()))); 
			return outdtlPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final OutdtlPo outdtlPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(OutdtlPo.COLUMNS.BF_NO.name(), outdtlPo.getBfNo()); 
			dataObject.setValue(OutdtlPo.COLUMNS.OUT_NO.name(), outdtlPo.getOutNo()); 
			dataObject.setValue(OutdtlPo.COLUMNS.OUT_ITEM_NO.name(), outdtlPo.getOutItemNo()); 
			dataObject.setValue(OutdtlPo.COLUMNS.DECL_TYPE.name(), outdtlPo.getDeclType()); 
			dataObject.setValue(OutdtlPo.COLUMNS.DECL_NO.name(), outdtlPo.getDeclNo()); 
			dataObject.setValue(OutdtlPo.COLUMNS.ITEM_NO.name(), outdtlPo.getItemNo()); 
			dataObject.setValue(OutdtlPo.COLUMNS.DUTY_TYPE.name(), outdtlPo.getDutyType()); 
			dataObject.setValue(OutdtlPo.COLUMNS.STAT_MODE.name(), outdtlPo.getStatMode()); 
			dataObject.setValue(OutdtlPo.COLUMNS.COMMODITY_NO.name(), outdtlPo.getCommodityNo()); 
			dataObject.setValue(OutdtlPo.COLUMNS.GOODS_QTY.name(), outdtlPo.getGoodsQty()); 
			dataObject.setValue(OutdtlPo.COLUMNS.GOODS_UNIT.name(), outdtlPo.getGoodsUnit()); 
			dataObject.setValue(OutdtlPo.COLUMNS.OUT_STORAGE_AREA.name(), outdtlPo.getOutStorageArea()); 
			dataObject.setValue(OutdtlPo.COLUMNS.OUT_DATE.name(), outdtlPo.getOutDate()); 
			dataObject.setValue(OutdtlPo.COLUMNS.GOODS_DESC.name(), outdtlPo.getGoodsDesc()); 
			dataObject.setValue(OutdtlPo.COLUMNS.GOODS_MODEL.name(), outdtlPo.getGoodsModel()); 
			dataObject.setValue(OutdtlPo.COLUMNS.GOODS_SPEC.name(), outdtlPo.getGoodsSpec()); 
			dataObject.setValue(OutdtlPo.COLUMNS.CUR.name(), outdtlPo.getCur()); 
			dataObject.setValue(OutdtlPo.COLUMNS.GOODS_UNIT_PRICE.name(), outdtlPo.getGoodsUnitPrice()); 
			dataObject.setValue(OutdtlPo.COLUMNS.DUTY_RATE.name(), outdtlPo.getDutyRate()); 
			dataObject.setValue(OutdtlPo.COLUMNS.CUSTOM_VALUE_AMT.name(), outdtlPo.getCustomValueAmt()); 
			dataObject.setValue(OutdtlPo.COLUMNS.CCC_CODE.name(), outdtlPo.getCccCode()); 
			dataObject.setValue(OutdtlPo.COLUMNS.VERIFY_STATUS.name(), outdtlPo.getVerifyStatus()); 
			dataObject.setValue(OutdtlPo.COLUMNS.FTZ_NO.name(), outdtlPo.getFtzNo()); 
			dataObject.setValue(OutdtlPo.COLUMNS.FTZ_ITEM.name(), outdtlPo.getFtzItem()); 
			dataObject.setValue(OutdtlPo.COLUMNS.MN_NO.name(), outdtlPo.getMnNo()); 
			dataObject.setValue(OutdtlPo.COLUMNS.MN_DECL_TYPE.name(), outdtlPo.getMnDeclType()); 
			dataObject.setValue(OutdtlPo.COLUMNS.MN_DECL_NO.name(), outdtlPo.getMnDeclNo()); 
			dataObject.setValue(OutdtlPo.COLUMNS.MN_SEQ_NO.name(), outdtlPo.getMnSeqNo()); 
			dataObject.setValue(OutdtlPo.COLUMNS.MN_MARK.name(), outdtlPo.getMnMark()); 
			dataObject.setValue(OutdtlPo.COLUMNS.DOC_PERMIT_NO.name(), outdtlPo.getDocPermitNo()); 
			dataObject.setValue(OutdtlPo.COLUMNS.DOC_PERMIT_DATE.name(), outdtlPo.getDocPermitDate()); 
			dataObject.setValue(OutdtlPo.COLUMNS.DOC_PERMIT_MARK.name(), outdtlPo.getDocPermitMark()); 
			dataObject.setValue(OutdtlPo.COLUMNS.TOTAL_OUT_QTY.name(), outdtlPo.getTotalOutQty()); 
			dataObject.setValue(OutdtlPo.COLUMNS.SPLIT_MARK.name(), outdtlPo.getSplitMark()); 
			dataObject.setValue(OutdtlPo.COLUMNS.EDIT_MARK.name(), outdtlPo.getEditMark()); 
			dataObject.setValue(OutdtlPo.COLUMNS.TRANS_ID.name(), outdtlPo.getTransId()); 
			dataObject.setValue(OutdtlPo.COLUMNS.OP_CODE.name(), outdtlPo.getOpCode()); 
			dataObject.setValue(OutdtlPo.COLUMNS.USER_ID.name(), outdtlPo.getUserId()); 
			dataObject.setValue(OutdtlPo.COLUMNS.REMARK.name(), outdtlPo.getRemark()); 
			dataObject.setValue(OutdtlPo.COLUMNS.NET_WEIGHT.name(), outdtlPo.getNetWeight()); 
			dataObject.setValue(OutdtlPo.COLUMNS.O_DECL_NO.name(), outdtlPo.getODeclNo()); 
			dataObject.setValue(OutdtlPo.COLUMNS.O_ITEM_NO.name(), outdtlPo.getOItemNo()); 
			dataObject.setValue(OutdtlPo.COLUMNS.O_OP_CODE.name(), outdtlPo.getOOpCode()); 
			dataObject.setValue(OutdtlPo.COLUMNS.GUID.name(), outdtlPo.getGuid()); 
			dataObject.setValue(OutdtlPo.COLUMNS.O_IN_GUID.name(), outdtlPo.getOInGuid()); 
			dataObject.setValue(OutdtlPo.COLUMNS.BAL_MARK.name(), outdtlPo.getBalMark()); 
			dataObject.setValue(OutdtlPo.COLUMNS.REF_DOC_DATE.name(), outdtlPo.getRefDocDate()); 
			dataObject.setValue(OutdtlPo.COLUMNS.REF_DOC_NO.name(), outdtlPo.getRefDocNo()); 
			dataObject.setValue(OutdtlPo.COLUMNS.REF_DOC_VER.name(), outdtlPo.getRefDocVer()); 
			dataObject.setValue(OutdtlPo.COLUMNS.MN_GROUP_DATE.name(), outdtlPo.getMnGroupDate()); 
			dataObject.setValue(OutdtlPo.COLUMNS.GOODS_CODE.name(), outdtlPo.getGoodsCode()); 
			dataObject.setValue(OutdtlPo.COLUMNS.PGM_REMARK.name(), outdtlPo.getPgmRemark()); 
			dataObject.setValue(OutdtlPo.COLUMNS.DECL_SEQ_NO.name(), outdtlPo.getDeclSeqNo()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<OutdtlPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(OutdtlPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
