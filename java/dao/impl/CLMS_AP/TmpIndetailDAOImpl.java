package com.doc.common.dao.impl; 
 
public class TmpIndetailDAOImpl extends GeneralDAOImpl<TmpIndetailPo> implements TmpIndetailDAO { 
	public static final TmpIndetailDAOImpl INSTANCE = new TmpIndetailDAOImpl(); 
	public static final String TABLENAME = "TMP_INDETAIL"; 

	public TmpIndetailDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TmpIndetailPo> CONVERTER = new MapConverter<TmpIndetailPo>() { 
 
		@Override 
		public TmpIndetailPo convert(final DataObject dataObject) { 
			final TmpIndetailPo tmpIndetailPo = new TmpIndetailPo(); 
			tmpIndetailPo.setBondno(dataObject.getString(TmpIndetailPo.COLUMNS.BONDNO.name())); 
			tmpIndetailPo.setPrdtno(dataObject.getString(TmpIndetailPo.COLUMNS.PRDTNO.name())); 
			tmpIndetailPo.setInunit(dataObject.getString(TmpIndetailPo.COLUMNS.INUNIT.name())); 
			tmpIndetailPo.setRinqty(BigDecimalUtils.formObj(dataObject.getValue(TmpIndetailPo.COLUMNS.RINQTY.name()))); 
			tmpIndetailPo.setDecltype(dataObject.getString(TmpIndetailPo.COLUMNS.DECLTYPE.name())); 
			tmpIndetailPo.setSessionid(dataObject.getString(TmpIndetailPo.COLUMNS.SESSIONID.name())); 
			tmpIndetailPo.setOptypenme(dataObject.getString(TmpIndetailPo.COLUMNS.OPTYPENME.name())); 
			return tmpIndetailPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TmpIndetailPo tmpIndetailPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TmpIndetailPo.COLUMNS.BONDNO.name(), tmpIndetailPo.getBondno()); 
			dataObject.setValue(TmpIndetailPo.COLUMNS.PRDTNO.name(), tmpIndetailPo.getPrdtno()); 
			dataObject.setValue(TmpIndetailPo.COLUMNS.INUNIT.name(), tmpIndetailPo.getInunit()); 
			dataObject.setValue(TmpIndetailPo.COLUMNS.RINQTY.name(), tmpIndetailPo.getRinqty()); 
			dataObject.setValue(TmpIndetailPo.COLUMNS.DECLTYPE.name(), tmpIndetailPo.getDecltype()); 
			dataObject.setValue(TmpIndetailPo.COLUMNS.SESSIONID.name(), tmpIndetailPo.getSessionid()); 
			dataObject.setValue(TmpIndetailPo.COLUMNS.OPTYPENME.name(), tmpIndetailPo.getOptypenme()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TmpIndetailPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TmpIndetailPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
