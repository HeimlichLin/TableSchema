package com.doc.common.dao.impl; 
 
public class ImpDeclareInfoDAOImpl extends GeneralDAOImpl<ImpDeclareInfoPo> implements ImpDeclareInfoDAO { 
	public static final ImpDeclareInfoDAOImpl INSTANCE = new ImpDeclareInfoDAOImpl(); 
	public static final String TABLENAME = "IMP_DECLARE_INFO"; 

	public ImpDeclareInfoDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ImpDeclareInfoPo> CONVERTER = new MapConverter<ImpDeclareInfoPo>() { 
 
		@Override 
		public ImpDeclareInfoPo convert(final DataObject dataObject) { 
			final ImpDeclareInfoPo impDeclareInfoPo = new ImpDeclareInfoPo(); 
			impDeclareInfoPo.setFlightno(dataObject.getString(ImpDeclareInfoPo.COLUMNS.FLIGHTNO.name())); 
			impDeclareInfoPo.setFlightdate(dataObject.getString(ImpDeclareInfoPo.COLUMNS.FLIGHTDATE.name())); 
			impDeclareInfoPo.setMwb(dataObject.getString(ImpDeclareInfoPo.COLUMNS.MWB.name())); 
			impDeclareInfoPo.setDeclareqty(BigDecimalUtils.formObj(dataObject.getValue(ImpDeclareInfoPo.COLUMNS.DECLAREQTY.name()))); 
			impDeclareInfoPo.setSendrcf(dataObject.getString(ImpDeclareInfoPo.COLUMNS.SENDRCF.name())); 
			impDeclareInfoPo.setSenddlv(dataObject.getString(ImpDeclareInfoPo.COLUMNS.SENDDLV.name())); 
			impDeclareInfoPo.setChkgciqty(BigDecimalUtils.formObj(dataObject.getValue(ImpDeclareInfoPo.COLUMNS.CHKGCIQTY.name()))); 
			impDeclareInfoPo.setCrtDate(TimestampUtils.of(dataObject.getValue(ImpDeclareInfoPo.COLUMNS.CRT_DATE.name()))); 
			impDeclareInfoPo.setLastupdate(TimestampUtils.of(dataObject.getValue(ImpDeclareInfoPo.COLUMNS.LASTUPDATE.name()))); 
			return impDeclareInfoPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ImpDeclareInfoPo impDeclareInfoPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ImpDeclareInfoPo.COLUMNS.FLIGHTNO.name(), impDeclareInfoPo.getFlightno()); 
			dataObject.setValue(ImpDeclareInfoPo.COLUMNS.FLIGHTDATE.name(), impDeclareInfoPo.getFlightdate()); 
			dataObject.setValue(ImpDeclareInfoPo.COLUMNS.MWB.name(), impDeclareInfoPo.getMwb()); 
			dataObject.setValue(ImpDeclareInfoPo.COLUMNS.DECLAREQTY.name(), impDeclareInfoPo.getDeclareqty()); 
			dataObject.setValue(ImpDeclareInfoPo.COLUMNS.SENDRCF.name(), impDeclareInfoPo.getSendrcf()); 
			dataObject.setValue(ImpDeclareInfoPo.COLUMNS.SENDDLV.name(), impDeclareInfoPo.getSenddlv()); 
			dataObject.setValue(ImpDeclareInfoPo.COLUMNS.CHKGCIQTY.name(), impDeclareInfoPo.getChkgciqty()); 
			dataObject.setValue(ImpDeclareInfoPo.COLUMNS.CRT_DATE.name(), impDeclareInfoPo.getCrtDate()); 
			dataObject.setValue(ImpDeclareInfoPo.COLUMNS.LASTUPDATE.name(), impDeclareInfoPo.getLastupdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ImpDeclareInfoPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ImpDeclareInfoPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
