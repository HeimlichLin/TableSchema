package com.doc.common.dao.impl; 
 
public class Aq$QueueTablesDAOImpl extends GeneralDAOImpl<Aq$QueueTablesPo> implements IAq$QueueTablesDAO { 
	public static final Aq$QueueTablesDAOImpl INSTANCE = new Aq$QueueTablesDAOImpl(); 
	public static final String TABLENAME = "AQ$_QUEUE_TABLES"; 

	public Aq$QueueTablesDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Aq$QueueTablesPo> CONVERTER = new MapConverter<Aq$QueueTablesPo>() { 
 
		@Override 
		public Aq$QueueTablesPo convert(final DataObject dataObject) { 
			final Aq$QueueTablesPo aq$QueueTablesPo = new Aq$QueueTablesPo(); 
			aq$QueueTablesPo.setSchema(dataObject.getString(Aq$QueueTablesPo.COLUMNS.SCHEMA.name())); 
			aq$QueueTablesPo.setName(dataObject.getString(Aq$QueueTablesPo.COLUMNS.NAME.name())); 
			aq$QueueTablesPo.setUdataType(BigDecimalUtils.formObj(dataObject.getValue(Aq$QueueTablesPo.COLUMNS.UDATA_TYPE.name()))); 
			aq$QueueTablesPo.setObjno(BigDecimalUtils.formObj(dataObject.getValue(Aq$QueueTablesPo.COLUMNS.OBJNO.name()))); 
			aq$QueueTablesPo.setFlags(BigDecimalUtils.formObj(dataObject.getValue(Aq$QueueTablesPo.COLUMNS.FLAGS.name()))); 
			aq$QueueTablesPo.setSortCols(BigDecimalUtils.formObj(dataObject.getValue(Aq$QueueTablesPo.COLUMNS.SORT_COLS.name()))); 
			aq$QueueTablesPo.setTimezone(dataObject.getString(Aq$QueueTablesPo.COLUMNS.TIMEZONE.name())); 
			aq$QueueTablesPo.setTableComment(dataObject.getString(Aq$QueueTablesPo.COLUMNS.TABLE_COMMENT.name())); 
			return aq$QueueTablesPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Aq$QueueTablesPo aq$QueueTablesPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Aq$QueueTablesPo.COLUMNS.SCHEMA.name(), aq$QueueTablesPo.getSchema()); 
			dataObject.setValue(Aq$QueueTablesPo.COLUMNS.NAME.name(), aq$QueueTablesPo.getName()); 
			dataObject.setValue(Aq$QueueTablesPo.COLUMNS.UDATA_TYPE.name(), aq$QueueTablesPo.getUdataType()); 
			dataObject.setValue(Aq$QueueTablesPo.COLUMNS.OBJNO.name(), aq$QueueTablesPo.getObjno()); 
			dataObject.setValue(Aq$QueueTablesPo.COLUMNS.FLAGS.name(), aq$QueueTablesPo.getFlags()); 
			dataObject.setValue(Aq$QueueTablesPo.COLUMNS.SORT_COLS.name(), aq$QueueTablesPo.getSortCols()); 
			dataObject.setValue(Aq$QueueTablesPo.COLUMNS.TIMEZONE.name(), aq$QueueTablesPo.getTimezone()); 
			dataObject.setValue(Aq$QueueTablesPo.COLUMNS.TABLE_COMMENT.name(), aq$QueueTablesPo.getTableComment()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Aq$QueueTablesPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Aq$QueueTablesPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Aq$QueueTablesPo.COLUMNS.OBJNO.name(), po.getObjno()); 
		return sqlWhere; 
	} 
 
} 
