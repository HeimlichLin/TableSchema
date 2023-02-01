package com.doc.common.dao.impl; 
 
public class SumawbDAOImpl extends GeneralDAOImpl<SumawbPo> implements SumawbDAO { 
	public static final SumawbDAOImpl INSTANCE = new SumawbDAOImpl(); 
	public static final String TABLENAME = "SUMAWB"; 

	public SumawbDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<SumawbPo> CONVERTER = new MapConverter<SumawbPo>() { 
 
		@Override 
		public SumawbPo convert(final DataObject dataObject) { 
			final SumawbPo sumawbPo = new SumawbPo(); 
			sumawbPo.setAwb(dataObject.getString(SumawbPo.COLUMNS.AWB.name())); 
			sumawbPo.setHawb(dataObject.getString(SumawbPo.COLUMNS.HAWB.name())); 
			sumawbPo.setUldno(dataObject.getString(SumawbPo.COLUMNS.ULDNO.name())); 
			sumawbPo.setFlightno(dataObject.getString(SumawbPo.COLUMNS.FLIGHTNO.name())); 
			sumawbPo.setCreatedate(TimestampUtils.of(dataObject.getValue(SumawbPo.COLUMNS.CREATEDATE.name()))); 
			sumawbPo.setDele(dataObject.getString(SumawbPo.COLUMNS.DELE.name())); 
			sumawbPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(SumawbPo.COLUMNS.PIECE.name()))); 
			return sumawbPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final SumawbPo sumawbPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(SumawbPo.COLUMNS.AWB.name(), sumawbPo.getAwb()); 
			dataObject.setValue(SumawbPo.COLUMNS.HAWB.name(), sumawbPo.getHawb()); 
			dataObject.setValue(SumawbPo.COLUMNS.ULDNO.name(), sumawbPo.getUldno()); 
			dataObject.setValue(SumawbPo.COLUMNS.FLIGHTNO.name(), sumawbPo.getFlightno()); 
			dataObject.setValue(SumawbPo.COLUMNS.CREATEDATE.name(), sumawbPo.getCreatedate()); 
			dataObject.setValue(SumawbPo.COLUMNS.DELE.name(), sumawbPo.getDele()); 
			dataObject.setValue(SumawbPo.COLUMNS.PIECE.name(), sumawbPo.getPiece()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<SumawbPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(SumawbPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
