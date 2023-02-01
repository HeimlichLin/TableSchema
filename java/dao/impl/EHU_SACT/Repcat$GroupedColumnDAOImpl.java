package com.doc.common.dao.impl; 
 
public class Repcat$GroupedColumnDAOImpl extends GeneralDAOImpl<Repcat$GroupedColumnPo> implements IRepcat$GroupedColumnDAO { 
	public static final Repcat$GroupedColumnDAOImpl INSTANCE = new Repcat$GroupedColumnDAOImpl(); 
	public static final String TABLENAME = "REPCAT$_GROUPED_COLUMN"; 

	public Repcat$GroupedColumnDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Repcat$GroupedColumnPo> CONVERTER = new MapConverter<Repcat$GroupedColumnPo>() { 
 
		@Override 
		public Repcat$GroupedColumnPo convert(final DataObject dataObject) { 
			final Repcat$GroupedColumnPo repcat$GroupedColumnPo = new Repcat$GroupedColumnPo(); 
			repcat$GroupedColumnPo.setSname(dataObject.getString(Repcat$GroupedColumnPo.COLUMNS.SNAME.name())); 
			repcat$GroupedColumnPo.setOname(dataObject.getString(Repcat$GroupedColumnPo.COLUMNS.ONAME.name())); 
			repcat$GroupedColumnPo.setGroupName(dataObject.getString(Repcat$GroupedColumnPo.COLUMNS.GROUP_NAME.name())); 
			repcat$GroupedColumnPo.setColumnName(dataObject.getString(Repcat$GroupedColumnPo.COLUMNS.COLUMN_NAME.name())); 
			repcat$GroupedColumnPo.setPos(BigDecimalUtils.formObj(dataObject.getValue(Repcat$GroupedColumnPo.COLUMNS.POS.name()))); 
			return repcat$GroupedColumnPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Repcat$GroupedColumnPo repcat$GroupedColumnPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Repcat$GroupedColumnPo.COLUMNS.SNAME.name(), repcat$GroupedColumnPo.getSname()); 
			dataObject.setValue(Repcat$GroupedColumnPo.COLUMNS.ONAME.name(), repcat$GroupedColumnPo.getOname()); 
			dataObject.setValue(Repcat$GroupedColumnPo.COLUMNS.GROUP_NAME.name(), repcat$GroupedColumnPo.getGroupName()); 
			dataObject.setValue(Repcat$GroupedColumnPo.COLUMNS.COLUMN_NAME.name(), repcat$GroupedColumnPo.getColumnName()); 
			dataObject.setValue(Repcat$GroupedColumnPo.COLUMNS.POS.name(), repcat$GroupedColumnPo.getPos()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Repcat$GroupedColumnPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Repcat$GroupedColumnPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Repcat$GroupedColumnPo.COLUMNS.SNAME.name(), po.getSname()); 
		sqlWhere.add(Repcat$GroupedColumnPo.COLUMNS.ONAME.name(), po.getOname()); 
		sqlWhere.add(Repcat$GroupedColumnPo.COLUMNS.GROUP_NAME.name(), po.getGroupName()); 
		sqlWhere.add(Repcat$GroupedColumnPo.COLUMNS.COLUMN_NAME.name(), po.getColumnName()); 
		sqlWhere.add(Repcat$GroupedColumnPo.COLUMNS.POS.name(), po.getPos()); 
		return sqlWhere; 
	} 
 
} 
