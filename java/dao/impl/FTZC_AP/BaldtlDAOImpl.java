package com.doc.common.dao.impl; 
 
public class BaldtlDAOImpl extends GeneralDAOImpl<BaldtlPo> implements BaldtlDAO { 
	public static final BaldtlDAOImpl INSTANCE = new BaldtlDAOImpl(); 
	public static final String TABLENAME = "BALDTL"; 

	public BaldtlDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<BaldtlPo> CONVERTER = new MapConverter<BaldtlPo>() { 
 
		@Override 
		public BaldtlPo convert(final DataObject dataObject) { 
			final BaldtlPo baldtlPo = new BaldtlPo(); 
			baldtlPo.setMGuid(dataObject.getString(BaldtlPo.COLUMNS.M_GUID.name())); 
			baldtlPo.setBfNo(dataObject.getString(BaldtlPo.COLUMNS.BF_NO.name())); 
			baldtlPo.setInGuid(dataObject.getString(BaldtlPo.COLUMNS.IN_GUID.name())); 
			baldtlPo.setDeclNo(dataObject.getString(BaldtlPo.COLUMNS.DECL_NO.name())); 
			baldtlPo.setItemNo(BigDecimalUtils.formObj(dataObject.getValue(BaldtlPo.COLUMNS.ITEM_NO.name()))); 
			baldtlPo.setDeclType(dataObject.getString(BaldtlPo.COLUMNS.DECL_TYPE.name())); 
			baldtlPo.setCommodityNo(dataObject.getString(BaldtlPo.COLUMNS.COMMODITY_NO.name())); 
			baldtlPo.setInQty(BigDecimalUtils.formObj(dataObject.getValue(BaldtlPo.COLUMNS.IN_QTY.name()))); 
			baldtlPo.setRefDocNo(dataObject.getString(BaldtlPo.COLUMNS.REF_DOC_NO.name())); 
			baldtlPo.setRefDocVer(dataObject.getString(BaldtlPo.COLUMNS.REF_DOC_VER.name())); 
			baldtlPo.setVerifyQty(BigDecimalUtils.formObj(dataObject.getValue(BaldtlPo.COLUMNS.VERIFY_QTY.name()))); 
			baldtlPo.setVerifyStatus(dataObject.getString(BaldtlPo.COLUMNS.VERIFY_STATUS.name())); 
			baldtlPo.setUserId(dataObject.getString(BaldtlPo.COLUMNS.USER_ID.name())); 
			baldtlPo.setCreateDatm(dataObject.getString(BaldtlPo.COLUMNS.CREATE_DATM.name())); 
			baldtlPo.setVerifyDeliverType(dataObject.getString(BaldtlPo.COLUMNS.VERIFY_DELIVER_TYPE.name())); 
			baldtlPo.setGoodsUnit(dataObject.getString(BaldtlPo.COLUMNS.GOODS_UNIT.name())); 
			baldtlPo.setRefGuid(dataObject.getString(BaldtlPo.COLUMNS.REF_GUID.name())); 
			baldtlPo.setDutyType(dataObject.getString(BaldtlPo.COLUMNS.DUTY_TYPE.name())); 
			baldtlPo.setOutStorageArea(dataObject.getString(BaldtlPo.COLUMNS.OUT_STORAGE_AREA.name())); 
			baldtlPo.setUnitQty(BigDecimalUtils.formObj(dataObject.getValue(BaldtlPo.COLUMNS.UNIT_QTY.name()))); 
			return baldtlPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final BaldtlPo baldtlPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(BaldtlPo.COLUMNS.M_GUID.name(), baldtlPo.getMGuid()); 
			dataObject.setValue(BaldtlPo.COLUMNS.BF_NO.name(), baldtlPo.getBfNo()); 
			dataObject.setValue(BaldtlPo.COLUMNS.IN_GUID.name(), baldtlPo.getInGuid()); 
			dataObject.setValue(BaldtlPo.COLUMNS.DECL_NO.name(), baldtlPo.getDeclNo()); 
			dataObject.setValue(BaldtlPo.COLUMNS.ITEM_NO.name(), baldtlPo.getItemNo()); 
			dataObject.setValue(BaldtlPo.COLUMNS.DECL_TYPE.name(), baldtlPo.getDeclType()); 
			dataObject.setValue(BaldtlPo.COLUMNS.COMMODITY_NO.name(), baldtlPo.getCommodityNo()); 
			dataObject.setValue(BaldtlPo.COLUMNS.IN_QTY.name(), baldtlPo.getInQty()); 
			dataObject.setValue(BaldtlPo.COLUMNS.REF_DOC_NO.name(), baldtlPo.getRefDocNo()); 
			dataObject.setValue(BaldtlPo.COLUMNS.REF_DOC_VER.name(), baldtlPo.getRefDocVer()); 
			dataObject.setValue(BaldtlPo.COLUMNS.VERIFY_QTY.name(), baldtlPo.getVerifyQty()); 
			dataObject.setValue(BaldtlPo.COLUMNS.VERIFY_STATUS.name(), baldtlPo.getVerifyStatus()); 
			dataObject.setValue(BaldtlPo.COLUMNS.USER_ID.name(), baldtlPo.getUserId()); 
			dataObject.setValue(BaldtlPo.COLUMNS.CREATE_DATM.name(), baldtlPo.getCreateDatm()); 
			dataObject.setValue(BaldtlPo.COLUMNS.VERIFY_DELIVER_TYPE.name(), baldtlPo.getVerifyDeliverType()); 
			dataObject.setValue(BaldtlPo.COLUMNS.GOODS_UNIT.name(), baldtlPo.getGoodsUnit()); 
			dataObject.setValue(BaldtlPo.COLUMNS.REF_GUID.name(), baldtlPo.getRefGuid()); 
			dataObject.setValue(BaldtlPo.COLUMNS.DUTY_TYPE.name(), baldtlPo.getDutyType()); 
			dataObject.setValue(BaldtlPo.COLUMNS.OUT_STORAGE_AREA.name(), baldtlPo.getOutStorageArea()); 
			dataObject.setValue(BaldtlPo.COLUMNS.UNIT_QTY.name(), baldtlPo.getUnitQty()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<BaldtlPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(BaldtlPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
