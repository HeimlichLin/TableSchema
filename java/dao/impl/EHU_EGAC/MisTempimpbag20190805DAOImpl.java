package com.doc.common.dao.impl; 
 
public class MisTempimpbag20190805DAOImpl extends GeneralDAOImpl<MisTempimpbag20190805Po> implements MisTempimpbag20190805DAO { 
	public static final MisTempimpbag20190805DAOImpl INSTANCE = new MisTempimpbag20190805DAOImpl(); 
	public static final String TABLENAME = "MIS_TEMPIMPBAG_20190805"; 

	public MisTempimpbag20190805DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<MisTempimpbag20190805Po> CONVERTER = new MapConverter<MisTempimpbag20190805Po>() { 
 
		@Override 
		public MisTempimpbag20190805Po convert(final DataObject dataObject) { 
			final MisTempimpbag20190805Po misTempimpbag20190805Po = new MisTempimpbag20190805Po(); 
			misTempimpbag20190805Po.setBagno(dataObject.getString(MisTempimpbag20190805Po.COLUMNS.BAGNO.name())); 
			misTempimpbag20190805Po.setExpbagno(dataObject.getString(MisTempimpbag20190805Po.COLUMNS.EXPBAGNO.name())); 
			misTempimpbag20190805Po.setBaghwb(BigDecimalUtils.formObj(dataObject.getValue(MisTempimpbag20190805Po.COLUMNS.BAGHWB.name()))); 
			misTempimpbag20190805Po.setBagpiece(BigDecimalUtils.formObj(dataObject.getValue(MisTempimpbag20190805Po.COLUMNS.BAGPIECE.name()))); 
			misTempimpbag20190805Po.setBagweight(BigDecimalUtils.formObj(dataObject.getValue(MisTempimpbag20190805Po.COLUMNS.BAGWEIGHT.name()))); 
			misTempimpbag20190805Po.setBagfee(BigDecimalUtils.formObj(dataObject.getValue(MisTempimpbag20190805Po.COLUMNS.BAGFEE.name()))); 
			misTempimpbag20190805Po.setExpressid(dataObject.getString(MisTempimpbag20190805Po.COLUMNS.EXPRESSID.name())); 
			misTempimpbag20190805Po.setAirlineid(dataObject.getString(MisTempimpbag20190805Po.COLUMNS.AIRLINEID.name())); 
			misTempimpbag20190805Po.setChargebox(dataObject.getString(MisTempimpbag20190805Po.COLUMNS.CHARGEBOX.name())); 
			misTempimpbag20190805Po.setChargedate(TimestampUtils.of(dataObject.getValue(MisTempimpbag20190805Po.COLUMNS.CHARGEDATE.name()))); 
			misTempimpbag20190805Po.setIe(dataObject.getString(MisTempimpbag20190805Po.COLUMNS.IE.name())); 
			misTempimpbag20190805Po.setGcibagsn(BigDecimalUtils.formObj(dataObject.getValue(MisTempimpbag20190805Po.COLUMNS.GCIBAGSN.name()))); 
			misTempimpbag20190805Po.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(MisTempimpbag20190805Po.COLUMNS.GCOBAGSN.name()))); 
			misTempimpbag20190805Po.setLastupdate(TimestampUtils.of(dataObject.getValue(MisTempimpbag20190805Po.COLUMNS.LASTUPDATE.name()))); 
			return misTempimpbag20190805Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final MisTempimpbag20190805Po misTempimpbag20190805Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(MisTempimpbag20190805Po.COLUMNS.BAGNO.name(), misTempimpbag20190805Po.getBagno()); 
			dataObject.setValue(MisTempimpbag20190805Po.COLUMNS.EXPBAGNO.name(), misTempimpbag20190805Po.getExpbagno()); 
			dataObject.setValue(MisTempimpbag20190805Po.COLUMNS.BAGHWB.name(), misTempimpbag20190805Po.getBaghwb()); 
			dataObject.setValue(MisTempimpbag20190805Po.COLUMNS.BAGPIECE.name(), misTempimpbag20190805Po.getBagpiece()); 
			dataObject.setValue(MisTempimpbag20190805Po.COLUMNS.BAGWEIGHT.name(), misTempimpbag20190805Po.getBagweight()); 
			dataObject.setValue(MisTempimpbag20190805Po.COLUMNS.BAGFEE.name(), misTempimpbag20190805Po.getBagfee()); 
			dataObject.setValue(MisTempimpbag20190805Po.COLUMNS.EXPRESSID.name(), misTempimpbag20190805Po.getExpressid()); 
			dataObject.setValue(MisTempimpbag20190805Po.COLUMNS.AIRLINEID.name(), misTempimpbag20190805Po.getAirlineid()); 
			dataObject.setValue(MisTempimpbag20190805Po.COLUMNS.CHARGEBOX.name(), misTempimpbag20190805Po.getChargebox()); 
			dataObject.setValue(MisTempimpbag20190805Po.COLUMNS.CHARGEDATE.name(), misTempimpbag20190805Po.getChargedate()); 
			dataObject.setValue(MisTempimpbag20190805Po.COLUMNS.IE.name(), misTempimpbag20190805Po.getIe()); 
			dataObject.setValue(MisTempimpbag20190805Po.COLUMNS.GCIBAGSN.name(), misTempimpbag20190805Po.getGcibagsn()); 
			dataObject.setValue(MisTempimpbag20190805Po.COLUMNS.GCOBAGSN.name(), misTempimpbag20190805Po.getGcobagsn()); 
			dataObject.setValue(MisTempimpbag20190805Po.COLUMNS.LASTUPDATE.name(), misTempimpbag20190805Po.getLastupdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<MisTempimpbag20190805Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(MisTempimpbag20190805Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
