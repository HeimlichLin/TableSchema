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
			containerPo.setBondno(dataObject.getString(ContainerPo.COLUMNS.BONDNO.name())); 
			containerPo.setPassno(dataObject.getString(ContainerPo.COLUMNS.PASSNO.name())); 
			containerPo.setPassdate(dataObject.getString(ContainerPo.COLUMNS.PASSDATE.name())); 
			containerPo.setDeclno(dataObject.getString(ContainerPo.COLUMNS.DECLNO.name())); 
			containerPo.setContrno(dataObject.getString(ContainerPo.COLUMNS.CONTRNO.name())); 
			containerPo.setPcontrno(dataObject.getString(ContainerPo.COLUMNS.PCONTRNO.name())); 
			containerPo.setContrtype(dataObject.getString(ContainerPo.COLUMNS.CONTRTYPE.name())); 
			containerPo.setTransmode(dataObject.getString(ContainerPo.COLUMNS.TRANSMODE.name())); 
			containerPo.setSealno(dataObject.getString(ContainerPo.COLUMNS.SEALNO.name())); 
			containerPo.setShsealno(dataObject.getString(ContainerPo.COLUMNS.SHSEALNO.name())); 
			containerPo.setPlatno(dataObject.getString(ContainerPo.COLUMNS.PLATNO.name())); 
			containerPo.setOuttime(TimestampUtils.of(dataObject.getValue(ContainerPo.COLUMNS.OUTTIME.name()))); 
			containerPo.setIntime(TimestampUtils.of(dataObject.getValue(ContainerPo.COLUMNS.INTIME.name()))); 
			containerPo.setCarcomp(dataObject.getString(ContainerPo.COLUMNS.CARCOMP.name())); 
			containerPo.setCarno(dataObject.getString(ContainerPo.COLUMNS.CARNO.name())); 
			containerPo.setDriver(dataObject.getString(ContainerPo.COLUMNS.DRIVER.name())); 
			containerPo.setDrvlno(dataObject.getString(ContainerPo.COLUMNS.DRVLNO.name())); 
			containerPo.setCnstatus(dataObject.getString(ContainerPo.COLUMNS.CNSTATUS.name())); 
			containerPo.setPackcode(dataObject.getString(ContainerPo.COLUMNS.PACKCODE.name())); 
			containerPo.setDestport(dataObject.getString(ContainerPo.COLUMNS.DESTPORT.name())); 
			containerPo.setCntgross(BigDecimalUtils.formObj(dataObject.getValue(ContainerPo.COLUMNS.CNTGROSS.name()))); 
			containerPo.setListno(dataObject.getString(ContainerPo.COLUMNS.LISTNO.name())); 
			containerPo.setMsgtype(dataObject.getString(ContainerPo.COLUMNS.MSGTYPE.name())); 
			return containerPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ContainerPo containerPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ContainerPo.COLUMNS.BONDNO.name(), containerPo.getBondno()); 
			dataObject.setValue(ContainerPo.COLUMNS.PASSNO.name(), containerPo.getPassno()); 
			dataObject.setValue(ContainerPo.COLUMNS.PASSDATE.name(), containerPo.getPassdate()); 
			dataObject.setValue(ContainerPo.COLUMNS.DECLNO.name(), containerPo.getDeclno()); 
			dataObject.setValue(ContainerPo.COLUMNS.CONTRNO.name(), containerPo.getContrno()); 
			dataObject.setValue(ContainerPo.COLUMNS.PCONTRNO.name(), containerPo.getPcontrno()); 
			dataObject.setValue(ContainerPo.COLUMNS.CONTRTYPE.name(), containerPo.getContrtype()); 
			dataObject.setValue(ContainerPo.COLUMNS.TRANSMODE.name(), containerPo.getTransmode()); 
			dataObject.setValue(ContainerPo.COLUMNS.SEALNO.name(), containerPo.getSealno()); 
			dataObject.setValue(ContainerPo.COLUMNS.SHSEALNO.name(), containerPo.getShsealno()); 
			dataObject.setValue(ContainerPo.COLUMNS.PLATNO.name(), containerPo.getPlatno()); 
			dataObject.setValue(ContainerPo.COLUMNS.OUTTIME.name(), containerPo.getOuttime()); 
			dataObject.setValue(ContainerPo.COLUMNS.INTIME.name(), containerPo.getIntime()); 
			dataObject.setValue(ContainerPo.COLUMNS.CARCOMP.name(), containerPo.getCarcomp()); 
			dataObject.setValue(ContainerPo.COLUMNS.CARNO.name(), containerPo.getCarno()); 
			dataObject.setValue(ContainerPo.COLUMNS.DRIVER.name(), containerPo.getDriver()); 
			dataObject.setValue(ContainerPo.COLUMNS.DRVLNO.name(), containerPo.getDrvlno()); 
			dataObject.setValue(ContainerPo.COLUMNS.CNSTATUS.name(), containerPo.getCnstatus()); 
			dataObject.setValue(ContainerPo.COLUMNS.PACKCODE.name(), containerPo.getPackcode()); 
			dataObject.setValue(ContainerPo.COLUMNS.DESTPORT.name(), containerPo.getDestport()); 
			dataObject.setValue(ContainerPo.COLUMNS.CNTGROSS.name(), containerPo.getCntgross()); 
			dataObject.setValue(ContainerPo.COLUMNS.LISTNO.name(), containerPo.getListno()); 
			dataObject.setValue(ContainerPo.COLUMNS.MSGTYPE.name(), containerPo.getMsgtype()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ContainerPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ContainerPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(ContainerPo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(ContainerPo.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(ContainerPo.COLUMNS.CONTRNO.name(), po.getContrno()); 
		return sqlWhere; 
	} 
 
} 
