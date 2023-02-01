package com.doc.common.dao.impl; 
 
public class CpgMainDAOImpl extends GeneralDAOImpl<CpgMainPo> implements CpgMainDAO { 
	public static final CpgMainDAOImpl INSTANCE = new CpgMainDAOImpl(); 
	public static final String TABLENAME = "CPG_MAIN"; 

	public CpgMainDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<CpgMainPo> CONVERTER = new MapConverter<CpgMainPo>() { 
 
		@Override 
		public CpgMainPo convert(final DataObject dataObject) { 
			final CpgMainPo cpgMainPo = new CpgMainPo(); 
			cpgMainPo.setMessageid(dataObject.getString(CpgMainPo.COLUMNS.MESSAGEID.name())); 
			cpgMainPo.setMessagename(dataObject.getString(CpgMainPo.COLUMNS.MESSAGENAME.name())); 
			cpgMainPo.setMessageversion(dataObject.getString(CpgMainPo.COLUMNS.MESSAGEVERSION.name())); 
			cpgMainPo.setSenderid(dataObject.getString(CpgMainPo.COLUMNS.SENDERID.name())); 
			cpgMainPo.setRecipienttype(dataObject.getString(CpgMainPo.COLUMNS.RECIPIENTTYPE.name())); 
			cpgMainPo.setRecipientid(dataObject.getString(CpgMainPo.COLUMNS.RECIPIENTID.name())); 
			cpgMainPo.setMsgfunccode(dataObject.getString(CpgMainPo.COLUMNS.MSGFUNCCODE.name())); 
			cpgMainPo.setMessagetype(dataObject.getString(CpgMainPo.COLUMNS.MESSAGETYPE.name())); 
			cpgMainPo.setPostspecialaccount(dataObject.getString(CpgMainPo.COLUMNS.POSTSPECIALACCOUNT.name())); 
			cpgMainPo.setPosttype(dataObject.getString(CpgMainPo.COLUMNS.POSTTYPE.name())); 
			cpgMainPo.setYear(dataObject.getString(CpgMainPo.COLUMNS.YEAR.name())); 
			cpgMainPo.setCountrycode(dataObject.getString(CpgMainPo.COLUMNS.COUNTRYCODE.name())); 
			cpgMainPo.setExchangeagency(dataObject.getString(CpgMainPo.COLUMNS.EXCHANGEAGENCY.name())); 
			cpgMainPo.setTotalpackageno(BigDecimalUtils.formObj(dataObject.getValue(CpgMainPo.COLUMNS.TOTALPACKAGENO.name()))); 
			cpgMainPo.setSealdatetime(dataObject.getString(CpgMainPo.COLUMNS.SEALDATETIME.name())); 
			cpgMainPo.setPostmblno(dataObject.getString(CpgMainPo.COLUMNS.POSTMBLNO.name())); 
			cpgMainPo.setLastyeartotalpackageno(dataObject.getString(CpgMainPo.COLUMNS.LASTYEARTOTALPACKAGENO.name())); 
			cpgMainPo.setTotalqty(BigDecimalUtils.formObj(dataObject.getValue(CpgMainPo.COLUMNS.TOTALQTY.name()))); 
			cpgMainPo.setTotalpagecount(BigDecimalUtils.formObj(dataObject.getValue(CpgMainPo.COLUMNS.TOTALPAGECOUNT.name()))); 
			cpgMainPo.setTotalbagnumber(BigDecimalUtils.formObj(dataObject.getValue(CpgMainPo.COLUMNS.TOTALBAGNUMBER.name()))); 
			cpgMainPo.setTotalweight(BigDecimalUtils.formObj(dataObject.getValue(CpgMainPo.COLUMNS.TOTALWEIGHT.name()))); 
			cpgMainPo.setOtherfields(dataObject.getString(CpgMainPo.COLUMNS.OTHERFIELDS.name())); 
			cpgMainPo.setFilename(dataObject.getString(CpgMainPo.COLUMNS.FILENAME.name())); 
			cpgMainPo.setCreatetime(dataObject.getString(CpgMainPo.COLUMNS.CREATETIME.name())); 
			return cpgMainPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final CpgMainPo cpgMainPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(CpgMainPo.COLUMNS.MESSAGEID.name(), cpgMainPo.getMessageid()); 
			dataObject.setValue(CpgMainPo.COLUMNS.MESSAGENAME.name(), cpgMainPo.getMessagename()); 
			dataObject.setValue(CpgMainPo.COLUMNS.MESSAGEVERSION.name(), cpgMainPo.getMessageversion()); 
			dataObject.setValue(CpgMainPo.COLUMNS.SENDERID.name(), cpgMainPo.getSenderid()); 
			dataObject.setValue(CpgMainPo.COLUMNS.RECIPIENTTYPE.name(), cpgMainPo.getRecipienttype()); 
			dataObject.setValue(CpgMainPo.COLUMNS.RECIPIENTID.name(), cpgMainPo.getRecipientid()); 
			dataObject.setValue(CpgMainPo.COLUMNS.MSGFUNCCODE.name(), cpgMainPo.getMsgfunccode()); 
			dataObject.setValue(CpgMainPo.COLUMNS.MESSAGETYPE.name(), cpgMainPo.getMessagetype()); 
			dataObject.setValue(CpgMainPo.COLUMNS.POSTSPECIALACCOUNT.name(), cpgMainPo.getPostspecialaccount()); 
			dataObject.setValue(CpgMainPo.COLUMNS.POSTTYPE.name(), cpgMainPo.getPosttype()); 
			dataObject.setValue(CpgMainPo.COLUMNS.YEAR.name(), cpgMainPo.getYear()); 
			dataObject.setValue(CpgMainPo.COLUMNS.COUNTRYCODE.name(), cpgMainPo.getCountrycode()); 
			dataObject.setValue(CpgMainPo.COLUMNS.EXCHANGEAGENCY.name(), cpgMainPo.getExchangeagency()); 
			dataObject.setValue(CpgMainPo.COLUMNS.TOTALPACKAGENO.name(), cpgMainPo.getTotalpackageno()); 
			dataObject.setValue(CpgMainPo.COLUMNS.SEALDATETIME.name(), cpgMainPo.getSealdatetime()); 
			dataObject.setValue(CpgMainPo.COLUMNS.POSTMBLNO.name(), cpgMainPo.getPostmblno()); 
			dataObject.setValue(CpgMainPo.COLUMNS.LASTYEARTOTALPACKAGENO.name(), cpgMainPo.getLastyeartotalpackageno()); 
			dataObject.setValue(CpgMainPo.COLUMNS.TOTALQTY.name(), cpgMainPo.getTotalqty()); 
			dataObject.setValue(CpgMainPo.COLUMNS.TOTALPAGECOUNT.name(), cpgMainPo.getTotalpagecount()); 
			dataObject.setValue(CpgMainPo.COLUMNS.TOTALBAGNUMBER.name(), cpgMainPo.getTotalbagnumber()); 
			dataObject.setValue(CpgMainPo.COLUMNS.TOTALWEIGHT.name(), cpgMainPo.getTotalweight()); 
			dataObject.setValue(CpgMainPo.COLUMNS.OTHERFIELDS.name(), cpgMainPo.getOtherfields()); 
			dataObject.setValue(CpgMainPo.COLUMNS.FILENAME.name(), cpgMainPo.getFilename()); 
			dataObject.setValue(CpgMainPo.COLUMNS.CREATETIME.name(), cpgMainPo.getCreatetime()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<CpgMainPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(CpgMainPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
