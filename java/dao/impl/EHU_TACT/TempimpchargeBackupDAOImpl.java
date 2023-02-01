package com.doc.common.dao.impl; 
 
public class TempimpchargeBackupDAOImpl extends GeneralDAOImpl<TempimpchargeBackupPo> implements TempimpchargeBackupDAO { 
	public static final TempimpchargeBackupDAOImpl INSTANCE = new TempimpchargeBackupDAOImpl(); 
	public static final String TABLENAME = "TEMPIMPCHARGE_BACKUP"; 

	public TempimpchargeBackupDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TempimpchargeBackupPo> CONVERTER = new MapConverter<TempimpchargeBackupPo>() { 
 
		@Override 
		public TempimpchargeBackupPo convert(final DataObject dataObject) { 
			final TempimpchargeBackupPo tempimpchargeBackupPo = new TempimpchargeBackupPo(); 
			tempimpchargeBackupPo.setBagno(dataObject.getString(TempimpchargeBackupPo.COLUMNS.BAGNO.name())); 
			tempimpchargeBackupPo.setDeclno(dataObject.getString(TempimpchargeBackupPo.COLUMNS.DECLNO.name())); 
			tempimpchargeBackupPo.setMwb(dataObject.getString(TempimpchargeBackupPo.COLUMNS.MWB.name())); 
			tempimpchargeBackupPo.setHwb(dataObject.getString(TempimpchargeBackupPo.COLUMNS.HWB.name())); 
			tempimpchargeBackupPo.setPrevpiece(BigDecimalUtils.formObj(dataObject.getValue(TempimpchargeBackupPo.COLUMNS.PREVPIECE.name()))); 
			tempimpchargeBackupPo.setPrevfee(BigDecimalUtils.formObj(dataObject.getValue(TempimpchargeBackupPo.COLUMNS.PREVFEE.name()))); 
			tempimpchargeBackupPo.setPrevweight(BigDecimalUtils.formObj(dataObject.getValue(TempimpchargeBackupPo.COLUMNS.PREVWEIGHT.name()))); 
			tempimpchargeBackupPo.setDiffpiece(BigDecimalUtils.formObj(dataObject.getValue(TempimpchargeBackupPo.COLUMNS.DIFFPIECE.name()))); 
			tempimpchargeBackupPo.setDifffee(BigDecimalUtils.formObj(dataObject.getValue(TempimpchargeBackupPo.COLUMNS.DIFFFEE.name()))); 
			tempimpchargeBackupPo.setDiffweight(BigDecimalUtils.formObj(dataObject.getValue(TempimpchargeBackupPo.COLUMNS.DIFFWEIGHT.name()))); 
			tempimpchargeBackupPo.setExpressid(dataObject.getString(TempimpchargeBackupPo.COLUMNS.EXPRESSID.name())); 
			tempimpchargeBackupPo.setWarehouse(dataObject.getString(TempimpchargeBackupPo.COLUMNS.WAREHOUSE.name())); 
			tempimpchargeBackupPo.setChargedate(TimestampUtils.of(dataObject.getValue(TempimpchargeBackupPo.COLUMNS.CHARGEDATE.name()))); 
			tempimpchargeBackupPo.setExtrafee(BigDecimalUtils.formObj(dataObject.getValue(TempimpchargeBackupPo.COLUMNS.EXTRAFEE.name()))); 
			tempimpchargeBackupPo.setExtrafeemark(dataObject.getString(TempimpchargeBackupPo.COLUMNS.EXTRAFEEMARK.name())); 
			tempimpchargeBackupPo.setCreatedate(TimestampUtils.of(dataObject.getValue(TempimpchargeBackupPo.COLUMNS.CREATEDATE.name()))); 
			tempimpchargeBackupPo.setLastchargedate(TimestampUtils.of(dataObject.getValue(TempimpchargeBackupPo.COLUMNS.LASTCHARGEDATE.name()))); 
			tempimpchargeBackupPo.setIe(dataObject.getString(TempimpchargeBackupPo.COLUMNS.IE.name())); 
			tempimpchargeBackupPo.setWorkarea(dataObject.getString(TempimpchargeBackupPo.COLUMNS.WORKAREA.name())); 
			return tempimpchargeBackupPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TempimpchargeBackupPo tempimpchargeBackupPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TempimpchargeBackupPo.COLUMNS.BAGNO.name(), tempimpchargeBackupPo.getBagno()); 
			dataObject.setValue(TempimpchargeBackupPo.COLUMNS.DECLNO.name(), tempimpchargeBackupPo.getDeclno()); 
			dataObject.setValue(TempimpchargeBackupPo.COLUMNS.MWB.name(), tempimpchargeBackupPo.getMwb()); 
			dataObject.setValue(TempimpchargeBackupPo.COLUMNS.HWB.name(), tempimpchargeBackupPo.getHwb()); 
			dataObject.setValue(TempimpchargeBackupPo.COLUMNS.PREVPIECE.name(), tempimpchargeBackupPo.getPrevpiece()); 
			dataObject.setValue(TempimpchargeBackupPo.COLUMNS.PREVFEE.name(), tempimpchargeBackupPo.getPrevfee()); 
			dataObject.setValue(TempimpchargeBackupPo.COLUMNS.PREVWEIGHT.name(), tempimpchargeBackupPo.getPrevweight()); 
			dataObject.setValue(TempimpchargeBackupPo.COLUMNS.DIFFPIECE.name(), tempimpchargeBackupPo.getDiffpiece()); 
			dataObject.setValue(TempimpchargeBackupPo.COLUMNS.DIFFFEE.name(), tempimpchargeBackupPo.getDifffee()); 
			dataObject.setValue(TempimpchargeBackupPo.COLUMNS.DIFFWEIGHT.name(), tempimpchargeBackupPo.getDiffweight()); 
			dataObject.setValue(TempimpchargeBackupPo.COLUMNS.EXPRESSID.name(), tempimpchargeBackupPo.getExpressid()); 
			dataObject.setValue(TempimpchargeBackupPo.COLUMNS.WAREHOUSE.name(), tempimpchargeBackupPo.getWarehouse()); 
			dataObject.setValue(TempimpchargeBackupPo.COLUMNS.CHARGEDATE.name(), tempimpchargeBackupPo.getChargedate()); 
			dataObject.setValue(TempimpchargeBackupPo.COLUMNS.EXTRAFEE.name(), tempimpchargeBackupPo.getExtrafee()); 
			dataObject.setValue(TempimpchargeBackupPo.COLUMNS.EXTRAFEEMARK.name(), tempimpchargeBackupPo.getExtrafeemark()); 
			dataObject.setValue(TempimpchargeBackupPo.COLUMNS.CREATEDATE.name(), tempimpchargeBackupPo.getCreatedate()); 
			dataObject.setValue(TempimpchargeBackupPo.COLUMNS.LASTCHARGEDATE.name(), tempimpchargeBackupPo.getLastchargedate()); 
			dataObject.setValue(TempimpchargeBackupPo.COLUMNS.IE.name(), tempimpchargeBackupPo.getIe()); 
			dataObject.setValue(TempimpchargeBackupPo.COLUMNS.WORKAREA.name(), tempimpchargeBackupPo.getWorkarea()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TempimpchargeBackupPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TempimpchargeBackupPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
