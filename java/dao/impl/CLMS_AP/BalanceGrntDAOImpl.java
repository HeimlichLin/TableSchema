package com.doc.common.dao.impl; 
 
public class BalanceGrntDAOImpl extends GeneralDAOImpl<BalanceGrntPo> implements BalanceGrntDAO { 
	public static final BalanceGrntDAOImpl INSTANCE = new BalanceGrntDAOImpl(); 
	public static final String TABLENAME = "BALANCE_GRNT"; 

	public BalanceGrntDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<BalanceGrntPo> CONVERTER = new MapConverter<BalanceGrntPo>() { 
 
		@Override 
		public BalanceGrntPo convert(final DataObject dataObject) { 
			final BalanceGrntPo balanceGrntPo = new BalanceGrntPo(); 
			balanceGrntPo.setBondno(dataObject.getString(BalanceGrntPo.COLUMNS.BONDNO.name())); 
			balanceGrntPo.setStrdate(dataObject.getString(BalanceGrntPo.COLUMNS.STRDATE.name())); 
			balanceGrntPo.setDeclno(dataObject.getString(BalanceGrntPo.COLUMNS.DECLNO.name())); 
			balanceGrntPo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(BalanceGrntPo.COLUMNS.ITEMNO.name()))); 
			balanceGrntPo.setRefbillno(dataObject.getString(BalanceGrntPo.COLUMNS.REFBILLNO.name())); 
			balanceGrntPo.setItem(BigDecimalUtils.formObj(dataObject.getValue(BalanceGrntPo.COLUMNS.ITEM.name()))); 
			balanceGrntPo.setStrqty(BigDecimalUtils.formObj(dataObject.getValue(BalanceGrntPo.COLUMNS.STRQTY.name()))); 
			balanceGrntPo.setBalance(BigDecimalUtils.formObj(dataObject.getValue(BalanceGrntPo.COLUMNS.BALANCE.name()))); 
			balanceGrntPo.setTaxamt(BigDecimalUtils.formObj(dataObject.getValue(BalanceGrntPo.COLUMNS.TAXAMT.name()))); 
			balanceGrntPo.setPrdtno(dataObject.getString(BalanceGrntPo.COLUMNS.PRDTNO.name())); 
			balanceGrntPo.setBalanceTax(BigDecimalUtils.formObj(dataObject.getValue(BalanceGrntPo.COLUMNS.BALANCE_TAX.name()))); 
			return balanceGrntPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final BalanceGrntPo balanceGrntPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(BalanceGrntPo.COLUMNS.BONDNO.name(), balanceGrntPo.getBondno()); 
			dataObject.setValue(BalanceGrntPo.COLUMNS.STRDATE.name(), balanceGrntPo.getStrdate()); 
			dataObject.setValue(BalanceGrntPo.COLUMNS.DECLNO.name(), balanceGrntPo.getDeclno()); 
			dataObject.setValue(BalanceGrntPo.COLUMNS.ITEMNO.name(), balanceGrntPo.getItemno()); 
			dataObject.setValue(BalanceGrntPo.COLUMNS.REFBILLNO.name(), balanceGrntPo.getRefbillno()); 
			dataObject.setValue(BalanceGrntPo.COLUMNS.ITEM.name(), balanceGrntPo.getItem()); 
			dataObject.setValue(BalanceGrntPo.COLUMNS.STRQTY.name(), balanceGrntPo.getStrqty()); 
			dataObject.setValue(BalanceGrntPo.COLUMNS.BALANCE.name(), balanceGrntPo.getBalance()); 
			dataObject.setValue(BalanceGrntPo.COLUMNS.TAXAMT.name(), balanceGrntPo.getTaxamt()); 
			dataObject.setValue(BalanceGrntPo.COLUMNS.PRDTNO.name(), balanceGrntPo.getPrdtno()); 
			dataObject.setValue(BalanceGrntPo.COLUMNS.BALANCE_TAX.name(), balanceGrntPo.getBalanceTax()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<BalanceGrntPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(BalanceGrntPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
