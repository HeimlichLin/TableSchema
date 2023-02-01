package com.doc.common.dao.impl; 
 
public class M1headDAOImpl extends GeneralDAOImpl<M1headPo> implements M1headDAO { 
	public static final M1headDAOImpl INSTANCE = new M1headDAOImpl(); 
	public static final String TABLENAME = "M1HEAD"; 

	public M1headDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<M1headPo> CONVERTER = new MapConverter<M1headPo>() { 
 
		@Override 
		public M1headPo convert(final DataObject dataObject) { 
			final M1headPo m1headPo = new M1headPo(); 
			m1headPo.setMsgtype(dataObject.getString(M1headPo.COLUMNS.MSGTYPE.name())); 
			m1headPo.setBondno(dataObject.getString(M1headPo.COLUMNS.BONDNO.name())); 
			m1headPo.setStrtype(dataObject.getString(M1headPo.COLUMNS.STRTYPE.name())); 
			m1headPo.setMonthno(dataObject.getString(M1headPo.COLUMNS.MONTHNO.name())); 
			m1headPo.setMonthdate(dataObject.getString(M1headPo.COLUMNS.MONTHDATE.name())); 
			m1headPo.setCtmcode(dataObject.getString(M1headPo.COLUMNS.CTMCODE.name())); 
			m1headPo.setNewdeclno(dataObject.getString(M1headPo.COLUMNS.NEWDECLNO.name())); 
			m1headPo.setNewdecltype(dataObject.getString(M1headPo.COLUMNS.NEWDECLTYPE.name())); 
			m1headPo.setOrdertype(dataObject.getString(M1headPo.COLUMNS.ORDERTYPE.name())); 
			m1headPo.setProctime(dataObject.getString(M1headPo.COLUMNS.PROCTIME.name())); 
			m1headPo.setProcstatus(BigDecimalUtils.formObj(dataObject.getValue(M1headPo.COLUMNS.PROCSTATUS.name()))); 
			m1headPo.setProcrmk(dataObject.getString(M1headPo.COLUMNS.PROCRMK.name())); 
			m1headPo.setProcuser(dataObject.getString(M1headPo.COLUMNS.PROCUSER.name())); 
			m1headPo.setControlno(dataObject.getString(M1headPo.COLUMNS.CONTROLNO.name())); 
			return m1headPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final M1headPo m1headPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(M1headPo.COLUMNS.MSGTYPE.name(), m1headPo.getMsgtype()); 
			dataObject.setValue(M1headPo.COLUMNS.BONDNO.name(), m1headPo.getBondno()); 
			dataObject.setValue(M1headPo.COLUMNS.STRTYPE.name(), m1headPo.getStrtype()); 
			dataObject.setValue(M1headPo.COLUMNS.MONTHNO.name(), m1headPo.getMonthno()); 
			dataObject.setValue(M1headPo.COLUMNS.MONTHDATE.name(), m1headPo.getMonthdate()); 
			dataObject.setValue(M1headPo.COLUMNS.CTMCODE.name(), m1headPo.getCtmcode()); 
			dataObject.setValue(M1headPo.COLUMNS.NEWDECLNO.name(), m1headPo.getNewdeclno()); 
			dataObject.setValue(M1headPo.COLUMNS.NEWDECLTYPE.name(), m1headPo.getNewdecltype()); 
			dataObject.setValue(M1headPo.COLUMNS.ORDERTYPE.name(), m1headPo.getOrdertype()); 
			dataObject.setValue(M1headPo.COLUMNS.PROCTIME.name(), m1headPo.getProctime()); 
			dataObject.setValue(M1headPo.COLUMNS.PROCSTATUS.name(), m1headPo.getProcstatus()); 
			dataObject.setValue(M1headPo.COLUMNS.PROCRMK.name(), m1headPo.getProcrmk()); 
			dataObject.setValue(M1headPo.COLUMNS.PROCUSER.name(), m1headPo.getProcuser()); 
			dataObject.setValue(M1headPo.COLUMNS.CONTROLNO.name(), m1headPo.getControlno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<M1headPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(M1headPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(M1headPo.COLUMNS.MSGTYPE.name(), po.getMsgtype()); 
		sqlWhere.add(M1headPo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(M1headPo.COLUMNS.STRTYPE.name(), po.getStrtype()); 
		sqlWhere.add(M1headPo.COLUMNS.MONTHNO.name(), po.getMonthno()); 
		sqlWhere.add(M1headPo.COLUMNS.PROCTIME.name(), po.getProctime()); 
		return sqlWhere; 
	} 
 
} 
