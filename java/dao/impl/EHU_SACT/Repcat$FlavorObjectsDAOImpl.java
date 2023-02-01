package com.doc.common.dao.impl; 
 
public class Repcat$FlavorObjectsDAOImpl extends GeneralDAOImpl<Repcat$FlavorObjectsPo> implements IRepcat$FlavorObjectsDAO { 
	public static final Repcat$FlavorObjectsDAOImpl INSTANCE = new Repcat$FlavorObjectsDAOImpl(); 
	public static final String TABLENAME = "REPCAT$_FLAVOR_OBJECTS"; 

	public Repcat$FlavorObjectsDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Repcat$FlavorObjectsPo> CONVERTER = new MapConverter<Repcat$FlavorObjectsPo>() { 
 
		@Override 
		public Repcat$FlavorObjectsPo convert(final DataObject dataObject) { 
			final Repcat$FlavorObjectsPo repcat$FlavorObjectsPo = new Repcat$FlavorObjectsPo(); 
			repcat$FlavorObjectsPo.setFlavorId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$FlavorObjectsPo.COLUMNS.FLAVOR_ID.name()))); 
			repcat$FlavorObjectsPo.setFlavorId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$FlavorObjectsPo.COLUMNS.FLAVOR_ID.name()))); 
			repcat$FlavorObjectsPo.setGowner(dataObject.getString(Repcat$FlavorObjectsPo.COLUMNS.GOWNER.name())); 
			repcat$FlavorObjectsPo.setGowner(dataObject.getString(Repcat$FlavorObjectsPo.COLUMNS.GOWNER.name())); 
			repcat$FlavorObjectsPo.setGowner(dataObject.getString(Repcat$FlavorObjectsPo.COLUMNS.GOWNER.name())); 
			repcat$FlavorObjectsPo.setGname(dataObject.getString(Repcat$FlavorObjectsPo.COLUMNS.GNAME.name())); 
			repcat$FlavorObjectsPo.setGname(dataObject.getString(Repcat$FlavorObjectsPo.COLUMNS.GNAME.name())); 
			repcat$FlavorObjectsPo.setSname(dataObject.getString(Repcat$FlavorObjectsPo.COLUMNS.SNAME.name())); 
			repcat$FlavorObjectsPo.setOname(dataObject.getString(Repcat$FlavorObjectsPo.COLUMNS.ONAME.name())); 
			repcat$FlavorObjectsPo.setType(BigDecimalUtils.formObj(dataObject.getValue(Repcat$FlavorObjectsPo.COLUMNS.TYPE.name()))); 
			repcat$FlavorObjectsPo.setVersion#(BigDecimalUtils.formObj(dataObject.getValue(Repcat$FlavorObjectsPo.COLUMNS.VERSION#.name()))); 
			repcat$FlavorObjectsPo.setHashcode(); 
			repcat$FlavorObjectsPo.setColumnsPresent(); 
			return repcat$FlavorObjectsPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Repcat$FlavorObjectsPo repcat$FlavorObjectsPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Repcat$FlavorObjectsPo.COLUMNS.FLAVOR_ID.name(), repcat$FlavorObjectsPo.getFlavorId()); 
			dataObject.setValue(Repcat$FlavorObjectsPo.COLUMNS.FLAVOR_ID.name(), repcat$FlavorObjectsPo.getFlavorId()); 
			dataObject.setValue(Repcat$FlavorObjectsPo.COLUMNS.GOWNER.name(), repcat$FlavorObjectsPo.getGowner()); 
			dataObject.setValue(Repcat$FlavorObjectsPo.COLUMNS.GOWNER.name(), repcat$FlavorObjectsPo.getGowner()); 
			dataObject.setValue(Repcat$FlavorObjectsPo.COLUMNS.GOWNER.name(), repcat$FlavorObjectsPo.getGowner()); 
			dataObject.setValue(Repcat$FlavorObjectsPo.COLUMNS.GNAME.name(), repcat$FlavorObjectsPo.getGname()); 
			dataObject.setValue(Repcat$FlavorObjectsPo.COLUMNS.GNAME.name(), repcat$FlavorObjectsPo.getGname()); 
			dataObject.setValue(Repcat$FlavorObjectsPo.COLUMNS.SNAME.name(), repcat$FlavorObjectsPo.getSname()); 
			dataObject.setValue(Repcat$FlavorObjectsPo.COLUMNS.ONAME.name(), repcat$FlavorObjectsPo.getOname()); 
			dataObject.setValue(Repcat$FlavorObjectsPo.COLUMNS.TYPE.name(), repcat$FlavorObjectsPo.getType()); 
			dataObject.setValue(Repcat$FlavorObjectsPo.COLUMNS.VERSION#.name(), repcat$FlavorObjectsPo.getVersion#()); 
			dataObject.setValue(Repcat$FlavorObjectsPo.COLUMNS.HASHCODE.name(), repcat$FlavorObjectsPo.getHashcode()); 
			dataObject.setValue(Repcat$FlavorObjectsPo.COLUMNS.COLUMNS_PRESENT.name(), repcat$FlavorObjectsPo.getColumnsPresent()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Repcat$FlavorObjectsPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Repcat$FlavorObjectsPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Repcat$FlavorObjectsPo.COLUMNS.FLAVOR_ID.name(), po.getFlavorId()); 
		sqlWhere.add(Repcat$FlavorObjectsPo.COLUMNS.FLAVOR_ID.name(), po.getFlavorId()); 
		sqlWhere.add(Repcat$FlavorObjectsPo.COLUMNS.GOWNER.name(), po.getGowner()); 
		sqlWhere.add(Repcat$FlavorObjectsPo.COLUMNS.GOWNER.name(), po.getGowner()); 
		sqlWhere.add(Repcat$FlavorObjectsPo.COLUMNS.GOWNER.name(), po.getGowner()); 
		sqlWhere.add(Repcat$FlavorObjectsPo.COLUMNS.GNAME.name(), po.getGname()); 
		sqlWhere.add(Repcat$FlavorObjectsPo.COLUMNS.GNAME.name(), po.getGname()); 
		sqlWhere.add(Repcat$FlavorObjectsPo.COLUMNS.SNAME.name(), po.getSname()); 
		sqlWhere.add(Repcat$FlavorObjectsPo.COLUMNS.ONAME.name(), po.getOname()); 
		sqlWhere.add(Repcat$FlavorObjectsPo.COLUMNS.TYPE.name(), po.getType()); 
		return sqlWhere; 
	} 
 
} 
