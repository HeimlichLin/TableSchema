package com.doc.common.dao.impl; 
 
public class Repcat$FlavorsDAOImpl extends GeneralDAOImpl<Repcat$FlavorsPo> implements IRepcat$FlavorsDAO { 
	public static final Repcat$FlavorsDAOImpl INSTANCE = new Repcat$FlavorsDAOImpl(); 
	public static final String TABLENAME = "REPCAT$_FLAVORS"; 

	public Repcat$FlavorsDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Repcat$FlavorsPo> CONVERTER = new MapConverter<Repcat$FlavorsPo>() { 
 
		@Override 
		public Repcat$FlavorsPo convert(final DataObject dataObject) { 
			final Repcat$FlavorsPo repcat$FlavorsPo = new Repcat$FlavorsPo(); 
			repcat$FlavorsPo.setFlavorId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$FlavorsPo.COLUMNS.FLAVOR_ID.name()))); 
			repcat$FlavorsPo.setGowner(dataObject.getString(Repcat$FlavorsPo.COLUMNS.GOWNER.name())); 
			repcat$FlavorsPo.setGowner(dataObject.getString(Repcat$FlavorsPo.COLUMNS.GOWNER.name())); 
			repcat$FlavorsPo.setGname(dataObject.getString(Repcat$FlavorsPo.COLUMNS.GNAME.name())); 
			repcat$FlavorsPo.setFname(dataObject.getString(Repcat$FlavorsPo.COLUMNS.FNAME.name())); 
			repcat$FlavorsPo.setCreationDate(TimestampUtils.of(dataObject.getValue(Repcat$FlavorsPo.COLUMNS.CREATION_DATE.name()))); 
			repcat$FlavorsPo.setCreatedBy(BigDecimalUtils.formObj(dataObject.getValue(Repcat$FlavorsPo.COLUMNS.CREATED_BY.name()))); 
			repcat$FlavorsPo.setPublished(dataObject.getString(Repcat$FlavorsPo.COLUMNS.PUBLISHED.name())); 
			return repcat$FlavorsPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Repcat$FlavorsPo repcat$FlavorsPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Repcat$FlavorsPo.COLUMNS.FLAVOR_ID.name(), repcat$FlavorsPo.getFlavorId()); 
			dataObject.setValue(Repcat$FlavorsPo.COLUMNS.GOWNER.name(), repcat$FlavorsPo.getGowner()); 
			dataObject.setValue(Repcat$FlavorsPo.COLUMNS.GOWNER.name(), repcat$FlavorsPo.getGowner()); 
			dataObject.setValue(Repcat$FlavorsPo.COLUMNS.GNAME.name(), repcat$FlavorsPo.getGname()); 
			dataObject.setValue(Repcat$FlavorsPo.COLUMNS.FNAME.name(), repcat$FlavorsPo.getFname()); 
			dataObject.setValue(Repcat$FlavorsPo.COLUMNS.CREATION_DATE.name(), repcat$FlavorsPo.getCreationDate()); 
			dataObject.setValue(Repcat$FlavorsPo.COLUMNS.CREATED_BY.name(), repcat$FlavorsPo.getCreatedBy()); 
			dataObject.setValue(Repcat$FlavorsPo.COLUMNS.PUBLISHED.name(), repcat$FlavorsPo.getPublished()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Repcat$FlavorsPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Repcat$FlavorsPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Repcat$FlavorsPo.COLUMNS.FLAVOR_ID.name(), po.getFlavorId()); 
		sqlWhere.add(Repcat$FlavorsPo.COLUMNS.GOWNER.name(), po.getGowner()); 
		sqlWhere.add(Repcat$FlavorsPo.COLUMNS.GOWNER.name(), po.getGowner()); 
		sqlWhere.add(Repcat$FlavorsPo.COLUMNS.GNAME.name(), po.getGname()); 
		return sqlWhere; 
	} 
 
} 
