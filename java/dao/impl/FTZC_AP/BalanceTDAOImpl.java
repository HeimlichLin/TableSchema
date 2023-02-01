package com.doc.common.dao.impl; 
 
public class BalanceTDAOImpl extends GeneralDAOImpl<BalanceTPo> implements BalanceTDAO { 
	public static final BalanceTDAOImpl INSTANCE = new BalanceTDAOImpl(); 
	public static final String TABLENAME = "BALANCE_T"; 

	public BalanceTDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<BalanceTPo> CONVERTER = new MapConverter<BalanceTPo>() { 
 
		@Override 
		public BalanceTPo convert(final DataObject dataObject) { 
			final BalanceTPo balanceTPo = new BalanceTPo(); 
			balanceTPo.setBfNo(dataObject.getString(BalanceTPo.COLUMNS.BF_NO.name())); 
			balanceTPo.setDeclNo(dataObject.getString(BalanceTPo.COLUMNS.DECL_NO.name())); 
			balanceTPo.setItemNo(BigDecimalUtils.formObj(dataObject.getValue(BalanceTPo.COLUMNS.ITEM_NO.name()))); 
			balanceTPo.setCommodityNo(dataObject.getString(BalanceTPo.COLUMNS.COMMODITY_NO.name())); 
			balanceTPo.setGoodsUnit(dataObject.getString(BalanceTPo.COLUMNS.GOODS_UNIT.name())); 
			balanceTPo.setBalanceQty(BigDecimalUtils.formObj(dataObject.getValue(BalanceTPo.COLUMNS.BALANCE_QTY.name()))); 
			balanceTPo.setVerifyQty(BigDecimalUtils.formObj(dataObject.getValue(BalanceTPo.COLUMNS.VERIFY_QTY.name()))); 
			balanceTPo.setVerifyStatus(dataObject.getString(BalanceTPo.COLUMNS.VERIFY_STATUS.name())); 
			balanceTPo.setExtendDoc(dataObject.getString(BalanceTPo.COLUMNS.EXTEND_DOC.name())); 
			balanceTPo.setExtendDate(dataObject.getString(BalanceTPo.COLUMNS.EXTEND_DATE.name())); 
			balanceTPo.setExpireMark(dataObject.getString(BalanceTPo.COLUMNS.EXPIRE_MARK.name())); 
			balanceTPo.setCocompNo(dataObject.getString(BalanceTPo.COLUMNS.COCOMP_NO.name())); 
			balanceTPo.setCtmCode(dataObject.getString(BalanceTPo.COLUMNS.CTM_CODE.name())); 
			balanceTPo.setCreateDatm(dataObject.getString(BalanceTPo.COLUMNS.CREATE_DATM.name())); 
			balanceTPo.setEditMark(dataObject.getString(BalanceTPo.COLUMNS.EDIT_MARK.name())); 
			balanceTPo.setApproveDoc(dataObject.getString(BalanceTPo.COLUMNS.APPROVE_DOC.name())); 
			balanceTPo.setApproveDate(dataObject.getString(BalanceTPo.COLUMNS.APPROVE_DATE.name())); 
			balanceTPo.setYzDeclNo(dataObject.getString(BalanceTPo.COLUMNS.YZ_DECL_NO.name())); 
			balanceTPo.setYzItemNo(BigDecimalUtils.formObj(dataObject.getValue(BalanceTPo.COLUMNS.YZ_ITEM_NO.name()))); 
			balanceTPo.setInvtryType(dataObject.getString(BalanceTPo.COLUMNS.INVTRY_TYPE.name())); 
			balanceTPo.setOutStorageArea(dataObject.getString(BalanceTPo.COLUMNS.OUT_STORAGE_AREA.name())); 
			return balanceTPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final BalanceTPo balanceTPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(BalanceTPo.COLUMNS.BF_NO.name(), balanceTPo.getBfNo()); 
			dataObject.setValue(BalanceTPo.COLUMNS.DECL_NO.name(), balanceTPo.getDeclNo()); 
			dataObject.setValue(BalanceTPo.COLUMNS.ITEM_NO.name(), balanceTPo.getItemNo()); 
			dataObject.setValue(BalanceTPo.COLUMNS.COMMODITY_NO.name(), balanceTPo.getCommodityNo()); 
			dataObject.setValue(BalanceTPo.COLUMNS.GOODS_UNIT.name(), balanceTPo.getGoodsUnit()); 
			dataObject.setValue(BalanceTPo.COLUMNS.BALANCE_QTY.name(), balanceTPo.getBalanceQty()); 
			dataObject.setValue(BalanceTPo.COLUMNS.VERIFY_QTY.name(), balanceTPo.getVerifyQty()); 
			dataObject.setValue(BalanceTPo.COLUMNS.VERIFY_STATUS.name(), balanceTPo.getVerifyStatus()); 
			dataObject.setValue(BalanceTPo.COLUMNS.EXTEND_DOC.name(), balanceTPo.getExtendDoc()); 
			dataObject.setValue(BalanceTPo.COLUMNS.EXTEND_DATE.name(), balanceTPo.getExtendDate()); 
			dataObject.setValue(BalanceTPo.COLUMNS.EXPIRE_MARK.name(), balanceTPo.getExpireMark()); 
			dataObject.setValue(BalanceTPo.COLUMNS.COCOMP_NO.name(), balanceTPo.getCocompNo()); 
			dataObject.setValue(BalanceTPo.COLUMNS.CTM_CODE.name(), balanceTPo.getCtmCode()); 
			dataObject.setValue(BalanceTPo.COLUMNS.CREATE_DATM.name(), balanceTPo.getCreateDatm()); 
			dataObject.setValue(BalanceTPo.COLUMNS.EDIT_MARK.name(), balanceTPo.getEditMark()); 
			dataObject.setValue(BalanceTPo.COLUMNS.APPROVE_DOC.name(), balanceTPo.getApproveDoc()); 
			dataObject.setValue(BalanceTPo.COLUMNS.APPROVE_DATE.name(), balanceTPo.getApproveDate()); 
			dataObject.setValue(BalanceTPo.COLUMNS.YZ_DECL_NO.name(), balanceTPo.getYzDeclNo()); 
			dataObject.setValue(BalanceTPo.COLUMNS.YZ_ITEM_NO.name(), balanceTPo.getYzItemNo()); 
			dataObject.setValue(BalanceTPo.COLUMNS.INVTRY_TYPE.name(), balanceTPo.getInvtryType()); 
			dataObject.setValue(BalanceTPo.COLUMNS.OUT_STORAGE_AREA.name(), balanceTPo.getOutStorageArea()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<BalanceTPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(BalanceTPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
