package com.doc.common.dao.impl; 
 
public class Ol$hintsDAOImpl extends GeneralDAOImpl<Ol$hintsPo> implements IOl$hintsDAO { 
	public static final Ol$hintsDAOImpl INSTANCE = new Ol$hintsDAOImpl(); 
	public static final String TABLENAME = "OL$HINTS"; 

	public Ol$hintsDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Ol$hintsPo> CONVERTER = new MapConverter<Ol$hintsPo>() { 
 
		@Override 
		public Ol$hintsPo convert(final DataObject dataObject) { 
			final Ol$hintsPo ol$hintsPo = new Ol$hintsPo(); 
			ol$hintsPo.setOlName(dataObject.getString(Ol$hintsPo.COLUMNS.OL_NAME.name())); 
			ol$hintsPo.setHint#(BigDecimalUtils.formObj(dataObject.getValue(Ol$hintsPo.COLUMNS.HINT#.name()))); 
			ol$hintsPo.setCategory(dataObject.getString(Ol$hintsPo.COLUMNS.CATEGORY.name())); 
			ol$hintsPo.setHintType(BigDecimalUtils.formObj(dataObject.getValue(Ol$hintsPo.COLUMNS.HINT_TYPE.name()))); 
			ol$hintsPo.setHintText(dataObject.getString(Ol$hintsPo.COLUMNS.HINT_TEXT.name())); 
			ol$hintsPo.setStage#(BigDecimalUtils.formObj(dataObject.getValue(Ol$hintsPo.COLUMNS.STAGE#.name()))); 
			ol$hintsPo.setNode#(BigDecimalUtils.formObj(dataObject.getValue(Ol$hintsPo.COLUMNS.NODE#.name()))); 
			ol$hintsPo.setTableName(dataObject.getString(Ol$hintsPo.COLUMNS.TABLE_NAME.name())); 
			ol$hintsPo.setTableTin(BigDecimalUtils.formObj(dataObject.getValue(Ol$hintsPo.COLUMNS.TABLE_TIN.name()))); 
			ol$hintsPo.setTablePos(BigDecimalUtils.formObj(dataObject.getValue(Ol$hintsPo.COLUMNS.TABLE_POS.name()))); 
			ol$hintsPo.setRefId(BigDecimalUtils.formObj(dataObject.getValue(Ol$hintsPo.COLUMNS.REF_ID.name()))); 
			ol$hintsPo.setUserTableName(dataObject.getString(Ol$hintsPo.COLUMNS.USER_TABLE_NAME.name())); 
			ol$hintsPo.setCost(); 
			ol$hintsPo.setCardinality(); 
			ol$hintsPo.setBytes(); 
			ol$hintsPo.setHintTextoff(BigDecimalUtils.formObj(dataObject.getValue(Ol$hintsPo.COLUMNS.HINT_TEXTOFF.name()))); 
			ol$hintsPo.setHintTextlen(BigDecimalUtils.formObj(dataObject.getValue(Ol$hintsPo.COLUMNS.HINT_TEXTLEN.name()))); 
			ol$hintsPo.setJoinPred(dataObject.getString(Ol$hintsPo.COLUMNS.JOIN_PRED.name())); 
			ol$hintsPo.setSpare1(BigDecimalUtils.formObj(dataObject.getValue(Ol$hintsPo.COLUMNS.SPARE1.name()))); 
			ol$hintsPo.setSpare2(BigDecimalUtils.formObj(dataObject.getValue(Ol$hintsPo.COLUMNS.SPARE2.name()))); 
			ol$hintsPo.setHintString(); 
			return ol$hintsPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Ol$hintsPo ol$hintsPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Ol$hintsPo.COLUMNS.OL_NAME.name(), ol$hintsPo.getOlName()); 
			dataObject.setValue(Ol$hintsPo.COLUMNS.HINT#.name(), ol$hintsPo.getHint#()); 
			dataObject.setValue(Ol$hintsPo.COLUMNS.CATEGORY.name(), ol$hintsPo.getCategory()); 
			dataObject.setValue(Ol$hintsPo.COLUMNS.HINT_TYPE.name(), ol$hintsPo.getHintType()); 
			dataObject.setValue(Ol$hintsPo.COLUMNS.HINT_TEXT.name(), ol$hintsPo.getHintText()); 
			dataObject.setValue(Ol$hintsPo.COLUMNS.STAGE#.name(), ol$hintsPo.getStage#()); 
			dataObject.setValue(Ol$hintsPo.COLUMNS.NODE#.name(), ol$hintsPo.getNode#()); 
			dataObject.setValue(Ol$hintsPo.COLUMNS.TABLE_NAME.name(), ol$hintsPo.getTableName()); 
			dataObject.setValue(Ol$hintsPo.COLUMNS.TABLE_TIN.name(), ol$hintsPo.getTableTin()); 
			dataObject.setValue(Ol$hintsPo.COLUMNS.TABLE_POS.name(), ol$hintsPo.getTablePos()); 
			dataObject.setValue(Ol$hintsPo.COLUMNS.REF_ID.name(), ol$hintsPo.getRefId()); 
			dataObject.setValue(Ol$hintsPo.COLUMNS.USER_TABLE_NAME.name(), ol$hintsPo.getUserTableName()); 
			dataObject.setValue(Ol$hintsPo.COLUMNS.COST.name(), ol$hintsPo.getCost()); 
			dataObject.setValue(Ol$hintsPo.COLUMNS.CARDINALITY.name(), ol$hintsPo.getCardinality()); 
			dataObject.setValue(Ol$hintsPo.COLUMNS.BYTES.name(), ol$hintsPo.getBytes()); 
			dataObject.setValue(Ol$hintsPo.COLUMNS.HINT_TEXTOFF.name(), ol$hintsPo.getHintTextoff()); 
			dataObject.setValue(Ol$hintsPo.COLUMNS.HINT_TEXTLEN.name(), ol$hintsPo.getHintTextlen()); 
			dataObject.setValue(Ol$hintsPo.COLUMNS.JOIN_PRED.name(), ol$hintsPo.getJoinPred()); 
			dataObject.setValue(Ol$hintsPo.COLUMNS.SPARE1.name(), ol$hintsPo.getSpare1()); 
			dataObject.setValue(Ol$hintsPo.COLUMNS.SPARE2.name(), ol$hintsPo.getSpare2()); 
			dataObject.setValue(Ol$hintsPo.COLUMNS.HINT_STRING.name(), ol$hintsPo.getHintString()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Ol$hintsPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Ol$hintsPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
