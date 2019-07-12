package com.doc.common.dao.impl; 
 
public class BalanceGrntDAO extends GeneralDAOImpl<BalanceGrntDo> implements BalanceGrntDAO { 
	public static final BalanceGrntDAOImpl INSTANCE = new BalanceGrntDAOImpl(); 
	public static final String TABLENAME = "BALANCE_GRNT"; 

	public BalanceGrntDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<BalanceGrntDo> CONVERTER = new MapConverter<BalanceGrntDo>() { 
 
		@Override 
		public BalanceGrntDo convert(final DataObject dataObject) { 
			final BalanceGrntDo balanceGrntDo = new BalanceGrntDo(); 
			balanceGrntDo.setBondno(dataObject.getString(BalanceGrntDo.COLUMNS.BONDNO.name())); 
			balanceGrntDo.setStrdate(dataObject.getString(BalanceGrntDo.COLUMNS.STRDATE.name())); 
			balanceGrntDo.setDeclno(dataObject.getString(BalanceGrntDo.COLUMNS.DECLNO.name())); 
			balanceGrntDo.setItemno(BigDecimalUtils.formObj(dataObject.getString(BalanceGrntDo.COLUMNS.ITEMNO.name()))); 
			balanceGrntDo.setRefbillno(dataObject.getString(BalanceGrntDo.COLUMNS.REFBILLNO.name())); 
			balanceGrntDo.setItem(BigDecimalUtils.formObj(dataObject.getString(BalanceGrntDo.COLUMNS.ITEM.name()))); 
			balanceGrntDo.setStrqty(BigDecimalUtils.formObj(dataObject.getString(BalanceGrntDo.COLUMNS.STRQTY.name()))); 
			balanceGrntDo.setBalance(BigDecimalUtils.formObj(dataObject.getString(BalanceGrntDo.COLUMNS.BALANCE.name()))); 
			balanceGrntDo.setTaxamt(BigDecimalUtils.formObj(dataObject.getString(BalanceGrntDo.COLUMNS.TAXAMT.name()))); 
			balanceGrntDo.setPrdtno(dataObject.getString(BalanceGrntDo.COLUMNS.PRDTNO.name())); 
			balanceGrntDo.setBalanceTax(BigDecimalUtils.formObj(dataObject.getString(BalanceGrntDo.COLUMNS.BALANCE_TAX.name()))); 
			return balanceGrntDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final BalanceGrntDo balanceGrntDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(BalanceGrntDo.COLUMNS.BONDNO.name(), balanceGrntDo.getBondno()); 
			dataObject.setValue(BalanceGrntDo.COLUMNS.STRDATE.name(), balanceGrntDo.getStrdate()); 
			dataObject.setValue(BalanceGrntDo.COLUMNS.DECLNO.name(), balanceGrntDo.getDeclno()); 
			dataObject.setValue(BalanceGrntDo.COLUMNS.ITEMNO.name(), balanceGrntDo.getItemno()); 
			dataObject.setValue(BalanceGrntDo.COLUMNS.REFBILLNO.name(), balanceGrntDo.getRefbillno()); 
			dataObject.setValue(BalanceGrntDo.COLUMNS.ITEM.name(), balanceGrntDo.getItem()); 
			dataObject.setValue(BalanceGrntDo.COLUMNS.STRQTY.name(), balanceGrntDo.getStrqty()); 
			dataObject.setValue(BalanceGrntDo.COLUMNS.BALANCE.name(), balanceGrntDo.getBalance()); 
			dataObject.setValue(BalanceGrntDo.COLUMNS.TAXAMT.name(), balanceGrntDo.getTaxamt()); 
			dataObject.setValue(BalanceGrntDo.COLUMNS.PRDTNO.name(), balanceGrntDo.getPrdtno()); 
			dataObject.setValue(BalanceGrntDo.COLUMNS.BALANCE_TAX.name(), balanceGrntDo.getBalanceTax()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<BalanceGrntDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(BalanceGrntDo po) { 
		sqlWhere.add(BalanceGrntDo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(BalanceGrntDo.COLUMNS.STRDATE.name(), po.getStrdate()); 
		sqlWhere.add(BalanceGrntDo.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(BalanceGrntDo.COLUMNS.ITEMNO.name(), po.getItemno()); 
		sqlWhere.add(BalanceGrntDo.COLUMNS.REFBILLNO.name(), po.getRefbillno()); 
		sqlWhere.add(BalanceGrntDo.COLUMNS.ITEM.name(), po.getItem()); 
		sqlWhere.add(BalanceGrntDo.COLUMNS.STRQTY.name(), po.getStrqty()); 
		sqlWhere.add(BalanceGrntDo.COLUMNS.BALANCE.name(), po.getBalance()); 
		sqlWhere.add(BalanceGrntDo.COLUMNS.TAXAMT.name(), po.getTaxamt()); 
		sqlWhere.add(BalanceGrntDo.COLUMNS.PRDTNO.name(), po.getPrdtno()); 
		sqlWhere.add(BalanceGrntDo.COLUMNS.BALANCE_TAX.name(), po.getBalanceTax()); 
	} 
 
} 
