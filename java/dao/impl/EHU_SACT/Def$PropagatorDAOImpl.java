package com.doc.common.dao.impl; 
 
public class Def$PropagatorDAOImpl extends GeneralDAOImpl<Def$PropagatorPo> implements IDef$PropagatorDAO { 
	public static final Def$PropagatorDAOImpl INSTANCE = new Def$PropagatorDAOImpl(); 
	public static final String TABLENAME = "DEF$_PROPAGATOR"; 

	public Def$PropagatorDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Def$PropagatorPo> CONVERTER = new MapConverter<Def$PropagatorPo>() { 
 
		@Override 
		public Def$PropagatorPo convert(final DataObject dataObject) { 
			final Def$PropagatorPo def$PropagatorPo = new Def$PropagatorPo(); 
			def$PropagatorPo.setUserid(BigDecimalUtils.formObj(dataObject.getValue(Def$PropagatorPo.COLUMNS.USERID.name()))); 
			def$PropagatorPo.setUsername(dataObject.getString(Def$PropagatorPo.COLUMNS.USERNAME.name())); 
			def$PropagatorPo.setCreated(TimestampUtils.of(dataObject.getValue(Def$PropagatorPo.COLUMNS.CREATED.name()))); 
			return def$PropagatorPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Def$PropagatorPo def$PropagatorPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Def$PropagatorPo.COLUMNS.USERID.name(), def$PropagatorPo.getUserid()); 
			dataObject.setValue(Def$PropagatorPo.COLUMNS.USERNAME.name(), def$PropagatorPo.getUsername()); 
			dataObject.setValue(Def$PropagatorPo.COLUMNS.CREATED.name(), def$PropagatorPo.getCreated()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Def$PropagatorPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Def$PropagatorPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Def$PropagatorPo.COLUMNS.USERID.name(), po.getUserid()); 
		return sqlWhere; 
	} 
 
} 
