package com.doc.common.dao.impl; 
 
public class ErrexpchargeDAOImpl extends GeneralDAOImpl<ErrexpchargePo> implements ErrexpchargeDAO { 
	public static final ErrexpchargeDAOImpl INSTANCE = new ErrexpchargeDAOImpl(); 
	public static final String TABLENAME = "ERREXPCHARGE"; 

	public ErrexpchargeDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ErrexpchargePo> CONVERTER = new MapConverter<ErrexpchargePo>() { 
 
		@Override 
		public ErrexpchargePo convert(final DataObject dataObject) { 
			final ErrexpchargePo errexpchargePo = new ErrexpchargePo(); 
			errexpchargePo.setBagno(dataObject.getString(ErrexpchargePo.COLUMNS.BAGNO.name())); 
			errexpchargePo.setDeclno(dataObject.getString(ErrexpchargePo.COLUMNS.DECLNO.name())); 
			errexpchargePo.setMwb(dataObject.getString(ErrexpchargePo.COLUMNS.MWB.name())); 
			errexpchargePo.setHwb(dataObject.getString(ErrexpchargePo.COLUMNS.HWB.name())); 
			errexpchargePo.setPrevpiece(BigDecimalUtils.formObj(dataObject.getValue(ErrexpchargePo.COLUMNS.PREVPIECE.name()))); 
			errexpchargePo.setPrevfee(BigDecimalUtils.formObj(dataObject.getValue(ErrexpchargePo.COLUMNS.PREVFEE.name()))); 
			errexpchargePo.setPrevweight(BigDecimalUtils.formObj(dataObject.getValue(ErrexpchargePo.COLUMNS.PREVWEIGHT.name()))); 
			errexpchargePo.setDiffpiece(BigDecimalUtils.formObj(dataObject.getValue(ErrexpchargePo.COLUMNS.DIFFPIECE.name()))); 
			errexpchargePo.setDifffee(BigDecimalUtils.formObj(dataObject.getValue(ErrexpchargePo.COLUMNS.DIFFFEE.name()))); 
			errexpchargePo.setDiffweight(BigDecimalUtils.formObj(dataObject.getValue(ErrexpchargePo.COLUMNS.DIFFWEIGHT.name()))); 
			errexpchargePo.setExpressid(dataObject.getString(ErrexpchargePo.COLUMNS.EXPRESSID.name())); 
			errexpchargePo.setWarehouse(dataObject.getString(ErrexpchargePo.COLUMNS.WAREHOUSE.name())); 
			errexpchargePo.setChargedate(TimestampUtils.of(dataObject.getValue(ErrexpchargePo.COLUMNS.CHARGEDATE.name()))); 
			errexpchargePo.setExtrafee(BigDecimalUtils.formObj(dataObject.getValue(ErrexpchargePo.COLUMNS.EXTRAFEE.name()))); 
			errexpchargePo.setExtrafeemark(dataObject.getString(ErrexpchargePo.COLUMNS.EXTRAFEEMARK.name())); 
			errexpchargePo.setCreatedate(TimestampUtils.of(dataObject.getValue(ErrexpchargePo.COLUMNS.CREATEDATE.name()))); 
			errexpchargePo.setLastchargedate(TimestampUtils.of(dataObject.getValue(ErrexpchargePo.COLUMNS.LASTCHARGEDATE.name()))); 
			errexpchargePo.setIe(dataObject.getString(ErrexpchargePo.COLUMNS.IE.name())); 
			return errexpchargePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ErrexpchargePo errexpchargePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ErrexpchargePo.COLUMNS.BAGNO.name(), errexpchargePo.getBagno()); 
			dataObject.setValue(ErrexpchargePo.COLUMNS.DECLNO.name(), errexpchargePo.getDeclno()); 
			dataObject.setValue(ErrexpchargePo.COLUMNS.MWB.name(), errexpchargePo.getMwb()); 
			dataObject.setValue(ErrexpchargePo.COLUMNS.HWB.name(), errexpchargePo.getHwb()); 
			dataObject.setValue(ErrexpchargePo.COLUMNS.PREVPIECE.name(), errexpchargePo.getPrevpiece()); 
			dataObject.setValue(ErrexpchargePo.COLUMNS.PREVFEE.name(), errexpchargePo.getPrevfee()); 
			dataObject.setValue(ErrexpchargePo.COLUMNS.PREVWEIGHT.name(), errexpchargePo.getPrevweight()); 
			dataObject.setValue(ErrexpchargePo.COLUMNS.DIFFPIECE.name(), errexpchargePo.getDiffpiece()); 
			dataObject.setValue(ErrexpchargePo.COLUMNS.DIFFFEE.name(), errexpchargePo.getDifffee()); 
			dataObject.setValue(ErrexpchargePo.COLUMNS.DIFFWEIGHT.name(), errexpchargePo.getDiffweight()); 
			dataObject.setValue(ErrexpchargePo.COLUMNS.EXPRESSID.name(), errexpchargePo.getExpressid()); 
			dataObject.setValue(ErrexpchargePo.COLUMNS.WAREHOUSE.name(), errexpchargePo.getWarehouse()); 
			dataObject.setValue(ErrexpchargePo.COLUMNS.CHARGEDATE.name(), errexpchargePo.getChargedate()); 
			dataObject.setValue(ErrexpchargePo.COLUMNS.EXTRAFEE.name(), errexpchargePo.getExtrafee()); 
			dataObject.setValue(ErrexpchargePo.COLUMNS.EXTRAFEEMARK.name(), errexpchargePo.getExtrafeemark()); 
			dataObject.setValue(ErrexpchargePo.COLUMNS.CREATEDATE.name(), errexpchargePo.getCreatedate()); 
			dataObject.setValue(ErrexpchargePo.COLUMNS.LASTCHARGEDATE.name(), errexpchargePo.getLastchargedate()); 
			dataObject.setValue(ErrexpchargePo.COLUMNS.IE.name(), errexpchargePo.getIe()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ErrexpchargePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ErrexpchargePo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
