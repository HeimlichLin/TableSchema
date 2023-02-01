package com.doc.common.dao.impl; 
 
public class HContainerDAOImpl extends GeneralDAOImpl<HContainerPo> implements HContainerDAO { 
	public static final HContainerDAOImpl INSTANCE = new HContainerDAOImpl(); 
	public static final String TABLENAME = "H_CONTAINER"; 

	public HContainerDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<HContainerPo> CONVERTER = new MapConverter<HContainerPo>() { 
 
		@Override 
		public HContainerPo convert(final DataObject dataObject) { 
			final HContainerPo hContainerPo = new HContainerPo(); 
			hContainerPo.setBondno(dataObject.getString(HContainerPo.COLUMNS.BONDNO.name())); 
			hContainerPo.setPassno(dataObject.getString(HContainerPo.COLUMNS.PASSNO.name())); 
			hContainerPo.setPassdate(dataObject.getString(HContainerPo.COLUMNS.PASSDATE.name())); 
			hContainerPo.setDeclno(dataObject.getString(HContainerPo.COLUMNS.DECLNO.name())); 
			hContainerPo.setContrno(dataObject.getString(HContainerPo.COLUMNS.CONTRNO.name())); 
			hContainerPo.setPcontrno(dataObject.getString(HContainerPo.COLUMNS.PCONTRNO.name())); 
			hContainerPo.setContrtype(dataObject.getString(HContainerPo.COLUMNS.CONTRTYPE.name())); 
			hContainerPo.setTransmode(dataObject.getString(HContainerPo.COLUMNS.TRANSMODE.name())); 
			hContainerPo.setSealno(dataObject.getString(HContainerPo.COLUMNS.SEALNO.name())); 
			hContainerPo.setShsealno(dataObject.getString(HContainerPo.COLUMNS.SHSEALNO.name())); 
			hContainerPo.setPlatno(dataObject.getString(HContainerPo.COLUMNS.PLATNO.name())); 
			hContainerPo.setOuttime(TimestampUtils.of(dataObject.getValue(HContainerPo.COLUMNS.OUTTIME.name()))); 
			hContainerPo.setIntime(TimestampUtils.of(dataObject.getValue(HContainerPo.COLUMNS.INTIME.name()))); 
			hContainerPo.setCarcomp(dataObject.getString(HContainerPo.COLUMNS.CARCOMP.name())); 
			hContainerPo.setCarno(dataObject.getString(HContainerPo.COLUMNS.CARNO.name())); 
			hContainerPo.setDriver(dataObject.getString(HContainerPo.COLUMNS.DRIVER.name())); 
			hContainerPo.setDrvlno(dataObject.getString(HContainerPo.COLUMNS.DRVLNO.name())); 
			hContainerPo.setCnstatus(dataObject.getString(HContainerPo.COLUMNS.CNSTATUS.name())); 
			hContainerPo.setPackcode(dataObject.getString(HContainerPo.COLUMNS.PACKCODE.name())); 
			hContainerPo.setDestport(dataObject.getString(HContainerPo.COLUMNS.DESTPORT.name())); 
			hContainerPo.setCntgross(BigDecimalUtils.formObj(dataObject.getValue(HContainerPo.COLUMNS.CNTGROSS.name()))); 
			hContainerPo.setListno(dataObject.getString(HContainerPo.COLUMNS.LISTNO.name())); 
			hContainerPo.setUpdtime(dataObject.getString(HContainerPo.COLUMNS.UPDTIME.name())); 
			hContainerPo.setMsgtype(dataObject.getString(HContainerPo.COLUMNS.MSGTYPE.name())); 
			return hContainerPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final HContainerPo hContainerPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(HContainerPo.COLUMNS.BONDNO.name(), hContainerPo.getBondno()); 
			dataObject.setValue(HContainerPo.COLUMNS.PASSNO.name(), hContainerPo.getPassno()); 
			dataObject.setValue(HContainerPo.COLUMNS.PASSDATE.name(), hContainerPo.getPassdate()); 
			dataObject.setValue(HContainerPo.COLUMNS.DECLNO.name(), hContainerPo.getDeclno()); 
			dataObject.setValue(HContainerPo.COLUMNS.CONTRNO.name(), hContainerPo.getContrno()); 
			dataObject.setValue(HContainerPo.COLUMNS.PCONTRNO.name(), hContainerPo.getPcontrno()); 
			dataObject.setValue(HContainerPo.COLUMNS.CONTRTYPE.name(), hContainerPo.getContrtype()); 
			dataObject.setValue(HContainerPo.COLUMNS.TRANSMODE.name(), hContainerPo.getTransmode()); 
			dataObject.setValue(HContainerPo.COLUMNS.SEALNO.name(), hContainerPo.getSealno()); 
			dataObject.setValue(HContainerPo.COLUMNS.SHSEALNO.name(), hContainerPo.getShsealno()); 
			dataObject.setValue(HContainerPo.COLUMNS.PLATNO.name(), hContainerPo.getPlatno()); 
			dataObject.setValue(HContainerPo.COLUMNS.OUTTIME.name(), hContainerPo.getOuttime()); 
			dataObject.setValue(HContainerPo.COLUMNS.INTIME.name(), hContainerPo.getIntime()); 
			dataObject.setValue(HContainerPo.COLUMNS.CARCOMP.name(), hContainerPo.getCarcomp()); 
			dataObject.setValue(HContainerPo.COLUMNS.CARNO.name(), hContainerPo.getCarno()); 
			dataObject.setValue(HContainerPo.COLUMNS.DRIVER.name(), hContainerPo.getDriver()); 
			dataObject.setValue(HContainerPo.COLUMNS.DRVLNO.name(), hContainerPo.getDrvlno()); 
			dataObject.setValue(HContainerPo.COLUMNS.CNSTATUS.name(), hContainerPo.getCnstatus()); 
			dataObject.setValue(HContainerPo.COLUMNS.PACKCODE.name(), hContainerPo.getPackcode()); 
			dataObject.setValue(HContainerPo.COLUMNS.DESTPORT.name(), hContainerPo.getDestport()); 
			dataObject.setValue(HContainerPo.COLUMNS.CNTGROSS.name(), hContainerPo.getCntgross()); 
			dataObject.setValue(HContainerPo.COLUMNS.LISTNO.name(), hContainerPo.getListno()); 
			dataObject.setValue(HContainerPo.COLUMNS.UPDTIME.name(), hContainerPo.getUpdtime()); 
			dataObject.setValue(HContainerPo.COLUMNS.MSGTYPE.name(), hContainerPo.getMsgtype()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<HContainerPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(HContainerPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(HContainerPo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(HContainerPo.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(HContainerPo.COLUMNS.CONTRNO.name(), po.getContrno()); 
		return sqlWhere; 
	} 
 
} 
