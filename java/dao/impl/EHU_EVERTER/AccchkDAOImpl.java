package com.doc.common.dao.impl; 
 
public class AccchkDAOImpl extends GeneralDAOImpl<AccchkPo> implements AccchkDAO { 
	public static final AccchkDAOImpl INSTANCE = new AccchkDAOImpl(); 
	public static final String TABLENAME = "ACCCHK"; 

	public AccchkDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<AccchkPo> CONVERTER = new MapConverter<AccchkPo>() { 
 
		@Override 
		public AccchkPo convert(final DataObject dataObject) { 
			final AccchkPo accchkPo = new AccchkPo(); 
			accchkPo.setLogdate(TimestampUtils.of(dataObject.getValue(AccchkPo.COLUMNS.LOGDATE.name()))); 
			accchkPo.setExptotal(BigDecimalUtils.formObj(dataObject.getValue(AccchkPo.COLUMNS.EXPTOTAL.name()))); 
			accchkPo.setOldtotla(BigDecimalUtils.formObj(dataObject.getValue(AccchkPo.COLUMNS.OLDTOTLA.name()))); 
			accchkPo.setAddtotal(BigDecimalUtils.formObj(dataObject.getValue(AccchkPo.COLUMNS.ADDTOTAL.name()))); 
			accchkPo.setDifftotal(BigDecimalUtils.formObj(dataObject.getValue(AccchkPo.COLUMNS.DIFFTOTAL.name()))); 
			accchkPo.setCurtotal(BigDecimalUtils.formObj(dataObject.getValue(AccchkPo.COLUMNS.CURTOTAL.name()))); 
			return accchkPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final AccchkPo accchkPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(AccchkPo.COLUMNS.LOGDATE.name(), accchkPo.getLogdate()); 
			dataObject.setValue(AccchkPo.COLUMNS.EXPTOTAL.name(), accchkPo.getExptotal()); 
			dataObject.setValue(AccchkPo.COLUMNS.OLDTOTLA.name(), accchkPo.getOldtotla()); 
			dataObject.setValue(AccchkPo.COLUMNS.ADDTOTAL.name(), accchkPo.getAddtotal()); 
			dataObject.setValue(AccchkPo.COLUMNS.DIFFTOTAL.name(), accchkPo.getDifftotal()); 
			dataObject.setValue(AccchkPo.COLUMNS.CURTOTAL.name(), accchkPo.getCurtotal()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<AccchkPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(AccchkPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
