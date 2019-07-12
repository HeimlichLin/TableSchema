package com.doc.common.dao.impl; 
 
public class TmpOutdetailDAOImpl extends GeneralDAOImpl<TmpOutdetailDo> implements TmpOutdetailDAOImpl { 
	public static final TmpOutdetailDAOImpl INSTANCE = new TmpOutdetailDAOImpl(); 
	public static final String TABLENAME = "TMP_OUTDETAIL"; 

	public TmpOutdetailDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<TmpOutdetailDo> CONVERTER = new MapConverter<TmpOutdetailDo>() { 
 
		@Override 
		public TmpOutdetailDo convert(final DataObject dataObject) { 
			final TmpOutdetailDo tmpOutdetailDo = new TmpOutdetailDo(); 
			tmpOutdetailDo.setBondno(dataObject.getString(TmpOutdetailDo.COLUMNS.BONDNO.name())); 
			tmpOutdetailDo.setPrdtno(dataObject.getString(TmpOutdetailDo.COLUMNS.PRDTNO.name())); 
			tmpOutdetailDo.setOutunit(dataObject.getString(TmpOutdetailDo.COLUMNS.OUTUNIT.name())); 
			tmpOutdetailDo.setOutqty(BigDecimalUtils.formObj(dataObject.getString(TmpOutdetailDo.COLUMNS.OUTQTY.name()))); 
			tmpOutdetailDo.setDecltype(dataObject.getString(TmpOutdetailDo.COLUMNS.DECLTYPE.name())); 
			tmpOutdetailDo.setIdecltype(dataObject.getString(TmpOutdetailDo.COLUMNS.IDECLTYPE.name())); 
			tmpOutdetailDo.setProcess(dataObject.getString(TmpOutdetailDo.COLUMNS.PROCESS.name())); 
			tmpOutdetailDo.setBomrate(BigDecimalUtils.formObj(dataObject.getString(TmpOutdetailDo.COLUMNS.BOMRATE.name()))); 
			tmpOutdetailDo.setSessionid(dataObject.getString(TmpOutdetailDo.COLUMNS.SESSIONID.name())); 
			tmpOutdetailDo.setPartno(dataObject.getString(TmpOutdetailDo.COLUMNS.PARTNO.name())); 
			tmpOutdetailDo.setOptypenme(dataObject.getString(TmpOutdetailDo.COLUMNS.OPTYPENME.name())); 
			return tmpOutdetailDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TmpOutdetailDo tmpOutdetailDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TmpOutdetailDo.COLUMNS.BONDNO.name(), tmpOutdetailDo.getBondno()); 
			dataObject.setValue(TmpOutdetailDo.COLUMNS.PRDTNO.name(), tmpOutdetailDo.getPrdtno()); 
			dataObject.setValue(TmpOutdetailDo.COLUMNS.OUTUNIT.name(), tmpOutdetailDo.getOutunit()); 
			dataObject.setValue(TmpOutdetailDo.COLUMNS.OUTQTY.name(), tmpOutdetailDo.getOutqty()); 
			dataObject.setValue(TmpOutdetailDo.COLUMNS.DECLTYPE.name(), tmpOutdetailDo.getDecltype()); 
			dataObject.setValue(TmpOutdetailDo.COLUMNS.IDECLTYPE.name(), tmpOutdetailDo.getIdecltype()); 
			dataObject.setValue(TmpOutdetailDo.COLUMNS.PROCESS.name(), tmpOutdetailDo.getProcess()); 
			dataObject.setValue(TmpOutdetailDo.COLUMNS.BOMRATE.name(), tmpOutdetailDo.getBomrate()); 
			dataObject.setValue(TmpOutdetailDo.COLUMNS.SESSIONID.name(), tmpOutdetailDo.getSessionid()); 
			dataObject.setValue(TmpOutdetailDo.COLUMNS.PARTNO.name(), tmpOutdetailDo.getPartno()); 
			dataObject.setValue(TmpOutdetailDo.COLUMNS.OPTYPENME.name(), tmpOutdetailDo.getOptypenme()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TmpOutdetailDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TmpOutdetailDo po) { 
	} 
 
} 
