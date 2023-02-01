package com.doc.common.dao.impl; 
 
public class DeclmailboxDAOImpl extends GeneralDAOImpl<DeclmailboxPo> implements DeclmailboxDAO { 
	public static final DeclmailboxDAOImpl INSTANCE = new DeclmailboxDAOImpl(); 
	public static final String TABLENAME = "DECLMAILBOX"; 

	public DeclmailboxDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DeclmailboxPo> CONVERTER = new MapConverter<DeclmailboxPo>() { 
 
		@Override 
		public DeclmailboxPo convert(final DataObject dataObject) { 
			final DeclmailboxPo declmailboxPo = new DeclmailboxPo(); 
			declmailboxPo.setBfNo(dataObject.getString(DeclmailboxPo.COLUMNS.BF_NO.name())); 
			declmailboxPo.setDeclNo(dataObject.getString(DeclmailboxPo.COLUMNS.DECL_NO.name())); 
			declmailboxPo.setDeclDate(dataObject.getString(DeclmailboxPo.COLUMNS.DECL_DATE.name())); 
			declmailboxPo.setAsType(dataObject.getString(DeclmailboxPo.COLUMNS.AS_TYPE.name())); 
			declmailboxPo.setItemNo(BigDecimalUtils.formObj(dataObject.getValue(DeclmailboxPo.COLUMNS.ITEM_NO.name()))); 
			declmailboxPo.setMailboxNo(dataObject.getString(DeclmailboxPo.COLUMNS.MAILBOX_NO.name())); 
			declmailboxPo.setPrdtNo(dataObject.getString(DeclmailboxPo.COLUMNS.PRDT_NO.name())); 
			declmailboxPo.setDescrip(dataObject.getString(DeclmailboxPo.COLUMNS.DESCRIP.name())); 
			declmailboxPo.setQty(BigDecimalUtils.formObj(dataObject.getValue(DeclmailboxPo.COLUMNS.QTY.name()))); 
			declmailboxPo.setUnit(dataObject.getString(DeclmailboxPo.COLUMNS.UNIT.name())); 
			declmailboxPo.setRemark(dataObject.getString(DeclmailboxPo.COLUMNS.REMARK.name())); 
			declmailboxPo.setWGuid(dataObject.getString(DeclmailboxPo.COLUMNS.W_GUID.name())); 
			return declmailboxPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DeclmailboxPo declmailboxPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DeclmailboxPo.COLUMNS.BF_NO.name(), declmailboxPo.getBfNo()); 
			dataObject.setValue(DeclmailboxPo.COLUMNS.DECL_NO.name(), declmailboxPo.getDeclNo()); 
			dataObject.setValue(DeclmailboxPo.COLUMNS.DECL_DATE.name(), declmailboxPo.getDeclDate()); 
			dataObject.setValue(DeclmailboxPo.COLUMNS.AS_TYPE.name(), declmailboxPo.getAsType()); 
			dataObject.setValue(DeclmailboxPo.COLUMNS.ITEM_NO.name(), declmailboxPo.getItemNo()); 
			dataObject.setValue(DeclmailboxPo.COLUMNS.MAILBOX_NO.name(), declmailboxPo.getMailboxNo()); 
			dataObject.setValue(DeclmailboxPo.COLUMNS.PRDT_NO.name(), declmailboxPo.getPrdtNo()); 
			dataObject.setValue(DeclmailboxPo.COLUMNS.DESCRIP.name(), declmailboxPo.getDescrip()); 
			dataObject.setValue(DeclmailboxPo.COLUMNS.QTY.name(), declmailboxPo.getQty()); 
			dataObject.setValue(DeclmailboxPo.COLUMNS.UNIT.name(), declmailboxPo.getUnit()); 
			dataObject.setValue(DeclmailboxPo.COLUMNS.REMARK.name(), declmailboxPo.getRemark()); 
			dataObject.setValue(DeclmailboxPo.COLUMNS.W_GUID.name(), declmailboxPo.getWGuid()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DeclmailboxPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DeclmailboxPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(DeclmailboxPo.COLUMNS.BF_NO.name(), po.getBfNo()); 
		sqlWhere.add(DeclmailboxPo.COLUMNS.DECL_NO.name(), po.getDeclNo()); 
		sqlWhere.add(DeclmailboxPo.COLUMNS.ITEM_NO.name(), po.getItemNo()); 
		sqlWhere.add(DeclmailboxPo.COLUMNS.MAILBOX_NO.name(), po.getMailboxNo()); 
		return sqlWhere; 
	} 
 
} 
