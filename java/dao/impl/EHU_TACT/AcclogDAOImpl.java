package com.doc.common.dao.impl; 
 
public class AcclogDAOImpl extends GeneralDAOImpl<AcclogPo> implements AcclogDAO { 
	public static final AcclogDAOImpl INSTANCE = new AcclogDAOImpl(); 
	public static final String TABLENAME = "ACCLOG"; 

	public AcclogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<AcclogPo> CONVERTER = new MapConverter<AcclogPo>() { 
 
		@Override 
		public AcclogPo convert(final DataObject dataObject) { 
			final AcclogPo acclogPo = new AcclogPo(); 
			acclogPo.setLoguserid(dataObject.getString(AcclogPo.COLUMNS.LOGUSERID.name())); 
			acclogPo.setLogdate(TimestampUtils.of(dataObject.getValue(AcclogPo.COLUMNS.LOGDATE.name()))); 
			acclogPo.setExpressid(dataObject.getString(AcclogPo.COLUMNS.EXPRESSID.name())); 
			acclogPo.setOldbaseref(BigDecimalUtils.formObj(dataObject.getValue(AcclogPo.COLUMNS.OLDBASEREF.name()))); 
			acclogPo.setOldcurrenttotoal(BigDecimalUtils.formObj(dataObject.getValue(AcclogPo.COLUMNS.OLDCURRENTTOTOAL.name()))); 
			acclogPo.setOldbaseline(BigDecimalUtils.formObj(dataObject.getValue(AcclogPo.COLUMNS.OLDBASELINE.name()))); 
			acclogPo.setAddcurrent(BigDecimalUtils.formObj(dataObject.getValue(AcclogPo.COLUMNS.ADDCURRENT.name()))); 
			acclogPo.setNewbaseref(BigDecimalUtils.formObj(dataObject.getValue(AcclogPo.COLUMNS.NEWBASEREF.name()))); 
			acclogPo.setNewcurrenttotal(BigDecimalUtils.formObj(dataObject.getValue(AcclogPo.COLUMNS.NEWCURRENTTOTAL.name()))); 
			acclogPo.setNewbaseline(BigDecimalUtils.formObj(dataObject.getValue(AcclogPo.COLUMNS.NEWBASELINE.name()))); 
			acclogPo.setLogtype(dataObject.getString(AcclogPo.COLUMNS.LOGTYPE.name())); 
			acclogPo.setVraddcurrent(BigDecimalUtils.formObj(dataObject.getValue(AcclogPo.COLUMNS.VRADDCURRENT.name()))); 
			acclogPo.setVraccount(dataObject.getString(AcclogPo.COLUMNS.VRACCOUNT.name())); 
			return acclogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final AcclogPo acclogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(AcclogPo.COLUMNS.LOGUSERID.name(), acclogPo.getLoguserid()); 
			dataObject.setValue(AcclogPo.COLUMNS.LOGDATE.name(), acclogPo.getLogdate()); 
			dataObject.setValue(AcclogPo.COLUMNS.EXPRESSID.name(), acclogPo.getExpressid()); 
			dataObject.setValue(AcclogPo.COLUMNS.OLDBASEREF.name(), acclogPo.getOldbaseref()); 
			dataObject.setValue(AcclogPo.COLUMNS.OLDCURRENTTOTOAL.name(), acclogPo.getOldcurrenttotoal()); 
			dataObject.setValue(AcclogPo.COLUMNS.OLDBASELINE.name(), acclogPo.getOldbaseline()); 
			dataObject.setValue(AcclogPo.COLUMNS.ADDCURRENT.name(), acclogPo.getAddcurrent()); 
			dataObject.setValue(AcclogPo.COLUMNS.NEWBASEREF.name(), acclogPo.getNewbaseref()); 
			dataObject.setValue(AcclogPo.COLUMNS.NEWCURRENTTOTAL.name(), acclogPo.getNewcurrenttotal()); 
			dataObject.setValue(AcclogPo.COLUMNS.NEWBASELINE.name(), acclogPo.getNewbaseline()); 
			dataObject.setValue(AcclogPo.COLUMNS.LOGTYPE.name(), acclogPo.getLogtype()); 
			dataObject.setValue(AcclogPo.COLUMNS.VRADDCURRENT.name(), acclogPo.getVraddcurrent()); 
			dataObject.setValue(AcclogPo.COLUMNS.VRACCOUNT.name(), acclogPo.getVraccount()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<AcclogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(AcclogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
