package com.doc.common.dao.impl; 
 
public class Repcat$RepcatlogDAOImpl extends GeneralDAOImpl<Repcat$RepcatlogPo> implements IRepcat$RepcatlogDAO { 
	public static final Repcat$RepcatlogDAOImpl INSTANCE = new Repcat$RepcatlogDAOImpl(); 
	public static final String TABLENAME = "REPCAT$_REPCATLOG"; 

	public Repcat$RepcatlogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Repcat$RepcatlogPo> CONVERTER = new MapConverter<Repcat$RepcatlogPo>() { 
 
		@Override 
		public Repcat$RepcatlogPo convert(final DataObject dataObject) { 
			final Repcat$RepcatlogPo repcat$RepcatlogPo = new Repcat$RepcatlogPo(); 
			repcat$RepcatlogPo.setVersion(BigDecimalUtils.formObj(dataObject.getValue(Repcat$RepcatlogPo.COLUMNS.VERSION.name()))); 
			repcat$RepcatlogPo.setId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$RepcatlogPo.COLUMNS.ID.name()))); 
			repcat$RepcatlogPo.setSource(dataObject.getString(Repcat$RepcatlogPo.COLUMNS.SOURCE.name())); 
			repcat$RepcatlogPo.setUserid(dataObject.getString(Repcat$RepcatlogPo.COLUMNS.USERID.name())); 
			repcat$RepcatlogPo.setTimestamp(TimestampUtils.of(dataObject.getValue(Repcat$RepcatlogPo.COLUMNS.TIMESTAMP.name()))); 
			repcat$RepcatlogPo.setRole(dataObject.getString(Repcat$RepcatlogPo.COLUMNS.ROLE.name())); 
			repcat$RepcatlogPo.setMaster(dataObject.getString(Repcat$RepcatlogPo.COLUMNS.MASTER.name())); 
			repcat$RepcatlogPo.setSname(dataObject.getString(Repcat$RepcatlogPo.COLUMNS.SNAME.name())); 
			repcat$RepcatlogPo.setRequest(BigDecimalUtils.formObj(dataObject.getValue(Repcat$RepcatlogPo.COLUMNS.REQUEST.name()))); 
			repcat$RepcatlogPo.setOname(dataObject.getString(Repcat$RepcatlogPo.COLUMNS.ONAME.name())); 
			repcat$RepcatlogPo.setType(BigDecimalUtils.formObj(dataObject.getValue(Repcat$RepcatlogPo.COLUMNS.TYPE.name()))); 
			repcat$RepcatlogPo.setAComment(dataObject.getString(Repcat$RepcatlogPo.COLUMNS.A_COMMENT.name())); 
			repcat$RepcatlogPo.setBoolArg(dataObject.getString(Repcat$RepcatlogPo.COLUMNS.BOOL_ARG.name())); 
			repcat$RepcatlogPo.setAnoBoolArg(dataObject.getString(Repcat$RepcatlogPo.COLUMNS.ANO_BOOL_ARG.name())); 
			repcat$RepcatlogPo.setIntArg(BigDecimalUtils.formObj(dataObject.getValue(Repcat$RepcatlogPo.COLUMNS.INT_ARG.name()))); 
			repcat$RepcatlogPo.setAnoIntArg(BigDecimalUtils.formObj(dataObject.getValue(Repcat$RepcatlogPo.COLUMNS.ANO_INT_ARG.name()))); 
			repcat$RepcatlogPo.setLines(BigDecimalUtils.formObj(dataObject.getValue(Repcat$RepcatlogPo.COLUMNS.LINES.name()))); 
			repcat$RepcatlogPo.setStatus(BigDecimalUtils.formObj(dataObject.getValue(Repcat$RepcatlogPo.COLUMNS.STATUS.name()))); 
			repcat$RepcatlogPo.setMessage(dataObject.getString(Repcat$RepcatlogPo.COLUMNS.MESSAGE.name())); 
			repcat$RepcatlogPo.setErrnum(BigDecimalUtils.formObj(dataObject.getValue(Repcat$RepcatlogPo.COLUMNS.ERRNUM.name()))); 
			repcat$RepcatlogPo.setGname(dataObject.getString(Repcat$RepcatlogPo.COLUMNS.GNAME.name())); 
			return repcat$RepcatlogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Repcat$RepcatlogPo repcat$RepcatlogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Repcat$RepcatlogPo.COLUMNS.VERSION.name(), repcat$RepcatlogPo.getVersion()); 
			dataObject.setValue(Repcat$RepcatlogPo.COLUMNS.ID.name(), repcat$RepcatlogPo.getId()); 
			dataObject.setValue(Repcat$RepcatlogPo.COLUMNS.SOURCE.name(), repcat$RepcatlogPo.getSource()); 
			dataObject.setValue(Repcat$RepcatlogPo.COLUMNS.USERID.name(), repcat$RepcatlogPo.getUserid()); 
			dataObject.setValue(Repcat$RepcatlogPo.COLUMNS.TIMESTAMP.name(), repcat$RepcatlogPo.getTimestamp()); 
			dataObject.setValue(Repcat$RepcatlogPo.COLUMNS.ROLE.name(), repcat$RepcatlogPo.getRole()); 
			dataObject.setValue(Repcat$RepcatlogPo.COLUMNS.MASTER.name(), repcat$RepcatlogPo.getMaster()); 
			dataObject.setValue(Repcat$RepcatlogPo.COLUMNS.SNAME.name(), repcat$RepcatlogPo.getSname()); 
			dataObject.setValue(Repcat$RepcatlogPo.COLUMNS.REQUEST.name(), repcat$RepcatlogPo.getRequest()); 
			dataObject.setValue(Repcat$RepcatlogPo.COLUMNS.ONAME.name(), repcat$RepcatlogPo.getOname()); 
			dataObject.setValue(Repcat$RepcatlogPo.COLUMNS.TYPE.name(), repcat$RepcatlogPo.getType()); 
			dataObject.setValue(Repcat$RepcatlogPo.COLUMNS.A_COMMENT.name(), repcat$RepcatlogPo.getAComment()); 
			dataObject.setValue(Repcat$RepcatlogPo.COLUMNS.BOOL_ARG.name(), repcat$RepcatlogPo.getBoolArg()); 
			dataObject.setValue(Repcat$RepcatlogPo.COLUMNS.ANO_BOOL_ARG.name(), repcat$RepcatlogPo.getAnoBoolArg()); 
			dataObject.setValue(Repcat$RepcatlogPo.COLUMNS.INT_ARG.name(), repcat$RepcatlogPo.getIntArg()); 
			dataObject.setValue(Repcat$RepcatlogPo.COLUMNS.ANO_INT_ARG.name(), repcat$RepcatlogPo.getAnoIntArg()); 
			dataObject.setValue(Repcat$RepcatlogPo.COLUMNS.LINES.name(), repcat$RepcatlogPo.getLines()); 
			dataObject.setValue(Repcat$RepcatlogPo.COLUMNS.STATUS.name(), repcat$RepcatlogPo.getStatus()); 
			dataObject.setValue(Repcat$RepcatlogPo.COLUMNS.MESSAGE.name(), repcat$RepcatlogPo.getMessage()); 
			dataObject.setValue(Repcat$RepcatlogPo.COLUMNS.ERRNUM.name(), repcat$RepcatlogPo.getErrnum()); 
			dataObject.setValue(Repcat$RepcatlogPo.COLUMNS.GNAME.name(), repcat$RepcatlogPo.getGname()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Repcat$RepcatlogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Repcat$RepcatlogPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Repcat$RepcatlogPo.COLUMNS.ID.name(), po.getId()); 
		sqlWhere.add(Repcat$RepcatlogPo.COLUMNS.SOURCE.name(), po.getSource()); 
		sqlWhere.add(Repcat$RepcatlogPo.COLUMNS.ROLE.name(), po.getRole()); 
		sqlWhere.add(Repcat$RepcatlogPo.COLUMNS.MASTER.name(), po.getMaster()); 
		return sqlWhere; 
	} 
 
} 
