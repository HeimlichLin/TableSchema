package com.doc.common.dao.impl; 
 
public class WarehseDAO extends GeneralDAOImpl<WarehseDo> implements WarehseDAO { 
	public static final WarehseDAOImpl INSTANCE = new WarehseDAOImpl(); 
	public static final String TABLENAME = "WAREHSE"; 

	public WarehseDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<WarehseDo> CONVERTER = new MapConverter<WarehseDo>() { 
 
		@Override 
		public WarehseDo convert(final DataObject dataObject) { 
			final WarehseDo warehseDo = new WarehseDo(); 
			warehseDo.setPostcode(dataObject.getString(WarehseDo.COLUMNS.POSTCODE.name())); 
			warehseDo.setBondno(dataObject.getString(WarehseDo.COLUMNS.BONDNO.name())); 
			warehseDo.setBondban(dataObject.getString(WarehseDo.COLUMNS.BONDBAN.name())); 
			warehseDo.setBondname(dataObject.getString(WarehseDo.COLUMNS.BONDNAME.name())); 
			warehseDo.setSpecialst(dataObject.getString(WarehseDo.COLUMNS.SPECIALST.name())); 
			warehseDo.setBondadd(dataObject.getString(WarehseDo.COLUMNS.BONDADD.name())); 
			warehseDo.setBondid(dataObject.getString(WarehseDo.COLUMNS.BONDID.name())); 
			warehseDo.setBondpw(dataObject.getString(WarehseDo.COLUMNS.BONDPW.name())); 
			warehseDo.setAuthority(dataObject.getString(WarehseDo.COLUMNS.AUTHORITY.name())); 
			warehseDo.setRcvid(dataObject.getString(WarehseDo.COLUMNS.RCVID.name())); 
			warehseDo.setSepid(dataObject.getString(WarehseDo.COLUMNS.SEPID.name())); 
			warehseDo.setCustomsoffice(dataObject.getString(WarehseDo.COLUMNS.CUSTOMSOFFICE.name())); 
			warehseDo.setRecvFlag(dataObject.getString(WarehseDo.COLUMNS.RECV_FLAG.name())); 
			warehseDo.setBondtype(dataObject.getString(WarehseDo.COLUMNS.BONDTYPE.name())); 
			warehseDo.setStatus(dataObject.getString(WarehseDo.COLUMNS.STATUS.name())); 
			warehseDo.setActivedate(CommUtils.objConver2Time(dataObject.getString(WarehseDo.COLUMNS.ACTIVEDATE.name()))); 
			warehseDo.setEnddate(CommUtils.objConver2Time(dataObject.getString(WarehseDo.COLUMNS.ENDDATE.name()))); 
			warehseDo.setChargedate(CommUtils.objConver2Time(dataObject.getString(WarehseDo.COLUMNS.CHARGEDATE.name()))); 
			warehseDo.setTel(dataObject.getString(WarehseDo.COLUMNS.TEL.name())); 
			warehseDo.setFax(dataObject.getString(WarehseDo.COLUMNS.FAX.name())); 
			warehseDo.setCofficer(dataObject.getString(WarehseDo.COLUMNS.COFFICER.name())); 
			warehseDo.setCustomFlag(dataObject.getString(WarehseDo.COLUMNS.CUSTOM_FLAG.name())); 
			warehseDo.setAutoconfirm(dataObject.getString(WarehseDo.COLUMNS.AUTOCONFIRM.name())); 
			return warehseDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final WarehseDo warehseDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WarehseDo.COLUMNS.POSTCODE.name(), warehseDo.getPostcode()); 
			dataObject.setValue(WarehseDo.COLUMNS.BONDNO.name(), warehseDo.getBondno()); 
			dataObject.setValue(WarehseDo.COLUMNS.BONDBAN.name(), warehseDo.getBondban()); 
			dataObject.setValue(WarehseDo.COLUMNS.BONDNAME.name(), warehseDo.getBondname()); 
			dataObject.setValue(WarehseDo.COLUMNS.SPECIALST.name(), warehseDo.getSpecialst()); 
			dataObject.setValue(WarehseDo.COLUMNS.BONDADD.name(), warehseDo.getBondadd()); 
			dataObject.setValue(WarehseDo.COLUMNS.BONDID.name(), warehseDo.getBondid()); 
			dataObject.setValue(WarehseDo.COLUMNS.BONDPW.name(), warehseDo.getBondpw()); 
			dataObject.setValue(WarehseDo.COLUMNS.AUTHORITY.name(), warehseDo.getAuthority()); 
			dataObject.setValue(WarehseDo.COLUMNS.RCVID.name(), warehseDo.getRcvid()); 
			dataObject.setValue(WarehseDo.COLUMNS.SEPID.name(), warehseDo.getSepid()); 
			dataObject.setValue(WarehseDo.COLUMNS.CUSTOMSOFFICE.name(), warehseDo.getCustomsoffice()); 
			dataObject.setValue(WarehseDo.COLUMNS.RECV_FLAG.name(), warehseDo.getRecvFlag()); 
			dataObject.setValue(WarehseDo.COLUMNS.BONDTYPE.name(), warehseDo.getBondtype()); 
			dataObject.setValue(WarehseDo.COLUMNS.STATUS.name(), warehseDo.getStatus()); 
			dataObject.setValue(WarehseDo.COLUMNS.ACTIVEDATE.name(), warehseDo.getActivedate()); 
			dataObject.setValue(WarehseDo.COLUMNS.ENDDATE.name(), warehseDo.getEnddate()); 
			dataObject.setValue(WarehseDo.COLUMNS.CHARGEDATE.name(), warehseDo.getChargedate()); 
			dataObject.setValue(WarehseDo.COLUMNS.TEL.name(), warehseDo.getTel()); 
			dataObject.setValue(WarehseDo.COLUMNS.FAX.name(), warehseDo.getFax()); 
			dataObject.setValue(WarehseDo.COLUMNS.COFFICER.name(), warehseDo.getCofficer()); 
			dataObject.setValue(WarehseDo.COLUMNS.CUSTOM_FLAG.name(), warehseDo.getCustomFlag()); 
			dataObject.setValue(WarehseDo.COLUMNS.AUTOCONFIRM.name(), warehseDo.getAutoconfirm()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<WarehseDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(WarehseDo po) { 
		sqlWhere.add(WarehseDo.COLUMNS.POSTCODE.name(), po.getPostcode()); 
		sqlWhere.add(WarehseDo.COLUMNS.BONDBAN.name(), po.getBondban()); 
		sqlWhere.add(WarehseDo.COLUMNS.BONDNAME.name(), po.getBondname()); 
		sqlWhere.add(WarehseDo.COLUMNS.SPECIALST.name(), po.getSpecialst()); 
		sqlWhere.add(WarehseDo.COLUMNS.BONDADD.name(), po.getBondadd()); 
		sqlWhere.add(WarehseDo.COLUMNS.BONDPW.name(), po.getBondpw()); 
		sqlWhere.add(WarehseDo.COLUMNS.AUTHORITY.name(), po.getAuthority()); 
		sqlWhere.add(WarehseDo.COLUMNS.RCVID.name(), po.getRcvid()); 
		sqlWhere.add(WarehseDo.COLUMNS.SEPID.name(), po.getSepid()); 
		sqlWhere.add(WarehseDo.COLUMNS.CUSTOMSOFFICE.name(), po.getCustomsoffice()); 
		sqlWhere.add(WarehseDo.COLUMNS.RECV_FLAG.name(), po.getRecvFlag()); 
		sqlWhere.add(WarehseDo.COLUMNS.BONDTYPE.name(), po.getBondtype()); 
		sqlWhere.add(WarehseDo.COLUMNS.STATUS.name(), po.getStatus()); 
		sqlWhere.add(WarehseDo.COLUMNS.ACTIVEDATE.name(), po.getActivedate()); 
		sqlWhere.add(WarehseDo.COLUMNS.ENDDATE.name(), po.getEnddate()); 
		sqlWhere.add(WarehseDo.COLUMNS.CHARGEDATE.name(), po.getChargedate()); 
		sqlWhere.add(WarehseDo.COLUMNS.TEL.name(), po.getTel()); 
		sqlWhere.add(WarehseDo.COLUMNS.FAX.name(), po.getFax()); 
		sqlWhere.add(WarehseDo.COLUMNS.COFFICER.name(), po.getCofficer()); 
		sqlWhere.add(WarehseDo.COLUMNS.CUSTOM_FLAG.name(), po.getCustomFlag()); 
		sqlWhere.add(WarehseDo.COLUMNS.AUTOCONFIRM.name(), po.getAutoconfirm()); 
	} 
 
} 
