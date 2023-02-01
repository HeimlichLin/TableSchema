package com.doc.common.dao.impl; 
 
public class Repcat$ObjectTypesDAOImpl extends GeneralDAOImpl<Repcat$ObjectTypesPo> implements IRepcat$ObjectTypesDAO { 
	public static final Repcat$ObjectTypesDAOImpl INSTANCE = new Repcat$ObjectTypesDAOImpl(); 
	public static final String TABLENAME = "REPCAT$_OBJECT_TYPES"; 

	public Repcat$ObjectTypesDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Repcat$ObjectTypesPo> CONVERTER = new MapConverter<Repcat$ObjectTypesPo>() { 
 
		@Override 
		public Repcat$ObjectTypesPo convert(final DataObject dataObject) { 
			final Repcat$ObjectTypesPo repcat$ObjectTypesPo = new Repcat$ObjectTypesPo(); 
			repcat$ObjectTypesPo.setObjectTypeId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$ObjectTypesPo.COLUMNS.OBJECT_TYPE_ID.name()))); 
			repcat$ObjectTypesPo.setObjectTypeName(dataObject.getString(Repcat$ObjectTypesPo.COLUMNS.OBJECT_TYPE_NAME.name())); 
			repcat$ObjectTypesPo.setFlags(); 
			repcat$ObjectTypesPo.setSpare1(dataObject.getString(Repcat$ObjectTypesPo.COLUMNS.SPARE1.name())); 
			return repcat$ObjectTypesPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Repcat$ObjectTypesPo repcat$ObjectTypesPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Repcat$ObjectTypesPo.COLUMNS.OBJECT_TYPE_ID.name(), repcat$ObjectTypesPo.getObjectTypeId()); 
			dataObject.setValue(Repcat$ObjectTypesPo.COLUMNS.OBJECT_TYPE_NAME.name(), repcat$ObjectTypesPo.getObjectTypeName()); 
			dataObject.setValue(Repcat$ObjectTypesPo.COLUMNS.FLAGS.name(), repcat$ObjectTypesPo.getFlags()); 
			dataObject.setValue(Repcat$ObjectTypesPo.COLUMNS.SPARE1.name(), repcat$ObjectTypesPo.getSpare1()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Repcat$ObjectTypesPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Repcat$ObjectTypesPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Repcat$ObjectTypesPo.COLUMNS.OBJECT_TYPE_ID.name(), po.getObjectTypeId()); 
		return sqlWhere; 
	} 
 
} 
