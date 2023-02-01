package com.doc.common.dao.impl; 
 
public class ExpresslogDAOImpl extends GeneralDAOImpl<ExpresslogPo> implements ExpresslogDAO { 
	public static final ExpresslogDAOImpl INSTANCE = new ExpresslogDAOImpl(); 
	public static final String TABLENAME = "EXPRESSLOG"; 

	public ExpresslogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ExpresslogPo> CONVERTER = new MapConverter<ExpresslogPo>() { 
 
		@Override 
		public ExpresslogPo convert(final DataObject dataObject) { 
			final ExpresslogPo expresslogPo = new ExpresslogPo(); 
			expresslogPo.setExpressid(dataObject.getString(ExpresslogPo.COLUMNS.EXPRESSID.name())); 
			expresslogPo.setExpresscname(dataObject.getString(ExpresslogPo.COLUMNS.EXPRESSCNAME.name())); 
			expresslogPo.setExpressename(dataObject.getString(ExpresslogPo.COLUMNS.EXPRESSENAME.name())); 
			expresslogPo.setExpresssname(dataObject.getString(ExpresslogPo.COLUMNS.EXPRESSSNAME.name())); 
			expresslogPo.setBan(dataObject.getString(ExpresslogPo.COLUMNS.BAN.name())); 
			expresslogPo.setBoxno(dataObject.getString(ExpresslogPo.COLUMNS.BOXNO.name())); 
			expresslogPo.setChargebox(dataObject.getString(ExpresslogPo.COLUMNS.CHARGEBOX.name())); 
			expresslogPo.setBaseref(BigDecimalUtils.formObj(dataObject.getValue(ExpresslogPo.COLUMNS.BASEREF.name()))); 
			expresslogPo.setCurrenttotal(BigDecimalUtils.formObj(dataObject.getValue(ExpresslogPo.COLUMNS.CURRENTTOTAL.name()))); 
			expresslogPo.setBaseline(BigDecimalUtils.formObj(dataObject.getValue(ExpresslogPo.COLUMNS.BASELINE.name()))); 
			expresslogPo.setAction(dataObject.getString(ExpresslogPo.COLUMNS.ACTION.name())); 
			return expresslogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ExpresslogPo expresslogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ExpresslogPo.COLUMNS.EXPRESSID.name(), expresslogPo.getExpressid()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.EXPRESSCNAME.name(), expresslogPo.getExpresscname()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.EXPRESSENAME.name(), expresslogPo.getExpressename()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.EXPRESSSNAME.name(), expresslogPo.getExpresssname()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.BAN.name(), expresslogPo.getBan()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.BOXNO.name(), expresslogPo.getBoxno()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.CHARGEBOX.name(), expresslogPo.getChargebox()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.BASEREF.name(), expresslogPo.getBaseref()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.CURRENTTOTAL.name(), expresslogPo.getCurrenttotal()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.BASELINE.name(), expresslogPo.getBaseline()); 
			dataObject.setValue(ExpresslogPo.COLUMNS.ACTION.name(), expresslogPo.getAction()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ExpresslogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ExpresslogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
