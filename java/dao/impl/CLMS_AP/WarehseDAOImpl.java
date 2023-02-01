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
			warehsePo.setPostcode(dataObject.getString(WarehsePo.COLUMNS.POSTCODE.name())); 
			warehsePo.setBondno(dataObject.getString(WarehsePo.COLUMNS.BONDNO.name())); 
			warehsePo.setBondban(dataObject.getString(WarehsePo.COLUMNS.BONDBAN.name())); 
			warehsePo.setBondname(dataObject.getString(WarehsePo.COLUMNS.BONDNAME.name())); 
			warehsePo.setSpecialst(dataObject.getString(WarehsePo.COLUMNS.SPECIALST.name())); 
			warehsePo.setBondadd(dataObject.getString(WarehsePo.COLUMNS.BONDADD.name())); 
			warehsePo.setBondid(dataObject.getString(WarehsePo.COLUMNS.BONDID.name())); 
			warehsePo.setBondpw(dataObject.getString(WarehsePo.COLUMNS.BONDPW.name())); 
			warehsePo.setAuthority(dataObject.getString(WarehsePo.COLUMNS.AUTHORITY.name())); 
			warehsePo.setRcvid(dataObject.getString(WarehsePo.COLUMNS.RCVID.name())); 
			warehsePo.setSepid(dataObject.getString(WarehsePo.COLUMNS.SEPID.name())); 
			warehsePo.setCustomsoffice(dataObject.getString(WarehsePo.COLUMNS.CUSTOMSOFFICE.name())); 
			warehsePo.setRecvFlag(dataObject.getString(WarehsePo.COLUMNS.RECV_FLAG.name())); 
			warehsePo.setBondtype(dataObject.getString(WarehsePo.COLUMNS.BONDTYPE.name())); 
			warehsePo.setStatus(dataObject.getString(WarehsePo.COLUMNS.STATUS.name())); 
			warehsePo.setActivedate(TimestampUtils.of(dataObject.getValue(WarehsePo.COLUMNS.ACTIVEDATE.name()))); 
			warehsePo.setEnddate(TimestampUtils.of(dataObject.getValue(WarehsePo.COLUMNS.ENDDATE.name()))); 
			warehsePo.setChargedate(TimestampUtils.of(dataObject.getValue(WarehsePo.COLUMNS.CHARGEDATE.name()))); 
			warehsePo.setTel(dataObject.getString(WarehsePo.COLUMNS.TEL.name())); 
			warehsePo.setFax(dataObject.getString(WarehsePo.COLUMNS.FAX.name())); 
			warehsePo.setCofficer(dataObject.getString(WarehsePo.COLUMNS.COFFICER.name())); 
			warehsePo.setCustomFlag(dataObject.getString(WarehsePo.COLUMNS.CUSTOM_FLAG.name())); 
			warehsePo.setAutoconfirm(dataObject.getString(WarehsePo.COLUMNS.AUTOCONFIRM.name())); 
			return warehsePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final WarehsePo warehsePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WarehsePo.COLUMNS.POSTCODE.name(), warehsePo.getPostcode()); 
			dataObject.setValue(WarehsePo.COLUMNS.BONDNO.name(), warehsePo.getBondno()); 
			dataObject.setValue(WarehsePo.COLUMNS.BONDBAN.name(), warehsePo.getBondban()); 
			dataObject.setValue(WarehsePo.COLUMNS.BONDNAME.name(), warehsePo.getBondname()); 
			dataObject.setValue(WarehsePo.COLUMNS.SPECIALST.name(), warehsePo.getSpecialst()); 
			dataObject.setValue(WarehsePo.COLUMNS.BONDADD.name(), warehsePo.getBondadd()); 
			dataObject.setValue(WarehsePo.COLUMNS.BONDID.name(), warehsePo.getBondid()); 
			dataObject.setValue(WarehsePo.COLUMNS.BONDPW.name(), warehsePo.getBondpw()); 
			dataObject.setValue(WarehsePo.COLUMNS.AUTHORITY.name(), warehsePo.getAuthority()); 
			dataObject.setValue(WarehsePo.COLUMNS.RCVID.name(), warehsePo.getRcvid()); 
			dataObject.setValue(WarehsePo.COLUMNS.SEPID.name(), warehsePo.getSepid()); 
			dataObject.setValue(WarehsePo.COLUMNS.CUSTOMSOFFICE.name(), warehsePo.getCustomsoffice()); 
			dataObject.setValue(WarehsePo.COLUMNS.RECV_FLAG.name(), warehsePo.getRecvFlag()); 
			dataObject.setValue(WarehsePo.COLUMNS.BONDTYPE.name(), warehsePo.getBondtype()); 
			dataObject.setValue(WarehsePo.COLUMNS.STATUS.name(), warehsePo.getStatus()); 
			dataObject.setValue(WarehsePo.COLUMNS.ACTIVEDATE.name(), warehsePo.getActivedate()); 
			dataObject.setValue(WarehsePo.COLUMNS.ENDDATE.name(), warehsePo.getEnddate()); 
			dataObject.setValue(WarehsePo.COLUMNS.CHARGEDATE.name(), warehsePo.getChargedate()); 
			dataObject.setValue(WarehsePo.COLUMNS.TEL.name(), warehsePo.getTel()); 
			dataObject.setValue(WarehsePo.COLUMNS.FAX.name(), warehsePo.getFax()); 
			dataObject.setValue(WarehsePo.COLUMNS.COFFICER.name(), warehsePo.getCofficer()); 
			dataObject.setValue(WarehsePo.COLUMNS.CUSTOM_FLAG.name(), warehsePo.getCustomFlag()); 
			dataObject.setValue(WarehsePo.COLUMNS.AUTOCONFIRM.name(), warehsePo.getAutoconfirm()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<WarehsePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(WarehsePo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(WarehsePo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(WarehsePo.COLUMNS.BONDID.name(), po.getBondid()); 
		return sqlWhere; 
	} 
 
} 
