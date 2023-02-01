package com.doc.common.dao.impl; 
 
public class EhuimpinvTempDAOImpl extends GeneralDAOImpl<EhuimpinvTempPo> implements EhuimpinvTempDAO { 
	public static final EhuimpinvTempDAOImpl INSTANCE = new EhuimpinvTempDAOImpl(); 
	public static final String TABLENAME = "EHUIMPINV_TEMP"; 

	public EhuimpinvTempDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<EhuimpinvTempPo> CONVERTER = new MapConverter<EhuimpinvTempPo>() { 
 
		@Override 
		public EhuimpinvTempPo convert(final DataObject dataObject) { 
			final EhuimpinvTempPo ehuimpinvTempPo = new EhuimpinvTempPo(); 
			ehuimpinvTempPo.setAbnNo(dataObject.getString(EhuimpinvTempPo.COLUMNS.ABN_NO.name())); 
			ehuimpinvTempPo.setExpbagno(dataObject.getString(EhuimpinvTempPo.COLUMNS.EXPBAGNO.name())); 
			ehuimpinvTempPo.setHoldarea(dataObject.getString(EhuimpinvTempPo.COLUMNS.HOLDAREA.name())); 
			ehuimpinvTempPo.setUldNo(dataObject.getString(EhuimpinvTempPo.COLUMNS.ULD_NO.name())); 
			ehuimpinvTempPo.setPicFrom(dataObject.getString(EhuimpinvTempPo.COLUMNS.PIC_FROM.name())); 
			ehuimpinvTempPo.setPicTo(dataObject.getString(EhuimpinvTempPo.COLUMNS.PIC_TO.name())); 
			ehuimpinvTempPo.setScanBy(dataObject.getString(EhuimpinvTempPo.COLUMNS.SCAN_BY.name())); 
			ehuimpinvTempPo.setScanTime(TimestampUtils.of(dataObject.getValue(EhuimpinvTempPo.COLUMNS.SCAN_TIME.name()))); 
			ehuimpinvTempPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(EhuimpinvTempPo.COLUMNS.WEIGHT.name()))); 
			ehuimpinvTempPo.setNote(dataObject.getString(EhuimpinvTempPo.COLUMNS.NOTE.name())); 
			return ehuimpinvTempPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final EhuimpinvTempPo ehuimpinvTempPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(EhuimpinvTempPo.COLUMNS.ABN_NO.name(), ehuimpinvTempPo.getAbnNo()); 
			dataObject.setValue(EhuimpinvTempPo.COLUMNS.EXPBAGNO.name(), ehuimpinvTempPo.getExpbagno()); 
			dataObject.setValue(EhuimpinvTempPo.COLUMNS.HOLDAREA.name(), ehuimpinvTempPo.getHoldarea()); 
			dataObject.setValue(EhuimpinvTempPo.COLUMNS.ULD_NO.name(), ehuimpinvTempPo.getUldNo()); 
			dataObject.setValue(EhuimpinvTempPo.COLUMNS.PIC_FROM.name(), ehuimpinvTempPo.getPicFrom()); 
			dataObject.setValue(EhuimpinvTempPo.COLUMNS.PIC_TO.name(), ehuimpinvTempPo.getPicTo()); 
			dataObject.setValue(EhuimpinvTempPo.COLUMNS.SCAN_BY.name(), ehuimpinvTempPo.getScanBy()); 
			dataObject.setValue(EhuimpinvTempPo.COLUMNS.SCAN_TIME.name(), ehuimpinvTempPo.getScanTime()); 
			dataObject.setValue(EhuimpinvTempPo.COLUMNS.WEIGHT.name(), ehuimpinvTempPo.getWeight()); 
			dataObject.setValue(EhuimpinvTempPo.COLUMNS.NOTE.name(), ehuimpinvTempPo.getNote()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<EhuimpinvTempPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(EhuimpinvTempPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(EhuimpinvTempPo.COLUMNS.ABN_NO.name(), po.getAbnNo()); 
		return sqlWhere; 
	} 
 
} 
