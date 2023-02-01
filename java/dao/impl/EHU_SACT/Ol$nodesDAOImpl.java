package com.doc.common.dao.impl; 
 
public class Ol$nodesDAOImpl extends GeneralDAOImpl<Ol$nodesPo> implements IOl$nodesDAO { 
	public static final Ol$nodesDAOImpl INSTANCE = new Ol$nodesDAOImpl(); 
	public static final String TABLENAME = "OL$NODES"; 

	public Ol$nodesDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Ol$nodesPo> CONVERTER = new MapConverter<Ol$nodesPo>() { 
 
		@Override 
		public Ol$nodesPo convert(final DataObject dataObject) { 
			final Ol$nodesPo ol$nodesPo = new Ol$nodesPo(); 
			ol$nodesPo.setOlName(dataObject.getString(Ol$nodesPo.COLUMNS.OL_NAME.name())); 
			ol$nodesPo.setCategory(dataObject.getString(Ol$nodesPo.COLUMNS.CATEGORY.name())); 
			ol$nodesPo.setNodeId(BigDecimalUtils.formObj(dataObject.getValue(Ol$nodesPo.COLUMNS.NODE_ID.name()))); 
			ol$nodesPo.setParentId(BigDecimalUtils.formObj(dataObject.getValue(Ol$nodesPo.COLUMNS.PARENT_ID.name()))); 
			ol$nodesPo.setNodeType(BigDecimalUtils.formObj(dataObject.getValue(Ol$nodesPo.COLUMNS.NODE_TYPE.name()))); 
			ol$nodesPo.setNodeTextlen(BigDecimalUtils.formObj(dataObject.getValue(Ol$nodesPo.COLUMNS.NODE_TEXTLEN.name()))); 
			ol$nodesPo.setNodeTextoff(BigDecimalUtils.formObj(dataObject.getValue(Ol$nodesPo.COLUMNS.NODE_TEXTOFF.name()))); 
			ol$nodesPo.setNodeName(dataObject.getString(Ol$nodesPo.COLUMNS.NODE_NAME.name())); 
			return ol$nodesPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Ol$nodesPo ol$nodesPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Ol$nodesPo.COLUMNS.OL_NAME.name(), ol$nodesPo.getOlName()); 
			dataObject.setValue(Ol$nodesPo.COLUMNS.CATEGORY.name(), ol$nodesPo.getCategory()); 
			dataObject.setValue(Ol$nodesPo.COLUMNS.NODE_ID.name(), ol$nodesPo.getNodeId()); 
			dataObject.setValue(Ol$nodesPo.COLUMNS.PARENT_ID.name(), ol$nodesPo.getParentId()); 
			dataObject.setValue(Ol$nodesPo.COLUMNS.NODE_TYPE.name(), ol$nodesPo.getNodeType()); 
			dataObject.setValue(Ol$nodesPo.COLUMNS.NODE_TEXTLEN.name(), ol$nodesPo.getNodeTextlen()); 
			dataObject.setValue(Ol$nodesPo.COLUMNS.NODE_TEXTOFF.name(), ol$nodesPo.getNodeTextoff()); 
			dataObject.setValue(Ol$nodesPo.COLUMNS.NODE_NAME.name(), ol$nodesPo.getNodeName()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Ol$nodesPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Ol$nodesPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
