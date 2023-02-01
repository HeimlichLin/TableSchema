package com.doc.common.dao.impl; 
 
public class WarehseLogDAOImpl extends GeneralDAOImpl<WarehseLogPo> implements WarehseLogDAO { 
	public static final WarehseLogDAOImpl INSTANCE = new WarehseLogDAOImpl(); 
	public static final String TABLENAME = "WAREHSE_LOG"; 

	public WarehseLogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<WarehseLogPo> CONVERTER = new MapConverter<WarehseLogPo>() { 
 
		@Override 
		public WarehseLogPo convert(final DataObject dataObject) { 
			final WarehseLogPo warehseLogPo = new WarehseLogPo(); 
			warehseLogPo.setPostcode(dataObject.getString(WarehseLogPo.COLUMNS.POSTCODE.name())); 
			warehseLogPo.setBondno(dataObject.getString(WarehseLogPo.COLUMNS.BONDNO.name())); 
			warehseLogPo.setBondban(dataObject.getString(WarehseLogPo.COLUMNS.BONDBAN.name())); 
			warehseLogPo.setBondname(dataObject.getString(WarehseLogPo.COLUMNS.BONDNAME.name())); 
			warehseLogPo.setSpecialst(dataObject.getString(WarehseLogPo.COLUMNS.SPECIALST.name())); 
			warehseLogPo.setBondadd(dataObject.getString(WarehseLogPo.COLUMNS.BONDADD.name())); 
			warehseLogPo.setBondid(dataObject.getString(WarehseLogPo.COLUMNS.BONDID.name())); 
			warehseLogPo.setBondpw(dataObject.getString(WarehseLogPo.COLUMNS.BONDPW.name())); 
			warehseLogPo.setAuthority(dataObject.getString(WarehseLogPo.COLUMNS.AUTHORITY.name())); 
			warehseLogPo.setRcvid(dataObject.getString(WarehseLogPo.COLUMNS.RCVID.name())); 
			warehseLogPo.setSepid(dataObject.getString(WarehseLogPo.COLUMNS.SEPID.name())); 
			warehseLogPo.setCustomsoffice(dataObject.getString(WarehseLogPo.COLUMNS.CUSTOMSOFFICE.name())); 
			warehseLogPo.setRecvFlag(dataObject.getString(WarehseLogPo.COLUMNS.RECV_FLAG.name())); 
			warehseLogPo.setBondtype(dataObject.getString(WarehseLogPo.COLUMNS.BONDTYPE.name())); 
			warehseLogPo.setStatus(dataObject.getString(WarehseLogPo.COLUMNS.STATUS.name())); 
			warehseLogPo.setActivedate(TimestampUtils.of(dataObject.getValue(WarehseLogPo.COLUMNS.ACTIVEDATE.name()))); 
			warehseLogPo.setEnddate(TimestampUtils.of(dataObject.getValue(WarehseLogPo.COLUMNS.ENDDATE.name()))); 
			warehseLogPo.setChargedate(TimestampUtils.of(dataObject.getValue(WarehseLogPo.COLUMNS.CHARGEDATE.name()))); 
			warehseLogPo.setTel(dataObject.getString(WarehseLogPo.COLUMNS.TEL.name())); 
			warehseLogPo.setFax(dataObject.getString(WarehseLogPo.COLUMNS.FAX.name())); 
			warehseLogPo.setCofficer(dataObject.getString(WarehseLogPo.COLUMNS.COFFICER.name())); 
			warehseLogPo.setCustomFlag(dataObject.getString(WarehseLogPo.COLUMNS.CUSTOM_FLAG.name())); 
			warehseLogPo.setAutoconfirm(dataObject.getString(WarehseLogPo.COLUMNS.AUTOCONFIRM.name())); 
			warehseLogPo.setProcesstime(TimestampUtils.of(dataObject.getValue(WarehseLogPo.COLUMNS.PROCESSTIME.name()))); 
			warehseLogPo.setProcessstate(dataObject.getString(WarehseLogPo.COLUMNS.PROCESSSTATE.name())); 
			return warehseLogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final WarehseLogPo warehseLogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WarehseLogPo.COLUMNS.POSTCODE.name(), warehseLogPo.getPostcode()); 
			dataObject.setValue(WarehseLogPo.COLUMNS.BONDNO.name(), warehseLogPo.getBondno()); 
			dataObject.setValue(WarehseLogPo.COLUMNS.BONDBAN.name(), warehseLogPo.getBondban()); 
			dataObject.setValue(WarehseLogPo.COLUMNS.BONDNAME.name(), warehseLogPo.getBondname()); 
			dataObject.setValue(WarehseLogPo.COLUMNS.SPECIALST.name(), warehseLogPo.getSpecialst()); 
			dataObject.setValue(WarehseLogPo.COLUMNS.BONDADD.name(), warehseLogPo.getBondadd()); 
			dataObject.setValue(WarehseLogPo.COLUMNS.BONDID.name(), warehseLogPo.getBondid()); 
			dataObject.setValue(WarehseLogPo.COLUMNS.BONDPW.name(), warehseLogPo.getBondpw()); 
			dataObject.setValue(WarehseLogPo.COLUMNS.AUTHORITY.name(), warehseLogPo.getAuthority()); 
			dataObject.setValue(WarehseLogPo.COLUMNS.RCVID.name(), warehseLogPo.getRcvid()); 
			dataObject.setValue(WarehseLogPo.COLUMNS.SEPID.name(), warehseLogPo.getSepid()); 
			dataObject.setValue(WarehseLogPo.COLUMNS.CUSTOMSOFFICE.name(), warehseLogPo.getCustomsoffice()); 
			dataObject.setValue(WarehseLogPo.COLUMNS.RECV_FLAG.name(), warehseLogPo.getRecvFlag()); 
			dataObject.setValue(WarehseLogPo.COLUMNS.BONDTYPE.name(), warehseLogPo.getBondtype()); 
			dataObject.setValue(WarehseLogPo.COLUMNS.STATUS.name(), warehseLogPo.getStatus()); 
			dataObject.setValue(WarehseLogPo.COLUMNS.ACTIVEDATE.name(), warehseLogPo.getActivedate()); 
			dataObject.setValue(WarehseLogPo.COLUMNS.ENDDATE.name(), warehseLogPo.getEnddate()); 
			dataObject.setValue(WarehseLogPo.COLUMNS.CHARGEDATE.name(), warehseLogPo.getChargedate()); 
			dataObject.setValue(WarehseLogPo.COLUMNS.TEL.name(), warehseLogPo.getTel()); 
			dataObject.setValue(WarehseLogPo.COLUMNS.FAX.name(), warehseLogPo.getFax()); 
			dataObject.setValue(WarehseLogPo.COLUMNS.COFFICER.name(), warehseLogPo.getCofficer()); 
			dataObject.setValue(WarehseLogPo.COLUMNS.CUSTOM_FLAG.name(), warehseLogPo.getCustomFlag()); 
			dataObject.setValue(WarehseLogPo.COLUMNS.AUTOCONFIRM.name(), warehseLogPo.getAutoconfirm()); 
			dataObject.setValue(WarehseLogPo.COLUMNS.PROCESSTIME.name(), warehseLogPo.getProcesstime()); 
			dataObject.setValue(WarehseLogPo.COLUMNS.PROCESSSTATE.name(), warehseLogPo.getProcessstate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<WarehseLogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(WarehseLogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
