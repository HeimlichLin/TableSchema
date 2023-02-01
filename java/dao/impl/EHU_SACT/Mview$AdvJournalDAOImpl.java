package com.doc.common.dao.impl; 
 
public class Mview$AdvJournalDAOImpl extends GeneralDAOImpl<Mview$AdvJournalPo> implements IMview$AdvJournalDAO { 
	public static final Mview$AdvJournalDAOImpl INSTANCE = new Mview$AdvJournalDAOImpl(); 
	public static final String TABLENAME = "MVIEW$_ADV_JOURNAL"; 

	public Mview$AdvJournalDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Mview$AdvJournalPo> CONVERTER = new MapConverter<Mview$AdvJournalPo>() { 
 
		@Override 
		public Mview$AdvJournalPo convert(final DataObject dataObject) { 
			final Mview$AdvJournalPo mview$AdvJournalPo = new Mview$AdvJournalPo(); 
			mview$AdvJournalPo.setRunid#(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvJournalPo.COLUMNS.RUNID#.name()))); 
			mview$AdvJournalPo.setSeq#(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvJournalPo.COLUMNS.SEQ#.name()))); 
			mview$AdvJournalPo.setTimestamp(TimestampUtils.of(dataObject.getValue(Mview$AdvJournalPo.COLUMNS.TIMESTAMP.name()))); 
			mview$AdvJournalPo.setFlags(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvJournalPo.COLUMNS.FLAGS.name()))); 
			mview$AdvJournalPo.setNum(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvJournalPo.COLUMNS.NUM.name()))); 
			mview$AdvJournalPo.setText(); 
			mview$AdvJournalPo.setTextlen(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvJournalPo.COLUMNS.TEXTLEN.name()))); 
			return mview$AdvJournalPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Mview$AdvJournalPo mview$AdvJournalPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Mview$AdvJournalPo.COLUMNS.RUNID#.name(), mview$AdvJournalPo.getRunid#()); 
			dataObject.setValue(Mview$AdvJournalPo.COLUMNS.SEQ#.name(), mview$AdvJournalPo.getSeq#()); 
			dataObject.setValue(Mview$AdvJournalPo.COLUMNS.TIMESTAMP.name(), mview$AdvJournalPo.getTimestamp()); 
			dataObject.setValue(Mview$AdvJournalPo.COLUMNS.FLAGS.name(), mview$AdvJournalPo.getFlags()); 
			dataObject.setValue(Mview$AdvJournalPo.COLUMNS.NUM.name(), mview$AdvJournalPo.getNum()); 
			dataObject.setValue(Mview$AdvJournalPo.COLUMNS.TEXT.name(), mview$AdvJournalPo.getText()); 
			dataObject.setValue(Mview$AdvJournalPo.COLUMNS.TEXTLEN.name(), mview$AdvJournalPo.getTextlen()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Mview$AdvJournalPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Mview$AdvJournalPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Mview$AdvJournalPo.COLUMNS.RUNID#.name(), po.getRunid#()); 
		sqlWhere.add(Mview$AdvJournalPo.COLUMNS.SEQ#.name(), po.getSeq#()); 
		return sqlWhere; 
	} 
 
} 
