package com.doc.common.dao.impl; 
 
public class GrntbillDAOImpl extends GeneralDAOImpl<GrntbillPo> implements GrntbillDAO { 
	public static final GrntbillDAOImpl INSTANCE = new GrntbillDAOImpl(); 
	public static final String TABLENAME = "GRNTBILL"; 

	public GrntbillDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<GrntbillPo> CONVERTER = new MapConverter<GrntbillPo>() { 
 
		@Override 
		public GrntbillPo convert(final DataObject dataObject) { 
			final GrntbillPo grntbillPo = new GrntbillPo(); 
			grntbillPo.setBfNo(dataObject.getString(GrntbillPo.COLUMNS.BF_NO.name())); 
			grntbillPo.setDepositMemoNo(dataObject.getString(GrntbillPo.COLUMNS.DEPOSIT_MEMO_NO.name())); 
			grntbillPo.setDepositStartDate(dataObject.getString(GrntbillPo.COLUMNS.DEPOSIT_START_DATE.name())); 
			grntbillPo.setDepositAmt(BigDecimalUtils.formObj(dataObject.getValue(GrntbillPo.COLUMNS.DEPOSIT_AMT.name()))); 
			grntbillPo.setDepositEndDate(dataObject.getString(GrntbillPo.COLUMNS.DEPOSIT_END_DATE.name())); 
			grntbillPo.setDepositMemo(dataObject.getString(GrntbillPo.COLUMNS.DEPOSIT_MEMO.name())); 
			grntbillPo.setUserId(dataObject.getString(GrntbillPo.COLUMNS.USER_ID.name())); 
			return grntbillPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final GrntbillPo grntbillPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(GrntbillPo.COLUMNS.BF_NO.name(), grntbillPo.getBfNo()); 
			dataObject.setValue(GrntbillPo.COLUMNS.DEPOSIT_MEMO_NO.name(), grntbillPo.getDepositMemoNo()); 
			dataObject.setValue(GrntbillPo.COLUMNS.DEPOSIT_START_DATE.name(), grntbillPo.getDepositStartDate()); 
			dataObject.setValue(GrntbillPo.COLUMNS.DEPOSIT_AMT.name(), grntbillPo.getDepositAmt()); 
			dataObject.setValue(GrntbillPo.COLUMNS.DEPOSIT_END_DATE.name(), grntbillPo.getDepositEndDate()); 
			dataObject.setValue(GrntbillPo.COLUMNS.DEPOSIT_MEMO.name(), grntbillPo.getDepositMemo()); 
			dataObject.setValue(GrntbillPo.COLUMNS.USER_ID.name(), grntbillPo.getUserId()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<GrntbillPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(GrntbillPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
