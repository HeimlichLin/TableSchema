package com.doc.common.dao.impl; 
 
public class TempimpchargeDAOImpl extends GeneralDAOImpl<TempimpchargePo> implements TempimpchargeDAO { 
	public static final TempimpchargeDAOImpl INSTANCE = new TempimpchargeDAOImpl(); 
	public static final String TABLENAME = "TEMPIMPCHARGE"; 

	public TempimpchargeDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TempimpchargePo> CONVERTER = new MapConverter<TempimpchargePo>() { 
 
		@Override 
		public TempimpchargePo convert(final DataObject dataObject) { 
			final TempimpchargePo tempimpchargePo = new TempimpchargePo(); 
			tempimpchargePo.setBagno(dataObject.getString(TempimpchargePo.COLUMNS.BAGNO.name())); 
			tempimpchargePo.setDeclno(dataObject.getString(TempimpchargePo.COLUMNS.DECLNO.name())); 
			tempimpchargePo.setMwb(dataObject.getString(TempimpchargePo.COLUMNS.MWB.name())); 
			tempimpchargePo.setHwb(dataObject.getString(TempimpchargePo.COLUMNS.HWB.name())); 
			tempimpchargePo.setPrevpiece(BigDecimalUtils.formObj(dataObject.getValue(TempimpchargePo.COLUMNS.PREVPIECE.name()))); 
			tempimpchargePo.setPrevfee(BigDecimalUtils.formObj(dataObject.getValue(TempimpchargePo.COLUMNS.PREVFEE.name()))); 
			tempimpchargePo.setPrevweight(BigDecimalUtils.formObj(dataObject.getValue(TempimpchargePo.COLUMNS.PREVWEIGHT.name()))); 
			tempimpchargePo.setDiffpiece(BigDecimalUtils.formObj(dataObject.getValue(TempimpchargePo.COLUMNS.DIFFPIECE.name()))); 
			tempimpchargePo.setDifffee(BigDecimalUtils.formObj(dataObject.getValue(TempimpchargePo.COLUMNS.DIFFFEE.name()))); 
			tempimpchargePo.setDiffweight(BigDecimalUtils.formObj(dataObject.getValue(TempimpchargePo.COLUMNS.DIFFWEIGHT.name()))); 
			tempimpchargePo.setExpressid(dataObject.getString(TempimpchargePo.COLUMNS.EXPRESSID.name())); 
			tempimpchargePo.setWarehouse(dataObject.getString(TempimpchargePo.COLUMNS.WAREHOUSE.name())); 
			tempimpchargePo.setChargedate(TimestampUtils.of(dataObject.getValue(TempimpchargePo.COLUMNS.CHARGEDATE.name()))); 
			tempimpchargePo.setExtrafee(BigDecimalUtils.formObj(dataObject.getValue(TempimpchargePo.COLUMNS.EXTRAFEE.name()))); 
			tempimpchargePo.setExtrafeemark(dataObject.getString(TempimpchargePo.COLUMNS.EXTRAFEEMARK.name())); 
			tempimpchargePo.setCreatedate(TimestampUtils.of(dataObject.getValue(TempimpchargePo.COLUMNS.CREATEDATE.name()))); 
			tempimpchargePo.setLastchargedate(TimestampUtils.of(dataObject.getValue(TempimpchargePo.COLUMNS.LASTCHARGEDATE.name()))); 
			tempimpchargePo.setIe(dataObject.getString(TempimpchargePo.COLUMNS.IE.name())); 
			tempimpchargePo.setWorkarea(dataObject.getString(TempimpchargePo.COLUMNS.WORKAREA.name())); 
			return tempimpchargePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TempimpchargePo tempimpchargePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TempimpchargePo.COLUMNS.BAGNO.name(), tempimpchargePo.getBagno()); 
			dataObject.setValue(TempimpchargePo.COLUMNS.DECLNO.name(), tempimpchargePo.getDeclno()); 
			dataObject.setValue(TempimpchargePo.COLUMNS.MWB.name(), tempimpchargePo.getMwb()); 
			dataObject.setValue(TempimpchargePo.COLUMNS.HWB.name(), tempimpchargePo.getHwb()); 
			dataObject.setValue(TempimpchargePo.COLUMNS.PREVPIECE.name(), tempimpchargePo.getPrevpiece()); 
			dataObject.setValue(TempimpchargePo.COLUMNS.PREVFEE.name(), tempimpchargePo.getPrevfee()); 
			dataObject.setValue(TempimpchargePo.COLUMNS.PREVWEIGHT.name(), tempimpchargePo.getPrevweight()); 
			dataObject.setValue(TempimpchargePo.COLUMNS.DIFFPIECE.name(), tempimpchargePo.getDiffpiece()); 
			dataObject.setValue(TempimpchargePo.COLUMNS.DIFFFEE.name(), tempimpchargePo.getDifffee()); 
			dataObject.setValue(TempimpchargePo.COLUMNS.DIFFWEIGHT.name(), tempimpchargePo.getDiffweight()); 
			dataObject.setValue(TempimpchargePo.COLUMNS.EXPRESSID.name(), tempimpchargePo.getExpressid()); 
			dataObject.setValue(TempimpchargePo.COLUMNS.WAREHOUSE.name(), tempimpchargePo.getWarehouse()); 
			dataObject.setValue(TempimpchargePo.COLUMNS.CHARGEDATE.name(), tempimpchargePo.getChargedate()); 
			dataObject.setValue(TempimpchargePo.COLUMNS.EXTRAFEE.name(), tempimpchargePo.getExtrafee()); 
			dataObject.setValue(TempimpchargePo.COLUMNS.EXTRAFEEMARK.name(), tempimpchargePo.getExtrafeemark()); 
			dataObject.setValue(TempimpchargePo.COLUMNS.CREATEDATE.name(), tempimpchargePo.getCreatedate()); 
			dataObject.setValue(TempimpchargePo.COLUMNS.LASTCHARGEDATE.name(), tempimpchargePo.getLastchargedate()); 
			dataObject.setValue(TempimpchargePo.COLUMNS.IE.name(), tempimpchargePo.getIe()); 
			dataObject.setValue(TempimpchargePo.COLUMNS.WORKAREA.name(), tempimpchargePo.getWorkarea()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TempimpchargePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TempimpchargePo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
