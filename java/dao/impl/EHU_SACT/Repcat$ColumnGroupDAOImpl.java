package com.doc.common.dao.impl; 
 
public class Repcat$ColumnGroupDAOImpl extends GeneralDAOImpl<Repcat$ColumnGroupPo> implements IRepcat$ColumnGroupDAO { 
	public static final Repcat$ColumnGroupDAOImpl INSTANCE = new Repcat$ColumnGroupDAOImpl(); 
	public static final String TABLENAME = "REPCAT$_COLUMN_GROUP"; 

	public Repcat$ColumnGroupDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Repcat$ColumnGroupPo> CONVERTER = new MapConverter<Repcat$ColumnGroupPo>() { 
 
		@Override 
		public Repcat$ColumnGroupPo convert(final DataObject dataObject) { 
			final Repcat$ColumnGroupPo repcat$ColumnGroupPo = new Repcat$ColumnGroupPo(); 
			repcat$ColumnGroupPo.setSname(dataObject.getString(Repcat$ColumnGroupPo.COLUMNS.SNAME.name())); 
			repcat$ColumnGroupPo.setOname(dataObject.getString(Repcat$ColumnGroupPo.COLUMNS.ONAME.name())); 
			repcat$ColumnGroupPo.setGroupName(dataObject.getString(Repcat$ColumnGroupPo.COLUMNS.GROUP_NAME.name())); 
			repcat$ColumnGroupPo.setGroupComment(dataObject.getString(Repcat$ColumnGroupPo.COLUMNS.GROUP_COMMENT.name())); 
			return repcat$ColumnGroupPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Repcat$ColumnGroupPo repcat$ColumnGroupPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Repcat$ColumnGroupPo.COLUMNS.SNAME.name(), repcat$ColumnGroupPo.getSname()); 
			dataObject.setValue(Repcat$ColumnGroupPo.COLUMNS.ONAME.name(), repcat$ColumnGroupPo.getOname()); 
			dataObject.setValue(Repcat$ColumnGroupPo.COLUMNS.GROUP_NAME.name(), repcat$ColumnGroupPo.getGroupName()); 
			dataObject.setValue(Repcat$ColumnGroupPo.COLUMNS.GROUP_COMMENT.name(), repcat$ColumnGroupPo.getGroupComment()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Repcat$ColumnGroupPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Repcat$ColumnGroupPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Repcat$ColumnGroupPo.COLUMNS.SNAME.name(), po.getSname()); 
		sqlWhere.add(Repcat$ColumnGroupPo.COLUMNS.ONAME.name(), po.getOname()); 
		sqlWhere.add(Repcat$ColumnGroupPo.COLUMNS.GROUP_NAME.name(), po.getGroupName()); 
		return sqlWhere; 
	} 
 
} 
