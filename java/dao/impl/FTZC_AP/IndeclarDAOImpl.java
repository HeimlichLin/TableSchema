package com.doc.common.dao.impl; 
 
public class IndeclarDAOImpl extends GeneralDAOImpl<IndeclarPo> implements IndeclarDAO { 
	public static final IndeclarDAOImpl INSTANCE = new IndeclarDAOImpl(); 
	public static final String TABLENAME = "INDECLAR"; 

	public IndeclarDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<IndeclarPo> CONVERTER = new MapConverter<IndeclarPo>() { 
 
		@Override 
		public IndeclarPo convert(final DataObject dataObject) { 
			final IndeclarPo indeclarPo = new IndeclarPo(); 
			indeclarPo.setMsgFun(dataObject.getString(IndeclarPo.COLUMNS.MSG_FUN.name())); 
			indeclarPo.setBfNo(dataObject.getString(IndeclarPo.COLUMNS.BF_NO.name())); 
			indeclarPo.setDeclType(dataObject.getString(IndeclarPo.COLUMNS.DECL_TYPE.name())); 
			indeclarPo.setIoType(dataObject.getString(IndeclarPo.COLUMNS.IO_TYPE.name())); 
			indeclarPo.setDocNo(dataObject.getString(IndeclarPo.COLUMNS.DOC_NO.name())); 
			indeclarPo.setItemNo(BigDecimalUtils.formObj(dataObject.getValue(IndeclarPo.COLUMNS.ITEM_NO.name()))); 
			indeclarPo.setPrdtNo(dataObject.getString(IndeclarPo.COLUMNS.PRDT_NO.name())); 
			indeclarPo.setDescrip(dataObject.getString(IndeclarPo.COLUMNS.DESCRIP.name())); 
			indeclarPo.setQty(BigDecimalUtils.formObj(dataObject.getValue(IndeclarPo.COLUMNS.QTY.name()))); 
			indeclarPo.setUnitPrice(BigDecimalUtils.formObj(dataObject.getValue(IndeclarPo.COLUMNS.UNIT_PRICE.name()))); 
			indeclarPo.setValueAmt(BigDecimalUtils.formObj(dataObject.getValue(IndeclarPo.COLUMNS.VALUE_AMT.name()))); 
			indeclarPo.setNetWgt(BigDecimalUtils.formObj(dataObject.getValue(IndeclarPo.COLUMNS.NET_WGT.name()))); 
			indeclarPo.setNetWgtUnit(dataObject.getString(IndeclarPo.COLUMNS.NET_WGT_UNIT.name())); 
			indeclarPo.setGWgt(BigDecimalUtils.formObj(dataObject.getValue(IndeclarPo.COLUMNS.G_WGT.name()))); 
			indeclarPo.setGWgtUnit(dataObject.getString(IndeclarPo.COLUMNS.G_WGT_UNIT.name())); 
			indeclarPo.setDutyType(dataObject.getString(IndeclarPo.COLUMNS.DUTY_TYPE.name())); 
			indeclarPo.setStatMode(dataObject.getString(IndeclarPo.COLUMNS.STAT_MODE.name())); 
			indeclarPo.setStatus(dataObject.getString(IndeclarPo.COLUMNS.STATUS.name())); 
			indeclarPo.setControlNo(dataObject.getString(IndeclarPo.COLUMNS.CONTROL_NO.name())); 
			indeclarPo.setUpdTime(dataObject.getString(IndeclarPo.COLUMNS.UPD_TIME.name())); 
			indeclarPo.setCtmCode(dataObject.getString(IndeclarPo.COLUMNS.CTM_CODE.name())); 
			indeclarPo.setUnit(dataObject.getString(IndeclarPo.COLUMNS.UNIT.name())); 
			indeclarPo.setCur(dataObject.getString(IndeclarPo.COLUMNS.CUR.name())); 
			indeclarPo.setTotWgt(BigDecimalUtils.formObj(dataObject.getValue(IndeclarPo.COLUMNS.TOT_WGT.name()))); 
			indeclarPo.setTotWgtUnit(dataObject.getString(IndeclarPo.COLUMNS.TOT_WGT_UNIT.name())); 
			indeclarPo.setCccCode(dataObject.getString(IndeclarPo.COLUMNS.CCC_CODE.name())); 
			indeclarPo.setDeclNo(dataObject.getString(IndeclarPo.COLUMNS.DECL_NO.name())); 
			indeclarPo.setMsgTrun(dataObject.getString(IndeclarPo.COLUMNS.MSG_TRUN.name())); 
			indeclarPo.setDeclDate(dataObject.getString(IndeclarPo.COLUMNS.DECL_DATE.name())); 
			indeclarPo.setBomDate(dataObject.getString(IndeclarPo.COLUMNS.BOM_DATE.name())); 
			indeclarPo.setODeclNo(dataObject.getString(IndeclarPo.COLUMNS.O_DECL_NO.name())); 
			return indeclarPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final IndeclarPo indeclarPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(IndeclarPo.COLUMNS.MSG_FUN.name(), indeclarPo.getMsgFun()); 
			dataObject.setValue(IndeclarPo.COLUMNS.BF_NO.name(), indeclarPo.getBfNo()); 
			dataObject.setValue(IndeclarPo.COLUMNS.DECL_TYPE.name(), indeclarPo.getDeclType()); 
			dataObject.setValue(IndeclarPo.COLUMNS.IO_TYPE.name(), indeclarPo.getIoType()); 
			dataObject.setValue(IndeclarPo.COLUMNS.DOC_NO.name(), indeclarPo.getDocNo()); 
			dataObject.setValue(IndeclarPo.COLUMNS.ITEM_NO.name(), indeclarPo.getItemNo()); 
			dataObject.setValue(IndeclarPo.COLUMNS.PRDT_NO.name(), indeclarPo.getPrdtNo()); 
			dataObject.setValue(IndeclarPo.COLUMNS.DESCRIP.name(), indeclarPo.getDescrip()); 
			dataObject.setValue(IndeclarPo.COLUMNS.QTY.name(), indeclarPo.getQty()); 
			dataObject.setValue(IndeclarPo.COLUMNS.UNIT_PRICE.name(), indeclarPo.getUnitPrice()); 
			dataObject.setValue(IndeclarPo.COLUMNS.VALUE_AMT.name(), indeclarPo.getValueAmt()); 
			dataObject.setValue(IndeclarPo.COLUMNS.NET_WGT.name(), indeclarPo.getNetWgt()); 
			dataObject.setValue(IndeclarPo.COLUMNS.NET_WGT_UNIT.name(), indeclarPo.getNetWgtUnit()); 
			dataObject.setValue(IndeclarPo.COLUMNS.G_WGT.name(), indeclarPo.getGWgt()); 
			dataObject.setValue(IndeclarPo.COLUMNS.G_WGT_UNIT.name(), indeclarPo.getGWgtUnit()); 
			dataObject.setValue(IndeclarPo.COLUMNS.DUTY_TYPE.name(), indeclarPo.getDutyType()); 
			dataObject.setValue(IndeclarPo.COLUMNS.STAT_MODE.name(), indeclarPo.getStatMode()); 
			dataObject.setValue(IndeclarPo.COLUMNS.STATUS.name(), indeclarPo.getStatus()); 
			dataObject.setValue(IndeclarPo.COLUMNS.CONTROL_NO.name(), indeclarPo.getControlNo()); 
			dataObject.setValue(IndeclarPo.COLUMNS.UPD_TIME.name(), indeclarPo.getUpdTime()); 
			dataObject.setValue(IndeclarPo.COLUMNS.CTM_CODE.name(), indeclarPo.getCtmCode()); 
			dataObject.setValue(IndeclarPo.COLUMNS.UNIT.name(), indeclarPo.getUnit()); 
			dataObject.setValue(IndeclarPo.COLUMNS.CUR.name(), indeclarPo.getCur()); 
			dataObject.setValue(IndeclarPo.COLUMNS.TOT_WGT.name(), indeclarPo.getTotWgt()); 
			dataObject.setValue(IndeclarPo.COLUMNS.TOT_WGT_UNIT.name(), indeclarPo.getTotWgtUnit()); 
			dataObject.setValue(IndeclarPo.COLUMNS.CCC_CODE.name(), indeclarPo.getCccCode()); 
			dataObject.setValue(IndeclarPo.COLUMNS.DECL_NO.name(), indeclarPo.getDeclNo()); 
			dataObject.setValue(IndeclarPo.COLUMNS.MSG_TRUN.name(), indeclarPo.getMsgTrun()); 
			dataObject.setValue(IndeclarPo.COLUMNS.DECL_DATE.name(), indeclarPo.getDeclDate()); 
			dataObject.setValue(IndeclarPo.COLUMNS.BOM_DATE.name(), indeclarPo.getBomDate()); 
			dataObject.setValue(IndeclarPo.COLUMNS.O_DECL_NO.name(), indeclarPo.getODeclNo()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<IndeclarPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(IndeclarPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
