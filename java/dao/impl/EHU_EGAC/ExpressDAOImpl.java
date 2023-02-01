package com.doc.common.dao.impl; 
 
public class ExpressDAOImpl extends GeneralDAOImpl<ExpressPo> implements ExpressDAO { 
	public static final ExpressDAOImpl INSTANCE = new ExpressDAOImpl(); 
	public static final String TABLENAME = "EXPRESS"; 

	public ExpressDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ExpressPo> CONVERTER = new MapConverter<ExpressPo>() { 
 
		@Override 
		public ExpressPo convert(final DataObject dataObject) { 
			final ExpressPo expressPo = new ExpressPo(); 
			expressPo.setExpressid(dataObject.getString(ExpressPo.COLUMNS.EXPRESSID.name())); 
			expressPo.setExpresscname(dataObject.getString(ExpressPo.COLUMNS.EXPRESSCNAME.name())); 
			expressPo.setExpressename(dataObject.getString(ExpressPo.COLUMNS.EXPRESSENAME.name())); 
			expressPo.setExpresssname(dataObject.getString(ExpressPo.COLUMNS.EXPRESSSNAME.name())); 
			expressPo.setBan(dataObject.getString(ExpressPo.COLUMNS.BAN.name())); 
			expressPo.setBoxno(dataObject.getString(ExpressPo.COLUMNS.BOXNO.name())); 
			expressPo.setChargebox(dataObject.getString(ExpressPo.COLUMNS.CHARGEBOX.name())); 
			expressPo.setBaseref(BigDecimalUtils.formObj(dataObject.getValue(ExpressPo.COLUMNS.BASEREF.name()))); 
			expressPo.setCurrenttotal(BigDecimalUtils.formObj(dataObject.getValue(ExpressPo.COLUMNS.CURRENTTOTAL.name()))); 
			expressPo.setBaseline(BigDecimalUtils.formObj(dataObject.getValue(ExpressPo.COLUMNS.BASELINE.name()))); 
			expressPo.setOnlinebill(dataObject.getString(ExpressPo.COLUMNS.ONLINEBILL.name())); 
			expressPo.setOnlinerecp(dataObject.getString(ExpressPo.COLUMNS.ONLINERECP.name())); 
			expressPo.setDeclweightcharge(dataObject.getString(ExpressPo.COLUMNS.DECLWEIGHTCHARGE.name())); 
			expressPo.setRelease(dataObject.getString(ExpressPo.COLUMNS.RELEASE.name())); 
			expressPo.setImpchk(dataObject.getString(ExpressPo.COLUMNS.IMPCHK.name())); 
			expressPo.setExpchk(dataObject.getString(ExpressPo.COLUMNS.EXPCHK.name())); 
			return expressPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ExpressPo expressPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ExpressPo.COLUMNS.EXPRESSID.name(), expressPo.getExpressid()); 
			dataObject.setValue(ExpressPo.COLUMNS.EXPRESSCNAME.name(), expressPo.getExpresscname()); 
			dataObject.setValue(ExpressPo.COLUMNS.EXPRESSENAME.name(), expressPo.getExpressename()); 
			dataObject.setValue(ExpressPo.COLUMNS.EXPRESSSNAME.name(), expressPo.getExpresssname()); 
			dataObject.setValue(ExpressPo.COLUMNS.BAN.name(), expressPo.getBan()); 
			dataObject.setValue(ExpressPo.COLUMNS.BOXNO.name(), expressPo.getBoxno()); 
			dataObject.setValue(ExpressPo.COLUMNS.CHARGEBOX.name(), expressPo.getChargebox()); 
			dataObject.setValue(ExpressPo.COLUMNS.BASEREF.name(), expressPo.getBaseref()); 
			dataObject.setValue(ExpressPo.COLUMNS.CURRENTTOTAL.name(), expressPo.getCurrenttotal()); 
			dataObject.setValue(ExpressPo.COLUMNS.BASELINE.name(), expressPo.getBaseline()); 
			dataObject.setValue(ExpressPo.COLUMNS.ONLINEBILL.name(), expressPo.getOnlinebill()); 
			dataObject.setValue(ExpressPo.COLUMNS.ONLINERECP.name(), expressPo.getOnlinerecp()); 
			dataObject.setValue(ExpressPo.COLUMNS.DECLWEIGHTCHARGE.name(), expressPo.getDeclweightcharge()); 
			dataObject.setValue(ExpressPo.COLUMNS.RELEASE.name(), expressPo.getRelease()); 
			dataObject.setValue(ExpressPo.COLUMNS.IMPCHK.name(), expressPo.getImpchk()); 
			dataObject.setValue(ExpressPo.COLUMNS.EXPCHK.name(), expressPo.getExpchk()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ExpressPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ExpressPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
