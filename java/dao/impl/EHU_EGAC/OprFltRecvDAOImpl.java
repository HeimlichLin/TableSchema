package com.doc.common.dao.impl; 
 
public class OprFltRecvDAOImpl extends GeneralDAOImpl<OprFltRecvPo> implements OprFltRecvDAO { 
	public static final OprFltRecvDAOImpl INSTANCE = new OprFltRecvDAOImpl(); 
	public static final String TABLENAME = "OPR_FLT_RECV"; 

	public OprFltRecvDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<OprFltRecvPo> CONVERTER = new MapConverter<OprFltRecvPo>() { 
 
		@Override 
		public OprFltRecvPo convert(final DataObject dataObject) { 
			final OprFltRecvPo oprFltRecvPo = new OprFltRecvPo(); 
			oprFltRecvPo.setOriChgCod(dataObject.getString(OprFltRecvPo.COLUMNS.ORI_CHG_COD.name())); 
			oprFltRecvPo.setCodDstAdd(dataObject.getString(OprFltRecvPo.COLUMNS.COD_DST_ADD.name())); 
			oprFltRecvPo.setCreateDate(TimestampUtils.of(dataObject.getValue(OprFltRecvPo.COLUMNS.CREATE_DATE.name()))); 
			return oprFltRecvPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final OprFltRecvPo oprFltRecvPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(OprFltRecvPo.COLUMNS.ORI_CHG_COD.name(), oprFltRecvPo.getOriChgCod()); 
			dataObject.setValue(OprFltRecvPo.COLUMNS.COD_DST_ADD.name(), oprFltRecvPo.getCodDstAdd()); 
			dataObject.setValue(OprFltRecvPo.COLUMNS.CREATE_DATE.name(), oprFltRecvPo.getCreateDate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<OprFltRecvPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(OprFltRecvPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
