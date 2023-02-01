package com.doc.common.dao.impl; 
 
public class WarehseDAOImpl extends GeneralDAOImpl<WarehsePo> implements WarehseDAO { 
	public static final WarehseDAOImpl INSTANCE = new WarehseDAOImpl(); 
	public static final String TABLENAME = "WAREHSE"; 

	public WarehseDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<WarehsePo> CONVERTER = new MapConverter<WarehsePo>() { 
 
		@Override 
		public WarehsePo convert(final DataObject dataObject) { 
			final WarehsePo warehsePo = new WarehsePo(); 
			warehsePo.setBfNo(dataObject.getString(WarehsePo.COLUMNS.BF_NO.name())); 
			warehsePo.setPostCode(dataObject.getString(WarehsePo.COLUMNS.POST_CODE.name())); 
			warehsePo.setBondBan(dataObject.getString(WarehsePo.COLUMNS.BOND_BAN.name())); 
			warehsePo.setBondName(dataObject.getString(WarehsePo.COLUMNS.BOND_NAME.name())); 
			warehsePo.setSpecialst(dataObject.getString(WarehsePo.COLUMNS.SPECIALST.name())); 
			warehsePo.setBondAdd(dataObject.getString(WarehsePo.COLUMNS.BOND_ADD.name())); 
			warehsePo.setBondId(dataObject.getString(WarehsePo.COLUMNS.BOND_ID.name())); 
			warehsePo.setBondPw(dataObject.getString(WarehsePo.COLUMNS.BOND_PW.name())); 
			warehsePo.setAuthority(dataObject.getString(WarehsePo.COLUMNS.AUTHORITY.name())); 
			warehsePo.setRcvId(dataObject.getString(WarehsePo.COLUMNS.RCV_ID.name())); 
			warehsePo.setSepId(dataObject.getString(WarehsePo.COLUMNS.SEP_ID.name())); 
			warehsePo.setCustomsOffice(dataObject.getString(WarehsePo.COLUMNS.CUSTOMS_OFFICE.name())); 
			warehsePo.setRecvFlag(dataObject.getString(WarehsePo.COLUMNS.RECV_FLAG.name())); 
			warehsePo.setBondType(dataObject.getString(WarehsePo.COLUMNS.BOND_TYPE.name())); 
			warehsePo.setStatus(dataObject.getString(WarehsePo.COLUMNS.STATUS.name())); 
			warehsePo.setActiveDate(TimestampUtils.of(dataObject.getValue(WarehsePo.COLUMNS.ACTIVE_DATE.name()))); 
			warehsePo.setEndDate(TimestampUtils.of(dataObject.getValue(WarehsePo.COLUMNS.END_DATE.name()))); 
			warehsePo.setChargeDate(TimestampUtils.of(dataObject.getValue(WarehsePo.COLUMNS.CHARGE_DATE.name()))); 
			warehsePo.setTel(dataObject.getString(WarehsePo.COLUMNS.TEL.name())); 
			warehsePo.setFax(dataObject.getString(WarehsePo.COLUMNS.FAX.name())); 
			warehsePo.setAncy(dataObject.getString(WarehsePo.COLUMNS.ANCY.name())); 
			warehsePo.setT5Flag(dataObject.getString(WarehsePo.COLUMNS.T5_FLAG.name())); 
			return warehsePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final WarehsePo warehsePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WarehsePo.COLUMNS.BF_NO.name(), warehsePo.getBfNo()); 
			dataObject.setValue(WarehsePo.COLUMNS.POST_CODE.name(), warehsePo.getPostCode()); 
			dataObject.setValue(WarehsePo.COLUMNS.BOND_BAN.name(), warehsePo.getBondBan()); 
			dataObject.setValue(WarehsePo.COLUMNS.BOND_NAME.name(), warehsePo.getBondName()); 
			dataObject.setValue(WarehsePo.COLUMNS.SPECIALST.name(), warehsePo.getSpecialst()); 
			dataObject.setValue(WarehsePo.COLUMNS.BOND_ADD.name(), warehsePo.getBondAdd()); 
			dataObject.setValue(WarehsePo.COLUMNS.BOND_ID.name(), warehsePo.getBondId()); 
			dataObject.setValue(WarehsePo.COLUMNS.BOND_PW.name(), warehsePo.getBondPw()); 
			dataObject.setValue(WarehsePo.COLUMNS.AUTHORITY.name(), warehsePo.getAuthority()); 
			dataObject.setValue(WarehsePo.COLUMNS.RCV_ID.name(), warehsePo.getRcvId()); 
			dataObject.setValue(WarehsePo.COLUMNS.SEP_ID.name(), warehsePo.getSepId()); 
			dataObject.setValue(WarehsePo.COLUMNS.CUSTOMS_OFFICE.name(), warehsePo.getCustomsOffice()); 
			dataObject.setValue(WarehsePo.COLUMNS.RECV_FLAG.name(), warehsePo.getRecvFlag()); 
			dataObject.setValue(WarehsePo.COLUMNS.BOND_TYPE.name(), warehsePo.getBondType()); 
			dataObject.setValue(WarehsePo.COLUMNS.STATUS.name(), warehsePo.getStatus()); 
			dataObject.setValue(WarehsePo.COLUMNS.ACTIVE_DATE.name(), warehsePo.getActiveDate()); 
			dataObject.setValue(WarehsePo.COLUMNS.END_DATE.name(), warehsePo.getEndDate()); 
			dataObject.setValue(WarehsePo.COLUMNS.CHARGE_DATE.name(), warehsePo.getChargeDate()); 
			dataObject.setValue(WarehsePo.COLUMNS.TEL.name(), warehsePo.getTel()); 
			dataObject.setValue(WarehsePo.COLUMNS.FAX.name(), warehsePo.getFax()); 
			dataObject.setValue(WarehsePo.COLUMNS.ANCY.name(), warehsePo.getAncy()); 
			dataObject.setValue(WarehsePo.COLUMNS.T5_FLAG.name(), warehsePo.getT5Flag()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<WarehsePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(WarehsePo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(WarehsePo.COLUMNS.BF_NO.name(), po.getBfNo()); 
		return sqlWhere; 
	} 
 
} 
