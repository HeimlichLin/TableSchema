package com.doc.common.dao.impl; 
 
public class Express970508DAOImpl extends GeneralDAOImpl<Express970508Po> implements Express970508DAO { 
	public static final Express970508DAOImpl INSTANCE = new Express970508DAOImpl(); 
	public static final String TABLENAME = "EXPRESS_970508"; 

	public Express970508DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Express970508Po> CONVERTER = new MapConverter<Express970508Po>() { 
 
		@Override 
		public Express970508Po convert(final DataObject dataObject) { 
			final Express970508Po express970508Po = new Express970508Po(); 
			express970508Po.setExpressid(dataObject.getString(Express970508Po.COLUMNS.EXPRESSID.name())); 
			express970508Po.setExpresscname(dataObject.getString(Express970508Po.COLUMNS.EXPRESSCNAME.name())); 
			express970508Po.setExpressename(dataObject.getString(Express970508Po.COLUMNS.EXPRESSENAME.name())); 
			express970508Po.setExpresssname(dataObject.getString(Express970508Po.COLUMNS.EXPRESSSNAME.name())); 
			express970508Po.setBan(dataObject.getString(Express970508Po.COLUMNS.BAN.name())); 
			express970508Po.setBoxno(dataObject.getString(Express970508Po.COLUMNS.BOXNO.name())); 
			express970508Po.setChargebox(dataObject.getString(Express970508Po.COLUMNS.CHARGEBOX.name())); 
			express970508Po.setBaseref(BigDecimalUtils.formObj(dataObject.getValue(Express970508Po.COLUMNS.BASEREF.name()))); 
			express970508Po.setCurrenttotal(BigDecimalUtils.formObj(dataObject.getValue(Express970508Po.COLUMNS.CURRENTTOTAL.name()))); 
			express970508Po.setBaseline(BigDecimalUtils.formObj(dataObject.getValue(Express970508Po.COLUMNS.BASELINE.name()))); 
			express970508Po.setOnlinebill(dataObject.getString(Express970508Po.COLUMNS.ONLINEBILL.name())); 
			express970508Po.setOnlinerecp(dataObject.getString(Express970508Po.COLUMNS.ONLINERECP.name())); 
			express970508Po.setFeeAlertdate(TimestampUtils.of(dataObject.getValue(Express970508Po.COLUMNS.FEE_ALERTDATE.name()))); 
			express970508Po.setFeeRecoverdate(TimestampUtils.of(dataObject.getValue(Express970508Po.COLUMNS.FEE_RECOVERDATE.name()))); 
			express970508Po.setFeeLogdate(TimestampUtils.of(dataObject.getValue(Express970508Po.COLUMNS.FEE_LOGDATE.name()))); 
			express970508Po.setChargetype(dataObject.getString(Express970508Po.COLUMNS.CHARGETYPE.name())); 
			express970508Po.setExpiredate(dataObject.getString(Express970508Po.COLUMNS.EXPIREDATE.name())); 
			express970508Po.setStartdate(dataObject.getString(Express970508Po.COLUMNS.STARTDATE.name())); 
			return express970508Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Express970508Po express970508Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Express970508Po.COLUMNS.EXPRESSID.name(), express970508Po.getExpressid()); 
			dataObject.setValue(Express970508Po.COLUMNS.EXPRESSCNAME.name(), express970508Po.getExpresscname()); 
			dataObject.setValue(Express970508Po.COLUMNS.EXPRESSENAME.name(), express970508Po.getExpressename()); 
			dataObject.setValue(Express970508Po.COLUMNS.EXPRESSSNAME.name(), express970508Po.getExpresssname()); 
			dataObject.setValue(Express970508Po.COLUMNS.BAN.name(), express970508Po.getBan()); 
			dataObject.setValue(Express970508Po.COLUMNS.BOXNO.name(), express970508Po.getBoxno()); 
			dataObject.setValue(Express970508Po.COLUMNS.CHARGEBOX.name(), express970508Po.getChargebox()); 
			dataObject.setValue(Express970508Po.COLUMNS.BASEREF.name(), express970508Po.getBaseref()); 
			dataObject.setValue(Express970508Po.COLUMNS.CURRENTTOTAL.name(), express970508Po.getCurrenttotal()); 
			dataObject.setValue(Express970508Po.COLUMNS.BASELINE.name(), express970508Po.getBaseline()); 
			dataObject.setValue(Express970508Po.COLUMNS.ONLINEBILL.name(), express970508Po.getOnlinebill()); 
			dataObject.setValue(Express970508Po.COLUMNS.ONLINERECP.name(), express970508Po.getOnlinerecp()); 
			dataObject.setValue(Express970508Po.COLUMNS.FEE_ALERTDATE.name(), express970508Po.getFeeAlertdate()); 
			dataObject.setValue(Express970508Po.COLUMNS.FEE_RECOVERDATE.name(), express970508Po.getFeeRecoverdate()); 
			dataObject.setValue(Express970508Po.COLUMNS.FEE_LOGDATE.name(), express970508Po.getFeeLogdate()); 
			dataObject.setValue(Express970508Po.COLUMNS.CHARGETYPE.name(), express970508Po.getChargetype()); 
			dataObject.setValue(Express970508Po.COLUMNS.EXPIREDATE.name(), express970508Po.getExpiredate()); 
			dataObject.setValue(Express970508Po.COLUMNS.STARTDATE.name(), express970508Po.getStartdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Express970508Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Express970508Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
