package com.doc.common.dao.impl; 
 
public class SeqCurrnoDAOImpl extends GeneralDAOImpl<SeqCurrnoPo> implements SeqCurrnoDAO { 
	public static final SeqCurrnoDAOImpl INSTANCE = new SeqCurrnoDAOImpl(); 
	public static final String TABLENAME = "SEQ_CURRNO"; 

	public SeqCurrnoDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<SeqCurrnoPo> CONVERTER = new MapConverter<SeqCurrnoPo>() { 
 
		@Override 
		public SeqCurrnoPo convert(final DataObject dataObject) { 
			final SeqCurrnoPo seqCurrnoPo = new SeqCurrnoPo(); 
			seqCurrnoPo.setBfNo(dataObject.getString(SeqCurrnoPo.COLUMNS.BF_NO.name())); 
			seqCurrnoPo.setSeqName(dataObject.getString(SeqCurrnoPo.COLUMNS.SEQ_NAME.name())); 
			seqCurrnoPo.setCurrNo(dataObject.getString(SeqCurrnoPo.COLUMNS.CURR_NO.name())); 
			return seqCurrnoPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final SeqCurrnoPo seqCurrnoPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(SeqCurrnoPo.COLUMNS.BF_NO.name(), seqCurrnoPo.getBfNo()); 
			dataObject.setValue(SeqCurrnoPo.COLUMNS.SEQ_NAME.name(), seqCurrnoPo.getSeqName()); 
			dataObject.setValue(SeqCurrnoPo.COLUMNS.CURR_NO.name(), seqCurrnoPo.getCurrNo()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<SeqCurrnoPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(SeqCurrnoPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(SeqCurrnoPo.COLUMNS.BF_NO.name(), po.getBfNo()); 
		sqlWhere.add(SeqCurrnoPo.COLUMNS.SEQ_NAME.name(), po.getSeqName()); 
		return sqlWhere; 
	} 
 
} 
