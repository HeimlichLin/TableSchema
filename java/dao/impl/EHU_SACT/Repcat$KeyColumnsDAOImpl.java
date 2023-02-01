package com.doc.common.dao.impl; 
 
public class Repcat$KeyColumnsDAOImpl extends GeneralDAOImpl<Repcat$KeyColumnsPo> implements IRepcat$KeyColumnsDAO { 
	public static final Repcat$KeyColumnsDAOImpl INSTANCE = new Repcat$KeyColumnsDAOImpl(); 
	public static final String TABLENAME = "REPCAT$_KEY_COLUMNS"; 

	public Repcat$KeyColumnsDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Repcat$KeyColumnsPo> CONVERTER = new MapConverter<Repcat$KeyColumnsPo>() { 
 
		@Override 
		public Repcat$KeyColumnsPo convert(final DataObject dataObject) { 
			final Repcat$KeyColumnsPo repcat$KeyColumnsPo = new Repcat$KeyColumnsPo(); 
			repcat$KeyColumnsPo.setSname(dataObject.getString(Repcat$KeyColumnsPo.COLUMNS.SNAME.name())); 
			repcat$KeyColumnsPo.setOname(dataObject.getString(Repcat$KeyColumnsPo.COLUMNS.ONAME.name())); 
			repcat$KeyColumnsPo.setType(BigDecimalUtils.formObj(dataObject.getValue(Repcat$KeyColumnsPo.COLUMNS.TYPE.name()))); 
			repcat$KeyColumnsPo.setCol(dataObject.getString(Repcat$KeyColumnsPo.COLUMNS.COL.name())); 
			return repcat$KeyColumnsPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Repcat$KeyColumnsPo repcat$KeyColumnsPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Repcat$KeyColumnsPo.COLUMNS.SNAME.name(), repcat$KeyColumnsPo.getSname()); 
			dataObject.setValue(Repcat$KeyColumnsPo.COLUMNS.ONAME.name(), repcat$KeyColumnsPo.getOname()); 
			dataObject.setValue(Repcat$KeyColumnsPo.COLUMNS.TYPE.name(), repcat$KeyColumnsPo.getType()); 
			dataObject.setValue(Repcat$KeyColumnsPo.COLUMNS.COL.name(), repcat$KeyColumnsPo.getCol()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Repcat$KeyColumnsPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Repcat$KeyColumnsPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Repcat$KeyColumnsPo.COLUMNS.SNAME.name(), po.getSname()); 
		sqlWhere.add(Repcat$KeyColumnsPo.COLUMNS.ONAME.name(), po.getOname()); 
		sqlWhere.add(Repcat$KeyColumnsPo.COLUMNS.TYPE.name(), po.getType()); 
		sqlWhere.add(Repcat$KeyColumnsPo.COLUMNS.COL.name(), po.getCol()); 
		return sqlWhere; 
	} 
 
} 
