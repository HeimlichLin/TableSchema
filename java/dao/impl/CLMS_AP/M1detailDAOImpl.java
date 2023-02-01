package com.doc.common.dao.impl; 
 
public class M1detailDAOImpl extends GeneralDAOImpl<M1detailPo> implements M1detailDAO { 
	public static final M1detailDAOImpl INSTANCE = new M1detailDAOImpl(); 
	public static final String TABLENAME = "M1DETAIL"; 

	public M1detailDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<M1detailPo> CONVERTER = new MapConverter<M1detailPo>() { 
 
		@Override 
		public M1detailPo convert(final DataObject dataObject) { 
			final M1detailPo m1detailPo = new M1detailPo(); 
			m1detailPo.setMonthno(dataObject.getString(M1detailPo.COLUMNS.MONTHNO.name())); 
			m1detailPo.setRefbillno(dataObject.getString(M1detailPo.COLUMNS.REFBILLNO.name())); 
			m1detailPo.setItem(BigDecimalUtils.formObj(dataObject.getValue(M1detailPo.COLUMNS.ITEM.name()))); 
			m1detailPo.setStrpost(dataObject.getString(M1detailPo.COLUMNS.STRPOST.name())); 
			m1detailPo.setPrdtno(dataObject.getString(M1detailPo.COLUMNS.PRDTNO.name())); 
			m1detailPo.setDeclno(dataObject.getString(M1detailPo.COLUMNS.DECLNO.name())); 
			m1detailPo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(M1detailPo.COLUMNS.ITEMNO.name()))); 
			m1detailPo.setStrdate(dataObject.getString(M1detailPo.COLUMNS.STRDATE.name())); 
			m1detailPo.setProctime(dataObject.getString(M1detailPo.COLUMNS.PROCTIME.name())); 
			m1detailPo.setProcstatus(BigDecimalUtils.formObj(dataObject.getValue(M1detailPo.COLUMNS.PROCSTATUS.name()))); 
			m1detailPo.setProcrmk(dataObject.getString(M1detailPo.COLUMNS.PROCRMK.name())); 
			m1detailPo.setProcuser(dataObject.getString(M1detailPo.COLUMNS.PROCUSER.name())); 
			m1detailPo.setBondno(dataObject.getString(M1detailPo.COLUMNS.BONDNO.name())); 
			m1detailPo.setStrtype(dataObject.getString(M1detailPo.COLUMNS.STRTYPE.name())); 
			m1detailPo.setMsgtype(dataObject.getString(M1detailPo.COLUMNS.MSGTYPE.name())); 
			m1detailPo.setControlno(dataObject.getString(M1detailPo.COLUMNS.CONTROLNO.name())); 
			return m1detailPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final M1detailPo m1detailPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(M1detailPo.COLUMNS.MONTHNO.name(), m1detailPo.getMonthno()); 
			dataObject.setValue(M1detailPo.COLUMNS.REFBILLNO.name(), m1detailPo.getRefbillno()); 
			dataObject.setValue(M1detailPo.COLUMNS.ITEM.name(), m1detailPo.getItem()); 
			dataObject.setValue(M1detailPo.COLUMNS.STRPOST.name(), m1detailPo.getStrpost()); 
			dataObject.setValue(M1detailPo.COLUMNS.PRDTNO.name(), m1detailPo.getPrdtno()); 
			dataObject.setValue(M1detailPo.COLUMNS.DECLNO.name(), m1detailPo.getDeclno()); 
			dataObject.setValue(M1detailPo.COLUMNS.ITEMNO.name(), m1detailPo.getItemno()); 
			dataObject.setValue(M1detailPo.COLUMNS.STRDATE.name(), m1detailPo.getStrdate()); 
			dataObject.setValue(M1detailPo.COLUMNS.PROCTIME.name(), m1detailPo.getProctime()); 
			dataObject.setValue(M1detailPo.COLUMNS.PROCSTATUS.name(), m1detailPo.getProcstatus()); 
			dataObject.setValue(M1detailPo.COLUMNS.PROCRMK.name(), m1detailPo.getProcrmk()); 
			dataObject.setValue(M1detailPo.COLUMNS.PROCUSER.name(), m1detailPo.getProcuser()); 
			dataObject.setValue(M1detailPo.COLUMNS.BONDNO.name(), m1detailPo.getBondno()); 
			dataObject.setValue(M1detailPo.COLUMNS.STRTYPE.name(), m1detailPo.getStrtype()); 
			dataObject.setValue(M1detailPo.COLUMNS.MSGTYPE.name(), m1detailPo.getMsgtype()); 
			dataObject.setValue(M1detailPo.COLUMNS.CONTROLNO.name(), m1detailPo.getControlno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<M1detailPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(M1detailPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(M1detailPo.COLUMNS.MONTHNO.name(), po.getMonthno()); 
		sqlWhere.add(M1detailPo.COLUMNS.PROCTIME.name(), po.getProctime()); 
		sqlWhere.add(M1detailPo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(M1detailPo.COLUMNS.STRTYPE.name(), po.getStrtype()); 
		sqlWhere.add(M1detailPo.COLUMNS.MSGTYPE.name(), po.getMsgtype()); 
		return sqlWhere; 
	} 
 
} 
