package com.doc.common.dao.impl; 
 
public class M1detailDAOImpl extends GeneralDAOImpl<M1detailDo> implements M1detailDAOImpl { 
	public static final M1detailDAOImpl INSTANCE = new M1detailDAOImpl(); 
	public static final String TABLENAME = "M1DETAIL"; 

	public M1detailDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<M1detailDo> CONVERTER = new MapConverter<M1detailDo>() { 
 
		@Override 
		public M1detailDo convert(final DataObject dataObject) { 
			final M1detailDo m1detailDo = new M1detailDo(); 
			m1detailDo.setMonthno(dataObject.getString(M1detailDo.COLUMNS.MONTHNO.name())); 
			m1detailDo.setRefbillno(dataObject.getString(M1detailDo.COLUMNS.REFBILLNO.name())); 
			m1detailDo.setItem(BigDecimalUtils.formObj(dataObject.getString(M1detailDo.COLUMNS.ITEM.name()))); 
			m1detailDo.setStrpost(dataObject.getString(M1detailDo.COLUMNS.STRPOST.name())); 
			m1detailDo.setPrdtno(dataObject.getString(M1detailDo.COLUMNS.PRDTNO.name())); 
			m1detailDo.setDeclno(dataObject.getString(M1detailDo.COLUMNS.DECLNO.name())); 
			m1detailDo.setItemno(BigDecimalUtils.formObj(dataObject.getString(M1detailDo.COLUMNS.ITEMNO.name()))); 
			m1detailDo.setStrdate(dataObject.getString(M1detailDo.COLUMNS.STRDATE.name())); 
			m1detailDo.setProctime(dataObject.getString(M1detailDo.COLUMNS.PROCTIME.name())); 
			m1detailDo.setProcstatus(BigDecimalUtils.formObj(dataObject.getString(M1detailDo.COLUMNS.PROCSTATUS.name()))); 
			m1detailDo.setProcrmk(dataObject.getString(M1detailDo.COLUMNS.PROCRMK.name())); 
			m1detailDo.setProcuser(dataObject.getString(M1detailDo.COLUMNS.PROCUSER.name())); 
			m1detailDo.setBondno(dataObject.getString(M1detailDo.COLUMNS.BONDNO.name())); 
			m1detailDo.setStrtype(dataObject.getString(M1detailDo.COLUMNS.STRTYPE.name())); 
			m1detailDo.setMsgtype(dataObject.getString(M1detailDo.COLUMNS.MSGTYPE.name())); 
			m1detailDo.setControlno(dataObject.getString(M1detailDo.COLUMNS.CONTROLNO.name())); 
			return m1detailDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final M1detailDo m1detailDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(M1detailDo.COLUMNS.MONTHNO.name(), m1detailDo.getMonthno()); 
			dataObject.setValue(M1detailDo.COLUMNS.REFBILLNO.name(), m1detailDo.getRefbillno()); 
			dataObject.setValue(M1detailDo.COLUMNS.ITEM.name(), m1detailDo.getItem()); 
			dataObject.setValue(M1detailDo.COLUMNS.STRPOST.name(), m1detailDo.getStrpost()); 
			dataObject.setValue(M1detailDo.COLUMNS.PRDTNO.name(), m1detailDo.getPrdtno()); 
			dataObject.setValue(M1detailDo.COLUMNS.DECLNO.name(), m1detailDo.getDeclno()); 
			dataObject.setValue(M1detailDo.COLUMNS.ITEMNO.name(), m1detailDo.getItemno()); 
			dataObject.setValue(M1detailDo.COLUMNS.STRDATE.name(), m1detailDo.getStrdate()); 
			dataObject.setValue(M1detailDo.COLUMNS.PROCTIME.name(), m1detailDo.getProctime()); 
			dataObject.setValue(M1detailDo.COLUMNS.PROCSTATUS.name(), m1detailDo.getProcstatus()); 
			dataObject.setValue(M1detailDo.COLUMNS.PROCRMK.name(), m1detailDo.getProcrmk()); 
			dataObject.setValue(M1detailDo.COLUMNS.PROCUSER.name(), m1detailDo.getProcuser()); 
			dataObject.setValue(M1detailDo.COLUMNS.BONDNO.name(), m1detailDo.getBondno()); 
			dataObject.setValue(M1detailDo.COLUMNS.STRTYPE.name(), m1detailDo.getStrtype()); 
			dataObject.setValue(M1detailDo.COLUMNS.MSGTYPE.name(), m1detailDo.getMsgtype()); 
			dataObject.setValue(M1detailDo.COLUMNS.CONTROLNO.name(), m1detailDo.getControlno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<M1detailDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(M1detailDo po) { 
		sqlWhere.add(M1detailDo.COLUMNS.MONTHNO.name(), po.getMonthno()); 
		sqlWhere.add(M1detailDo.COLUMNS.PROCTIME.name(), po.getProctime()); 
		sqlWhere.add(M1detailDo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(M1detailDo.COLUMNS.STRTYPE.name(), po.getStrtype()); 
		sqlWhere.add(M1detailDo.COLUMNS.MSGTYPE.name(), po.getMsgtype()); 
	} 
 
} 
