package com.doc.common.dao.impl; 
 
public class OutstockdetailDAOImpl extends GeneralDAOImpl<OutstockdetailPo> implements OutstockdetailDAO { 
	public static final OutstockdetailDAOImpl INSTANCE = new OutstockdetailDAOImpl(); 
	public static final String TABLENAME = "OUTSTOCKDETAIL"; 

	public OutstockdetailDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<OutstockdetailPo> CONVERTER = new MapConverter<OutstockdetailPo>() { 
 
		@Override 
		public OutstockdetailPo convert(final DataObject dataObject) { 
			final OutstockdetailPo outstockdetailPo = new OutstockdetailPo(); 
			outstockdetailPo.setBondno(dataObject.getString(OutstockdetailPo.COLUMNS.BONDNO.name())); 
			outstockdetailPo.setOutstrno(dataObject.getString(OutstockdetailPo.COLUMNS.OUTSTRNO.name())); 
			outstockdetailPo.setItem(dataObject.getString(OutstockdetailPo.COLUMNS.ITEM.name())); 
			outstockdetailPo.setPrdtno(dataObject.getString(OutstockdetailPo.COLUMNS.PRDTNO.name())); 
			outstockdetailPo.setDescrip(dataObject.getString(OutstockdetailPo.COLUMNS.DESCRIP.name())); 
			outstockdetailPo.setUnit(dataObject.getString(OutstockdetailPo.COLUMNS.UNIT.name())); 
			outstockdetailPo.setOutqty(BigDecimalUtils.formObj(dataObject.getValue(OutstockdetailPo.COLUMNS.OUTQTY.name()))); 
			outstockdetailPo.setOutpost(dataObject.getString(OutstockdetailPo.COLUMNS.OUTPOST.name())); 
			outstockdetailPo.setStockno(dataObject.getString(OutstockdetailPo.COLUMNS.STOCKNO.name())); 
			outstockdetailPo.setOdeclno(dataObject.getString(OutstockdetailPo.COLUMNS.ODECLNO.name())); 
			outstockdetailPo.setOitemno(BigDecimalUtils.formObj(dataObject.getValue(OutstockdetailPo.COLUMNS.OITEMNO.name()))); 
			outstockdetailPo.setRmk(dataObject.getString(OutstockdetailPo.COLUMNS.RMK.name())); 
			outstockdetailPo.setUpdtime(dataObject.getString(OutstockdetailPo.COLUMNS.UPDTIME.name())); 
			outstockdetailPo.setOutstatus(dataObject.getString(OutstockdetailPo.COLUMNS.OUTSTATUS.name())); 
			outstockdetailPo.setNwght(BigDecimalUtils.formObj(dataObject.getValue(OutstockdetailPo.COLUMNS.NWGHT.name()))); 
			outstockdetailPo.setOrefbillno(dataObject.getString(OutstockdetailPo.COLUMNS.OREFBILLNO.name())); 
			outstockdetailPo.setOitem(BigDecimalUtils.formObj(dataObject.getValue(OutstockdetailPo.COLUMNS.OITEM.name()))); 
			outstockdetailPo.setRstrqty(BigDecimalUtils.formObj(dataObject.getValue(OutstockdetailPo.COLUMNS.RSTRQTY.name()))); 
			outstockdetailPo.setUninqty(BigDecimalUtils.formObj(dataObject.getValue(OutstockdetailPo.COLUMNS.UNINQTY.name()))); 
			return outstockdetailPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final OutstockdetailPo outstockdetailPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(OutstockdetailPo.COLUMNS.BONDNO.name(), outstockdetailPo.getBondno()); 
			dataObject.setValue(OutstockdetailPo.COLUMNS.OUTSTRNO.name(), outstockdetailPo.getOutstrno()); 
			dataObject.setValue(OutstockdetailPo.COLUMNS.ITEM.name(), outstockdetailPo.getItem()); 
			dataObject.setValue(OutstockdetailPo.COLUMNS.PRDTNO.name(), outstockdetailPo.getPrdtno()); 
			dataObject.setValue(OutstockdetailPo.COLUMNS.DESCRIP.name(), outstockdetailPo.getDescrip()); 
			dataObject.setValue(OutstockdetailPo.COLUMNS.UNIT.name(), outstockdetailPo.getUnit()); 
			dataObject.setValue(OutstockdetailPo.COLUMNS.OUTQTY.name(), outstockdetailPo.getOutqty()); 
			dataObject.setValue(OutstockdetailPo.COLUMNS.OUTPOST.name(), outstockdetailPo.getOutpost()); 
			dataObject.setValue(OutstockdetailPo.COLUMNS.STOCKNO.name(), outstockdetailPo.getStockno()); 
			dataObject.setValue(OutstockdetailPo.COLUMNS.ODECLNO.name(), outstockdetailPo.getOdeclno()); 
			dataObject.setValue(OutstockdetailPo.COLUMNS.OITEMNO.name(), outstockdetailPo.getOitemno()); 
			dataObject.setValue(OutstockdetailPo.COLUMNS.RMK.name(), outstockdetailPo.getRmk()); 
			dataObject.setValue(OutstockdetailPo.COLUMNS.UPDTIME.name(), outstockdetailPo.getUpdtime()); 
			dataObject.setValue(OutstockdetailPo.COLUMNS.OUTSTATUS.name(), outstockdetailPo.getOutstatus()); 
			dataObject.setValue(OutstockdetailPo.COLUMNS.NWGHT.name(), outstockdetailPo.getNwght()); 
			dataObject.setValue(OutstockdetailPo.COLUMNS.OREFBILLNO.name(), outstockdetailPo.getOrefbillno()); 
			dataObject.setValue(OutstockdetailPo.COLUMNS.OITEM.name(), outstockdetailPo.getOitem()); 
			dataObject.setValue(OutstockdetailPo.COLUMNS.RSTRQTY.name(), outstockdetailPo.getRstrqty()); 
			dataObject.setValue(OutstockdetailPo.COLUMNS.UNINQTY.name(), outstockdetailPo.getUninqty()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<OutstockdetailPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(OutstockdetailPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(OutstockdetailPo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(OutstockdetailPo.COLUMNS.OUTSTRNO.name(), po.getOutstrno()); 
		sqlWhere.add(OutstockdetailPo.COLUMNS.ITEM.name(), po.getItem()); 
		return sqlWhere; 
	} 
 
} 
