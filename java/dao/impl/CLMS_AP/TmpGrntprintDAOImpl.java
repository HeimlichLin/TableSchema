package com.doc.common.dao.impl; 
 
public class TmpGrntprintDAOImpl extends GeneralDAOImpl<TmpGrntprintPo> implements TmpGrntprintDAO { 
	public static final TmpGrntprintDAOImpl INSTANCE = new TmpGrntprintDAOImpl(); 
	public static final String TABLENAME = "TMP_GRNTPRINT"; 

	public TmpGrntprintDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TmpGrntprintPo> CONVERTER = new MapConverter<TmpGrntprintPo>() { 
 
		@Override 
		public TmpGrntprintPo convert(final DataObject dataObject) { 
			final TmpGrntprintPo tmpGrntprintPo = new TmpGrntprintPo(); 
			tmpGrntprintPo.setSessionid(dataObject.getString(TmpGrntprintPo.COLUMNS.SESSIONID.name())); 
			tmpGrntprintPo.setBondno(dataObject.getString(TmpGrntprintPo.COLUMNS.BONDNO.name())); 
			tmpGrntprintPo.setRecordno(BigDecimalUtils.formObj(dataObject.getValue(TmpGrntprintPo.COLUMNS.RECORDNO.name()))); 
			tmpGrntprintPo.setStrdate(dataObject.getString(TmpGrntprintPo.COLUMNS.STRDATE.name())); 
			tmpGrntprintPo.setStrqty(BigDecimalUtils.formObj(dataObject.getValue(TmpGrntprintPo.COLUMNS.STRQTY.name()))); 
			tmpGrntprintPo.setDeclqty(BigDecimalUtils.formObj(dataObject.getValue(TmpGrntprintPo.COLUMNS.DECLQTY.name()))); 
			tmpGrntprintPo.setDeclno(dataObject.getString(TmpGrntprintPo.COLUMNS.DECLNO.name())); 
			tmpGrntprintPo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(TmpGrntprintPo.COLUMNS.ITEMNO.name()))); 
			tmpGrntprintPo.setPrdtno(dataObject.getString(TmpGrntprintPo.COLUMNS.PRDTNO.name())); 
			tmpGrntprintPo.setIntaxamt(BigDecimalUtils.formObj(dataObject.getValue(TmpGrntprintPo.COLUMNS.INTAXAMT.name()))); 
			tmpGrntprintPo.setOutaxamt(BigDecimalUtils.formObj(dataObject.getValue(TmpGrntprintPo.COLUMNS.OUTAXAMT.name()))); 
			tmpGrntprintPo.setAvlamt(BigDecimalUtils.formObj(dataObject.getValue(TmpGrntprintPo.COLUMNS.AVLAMT.name()))); 
			tmpGrntprintPo.setDutyrate222(BigDecimalUtils.formObj(dataObject.getValue(TmpGrntprintPo.COLUMNS.DUTYRATE222.name()))); 
			tmpGrntprintPo.setComdtaxrate222(BigDecimalUtils.formObj(dataObject.getValue(TmpGrntprintPo.COLUMNS.COMDTAXRATE222.name()))); 
			tmpGrntprintPo.setVataxamt(BigDecimalUtils.formObj(dataObject.getValue(TmpGrntprintPo.COLUMNS.VATAXAMT.name()))); 
			tmpGrntprintPo.setDecltype(dataObject.getString(TmpGrntprintPo.COLUMNS.DECLTYPE.name())); 
			tmpGrntprintPo.setCcccode(dataObject.getString(TmpGrntprintPo.COLUMNS.CCCCODE.name())); 
			tmpGrntprintPo.setStrpost(dataObject.getString(TmpGrntprintPo.COLUMNS.STRPOST.name())); 
			return tmpGrntprintPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TmpGrntprintPo tmpGrntprintPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TmpGrntprintPo.COLUMNS.SESSIONID.name(), tmpGrntprintPo.getSessionid()); 
			dataObject.setValue(TmpGrntprintPo.COLUMNS.BONDNO.name(), tmpGrntprintPo.getBondno()); 
			dataObject.setValue(TmpGrntprintPo.COLUMNS.RECORDNO.name(), tmpGrntprintPo.getRecordno()); 
			dataObject.setValue(TmpGrntprintPo.COLUMNS.STRDATE.name(), tmpGrntprintPo.getStrdate()); 
			dataObject.setValue(TmpGrntprintPo.COLUMNS.STRQTY.name(), tmpGrntprintPo.getStrqty()); 
			dataObject.setValue(TmpGrntprintPo.COLUMNS.DECLQTY.name(), tmpGrntprintPo.getDeclqty()); 
			dataObject.setValue(TmpGrntprintPo.COLUMNS.DECLNO.name(), tmpGrntprintPo.getDeclno()); 
			dataObject.setValue(TmpGrntprintPo.COLUMNS.ITEMNO.name(), tmpGrntprintPo.getItemno()); 
			dataObject.setValue(TmpGrntprintPo.COLUMNS.PRDTNO.name(), tmpGrntprintPo.getPrdtno()); 
			dataObject.setValue(TmpGrntprintPo.COLUMNS.INTAXAMT.name(), tmpGrntprintPo.getIntaxamt()); 
			dataObject.setValue(TmpGrntprintPo.COLUMNS.OUTAXAMT.name(), tmpGrntprintPo.getOutaxamt()); 
			dataObject.setValue(TmpGrntprintPo.COLUMNS.AVLAMT.name(), tmpGrntprintPo.getAvlamt()); 
			dataObject.setValue(TmpGrntprintPo.COLUMNS.DUTYRATE222.name(), tmpGrntprintPo.getDutyrate222()); 
			dataObject.setValue(TmpGrntprintPo.COLUMNS.COMDTAXRATE222.name(), tmpGrntprintPo.getComdtaxrate222()); 
			dataObject.setValue(TmpGrntprintPo.COLUMNS.VATAXAMT.name(), tmpGrntprintPo.getVataxamt()); 
			dataObject.setValue(TmpGrntprintPo.COLUMNS.DECLTYPE.name(), tmpGrntprintPo.getDecltype()); 
			dataObject.setValue(TmpGrntprintPo.COLUMNS.CCCCODE.name(), tmpGrntprintPo.getCcccode()); 
			dataObject.setValue(TmpGrntprintPo.COLUMNS.STRPOST.name(), tmpGrntprintPo.getStrpost()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TmpGrntprintPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TmpGrntprintPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
