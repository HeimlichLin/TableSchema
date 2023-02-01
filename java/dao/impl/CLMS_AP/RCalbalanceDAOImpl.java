package com.doc.common.dao.impl; 
 
public class RCalbalanceDAOImpl extends GeneralDAOImpl<RCalbalancePo> implements RCalbalanceDAO { 
	public static final RCalbalanceDAOImpl INSTANCE = new RCalbalanceDAOImpl(); 
	public static final String TABLENAME = "R_CALBALANCE"; 

	public RCalbalanceDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<RCalbalancePo> CONVERTER = new MapConverter<RCalbalancePo>() { 
 
		@Override 
		public RCalbalancePo convert(final DataObject dataObject) { 
			final RCalbalancePo rCalbalancePo = new RCalbalancePo(); 
			rCalbalancePo.setSessionid(dataObject.getString(RCalbalancePo.COLUMNS.SESSIONID.name())); 
			rCalbalancePo.setBondno(dataObject.getString(RCalbalancePo.COLUMNS.BONDNO.name())); 
			rCalbalancePo.setGdstype(dataObject.getString(RCalbalancePo.COLUMNS.GDSTYPE.name())); 
			rCalbalancePo.setDecltype(dataObject.getString(RCalbalancePo.COLUMNS.DECLTYPE.name())); 
			rCalbalancePo.setPrdtno(dataObject.getString(RCalbalancePo.COLUMNS.PRDTNO.name())); 
			rCalbalancePo.setDeclno(dataObject.getString(RCalbalancePo.COLUMNS.DECLNO.name())); 
			rCalbalancePo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(RCalbalancePo.COLUMNS.ITEMNO.name()))); 
			rCalbalancePo.setStockno(dataObject.getString(RCalbalancePo.COLUMNS.STOCKNO.name())); 
			rCalbalancePo.setIndate(dataObject.getString(RCalbalancePo.COLUMNS.INDATE.name())); 
			rCalbalancePo.setRinqty(BigDecimalUtils.formObj(dataObject.getValue(RCalbalancePo.COLUMNS.RINQTY.name()))); 
			rCalbalancePo.setInunit(dataObject.getString(RCalbalancePo.COLUMNS.INUNIT.name())); 
			rCalbalancePo.setInpost(dataObject.getString(RCalbalancePo.COLUMNS.INPOST.name())); 
			rCalbalancePo.setBalance(BigDecimalUtils.formObj(dataObject.getValue(RCalbalancePo.COLUMNS.BALANCE.name()))); 
			rCalbalancePo.setIsstock(dataObject.getString(RCalbalancePo.COLUMNS.ISSTOCK.name())); 
			rCalbalancePo.setRmk(dataObject.getString(RCalbalancePo.COLUMNS.RMK.name())); 
			rCalbalancePo.setInstatus(dataObject.getString(RCalbalancePo.COLUMNS.INSTATUS.name())); 
			rCalbalancePo.setControlno(dataObject.getString(RCalbalancePo.COLUMNS.CONTROLNO.name())); 
			rCalbalancePo.setUpdtime(dataObject.getString(RCalbalancePo.COLUMNS.UPDTIME.name())); 
			return rCalbalancePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final RCalbalancePo rCalbalancePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(RCalbalancePo.COLUMNS.SESSIONID.name(), rCalbalancePo.getSessionid()); 
			dataObject.setValue(RCalbalancePo.COLUMNS.BONDNO.name(), rCalbalancePo.getBondno()); 
			dataObject.setValue(RCalbalancePo.COLUMNS.GDSTYPE.name(), rCalbalancePo.getGdstype()); 
			dataObject.setValue(RCalbalancePo.COLUMNS.DECLTYPE.name(), rCalbalancePo.getDecltype()); 
			dataObject.setValue(RCalbalancePo.COLUMNS.PRDTNO.name(), rCalbalancePo.getPrdtno()); 
			dataObject.setValue(RCalbalancePo.COLUMNS.DECLNO.name(), rCalbalancePo.getDeclno()); 
			dataObject.setValue(RCalbalancePo.COLUMNS.ITEMNO.name(), rCalbalancePo.getItemno()); 
			dataObject.setValue(RCalbalancePo.COLUMNS.STOCKNO.name(), rCalbalancePo.getStockno()); 
			dataObject.setValue(RCalbalancePo.COLUMNS.INDATE.name(), rCalbalancePo.getIndate()); 
			dataObject.setValue(RCalbalancePo.COLUMNS.RINQTY.name(), rCalbalancePo.getRinqty()); 
			dataObject.setValue(RCalbalancePo.COLUMNS.INUNIT.name(), rCalbalancePo.getInunit()); 
			dataObject.setValue(RCalbalancePo.COLUMNS.INPOST.name(), rCalbalancePo.getInpost()); 
			dataObject.setValue(RCalbalancePo.COLUMNS.BALANCE.name(), rCalbalancePo.getBalance()); 
			dataObject.setValue(RCalbalancePo.COLUMNS.ISSTOCK.name(), rCalbalancePo.getIsstock()); 
			dataObject.setValue(RCalbalancePo.COLUMNS.RMK.name(), rCalbalancePo.getRmk()); 
			dataObject.setValue(RCalbalancePo.COLUMNS.INSTATUS.name(), rCalbalancePo.getInstatus()); 
			dataObject.setValue(RCalbalancePo.COLUMNS.CONTROLNO.name(), rCalbalancePo.getControlno()); 
			dataObject.setValue(RCalbalancePo.COLUMNS.UPDTIME.name(), rCalbalancePo.getUpdtime()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<RCalbalancePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(RCalbalancePo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
