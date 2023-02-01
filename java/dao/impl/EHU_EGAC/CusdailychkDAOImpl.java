package com.doc.common.dao.impl; 
 
public class CusdailychkDAOImpl extends GeneralDAOImpl<CusdailychkPo> implements CusdailychkDAO { 
	public static final CusdailychkDAOImpl INSTANCE = new CusdailychkDAOImpl(); 
	public static final String TABLENAME = "CUSDAILYCHK"; 

	public CusdailychkDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<CusdailychkPo> CONVERTER = new MapConverter<CusdailychkPo>() { 
 
		@Override 
		public CusdailychkPo convert(final DataObject dataObject) { 
			final CusdailychkPo cusdailychkPo = new CusdailychkPo(); 
			cusdailychkPo.setChkdate(TimestampUtils.of(dataObject.getValue(CusdailychkPo.COLUMNS.CHKDATE.name()))); 
			cusdailychkPo.setExpressid(dataObject.getString(CusdailychkPo.COLUMNS.EXPRESSID.name())); 
			cusdailychkPo.setAmg1c1(BigDecimalUtils.formObj(dataObject.getValue(CusdailychkPo.COLUMNS.AMG1C1.name()))); 
			cusdailychkPo.setAmg1c2(BigDecimalUtils.formObj(dataObject.getValue(CusdailychkPo.COLUMNS.AMG1C2.name()))); 
			cusdailychkPo.setAmg1c3(BigDecimalUtils.formObj(dataObject.getValue(CusdailychkPo.COLUMNS.AMG1C3.name()))); 
			cusdailychkPo.setAmg1totbag(BigDecimalUtils.formObj(dataObject.getValue(CusdailychkPo.COLUMNS.AMG1TOTBAG.name()))); 
			cusdailychkPo.setAmxc1bag(BigDecimalUtils.formObj(dataObject.getValue(CusdailychkPo.COLUMNS.AMXC1BAG.name()))); 
			cusdailychkPo.setAmxc3bag(BigDecimalUtils.formObj(dataObject.getValue(CusdailychkPo.COLUMNS.AMXC3BAG.name()))); 
			cusdailychkPo.setAmxc1cbag(BigDecimalUtils.formObj(dataObject.getValue(CusdailychkPo.COLUMNS.AMXC1CBAG.name()))); 
			cusdailychkPo.setAmtotalhwb(BigDecimalUtils.formObj(dataObject.getValue(CusdailychkPo.COLUMNS.AMTOTALHWB.name()))); 
			cusdailychkPo.setAmc3hwb(BigDecimalUtils.formObj(dataObject.getValue(CusdailychkPo.COLUMNS.AMC3HWB.name()))); 
			cusdailychkPo.setPmg1c1(BigDecimalUtils.formObj(dataObject.getValue(CusdailychkPo.COLUMNS.PMG1C1.name()))); 
			cusdailychkPo.setPmg1c2(BigDecimalUtils.formObj(dataObject.getValue(CusdailychkPo.COLUMNS.PMG1C2.name()))); 
			cusdailychkPo.setPmg1c3(BigDecimalUtils.formObj(dataObject.getValue(CusdailychkPo.COLUMNS.PMG1C3.name()))); 
			cusdailychkPo.setPmg1totbag(BigDecimalUtils.formObj(dataObject.getValue(CusdailychkPo.COLUMNS.PMG1TOTBAG.name()))); 
			cusdailychkPo.setPmxc1bag(BigDecimalUtils.formObj(dataObject.getValue(CusdailychkPo.COLUMNS.PMXC1BAG.name()))); 
			cusdailychkPo.setPmxc3bag(BigDecimalUtils.formObj(dataObject.getValue(CusdailychkPo.COLUMNS.PMXC3BAG.name()))); 
			cusdailychkPo.setPmxc1cbag(BigDecimalUtils.formObj(dataObject.getValue(CusdailychkPo.COLUMNS.PMXC1CBAG.name()))); 
			cusdailychkPo.setPmtotalhwb(BigDecimalUtils.formObj(dataObject.getValue(CusdailychkPo.COLUMNS.PMTOTALHWB.name()))); 
			cusdailychkPo.setPmc3hwb(BigDecimalUtils.formObj(dataObject.getValue(CusdailychkPo.COLUMNS.PMC3HWB.name()))); 
			return cusdailychkPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final CusdailychkPo cusdailychkPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(CusdailychkPo.COLUMNS.CHKDATE.name(), cusdailychkPo.getChkdate()); 
			dataObject.setValue(CusdailychkPo.COLUMNS.EXPRESSID.name(), cusdailychkPo.getExpressid()); 
			dataObject.setValue(CusdailychkPo.COLUMNS.AMG1C1.name(), cusdailychkPo.getAmg1c1()); 
			dataObject.setValue(CusdailychkPo.COLUMNS.AMG1C2.name(), cusdailychkPo.getAmg1c2()); 
			dataObject.setValue(CusdailychkPo.COLUMNS.AMG1C3.name(), cusdailychkPo.getAmg1c3()); 
			dataObject.setValue(CusdailychkPo.COLUMNS.AMG1TOTBAG.name(), cusdailychkPo.getAmg1totbag()); 
			dataObject.setValue(CusdailychkPo.COLUMNS.AMXC1BAG.name(), cusdailychkPo.getAmxc1bag()); 
			dataObject.setValue(CusdailychkPo.COLUMNS.AMXC3BAG.name(), cusdailychkPo.getAmxc3bag()); 
			dataObject.setValue(CusdailychkPo.COLUMNS.AMXC1CBAG.name(), cusdailychkPo.getAmxc1cbag()); 
			dataObject.setValue(CusdailychkPo.COLUMNS.AMTOTALHWB.name(), cusdailychkPo.getAmtotalhwb()); 
			dataObject.setValue(CusdailychkPo.COLUMNS.AMC3HWB.name(), cusdailychkPo.getAmc3hwb()); 
			dataObject.setValue(CusdailychkPo.COLUMNS.PMG1C1.name(), cusdailychkPo.getPmg1c1()); 
			dataObject.setValue(CusdailychkPo.COLUMNS.PMG1C2.name(), cusdailychkPo.getPmg1c2()); 
			dataObject.setValue(CusdailychkPo.COLUMNS.PMG1C3.name(), cusdailychkPo.getPmg1c3()); 
			dataObject.setValue(CusdailychkPo.COLUMNS.PMG1TOTBAG.name(), cusdailychkPo.getPmg1totbag()); 
			dataObject.setValue(CusdailychkPo.COLUMNS.PMXC1BAG.name(), cusdailychkPo.getPmxc1bag()); 
			dataObject.setValue(CusdailychkPo.COLUMNS.PMXC3BAG.name(), cusdailychkPo.getPmxc3bag()); 
			dataObject.setValue(CusdailychkPo.COLUMNS.PMXC1CBAG.name(), cusdailychkPo.getPmxc1cbag()); 
			dataObject.setValue(CusdailychkPo.COLUMNS.PMTOTALHWB.name(), cusdailychkPo.getPmtotalhwb()); 
			dataObject.setValue(CusdailychkPo.COLUMNS.PMC3HWB.name(), cusdailychkPo.getPmc3hwb()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<CusdailychkPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(CusdailychkPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
