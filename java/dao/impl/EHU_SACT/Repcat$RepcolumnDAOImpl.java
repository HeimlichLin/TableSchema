package com.doc.common.dao.impl; 
 
public class Repcat$RepcolumnDAOImpl extends GeneralDAOImpl<Repcat$RepcolumnPo> implements IRepcat$RepcolumnDAO { 
	public static final Repcat$RepcolumnDAOImpl INSTANCE = new Repcat$RepcolumnDAOImpl(); 
	public static final String TABLENAME = "REPCAT$_REPCOLUMN"; 

	public Repcat$RepcolumnDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Repcat$RepcolumnPo> CONVERTER = new MapConverter<Repcat$RepcolumnPo>() { 
 
		@Override 
		public Repcat$RepcolumnPo convert(final DataObject dataObject) { 
			final Repcat$RepcolumnPo repcat$RepcolumnPo = new Repcat$RepcolumnPo(); 
			repcat$RepcolumnPo.setSname(dataObject.getString(Repcat$RepcolumnPo.COLUMNS.SNAME.name())); 
			repcat$RepcolumnPo.setOname(dataObject.getString(Repcat$RepcolumnPo.COLUMNS.ONAME.name())); 
			repcat$RepcolumnPo.setType(BigDecimalUtils.formObj(dataObject.getValue(Repcat$RepcolumnPo.COLUMNS.TYPE.name()))); 
			repcat$RepcolumnPo.setCname(dataObject.getString(Repcat$RepcolumnPo.COLUMNS.CNAME.name())); 
			repcat$RepcolumnPo.setLcname(dataObject.getString(Repcat$RepcolumnPo.COLUMNS.LCNAME.name())); 
			repcat$RepcolumnPo.setToid(); 
			repcat$RepcolumnPo.setVersion#(BigDecimalUtils.formObj(dataObject.getValue(Repcat$RepcolumnPo.COLUMNS.VERSION#.name()))); 
			repcat$RepcolumnPo.setHashcode(); 
			repcat$RepcolumnPo.setCtypeName(dataObject.getString(Repcat$RepcolumnPo.COLUMNS.CTYPE_NAME.name())); 
			repcat$RepcolumnPo.setCtypeOwner(dataObject.getString(Repcat$RepcolumnPo.COLUMNS.CTYPE_OWNER.name())); 
			repcat$RepcolumnPo.setId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$RepcolumnPo.COLUMNS.ID.name()))); 
			repcat$RepcolumnPo.setPos(BigDecimalUtils.formObj(dataObject.getValue(Repcat$RepcolumnPo.COLUMNS.POS.name()))); 
			repcat$RepcolumnPo.setTop(dataObject.getString(Repcat$RepcolumnPo.COLUMNS.TOP.name())); 
			repcat$RepcolumnPo.setFlag(); 
			repcat$RepcolumnPo.setCtype(BigDecimalUtils.formObj(dataObject.getValue(Repcat$RepcolumnPo.COLUMNS.CTYPE.name()))); 
			repcat$RepcolumnPo.setLength(BigDecimalUtils.formObj(dataObject.getValue(Repcat$RepcolumnPo.COLUMNS.LENGTH.name()))); 
			repcat$RepcolumnPo.setPrecision#(BigDecimalUtils.formObj(dataObject.getValue(Repcat$RepcolumnPo.COLUMNS.PRECISION#.name()))); 
			repcat$RepcolumnPo.setScale(BigDecimalUtils.formObj(dataObject.getValue(Repcat$RepcolumnPo.COLUMNS.SCALE.name()))); 
			repcat$RepcolumnPo.setNull$(BigDecimalUtils.formObj(dataObject.getValue(Repcat$RepcolumnPo.COLUMNS.NULL$.name()))); 
			repcat$RepcolumnPo.setCharsetid(BigDecimalUtils.formObj(dataObject.getValue(Repcat$RepcolumnPo.COLUMNS.CHARSETID.name()))); 
			repcat$RepcolumnPo.setCharsetform(BigDecimalUtils.formObj(dataObject.getValue(Repcat$RepcolumnPo.COLUMNS.CHARSETFORM.name()))); 
			repcat$RepcolumnPo.setProperty(); 
			repcat$RepcolumnPo.setClength(BigDecimalUtils.formObj(dataObject.getValue(Repcat$RepcolumnPo.COLUMNS.CLENGTH.name()))); 
			return repcat$RepcolumnPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Repcat$RepcolumnPo repcat$RepcolumnPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Repcat$RepcolumnPo.COLUMNS.SNAME.name(), repcat$RepcolumnPo.getSname()); 
			dataObject.setValue(Repcat$RepcolumnPo.COLUMNS.ONAME.name(), repcat$RepcolumnPo.getOname()); 
			dataObject.setValue(Repcat$RepcolumnPo.COLUMNS.TYPE.name(), repcat$RepcolumnPo.getType()); 
			dataObject.setValue(Repcat$RepcolumnPo.COLUMNS.CNAME.name(), repcat$RepcolumnPo.getCname()); 
			dataObject.setValue(Repcat$RepcolumnPo.COLUMNS.LCNAME.name(), repcat$RepcolumnPo.getLcname()); 
			dataObject.setValue(Repcat$RepcolumnPo.COLUMNS.TOID.name(), repcat$RepcolumnPo.getToid()); 
			dataObject.setValue(Repcat$RepcolumnPo.COLUMNS.VERSION#.name(), repcat$RepcolumnPo.getVersion#()); 
			dataObject.setValue(Repcat$RepcolumnPo.COLUMNS.HASHCODE.name(), repcat$RepcolumnPo.getHashcode()); 
			dataObject.setValue(Repcat$RepcolumnPo.COLUMNS.CTYPE_NAME.name(), repcat$RepcolumnPo.getCtypeName()); 
			dataObject.setValue(Repcat$RepcolumnPo.COLUMNS.CTYPE_OWNER.name(), repcat$RepcolumnPo.getCtypeOwner()); 
			dataObject.setValue(Repcat$RepcolumnPo.COLUMNS.ID.name(), repcat$RepcolumnPo.getId()); 
			dataObject.setValue(Repcat$RepcolumnPo.COLUMNS.POS.name(), repcat$RepcolumnPo.getPos()); 
			dataObject.setValue(Repcat$RepcolumnPo.COLUMNS.TOP.name(), repcat$RepcolumnPo.getTop()); 
			dataObject.setValue(Repcat$RepcolumnPo.COLUMNS.FLAG.name(), repcat$RepcolumnPo.getFlag()); 
			dataObject.setValue(Repcat$RepcolumnPo.COLUMNS.CTYPE.name(), repcat$RepcolumnPo.getCtype()); 
			dataObject.setValue(Repcat$RepcolumnPo.COLUMNS.LENGTH.name(), repcat$RepcolumnPo.getLength()); 
			dataObject.setValue(Repcat$RepcolumnPo.COLUMNS.PRECISION#.name(), repcat$RepcolumnPo.getPrecision#()); 
			dataObject.setValue(Repcat$RepcolumnPo.COLUMNS.SCALE.name(), repcat$RepcolumnPo.getScale()); 
			dataObject.setValue(Repcat$RepcolumnPo.COLUMNS.NULL$.name(), repcat$RepcolumnPo.getNull$()); 
			dataObject.setValue(Repcat$RepcolumnPo.COLUMNS.CHARSETID.name(), repcat$RepcolumnPo.getCharsetid()); 
			dataObject.setValue(Repcat$RepcolumnPo.COLUMNS.CHARSETFORM.name(), repcat$RepcolumnPo.getCharsetform()); 
			dataObject.setValue(Repcat$RepcolumnPo.COLUMNS.PROPERTY.name(), repcat$RepcolumnPo.getProperty()); 
			dataObject.setValue(Repcat$RepcolumnPo.COLUMNS.CLENGTH.name(), repcat$RepcolumnPo.getClength()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Repcat$RepcolumnPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Repcat$RepcolumnPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Repcat$RepcolumnPo.COLUMNS.SNAME.name(), po.getSname()); 
		sqlWhere.add(Repcat$RepcolumnPo.COLUMNS.ONAME.name(), po.getOname()); 
		sqlWhere.add(Repcat$RepcolumnPo.COLUMNS.TYPE.name(), po.getType()); 
		sqlWhere.add(Repcat$RepcolumnPo.COLUMNS.CNAME.name(), po.getCname()); 
		return sqlWhere; 
	} 
 
} 
