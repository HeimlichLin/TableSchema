package com.doc.common.dao.impl; 
 
public class BalanceDAOImpl extends GeneralDAOImpl<BalancePo> implements BalanceDAO { 
	public static final BalanceDAOImpl INSTANCE = new BalanceDAOImpl(); 
	public static final String TABLENAME = "BALANCE"; 

	public BalanceDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<BalancePo> CONVERTER = new MapConverter<BalancePo>() { 
 
		@Override 
		public BalancePo convert(final DataObject dataObject) { 
			final BalancePo balancePo = new BalancePo(); 
			balancePo.setBfNo(dataObject.getString(BalancePo.COLUMNS.BF_NO.name())); 
			balancePo.setOutGuid(dataObject.getString(BalancePo.COLUMNS.OUT_GUID.name())); 
			balancePo.setOutNo(dataObject.getString(BalancePo.COLUMNS.OUT_NO.name())); 
			balancePo.setOutItemNo(BigDecimalUtils.formObj(dataObject.getValue(BalancePo.COLUMNS.OUT_ITEM_NO.name()))); 
			balancePo.setCommodityNo(dataObject.getString(BalancePo.COLUMNS.COMMODITY_NO.name())); 
			balancePo.setGoodsUnit(dataObject.getString(BalancePo.COLUMNS.GOODS_UNIT.name())); 
			balancePo.setBalanceQty(BigDecimalUtils.formObj(dataObject.getValue(BalancePo.COLUMNS.BALANCE_QTY.name()))); 
			balancePo.setVerifyQty(BigDecimalUtils.formObj(dataObject.getValue(BalancePo.COLUMNS.VERIFY_QTY.name()))); 
			balancePo.setVerifyStatus(dataObject.getString(BalancePo.COLUMNS.VERIFY_STATUS.name())); 
			balancePo.setExtendDoc(dataObject.getString(BalancePo.COLUMNS.EXTEND_DOC.name())); 
			balancePo.setExtendDate(dataObject.getString(BalancePo.COLUMNS.EXTEND_DATE.name())); 
			balancePo.setExpireMark(dataObject.getString(BalancePo.COLUMNS.EXPIRE_MARK.name())); 
			balancePo.setCocompNo(dataObject.getString(BalancePo.COLUMNS.COCOMP_NO.name())); 
			balancePo.setCtmCode(dataObject.getString(BalancePo.COLUMNS.CTM_CODE.name())); 
			balancePo.setCreateDatm(dataObject.getString(BalancePo.COLUMNS.CREATE_DATM.name())); 
			balancePo.setOutStorageArea(dataObject.getString(BalancePo.COLUMNS.OUT_STORAGE_AREA.name())); 
			balancePo.setEditMark(dataObject.getString(BalancePo.COLUMNS.EDIT_MARK.name())); 
			balancePo.setApproveDoc(dataObject.getString(BalancePo.COLUMNS.APPROVE_DOC.name())); 
			balancePo.setApproveDate(dataObject.getString(BalancePo.COLUMNS.APPROVE_DATE.name())); 
			return balancePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final BalancePo balancePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(BalancePo.COLUMNS.BF_NO.name(), balancePo.getBfNo()); 
			dataObject.setValue(BalancePo.COLUMNS.OUT_GUID.name(), balancePo.getOutGuid()); 
			dataObject.setValue(BalancePo.COLUMNS.OUT_NO.name(), balancePo.getOutNo()); 
			dataObject.setValue(BalancePo.COLUMNS.OUT_ITEM_NO.name(), balancePo.getOutItemNo()); 
			dataObject.setValue(BalancePo.COLUMNS.COMMODITY_NO.name(), balancePo.getCommodityNo()); 
			dataObject.setValue(BalancePo.COLUMNS.GOODS_UNIT.name(), balancePo.getGoodsUnit()); 
			dataObject.setValue(BalancePo.COLUMNS.BALANCE_QTY.name(), balancePo.getBalanceQty()); 
			dataObject.setValue(BalancePo.COLUMNS.VERIFY_QTY.name(), balancePo.getVerifyQty()); 
			dataObject.setValue(BalancePo.COLUMNS.VERIFY_STATUS.name(), balancePo.getVerifyStatus()); 
			dataObject.setValue(BalancePo.COLUMNS.EXTEND_DOC.name(), balancePo.getExtendDoc()); 
			dataObject.setValue(BalancePo.COLUMNS.EXTEND_DATE.name(), balancePo.getExtendDate()); 
			dataObject.setValue(BalancePo.COLUMNS.EXPIRE_MARK.name(), balancePo.getExpireMark()); 
			dataObject.setValue(BalancePo.COLUMNS.COCOMP_NO.name(), balancePo.getCocompNo()); 
			dataObject.setValue(BalancePo.COLUMNS.CTM_CODE.name(), balancePo.getCtmCode()); 
			dataObject.setValue(BalancePo.COLUMNS.CREATE_DATM.name(), balancePo.getCreateDatm()); 
			dataObject.setValue(BalancePo.COLUMNS.OUT_STORAGE_AREA.name(), balancePo.getOutStorageArea()); 
			dataObject.setValue(BalancePo.COLUMNS.EDIT_MARK.name(), balancePo.getEditMark()); 
			dataObject.setValue(BalancePo.COLUMNS.APPROVE_DOC.name(), balancePo.getApproveDoc()); 
			dataObject.setValue(BalancePo.COLUMNS.APPROVE_DATE.name(), balancePo.getApproveDate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<BalancePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(BalancePo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
