package com.doc.common.dao.impl; 
 
public class RCalbalanceDAO extends GeneralDAOImpl<RCalbalanceDo> implements RCalbalanceDAO { 
	public static final RCalbalanceDAOImpl INSTANCE = new RCalbalanceDAOImpl(); 
	public static final String TABLENAME = "R_CALBALANCE"; 

	public RCalbalanceDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<RCalbalanceDo> CONVERTER = new MapConverter<RCalbalanceDo>() { 
 
		@Override 
		public RCalbalanceDo convert(final DataObject dataObject) { 
			final RCalbalanceDo rCalbalanceDo = new RCalbalanceDo(); 
			rCalbalanceDo.setSessionid(dataObject.getString(RCalbalanceDo.COLUMNS.SESSIONID.name())); 
			rCalbalanceDo.setBondno(dataObject.getString(RCalbalanceDo.COLUMNS.BONDNO.name())); 
			rCalbalanceDo.setGdstype(dataObject.getString(RCalbalanceDo.COLUMNS.GDSTYPE.name())); 
			rCalbalanceDo.setDecltype(dataObject.getString(RCalbalanceDo.COLUMNS.DECLTYPE.name())); 
			rCalbalanceDo.setPrdtno(dataObject.getString(RCalbalanceDo.COLUMNS.PRDTNO.name())); 
			rCalbalanceDo.setDeclno(dataObject.getString(RCalbalanceDo.COLUMNS.DECLNO.name())); 
			rCalbalanceDo.setItemno(BigDecimalUtils.formObj(dataObject.getString(RCalbalanceDo.COLUMNS.ITEMNO.name()))); 
			rCalbalanceDo.setStockno(dataObject.getString(RCalbalanceDo.COLUMNS.STOCKNO.name())); 
			rCalbalanceDo.setIndate(dataObject.getString(RCalbalanceDo.COLUMNS.INDATE.name())); 
			rCalbalanceDo.setRinqty(BigDecimalUtils.formObj(dataObject.getString(RCalbalanceDo.COLUMNS.RINQTY.name()))); 
			rCalbalanceDo.setInunit(dataObject.getString(RCalbalanceDo.COLUMNS.INUNIT.name())); 
			rCalbalanceDo.setInpost(dataObject.getString(RCalbalanceDo.COLUMNS.INPOST.name())); 
			rCalbalanceDo.setBalance(BigDecimalUtils.formObj(dataObject.getString(RCalbalanceDo.COLUMNS.BALANCE.name()))); 
			rCalbalanceDo.setIsstock(dataObject.getString(RCalbalanceDo.COLUMNS.ISSTOCK.name())); 
			rCalbalanceDo.setRmk(dataObject.getString(RCalbalanceDo.COLUMNS.RMK.name())); 
			rCalbalanceDo.setInstatus(dataObject.getString(RCalbalanceDo.COLUMNS.INSTATUS.name())); 
			rCalbalanceDo.setControlno(dataObject.getString(RCalbalanceDo.COLUMNS.CONTROLNO.name())); 
			rCalbalanceDo.setUpdtime(dataObject.getString(RCalbalanceDo.COLUMNS.UPDTIME.name())); 
			return rCalbalanceDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final RCalbalanceDo rCalbalanceDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(RCalbalanceDo.COLUMNS.SESSIONID.name(), rCalbalanceDo.getSessionid()); 
			dataObject.setValue(RCalbalanceDo.COLUMNS.BONDNO.name(), rCalbalanceDo.getBondno()); 
			dataObject.setValue(RCalbalanceDo.COLUMNS.GDSTYPE.name(), rCalbalanceDo.getGdstype()); 
			dataObject.setValue(RCalbalanceDo.COLUMNS.DECLTYPE.name(), rCalbalanceDo.getDecltype()); 
			dataObject.setValue(RCalbalanceDo.COLUMNS.PRDTNO.name(), rCalbalanceDo.getPrdtno()); 
			dataObject.setValue(RCalbalanceDo.COLUMNS.DECLNO.name(), rCalbalanceDo.getDeclno()); 
			dataObject.setValue(RCalbalanceDo.COLUMNS.ITEMNO.name(), rCalbalanceDo.getItemno()); 
			dataObject.setValue(RCalbalanceDo.COLUMNS.STOCKNO.name(), rCalbalanceDo.getStockno()); 
			dataObject.setValue(RCalbalanceDo.COLUMNS.INDATE.name(), rCalbalanceDo.getIndate()); 
			dataObject.setValue(RCalbalanceDo.COLUMNS.RINQTY.name(), rCalbalanceDo.getRinqty()); 
			dataObject.setValue(RCalbalanceDo.COLUMNS.INUNIT.name(), rCalbalanceDo.getInunit()); 
			dataObject.setValue(RCalbalanceDo.COLUMNS.INPOST.name(), rCalbalanceDo.getInpost()); 
			dataObject.setValue(RCalbalanceDo.COLUMNS.BALANCE.name(), rCalbalanceDo.getBalance()); 
			dataObject.setValue(RCalbalanceDo.COLUMNS.ISSTOCK.name(), rCalbalanceDo.getIsstock()); 
			dataObject.setValue(RCalbalanceDo.COLUMNS.RMK.name(), rCalbalanceDo.getRmk()); 
			dataObject.setValue(RCalbalanceDo.COLUMNS.INSTATUS.name(), rCalbalanceDo.getInstatus()); 
			dataObject.setValue(RCalbalanceDo.COLUMNS.CONTROLNO.name(), rCalbalanceDo.getControlno()); 
			dataObject.setValue(RCalbalanceDo.COLUMNS.UPDTIME.name(), rCalbalanceDo.getUpdtime()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<RCalbalanceDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(RCalbalanceDo po) { 
		sqlWhere.add(RCalbalanceDo.COLUMNS.SESSIONID.name(), po.getSessionid()); 
		sqlWhere.add(RCalbalanceDo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(RCalbalanceDo.COLUMNS.GDSTYPE.name(), po.getGdstype()); 
		sqlWhere.add(RCalbalanceDo.COLUMNS.DECLTYPE.name(), po.getDecltype()); 
		sqlWhere.add(RCalbalanceDo.COLUMNS.PRDTNO.name(), po.getPrdtno()); 
		sqlWhere.add(RCalbalanceDo.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(RCalbalanceDo.COLUMNS.ITEMNO.name(), po.getItemno()); 
		sqlWhere.add(RCalbalanceDo.COLUMNS.STOCKNO.name(), po.getStockno()); 
		sqlWhere.add(RCalbalanceDo.COLUMNS.INDATE.name(), po.getIndate()); 
		sqlWhere.add(RCalbalanceDo.COLUMNS.RINQTY.name(), po.getRinqty()); 
		sqlWhere.add(RCalbalanceDo.COLUMNS.INUNIT.name(), po.getInunit()); 
		sqlWhere.add(RCalbalanceDo.COLUMNS.INPOST.name(), po.getInpost()); 
		sqlWhere.add(RCalbalanceDo.COLUMNS.BALANCE.name(), po.getBalance()); 
		sqlWhere.add(RCalbalanceDo.COLUMNS.ISSTOCK.name(), po.getIsstock()); 
		sqlWhere.add(RCalbalanceDo.COLUMNS.RMK.name(), po.getRmk()); 
		sqlWhere.add(RCalbalanceDo.COLUMNS.INSTATUS.name(), po.getInstatus()); 
		sqlWhere.add(RCalbalanceDo.COLUMNS.CONTROLNO.name(), po.getControlno()); 
		sqlWhere.add(RCalbalanceDo.COLUMNS.UPDTIME.name(), po.getUpdtime()); 
	} 
 
} 
