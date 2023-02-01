package com.doc.common.dao.impl; 
 
public class ImpDeclareDAOImpl extends GeneralDAOImpl<ImpDeclarePo> implements ImpDeclareDAO { 
	public static final ImpDeclareDAOImpl INSTANCE = new ImpDeclareDAOImpl(); 
	public static final String TABLENAME = "IMP_DECLARE"; 

	public ImpDeclareDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ImpDeclarePo> CONVERTER = new MapConverter<ImpDeclarePo>() { 
 
		@Override 
		public ImpDeclarePo convert(final DataObject dataObject) { 
			final ImpDeclarePo impDeclarePo = new ImpDeclarePo(); 
			impDeclarePo.setExpressid(dataObject.getString(ImpDeclarePo.COLUMNS.EXPRESSID.name())); 
			impDeclarePo.setFlightno(dataObject.getString(ImpDeclarePo.COLUMNS.FLIGHTNO.name())); 
			impDeclarePo.setMwb(dataObject.getString(ImpDeclarePo.COLUMNS.MWB.name())); 
			impDeclarePo.setDeclareNo(BigDecimalUtils.formObj(dataObject.getValue(ImpDeclarePo.COLUMNS.DECLARE_NO.name()))); 
			impDeclarePo.setExpbagno(dataObject.getString(ImpDeclarePo.COLUMNS.EXPBAGNO.name())); 
			impDeclarePo.setDeclarePiece(BigDecimalUtils.formObj(dataObject.getValue(ImpDeclarePo.COLUMNS.DECLARE_PIECE.name()))); 
			impDeclarePo.setCrtDate(TimestampUtils.of(dataObject.getValue(ImpDeclarePo.COLUMNS.CRT_DATE.name()))); 
			impDeclarePo.setCrtUser(dataObject.getString(ImpDeclarePo.COLUMNS.CRT_USER.name())); 
			impDeclarePo.setModDate(TimestampUtils.of(dataObject.getValue(ImpDeclarePo.COLUMNS.MOD_DATE.name()))); 
			impDeclarePo.setModUser(dataObject.getString(ImpDeclarePo.COLUMNS.MOD_USER.name())); 
			impDeclarePo.setDelDate(TimestampUtils.of(dataObject.getValue(ImpDeclarePo.COLUMNS.DEL_DATE.name()))); 
			impDeclarePo.setDelUser(dataObject.getString(ImpDeclarePo.COLUMNS.DEL_USER.name())); 
			impDeclarePo.setBagno(dataObject.getString(ImpDeclarePo.COLUMNS.BAGNO.name())); 
			impDeclarePo.setFlightdate(dataObject.getString(ImpDeclarePo.COLUMNS.FLIGHTDATE.name())); 
			return impDeclarePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ImpDeclarePo impDeclarePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ImpDeclarePo.COLUMNS.EXPRESSID.name(), impDeclarePo.getExpressid()); 
			dataObject.setValue(ImpDeclarePo.COLUMNS.FLIGHTNO.name(), impDeclarePo.getFlightno()); 
			dataObject.setValue(ImpDeclarePo.COLUMNS.MWB.name(), impDeclarePo.getMwb()); 
			dataObject.setValue(ImpDeclarePo.COLUMNS.DECLARE_NO.name(), impDeclarePo.getDeclareNo()); 
			dataObject.setValue(ImpDeclarePo.COLUMNS.EXPBAGNO.name(), impDeclarePo.getExpbagno()); 
			dataObject.setValue(ImpDeclarePo.COLUMNS.DECLARE_PIECE.name(), impDeclarePo.getDeclarePiece()); 
			dataObject.setValue(ImpDeclarePo.COLUMNS.CRT_DATE.name(), impDeclarePo.getCrtDate()); 
			dataObject.setValue(ImpDeclarePo.COLUMNS.CRT_USER.name(), impDeclarePo.getCrtUser()); 
			dataObject.setValue(ImpDeclarePo.COLUMNS.MOD_DATE.name(), impDeclarePo.getModDate()); 
			dataObject.setValue(ImpDeclarePo.COLUMNS.MOD_USER.name(), impDeclarePo.getModUser()); 
			dataObject.setValue(ImpDeclarePo.COLUMNS.DEL_DATE.name(), impDeclarePo.getDelDate()); 
			dataObject.setValue(ImpDeclarePo.COLUMNS.DEL_USER.name(), impDeclarePo.getDelUser()); 
			dataObject.setValue(ImpDeclarePo.COLUMNS.BAGNO.name(), impDeclarePo.getBagno()); 
			dataObject.setValue(ImpDeclarePo.COLUMNS.FLIGHTDATE.name(), impDeclarePo.getFlightdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ImpDeclarePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ImpDeclarePo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
