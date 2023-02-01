package com.doc.common.dao.impl; 
 
public class BaldtlTDAOImpl extends GeneralDAOImpl<BaldtlTPo> implements BaldtlTDAO { 
	public static final BaldtlTDAOImpl INSTANCE = new BaldtlTDAOImpl(); 
	public static final String TABLENAME = "BALDTL_T"; 

	public BaldtlTDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<BaldtlTPo> CONVERTER = new MapConverter<BaldtlTPo>() { 
 
		@Override 
		public BaldtlTPo convert(final DataObject dataObject) { 
			final BaldtlTPo baldtlTPo = new BaldtlTPo(); 
			baldtlTPo.setBfNo(dataObject.getString(BaldtlTPo.COLUMNS.BF_NO.name())); 
			baldtlTPo.setDeclNo(dataObject.getString(BaldtlTPo.COLUMNS.DECL_NO.name())); 
			baldtlTPo.setItemNo(BigDecimalUtils.formObj(dataObject.getValue(BaldtlTPo.COLUMNS.ITEM_NO.name()))); 
			baldtlTPo.setDeclType(dataObject.getString(BaldtlTPo.COLUMNS.DECL_TYPE.name())); 
			baldtlTPo.setCommodityNo(dataObject.getString(BaldtlTPo.COLUMNS.COMMODITY_NO.name())); 
			baldtlTPo.setInQty(BigDecimalUtils.formObj(dataObject.getValue(BaldtlTPo.COLUMNS.IN_QTY.name()))); 
			baldtlTPo.setRefDocNo(dataObject.getString(BaldtlTPo.COLUMNS.REF_DOC_NO.name())); 
			baldtlTPo.setRefDocVer(dataObject.getString(BaldtlTPo.COLUMNS.REF_DOC_VER.name())); 
			baldtlTPo.setVerifyQty(BigDecimalUtils.formObj(dataObject.getValue(BaldtlTPo.COLUMNS.VERIFY_QTY.name()))); 
			baldtlTPo.setVerifyStatus(dataObject.getString(BaldtlTPo.COLUMNS.VERIFY_STATUS.name())); 
			baldtlTPo.setUserId(dataObject.getString(BaldtlTPo.COLUMNS.USER_ID.name())); 
			baldtlTPo.setCreateDatm(dataObject.getString(BaldtlTPo.COLUMNS.CREATE_DATM.name())); 
			baldtlTPo.setVerifyDeliverType(dataObject.getString(BaldtlTPo.COLUMNS.VERIFY_DELIVER_TYPE.name())); 
			baldtlTPo.setGoodsUnit(dataObject.getString(BaldtlTPo.COLUMNS.GOODS_UNIT.name())); 
			baldtlTPo.setRefGuid(dataObject.getString(BaldtlTPo.COLUMNS.REF_GUID.name())); 
			baldtlTPo.setDutyType(dataObject.getString(BaldtlTPo.COLUMNS.DUTY_TYPE.name())); 
			baldtlTPo.setEfDeclNo(dataObject.getString(BaldtlTPo.COLUMNS.EF_DECL_NO.name())); 
			baldtlTPo.setEfItemNo(BigDecimalUtils.formObj(dataObject.getValue(BaldtlTPo.COLUMNS.EF_ITEM_NO.name()))); 
			baldtlTPo.setCocompNo(dataObject.getString(BaldtlTPo.COLUMNS.COCOMP_NO.name())); 
			baldtlTPo.setCtmCode(dataObject.getString(BaldtlTPo.COLUMNS.CTM_CODE.name())); 
			baldtlTPo.setInvtryType(dataObject.getString(BaldtlTPo.COLUMNS.INVTRY_TYPE.name())); 
			baldtlTPo.setOutStorageArea(dataObject.getString(BaldtlTPo.COLUMNS.OUT_STORAGE_AREA.name())); 
			baldtlTPo.setOCommodityNo(dataObject.getString(BaldtlTPo.COLUMNS.O_COMMODITY_NO.name())); 
			return baldtlTPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final BaldtlTPo baldtlTPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(BaldtlTPo.COLUMNS.BF_NO.name(), baldtlTPo.getBfNo()); 
			dataObject.setValue(BaldtlTPo.COLUMNS.DECL_NO.name(), baldtlTPo.getDeclNo()); 
			dataObject.setValue(BaldtlTPo.COLUMNS.ITEM_NO.name(), baldtlTPo.getItemNo()); 
			dataObject.setValue(BaldtlTPo.COLUMNS.DECL_TYPE.name(), baldtlTPo.getDeclType()); 
			dataObject.setValue(BaldtlTPo.COLUMNS.COMMODITY_NO.name(), baldtlTPo.getCommodityNo()); 
			dataObject.setValue(BaldtlTPo.COLUMNS.IN_QTY.name(), baldtlTPo.getInQty()); 
			dataObject.setValue(BaldtlTPo.COLUMNS.REF_DOC_NO.name(), baldtlTPo.getRefDocNo()); 
			dataObject.setValue(BaldtlTPo.COLUMNS.REF_DOC_VER.name(), baldtlTPo.getRefDocVer()); 
			dataObject.setValue(BaldtlTPo.COLUMNS.VERIFY_QTY.name(), baldtlTPo.getVerifyQty()); 
			dataObject.setValue(BaldtlTPo.COLUMNS.VERIFY_STATUS.name(), baldtlTPo.getVerifyStatus()); 
			dataObject.setValue(BaldtlTPo.COLUMNS.USER_ID.name(), baldtlTPo.getUserId()); 
			dataObject.setValue(BaldtlTPo.COLUMNS.CREATE_DATM.name(), baldtlTPo.getCreateDatm()); 
			dataObject.setValue(BaldtlTPo.COLUMNS.VERIFY_DELIVER_TYPE.name(), baldtlTPo.getVerifyDeliverType()); 
			dataObject.setValue(BaldtlTPo.COLUMNS.GOODS_UNIT.name(), baldtlTPo.getGoodsUnit()); 
			dataObject.setValue(BaldtlTPo.COLUMNS.REF_GUID.name(), baldtlTPo.getRefGuid()); 
			dataObject.setValue(BaldtlTPo.COLUMNS.DUTY_TYPE.name(), baldtlTPo.getDutyType()); 
			dataObject.setValue(BaldtlTPo.COLUMNS.EF_DECL_NO.name(), baldtlTPo.getEfDeclNo()); 
			dataObject.setValue(BaldtlTPo.COLUMNS.EF_ITEM_NO.name(), baldtlTPo.getEfItemNo()); 
			dataObject.setValue(BaldtlTPo.COLUMNS.COCOMP_NO.name(), baldtlTPo.getCocompNo()); 
			dataObject.setValue(BaldtlTPo.COLUMNS.CTM_CODE.name(), baldtlTPo.getCtmCode()); 
			dataObject.setValue(BaldtlTPo.COLUMNS.INVTRY_TYPE.name(), baldtlTPo.getInvtryType()); 
			dataObject.setValue(BaldtlTPo.COLUMNS.OUT_STORAGE_AREA.name(), baldtlTPo.getOutStorageArea()); 
			dataObject.setValue(BaldtlTPo.COLUMNS.O_COMMODITY_NO.name(), baldtlTPo.getOCommodityNo()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<BaldtlTPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(BaldtlTPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
