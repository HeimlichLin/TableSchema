package com.doc.common.dao.impl; 
 
public class Anne0701OutdetailDAOImpl extends GeneralDAOImpl<Anne0701OutdetailPo> implements Anne0701OutdetailDAO { 
	public static final Anne0701OutdetailDAOImpl INSTANCE = new Anne0701OutdetailDAOImpl(); 
	public static final String TABLENAME = "ANNE0701_OUTDETAIL"; 

	public Anne0701OutdetailDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Anne0701OutdetailPo> CONVERTER = new MapConverter<Anne0701OutdetailPo>() { 
 
		@Override 
		public Anne0701OutdetailPo convert(final DataObject dataObject) { 
			final Anne0701OutdetailPo anne0701OutdetailPo = new Anne0701OutdetailPo(); 
			anne0701OutdetailPo.setBondno(dataObject.getString(Anne0701OutdetailPo.COLUMNS.BONDNO.name())); 
			anne0701OutdetailPo.setRefbillno(dataObject.getString(Anne0701OutdetailPo.COLUMNS.REFBILLNO.name())); 
			anne0701OutdetailPo.setItem(BigDecimalUtils.formObj(dataObject.getValue(Anne0701OutdetailPo.COLUMNS.ITEM.name()))); 
			anne0701OutdetailPo.setPrdtno(dataObject.getString(Anne0701OutdetailPo.COLUMNS.PRDTNO.name())); 
			anne0701OutdetailPo.setRoutqty(BigDecimalUtils.formObj(dataObject.getValue(Anne0701OutdetailPo.COLUMNS.ROUTQTY.name()))); 
			anne0701OutdetailPo.setOutunit(dataObject.getString(Anne0701OutdetailPo.COLUMNS.OUTUNIT.name())); 
			anne0701OutdetailPo.setOutpost(dataObject.getString(Anne0701OutdetailPo.COLUMNS.OUTPOST.name())); 
			anne0701OutdetailPo.setOutdate(dataObject.getString(Anne0701OutdetailPo.COLUMNS.OUTDATE.name())); 
			anne0701OutdetailPo.setBatchno(dataObject.getString(Anne0701OutdetailPo.COLUMNS.BATCHNO.name())); 
			anne0701OutdetailPo.setStockno(dataObject.getString(Anne0701OutdetailPo.COLUMNS.STOCKNO.name())); 
			anne0701OutdetailPo.setDecltype(dataObject.getString(Anne0701OutdetailPo.COLUMNS.DECLTYPE.name())); 
			anne0701OutdetailPo.setDeclno(dataObject.getString(Anne0701OutdetailPo.COLUMNS.DECLNO.name())); 
			anne0701OutdetailPo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(Anne0701OutdetailPo.COLUMNS.ITEMNO.name()))); 
			anne0701OutdetailPo.setOdeclno(dataObject.getString(Anne0701OutdetailPo.COLUMNS.ODECLNO.name())); 
			anne0701OutdetailPo.setOitemno(BigDecimalUtils.formObj(dataObject.getValue(Anne0701OutdetailPo.COLUMNS.OITEMNO.name()))); 
			anne0701OutdetailPo.setOutstatus(dataObject.getString(Anne0701OutdetailPo.COLUMNS.OUTSTATUS.name())); 
			anne0701OutdetailPo.setOutrmks(dataObject.getString(Anne0701OutdetailPo.COLUMNS.OUTRMKS.name())); 
			anne0701OutdetailPo.setConfirmdate(dataObject.getString(Anne0701OutdetailPo.COLUMNS.CONFIRMDATE.name())); 
			anne0701OutdetailPo.setDescrip(dataObject.getString(Anne0701OutdetailPo.COLUMNS.DESCRIP.name())); 
			anne0701OutdetailPo.setMonthno(dataObject.getString(Anne0701OutdetailPo.COLUMNS.MONTHNO.name())); 
			anne0701OutdetailPo.setUserid(dataObject.getString(Anne0701OutdetailPo.COLUMNS.USERID.name())); 
			anne0701OutdetailPo.setTradeprdtno(dataObject.getString(Anne0701OutdetailPo.COLUMNS.TRADEPRDTNO.name())); 
			anne0701OutdetailPo.setNwght(BigDecimalUtils.formObj(dataObject.getValue(Anne0701OutdetailPo.COLUMNS.NWGHT.name()))); 
			anne0701OutdetailPo.setGross(BigDecimalUtils.formObj(dataObject.getValue(Anne0701OutdetailPo.COLUMNS.GROSS.name()))); 
			anne0701OutdetailPo.setOutstrno(dataObject.getString(Anne0701OutdetailPo.COLUMNS.OUTSTRNO.name())); 
			anne0701OutdetailPo.setUnitprice(BigDecimalUtils.formObj(dataObject.getValue(Anne0701OutdetailPo.COLUMNS.UNITPRICE.name()))); 
			anne0701OutdetailPo.setCcccode(dataObject.getString(Anne0701OutdetailPo.COLUMNS.CCCCODE.name())); 
			anne0701OutdetailPo.setRlstime(dataObject.getString(Anne0701OutdetailPo.COLUMNS.RLSTIME.name())); 
			anne0701OutdetailPo.setDutyrate(BigDecimalUtils.formObj(dataObject.getValue(Anne0701OutdetailPo.COLUMNS.DUTYRATE.name()))); 
			anne0701OutdetailPo.setPono(dataObject.getString(Anne0701OutdetailPo.COLUMNS.PONO.name())); 
			anne0701OutdetailPo.setInvno(dataObject.getString(Anne0701OutdetailPo.COLUMNS.INVNO.name())); 
			anne0701OutdetailPo.setCountno(BigDecimalUtils.formObj(dataObject.getValue(Anne0701OutdetailPo.COLUMNS.COUNTNO.name()))); 
			anne0701OutdetailPo.setMawb(dataObject.getString(Anne0701OutdetailPo.COLUMNS.MAWB.name())); 
			anne0701OutdetailPo.setVesselno(dataObject.getString(Anne0701OutdetailPo.COLUMNS.VESSELNO.name())); 
			anne0701OutdetailPo.setDutytype(dataObject.getString(Anne0701OutdetailPo.COLUMNS.DUTYTYPE.name())); 
			anne0701OutdetailPo.setOptype(dataObject.getString(Anne0701OutdetailPo.COLUMNS.OPTYPE.name())); 
			anne0701OutdetailPo.setStatmode(dataObject.getString(Anne0701OutdetailPo.COLUMNS.STATMODE.name())); 
			return anne0701OutdetailPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Anne0701OutdetailPo anne0701OutdetailPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Anne0701OutdetailPo.COLUMNS.BONDNO.name(), anne0701OutdetailPo.getBondno()); 
			dataObject.setValue(Anne0701OutdetailPo.COLUMNS.REFBILLNO.name(), anne0701OutdetailPo.getRefbillno()); 
			dataObject.setValue(Anne0701OutdetailPo.COLUMNS.ITEM.name(), anne0701OutdetailPo.getItem()); 
			dataObject.setValue(Anne0701OutdetailPo.COLUMNS.PRDTNO.name(), anne0701OutdetailPo.getPrdtno()); 
			dataObject.setValue(Anne0701OutdetailPo.COLUMNS.ROUTQTY.name(), anne0701OutdetailPo.getRoutqty()); 
			dataObject.setValue(Anne0701OutdetailPo.COLUMNS.OUTUNIT.name(), anne0701OutdetailPo.getOutunit()); 
			dataObject.setValue(Anne0701OutdetailPo.COLUMNS.OUTPOST.name(), anne0701OutdetailPo.getOutpost()); 
			dataObject.setValue(Anne0701OutdetailPo.COLUMNS.OUTDATE.name(), anne0701OutdetailPo.getOutdate()); 
			dataObject.setValue(Anne0701OutdetailPo.COLUMNS.BATCHNO.name(), anne0701OutdetailPo.getBatchno()); 
			dataObject.setValue(Anne0701OutdetailPo.COLUMNS.STOCKNO.name(), anne0701OutdetailPo.getStockno()); 
			dataObject.setValue(Anne0701OutdetailPo.COLUMNS.DECLTYPE.name(), anne0701OutdetailPo.getDecltype()); 
			dataObject.setValue(Anne0701OutdetailPo.COLUMNS.DECLNO.name(), anne0701OutdetailPo.getDeclno()); 
			dataObject.setValue(Anne0701OutdetailPo.COLUMNS.ITEMNO.name(), anne0701OutdetailPo.getItemno()); 
			dataObject.setValue(Anne0701OutdetailPo.COLUMNS.ODECLNO.name(), anne0701OutdetailPo.getOdeclno()); 
			dataObject.setValue(Anne0701OutdetailPo.COLUMNS.OITEMNO.name(), anne0701OutdetailPo.getOitemno()); 
			dataObject.setValue(Anne0701OutdetailPo.COLUMNS.OUTSTATUS.name(), anne0701OutdetailPo.getOutstatus()); 
			dataObject.setValue(Anne0701OutdetailPo.COLUMNS.OUTRMKS.name(), anne0701OutdetailPo.getOutrmks()); 
			dataObject.setValue(Anne0701OutdetailPo.COLUMNS.CONFIRMDATE.name(), anne0701OutdetailPo.getConfirmdate()); 
			dataObject.setValue(Anne0701OutdetailPo.COLUMNS.DESCRIP.name(), anne0701OutdetailPo.getDescrip()); 
			dataObject.setValue(Anne0701OutdetailPo.COLUMNS.MONTHNO.name(), anne0701OutdetailPo.getMonthno()); 
			dataObject.setValue(Anne0701OutdetailPo.COLUMNS.USERID.name(), anne0701OutdetailPo.getUserid()); 
			dataObject.setValue(Anne0701OutdetailPo.COLUMNS.TRADEPRDTNO.name(), anne0701OutdetailPo.getTradeprdtno()); 
			dataObject.setValue(Anne0701OutdetailPo.COLUMNS.NWGHT.name(), anne0701OutdetailPo.getNwght()); 
			dataObject.setValue(Anne0701OutdetailPo.COLUMNS.GROSS.name(), anne0701OutdetailPo.getGross()); 
			dataObject.setValue(Anne0701OutdetailPo.COLUMNS.OUTSTRNO.name(), anne0701OutdetailPo.getOutstrno()); 
			dataObject.setValue(Anne0701OutdetailPo.COLUMNS.UNITPRICE.name(), anne0701OutdetailPo.getUnitprice()); 
			dataObject.setValue(Anne0701OutdetailPo.COLUMNS.CCCCODE.name(), anne0701OutdetailPo.getCcccode()); 
			dataObject.setValue(Anne0701OutdetailPo.COLUMNS.RLSTIME.name(), anne0701OutdetailPo.getRlstime()); 
			dataObject.setValue(Anne0701OutdetailPo.COLUMNS.DUTYRATE.name(), anne0701OutdetailPo.getDutyrate()); 
			dataObject.setValue(Anne0701OutdetailPo.COLUMNS.PONO.name(), anne0701OutdetailPo.getPono()); 
			dataObject.setValue(Anne0701OutdetailPo.COLUMNS.INVNO.name(), anne0701OutdetailPo.getInvno()); 
			dataObject.setValue(Anne0701OutdetailPo.COLUMNS.COUNTNO.name(), anne0701OutdetailPo.getCountno()); 
			dataObject.setValue(Anne0701OutdetailPo.COLUMNS.MAWB.name(), anne0701OutdetailPo.getMawb()); 
			dataObject.setValue(Anne0701OutdetailPo.COLUMNS.VESSELNO.name(), anne0701OutdetailPo.getVesselno()); 
			dataObject.setValue(Anne0701OutdetailPo.COLUMNS.DUTYTYPE.name(), anne0701OutdetailPo.getDutytype()); 
			dataObject.setValue(Anne0701OutdetailPo.COLUMNS.OPTYPE.name(), anne0701OutdetailPo.getOptype()); 
			dataObject.setValue(Anne0701OutdetailPo.COLUMNS.STATMODE.name(), anne0701OutdetailPo.getStatmode()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Anne0701OutdetailPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Anne0701OutdetailPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
