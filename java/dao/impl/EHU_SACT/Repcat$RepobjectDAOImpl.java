package com.doc.common.dao.impl; 
 
public class Repcat$RepobjectDAOImpl extends GeneralDAOImpl<Repcat$RepobjectPo> implements IRepcat$RepobjectDAO { 
	public static final Repcat$RepobjectDAOImpl INSTANCE = new Repcat$RepobjectDAOImpl(); 
	public static final String TABLENAME = "REPCAT$_REPOBJECT"; 

	public Repcat$RepobjectDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Repcat$RepobjectPo> CONVERTER = new MapConverter<Repcat$RepobjectPo>() { 
 
		@Override 
		public Repcat$RepobjectPo convert(final DataObject dataObject) { 
			final Repcat$RepobjectPo repcat$RepobjectPo = new Repcat$RepobjectPo(); 
			repcat$RepobjectPo.setSname(dataObject.getString(Repcat$RepobjectPo.COLUMNS.SNAME.name())); 
			repcat$RepobjectPo.setOname(dataObject.getString(Repcat$RepobjectPo.COLUMNS.ONAME.name())); 
			repcat$RepobjectPo.setType(BigDecimalUtils.formObj(dataObject.getValue(Repcat$RepobjectPo.COLUMNS.TYPE.name()))); 
			repcat$RepobjectPo.setVersion#(BigDecimalUtils.formObj(dataObject.getValue(Repcat$RepobjectPo.COLUMNS.VERSION#.name()))); 
			repcat$RepobjectPo.setHashcode(); 
			repcat$RepobjectPo.setId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$RepobjectPo.COLUMNS.ID.name()))); 
			repcat$RepobjectPo.setObjectComment(dataObject.getString(Repcat$RepobjectPo.COLUMNS.OBJECT_COMMENT.name())); 
			repcat$RepobjectPo.setStatus(BigDecimalUtils.formObj(dataObject.getValue(Repcat$RepobjectPo.COLUMNS.STATUS.name()))); 
			repcat$RepobjectPo.setGenpackage(BigDecimalUtils.formObj(dataObject.getValue(Repcat$RepobjectPo.COLUMNS.GENPACKAGE.name()))); 
			repcat$RepobjectPo.setGenplogid(BigDecimalUtils.formObj(dataObject.getValue(Repcat$RepobjectPo.COLUMNS.GENPLOGID.name()))); 
			repcat$RepobjectPo.setGentrigger(BigDecimalUtils.formObj(dataObject.getValue(Repcat$RepobjectPo.COLUMNS.GENTRIGGER.name()))); 
			repcat$RepobjectPo.setGentlogid(BigDecimalUtils.formObj(dataObject.getValue(Repcat$RepobjectPo.COLUMNS.GENTLOGID.name()))); 
			repcat$RepobjectPo.setGowner(dataObject.getString(Repcat$RepobjectPo.COLUMNS.GOWNER.name())); 
			repcat$RepobjectPo.setGname(dataObject.getString(Repcat$RepobjectPo.COLUMNS.GNAME.name())); 
			repcat$RepobjectPo.setFlag(); 
			return repcat$RepobjectPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Repcat$RepobjectPo repcat$RepobjectPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Repcat$RepobjectPo.COLUMNS.SNAME.name(), repcat$RepobjectPo.getSname()); 
			dataObject.setValue(Repcat$RepobjectPo.COLUMNS.ONAME.name(), repcat$RepobjectPo.getOname()); 
			dataObject.setValue(Repcat$RepobjectPo.COLUMNS.TYPE.name(), repcat$RepobjectPo.getType()); 
			dataObject.setValue(Repcat$RepobjectPo.COLUMNS.VERSION#.name(), repcat$RepobjectPo.getVersion#()); 
			dataObject.setValue(Repcat$RepobjectPo.COLUMNS.HASHCODE.name(), repcat$RepobjectPo.getHashcode()); 
			dataObject.setValue(Repcat$RepobjectPo.COLUMNS.ID.name(), repcat$RepobjectPo.getId()); 
			dataObject.setValue(Repcat$RepobjectPo.COLUMNS.OBJECT_COMMENT.name(), repcat$RepobjectPo.getObjectComment()); 
			dataObject.setValue(Repcat$RepobjectPo.COLUMNS.STATUS.name(), repcat$RepobjectPo.getStatus()); 
			dataObject.setValue(Repcat$RepobjectPo.COLUMNS.GENPACKAGE.name(), repcat$RepobjectPo.getGenpackage()); 
			dataObject.setValue(Repcat$RepobjectPo.COLUMNS.GENPLOGID.name(), repcat$RepobjectPo.getGenplogid()); 
			dataObject.setValue(Repcat$RepobjectPo.COLUMNS.GENTRIGGER.name(), repcat$RepobjectPo.getGentrigger()); 
			dataObject.setValue(Repcat$RepobjectPo.COLUMNS.GENTLOGID.name(), repcat$RepobjectPo.getGentlogid()); 
			dataObject.setValue(Repcat$RepobjectPo.COLUMNS.GOWNER.name(), repcat$RepobjectPo.getGowner()); 
			dataObject.setValue(Repcat$RepobjectPo.COLUMNS.GNAME.name(), repcat$RepobjectPo.getGname()); 
			dataObject.setValue(Repcat$RepobjectPo.COLUMNS.FLAG.name(), repcat$RepobjectPo.getFlag()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Repcat$RepobjectPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Repcat$RepobjectPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Repcat$RepobjectPo.COLUMNS.SNAME.name(), po.getSname()); 
		sqlWhere.add(Repcat$RepobjectPo.COLUMNS.ONAME.name(), po.getOname()); 
		sqlWhere.add(Repcat$RepobjectPo.COLUMNS.TYPE.name(), po.getType()); 
		sqlWhere.add(Repcat$RepobjectPo.COLUMNS.GOWNER.name(), po.getGowner()); 
		sqlWhere.add(Repcat$RepobjectPo.COLUMNS.GNAME.name(), po.getGname()); 
		return sqlWhere; 
	} 
 
} 
