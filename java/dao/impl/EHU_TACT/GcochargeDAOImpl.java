package com.doc.common.dao.impl; 
 
public class GcochargeDAOImpl extends GeneralDAOImpl<GcochargePo> implements GcochargeDAO { 
	public static final GcochargeDAOImpl INSTANCE = new GcochargeDAOImpl(); 
	public static final String TABLENAME = "GCOCHARGE"; 

	public GcochargeDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<GcochargePo> CONVERTER = new MapConverter<GcochargePo>() { 
 
		@Override 
		public GcochargePo convert(final DataObject dataObject) { 
			final GcochargePo gcochargePo = new GcochargePo(); 
			gcochargePo.setBagno(dataObject.getString(GcochargePo.COLUMNS.BAGNO.name())); 
			gcochargePo.setDeclno(dataObject.getString(GcochargePo.COLUMNS.DECLNO.name())); 
			gcochargePo.setMwb(dataObject.getString(GcochargePo.COLUMNS.MWB.name())); 
			gcochargePo.setHwb(dataObject.getString(GcochargePo.COLUMNS.HWB.name())); 
			gcochargePo.setPrevpiece(BigDecimalUtils.formObj(dataObject.getValue(GcochargePo.COLUMNS.PREVPIECE.name()))); 
			gcochargePo.setPrevfee(BigDecimalUtils.formObj(dataObject.getValue(GcochargePo.COLUMNS.PREVFEE.name()))); 
			gcochargePo.setPrevweight(BigDecimalUtils.formObj(dataObject.getValue(GcochargePo.COLUMNS.PREVWEIGHT.name()))); 
			gcochargePo.setDiffpiece(BigDecimalUtils.formObj(dataObject.getValue(GcochargePo.COLUMNS.DIFFPIECE.name()))); 
			gcochargePo.setDifffee(BigDecimalUtils.formObj(dataObject.getValue(GcochargePo.COLUMNS.DIFFFEE.name()))); 
			gcochargePo.setDiffweight(BigDecimalUtils.formObj(dataObject.getValue(GcochargePo.COLUMNS.DIFFWEIGHT.name()))); 
			gcochargePo.setExpressid(dataObject.getString(GcochargePo.COLUMNS.EXPRESSID.name())); 
			gcochargePo.setWarehouse(dataObject.getString(GcochargePo.COLUMNS.WAREHOUSE.name())); 
			gcochargePo.setChargedate(TimestampUtils.of(dataObject.getValue(GcochargePo.COLUMNS.CHARGEDATE.name()))); 
			gcochargePo.setExtrafee(BigDecimalUtils.formObj(dataObject.getValue(GcochargePo.COLUMNS.EXTRAFEE.name()))); 
			gcochargePo.setExtrafeemark(dataObject.getString(GcochargePo.COLUMNS.EXTRAFEEMARK.name())); 
			gcochargePo.setCreatedate(TimestampUtils.of(dataObject.getValue(GcochargePo.COLUMNS.CREATEDATE.name()))); 
			gcochargePo.setLastchargedate(TimestampUtils.of(dataObject.getValue(GcochargePo.COLUMNS.LASTCHARGEDATE.name()))); 
			gcochargePo.setIe(dataObject.getString(GcochargePo.COLUMNS.IE.name())); 
			gcochargePo.setWorkarea(dataObject.getString(GcochargePo.COLUMNS.WORKAREA.name())); 
			return gcochargePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final GcochargePo gcochargePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(GcochargePo.COLUMNS.BAGNO.name(), gcochargePo.getBagno()); 
			dataObject.setValue(GcochargePo.COLUMNS.DECLNO.name(), gcochargePo.getDeclno()); 
			dataObject.setValue(GcochargePo.COLUMNS.MWB.name(), gcochargePo.getMwb()); 
			dataObject.setValue(GcochargePo.COLUMNS.HWB.name(), gcochargePo.getHwb()); 
			dataObject.setValue(GcochargePo.COLUMNS.PREVPIECE.name(), gcochargePo.getPrevpiece()); 
			dataObject.setValue(GcochargePo.COLUMNS.PREVFEE.name(), gcochargePo.getPrevfee()); 
			dataObject.setValue(GcochargePo.COLUMNS.PREVWEIGHT.name(), gcochargePo.getPrevweight()); 
			dataObject.setValue(GcochargePo.COLUMNS.DIFFPIECE.name(), gcochargePo.getDiffpiece()); 
			dataObject.setValue(GcochargePo.COLUMNS.DIFFFEE.name(), gcochargePo.getDifffee()); 
			dataObject.setValue(GcochargePo.COLUMNS.DIFFWEIGHT.name(), gcochargePo.getDiffweight()); 
			dataObject.setValue(GcochargePo.COLUMNS.EXPRESSID.name(), gcochargePo.getExpressid()); 
			dataObject.setValue(GcochargePo.COLUMNS.WAREHOUSE.name(), gcochargePo.getWarehouse()); 
			dataObject.setValue(GcochargePo.COLUMNS.CHARGEDATE.name(), gcochargePo.getChargedate()); 
			dataObject.setValue(GcochargePo.COLUMNS.EXTRAFEE.name(), gcochargePo.getExtrafee()); 
			dataObject.setValue(GcochargePo.COLUMNS.EXTRAFEEMARK.name(), gcochargePo.getExtrafeemark()); 
			dataObject.setValue(GcochargePo.COLUMNS.CREATEDATE.name(), gcochargePo.getCreatedate()); 
			dataObject.setValue(GcochargePo.COLUMNS.LASTCHARGEDATE.name(), gcochargePo.getLastchargedate()); 
			dataObject.setValue(GcochargePo.COLUMNS.IE.name(), gcochargePo.getIe()); 
			dataObject.setValue(GcochargePo.COLUMNS.WORKAREA.name(), gcochargePo.getWorkarea()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<GcochargePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(GcochargePo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
