package com.doc.common.dao.impl; 
 
public class HContainerDAOImpl extends GeneralDAOImpl<HContainerDo> implements HContainerDAOImpl { 
	public static final HContainerDAOImpl INSTANCE = new HContainerDAOImpl(); 
	public static final String TABLENAME = "H_CONTAINER"; 

	public HContainerDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<HContainerDo> CONVERTER = new MapConverter<HContainerDo>() { 
 
		@Override 
		public HContainerDo convert(final DataObject dataObject) { 
			final HContainerDo hContainerDo = new HContainerDo(); 
			hContainerDo.setBondno(dataObject.getString(HContainerDo.COLUMNS.BONDNO.name())); 
			hContainerDo.setPassno(dataObject.getString(HContainerDo.COLUMNS.PASSNO.name())); 
			hContainerDo.setPassdate(dataObject.getString(HContainerDo.COLUMNS.PASSDATE.name())); 
			hContainerDo.setDeclno(dataObject.getString(HContainerDo.COLUMNS.DECLNO.name())); 
			hContainerDo.setContrno(dataObject.getString(HContainerDo.COLUMNS.CONTRNO.name())); 
			hContainerDo.setPcontrno(dataObject.getString(HContainerDo.COLUMNS.PCONTRNO.name())); 
			hContainerDo.setContrtype(dataObject.getString(HContainerDo.COLUMNS.CONTRTYPE.name())); 
			hContainerDo.setTransmode(dataObject.getString(HContainerDo.COLUMNS.TRANSMODE.name())); 
			hContainerDo.setSealno(dataObject.getString(HContainerDo.COLUMNS.SEALNO.name())); 
			hContainerDo.setShsealno(dataObject.getString(HContainerDo.COLUMNS.SHSEALNO.name())); 
			hContainerDo.setPlatno(dataObject.getString(HContainerDo.COLUMNS.PLATNO.name())); 
			hContainerDo.setOuttime(CommUtils.objConver2Time(dataObject.getString(HContainerDo.COLUMNS.OUTTIME.name()))); 
			hContainerDo.setIntime(CommUtils.objConver2Time(dataObject.getString(HContainerDo.COLUMNS.INTIME.name()))); 
			hContainerDo.setCarcomp(dataObject.getString(HContainerDo.COLUMNS.CARCOMP.name())); 
			hContainerDo.setCarno(dataObject.getString(HContainerDo.COLUMNS.CARNO.name())); 
			hContainerDo.setDriver(dataObject.getString(HContainerDo.COLUMNS.DRIVER.name())); 
			hContainerDo.setDrvlno(dataObject.getString(HContainerDo.COLUMNS.DRVLNO.name())); 
			hContainerDo.setCnstatus(dataObject.getString(HContainerDo.COLUMNS.CNSTATUS.name())); 
			hContainerDo.setPackcode(dataObject.getString(HContainerDo.COLUMNS.PACKCODE.name())); 
			hContainerDo.setDestport(dataObject.getString(HContainerDo.COLUMNS.DESTPORT.name())); 
			hContainerDo.setCntgross(BigDecimalUtils.formObj(dataObject.getString(HContainerDo.COLUMNS.CNTGROSS.name()))); 
			hContainerDo.setListno(dataObject.getString(HContainerDo.COLUMNS.LISTNO.name())); 
			hContainerDo.setUpdtime(dataObject.getString(HContainerDo.COLUMNS.UPDTIME.name())); 
			hContainerDo.setMsgtype(dataObject.getString(HContainerDo.COLUMNS.MSGTYPE.name())); 
			return hContainerDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final HContainerDo hContainerDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(HContainerDo.COLUMNS.BONDNO.name(), hContainerDo.getBondno()); 
			dataObject.setValue(HContainerDo.COLUMNS.PASSNO.name(), hContainerDo.getPassno()); 
			dataObject.setValue(HContainerDo.COLUMNS.PASSDATE.name(), hContainerDo.getPassdate()); 
			dataObject.setValue(HContainerDo.COLUMNS.DECLNO.name(), hContainerDo.getDeclno()); 
			dataObject.setValue(HContainerDo.COLUMNS.CONTRNO.name(), hContainerDo.getContrno()); 
			dataObject.setValue(HContainerDo.COLUMNS.PCONTRNO.name(), hContainerDo.getPcontrno()); 
			dataObject.setValue(HContainerDo.COLUMNS.CONTRTYPE.name(), hContainerDo.getContrtype()); 
			dataObject.setValue(HContainerDo.COLUMNS.TRANSMODE.name(), hContainerDo.getTransmode()); 
			dataObject.setValue(HContainerDo.COLUMNS.SEALNO.name(), hContainerDo.getSealno()); 
			dataObject.setValue(HContainerDo.COLUMNS.SHSEALNO.name(), hContainerDo.getShsealno()); 
			dataObject.setValue(HContainerDo.COLUMNS.PLATNO.name(), hContainerDo.getPlatno()); 
			dataObject.setValue(HContainerDo.COLUMNS.OUTTIME.name(), hContainerDo.getOuttime()); 
			dataObject.setValue(HContainerDo.COLUMNS.INTIME.name(), hContainerDo.getIntime()); 
			dataObject.setValue(HContainerDo.COLUMNS.CARCOMP.name(), hContainerDo.getCarcomp()); 
			dataObject.setValue(HContainerDo.COLUMNS.CARNO.name(), hContainerDo.getCarno()); 
			dataObject.setValue(HContainerDo.COLUMNS.DRIVER.name(), hContainerDo.getDriver()); 
			dataObject.setValue(HContainerDo.COLUMNS.DRVLNO.name(), hContainerDo.getDrvlno()); 
			dataObject.setValue(HContainerDo.COLUMNS.CNSTATUS.name(), hContainerDo.getCnstatus()); 
			dataObject.setValue(HContainerDo.COLUMNS.PACKCODE.name(), hContainerDo.getPackcode()); 
			dataObject.setValue(HContainerDo.COLUMNS.DESTPORT.name(), hContainerDo.getDestport()); 
			dataObject.setValue(HContainerDo.COLUMNS.CNTGROSS.name(), hContainerDo.getCntgross()); 
			dataObject.setValue(HContainerDo.COLUMNS.LISTNO.name(), hContainerDo.getListno()); 
			dataObject.setValue(HContainerDo.COLUMNS.UPDTIME.name(), hContainerDo.getUpdtime()); 
			dataObject.setValue(HContainerDo.COLUMNS.MSGTYPE.name(), hContainerDo.getMsgtype()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<HContainerDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(HContainerDo po) { 
		sqlWhere.add(HContainerDo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(HContainerDo.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(HContainerDo.COLUMNS.CONTRNO.name(), po.getContrno()); 
	} 
 
} 
