package com.doc.common.dao.impl; 
 
public class InexgcostDAOImpl extends GeneralDAOImpl<InexgcostPo> implements InexgcostDAO { 
	public static final InexgcostDAOImpl INSTANCE = new InexgcostDAOImpl(); 
	public static final String TABLENAME = "INEXGCOST"; 

	public InexgcostDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<InexgcostPo> CONVERTER = new MapConverter<InexgcostPo>() { 
 
		@Override 
		public InexgcostPo convert(final DataObject dataObject) { 
			final InexgcostPo inexgcostPo = new InexgcostPo(); 
			inexgcostPo.setTtype(dataObject.getString(InexgcostPo.COLUMNS.TTYPE.name())); 
			inexgcostPo.setIndicator(dataObject.getString(InexgcostPo.COLUMNS.INDICATOR.name())); 
			inexgcostPo.setDecltype(dataObject.getString(InexgcostPo.COLUMNS.DECLTYPE.name())); 
			inexgcostPo.setDeclno(dataObject.getString(InexgcostPo.COLUMNS.DECLNO.name())); 
			inexgcostPo.setMwb(dataObject.getString(InexgcostPo.COLUMNS.MWB.name())); 
			inexgcostPo.setHwb(dataObject.getString(InexgcostPo.COLUMNS.HWB.name())); 
			inexgcostPo.setReleasetime(dataObject.getString(InexgcostPo.COLUMNS.RELEASETIME.name())); 
			inexgcostPo.setReleasepiece(dataObject.getString(InexgcostPo.COLUMNS.RELEASEPIECE.name())); 
			inexgcostPo.setClearancetype(dataObject.getString(InexgcostPo.COLUMNS.CLEARANCETYPE.name())); 
			inexgcostPo.setGcodate(dataObject.getString(InexgcostPo.COLUMNS.GCODATE.name())); 
			inexgcostPo.setGcopiece(dataObject.getString(InexgcostPo.COLUMNS.GCOPIECE.name())); 
			inexgcostPo.setGciweight(dataObject.getString(InexgcostPo.COLUMNS.GCIWEIGHT.name())); 
			inexgcostPo.setFee(dataObject.getString(InexgcostPo.COLUMNS.FEE.name())); 
			inexgcostPo.setExpressid(dataObject.getString(InexgcostPo.COLUMNS.EXPRESSID.name())); 
			inexgcostPo.setFlightno(dataObject.getString(InexgcostPo.COLUMNS.FLIGHTNO.name())); 
			inexgcostPo.setContainer(dataObject.getString(InexgcostPo.COLUMNS.CONTAINER.name())); 
			inexgcostPo.setGcomark(dataObject.getString(InexgcostPo.COLUMNS.GCOMARK.name())); 
			return inexgcostPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final InexgcostPo inexgcostPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(InexgcostPo.COLUMNS.TTYPE.name(), inexgcostPo.getTtype()); 
			dataObject.setValue(InexgcostPo.COLUMNS.INDICATOR.name(), inexgcostPo.getIndicator()); 
			dataObject.setValue(InexgcostPo.COLUMNS.DECLTYPE.name(), inexgcostPo.getDecltype()); 
			dataObject.setValue(InexgcostPo.COLUMNS.DECLNO.name(), inexgcostPo.getDeclno()); 
			dataObject.setValue(InexgcostPo.COLUMNS.MWB.name(), inexgcostPo.getMwb()); 
			dataObject.setValue(InexgcostPo.COLUMNS.HWB.name(), inexgcostPo.getHwb()); 
			dataObject.setValue(InexgcostPo.COLUMNS.RELEASETIME.name(), inexgcostPo.getReleasetime()); 
			dataObject.setValue(InexgcostPo.COLUMNS.RELEASEPIECE.name(), inexgcostPo.getReleasepiece()); 
			dataObject.setValue(InexgcostPo.COLUMNS.CLEARANCETYPE.name(), inexgcostPo.getClearancetype()); 
			dataObject.setValue(InexgcostPo.COLUMNS.GCODATE.name(), inexgcostPo.getGcodate()); 
			dataObject.setValue(InexgcostPo.COLUMNS.GCOPIECE.name(), inexgcostPo.getGcopiece()); 
			dataObject.setValue(InexgcostPo.COLUMNS.GCIWEIGHT.name(), inexgcostPo.getGciweight()); 
			dataObject.setValue(InexgcostPo.COLUMNS.FEE.name(), inexgcostPo.getFee()); 
			dataObject.setValue(InexgcostPo.COLUMNS.EXPRESSID.name(), inexgcostPo.getExpressid()); 
			dataObject.setValue(InexgcostPo.COLUMNS.FLIGHTNO.name(), inexgcostPo.getFlightno()); 
			dataObject.setValue(InexgcostPo.COLUMNS.CONTAINER.name(), inexgcostPo.getContainer()); 
			dataObject.setValue(InexgcostPo.COLUMNS.GCOMARK.name(), inexgcostPo.getGcomark()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<InexgcostPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(InexgcostPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
