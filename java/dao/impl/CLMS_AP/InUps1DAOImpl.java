package com.doc.common.dao.impl; 
 
public class InUps1DAOImpl extends GeneralDAOImpl<InUps1Po> implements InUps1DAO { 
	public static final InUps1DAOImpl INSTANCE = new InUps1DAOImpl(); 
	public static final String TABLENAME = "IN_UPS1"; 

	public InUps1DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<InUps1Po> CONVERTER = new MapConverter<InUps1Po>() { 
 
		@Override 
		public InUps1Po convert(final DataObject dataObject) { 
			final InUps1Po inUps1Po = new InUps1Po(); 
			inUps1Po.setBondno(dataObject.getString(InUps1Po.COLUMNS.BONDNO.name())); 
			inUps1Po.setGdstype(dataObject.getString(InUps1Po.COLUMNS.GDSTYPE.name())); 
			inUps1Po.setDecltype(dataObject.getString(InUps1Po.COLUMNS.DECLTYPE.name())); 
			inUps1Po.setPrdtno(dataObject.getString(InUps1Po.COLUMNS.PRDTNO.name())); 
			inUps1Po.setDeclno(dataObject.getString(InUps1Po.COLUMNS.DECLNO.name())); 
			inUps1Po.setItemno(BigDecimalUtils.formObj(dataObject.getValue(InUps1Po.COLUMNS.ITEMNO.name()))); 
			inUps1Po.setStockno(dataObject.getString(InUps1Po.COLUMNS.STOCKNO.name())); 
			inUps1Po.setIndate(dataObject.getString(InUps1Po.COLUMNS.INDATE.name())); 
			inUps1Po.setRinqty(BigDecimalUtils.formObj(dataObject.getValue(InUps1Po.COLUMNS.RINQTY.name()))); 
			inUps1Po.setInunit(dataObject.getString(InUps1Po.COLUMNS.INUNIT.name())); 
			inUps1Po.setInpost(dataObject.getString(InUps1Po.COLUMNS.INPOST.name())); 
			inUps1Po.setBalance(BigDecimalUtils.formObj(dataObject.getValue(InUps1Po.COLUMNS.BALANCE.name()))); 
			inUps1Po.setIsstock(dataObject.getString(InUps1Po.COLUMNS.ISSTOCK.name())); 
			inUps1Po.setRmk(dataObject.getString(InUps1Po.COLUMNS.RMK.name())); 
			inUps1Po.setInstatus(dataObject.getString(InUps1Po.COLUMNS.INSTATUS.name())); 
			inUps1Po.setControlno(dataObject.getString(InUps1Po.COLUMNS.CONTROLNO.name())); 
			inUps1Po.setUpdtime(dataObject.getString(InUps1Po.COLUMNS.UPDTIME.name())); 
			return inUps1Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final InUps1Po inUps1Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(InUps1Po.COLUMNS.BONDNO.name(), inUps1Po.getBondno()); 
			dataObject.setValue(InUps1Po.COLUMNS.GDSTYPE.name(), inUps1Po.getGdstype()); 
			dataObject.setValue(InUps1Po.COLUMNS.DECLTYPE.name(), inUps1Po.getDecltype()); 
			dataObject.setValue(InUps1Po.COLUMNS.PRDTNO.name(), inUps1Po.getPrdtno()); 
			dataObject.setValue(InUps1Po.COLUMNS.DECLNO.name(), inUps1Po.getDeclno()); 
			dataObject.setValue(InUps1Po.COLUMNS.ITEMNO.name(), inUps1Po.getItemno()); 
			dataObject.setValue(InUps1Po.COLUMNS.STOCKNO.name(), inUps1Po.getStockno()); 
			dataObject.setValue(InUps1Po.COLUMNS.INDATE.name(), inUps1Po.getIndate()); 
			dataObject.setValue(InUps1Po.COLUMNS.RINQTY.name(), inUps1Po.getRinqty()); 
			dataObject.setValue(InUps1Po.COLUMNS.INUNIT.name(), inUps1Po.getInunit()); 
			dataObject.setValue(InUps1Po.COLUMNS.INPOST.name(), inUps1Po.getInpost()); 
			dataObject.setValue(InUps1Po.COLUMNS.BALANCE.name(), inUps1Po.getBalance()); 
			dataObject.setValue(InUps1Po.COLUMNS.ISSTOCK.name(), inUps1Po.getIsstock()); 
			dataObject.setValue(InUps1Po.COLUMNS.RMK.name(), inUps1Po.getRmk()); 
			dataObject.setValue(InUps1Po.COLUMNS.INSTATUS.name(), inUps1Po.getInstatus()); 
			dataObject.setValue(InUps1Po.COLUMNS.CONTROLNO.name(), inUps1Po.getControlno()); 
			dataObject.setValue(InUps1Po.COLUMNS.UPDTIME.name(), inUps1Po.getUpdtime()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<InUps1Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(InUps1Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
