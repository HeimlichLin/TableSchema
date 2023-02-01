package com.doc.common.dao.impl; 
 
public class IndtlDAOImpl extends GeneralDAOImpl<IndtlPo> implements IndtlDAO { 
	public static final IndtlDAOImpl INSTANCE = new IndtlDAOImpl(); 
	public static final String TABLENAME = "INDTL"; 

	public IndtlDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<IndtlPo> CONVERTER = new MapConverter<IndtlPo>() { 
 
		@Override 
		public IndtlPo convert(final DataObject dataObject) { 
			final IndtlPo indtlPo = new IndtlPo(); 
			indtlPo.setBfNo(dataObject.getString(IndtlPo.COLUMNS.BF_NO.name())); 
			indtlPo.setInDate(dataObject.getString(IndtlPo.COLUMNS.IN_DATE.name())); 
			indtlPo.setInNo(dataObject.getString(IndtlPo.COLUMNS.IN_NO.name())); 
			indtlPo.setInItemNo(BigDecimalUtils.formObj(dataObject.getValue(IndtlPo.COLUMNS.IN_ITEM_NO.name()))); 
			indtlPo.setDeclType(dataObject.getString(IndtlPo.COLUMNS.DECL_TYPE.name())); 
			indtlPo.setDeclNo(dataObject.getString(IndtlPo.COLUMNS.DECL_NO.name())); 
			indtlPo.setItemNo(BigDecimalUtils.formObj(dataObject.getValue(IndtlPo.COLUMNS.ITEM_NO.name()))); 
			indtlPo.setDutyType(dataObject.getString(IndtlPo.COLUMNS.DUTY_TYPE.name())); 
			indtlPo.setStatMode(dataObject.getString(IndtlPo.COLUMNS.STAT_MODE.name())); 
			indtlPo.setCommodityNo(dataObject.getString(IndtlPo.COLUMNS.COMMODITY_NO.name())); 
			indtlPo.setGoodsQty(BigDecimalUtils.formObj(dataObject.getValue(IndtlPo.COLUMNS.GOODS_QTY.name()))); 
			indtlPo.setGoodsUnit(dataObject.getString(IndtlPo.COLUMNS.GOODS_UNIT.name())); 
			indtlPo.setInStorageArea(dataObject.getString(IndtlPo.COLUMNS.IN_STORAGE_AREA.name())); 
			indtlPo.setGoodsCode(dataObject.getString(IndtlPo.COLUMNS.GOODS_CODE.name())); 
			indtlPo.setGoodsDesc(dataObject.getString(IndtlPo.COLUMNS.GOODS_DESC.name())); 
			indtlPo.setGoodsModel(dataObject.getString(IndtlPo.COLUMNS.GOODS_MODEL.name())); 
			indtlPo.setGoodsSpec(dataObject.getString(IndtlPo.COLUMNS.GOODS_SPEC.name())); 
			indtlPo.setCur(dataObject.getString(IndtlPo.COLUMNS.CUR.name())); 
			indtlPo.setGoodsUnitPrice(BigDecimalUtils.formObj(dataObject.getValue(IndtlPo.COLUMNS.GOODS_UNIT_PRICE.name()))); 
			indtlPo.setCustomValueAmt(BigDecimalUtils.formObj(dataObject.getValue(IndtlPo.COLUMNS.CUSTOM_VALUE_AMT.name()))); 
			indtlPo.setDutyRate(BigDecimalUtils.formObj(dataObject.getValue(IndtlPo.COLUMNS.DUTY_RATE.name()))); 
			indtlPo.setDutyRate1(BigDecimalUtils.formObj(dataObject.getValue(IndtlPo.COLUMNS.DUTY_RATE1.name()))); 
			indtlPo.setCccCode(dataObject.getString(IndtlPo.COLUMNS.CCC_CODE.name())); 
			indtlPo.setTradePrdtNo(dataObject.getString(IndtlPo.COLUMNS.TRADE_PRDT_NO.name())); 
			indtlPo.setVerifyStatus(dataObject.getString(IndtlPo.COLUMNS.VERIFY_STATUS.name())); 
			indtlPo.setFtzNo(dataObject.getString(IndtlPo.COLUMNS.FTZ_NO.name())); 
			indtlPo.setFtzItem(dataObject.getString(IndtlPo.COLUMNS.FTZ_ITEM.name())); 
			indtlPo.setCnType(dataObject.getString(IndtlPo.COLUMNS.CN_TYPE.name())); 
			indtlPo.setUserId(dataObject.getString(IndtlPo.COLUMNS.USER_ID.name())); 
			indtlPo.setMnNo(dataObject.getString(IndtlPo.COLUMNS.MN_NO.name())); 
			indtlPo.setMnDeclType(dataObject.getString(IndtlPo.COLUMNS.MN_DECL_TYPE.name())); 
			indtlPo.setMnDeclNo(dataObject.getString(IndtlPo.COLUMNS.MN_DECL_NO.name())); 
			indtlPo.setMnSeqNo(BigDecimalUtils.formObj(dataObject.getValue(IndtlPo.COLUMNS.MN_SEQ_NO.name()))); 
			indtlPo.setMnMark(dataObject.getString(IndtlPo.COLUMNS.MN_MARK.name())); 
			indtlPo.setRemark(dataObject.getString(IndtlPo.COLUMNS.REMARK.name())); 
			indtlPo.setBomNo(dataObject.getString(IndtlPo.COLUMNS.BOM_NO.name())); 
			indtlPo.setBomVer(dataObject.getString(IndtlPo.COLUMNS.BOM_VER.name())); 
			indtlPo.setSplitMark(dataObject.getString(IndtlPo.COLUMNS.SPLIT_MARK.name())); 
			indtlPo.setEditMark(dataObject.getString(IndtlPo.COLUMNS.EDIT_MARK.name())); 
			indtlPo.setTotalInQty(BigDecimalUtils.formObj(dataObject.getValue(IndtlPo.COLUMNS.TOTAL_IN_QTY.name()))); 
			indtlPo.setCurrentQty(BigDecimalUtils.formObj(dataObject.getValue(IndtlPo.COLUMNS.CURRENT_QTY.name()))); 
			indtlPo.setOnlineQty(BigDecimalUtils.formObj(dataObject.getValue(IndtlPo.COLUMNS.ONLINE_QTY.name()))); 
			indtlPo.setPrdtMark(dataObject.getString(IndtlPo.COLUMNS.PRDT_MARK.name())); 
			indtlPo.setTransId(dataObject.getString(IndtlPo.COLUMNS.TRANS_ID.name())); 
			indtlPo.setOpCode(dataObject.getString(IndtlPo.COLUMNS.OP_CODE.name())); 
			indtlPo.setInStatus(dataObject.getString(IndtlPo.COLUMNS.IN_STATUS.name())); 
			indtlPo.setODeclNo(dataObject.getString(IndtlPo.COLUMNS.O_DECL_NO.name())); 
			indtlPo.setOItemNo(BigDecimalUtils.formObj(dataObject.getValue(IndtlPo.COLUMNS.O_ITEM_NO.name()))); 
			indtlPo.setNetWeight(BigDecimalUtils.formObj(dataObject.getValue(IndtlPo.COLUMNS.NET_WEIGHT.name()))); 
			indtlPo.setOOpCode(dataObject.getString(IndtlPo.COLUMNS.O_OP_CODE.name())); 
			indtlPo.setGuid(dataObject.getString(IndtlPo.COLUMNS.GUID.name())); 
			indtlPo.setOOutGuid(dataObject.getString(IndtlPo.COLUMNS.O_OUT_GUID.name())); 
			indtlPo.setRefDocDate(dataObject.getString(IndtlPo.COLUMNS.REF_DOC_DATE.name())); 
			indtlPo.setRefDocNo(dataObject.getString(IndtlPo.COLUMNS.REF_DOC_NO.name())); 
			indtlPo.setRefDocVer(dataObject.getString(IndtlPo.COLUMNS.REF_DOC_VER.name())); 
			indtlPo.setMnGroupDate(dataObject.getString(IndtlPo.COLUMNS.MN_GROUP_DATE.name())); 
			indtlPo.setPgmRemark(dataObject.getString(IndtlPo.COLUMNS.PGM_REMARK.name())); 
			indtlPo.setDeductedMark(dataObject.getString(IndtlPo.COLUMNS.DEDUCTED_MARK.name())); 
			indtlPo.setDeclSeqNo(BigDecimalUtils.formObj(dataObject.getValue(IndtlPo.COLUMNS.DECL_SEQ_NO.name()))); 
			return indtlPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final IndtlPo indtlPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(IndtlPo.COLUMNS.BF_NO.name(), indtlPo.getBfNo()); 
			dataObject.setValue(IndtlPo.COLUMNS.IN_DATE.name(), indtlPo.getInDate()); 
			dataObject.setValue(IndtlPo.COLUMNS.IN_NO.name(), indtlPo.getInNo()); 
			dataObject.setValue(IndtlPo.COLUMNS.IN_ITEM_NO.name(), indtlPo.getInItemNo()); 
			dataObject.setValue(IndtlPo.COLUMNS.DECL_TYPE.name(), indtlPo.getDeclType()); 
			dataObject.setValue(IndtlPo.COLUMNS.DECL_NO.name(), indtlPo.getDeclNo()); 
			dataObject.setValue(IndtlPo.COLUMNS.ITEM_NO.name(), indtlPo.getItemNo()); 
			dataObject.setValue(IndtlPo.COLUMNS.DUTY_TYPE.name(), indtlPo.getDutyType()); 
			dataObject.setValue(IndtlPo.COLUMNS.STAT_MODE.name(), indtlPo.getStatMode()); 
			dataObject.setValue(IndtlPo.COLUMNS.COMMODITY_NO.name(), indtlPo.getCommodityNo()); 
			dataObject.setValue(IndtlPo.COLUMNS.GOODS_QTY.name(), indtlPo.getGoodsQty()); 
			dataObject.setValue(IndtlPo.COLUMNS.GOODS_UNIT.name(), indtlPo.getGoodsUnit()); 
			dataObject.setValue(IndtlPo.COLUMNS.IN_STORAGE_AREA.name(), indtlPo.getInStorageArea()); 
			dataObject.setValue(IndtlPo.COLUMNS.GOODS_CODE.name(), indtlPo.getGoodsCode()); 
			dataObject.setValue(IndtlPo.COLUMNS.GOODS_DESC.name(), indtlPo.getGoodsDesc()); 
			dataObject.setValue(IndtlPo.COLUMNS.GOODS_MODEL.name(), indtlPo.getGoodsModel()); 
			dataObject.setValue(IndtlPo.COLUMNS.GOODS_SPEC.name(), indtlPo.getGoodsSpec()); 
			dataObject.setValue(IndtlPo.COLUMNS.CUR.name(), indtlPo.getCur()); 
			dataObject.setValue(IndtlPo.COLUMNS.GOODS_UNIT_PRICE.name(), indtlPo.getGoodsUnitPrice()); 
			dataObject.setValue(IndtlPo.COLUMNS.CUSTOM_VALUE_AMT.name(), indtlPo.getCustomValueAmt()); 
			dataObject.setValue(IndtlPo.COLUMNS.DUTY_RATE.name(), indtlPo.getDutyRate()); 
			dataObject.setValue(IndtlPo.COLUMNS.DUTY_RATE1.name(), indtlPo.getDutyRate1()); 
			dataObject.setValue(IndtlPo.COLUMNS.CCC_CODE.name(), indtlPo.getCccCode()); 
			dataObject.setValue(IndtlPo.COLUMNS.TRADE_PRDT_NO.name(), indtlPo.getTradePrdtNo()); 
			dataObject.setValue(IndtlPo.COLUMNS.VERIFY_STATUS.name(), indtlPo.getVerifyStatus()); 
			dataObject.setValue(IndtlPo.COLUMNS.FTZ_NO.name(), indtlPo.getFtzNo()); 
			dataObject.setValue(IndtlPo.COLUMNS.FTZ_ITEM.name(), indtlPo.getFtzItem()); 
			dataObject.setValue(IndtlPo.COLUMNS.CN_TYPE.name(), indtlPo.getCnType()); 
			dataObject.setValue(IndtlPo.COLUMNS.USER_ID.name(), indtlPo.getUserId()); 
			dataObject.setValue(IndtlPo.COLUMNS.MN_NO.name(), indtlPo.getMnNo()); 
			dataObject.setValue(IndtlPo.COLUMNS.MN_DECL_TYPE.name(), indtlPo.getMnDeclType()); 
			dataObject.setValue(IndtlPo.COLUMNS.MN_DECL_NO.name(), indtlPo.getMnDeclNo()); 
			dataObject.setValue(IndtlPo.COLUMNS.MN_SEQ_NO.name(), indtlPo.getMnSeqNo()); 
			dataObject.setValue(IndtlPo.COLUMNS.MN_MARK.name(), indtlPo.getMnMark()); 
			dataObject.setValue(IndtlPo.COLUMNS.REMARK.name(), indtlPo.getRemark()); 
			dataObject.setValue(IndtlPo.COLUMNS.BOM_NO.name(), indtlPo.getBomNo()); 
			dataObject.setValue(IndtlPo.COLUMNS.BOM_VER.name(), indtlPo.getBomVer()); 
			dataObject.setValue(IndtlPo.COLUMNS.SPLIT_MARK.name(), indtlPo.getSplitMark()); 
			dataObject.setValue(IndtlPo.COLUMNS.EDIT_MARK.name(), indtlPo.getEditMark()); 
			dataObject.setValue(IndtlPo.COLUMNS.TOTAL_IN_QTY.name(), indtlPo.getTotalInQty()); 
			dataObject.setValue(IndtlPo.COLUMNS.CURRENT_QTY.name(), indtlPo.getCurrentQty()); 
			dataObject.setValue(IndtlPo.COLUMNS.ONLINE_QTY.name(), indtlPo.getOnlineQty()); 
			dataObject.setValue(IndtlPo.COLUMNS.PRDT_MARK.name(), indtlPo.getPrdtMark()); 
			dataObject.setValue(IndtlPo.COLUMNS.TRANS_ID.name(), indtlPo.getTransId()); 
			dataObject.setValue(IndtlPo.COLUMNS.OP_CODE.name(), indtlPo.getOpCode()); 
			dataObject.setValue(IndtlPo.COLUMNS.IN_STATUS.name(), indtlPo.getInStatus()); 
			dataObject.setValue(IndtlPo.COLUMNS.O_DECL_NO.name(), indtlPo.getODeclNo()); 
			dataObject.setValue(IndtlPo.COLUMNS.O_ITEM_NO.name(), indtlPo.getOItemNo()); 
			dataObject.setValue(IndtlPo.COLUMNS.NET_WEIGHT.name(), indtlPo.getNetWeight()); 
			dataObject.setValue(IndtlPo.COLUMNS.O_OP_CODE.name(), indtlPo.getOOpCode()); 
			dataObject.setValue(IndtlPo.COLUMNS.GUID.name(), indtlPo.getGuid()); 
			dataObject.setValue(IndtlPo.COLUMNS.O_OUT_GUID.name(), indtlPo.getOOutGuid()); 
			dataObject.setValue(IndtlPo.COLUMNS.REF_DOC_DATE.name(), indtlPo.getRefDocDate()); 
			dataObject.setValue(IndtlPo.COLUMNS.REF_DOC_NO.name(), indtlPo.getRefDocNo()); 
			dataObject.setValue(IndtlPo.COLUMNS.REF_DOC_VER.name(), indtlPo.getRefDocVer()); 
			dataObject.setValue(IndtlPo.COLUMNS.MN_GROUP_DATE.name(), indtlPo.getMnGroupDate()); 
			dataObject.setValue(IndtlPo.COLUMNS.PGM_REMARK.name(), indtlPo.getPgmRemark()); 
			dataObject.setValue(IndtlPo.COLUMNS.DEDUCTED_MARK.name(), indtlPo.getDeductedMark()); 
			dataObject.setValue(IndtlPo.COLUMNS.DECL_SEQ_NO.name(), indtlPo.getDeclSeqNo()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<IndtlPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(IndtlPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
