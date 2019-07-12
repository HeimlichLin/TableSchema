package com.doc.common.dao.impl; 
 
public class Anne0701OutdetailDAO extends GeneralDAOImpl<Anne0701OutdetailDo> implements Anne0701OutdetailDAO { 
	public static final Anne0701OutdetailDAOImpl INSTANCE = new Anne0701OutdetailDAOImpl(); 
	public static final String TABLENAME = "ANNE0701_OUTDETAIL"; 

	public Anne0701OutdetailDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<Anne0701OutdetailDo> CONVERTER = new MapConverter<Anne0701OutdetailDo>() { 
 
		@Override 
		public Anne0701OutdetailDo convert(final DataObject dataObject) { 
			final Anne0701OutdetailDo anne0701OutdetailDo = new Anne0701OutdetailDo(); 
			anne0701OutdetailDo.setBondno(dataObject.getString(Anne0701OutdetailDo.COLUMNS.BONDNO.name())); 
			anne0701OutdetailDo.setRefbillno(dataObject.getString(Anne0701OutdetailDo.COLUMNS.REFBILLNO.name())); 
			anne0701OutdetailDo.setItem(BigDecimalUtils.formObj(dataObject.getString(Anne0701OutdetailDo.COLUMNS.ITEM.name()))); 
			anne0701OutdetailDo.setPrdtno(dataObject.getString(Anne0701OutdetailDo.COLUMNS.PRDTNO.name())); 
			anne0701OutdetailDo.setRoutqty(BigDecimalUtils.formObj(dataObject.getString(Anne0701OutdetailDo.COLUMNS.ROUTQTY.name()))); 
			anne0701OutdetailDo.setOutunit(dataObject.getString(Anne0701OutdetailDo.COLUMNS.OUTUNIT.name())); 
			anne0701OutdetailDo.setOutpost(dataObject.getString(Anne0701OutdetailDo.COLUMNS.OUTPOST.name())); 
			anne0701OutdetailDo.setOutdate(dataObject.getString(Anne0701OutdetailDo.COLUMNS.OUTDATE.name())); 
			anne0701OutdetailDo.setBatchno(dataObject.getString(Anne0701OutdetailDo.COLUMNS.BATCHNO.name())); 
			anne0701OutdetailDo.setStockno(dataObject.getString(Anne0701OutdetailDo.COLUMNS.STOCKNO.name())); 
			anne0701OutdetailDo.setDecltype(dataObject.getString(Anne0701OutdetailDo.COLUMNS.DECLTYPE.name())); 
			anne0701OutdetailDo.setDeclno(dataObject.getString(Anne0701OutdetailDo.COLUMNS.DECLNO.name())); 
			anne0701OutdetailDo.setItemno(BigDecimalUtils.formObj(dataObject.getString(Anne0701OutdetailDo.COLUMNS.ITEMNO.name()))); 
			anne0701OutdetailDo.setOdeclno(dataObject.getString(Anne0701OutdetailDo.COLUMNS.ODECLNO.name())); 
			anne0701OutdetailDo.setOitemno(BigDecimalUtils.formObj(dataObject.getString(Anne0701OutdetailDo.COLUMNS.OITEMNO.name()))); 
			anne0701OutdetailDo.setOutstatus(dataObject.getString(Anne0701OutdetailDo.COLUMNS.OUTSTATUS.name())); 
			anne0701OutdetailDo.setOutrmks(dataObject.getString(Anne0701OutdetailDo.COLUMNS.OUTRMKS.name())); 
			anne0701OutdetailDo.setConfirmdate(dataObject.getString(Anne0701OutdetailDo.COLUMNS.CONFIRMDATE.name())); 
			anne0701OutdetailDo.setDescrip(dataObject.getString(Anne0701OutdetailDo.COLUMNS.DESCRIP.name())); 
			anne0701OutdetailDo.setMonthno(dataObject.getString(Anne0701OutdetailDo.COLUMNS.MONTHNO.name())); 
			anne0701OutdetailDo.setUserid(dataObject.getString(Anne0701OutdetailDo.COLUMNS.USERID.name())); 
			anne0701OutdetailDo.setTradeprdtno(dataObject.getString(Anne0701OutdetailDo.COLUMNS.TRADEPRDTNO.name())); 
			anne0701OutdetailDo.setNwght(BigDecimalUtils.formObj(dataObject.getString(Anne0701OutdetailDo.COLUMNS.NWGHT.name()))); 
			anne0701OutdetailDo.setGross(BigDecimalUtils.formObj(dataObject.getString(Anne0701OutdetailDo.COLUMNS.GROSS.name()))); 
			anne0701OutdetailDo.setOutstrno(dataObject.getString(Anne0701OutdetailDo.COLUMNS.OUTSTRNO.name())); 
			anne0701OutdetailDo.setUnitprice(BigDecimalUtils.formObj(dataObject.getString(Anne0701OutdetailDo.COLUMNS.UNITPRICE.name()))); 
			anne0701OutdetailDo.setCcccode(dataObject.getString(Anne0701OutdetailDo.COLUMNS.CCCCODE.name())); 
			anne0701OutdetailDo.setRlstime(dataObject.getString(Anne0701OutdetailDo.COLUMNS.RLSTIME.name())); 
			anne0701OutdetailDo.setDutyrate(BigDecimalUtils.formObj(dataObject.getString(Anne0701OutdetailDo.COLUMNS.DUTYRATE.name()))); 
			anne0701OutdetailDo.setPono(dataObject.getString(Anne0701OutdetailDo.COLUMNS.PONO.name())); 
			anne0701OutdetailDo.setInvno(dataObject.getString(Anne0701OutdetailDo.COLUMNS.INVNO.name())); 
			anne0701OutdetailDo.setCountno(BigDecimalUtils.formObj(dataObject.getString(Anne0701OutdetailDo.COLUMNS.COUNTNO.name()))); 
			anne0701OutdetailDo.setMawb(dataObject.getString(Anne0701OutdetailDo.COLUMNS.MAWB.name())); 
			anne0701OutdetailDo.setVesselno(dataObject.getString(Anne0701OutdetailDo.COLUMNS.VESSELNO.name())); 
			anne0701OutdetailDo.setDutytype(dataObject.getString(Anne0701OutdetailDo.COLUMNS.DUTYTYPE.name())); 
			anne0701OutdetailDo.setOptype(dataObject.getString(Anne0701OutdetailDo.COLUMNS.OPTYPE.name())); 
			anne0701OutdetailDo.setStatmode(dataObject.getString(Anne0701OutdetailDo.COLUMNS.STATMODE.name())); 
			return anne0701OutdetailDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Anne0701OutdetailDo anne0701OutdetailDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Anne0701OutdetailDo.COLUMNS.BONDNO.name(), anne0701OutdetailDo.getBondno()); 
			dataObject.setValue(Anne0701OutdetailDo.COLUMNS.REFBILLNO.name(), anne0701OutdetailDo.getRefbillno()); 
			dataObject.setValue(Anne0701OutdetailDo.COLUMNS.ITEM.name(), anne0701OutdetailDo.getItem()); 
			dataObject.setValue(Anne0701OutdetailDo.COLUMNS.PRDTNO.name(), anne0701OutdetailDo.getPrdtno()); 
			dataObject.setValue(Anne0701OutdetailDo.COLUMNS.ROUTQTY.name(), anne0701OutdetailDo.getRoutqty()); 
			dataObject.setValue(Anne0701OutdetailDo.COLUMNS.OUTUNIT.name(), anne0701OutdetailDo.getOutunit()); 
			dataObject.setValue(Anne0701OutdetailDo.COLUMNS.OUTPOST.name(), anne0701OutdetailDo.getOutpost()); 
			dataObject.setValue(Anne0701OutdetailDo.COLUMNS.OUTDATE.name(), anne0701OutdetailDo.getOutdate()); 
			dataObject.setValue(Anne0701OutdetailDo.COLUMNS.BATCHNO.name(), anne0701OutdetailDo.getBatchno()); 
			dataObject.setValue(Anne0701OutdetailDo.COLUMNS.STOCKNO.name(), anne0701OutdetailDo.getStockno()); 
			dataObject.setValue(Anne0701OutdetailDo.COLUMNS.DECLTYPE.name(), anne0701OutdetailDo.getDecltype()); 
			dataObject.setValue(Anne0701OutdetailDo.COLUMNS.DECLNO.name(), anne0701OutdetailDo.getDeclno()); 
			dataObject.setValue(Anne0701OutdetailDo.COLUMNS.ITEMNO.name(), anne0701OutdetailDo.getItemno()); 
			dataObject.setValue(Anne0701OutdetailDo.COLUMNS.ODECLNO.name(), anne0701OutdetailDo.getOdeclno()); 
			dataObject.setValue(Anne0701OutdetailDo.COLUMNS.OITEMNO.name(), anne0701OutdetailDo.getOitemno()); 
			dataObject.setValue(Anne0701OutdetailDo.COLUMNS.OUTSTATUS.name(), anne0701OutdetailDo.getOutstatus()); 
			dataObject.setValue(Anne0701OutdetailDo.COLUMNS.OUTRMKS.name(), anne0701OutdetailDo.getOutrmks()); 
			dataObject.setValue(Anne0701OutdetailDo.COLUMNS.CONFIRMDATE.name(), anne0701OutdetailDo.getConfirmdate()); 
			dataObject.setValue(Anne0701OutdetailDo.COLUMNS.DESCRIP.name(), anne0701OutdetailDo.getDescrip()); 
			dataObject.setValue(Anne0701OutdetailDo.COLUMNS.MONTHNO.name(), anne0701OutdetailDo.getMonthno()); 
			dataObject.setValue(Anne0701OutdetailDo.COLUMNS.USERID.name(), anne0701OutdetailDo.getUserid()); 
			dataObject.setValue(Anne0701OutdetailDo.COLUMNS.TRADEPRDTNO.name(), anne0701OutdetailDo.getTradeprdtno()); 
			dataObject.setValue(Anne0701OutdetailDo.COLUMNS.NWGHT.name(), anne0701OutdetailDo.getNwght()); 
			dataObject.setValue(Anne0701OutdetailDo.COLUMNS.GROSS.name(), anne0701OutdetailDo.getGross()); 
			dataObject.setValue(Anne0701OutdetailDo.COLUMNS.OUTSTRNO.name(), anne0701OutdetailDo.getOutstrno()); 
			dataObject.setValue(Anne0701OutdetailDo.COLUMNS.UNITPRICE.name(), anne0701OutdetailDo.getUnitprice()); 
			dataObject.setValue(Anne0701OutdetailDo.COLUMNS.CCCCODE.name(), anne0701OutdetailDo.getCcccode()); 
			dataObject.setValue(Anne0701OutdetailDo.COLUMNS.RLSTIME.name(), anne0701OutdetailDo.getRlstime()); 
			dataObject.setValue(Anne0701OutdetailDo.COLUMNS.DUTYRATE.name(), anne0701OutdetailDo.getDutyrate()); 
			dataObject.setValue(Anne0701OutdetailDo.COLUMNS.PONO.name(), anne0701OutdetailDo.getPono()); 
			dataObject.setValue(Anne0701OutdetailDo.COLUMNS.INVNO.name(), anne0701OutdetailDo.getInvno()); 
			dataObject.setValue(Anne0701OutdetailDo.COLUMNS.COUNTNO.name(), anne0701OutdetailDo.getCountno()); 
			dataObject.setValue(Anne0701OutdetailDo.COLUMNS.MAWB.name(), anne0701OutdetailDo.getMawb()); 
			dataObject.setValue(Anne0701OutdetailDo.COLUMNS.VESSELNO.name(), anne0701OutdetailDo.getVesselno()); 
			dataObject.setValue(Anne0701OutdetailDo.COLUMNS.DUTYTYPE.name(), anne0701OutdetailDo.getDutytype()); 
			dataObject.setValue(Anne0701OutdetailDo.COLUMNS.OPTYPE.name(), anne0701OutdetailDo.getOptype()); 
			dataObject.setValue(Anne0701OutdetailDo.COLUMNS.STATMODE.name(), anne0701OutdetailDo.getStatmode()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Anne0701OutdetailDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Anne0701OutdetailDo po) { 
		sqlWhere.add(Anne0701OutdetailDo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(Anne0701OutdetailDo.COLUMNS.REFBILLNO.name(), po.getRefbillno()); 
		sqlWhere.add(Anne0701OutdetailDo.COLUMNS.ITEM.name(), po.getItem()); 
		sqlWhere.add(Anne0701OutdetailDo.COLUMNS.PRDTNO.name(), po.getPrdtno()); 
		sqlWhere.add(Anne0701OutdetailDo.COLUMNS.ROUTQTY.name(), po.getRoutqty()); 
		sqlWhere.add(Anne0701OutdetailDo.COLUMNS.OUTUNIT.name(), po.getOutunit()); 
		sqlWhere.add(Anne0701OutdetailDo.COLUMNS.OUTPOST.name(), po.getOutpost()); 
		sqlWhere.add(Anne0701OutdetailDo.COLUMNS.OUTDATE.name(), po.getOutdate()); 
		sqlWhere.add(Anne0701OutdetailDo.COLUMNS.BATCHNO.name(), po.getBatchno()); 
		sqlWhere.add(Anne0701OutdetailDo.COLUMNS.STOCKNO.name(), po.getStockno()); 
		sqlWhere.add(Anne0701OutdetailDo.COLUMNS.DECLTYPE.name(), po.getDecltype()); 
		sqlWhere.add(Anne0701OutdetailDo.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(Anne0701OutdetailDo.COLUMNS.ITEMNO.name(), po.getItemno()); 
		sqlWhere.add(Anne0701OutdetailDo.COLUMNS.ODECLNO.name(), po.getOdeclno()); 
		sqlWhere.add(Anne0701OutdetailDo.COLUMNS.OITEMNO.name(), po.getOitemno()); 
		sqlWhere.add(Anne0701OutdetailDo.COLUMNS.OUTSTATUS.name(), po.getOutstatus()); 
		sqlWhere.add(Anne0701OutdetailDo.COLUMNS.OUTRMKS.name(), po.getOutrmks()); 
		sqlWhere.add(Anne0701OutdetailDo.COLUMNS.CONFIRMDATE.name(), po.getConfirmdate()); 
		sqlWhere.add(Anne0701OutdetailDo.COLUMNS.DESCRIP.name(), po.getDescrip()); 
		sqlWhere.add(Anne0701OutdetailDo.COLUMNS.MONTHNO.name(), po.getMonthno()); 
		sqlWhere.add(Anne0701OutdetailDo.COLUMNS.USERID.name(), po.getUserid()); 
		sqlWhere.add(Anne0701OutdetailDo.COLUMNS.TRADEPRDTNO.name(), po.getTradeprdtno()); 
		sqlWhere.add(Anne0701OutdetailDo.COLUMNS.NWGHT.name(), po.getNwght()); 
		sqlWhere.add(Anne0701OutdetailDo.COLUMNS.GROSS.name(), po.getGross()); 
		sqlWhere.add(Anne0701OutdetailDo.COLUMNS.OUTSTRNO.name(), po.getOutstrno()); 
		sqlWhere.add(Anne0701OutdetailDo.COLUMNS.UNITPRICE.name(), po.getUnitprice()); 
		sqlWhere.add(Anne0701OutdetailDo.COLUMNS.CCCCODE.name(), po.getCcccode()); 
		sqlWhere.add(Anne0701OutdetailDo.COLUMNS.RLSTIME.name(), po.getRlstime()); 
		sqlWhere.add(Anne0701OutdetailDo.COLUMNS.DUTYRATE.name(), po.getDutyrate()); 
		sqlWhere.add(Anne0701OutdetailDo.COLUMNS.PONO.name(), po.getPono()); 
		sqlWhere.add(Anne0701OutdetailDo.COLUMNS.INVNO.name(), po.getInvno()); 
		sqlWhere.add(Anne0701OutdetailDo.COLUMNS.COUNTNO.name(), po.getCountno()); 
		sqlWhere.add(Anne0701OutdetailDo.COLUMNS.MAWB.name(), po.getMawb()); 
		sqlWhere.add(Anne0701OutdetailDo.COLUMNS.VESSELNO.name(), po.getVesselno()); 
		sqlWhere.add(Anne0701OutdetailDo.COLUMNS.DUTYTYPE.name(), po.getDutytype()); 
		sqlWhere.add(Anne0701OutdetailDo.COLUMNS.OPTYPE.name(), po.getOptype()); 
		sqlWhere.add(Anne0701OutdetailDo.COLUMNS.STATMODE.name(), po.getStatmode()); 
	} 
 
} 
