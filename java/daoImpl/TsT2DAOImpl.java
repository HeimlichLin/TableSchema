package com.doc.common.dao.impl; 
 
public class TsT2DAOImpl extends GeneralDAOImpl<TsT2Do> implements TsT2DAOImpl { 
	public static final TsT2DAOImpl INSTANCE = new TsT2DAOImpl(); 
	public static final String TABLENAME = "TS_T2"; 

	public TsT2DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<TsT2Do> CONVERTER = new MapConverter<TsT2Do>() { 
 
		@Override 
		public TsT2Do convert(final DataObject dataObject) { 
			final TsT2Do tsT2Do = new TsT2Do(); 
			tsT2Do.setT2item(BigDecimalUtils.formObj(dataObject.getString(TsT2Do.COLUMNS.T2ITEM.name()))); 
			tsT2Do.setT2prdtno(dataObject.getString(TsT2Do.COLUMNS.T2PRDTNO.name())); 
			tsT2Do.setT2rstrqty(BigDecimalUtils.formObj(dataObject.getString(TsT2Do.COLUMNS.T2RSTRQTY.name()))); 
			tsT2Do.setT2prdtunit(dataObject.getString(TsT2Do.COLUMNS.T2PRDTUNIT.name())); 
			tsT2Do.setT2unitprice(BigDecimalUtils.formObj(dataObject.getString(TsT2Do.COLUMNS.T2UNITPRICE.name()))); 
			tsT2Do.setT2odeclno(dataObject.getString(TsT2Do.COLUMNS.T2ODECLNO.name())); 
			tsT2Do.setT2oitem(BigDecimalUtils.formObj(dataObject.getString(TsT2Do.COLUMNS.T2OITEM.name()))); 
			tsT2Do.setT2inpost(dataObject.getString(TsT2Do.COLUMNS.T2INPOST.name())); 
			tsT2Do.setT2orefbillno(dataObject.getString(TsT2Do.COLUMNS.T2OREFBILLNO.name())); 
			tsT2Do.setT2orefbillitem(BigDecimalUtils.formObj(dataObject.getString(TsT2Do.COLUMNS.T2OREFBILLITEM.name()))); 
			tsT2Do.setT2descrip(dataObject.getString(TsT2Do.COLUMNS.T2DESCRIP.name())); 
			tsT2Do.setControlno(dataObject.getString(TsT2Do.COLUMNS.CONTROLNO.name())); 
			tsT2Do.setSerialno(BigDecimalUtils.formObj(dataObject.getString(TsT2Do.COLUMNS.SERIALNO.name()))); 
			tsT2Do.setSeqno(BigDecimalUtils.formObj(dataObject.getString(TsT2Do.COLUMNS.SEQNO.name()))); 
			tsT2Do.setIconfirmed(dataObject.getString(TsT2Do.COLUMNS.ICONFIRMED.name())); 
			tsT2Do.setT1bondno(dataObject.getString(TsT2Do.COLUMNS.T1BONDNO.name())); 
			tsT2Do.setT1testno(dataObject.getString(TsT2Do.COLUMNS.T1TESTNO.name())); 
			tsT2Do.setT1Seqno(BigDecimalUtils.formObj(dataObject.getString(TsT2Do.COLUMNS.T1_SEQNO.name()))); 
			return tsT2Do; 
		} 
 
		@Override 
		public DataObject toDataObject(final TsT2Do tsT2Do) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TsT2Do.COLUMNS.T2ITEM.name(), tsT2Do.getT2item()); 
			dataObject.setValue(TsT2Do.COLUMNS.T2PRDTNO.name(), tsT2Do.getT2prdtno()); 
			dataObject.setValue(TsT2Do.COLUMNS.T2RSTRQTY.name(), tsT2Do.getT2rstrqty()); 
			dataObject.setValue(TsT2Do.COLUMNS.T2PRDTUNIT.name(), tsT2Do.getT2prdtunit()); 
			dataObject.setValue(TsT2Do.COLUMNS.T2UNITPRICE.name(), tsT2Do.getT2unitprice()); 
			dataObject.setValue(TsT2Do.COLUMNS.T2ODECLNO.name(), tsT2Do.getT2odeclno()); 
			dataObject.setValue(TsT2Do.COLUMNS.T2OITEM.name(), tsT2Do.getT2oitem()); 
			dataObject.setValue(TsT2Do.COLUMNS.T2INPOST.name(), tsT2Do.getT2inpost()); 
			dataObject.setValue(TsT2Do.COLUMNS.T2OREFBILLNO.name(), tsT2Do.getT2orefbillno()); 
			dataObject.setValue(TsT2Do.COLUMNS.T2OREFBILLITEM.name(), tsT2Do.getT2orefbillitem()); 
			dataObject.setValue(TsT2Do.COLUMNS.T2DESCRIP.name(), tsT2Do.getT2descrip()); 
			dataObject.setValue(TsT2Do.COLUMNS.CONTROLNO.name(), tsT2Do.getControlno()); 
			dataObject.setValue(TsT2Do.COLUMNS.SERIALNO.name(), tsT2Do.getSerialno()); 
			dataObject.setValue(TsT2Do.COLUMNS.SEQNO.name(), tsT2Do.getSeqno()); 
			dataObject.setValue(TsT2Do.COLUMNS.ICONFIRMED.name(), tsT2Do.getIconfirmed()); 
			dataObject.setValue(TsT2Do.COLUMNS.T1BONDNO.name(), tsT2Do.getT1bondno()); 
			dataObject.setValue(TsT2Do.COLUMNS.T1TESTNO.name(), tsT2Do.getT1testno()); 
			dataObject.setValue(TsT2Do.COLUMNS.T1_SEQNO.name(), tsT2Do.getT1Seqno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TsT2Do> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TsT2Do po) { 
	} 
 
} 
