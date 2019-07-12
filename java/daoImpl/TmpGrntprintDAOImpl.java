package com.doc.common.dao.impl; 
 
public class TmpGrntprintDAOImpl extends GeneralDAOImpl<TmpGrntprintDo> implements TmpGrntprintDAOImpl { 
	public static final TmpGrntprintDAOImpl INSTANCE = new TmpGrntprintDAOImpl(); 
	public static final String TABLENAME = "TMP_GRNTPRINT"; 

	public TmpGrntprintDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<TmpGrntprintDo> CONVERTER = new MapConverter<TmpGrntprintDo>() { 
 
		@Override 
		public TmpGrntprintDo convert(final DataObject dataObject) { 
			final TmpGrntprintDo tmpGrntprintDo = new TmpGrntprintDo(); 
			tmpGrntprintDo.setSessionid(dataObject.getString(TmpGrntprintDo.COLUMNS.SESSIONID.name())); 
			tmpGrntprintDo.setBondno(dataObject.getString(TmpGrntprintDo.COLUMNS.BONDNO.name())); 
			tmpGrntprintDo.setRecordno(BigDecimalUtils.formObj(dataObject.getString(TmpGrntprintDo.COLUMNS.RECORDNO.name()))); 
			tmpGrntprintDo.setStrdate(dataObject.getString(TmpGrntprintDo.COLUMNS.STRDATE.name())); 
			tmpGrntprintDo.setStrqty(BigDecimalUtils.formObj(dataObject.getString(TmpGrntprintDo.COLUMNS.STRQTY.name()))); 
			tmpGrntprintDo.setDeclqty(BigDecimalUtils.formObj(dataObject.getString(TmpGrntprintDo.COLUMNS.DECLQTY.name()))); 
			tmpGrntprintDo.setDeclno(dataObject.getString(TmpGrntprintDo.COLUMNS.DECLNO.name())); 
			tmpGrntprintDo.setItemno(BigDecimalUtils.formObj(dataObject.getString(TmpGrntprintDo.COLUMNS.ITEMNO.name()))); 
			tmpGrntprintDo.setPrdtno(dataObject.getString(TmpGrntprintDo.COLUMNS.PRDTNO.name())); 
			tmpGrntprintDo.setIntaxamt(BigDecimalUtils.formObj(dataObject.getString(TmpGrntprintDo.COLUMNS.INTAXAMT.name()))); 
			tmpGrntprintDo.setOutaxamt(BigDecimalUtils.formObj(dataObject.getString(TmpGrntprintDo.COLUMNS.OUTAXAMT.name()))); 
			tmpGrntprintDo.setAvlamt(BigDecimalUtils.formObj(dataObject.getString(TmpGrntprintDo.COLUMNS.AVLAMT.name()))); 
			tmpGrntprintDo.setDutyrate222(BigDecimalUtils.formObj(dataObject.getString(TmpGrntprintDo.COLUMNS.DUTYRATE222.name()))); 
			tmpGrntprintDo.setComdtaxrate222(BigDecimalUtils.formObj(dataObject.getString(TmpGrntprintDo.COLUMNS.COMDTAXRATE222.name()))); 
			tmpGrntprintDo.setVataxamt(BigDecimalUtils.formObj(dataObject.getString(TmpGrntprintDo.COLUMNS.VATAXAMT.name()))); 
			tmpGrntprintDo.setDecltype(dataObject.getString(TmpGrntprintDo.COLUMNS.DECLTYPE.name())); 
			tmpGrntprintDo.setCcccode(dataObject.getString(TmpGrntprintDo.COLUMNS.CCCCODE.name())); 
			tmpGrntprintDo.setStrpost(dataObject.getString(TmpGrntprintDo.COLUMNS.STRPOST.name())); 
			return tmpGrntprintDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TmpGrntprintDo tmpGrntprintDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TmpGrntprintDo.COLUMNS.SESSIONID.name(), tmpGrntprintDo.getSessionid()); 
			dataObject.setValue(TmpGrntprintDo.COLUMNS.BONDNO.name(), tmpGrntprintDo.getBondno()); 
			dataObject.setValue(TmpGrntprintDo.COLUMNS.RECORDNO.name(), tmpGrntprintDo.getRecordno()); 
			dataObject.setValue(TmpGrntprintDo.COLUMNS.STRDATE.name(), tmpGrntprintDo.getStrdate()); 
			dataObject.setValue(TmpGrntprintDo.COLUMNS.STRQTY.name(), tmpGrntprintDo.getStrqty()); 
			dataObject.setValue(TmpGrntprintDo.COLUMNS.DECLQTY.name(), tmpGrntprintDo.getDeclqty()); 
			dataObject.setValue(TmpGrntprintDo.COLUMNS.DECLNO.name(), tmpGrntprintDo.getDeclno()); 
			dataObject.setValue(TmpGrntprintDo.COLUMNS.ITEMNO.name(), tmpGrntprintDo.getItemno()); 
			dataObject.setValue(TmpGrntprintDo.COLUMNS.PRDTNO.name(), tmpGrntprintDo.getPrdtno()); 
			dataObject.setValue(TmpGrntprintDo.COLUMNS.INTAXAMT.name(), tmpGrntprintDo.getIntaxamt()); 
			dataObject.setValue(TmpGrntprintDo.COLUMNS.OUTAXAMT.name(), tmpGrntprintDo.getOutaxamt()); 
			dataObject.setValue(TmpGrntprintDo.COLUMNS.AVLAMT.name(), tmpGrntprintDo.getAvlamt()); 
			dataObject.setValue(TmpGrntprintDo.COLUMNS.DUTYRATE222.name(), tmpGrntprintDo.getDutyrate222()); 
			dataObject.setValue(TmpGrntprintDo.COLUMNS.COMDTAXRATE222.name(), tmpGrntprintDo.getComdtaxrate222()); 
			dataObject.setValue(TmpGrntprintDo.COLUMNS.VATAXAMT.name(), tmpGrntprintDo.getVataxamt()); 
			dataObject.setValue(TmpGrntprintDo.COLUMNS.DECLTYPE.name(), tmpGrntprintDo.getDecltype()); 
			dataObject.setValue(TmpGrntprintDo.COLUMNS.CCCCODE.name(), tmpGrntprintDo.getCcccode()); 
			dataObject.setValue(TmpGrntprintDo.COLUMNS.STRPOST.name(), tmpGrntprintDo.getStrpost()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TmpGrntprintDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TmpGrntprintDo po) { 
	} 
 
} 
