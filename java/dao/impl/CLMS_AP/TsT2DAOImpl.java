package com.doc.common.dao.impl; 
 
public class TsT2DAOImpl extends GeneralDAOImpl<TsT2Po> implements TsT2DAO { 
	public static final TsT2DAOImpl INSTANCE = new TsT2DAOImpl(); 
	public static final String TABLENAME = "TS_T2"; 

	public TsT2DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TsT2Po> CONVERTER = new MapConverter<TsT2Po>() { 
 
		@Override 
		public TsT2Po convert(final DataObject dataObject) { 
			final TsT2Po tsT2Po = new TsT2Po(); 
			tsT2Po.setT2item(BigDecimalUtils.formObj(dataObject.getValue(TsT2Po.COLUMNS.T2ITEM.name()))); 
			tsT2Po.setT2prdtno(dataObject.getString(TsT2Po.COLUMNS.T2PRDTNO.name())); 
			tsT2Po.setT2rstrqty(BigDecimalUtils.formObj(dataObject.getValue(TsT2Po.COLUMNS.T2RSTRQTY.name()))); 
			tsT2Po.setT2prdtunit(dataObject.getString(TsT2Po.COLUMNS.T2PRDTUNIT.name())); 
			tsT2Po.setT2unitprice(BigDecimalUtils.formObj(dataObject.getValue(TsT2Po.COLUMNS.T2UNITPRICE.name()))); 
			tsT2Po.setT2odeclno(dataObject.getString(TsT2Po.COLUMNS.T2ODECLNO.name())); 
			tsT2Po.setT2oitem(BigDecimalUtils.formObj(dataObject.getValue(TsT2Po.COLUMNS.T2OITEM.name()))); 
			tsT2Po.setT2inpost(dataObject.getString(TsT2Po.COLUMNS.T2INPOST.name())); 
			tsT2Po.setT2orefbillno(dataObject.getString(TsT2Po.COLUMNS.T2OREFBILLNO.name())); 
			tsT2Po.setT2orefbillitem(BigDecimalUtils.formObj(dataObject.getValue(TsT2Po.COLUMNS.T2OREFBILLITEM.name()))); 
			tsT2Po.setT2descrip(dataObject.getString(TsT2Po.COLUMNS.T2DESCRIP.name())); 
			tsT2Po.setControlno(dataObject.getString(TsT2Po.COLUMNS.CONTROLNO.name())); 
			tsT2Po.setSerialno(BigDecimalUtils.formObj(dataObject.getValue(TsT2Po.COLUMNS.SERIALNO.name()))); 
			tsT2Po.setSeqno(BigDecimalUtils.formObj(dataObject.getValue(TsT2Po.COLUMNS.SEQNO.name()))); 
			tsT2Po.setIconfirmed(dataObject.getString(TsT2Po.COLUMNS.ICONFIRMED.name())); 
			tsT2Po.setT1bondno(dataObject.getString(TsT2Po.COLUMNS.T1BONDNO.name())); 
			tsT2Po.setT1testno(dataObject.getString(TsT2Po.COLUMNS.T1TESTNO.name())); 
			tsT2Po.setT1Seqno(BigDecimalUtils.formObj(dataObject.getValue(TsT2Po.COLUMNS.T1_SEQNO.name()))); 
			return tsT2Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final TsT2Po tsT2Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TsT2Po.COLUMNS.T2ITEM.name(), tsT2Po.getT2item()); 
			dataObject.setValue(TsT2Po.COLUMNS.T2PRDTNO.name(), tsT2Po.getT2prdtno()); 
			dataObject.setValue(TsT2Po.COLUMNS.T2RSTRQTY.name(), tsT2Po.getT2rstrqty()); 
			dataObject.setValue(TsT2Po.COLUMNS.T2PRDTUNIT.name(), tsT2Po.getT2prdtunit()); 
			dataObject.setValue(TsT2Po.COLUMNS.T2UNITPRICE.name(), tsT2Po.getT2unitprice()); 
			dataObject.setValue(TsT2Po.COLUMNS.T2ODECLNO.name(), tsT2Po.getT2odeclno()); 
			dataObject.setValue(TsT2Po.COLUMNS.T2OITEM.name(), tsT2Po.getT2oitem()); 
			dataObject.setValue(TsT2Po.COLUMNS.T2INPOST.name(), tsT2Po.getT2inpost()); 
			dataObject.setValue(TsT2Po.COLUMNS.T2OREFBILLNO.name(), tsT2Po.getT2orefbillno()); 
			dataObject.setValue(TsT2Po.COLUMNS.T2OREFBILLITEM.name(), tsT2Po.getT2orefbillitem()); 
			dataObject.setValue(TsT2Po.COLUMNS.T2DESCRIP.name(), tsT2Po.getT2descrip()); 
			dataObject.setValue(TsT2Po.COLUMNS.CONTROLNO.name(), tsT2Po.getControlno()); 
			dataObject.setValue(TsT2Po.COLUMNS.SERIALNO.name(), tsT2Po.getSerialno()); 
			dataObject.setValue(TsT2Po.COLUMNS.SEQNO.name(), tsT2Po.getSeqno()); 
			dataObject.setValue(TsT2Po.COLUMNS.ICONFIRMED.name(), tsT2Po.getIconfirmed()); 
			dataObject.setValue(TsT2Po.COLUMNS.T1BONDNO.name(), tsT2Po.getT1bondno()); 
			dataObject.setValue(TsT2Po.COLUMNS.T1TESTNO.name(), tsT2Po.getT1testno()); 
			dataObject.setValue(TsT2Po.COLUMNS.T1_SEQNO.name(), tsT2Po.getT1Seqno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TsT2Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TsT2Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
