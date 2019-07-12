package com.doc.common.dao.impl; 
 
public class OutstockdetailDAOImpl extends GeneralDAOImpl<OutstockdetailDo> implements OutstockdetailDAOImpl { 
	public static final OutstockdetailDAOImpl INSTANCE = new OutstockdetailDAOImpl(); 
	public static final String TABLENAME = "OUTSTOCKDETAIL"; 

	public OutstockdetailDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<OutstockdetailDo> CONVERTER = new MapConverter<OutstockdetailDo>() { 
 
		@Override 
		public OutstockdetailDo convert(final DataObject dataObject) { 
			final OutstockdetailDo outstockdetailDo = new OutstockdetailDo(); 
			outstockdetailDo.setBondno(dataObject.getString(OutstockdetailDo.COLUMNS.BONDNO.name())); 
			outstockdetailDo.setOutstrno(dataObject.getString(OutstockdetailDo.COLUMNS.OUTSTRNO.name())); 
			outstockdetailDo.setItem(dataObject.getString(OutstockdetailDo.COLUMNS.ITEM.name())); 
			outstockdetailDo.setPrdtno(dataObject.getString(OutstockdetailDo.COLUMNS.PRDTNO.name())); 
			outstockdetailDo.setDescrip(dataObject.getString(OutstockdetailDo.COLUMNS.DESCRIP.name())); 
			outstockdetailDo.setUnit(dataObject.getString(OutstockdetailDo.COLUMNS.UNIT.name())); 
			outstockdetailDo.setOutqty(BigDecimalUtils.formObj(dataObject.getString(OutstockdetailDo.COLUMNS.OUTQTY.name()))); 
			outstockdetailDo.setOutpost(dataObject.getString(OutstockdetailDo.COLUMNS.OUTPOST.name())); 
			outstockdetailDo.setStockno(dataObject.getString(OutstockdetailDo.COLUMNS.STOCKNO.name())); 
			outstockdetailDo.setOdeclno(dataObject.getString(OutstockdetailDo.COLUMNS.ODECLNO.name())); 
			outstockdetailDo.setOitemno(BigDecimalUtils.formObj(dataObject.getString(OutstockdetailDo.COLUMNS.OITEMNO.name()))); 
			outstockdetailDo.setRmk(dataObject.getString(OutstockdetailDo.COLUMNS.RMK.name())); 
			outstockdetailDo.setUpdtime(dataObject.getString(OutstockdetailDo.COLUMNS.UPDTIME.name())); 
			outstockdetailDo.setOutstatus(dataObject.getString(OutstockdetailDo.COLUMNS.OUTSTATUS.name())); 
			outstockdetailDo.setNwght(BigDecimalUtils.formObj(dataObject.getString(OutstockdetailDo.COLUMNS.NWGHT.name()))); 
			outstockdetailDo.setOrefbillno(dataObject.getString(OutstockdetailDo.COLUMNS.OREFBILLNO.name())); 
			outstockdetailDo.setOitem(BigDecimalUtils.formObj(dataObject.getString(OutstockdetailDo.COLUMNS.OITEM.name()))); 
			outstockdetailDo.setRstrqty(BigDecimalUtils.formObj(dataObject.getString(OutstockdetailDo.COLUMNS.RSTRQTY.name()))); 
			outstockdetailDo.setUninqty(BigDecimalUtils.formObj(dataObject.getString(OutstockdetailDo.COLUMNS.UNINQTY.name()))); 
			return outstockdetailDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final OutstockdetailDo outstockdetailDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(OutstockdetailDo.COLUMNS.BONDNO.name(), outstockdetailDo.getBondno()); 
			dataObject.setValue(OutstockdetailDo.COLUMNS.OUTSTRNO.name(), outstockdetailDo.getOutstrno()); 
			dataObject.setValue(OutstockdetailDo.COLUMNS.ITEM.name(), outstockdetailDo.getItem()); 
			dataObject.setValue(OutstockdetailDo.COLUMNS.PRDTNO.name(), outstockdetailDo.getPrdtno()); 
			dataObject.setValue(OutstockdetailDo.COLUMNS.DESCRIP.name(), outstockdetailDo.getDescrip()); 
			dataObject.setValue(OutstockdetailDo.COLUMNS.UNIT.name(), outstockdetailDo.getUnit()); 
			dataObject.setValue(OutstockdetailDo.COLUMNS.OUTQTY.name(), outstockdetailDo.getOutqty()); 
			dataObject.setValue(OutstockdetailDo.COLUMNS.OUTPOST.name(), outstockdetailDo.getOutpost()); 
			dataObject.setValue(OutstockdetailDo.COLUMNS.STOCKNO.name(), outstockdetailDo.getStockno()); 
			dataObject.setValue(OutstockdetailDo.COLUMNS.ODECLNO.name(), outstockdetailDo.getOdeclno()); 
			dataObject.setValue(OutstockdetailDo.COLUMNS.OITEMNO.name(), outstockdetailDo.getOitemno()); 
			dataObject.setValue(OutstockdetailDo.COLUMNS.RMK.name(), outstockdetailDo.getRmk()); 
			dataObject.setValue(OutstockdetailDo.COLUMNS.UPDTIME.name(), outstockdetailDo.getUpdtime()); 
			dataObject.setValue(OutstockdetailDo.COLUMNS.OUTSTATUS.name(), outstockdetailDo.getOutstatus()); 
			dataObject.setValue(OutstockdetailDo.COLUMNS.NWGHT.name(), outstockdetailDo.getNwght()); 
			dataObject.setValue(OutstockdetailDo.COLUMNS.OREFBILLNO.name(), outstockdetailDo.getOrefbillno()); 
			dataObject.setValue(OutstockdetailDo.COLUMNS.OITEM.name(), outstockdetailDo.getOitem()); 
			dataObject.setValue(OutstockdetailDo.COLUMNS.RSTRQTY.name(), outstockdetailDo.getRstrqty()); 
			dataObject.setValue(OutstockdetailDo.COLUMNS.UNINQTY.name(), outstockdetailDo.getUninqty()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<OutstockdetailDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(OutstockdetailDo po) { 
		sqlWhere.add(OutstockdetailDo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(OutstockdetailDo.COLUMNS.OUTSTRNO.name(), po.getOutstrno()); 
		sqlWhere.add(OutstockdetailDo.COLUMNS.ITEM.name(), po.getItem()); 
	} 
 
} 
