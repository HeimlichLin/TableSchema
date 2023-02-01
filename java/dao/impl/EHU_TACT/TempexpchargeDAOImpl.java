package com.doc.common.dao.impl; 
 
public class TempexpchargeDAOImpl extends GeneralDAOImpl<TempexpchargePo> implements TempexpchargeDAO { 
	public static final TempexpchargeDAOImpl INSTANCE = new TempexpchargeDAOImpl(); 
	public static final String TABLENAME = "TEMPEXPCHARGE"; 

	public TempexpchargeDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TempexpchargePo> CONVERTER = new MapConverter<TempexpchargePo>() { 
 
		@Override 
		public TempexpchargePo convert(final DataObject dataObject) { 
			final TempexpchargePo tempexpchargePo = new TempexpchargePo(); 
			tempexpchargePo.setBagno(dataObject.getString(TempexpchargePo.COLUMNS.BAGNO.name())); 
			tempexpchargePo.setDeclno(dataObject.getString(TempexpchargePo.COLUMNS.DECLNO.name())); 
			tempexpchargePo.setMwb(dataObject.getString(TempexpchargePo.COLUMNS.MWB.name())); 
			tempexpchargePo.setHwb(dataObject.getString(TempexpchargePo.COLUMNS.HWB.name())); 
			tempexpchargePo.setPrevpiece(BigDecimalUtils.formObj(dataObject.getValue(TempexpchargePo.COLUMNS.PREVPIECE.name()))); 
			tempexpchargePo.setPrevfee(BigDecimalUtils.formObj(dataObject.getValue(TempexpchargePo.COLUMNS.PREVFEE.name()))); 
			tempexpchargePo.setPrevweight(BigDecimalUtils.formObj(dataObject.getValue(TempexpchargePo.COLUMNS.PREVWEIGHT.name()))); 
			tempexpchargePo.setDiffpiece(BigDecimalUtils.formObj(dataObject.getValue(TempexpchargePo.COLUMNS.DIFFPIECE.name()))); 
			tempexpchargePo.setDifffee(BigDecimalUtils.formObj(dataObject.getValue(TempexpchargePo.COLUMNS.DIFFFEE.name()))); 
			tempexpchargePo.setDiffweight(BigDecimalUtils.formObj(dataObject.getValue(TempexpchargePo.COLUMNS.DIFFWEIGHT.name()))); 
			tempexpchargePo.setExpressid(dataObject.getString(TempexpchargePo.COLUMNS.EXPRESSID.name())); 
			tempexpchargePo.setWarehouse(dataObject.getString(TempexpchargePo.COLUMNS.WAREHOUSE.name())); 
			tempexpchargePo.setChargedate(TimestampUtils.of(dataObject.getValue(TempexpchargePo.COLUMNS.CHARGEDATE.name()))); 
			tempexpchargePo.setExtrafee(BigDecimalUtils.formObj(dataObject.getValue(TempexpchargePo.COLUMNS.EXTRAFEE.name()))); 
			tempexpchargePo.setExtrafeemark(dataObject.getString(TempexpchargePo.COLUMNS.EXTRAFEEMARK.name())); 
			tempexpchargePo.setCreatedate(TimestampUtils.of(dataObject.getValue(TempexpchargePo.COLUMNS.CREATEDATE.name()))); 
			tempexpchargePo.setLastchargedate(TimestampUtils.of(dataObject.getValue(TempexpchargePo.COLUMNS.LASTCHARGEDATE.name()))); 
			tempexpchargePo.setIe(dataObject.getString(TempexpchargePo.COLUMNS.IE.name())); 
			tempexpchargePo.setWorkarea(dataObject.getString(TempexpchargePo.COLUMNS.WORKAREA.name())); 
			return tempexpchargePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TempexpchargePo tempexpchargePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TempexpchargePo.COLUMNS.BAGNO.name(), tempexpchargePo.getBagno()); 
			dataObject.setValue(TempexpchargePo.COLUMNS.DECLNO.name(), tempexpchargePo.getDeclno()); 
			dataObject.setValue(TempexpchargePo.COLUMNS.MWB.name(), tempexpchargePo.getMwb()); 
			dataObject.setValue(TempexpchargePo.COLUMNS.HWB.name(), tempexpchargePo.getHwb()); 
			dataObject.setValue(TempexpchargePo.COLUMNS.PREVPIECE.name(), tempexpchargePo.getPrevpiece()); 
			dataObject.setValue(TempexpchargePo.COLUMNS.PREVFEE.name(), tempexpchargePo.getPrevfee()); 
			dataObject.setValue(TempexpchargePo.COLUMNS.PREVWEIGHT.name(), tempexpchargePo.getPrevweight()); 
			dataObject.setValue(TempexpchargePo.COLUMNS.DIFFPIECE.name(), tempexpchargePo.getDiffpiece()); 
			dataObject.setValue(TempexpchargePo.COLUMNS.DIFFFEE.name(), tempexpchargePo.getDifffee()); 
			dataObject.setValue(TempexpchargePo.COLUMNS.DIFFWEIGHT.name(), tempexpchargePo.getDiffweight()); 
			dataObject.setValue(TempexpchargePo.COLUMNS.EXPRESSID.name(), tempexpchargePo.getExpressid()); 
			dataObject.setValue(TempexpchargePo.COLUMNS.WAREHOUSE.name(), tempexpchargePo.getWarehouse()); 
			dataObject.setValue(TempexpchargePo.COLUMNS.CHARGEDATE.name(), tempexpchargePo.getChargedate()); 
			dataObject.setValue(TempexpchargePo.COLUMNS.EXTRAFEE.name(), tempexpchargePo.getExtrafee()); 
			dataObject.setValue(TempexpchargePo.COLUMNS.EXTRAFEEMARK.name(), tempexpchargePo.getExtrafeemark()); 
			dataObject.setValue(TempexpchargePo.COLUMNS.CREATEDATE.name(), tempexpchargePo.getCreatedate()); 
			dataObject.setValue(TempexpchargePo.COLUMNS.LASTCHARGEDATE.name(), tempexpchargePo.getLastchargedate()); 
			dataObject.setValue(TempexpchargePo.COLUMNS.IE.name(), tempexpchargePo.getIe()); 
			dataObject.setValue(TempexpchargePo.COLUMNS.WORKAREA.name(), tempexpchargePo.getWorkarea()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TempexpchargePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TempexpchargePo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
