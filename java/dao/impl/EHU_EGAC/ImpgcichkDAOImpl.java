package com.doc.common.dao.impl; 
 
public class ImpgcichkDAOImpl extends GeneralDAOImpl<ImpgcichkPo> implements ImpgcichkDAO { 
	public static final ImpgcichkDAOImpl INSTANCE = new ImpgcichkDAOImpl(); 
	public static final String TABLENAME = "IMPGCICHK"; 

	public ImpgcichkDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ImpgcichkPo> CONVERTER = new MapConverter<ImpgcichkPo>() { 
 
		@Override 
		public ImpgcichkPo convert(final DataObject dataObject) { 
			final ImpgcichkPo impgcichkPo = new ImpgcichkPo(); 
			impgcichkPo.setUniqueid(BigDecimalUtils.formObj(dataObject.getValue(ImpgcichkPo.COLUMNS.UNIQUEID.name()))); 
			impgcichkPo.setMwb(dataObject.getString(ImpgcichkPo.COLUMNS.MWB.name())); 
			impgcichkPo.setExpbagno(dataObject.getString(ImpgcichkPo.COLUMNS.EXPBAGNO.name())); 
			impgcichkPo.setContainer(dataObject.getString(ImpgcichkPo.COLUMNS.CONTAINER.name())); 
			impgcichkPo.setUldrmk(dataObject.getString(ImpgcichkPo.COLUMNS.ULDRMK.name())); 
			impgcichkPo.setFlightno(dataObject.getString(ImpgcichkPo.COLUMNS.FLIGHTNO.name())); 
			impgcichkPo.setFlightdate(TimestampUtils.of(dataObject.getValue(ImpgcichkPo.COLUMNS.FLIGHTDATE.name()))); 
			impgcichkPo.setInputmode(dataObject.getString(ImpgcichkPo.COLUMNS.INPUTMODE.name())); 
			impgcichkPo.setChkpiece(BigDecimalUtils.formObj(dataObject.getValue(ImpgcichkPo.COLUMNS.CHKPIECE.name()))); 
			impgcichkPo.setChkuser(dataObject.getString(ImpgcichkPo.COLUMNS.CHKUSER.name())); 
			impgcichkPo.setCheckdate(TimestampUtils.of(dataObject.getValue(ImpgcichkPo.COLUMNS.CHECKDATE.name()))); 
			impgcichkPo.setBagno(dataObject.getString(ImpgcichkPo.COLUMNS.BAGNO.name())); 
			impgcichkPo.setLastupdate(TimestampUtils.of(dataObject.getValue(ImpgcichkPo.COLUMNS.LASTUPDATE.name()))); 
			impgcichkPo.setLastupuser(dataObject.getString(ImpgcichkPo.COLUMNS.LASTUPUSER.name())); 
			return impgcichkPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ImpgcichkPo impgcichkPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ImpgcichkPo.COLUMNS.UNIQUEID.name(), impgcichkPo.getUniqueid()); 
			dataObject.setValue(ImpgcichkPo.COLUMNS.MWB.name(), impgcichkPo.getMwb()); 
			dataObject.setValue(ImpgcichkPo.COLUMNS.EXPBAGNO.name(), impgcichkPo.getExpbagno()); 
			dataObject.setValue(ImpgcichkPo.COLUMNS.CONTAINER.name(), impgcichkPo.getContainer()); 
			dataObject.setValue(ImpgcichkPo.COLUMNS.ULDRMK.name(), impgcichkPo.getUldrmk()); 
			dataObject.setValue(ImpgcichkPo.COLUMNS.FLIGHTNO.name(), impgcichkPo.getFlightno()); 
			dataObject.setValue(ImpgcichkPo.COLUMNS.FLIGHTDATE.name(), impgcichkPo.getFlightdate()); 
			dataObject.setValue(ImpgcichkPo.COLUMNS.INPUTMODE.name(), impgcichkPo.getInputmode()); 
			dataObject.setValue(ImpgcichkPo.COLUMNS.CHKPIECE.name(), impgcichkPo.getChkpiece()); 
			dataObject.setValue(ImpgcichkPo.COLUMNS.CHKUSER.name(), impgcichkPo.getChkuser()); 
			dataObject.setValue(ImpgcichkPo.COLUMNS.CHECKDATE.name(), impgcichkPo.getCheckdate()); 
			dataObject.setValue(ImpgcichkPo.COLUMNS.BAGNO.name(), impgcichkPo.getBagno()); 
			dataObject.setValue(ImpgcichkPo.COLUMNS.LASTUPDATE.name(), impgcichkPo.getLastupdate()); 
			dataObject.setValue(ImpgcichkPo.COLUMNS.LASTUPUSER.name(), impgcichkPo.getLastupuser()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ImpgcichkPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ImpgcichkPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(ImpgcichkPo.COLUMNS.UNIQUEID.name(), po.getUniqueid()); 
		return sqlWhere; 
	} 
 
} 
