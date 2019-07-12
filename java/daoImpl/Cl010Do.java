package com.doc.common.dao.impl; 
 
public class Cl010DAO extends GeneralDAOImpl<Cl010Do> implements Cl010DAO { 
	public static final Cl010DAOImpl INSTANCE = new Cl010DAOImpl(); 
	public static final String TABLENAME = "CL010"; 

	public Cl010DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<Cl010Do> CONVERTER = new MapConverter<Cl010Do>() { 
 
		@Override 
		public Cl010Do convert(final DataObject dataObject) { 
			final Cl010Do cl010Do = new Cl010Do(); 
			cl010Do.setRefbillno(dataObject.getString(Cl010Do.COLUMNS.REFBILLNO.name())); 
			cl010Do.setItem(BigDecimalUtils.formObj(dataObject.getString(Cl010Do.COLUMNS.ITEM.name()))); 
			cl010Do.setDeclno(dataObject.getString(Cl010Do.COLUMNS.DECLNO.name())); 
			cl010Do.setItemno(BigDecimalUtils.formObj(dataObject.getString(Cl010Do.COLUMNS.ITEMNO.name()))); 
			cl010Do.setRinqty(BigDecimalUtils.formObj(dataObject.getString(Cl010Do.COLUMNS.RINQTY.name()))); 
			cl010Do.setBalance(BigDecimalUtils.formObj(dataObject.getString(Cl010Do.COLUMNS.BALANCE.name()))); 
			cl010Do.setInrmks(dataObject.getString(Cl010Do.COLUMNS.INRMKS.name())); 
			return cl010Do; 
		} 
 
		@Override 
		public DataObject toDataObject(final Cl010Do cl010Do) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Cl010Do.COLUMNS.REFBILLNO.name(), cl010Do.getRefbillno()); 
			dataObject.setValue(Cl010Do.COLUMNS.ITEM.name(), cl010Do.getItem()); 
			dataObject.setValue(Cl010Do.COLUMNS.DECLNO.name(), cl010Do.getDeclno()); 
			dataObject.setValue(Cl010Do.COLUMNS.ITEMNO.name(), cl010Do.getItemno()); 
			dataObject.setValue(Cl010Do.COLUMNS.RINQTY.name(), cl010Do.getRinqty()); 
			dataObject.setValue(Cl010Do.COLUMNS.BALANCE.name(), cl010Do.getBalance()); 
			dataObject.setValue(Cl010Do.COLUMNS.INRMKS.name(), cl010Do.getInrmks()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Cl010Do> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Cl010Do po) { 
		sqlWhere.add(Cl010Do.COLUMNS.REFBILLNO.name(), po.getRefbillno()); 
		sqlWhere.add(Cl010Do.COLUMNS.ITEM.name(), po.getItem()); 
		sqlWhere.add(Cl010Do.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(Cl010Do.COLUMNS.ITEMNO.name(), po.getItemno()); 
		sqlWhere.add(Cl010Do.COLUMNS.RINQTY.name(), po.getRinqty()); 
		sqlWhere.add(Cl010Do.COLUMNS.BALANCE.name(), po.getBalance()); 
		sqlWhere.add(Cl010Do.COLUMNS.INRMKS.name(), po.getInrmks()); 
	} 
 
} 
