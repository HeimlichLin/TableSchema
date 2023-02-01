package com.doc.common.dao.impl; 
 
public class Repcat$ReppropDAOImpl extends GeneralDAOImpl<Repcat$ReppropPo> implements IRepcat$ReppropDAO { 
	public static final Repcat$ReppropDAOImpl INSTANCE = new Repcat$ReppropDAOImpl(); 
	public static final String TABLENAME = "REPCAT$_REPPROP"; 

	public Repcat$ReppropDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Repcat$ReppropPo> CONVERTER = new MapConverter<Repcat$ReppropPo>() { 
 
		@Override 
		public Repcat$ReppropPo convert(final DataObject dataObject) { 
			final Repcat$ReppropPo repcat$ReppropPo = new Repcat$ReppropPo(); 
			repcat$ReppropPo.setSname(dataObject.getString(Repcat$ReppropPo.COLUMNS.SNAME.name())); 
			repcat$ReppropPo.setOname(dataObject.getString(Repcat$ReppropPo.COLUMNS.ONAME.name())); 
			repcat$ReppropPo.setType(BigDecimalUtils.formObj(dataObject.getValue(Repcat$ReppropPo.COLUMNS.TYPE.name()))); 
			repcat$ReppropPo.setDblink(dataObject.getString(Repcat$ReppropPo.COLUMNS.DBLINK.name())); 
			repcat$ReppropPo.setHow(BigDecimalUtils.formObj(dataObject.getValue(Repcat$ReppropPo.COLUMNS.HOW.name()))); 
			repcat$ReppropPo.setPropagateComment(dataObject.getString(Repcat$ReppropPo.COLUMNS.PROPAGATE_COMMENT.name())); 
			repcat$ReppropPo.setDeliveryOrder(BigDecimalUtils.formObj(dataObject.getValue(Repcat$ReppropPo.COLUMNS.DELIVERY_ORDER.name()))); 
			repcat$ReppropPo.setRecipientKey(BigDecimalUtils.formObj(dataObject.getValue(Repcat$ReppropPo.COLUMNS.RECIPIENT_KEY.name()))); 
			repcat$ReppropPo.setExtensionId(); 
			return repcat$ReppropPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Repcat$ReppropPo repcat$ReppropPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Repcat$ReppropPo.COLUMNS.SNAME.name(), repcat$ReppropPo.getSname()); 
			dataObject.setValue(Repcat$ReppropPo.COLUMNS.ONAME.name(), repcat$ReppropPo.getOname()); 
			dataObject.setValue(Repcat$ReppropPo.COLUMNS.TYPE.name(), repcat$ReppropPo.getType()); 
			dataObject.setValue(Repcat$ReppropPo.COLUMNS.DBLINK.name(), repcat$ReppropPo.getDblink()); 
			dataObject.setValue(Repcat$ReppropPo.COLUMNS.HOW.name(), repcat$ReppropPo.getHow()); 
			dataObject.setValue(Repcat$ReppropPo.COLUMNS.PROPAGATE_COMMENT.name(), repcat$ReppropPo.getPropagateComment()); 
			dataObject.setValue(Repcat$ReppropPo.COLUMNS.DELIVERY_ORDER.name(), repcat$ReppropPo.getDeliveryOrder()); 
			dataObject.setValue(Repcat$ReppropPo.COLUMNS.RECIPIENT_KEY.name(), repcat$ReppropPo.getRecipientKey()); 
			dataObject.setValue(Repcat$ReppropPo.COLUMNS.EXTENSION_ID.name(), repcat$ReppropPo.getExtensionId()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Repcat$ReppropPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Repcat$ReppropPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Repcat$ReppropPo.COLUMNS.SNAME.name(), po.getSname()); 
		sqlWhere.add(Repcat$ReppropPo.COLUMNS.ONAME.name(), po.getOname()); 
		sqlWhere.add(Repcat$ReppropPo.COLUMNS.TYPE.name(), po.getType()); 
		sqlWhere.add(Repcat$ReppropPo.COLUMNS.DBLINK.name(), po.getDblink()); 
		return sqlWhere; 
	} 
 
} 
