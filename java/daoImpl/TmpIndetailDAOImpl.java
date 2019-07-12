package com.doc.common.dao.impl; 
 
public class TmpIndetailDAOImpl extends GeneralDAOImpl<TmpIndetailDo> implements TmpIndetailDAOImpl { 
	public static final TmpIndetailDAOImpl INSTANCE = new TmpIndetailDAOImpl(); 
	public static final String TABLENAME = "TMP_INDETAIL"; 

	public TmpIndetailDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<TmpIndetailDo> CONVERTER = new MapConverter<TmpIndetailDo>() { 
 
		@Override 
		public TmpIndetailDo convert(final DataObject dataObject) { 
			final TmpIndetailDo tmpIndetailDo = new TmpIndetailDo(); 
			tmpIndetailDo.setBondno(dataObject.getString(TmpIndetailDo.COLUMNS.BONDNO.name())); 
			tmpIndetailDo.setPrdtno(dataObject.getString(TmpIndetailDo.COLUMNS.PRDTNO.name())); 
			tmpIndetailDo.setInunit(dataObject.getString(TmpIndetailDo.COLUMNS.INUNIT.name())); 
			tmpIndetailDo.setRinqty(BigDecimalUtils.formObj(dataObject.getString(TmpIndetailDo.COLUMNS.RINQTY.name()))); 
			tmpIndetailDo.setDecltype(dataObject.getString(TmpIndetailDo.COLUMNS.DECLTYPE.name())); 
			tmpIndetailDo.setSessionid(dataObject.getString(TmpIndetailDo.COLUMNS.SESSIONID.name())); 
			tmpIndetailDo.setOptypenme(dataObject.getString(TmpIndetailDo.COLUMNS.OPTYPENME.name())); 
			return tmpIndetailDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TmpIndetailDo tmpIndetailDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TmpIndetailDo.COLUMNS.BONDNO.name(), tmpIndetailDo.getBondno()); 
			dataObject.setValue(TmpIndetailDo.COLUMNS.PRDTNO.name(), tmpIndetailDo.getPrdtno()); 
			dataObject.setValue(TmpIndetailDo.COLUMNS.INUNIT.name(), tmpIndetailDo.getInunit()); 
			dataObject.setValue(TmpIndetailDo.COLUMNS.RINQTY.name(), tmpIndetailDo.getRinqty()); 
			dataObject.setValue(TmpIndetailDo.COLUMNS.DECLTYPE.name(), tmpIndetailDo.getDecltype()); 
			dataObject.setValue(TmpIndetailDo.COLUMNS.SESSIONID.name(), tmpIndetailDo.getSessionid()); 
			dataObject.setValue(TmpIndetailDo.COLUMNS.OPTYPENME.name(), tmpIndetailDo.getOptypenme()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TmpIndetailDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TmpIndetailDo po) { 
	} 
 
} 
