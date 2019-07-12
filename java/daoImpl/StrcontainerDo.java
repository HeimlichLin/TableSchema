package com.doc.common.dao.impl; 
 
public class StrcontainerDAO extends GeneralDAOImpl<StrcontainerDo> implements StrcontainerDAO { 
	public static final StrcontainerDAOImpl INSTANCE = new StrcontainerDAOImpl(); 
	public static final String TABLENAME = "STRCONTAINER"; 

	public StrcontainerDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<StrcontainerDo> CONVERTER = new MapConverter<StrcontainerDo>() { 
 
		@Override 
		public StrcontainerDo convert(final DataObject dataObject) { 
			final StrcontainerDo strcontainerDo = new StrcontainerDo(); 
			strcontainerDo.setBondno(dataObject.getString(StrcontainerDo.COLUMNS.BONDNO.name())); 
			strcontainerDo.setListno(dataObject.getString(StrcontainerDo.COLUMNS.LISTNO.name())); 
			strcontainerDo.setPassno(dataObject.getString(StrcontainerDo.COLUMNS.PASSNO.name())); 
			strcontainerDo.setPassdate(CommUtils.objConver2Time(dataObject.getString(StrcontainerDo.COLUMNS.PASSDATE.name()))); 
			strcontainerDo.setContrno(dataObject.getString(StrcontainerDo.COLUMNS.CONTRNO.name())); 
			strcontainerDo.setContrtype(dataObject.getString(StrcontainerDo.COLUMNS.CONTRTYPE.name())); 
			strcontainerDo.setTransmode(dataObject.getString(StrcontainerDo.COLUMNS.TRANSMODE.name())); 
			strcontainerDo.setPackcode(dataObject.getString(StrcontainerDo.COLUMNS.PACKCODE.name())); 
			strcontainerDo.setLoadqty(BigDecimalUtils.formObj(dataObject.getString(StrcontainerDo.COLUMNS.LOADQTY.name()))); 
			strcontainerDo.setSealno(dataObject.getString(StrcontainerDo.COLUMNS.SEALNO.name())); 
			strcontainerDo.setShsealno(dataObject.getString(StrcontainerDo.COLUMNS.SHSEALNO.name())); 
			strcontainerDo.setOuttime(CommUtils.objConver2Time(dataObject.getString(StrcontainerDo.COLUMNS.OUTTIME.name()))); 
			strcontainerDo.setIntime(CommUtils.objConver2Time(dataObject.getString(StrcontainerDo.COLUMNS.INTIME.name()))); 
			strcontainerDo.setCarcomp(dataObject.getString(StrcontainerDo.COLUMNS.CARCOMP.name())); 
			strcontainerDo.setCarno(dataObject.getString(StrcontainerDo.COLUMNS.CARNO.name())); 
			strcontainerDo.setDriver(dataObject.getString(StrcontainerDo.COLUMNS.DRIVER.name())); 
			strcontainerDo.setIdno(dataObject.getString(StrcontainerDo.COLUMNS.IDNO.name())); 
			strcontainerDo.setCnstatus(dataObject.getString(StrcontainerDo.COLUMNS.CNSTATUS.name())); 
			strcontainerDo.setLoccode(dataObject.getString(StrcontainerDo.COLUMNS.LOCCODE.name())); 
			strcontainerDo.setDestcode(dataObject.getString(StrcontainerDo.COLUMNS.DESTCODE.name())); 
			strcontainerDo.setIetype(dataObject.getString(StrcontainerDo.COLUMNS.IETYPE.name())); 
			return strcontainerDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final StrcontainerDo strcontainerDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(StrcontainerDo.COLUMNS.BONDNO.name(), strcontainerDo.getBondno()); 
			dataObject.setValue(StrcontainerDo.COLUMNS.LISTNO.name(), strcontainerDo.getListno()); 
			dataObject.setValue(StrcontainerDo.COLUMNS.PASSNO.name(), strcontainerDo.getPassno()); 
			dataObject.setValue(StrcontainerDo.COLUMNS.PASSDATE.name(), strcontainerDo.getPassdate()); 
			dataObject.setValue(StrcontainerDo.COLUMNS.CONTRNO.name(), strcontainerDo.getContrno()); 
			dataObject.setValue(StrcontainerDo.COLUMNS.CONTRTYPE.name(), strcontainerDo.getContrtype()); 
			dataObject.setValue(StrcontainerDo.COLUMNS.TRANSMODE.name(), strcontainerDo.getTransmode()); 
			dataObject.setValue(StrcontainerDo.COLUMNS.PACKCODE.name(), strcontainerDo.getPackcode()); 
			dataObject.setValue(StrcontainerDo.COLUMNS.LOADQTY.name(), strcontainerDo.getLoadqty()); 
			dataObject.setValue(StrcontainerDo.COLUMNS.SEALNO.name(), strcontainerDo.getSealno()); 
			dataObject.setValue(StrcontainerDo.COLUMNS.SHSEALNO.name(), strcontainerDo.getShsealno()); 
			dataObject.setValue(StrcontainerDo.COLUMNS.OUTTIME.name(), strcontainerDo.getOuttime()); 
			dataObject.setValue(StrcontainerDo.COLUMNS.INTIME.name(), strcontainerDo.getIntime()); 
			dataObject.setValue(StrcontainerDo.COLUMNS.CARCOMP.name(), strcontainerDo.getCarcomp()); 
			dataObject.setValue(StrcontainerDo.COLUMNS.CARNO.name(), strcontainerDo.getCarno()); 
			dataObject.setValue(StrcontainerDo.COLUMNS.DRIVER.name(), strcontainerDo.getDriver()); 
			dataObject.setValue(StrcontainerDo.COLUMNS.IDNO.name(), strcontainerDo.getIdno()); 
			dataObject.setValue(StrcontainerDo.COLUMNS.CNSTATUS.name(), strcontainerDo.getCnstatus()); 
			dataObject.setValue(StrcontainerDo.COLUMNS.LOCCODE.name(), strcontainerDo.getLoccode()); 
			dataObject.setValue(StrcontainerDo.COLUMNS.DESTCODE.name(), strcontainerDo.getDestcode()); 
			dataObject.setValue(StrcontainerDo.COLUMNS.IETYPE.name(), strcontainerDo.getIetype()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<StrcontainerDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(StrcontainerDo po) { 
		sqlWhere.add(StrcontainerDo.COLUMNS.LISTNO.name(), po.getListno()); 
		sqlWhere.add(StrcontainerDo.COLUMNS.PASSDATE.name(), po.getPassdate()); 
		sqlWhere.add(StrcontainerDo.COLUMNS.CONTRTYPE.name(), po.getContrtype()); 
		sqlWhere.add(StrcontainerDo.COLUMNS.TRANSMODE.name(), po.getTransmode()); 
		sqlWhere.add(StrcontainerDo.COLUMNS.PACKCODE.name(), po.getPackcode()); 
		sqlWhere.add(StrcontainerDo.COLUMNS.LOADQTY.name(), po.getLoadqty()); 
		sqlWhere.add(StrcontainerDo.COLUMNS.SEALNO.name(), po.getSealno()); 
		sqlWhere.add(StrcontainerDo.COLUMNS.SHSEALNO.name(), po.getShsealno()); 
		sqlWhere.add(StrcontainerDo.COLUMNS.OUTTIME.name(), po.getOuttime()); 
		sqlWhere.add(StrcontainerDo.COLUMNS.INTIME.name(), po.getIntime()); 
		sqlWhere.add(StrcontainerDo.COLUMNS.CARCOMP.name(), po.getCarcomp()); 
		sqlWhere.add(StrcontainerDo.COLUMNS.CARNO.name(), po.getCarno()); 
		sqlWhere.add(StrcontainerDo.COLUMNS.DRIVER.name(), po.getDriver()); 
		sqlWhere.add(StrcontainerDo.COLUMNS.IDNO.name(), po.getIdno()); 
		sqlWhere.add(StrcontainerDo.COLUMNS.CNSTATUS.name(), po.getCnstatus()); 
		sqlWhere.add(StrcontainerDo.COLUMNS.LOCCODE.name(), po.getLoccode()); 
		sqlWhere.add(StrcontainerDo.COLUMNS.DESTCODE.name(), po.getDestcode()); 
		sqlWhere.add(StrcontainerDo.COLUMNS.IETYPE.name(), po.getIetype()); 
	} 
 
} 
