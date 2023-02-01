package com.doc.common.dao.impl; 
 
public class TmpOutdetailDAOImpl extends GeneralDAOImpl<TmpOutdetailPo> implements TmpOutdetailDAO { 
	public static final TmpOutdetailDAOImpl INSTANCE = new TmpOutdetailDAOImpl(); 
	public static final String TABLENAME = "TMP_OUTDETAIL"; 

	public TmpOutdetailDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TmpOutdetailPo> CONVERTER = new MapConverter<TmpOutdetailPo>() { 
 
		@Override 
		public TmpOutdetailPo convert(final DataObject dataObject) { 
			final TmpOutdetailPo tmpOutdetailPo = new TmpOutdetailPo(); 
			tmpOutdetailPo.setBondno(dataObject.getString(TmpOutdetailPo.COLUMNS.BONDNO.name())); 
			tmpOutdetailPo.setPrdtno(dataObject.getString(TmpOutdetailPo.COLUMNS.PRDTNO.name())); 
			tmpOutdetailPo.setOutunit(dataObject.getString(TmpOutdetailPo.COLUMNS.OUTUNIT.name())); 
			tmpOutdetailPo.setOutqty(BigDecimalUtils.formObj(dataObject.getValue(TmpOutdetailPo.COLUMNS.OUTQTY.name()))); 
			tmpOutdetailPo.setDecltype(dataObject.getString(TmpOutdetailPo.COLUMNS.DECLTYPE.name())); 
			tmpOutdetailPo.setIdecltype(dataObject.getString(TmpOutdetailPo.COLUMNS.IDECLTYPE.name())); 
			tmpOutdetailPo.setProcess(dataObject.getString(TmpOutdetailPo.COLUMNS.PROCESS.name())); 
			tmpOutdetailPo.setBomrate(BigDecimalUtils.formObj(dataObject.getValue(TmpOutdetailPo.COLUMNS.BOMRATE.name()))); 
			tmpOutdetailPo.setSessionid(dataObject.getString(TmpOutdetailPo.COLUMNS.SESSIONID.name())); 
			tmpOutdetailPo.setPartno(dataObject.getString(TmpOutdetailPo.COLUMNS.PARTNO.name())); 
			tmpOutdetailPo.setOptypenme(dataObject.getString(TmpOutdetailPo.COLUMNS.OPTYPENME.name())); 
			return tmpOutdetailPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TmpOutdetailPo tmpOutdetailPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TmpOutdetailPo.COLUMNS.BONDNO.name(), tmpOutdetailPo.getBondno()); 
			dataObject.setValue(TmpOutdetailPo.COLUMNS.PRDTNO.name(), tmpOutdetailPo.getPrdtno()); 
			dataObject.setValue(TmpOutdetailPo.COLUMNS.OUTUNIT.name(), tmpOutdetailPo.getOutunit()); 
			dataObject.setValue(TmpOutdetailPo.COLUMNS.OUTQTY.name(), tmpOutdetailPo.getOutqty()); 
			dataObject.setValue(TmpOutdetailPo.COLUMNS.DECLTYPE.name(), tmpOutdetailPo.getDecltype()); 
			dataObject.setValue(TmpOutdetailPo.COLUMNS.IDECLTYPE.name(), tmpOutdetailPo.getIdecltype()); 
			dataObject.setValue(TmpOutdetailPo.COLUMNS.PROCESS.name(), tmpOutdetailPo.getProcess()); 
			dataObject.setValue(TmpOutdetailPo.COLUMNS.BOMRATE.name(), tmpOutdetailPo.getBomrate()); 
			dataObject.setValue(TmpOutdetailPo.COLUMNS.SESSIONID.name(), tmpOutdetailPo.getSessionid()); 
			dataObject.setValue(TmpOutdetailPo.COLUMNS.PARTNO.name(), tmpOutdetailPo.getPartno()); 
			dataObject.setValue(TmpOutdetailPo.COLUMNS.OPTYPENME.name(), tmpOutdetailPo.getOptypenme()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TmpOutdetailPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TmpOutdetailPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
