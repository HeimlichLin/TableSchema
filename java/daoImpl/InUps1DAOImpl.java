package com.doc.common.dao.impl; 
 
public class InUps1DAOImpl extends GeneralDAOImpl<InUps1Do> implements InUps1DAOImpl { 
	public static final InUps1DAOImpl INSTANCE = new InUps1DAOImpl(); 
	public static final String TABLENAME = "IN_UPS1"; 

	public InUps1DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<InUps1Do> CONVERTER = new MapConverter<InUps1Do>() { 
 
		@Override 
		public InUps1Do convert(final DataObject dataObject) { 
			final InUps1Do inUps1Do = new InUps1Do(); 
			inUps1Do.setBondno(dataObject.getString(InUps1Do.COLUMNS.BONDNO.name())); 
			inUps1Do.setGdstype(dataObject.getString(InUps1Do.COLUMNS.GDSTYPE.name())); 
			inUps1Do.setDecltype(dataObject.getString(InUps1Do.COLUMNS.DECLTYPE.name())); 
			inUps1Do.setPrdtno(dataObject.getString(InUps1Do.COLUMNS.PRDTNO.name())); 
			inUps1Do.setDeclno(dataObject.getString(InUps1Do.COLUMNS.DECLNO.name())); 
			inUps1Do.setItemno(BigDecimalUtils.formObj(dataObject.getString(InUps1Do.COLUMNS.ITEMNO.name()))); 
			inUps1Do.setStockno(dataObject.getString(InUps1Do.COLUMNS.STOCKNO.name())); 
			inUps1Do.setIndate(dataObject.getString(InUps1Do.COLUMNS.INDATE.name())); 
			inUps1Do.setRinqty(BigDecimalUtils.formObj(dataObject.getString(InUps1Do.COLUMNS.RINQTY.name()))); 
			inUps1Do.setInunit(dataObject.getString(InUps1Do.COLUMNS.INUNIT.name())); 
			inUps1Do.setInpost(dataObject.getString(InUps1Do.COLUMNS.INPOST.name())); 
			inUps1Do.setBalance(BigDecimalUtils.formObj(dataObject.getString(InUps1Do.COLUMNS.BALANCE.name()))); 
			inUps1Do.setIsstock(dataObject.getString(InUps1Do.COLUMNS.ISSTOCK.name())); 
			inUps1Do.setRmk(dataObject.getString(InUps1Do.COLUMNS.RMK.name())); 
			inUps1Do.setInstatus(dataObject.getString(InUps1Do.COLUMNS.INSTATUS.name())); 
			inUps1Do.setControlno(dataObject.getString(InUps1Do.COLUMNS.CONTROLNO.name())); 
			inUps1Do.setUpdtime(dataObject.getString(InUps1Do.COLUMNS.UPDTIME.name())); 
			return inUps1Do; 
		} 
 
		@Override 
		public DataObject toDataObject(final InUps1Do inUps1Do) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(InUps1Do.COLUMNS.BONDNO.name(), inUps1Do.getBondno()); 
			dataObject.setValue(InUps1Do.COLUMNS.GDSTYPE.name(), inUps1Do.getGdstype()); 
			dataObject.setValue(InUps1Do.COLUMNS.DECLTYPE.name(), inUps1Do.getDecltype()); 
			dataObject.setValue(InUps1Do.COLUMNS.PRDTNO.name(), inUps1Do.getPrdtno()); 
			dataObject.setValue(InUps1Do.COLUMNS.DECLNO.name(), inUps1Do.getDeclno()); 
			dataObject.setValue(InUps1Do.COLUMNS.ITEMNO.name(), inUps1Do.getItemno()); 
			dataObject.setValue(InUps1Do.COLUMNS.STOCKNO.name(), inUps1Do.getStockno()); 
			dataObject.setValue(InUps1Do.COLUMNS.INDATE.name(), inUps1Do.getIndate()); 
			dataObject.setValue(InUps1Do.COLUMNS.RINQTY.name(), inUps1Do.getRinqty()); 
			dataObject.setValue(InUps1Do.COLUMNS.INUNIT.name(), inUps1Do.getInunit()); 
			dataObject.setValue(InUps1Do.COLUMNS.INPOST.name(), inUps1Do.getInpost()); 
			dataObject.setValue(InUps1Do.COLUMNS.BALANCE.name(), inUps1Do.getBalance()); 
			dataObject.setValue(InUps1Do.COLUMNS.ISSTOCK.name(), inUps1Do.getIsstock()); 
			dataObject.setValue(InUps1Do.COLUMNS.RMK.name(), inUps1Do.getRmk()); 
			dataObject.setValue(InUps1Do.COLUMNS.INSTATUS.name(), inUps1Do.getInstatus()); 
			dataObject.setValue(InUps1Do.COLUMNS.CONTROLNO.name(), inUps1Do.getControlno()); 
			dataObject.setValue(InUps1Do.COLUMNS.UPDTIME.name(), inUps1Do.getUpdtime()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<InUps1Do> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(InUps1Do po) { 
	} 
 
} 
