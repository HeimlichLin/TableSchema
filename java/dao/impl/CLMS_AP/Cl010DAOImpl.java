package com.doc.common.dao.impl; 
 
public class Cl010DAOImpl extends GeneralDAOImpl<Cl010Po> implements Cl010DAO { 
	public static final Cl010DAOImpl INSTANCE = new Cl010DAOImpl(); 
	public static final String TABLENAME = "CL010"; 

	public Cl010DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Cl010Po> CONVERTER = new MapConverter<Cl010Po>() { 
 
		@Override 
		public Cl010Po convert(final DataObject dataObject) { 
			final Cl010Po cl010Po = new Cl010Po(); 
			cl010Po.setRefbillno(dataObject.getString(Cl010Po.COLUMNS.REFBILLNO.name())); 
			cl010Po.setItem(BigDecimalUtils.formObj(dataObject.getValue(Cl010Po.COLUMNS.ITEM.name()))); 
			cl010Po.setDeclno(dataObject.getString(Cl010Po.COLUMNS.DECLNO.name())); 
			cl010Po.setItemno(BigDecimalUtils.formObj(dataObject.getValue(Cl010Po.COLUMNS.ITEMNO.name()))); 
			cl010Po.setRinqty(BigDecimalUtils.formObj(dataObject.getValue(Cl010Po.COLUMNS.RINQTY.name()))); 
			cl010Po.setBalance(BigDecimalUtils.formObj(dataObject.getValue(Cl010Po.COLUMNS.BALANCE.name()))); 
			cl010Po.setInrmks(dataObject.getString(Cl010Po.COLUMNS.INRMKS.name())); 
			return cl010Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Cl010Po cl010Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Cl010Po.COLUMNS.REFBILLNO.name(), cl010Po.getRefbillno()); 
			dataObject.setValue(Cl010Po.COLUMNS.ITEM.name(), cl010Po.getItem()); 
			dataObject.setValue(Cl010Po.COLUMNS.DECLNO.name(), cl010Po.getDeclno()); 
			dataObject.setValue(Cl010Po.COLUMNS.ITEMNO.name(), cl010Po.getItemno()); 
			dataObject.setValue(Cl010Po.COLUMNS.RINQTY.name(), cl010Po.getRinqty()); 
			dataObject.setValue(Cl010Po.COLUMNS.BALANCE.name(), cl010Po.getBalance()); 
			dataObject.setValue(Cl010Po.COLUMNS.INRMKS.name(), cl010Po.getInrmks()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Cl010Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Cl010Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
