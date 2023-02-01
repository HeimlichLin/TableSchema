package com.doc.common.dao.impl; 
 
public class Repcat$DdlDAOImpl extends GeneralDAOImpl<Repcat$DdlPo> implements IRepcat$DdlDAO { 
	public static final Repcat$DdlDAOImpl INSTANCE = new Repcat$DdlDAOImpl(); 
	public static final String TABLENAME = "REPCAT$_DDL"; 

	public Repcat$DdlDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Repcat$DdlPo> CONVERTER = new MapConverter<Repcat$DdlPo>() { 
 
		@Override 
		public Repcat$DdlPo convert(final DataObject dataObject) { 
			final Repcat$DdlPo repcat$DdlPo = new Repcat$DdlPo(); 
			repcat$DdlPo.setLogId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$DdlPo.COLUMNS.LOG_ID.name()))); 
			repcat$DdlPo.setSource(dataObject.getString(Repcat$DdlPo.COLUMNS.SOURCE.name())); 
			repcat$DdlPo.setRole(dataObject.getString(Repcat$DdlPo.COLUMNS.ROLE.name())); 
			repcat$DdlPo.setMaster(dataObject.getString(Repcat$DdlPo.COLUMNS.MASTER.name())); 
			repcat$DdlPo.setLine(BigDecimalUtils.formObj(dataObject.getValue(Repcat$DdlPo.COLUMNS.LINE.name()))); 
			repcat$DdlPo.setText(dataObject.getString(Repcat$DdlPo.COLUMNS.TEXT.name())); 
			repcat$DdlPo.setDdlNum(BigDecimalUtils.formObj(dataObject.getValue(Repcat$DdlPo.COLUMNS.DDL_NUM.name()))); 
			return repcat$DdlPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Repcat$DdlPo repcat$DdlPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Repcat$DdlPo.COLUMNS.LOG_ID.name(), repcat$DdlPo.getLogId()); 
			dataObject.setValue(Repcat$DdlPo.COLUMNS.SOURCE.name(), repcat$DdlPo.getSource()); 
			dataObject.setValue(Repcat$DdlPo.COLUMNS.ROLE.name(), repcat$DdlPo.getRole()); 
			dataObject.setValue(Repcat$DdlPo.COLUMNS.MASTER.name(), repcat$DdlPo.getMaster()); 
			dataObject.setValue(Repcat$DdlPo.COLUMNS.LINE.name(), repcat$DdlPo.getLine()); 
			dataObject.setValue(Repcat$DdlPo.COLUMNS.TEXT.name(), repcat$DdlPo.getText()); 
			dataObject.setValue(Repcat$DdlPo.COLUMNS.DDL_NUM.name(), repcat$DdlPo.getDdlNum()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Repcat$DdlPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Repcat$DdlPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Repcat$DdlPo.COLUMNS.LOG_ID.name(), po.getLogId()); 
		sqlWhere.add(Repcat$DdlPo.COLUMNS.SOURCE.name(), po.getSource()); 
		sqlWhere.add(Repcat$DdlPo.COLUMNS.ROLE.name(), po.getRole()); 
		sqlWhere.add(Repcat$DdlPo.COLUMNS.MASTER.name(), po.getMaster()); 
		return sqlWhere; 
	} 
 
} 
