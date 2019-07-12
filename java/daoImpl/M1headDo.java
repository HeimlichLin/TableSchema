package com.doc.common.dao.impl; 
 
public class M1headDAO extends GeneralDAOImpl<M1headDo> implements M1headDAO { 
	public static final M1headDAOImpl INSTANCE = new M1headDAOImpl(); 
	public static final String TABLENAME = "M1HEAD"; 

	public M1headDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<M1headDo> CONVERTER = new MapConverter<M1headDo>() { 
 
		@Override 
		public M1headDo convert(final DataObject dataObject) { 
			final M1headDo m1headDo = new M1headDo(); 
			m1headDo.setMsgtype(dataObject.getString(M1headDo.COLUMNS.MSGTYPE.name())); 
			m1headDo.setBondno(dataObject.getString(M1headDo.COLUMNS.BONDNO.name())); 
			m1headDo.setStrtype(dataObject.getString(M1headDo.COLUMNS.STRTYPE.name())); 
			m1headDo.setMonthno(dataObject.getString(M1headDo.COLUMNS.MONTHNO.name())); 
			m1headDo.setMonthdate(dataObject.getString(M1headDo.COLUMNS.MONTHDATE.name())); 
			m1headDo.setCtmcode(dataObject.getString(M1headDo.COLUMNS.CTMCODE.name())); 
			m1headDo.setNewdeclno(dataObject.getString(M1headDo.COLUMNS.NEWDECLNO.name())); 
			m1headDo.setNewdecltype(dataObject.getString(M1headDo.COLUMNS.NEWDECLTYPE.name())); 
			m1headDo.setOrdertype(dataObject.getString(M1headDo.COLUMNS.ORDERTYPE.name())); 
			m1headDo.setProctime(dataObject.getString(M1headDo.COLUMNS.PROCTIME.name())); 
			m1headDo.setProcstatus(BigDecimalUtils.formObj(dataObject.getString(M1headDo.COLUMNS.PROCSTATUS.name()))); 
			m1headDo.setProcrmk(dataObject.getString(M1headDo.COLUMNS.PROCRMK.name())); 
			m1headDo.setProcuser(dataObject.getString(M1headDo.COLUMNS.PROCUSER.name())); 
			m1headDo.setControlno(dataObject.getString(M1headDo.COLUMNS.CONTROLNO.name())); 
			return m1headDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final M1headDo m1headDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(M1headDo.COLUMNS.MSGTYPE.name(), m1headDo.getMsgtype()); 
			dataObject.setValue(M1headDo.COLUMNS.BONDNO.name(), m1headDo.getBondno()); 
			dataObject.setValue(M1headDo.COLUMNS.STRTYPE.name(), m1headDo.getStrtype()); 
			dataObject.setValue(M1headDo.COLUMNS.MONTHNO.name(), m1headDo.getMonthno()); 
			dataObject.setValue(M1headDo.COLUMNS.MONTHDATE.name(), m1headDo.getMonthdate()); 
			dataObject.setValue(M1headDo.COLUMNS.CTMCODE.name(), m1headDo.getCtmcode()); 
			dataObject.setValue(M1headDo.COLUMNS.NEWDECLNO.name(), m1headDo.getNewdeclno()); 
			dataObject.setValue(M1headDo.COLUMNS.NEWDECLTYPE.name(), m1headDo.getNewdecltype()); 
			dataObject.setValue(M1headDo.COLUMNS.ORDERTYPE.name(), m1headDo.getOrdertype()); 
			dataObject.setValue(M1headDo.COLUMNS.PROCTIME.name(), m1headDo.getProctime()); 
			dataObject.setValue(M1headDo.COLUMNS.PROCSTATUS.name(), m1headDo.getProcstatus()); 
			dataObject.setValue(M1headDo.COLUMNS.PROCRMK.name(), m1headDo.getProcrmk()); 
			dataObject.setValue(M1headDo.COLUMNS.PROCUSER.name(), m1headDo.getProcuser()); 
			dataObject.setValue(M1headDo.COLUMNS.CONTROLNO.name(), m1headDo.getControlno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<M1headDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(M1headDo po) { 
		sqlWhere.add(M1headDo.COLUMNS.MONTHDATE.name(), po.getMonthdate()); 
		sqlWhere.add(M1headDo.COLUMNS.CTMCODE.name(), po.getCtmcode()); 
		sqlWhere.add(M1headDo.COLUMNS.NEWDECLNO.name(), po.getNewdeclno()); 
		sqlWhere.add(M1headDo.COLUMNS.NEWDECLTYPE.name(), po.getNewdecltype()); 
		sqlWhere.add(M1headDo.COLUMNS.ORDERTYPE.name(), po.getOrdertype()); 
		sqlWhere.add(M1headDo.COLUMNS.PROCSTATUS.name(), po.getProcstatus()); 
		sqlWhere.add(M1headDo.COLUMNS.PROCRMK.name(), po.getProcrmk()); 
		sqlWhere.add(M1headDo.COLUMNS.PROCUSER.name(), po.getProcuser()); 
		sqlWhere.add(M1headDo.COLUMNS.CONTROLNO.name(), po.getControlno()); 
	} 
 
} 
