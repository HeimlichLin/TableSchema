package com.doc.common.dao.impl; 
 
public class MisExpressDAOImpl extends GeneralDAOImpl<MisExpressPo> implements MisExpressDAO { 
	public static final MisExpressDAOImpl INSTANCE = new MisExpressDAOImpl(); 
	public static final String TABLENAME = "MIS_EXPRESS"; 

	public MisExpressDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<MisExpressPo> CONVERTER = new MapConverter<MisExpressPo>() { 
 
		@Override 
		public MisExpressPo convert(final DataObject dataObject) { 
			final MisExpressPo misExpressPo = new MisExpressPo(); 
			misExpressPo.setExpressid(dataObject.getString(MisExpressPo.COLUMNS.EXPRESSID.name())); 
			misExpressPo.setExpresscname(dataObject.getString(MisExpressPo.COLUMNS.EXPRESSCNAME.name())); 
			misExpressPo.setExpressename(dataObject.getString(MisExpressPo.COLUMNS.EXPRESSENAME.name())); 
			misExpressPo.setExpresssname(dataObject.getString(MisExpressPo.COLUMNS.EXPRESSSNAME.name())); 
			misExpressPo.setBan(dataObject.getString(MisExpressPo.COLUMNS.BAN.name())); 
			misExpressPo.setBoxno(dataObject.getString(MisExpressPo.COLUMNS.BOXNO.name())); 
			misExpressPo.setChargebox(dataObject.getString(MisExpressPo.COLUMNS.CHARGEBOX.name())); 
			misExpressPo.setBaseref(BigDecimalUtils.formObj(dataObject.getValue(MisExpressPo.COLUMNS.BASEREF.name()))); 
			misExpressPo.setCurrenttotal(BigDecimalUtils.formObj(dataObject.getValue(MisExpressPo.COLUMNS.CURRENTTOTAL.name()))); 
			misExpressPo.setBaseline(BigDecimalUtils.formObj(dataObject.getValue(MisExpressPo.COLUMNS.BASELINE.name()))); 
			return misExpressPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final MisExpressPo misExpressPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(MisExpressPo.COLUMNS.EXPRESSID.name(), misExpressPo.getExpressid()); 
			dataObject.setValue(MisExpressPo.COLUMNS.EXPRESSCNAME.name(), misExpressPo.getExpresscname()); 
			dataObject.setValue(MisExpressPo.COLUMNS.EXPRESSENAME.name(), misExpressPo.getExpressename()); 
			dataObject.setValue(MisExpressPo.COLUMNS.EXPRESSSNAME.name(), misExpressPo.getExpresssname()); 
			dataObject.setValue(MisExpressPo.COLUMNS.BAN.name(), misExpressPo.getBan()); 
			dataObject.setValue(MisExpressPo.COLUMNS.BOXNO.name(), misExpressPo.getBoxno()); 
			dataObject.setValue(MisExpressPo.COLUMNS.CHARGEBOX.name(), misExpressPo.getChargebox()); 
			dataObject.setValue(MisExpressPo.COLUMNS.BASEREF.name(), misExpressPo.getBaseref()); 
			dataObject.setValue(MisExpressPo.COLUMNS.CURRENTTOTAL.name(), misExpressPo.getCurrenttotal()); 
			dataObject.setValue(MisExpressPo.COLUMNS.BASELINE.name(), misExpressPo.getBaseline()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<MisExpressPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(MisExpressPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
