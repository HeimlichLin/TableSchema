package com.doc.common.dao.impl; 
 
public class PartialstoreDAOImpl extends GeneralDAOImpl<PartialstoreDo> implements PartialstoreDAOImpl { 
	public static final PartialstoreDAOImpl INSTANCE = new PartialstoreDAOImpl(); 
	public static final String TABLENAME = "PARTIALSTORE"; 

	public PartialstoreDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<PartialstoreDo> CONVERTER = new MapConverter<PartialstoreDo>() { 
 
		@Override 
		public PartialstoreDo convert(final DataObject dataObject) { 
			final PartialstoreDo partialstoreDo = new PartialstoreDo(); 
			partialstoreDo.setMsgfun(dataObject.getString(PartialstoreDo.COLUMNS.MSGFUN.name())); 
			partialstoreDo.setBondno(dataObject.getString(PartialstoreDo.COLUMNS.BONDNO.name())); 
			partialstoreDo.setRefbillno(dataObject.getString(PartialstoreDo.COLUMNS.REFBILLNO.name())); 
			partialstoreDo.setCtmcode(dataObject.getString(PartialstoreDo.COLUMNS.CTMCODE.name())); 
			partialstoreDo.setRefercode(dataObject.getString(PartialstoreDo.COLUMNS.REFERCODE.name())); 
			partialstoreDo.setItem(BigDecimalUtils.formObj(dataObject.getString(PartialstoreDo.COLUMNS.ITEM.name()))); 
			partialstoreDo.setPrdtno(dataObject.getString(PartialstoreDo.COLUMNS.PRDTNO.name())); 
			partialstoreDo.setStrtype(dataObject.getString(PartialstoreDo.COLUMNS.STRTYPE.name())); 
			partialstoreDo.setGdstype(dataObject.getString(PartialstoreDo.COLUMNS.GDSTYPE.name())); 
			partialstoreDo.setRstrqty(BigDecimalUtils.formObj(dataObject.getString(PartialstoreDo.COLUMNS.RSTRQTY.name()))); 
			partialstoreDo.setStrunit(dataObject.getString(PartialstoreDo.COLUMNS.STRUNIT.name())); 
			partialstoreDo.setStrpost(dataObject.getString(PartialstoreDo.COLUMNS.STRPOST.name())); 
			partialstoreDo.setStrdate(dataObject.getString(PartialstoreDo.COLUMNS.STRDATE.name())); 
			partialstoreDo.setBatchno(dataObject.getString(PartialstoreDo.COLUMNS.BATCHNO.name())); 
			partialstoreDo.setStockno(dataObject.getString(PartialstoreDo.COLUMNS.STOCKNO.name())); 
			partialstoreDo.setOutstrno(dataObject.getString(PartialstoreDo.COLUMNS.OUTSTRNO.name())); 
			partialstoreDo.setDecltype(dataObject.getString(PartialstoreDo.COLUMNS.DECLTYPE.name())); 
			partialstoreDo.setDeclno(dataObject.getString(PartialstoreDo.COLUMNS.DECLNO.name())); 
			partialstoreDo.setItemno(BigDecimalUtils.formObj(dataObject.getString(PartialstoreDo.COLUMNS.ITEMNO.name()))); 
			partialstoreDo.setOdeclno(dataObject.getString(PartialstoreDo.COLUMNS.ODECLNO.name())); 
			partialstoreDo.setOitemno(BigDecimalUtils.formObj(dataObject.getString(PartialstoreDo.COLUMNS.OITEMNO.name()))); 
			partialstoreDo.setRealstatus(dataObject.getString(PartialstoreDo.COLUMNS.REALSTATUS.name())); 
			partialstoreDo.setMonthno(dataObject.getString(PartialstoreDo.COLUMNS.MONTHNO.name())); 
			partialstoreDo.setUserid(dataObject.getString(PartialstoreDo.COLUMNS.USERID.name())); 
			partialstoreDo.setConfirmdate(dataObject.getString(PartialstoreDo.COLUMNS.CONFIRMDATE.name())); 
			return partialstoreDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final PartialstoreDo partialstoreDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(PartialstoreDo.COLUMNS.MSGFUN.name(), partialstoreDo.getMsgfun()); 
			dataObject.setValue(PartialstoreDo.COLUMNS.BONDNO.name(), partialstoreDo.getBondno()); 
			dataObject.setValue(PartialstoreDo.COLUMNS.REFBILLNO.name(), partialstoreDo.getRefbillno()); 
			dataObject.setValue(PartialstoreDo.COLUMNS.CTMCODE.name(), partialstoreDo.getCtmcode()); 
			dataObject.setValue(PartialstoreDo.COLUMNS.REFERCODE.name(), partialstoreDo.getRefercode()); 
			dataObject.setValue(PartialstoreDo.COLUMNS.ITEM.name(), partialstoreDo.getItem()); 
			dataObject.setValue(PartialstoreDo.COLUMNS.PRDTNO.name(), partialstoreDo.getPrdtno()); 
			dataObject.setValue(PartialstoreDo.COLUMNS.STRTYPE.name(), partialstoreDo.getStrtype()); 
			dataObject.setValue(PartialstoreDo.COLUMNS.GDSTYPE.name(), partialstoreDo.getGdstype()); 
			dataObject.setValue(PartialstoreDo.COLUMNS.RSTRQTY.name(), partialstoreDo.getRstrqty()); 
			dataObject.setValue(PartialstoreDo.COLUMNS.STRUNIT.name(), partialstoreDo.getStrunit()); 
			dataObject.setValue(PartialstoreDo.COLUMNS.STRPOST.name(), partialstoreDo.getStrpost()); 
			dataObject.setValue(PartialstoreDo.COLUMNS.STRDATE.name(), partialstoreDo.getStrdate()); 
			dataObject.setValue(PartialstoreDo.COLUMNS.BATCHNO.name(), partialstoreDo.getBatchno()); 
			dataObject.setValue(PartialstoreDo.COLUMNS.STOCKNO.name(), partialstoreDo.getStockno()); 
			dataObject.setValue(PartialstoreDo.COLUMNS.OUTSTRNO.name(), partialstoreDo.getOutstrno()); 
			dataObject.setValue(PartialstoreDo.COLUMNS.DECLTYPE.name(), partialstoreDo.getDecltype()); 
			dataObject.setValue(PartialstoreDo.COLUMNS.DECLNO.name(), partialstoreDo.getDeclno()); 
			dataObject.setValue(PartialstoreDo.COLUMNS.ITEMNO.name(), partialstoreDo.getItemno()); 
			dataObject.setValue(PartialstoreDo.COLUMNS.ODECLNO.name(), partialstoreDo.getOdeclno()); 
			dataObject.setValue(PartialstoreDo.COLUMNS.OITEMNO.name(), partialstoreDo.getOitemno()); 
			dataObject.setValue(PartialstoreDo.COLUMNS.REALSTATUS.name(), partialstoreDo.getRealstatus()); 
			dataObject.setValue(PartialstoreDo.COLUMNS.MONTHNO.name(), partialstoreDo.getMonthno()); 
			dataObject.setValue(PartialstoreDo.COLUMNS.USERID.name(), partialstoreDo.getUserid()); 
			dataObject.setValue(PartialstoreDo.COLUMNS.CONFIRMDATE.name(), partialstoreDo.getConfirmdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<PartialstoreDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(PartialstoreDo po) { 
		sqlWhere.add(PartialstoreDo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(PartialstoreDo.COLUMNS.REFBILLNO.name(), po.getRefbillno()); 
		sqlWhere.add(PartialstoreDo.COLUMNS.ITEM.name(), po.getItem()); 
		sqlWhere.add(PartialstoreDo.COLUMNS.STRTYPE.name(), po.getStrtype()); 
		sqlWhere.add(PartialstoreDo.COLUMNS.STRPOST.name(), po.getStrpost()); 
		sqlWhere.add(PartialstoreDo.COLUMNS.STRDATE.name(), po.getStrdate()); 
	} 
 
} 
