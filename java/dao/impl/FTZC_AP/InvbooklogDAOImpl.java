package com.doc.common.dao.impl; 
 
public class InvbooklogDAOImpl extends GeneralDAOImpl<InvbooklogPo> implements InvbooklogDAO { 
	public static final InvbooklogDAOImpl INSTANCE = new InvbooklogDAOImpl(); 
	public static final String TABLENAME = "INVBOOKLOG"; 

	public InvbooklogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<InvbooklogPo> CONVERTER = new MapConverter<InvbooklogPo>() { 
 
		@Override 
		public InvbooklogPo convert(final DataObject dataObject) { 
			final InvbooklogPo invbooklogPo = new InvbooklogPo(); 
			invbooklogPo.setBfNo(dataObject.getString(InvbooklogPo.COLUMNS.BF_NO.name())); 
			invbooklogPo.setInvYear(dataObject.getString(InvbooklogPo.COLUMNS.INV_YEAR.name())); 
			invbooklogPo.setInvDate(dataObject.getString(InvbooklogPo.COLUMNS.INV_DATE.name())); 
			invbooklogPo.setUserId(dataObject.getString(InvbooklogPo.COLUMNS.USER_ID.name())); 
			invbooklogPo.setInvStartDate(dataObject.getString(InvbooklogPo.COLUMNS.INV_START_DATE.name())); 
			invbooklogPo.setInvEndDate(dataObject.getString(InvbooklogPo.COLUMNS.INV_END_DATE.name())); 
			invbooklogPo.setLogDatm(dataObject.getString(InvbooklogPo.COLUMNS.LOG_DATM.name())); 
			invbooklogPo.setInvType(dataObject.getString(InvbooklogPo.COLUMNS.INV_TYPE.name())); 
			return invbooklogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final InvbooklogPo invbooklogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(InvbooklogPo.COLUMNS.BF_NO.name(), invbooklogPo.getBfNo()); 
			dataObject.setValue(InvbooklogPo.COLUMNS.INV_YEAR.name(), invbooklogPo.getInvYear()); 
			dataObject.setValue(InvbooklogPo.COLUMNS.INV_DATE.name(), invbooklogPo.getInvDate()); 
			dataObject.setValue(InvbooklogPo.COLUMNS.USER_ID.name(), invbooklogPo.getUserId()); 
			dataObject.setValue(InvbooklogPo.COLUMNS.INV_START_DATE.name(), invbooklogPo.getInvStartDate()); 
			dataObject.setValue(InvbooklogPo.COLUMNS.INV_END_DATE.name(), invbooklogPo.getInvEndDate()); 
			dataObject.setValue(InvbooklogPo.COLUMNS.LOG_DATM.name(), invbooklogPo.getLogDatm()); 
			dataObject.setValue(InvbooklogPo.COLUMNS.INV_TYPE.name(), invbooklogPo.getInvType()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<InvbooklogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(InvbooklogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
