package com.doc.common.dao.impl; 
 
public class InimgcostDAOImpl extends GeneralDAOImpl<InimgcostPo> implements InimgcostDAO { 
	public static final InimgcostDAOImpl INSTANCE = new InimgcostDAOImpl(); 
	public static final String TABLENAME = "INIMGCOST"; 

	public InimgcostDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<InimgcostPo> CONVERTER = new MapConverter<InimgcostPo>() { 
 
		@Override 
		public InimgcostPo convert(final DataObject dataObject) { 
			final InimgcostPo inimgcostPo = new InimgcostPo(); 
			inimgcostPo.setTtype(dataObject.getString(InimgcostPo.COLUMNS.TTYPE.name())); 
			inimgcostPo.setIndicator(dataObject.getString(InimgcostPo.COLUMNS.INDICATOR.name())); 
			inimgcostPo.setDecltype(dataObject.getString(InimgcostPo.COLUMNS.DECLTYPE.name())); 
			inimgcostPo.setDeclno(dataObject.getString(InimgcostPo.COLUMNS.DECLNO.name())); 
			inimgcostPo.setMwb(dataObject.getString(InimgcostPo.COLUMNS.MWB.name())); 
			inimgcostPo.setHwb(dataObject.getString(InimgcostPo.COLUMNS.HWB.name())); 
			inimgcostPo.setReleasetime(dataObject.getString(InimgcostPo.COLUMNS.RELEASETIME.name())); 
			inimgcostPo.setReleasepiece(dataObject.getString(InimgcostPo.COLUMNS.RELEASEPIECE.name())); 
			inimgcostPo.setClearancetype(dataObject.getString(InimgcostPo.COLUMNS.CLEARANCETYPE.name())); 
			inimgcostPo.setGcodate(dataObject.getString(InimgcostPo.COLUMNS.GCODATE.name())); 
			inimgcostPo.setGcopiece(dataObject.getString(InimgcostPo.COLUMNS.GCOPIECE.name())); 
			inimgcostPo.setGciweight(dataObject.getString(InimgcostPo.COLUMNS.GCIWEIGHT.name())); 
			inimgcostPo.setFee(dataObject.getString(InimgcostPo.COLUMNS.FEE.name())); 
			inimgcostPo.setExpressid(dataObject.getString(InimgcostPo.COLUMNS.EXPRESSID.name())); 
			inimgcostPo.setFlightno(dataObject.getString(InimgcostPo.COLUMNS.FLIGHTNO.name())); 
			inimgcostPo.setContainer(dataObject.getString(InimgcostPo.COLUMNS.CONTAINER.name())); 
			inimgcostPo.setGcomark(dataObject.getString(InimgcostPo.COLUMNS.GCOMARK.name())); 
			return inimgcostPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final InimgcostPo inimgcostPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(InimgcostPo.COLUMNS.TTYPE.name(), inimgcostPo.getTtype()); 
			dataObject.setValue(InimgcostPo.COLUMNS.INDICATOR.name(), inimgcostPo.getIndicator()); 
			dataObject.setValue(InimgcostPo.COLUMNS.DECLTYPE.name(), inimgcostPo.getDecltype()); 
			dataObject.setValue(InimgcostPo.COLUMNS.DECLNO.name(), inimgcostPo.getDeclno()); 
			dataObject.setValue(InimgcostPo.COLUMNS.MWB.name(), inimgcostPo.getMwb()); 
			dataObject.setValue(InimgcostPo.COLUMNS.HWB.name(), inimgcostPo.getHwb()); 
			dataObject.setValue(InimgcostPo.COLUMNS.RELEASETIME.name(), inimgcostPo.getReleasetime()); 
			dataObject.setValue(InimgcostPo.COLUMNS.RELEASEPIECE.name(), inimgcostPo.getReleasepiece()); 
			dataObject.setValue(InimgcostPo.COLUMNS.CLEARANCETYPE.name(), inimgcostPo.getClearancetype()); 
			dataObject.setValue(InimgcostPo.COLUMNS.GCODATE.name(), inimgcostPo.getGcodate()); 
			dataObject.setValue(InimgcostPo.COLUMNS.GCOPIECE.name(), inimgcostPo.getGcopiece()); 
			dataObject.setValue(InimgcostPo.COLUMNS.GCIWEIGHT.name(), inimgcostPo.getGciweight()); 
			dataObject.setValue(InimgcostPo.COLUMNS.FEE.name(), inimgcostPo.getFee()); 
			dataObject.setValue(InimgcostPo.COLUMNS.EXPRESSID.name(), inimgcostPo.getExpressid()); 
			dataObject.setValue(InimgcostPo.COLUMNS.FLIGHTNO.name(), inimgcostPo.getFlightno()); 
			dataObject.setValue(InimgcostPo.COLUMNS.CONTAINER.name(), inimgcostPo.getContainer()); 
			dataObject.setValue(InimgcostPo.COLUMNS.GCOMARK.name(), inimgcostPo.getGcomark()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<InimgcostPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(InimgcostPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
