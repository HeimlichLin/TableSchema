package com.doc.common.dao.impl; 
 
public class BaldtlTFDAOImpl extends GeneralDAOImpl<BaldtlTFPo> implements BaldtlTFDAO { 
	public static final BaldtlTFDAOImpl INSTANCE = new BaldtlTFDAOImpl(); 
	public static final String TABLENAME = "BALDTL_T_F"; 

	public BaldtlTFDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<BaldtlTFPo> CONVERTER = new MapConverter<BaldtlTFPo>() { 
 
		@Override 
		public BaldtlTFPo convert(final DataObject dataObject) { 
			final BaldtlTFPo baldtlTFPo = new BaldtlTFPo(); 
			baldtlTFPo.setBfNo(dataObject.getString(BaldtlTFPo.COLUMNS.BF_NO.name())); 
			baldtlTFPo.setDeclNo(dataObject.getString(BaldtlTFPo.COLUMNS.DECL_NO.name())); 
			baldtlTFPo.setItemNo(BigDecimalUtils.formObj(dataObject.getValue(BaldtlTFPo.COLUMNS.ITEM_NO.name()))); 
			baldtlTFPo.setDeclType(dataObject.getString(BaldtlTFPo.COLUMNS.DECL_TYPE.name())); 
			baldtlTFPo.setCommodityNo(dataObject.getString(BaldtlTFPo.COLUMNS.COMMODITY_NO.name())); 
			baldtlTFPo.setInQty(BigDecimalUtils.formObj(dataObject.getValue(BaldtlTFPo.COLUMNS.IN_QTY.name()))); 
			baldtlTFPo.setRefDocNo(dataObject.getString(BaldtlTFPo.COLUMNS.REF_DOC_NO.name())); 
			baldtlTFPo.setRefDocVer(dataObject.getString(BaldtlTFPo.COLUMNS.REF_DOC_VER.name())); 
			baldtlTFPo.setVerifyQty(BigDecimalUtils.formObj(dataObject.getValue(BaldtlTFPo.COLUMNS.VERIFY_QTY.name()))); 
			baldtlTFPo.setVerifyStatus(dataObject.getString(BaldtlTFPo.COLUMNS.VERIFY_STATUS.name())); 
			baldtlTFPo.setUserId(dataObject.getString(BaldtlTFPo.COLUMNS.USER_ID.name())); 
			baldtlTFPo.setCreateDatm(dataObject.getString(BaldtlTFPo.COLUMNS.CREATE_DATM.name())); 
			baldtlTFPo.setVerifyDeliverType(dataObject.getString(BaldtlTFPo.COLUMNS.VERIFY_DELIVER_TYPE.name())); 
			baldtlTFPo.setGoodsUnit(dataObject.getString(BaldtlTFPo.COLUMNS.GOODS_UNIT.name())); 
			baldtlTFPo.setRefGuid(dataObject.getString(BaldtlTFPo.COLUMNS.REF_GUID.name())); 
			baldtlTFPo.setDutyType(dataObject.getString(BaldtlTFPo.COLUMNS.DUTY_TYPE.name())); 
			baldtlTFPo.setEfDeclNo(dataObject.getString(BaldtlTFPo.COLUMNS.EF_DECL_NO.name())); 
			baldtlTFPo.setEfItemNo(BigDecimalUtils.formObj(dataObject.getValue(BaldtlTFPo.COLUMNS.EF_ITEM_NO.name()))); 
			baldtlTFPo.setCocompNo(dataObject.getString(BaldtlTFPo.COLUMNS.COCOMP_NO.name())); 
			baldtlTFPo.setCtmCode(dataObject.getString(BaldtlTFPo.COLUMNS.CTM_CODE.name())); 
			baldtlTFPo.setInvtryType(dataObject.getString(BaldtlTFPo.COLUMNS.INVTRY_TYPE.name())); 
			baldtlTFPo.setOutStorageArea(dataObject.getString(BaldtlTFPo.COLUMNS.OUT_STORAGE_AREA.name())); 
			baldtlTFPo.setOCommodityNo(dataObject.getString(BaldtlTFPo.COLUMNS.O_COMMODITY_NO.name())); 
			return baldtlTFPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final BaldtlTFPo baldtlTFPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(BaldtlTFPo.COLUMNS.BF_NO.name(), baldtlTFPo.getBfNo()); 
			dataObject.setValue(BaldtlTFPo.COLUMNS.DECL_NO.name(), baldtlTFPo.getDeclNo()); 
			dataObject.setValue(BaldtlTFPo.COLUMNS.ITEM_NO.name(), baldtlTFPo.getItemNo()); 
			dataObject.setValue(BaldtlTFPo.COLUMNS.DECL_TYPE.name(), baldtlTFPo.getDeclType()); 
			dataObject.setValue(BaldtlTFPo.COLUMNS.COMMODITY_NO.name(), baldtlTFPo.getCommodityNo()); 
			dataObject.setValue(BaldtlTFPo.COLUMNS.IN_QTY.name(), baldtlTFPo.getInQty()); 
			dataObject.setValue(BaldtlTFPo.COLUMNS.REF_DOC_NO.name(), baldtlTFPo.getRefDocNo()); 
			dataObject.setValue(BaldtlTFPo.COLUMNS.REF_DOC_VER.name(), baldtlTFPo.getRefDocVer()); 
			dataObject.setValue(BaldtlTFPo.COLUMNS.VERIFY_QTY.name(), baldtlTFPo.getVerifyQty()); 
			dataObject.setValue(BaldtlTFPo.COLUMNS.VERIFY_STATUS.name(), baldtlTFPo.getVerifyStatus()); 
			dataObject.setValue(BaldtlTFPo.COLUMNS.USER_ID.name(), baldtlTFPo.getUserId()); 
			dataObject.setValue(BaldtlTFPo.COLUMNS.CREATE_DATM.name(), baldtlTFPo.getCreateDatm()); 
			dataObject.setValue(BaldtlTFPo.COLUMNS.VERIFY_DELIVER_TYPE.name(), baldtlTFPo.getVerifyDeliverType()); 
			dataObject.setValue(BaldtlTFPo.COLUMNS.GOODS_UNIT.name(), baldtlTFPo.getGoodsUnit()); 
			dataObject.setValue(BaldtlTFPo.COLUMNS.REF_GUID.name(), baldtlTFPo.getRefGuid()); 
			dataObject.setValue(BaldtlTFPo.COLUMNS.DUTY_TYPE.name(), baldtlTFPo.getDutyType()); 
			dataObject.setValue(BaldtlTFPo.COLUMNS.EF_DECL_NO.name(), baldtlTFPo.getEfDeclNo()); 
			dataObject.setValue(BaldtlTFPo.COLUMNS.EF_ITEM_NO.name(), baldtlTFPo.getEfItemNo()); 
			dataObject.setValue(BaldtlTFPo.COLUMNS.COCOMP_NO.name(), baldtlTFPo.getCocompNo()); 
			dataObject.setValue(BaldtlTFPo.COLUMNS.CTM_CODE.name(), baldtlTFPo.getCtmCode()); 
			dataObject.setValue(BaldtlTFPo.COLUMNS.INVTRY_TYPE.name(), baldtlTFPo.getInvtryType()); 
			dataObject.setValue(BaldtlTFPo.COLUMNS.OUT_STORAGE_AREA.name(), baldtlTFPo.getOutStorageArea()); 
			dataObject.setValue(BaldtlTFPo.COLUMNS.O_COMMODITY_NO.name(), baldtlTFPo.getOCommodityNo()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<BaldtlTFPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(BaldtlTFPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
