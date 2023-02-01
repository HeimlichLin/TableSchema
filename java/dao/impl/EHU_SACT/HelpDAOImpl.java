package com.doc.common.dao.impl; 
 
public class HelpDAOImpl extends GeneralDAOImpl<HelpPo> implements IHelpDAO { 
	public static final HelpDAOImpl INSTANCE = new HelpDAOImpl(); 
	public static final String TABLENAME = "HELP"; 

	public HelpDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<HelpPo> CONVERTER = new MapConverter<HelpPo>() { 
 
		@Override 
		public HelpPo convert(final DataObject dataObject) { 
			final HelpPo helpPo = new HelpPo(); 
			helpPo.setTopic(dataObject.getString(HelpPo.COLUMNS.TOPIC.name())); 
			helpPo.setSeq(BigDecimalUtils.formObj(dataObject.getValue(HelpPo.COLUMNS.SEQ.name()))); 
			helpPo.setInfo(dataObject.getString(HelpPo.COLUMNS.INFO.name())); 
			return helpPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final HelpPo helpPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(HelpPo.COLUMNS.TOPIC.name(), helpPo.getTopic()); 
			dataObject.setValue(HelpPo.COLUMNS.SEQ.name(), helpPo.getSeq()); 
			dataObject.setValue(HelpPo.COLUMNS.INFO.name(), helpPo.getInfo()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<HelpPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(HelpPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(HelpPo.COLUMNS.TOPIC.name(), po.getTopic()); 
		sqlWhere.add(HelpPo.COLUMNS.SEQ.name(), po.getSeq()); 
		return sqlWhere; 
	} 
 
} 
