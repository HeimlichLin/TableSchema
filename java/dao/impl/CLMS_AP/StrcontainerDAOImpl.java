package com.doc.common.dao.impl; 
 
public class StrcontainerDAOImpl extends GeneralDAOImpl<StrcontainerPo> implements StrcontainerDAO { 
	public static final StrcontainerDAOImpl INSTANCE = new StrcontainerDAOImpl(); 
	public static final String TABLENAME = "STRCONTAINER"; 

	public StrcontainerDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<StrcontainerPo> CONVERTER = new MapConverter<StrcontainerPo>() { 
 
		@Override 
		public StrcontainerPo convert(final DataObject dataObject) { 
			final StrcontainerPo strcontainerPo = new StrcontainerPo(); 
			strcontainerPo.setBondno(dataObject.getString(StrcontainerPo.COLUMNS.BONDNO.name())); 
			strcontainerPo.setListno(dataObject.getString(StrcontainerPo.COLUMNS.LISTNO.name())); 
			strcontainerPo.setPassno(dataObject.getString(StrcontainerPo.COLUMNS.PASSNO.name())); 
			strcontainerPo.setPassdate(TimestampUtils.of(dataObject.getValue(StrcontainerPo.COLUMNS.PASSDATE.name()))); 
			strcontainerPo.setContrno(dataObject.getString(StrcontainerPo.COLUMNS.CONTRNO.name())); 
			strcontainerPo.setContrtype(dataObject.getString(StrcontainerPo.COLUMNS.CONTRTYPE.name())); 
			strcontainerPo.setTransmode(dataObject.getString(StrcontainerPo.COLUMNS.TRANSMODE.name())); 
			strcontainerPo.setPackcode(dataObject.getString(StrcontainerPo.COLUMNS.PACKCODE.name())); 
			strcontainerPo.setLoadqty(BigDecimalUtils.formObj(dataObject.getValue(StrcontainerPo.COLUMNS.LOADQTY.name()))); 
			strcontainerPo.setSealno(dataObject.getString(StrcontainerPo.COLUMNS.SEALNO.name())); 
			strcontainerPo.setShsealno(dataObject.getString(StrcontainerPo.COLUMNS.SHSEALNO.name())); 
			strcontainerPo.setOuttime(TimestampUtils.of(dataObject.getValue(StrcontainerPo.COLUMNS.OUTTIME.name()))); 
			strcontainerPo.setIntime(TimestampUtils.of(dataObject.getValue(StrcontainerPo.COLUMNS.INTIME.name()))); 
			strcontainerPo.setCarcomp(dataObject.getString(StrcontainerPo.COLUMNS.CARCOMP.name())); 
			strcontainerPo.setCarno(dataObject.getString(StrcontainerPo.COLUMNS.CARNO.name())); 
			strcontainerPo.setDriver(dataObject.getString(StrcontainerPo.COLUMNS.DRIVER.name())); 
			strcontainerPo.setIdno(dataObject.getString(StrcontainerPo.COLUMNS.IDNO.name())); 
			strcontainerPo.setCnstatus(dataObject.getString(StrcontainerPo.COLUMNS.CNSTATUS.name())); 
			strcontainerPo.setLoccode(dataObject.getString(StrcontainerPo.COLUMNS.LOCCODE.name())); 
			strcontainerPo.setDestcode(dataObject.getString(StrcontainerPo.COLUMNS.DESTCODE.name())); 
			strcontainerPo.setIetype(dataObject.getString(StrcontainerPo.COLUMNS.IETYPE.name())); 
			return strcontainerPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final StrcontainerPo strcontainerPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(StrcontainerPo.COLUMNS.BONDNO.name(), strcontainerPo.getBondno()); 
			dataObject.setValue(StrcontainerPo.COLUMNS.LISTNO.name(), strcontainerPo.getListno()); 
			dataObject.setValue(StrcontainerPo.COLUMNS.PASSNO.name(), strcontainerPo.getPassno()); 
			dataObject.setValue(StrcontainerPo.COLUMNS.PASSDATE.name(), strcontainerPo.getPassdate()); 
			dataObject.setValue(StrcontainerPo.COLUMNS.CONTRNO.name(), strcontainerPo.getContrno()); 
			dataObject.setValue(StrcontainerPo.COLUMNS.CONTRTYPE.name(), strcontainerPo.getContrtype()); 
			dataObject.setValue(StrcontainerPo.COLUMNS.TRANSMODE.name(), strcontainerPo.getTransmode()); 
			dataObject.setValue(StrcontainerPo.COLUMNS.PACKCODE.name(), strcontainerPo.getPackcode()); 
			dataObject.setValue(StrcontainerPo.COLUMNS.LOADQTY.name(), strcontainerPo.getLoadqty()); 
			dataObject.setValue(StrcontainerPo.COLUMNS.SEALNO.name(), strcontainerPo.getSealno()); 
			dataObject.setValue(StrcontainerPo.COLUMNS.SHSEALNO.name(), strcontainerPo.getShsealno()); 
			dataObject.setValue(StrcontainerPo.COLUMNS.OUTTIME.name(), strcontainerPo.getOuttime()); 
			dataObject.setValue(StrcontainerPo.COLUMNS.INTIME.name(), strcontainerPo.getIntime()); 
			dataObject.setValue(StrcontainerPo.COLUMNS.CARCOMP.name(), strcontainerPo.getCarcomp()); 
			dataObject.setValue(StrcontainerPo.COLUMNS.CARNO.name(), strcontainerPo.getCarno()); 
			dataObject.setValue(StrcontainerPo.COLUMNS.DRIVER.name(), strcontainerPo.getDriver()); 
			dataObject.setValue(StrcontainerPo.COLUMNS.IDNO.name(), strcontainerPo.getIdno()); 
			dataObject.setValue(StrcontainerPo.COLUMNS.CNSTATUS.name(), strcontainerPo.getCnstatus()); 
			dataObject.setValue(StrcontainerPo.COLUMNS.LOCCODE.name(), strcontainerPo.getLoccode()); 
			dataObject.setValue(StrcontainerPo.COLUMNS.DESTCODE.name(), strcontainerPo.getDestcode()); 
			dataObject.setValue(StrcontainerPo.COLUMNS.IETYPE.name(), strcontainerPo.getIetype()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<StrcontainerPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(StrcontainerPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(StrcontainerPo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(StrcontainerPo.COLUMNS.PASSNO.name(), po.getPassno()); 
		sqlWhere.add(StrcontainerPo.COLUMNS.CONTRNO.name(), po.getContrno()); 
		return sqlWhere; 
	} 
 
} 
