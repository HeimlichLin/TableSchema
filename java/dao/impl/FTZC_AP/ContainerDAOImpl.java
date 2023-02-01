package com.doc.common.dao.impl; 
 
public class ContainerDAOImpl extends GeneralDAOImpl<ContainerPo> implements ContainerDAO { 
	public static final ContainerDAOImpl INSTANCE = new ContainerDAOImpl(); 
	public static final String TABLENAME = "CONTAINER"; 

	public ContainerDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ContainerPo> CONVERTER = new MapConverter<ContainerPo>() { 
 
		@Override 
		public ContainerPo convert(final DataObject dataObject) { 
			final ContainerPo containerPo = new ContainerPo(); 
			containerPo.setBfNo(dataObject.getString(ContainerPo.COLUMNS.BF_NO.name())); 
			containerPo.setPassNo(dataObject.getString(ContainerPo.COLUMNS.PASS_NO.name())); 
			containerPo.setPassDate(dataObject.getString(ContainerPo.COLUMNS.PASS_DATE.name())); 
			containerPo.setDeclNo(dataObject.getString(ContainerPo.COLUMNS.DECL_NO.name())); 
			containerPo.setContrNo(dataObject.getString(ContainerPo.COLUMNS.CONTR_NO.name())); 
			containerPo.setPcontrNo(dataObject.getString(ContainerPo.COLUMNS.PCONTR_NO.name())); 
			containerPo.setContrType(dataObject.getString(ContainerPo.COLUMNS.CONTR_TYPE.name())); 
			containerPo.setTransMode(dataObject.getString(ContainerPo.COLUMNS.TRANS_MODE.name())); 
			containerPo.setSealNo(dataObject.getString(ContainerPo.COLUMNS.SEAL_NO.name())); 
			containerPo.setShSealNo(dataObject.getString(ContainerPo.COLUMNS.SH_SEAL_NO.name())); 
			containerPo.setPlatNo(dataObject.getString(ContainerPo.COLUMNS.PLAT_NO.name())); 
			containerPo.setOutTime(TimestampUtils.of(dataObject.getValue(ContainerPo.COLUMNS.OUT_TIME.name()))); 
			containerPo.setInTime(TimestampUtils.of(dataObject.getValue(ContainerPo.COLUMNS.IN_TIME.name()))); 
			containerPo.setCarComp(dataObject.getString(ContainerPo.COLUMNS.CAR_COMP.name())); 
			containerPo.setCarNo(dataObject.getString(ContainerPo.COLUMNS.CAR_NO.name())); 
			containerPo.setDriver(dataObject.getString(ContainerPo.COLUMNS.DRIVER.name())); 
			containerPo.setDrvlNo(dataObject.getString(ContainerPo.COLUMNS.DRVL_NO.name())); 
			containerPo.setCnStatus(dataObject.getString(ContainerPo.COLUMNS.CN_STATUS.name())); 
			containerPo.setPackCode(dataObject.getString(ContainerPo.COLUMNS.PACK_CODE.name())); 
			containerPo.setDestPort(dataObject.getString(ContainerPo.COLUMNS.DEST_PORT.name())); 
			containerPo.setCntGross(BigDecimalUtils.formObj(dataObject.getValue(ContainerPo.COLUMNS.CNT_GROSS.name()))); 
			containerPo.setListNo(dataObject.getString(ContainerPo.COLUMNS.LIST_NO.name())); 
			containerPo.setMsgType(dataObject.getString(ContainerPo.COLUMNS.MSG_TYPE.name())); 
			return containerPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ContainerPo containerPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ContainerPo.COLUMNS.BF_NO.name(), containerPo.getBfNo()); 
			dataObject.setValue(ContainerPo.COLUMNS.PASS_NO.name(), containerPo.getPassNo()); 
			dataObject.setValue(ContainerPo.COLUMNS.PASS_DATE.name(), containerPo.getPassDate()); 
			dataObject.setValue(ContainerPo.COLUMNS.DECL_NO.name(), containerPo.getDeclNo()); 
			dataObject.setValue(ContainerPo.COLUMNS.CONTR_NO.name(), containerPo.getContrNo()); 
			dataObject.setValue(ContainerPo.COLUMNS.PCONTR_NO.name(), containerPo.getPcontrNo()); 
			dataObject.setValue(ContainerPo.COLUMNS.CONTR_TYPE.name(), containerPo.getContrType()); 
			dataObject.setValue(ContainerPo.COLUMNS.TRANS_MODE.name(), containerPo.getTransMode()); 
			dataObject.setValue(ContainerPo.COLUMNS.SEAL_NO.name(), containerPo.getSealNo()); 
			dataObject.setValue(ContainerPo.COLUMNS.SH_SEAL_NO.name(), containerPo.getShSealNo()); 
			dataObject.setValue(ContainerPo.COLUMNS.PLAT_NO.name(), containerPo.getPlatNo()); 
			dataObject.setValue(ContainerPo.COLUMNS.OUT_TIME.name(), containerPo.getOutTime()); 
			dataObject.setValue(ContainerPo.COLUMNS.IN_TIME.name(), containerPo.getInTime()); 
			dataObject.setValue(ContainerPo.COLUMNS.CAR_COMP.name(), containerPo.getCarComp()); 
			dataObject.setValue(ContainerPo.COLUMNS.CAR_NO.name(), containerPo.getCarNo()); 
			dataObject.setValue(ContainerPo.COLUMNS.DRIVER.name(), containerPo.getDriver()); 
			dataObject.setValue(ContainerPo.COLUMNS.DRVL_NO.name(), containerPo.getDrvlNo()); 
			dataObject.setValue(ContainerPo.COLUMNS.CN_STATUS.name(), containerPo.getCnStatus()); 
			dataObject.setValue(ContainerPo.COLUMNS.PACK_CODE.name(), containerPo.getPackCode()); 
			dataObject.setValue(ContainerPo.COLUMNS.DEST_PORT.name(), containerPo.getDestPort()); 
			dataObject.setValue(ContainerPo.COLUMNS.CNT_GROSS.name(), containerPo.getCntGross()); 
			dataObject.setValue(ContainerPo.COLUMNS.LIST_NO.name(), containerPo.getListNo()); 
			dataObject.setValue(ContainerPo.COLUMNS.MSG_TYPE.name(), containerPo.getMsgType()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ContainerPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ContainerPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
