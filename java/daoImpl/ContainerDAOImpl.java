package com.doc.common.dao.impl; 
 
public class ContainerDAOImpl extends GeneralDAOImpl<ContainerDo> implements ContainerDAOImpl { 
	public static final ContainerDAOImpl INSTANCE = new ContainerDAOImpl(); 
	public static final String TABLENAME = "CONTAINER"; 

	public ContainerDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<ContainerDo> CONVERTER = new MapConverter<ContainerDo>() { 
 
		@Override 
		public ContainerDo convert(final DataObject dataObject) { 
			final ContainerDo containerDo = new ContainerDo(); 
			containerDo.setBondno(dataObject.getString(ContainerDo.COLUMNS.BONDNO.name())); 
			containerDo.setPassno(dataObject.getString(ContainerDo.COLUMNS.PASSNO.name())); 
			containerDo.setPassdate(dataObject.getString(ContainerDo.COLUMNS.PASSDATE.name())); 
			containerDo.setDeclno(dataObject.getString(ContainerDo.COLUMNS.DECLNO.name())); 
			containerDo.setContrno(dataObject.getString(ContainerDo.COLUMNS.CONTRNO.name())); 
			containerDo.setPcontrno(dataObject.getString(ContainerDo.COLUMNS.PCONTRNO.name())); 
			containerDo.setContrtype(dataObject.getString(ContainerDo.COLUMNS.CONTRTYPE.name())); 
			containerDo.setTransmode(dataObject.getString(ContainerDo.COLUMNS.TRANSMODE.name())); 
			containerDo.setSealno(dataObject.getString(ContainerDo.COLUMNS.SEALNO.name())); 
			containerDo.setShsealno(dataObject.getString(ContainerDo.COLUMNS.SHSEALNO.name())); 
			containerDo.setPlatno(dataObject.getString(ContainerDo.COLUMNS.PLATNO.name())); 
			containerDo.setOuttime(CommUtils.objConver2Time(dataObject.getString(ContainerDo.COLUMNS.OUTTIME.name()))); 
			containerDo.setIntime(CommUtils.objConver2Time(dataObject.getString(ContainerDo.COLUMNS.INTIME.name()))); 
			containerDo.setCarcomp(dataObject.getString(ContainerDo.COLUMNS.CARCOMP.name())); 
			containerDo.setCarno(dataObject.getString(ContainerDo.COLUMNS.CARNO.name())); 
			containerDo.setDriver(dataObject.getString(ContainerDo.COLUMNS.DRIVER.name())); 
			containerDo.setDrvlno(dataObject.getString(ContainerDo.COLUMNS.DRVLNO.name())); 
			containerDo.setCnstatus(dataObject.getString(ContainerDo.COLUMNS.CNSTATUS.name())); 
			containerDo.setPackcode(dataObject.getString(ContainerDo.COLUMNS.PACKCODE.name())); 
			containerDo.setDestport(dataObject.getString(ContainerDo.COLUMNS.DESTPORT.name())); 
			containerDo.setCntgross(BigDecimalUtils.formObj(dataObject.getString(ContainerDo.COLUMNS.CNTGROSS.name()))); 
			containerDo.setListno(dataObject.getString(ContainerDo.COLUMNS.LISTNO.name())); 
			containerDo.setMsgtype(dataObject.getString(ContainerDo.COLUMNS.MSGTYPE.name())); 
			return containerDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ContainerDo containerDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ContainerDo.COLUMNS.BONDNO.name(), containerDo.getBondno()); 
			dataObject.setValue(ContainerDo.COLUMNS.PASSNO.name(), containerDo.getPassno()); 
			dataObject.setValue(ContainerDo.COLUMNS.PASSDATE.name(), containerDo.getPassdate()); 
			dataObject.setValue(ContainerDo.COLUMNS.DECLNO.name(), containerDo.getDeclno()); 
			dataObject.setValue(ContainerDo.COLUMNS.CONTRNO.name(), containerDo.getContrno()); 
			dataObject.setValue(ContainerDo.COLUMNS.PCONTRNO.name(), containerDo.getPcontrno()); 
			dataObject.setValue(ContainerDo.COLUMNS.CONTRTYPE.name(), containerDo.getContrtype()); 
			dataObject.setValue(ContainerDo.COLUMNS.TRANSMODE.name(), containerDo.getTransmode()); 
			dataObject.setValue(ContainerDo.COLUMNS.SEALNO.name(), containerDo.getSealno()); 
			dataObject.setValue(ContainerDo.COLUMNS.SHSEALNO.name(), containerDo.getShsealno()); 
			dataObject.setValue(ContainerDo.COLUMNS.PLATNO.name(), containerDo.getPlatno()); 
			dataObject.setValue(ContainerDo.COLUMNS.OUTTIME.name(), containerDo.getOuttime()); 
			dataObject.setValue(ContainerDo.COLUMNS.INTIME.name(), containerDo.getIntime()); 
			dataObject.setValue(ContainerDo.COLUMNS.CARCOMP.name(), containerDo.getCarcomp()); 
			dataObject.setValue(ContainerDo.COLUMNS.CARNO.name(), containerDo.getCarno()); 
			dataObject.setValue(ContainerDo.COLUMNS.DRIVER.name(), containerDo.getDriver()); 
			dataObject.setValue(ContainerDo.COLUMNS.DRVLNO.name(), containerDo.getDrvlno()); 
			dataObject.setValue(ContainerDo.COLUMNS.CNSTATUS.name(), containerDo.getCnstatus()); 
			dataObject.setValue(ContainerDo.COLUMNS.PACKCODE.name(), containerDo.getPackcode()); 
			dataObject.setValue(ContainerDo.COLUMNS.DESTPORT.name(), containerDo.getDestport()); 
			dataObject.setValue(ContainerDo.COLUMNS.CNTGROSS.name(), containerDo.getCntgross()); 
			dataObject.setValue(ContainerDo.COLUMNS.LISTNO.name(), containerDo.getListno()); 
			dataObject.setValue(ContainerDo.COLUMNS.MSGTYPE.name(), containerDo.getMsgtype()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ContainerDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ContainerDo po) { 
		sqlWhere.add(ContainerDo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(ContainerDo.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(ContainerDo.COLUMNS.CONTRNO.name(), po.getContrno()); 
	} 
 
} 
