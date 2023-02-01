package com.doc.common.dao.impl; 
 
public class PartialstoreDAOImpl extends GeneralDAOImpl<PartialstorePo> implements PartialstoreDAO { 
	public static final PartialstoreDAOImpl INSTANCE = new PartialstoreDAOImpl(); 
	public static final String TABLENAME = "PARTIALSTORE"; 

	public PartialstoreDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<PartialstorePo> CONVERTER = new MapConverter<PartialstorePo>() { 
 
		@Override 
		public PartialstorePo convert(final DataObject dataObject) { 
			final PartialstorePo partialstorePo = new PartialstorePo(); 
			partialstorePo.setMsgfun(dataObject.getString(PartialstorePo.COLUMNS.MSGFUN.name())); 
			partialstorePo.setBondno(dataObject.getString(PartialstorePo.COLUMNS.BONDNO.name())); 
			partialstorePo.setRefbillno(dataObject.getString(PartialstorePo.COLUMNS.REFBILLNO.name())); 
			partialstorePo.setCtmcode(dataObject.getString(PartialstorePo.COLUMNS.CTMCODE.name())); 
			partialstorePo.setRefercode(dataObject.getString(PartialstorePo.COLUMNS.REFERCODE.name())); 
			partialstorePo.setItem(BigDecimalUtils.formObj(dataObject.getValue(PartialstorePo.COLUMNS.ITEM.name()))); 
			partialstorePo.setPrdtno(dataObject.getString(PartialstorePo.COLUMNS.PRDTNO.name())); 
			partialstorePo.setStrtype(dataObject.getString(PartialstorePo.COLUMNS.STRTYPE.name())); 
			partialstorePo.setGdstype(dataObject.getString(PartialstorePo.COLUMNS.GDSTYPE.name())); 
			partialstorePo.setRstrqty(BigDecimalUtils.formObj(dataObject.getValue(PartialstorePo.COLUMNS.RSTRQTY.name()))); 
			partialstorePo.setStrunit(dataObject.getString(PartialstorePo.COLUMNS.STRUNIT.name())); 
			partialstorePo.setStrpost(dataObject.getString(PartialstorePo.COLUMNS.STRPOST.name())); 
			partialstorePo.setStrdate(dataObject.getString(PartialstorePo.COLUMNS.STRDATE.name())); 
			partialstorePo.setBatchno(dataObject.getString(PartialstorePo.COLUMNS.BATCHNO.name())); 
			partialstorePo.setStockno(dataObject.getString(PartialstorePo.COLUMNS.STOCKNO.name())); 
			partialstorePo.setOutstrno(dataObject.getString(PartialstorePo.COLUMNS.OUTSTRNO.name())); 
			partialstorePo.setDecltype(dataObject.getString(PartialstorePo.COLUMNS.DECLTYPE.name())); 
			partialstorePo.setDeclno(dataObject.getString(PartialstorePo.COLUMNS.DECLNO.name())); 
			partialstorePo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(PartialstorePo.COLUMNS.ITEMNO.name()))); 
			partialstorePo.setOdeclno(dataObject.getString(PartialstorePo.COLUMNS.ODECLNO.name())); 
			partialstorePo.setOitemno(BigDecimalUtils.formObj(dataObject.getValue(PartialstorePo.COLUMNS.OITEMNO.name()))); 
			partialstorePo.setRealstatus(dataObject.getString(PartialstorePo.COLUMNS.REALSTATUS.name())); 
			partialstorePo.setMonthno(dataObject.getString(PartialstorePo.COLUMNS.MONTHNO.name())); 
			partialstorePo.setUserid(dataObject.getString(PartialstorePo.COLUMNS.USERID.name())); 
			partialstorePo.setConfirmdate(dataObject.getString(PartialstorePo.COLUMNS.CONFIRMDATE.name())); 
			return partialstorePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final PartialstorePo partialstorePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(PartialstorePo.COLUMNS.MSGFUN.name(), partialstorePo.getMsgfun()); 
			dataObject.setValue(PartialstorePo.COLUMNS.BONDNO.name(), partialstorePo.getBondno()); 
			dataObject.setValue(PartialstorePo.COLUMNS.REFBILLNO.name(), partialstorePo.getRefbillno()); 
			dataObject.setValue(PartialstorePo.COLUMNS.CTMCODE.name(), partialstorePo.getCtmcode()); 
			dataObject.setValue(PartialstorePo.COLUMNS.REFERCODE.name(), partialstorePo.getRefercode()); 
			dataObject.setValue(PartialstorePo.COLUMNS.ITEM.name(), partialstorePo.getItem()); 
			dataObject.setValue(PartialstorePo.COLUMNS.PRDTNO.name(), partialstorePo.getPrdtno()); 
			dataObject.setValue(PartialstorePo.COLUMNS.STRTYPE.name(), partialstorePo.getStrtype()); 
			dataObject.setValue(PartialstorePo.COLUMNS.GDSTYPE.name(), partialstorePo.getGdstype()); 
			dataObject.setValue(PartialstorePo.COLUMNS.RSTRQTY.name(), partialstorePo.getRstrqty()); 
			dataObject.setValue(PartialstorePo.COLUMNS.STRUNIT.name(), partialstorePo.getStrunit()); 
			dataObject.setValue(PartialstorePo.COLUMNS.STRPOST.name(), partialstorePo.getStrpost()); 
			dataObject.setValue(PartialstorePo.COLUMNS.STRDATE.name(), partialstorePo.getStrdate()); 
			dataObject.setValue(PartialstorePo.COLUMNS.BATCHNO.name(), partialstorePo.getBatchno()); 
			dataObject.setValue(PartialstorePo.COLUMNS.STOCKNO.name(), partialstorePo.getStockno()); 
			dataObject.setValue(PartialstorePo.COLUMNS.OUTSTRNO.name(), partialstorePo.getOutstrno()); 
			dataObject.setValue(PartialstorePo.COLUMNS.DECLTYPE.name(), partialstorePo.getDecltype()); 
			dataObject.setValue(PartialstorePo.COLUMNS.DECLNO.name(), partialstorePo.getDeclno()); 
			dataObject.setValue(PartialstorePo.COLUMNS.ITEMNO.name(), partialstorePo.getItemno()); 
			dataObject.setValue(PartialstorePo.COLUMNS.ODECLNO.name(), partialstorePo.getOdeclno()); 
			dataObject.setValue(PartialstorePo.COLUMNS.OITEMNO.name(), partialstorePo.getOitemno()); 
			dataObject.setValue(PartialstorePo.COLUMNS.REALSTATUS.name(), partialstorePo.getRealstatus()); 
			dataObject.setValue(PartialstorePo.COLUMNS.MONTHNO.name(), partialstorePo.getMonthno()); 
			dataObject.setValue(PartialstorePo.COLUMNS.USERID.name(), partialstorePo.getUserid()); 
			dataObject.setValue(PartialstorePo.COLUMNS.CONFIRMDATE.name(), partialstorePo.getConfirmdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<PartialstorePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(PartialstorePo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(PartialstorePo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(PartialstorePo.COLUMNS.REFBILLNO.name(), po.getRefbillno()); 
		sqlWhere.add(PartialstorePo.COLUMNS.ITEM.name(), po.getItem()); 
		sqlWhere.add(PartialstorePo.COLUMNS.STRTYPE.name(), po.getStrtype()); 
		sqlWhere.add(PartialstorePo.COLUMNS.STRPOST.name(), po.getStrpost()); 
		sqlWhere.add(PartialstorePo.COLUMNS.STRDATE.name(), po.getStrdate()); 
		return sqlWhere; 
	} 
 
} 
