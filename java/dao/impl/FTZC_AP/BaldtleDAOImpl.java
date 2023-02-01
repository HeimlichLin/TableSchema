package com.doc.common.dao.impl; 
 
public class BaldtleDAOImpl extends GeneralDAOImpl<BaldtlePo> implements BaldtleDAO { 
	public static final BaldtleDAOImpl INSTANCE = new BaldtleDAOImpl(); 
	public static final String TABLENAME = "BALDTLE"; 

	public BaldtleDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<BaldtlePo> CONVERTER = new MapConverter<BaldtlePo>() { 
 
		@Override 
		public BaldtlePo convert(final DataObject dataObject) { 
			final BaldtlePo baldtlePo = new BaldtlePo(); 
			baldtlePo.setBfNo(dataObject.getString(BaldtlePo.COLUMNS.BF_NO.name())); 
			baldtlePo.setInGuid(dataObject.getString(BaldtlePo.COLUMNS.IN_GUID.name())); 
			baldtlePo.setDeclNo(dataObject.getString(BaldtlePo.COLUMNS.DECL_NO.name())); 
			baldtlePo.setItemNo(BigDecimalUtils.formObj(dataObject.getValue(BaldtlePo.COLUMNS.ITEM_NO.name()))); 
			baldtlePo.setDeclType(dataObject.getString(BaldtlePo.COLUMNS.DECL_TYPE.name())); 
			baldtlePo.setCommodityNo(dataObject.getString(BaldtlePo.COLUMNS.COMMODITY_NO.name())); 
			baldtlePo.setGoodsUnit(dataObject.getString(BaldtlePo.COLUMNS.GOODS_UNIT.name())); 
			baldtlePo.setInQty(BigDecimalUtils.formObj(dataObject.getValue(BaldtlePo.COLUMNS.IN_QTY.name()))); 
			baldtlePo.setRefDocNo(dataObject.getString(BaldtlePo.COLUMNS.REF_DOC_NO.name())); 
			baldtlePo.setRefDocVer(dataObject.getString(BaldtlePo.COLUMNS.REF_DOC_VER.name())); 
			baldtlePo.setVerifyDeliverType(dataObject.getString(BaldtlePo.COLUMNS.VERIFY_DELIVER_TYPE.name())); 
			baldtlePo.setVerifyQty(BigDecimalUtils.formObj(dataObject.getValue(BaldtlePo.COLUMNS.VERIFY_QTY.name()))); 
			baldtlePo.setVerifyStatus(dataObject.getString(BaldtlePo.COLUMNS.VERIFY_STATUS.name())); 
			baldtlePo.setUserId(dataObject.getString(BaldtlePo.COLUMNS.USER_ID.name())); 
			baldtlePo.setCreateDatm(dataObject.getString(BaldtlePo.COLUMNS.CREATE_DATM.name())); 
			baldtlePo.setRefGuid(dataObject.getString(BaldtlePo.COLUMNS.REF_GUID.name())); 
			return baldtlePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final BaldtlePo baldtlePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(BaldtlePo.COLUMNS.BF_NO.name(), baldtlePo.getBfNo()); 
			dataObject.setValue(BaldtlePo.COLUMNS.IN_GUID.name(), baldtlePo.getInGuid()); 
			dataObject.setValue(BaldtlePo.COLUMNS.DECL_NO.name(), baldtlePo.getDeclNo()); 
			dataObject.setValue(BaldtlePo.COLUMNS.ITEM_NO.name(), baldtlePo.getItemNo()); 
			dataObject.setValue(BaldtlePo.COLUMNS.DECL_TYPE.name(), baldtlePo.getDeclType()); 
			dataObject.setValue(BaldtlePo.COLUMNS.COMMODITY_NO.name(), baldtlePo.getCommodityNo()); 
			dataObject.setValue(BaldtlePo.COLUMNS.GOODS_UNIT.name(), baldtlePo.getGoodsUnit()); 
			dataObject.setValue(BaldtlePo.COLUMNS.IN_QTY.name(), baldtlePo.getInQty()); 
			dataObject.setValue(BaldtlePo.COLUMNS.REF_DOC_NO.name(), baldtlePo.getRefDocNo()); 
			dataObject.setValue(BaldtlePo.COLUMNS.REF_DOC_VER.name(), baldtlePo.getRefDocVer()); 
			dataObject.setValue(BaldtlePo.COLUMNS.VERIFY_DELIVER_TYPE.name(), baldtlePo.getVerifyDeliverType()); 
			dataObject.setValue(BaldtlePo.COLUMNS.VERIFY_QTY.name(), baldtlePo.getVerifyQty()); 
			dataObject.setValue(BaldtlePo.COLUMNS.VERIFY_STATUS.name(), baldtlePo.getVerifyStatus()); 
			dataObject.setValue(BaldtlePo.COLUMNS.USER_ID.name(), baldtlePo.getUserId()); 
			dataObject.setValue(BaldtlePo.COLUMNS.CREATE_DATM.name(), baldtlePo.getCreateDatm()); 
			dataObject.setValue(BaldtlePo.COLUMNS.REF_GUID.name(), baldtlePo.getRefGuid()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<BaldtlePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(BaldtlePo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
