package com.doc.common.dao.impl; 
 
public class InstockdetailDAO extends GeneralDAOImpl<InstockdetailDo> implements InstockdetailDAO { 
	public static final InstockdetailDAOImpl INSTANCE = new InstockdetailDAOImpl(); 
	public static final String TABLENAME = "INSTOCKDETAIL"; 

	public InstockdetailDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<InstockdetailDo> CONVERTER = new MapConverter<InstockdetailDo>() { 
 
		@Override 
		public InstockdetailDo convert(final DataObject dataObject) { 
			final InstockdetailDo instockdetailDo = new InstockdetailDo(); 
			instockdetailDo.setBondno(dataObject.getString(InstockdetailDo.COLUMNS.BONDNO.name())); 
			instockdetailDo.setStockno(dataObject.getString(InstockdetailDo.COLUMNS.STOCKNO.name())); 
			instockdetailDo.setItem(dataObject.getString(InstockdetailDo.COLUMNS.ITEM.name())); 
			instockdetailDo.setPrdtno(dataObject.getString(InstockdetailDo.COLUMNS.PRDTNO.name())); 
			instockdetailDo.setDescrip(dataObject.getString(InstockdetailDo.COLUMNS.DESCRIP.name())); 
			instockdetailDo.setSpec(dataObject.getString(InstockdetailDo.COLUMNS.SPEC.name())); 
			instockdetailDo.setModel(dataObject.getString(InstockdetailDo.COLUMNS.MODEL.name())); 
			instockdetailDo.setUnit(dataObject.getString(InstockdetailDo.COLUMNS.UNIT.name())); 
			instockdetailDo.setInqty(BigDecimalUtils.formObj(dataObject.getString(InstockdetailDo.COLUMNS.INQTY.name()))); 
			instockdetailDo.setInpost(dataObject.getString(InstockdetailDo.COLUMNS.INPOST.name())); 
			instockdetailDo.setRmk(dataObject.getString(InstockdetailDo.COLUMNS.RMK.name())); 
			instockdetailDo.setUpdtime(dataObject.getString(InstockdetailDo.COLUMNS.UPDTIME.name())); 
			instockdetailDo.setIndate(dataObject.getString(InstockdetailDo.COLUMNS.INDATE.name())); 
			instockdetailDo.setInstatus(dataObject.getString(InstockdetailDo.COLUMNS.INSTATUS.name())); 
			instockdetailDo.setBalance(BigDecimalUtils.formObj(dataObject.getString(InstockdetailDo.COLUMNS.BALANCE.name()))); 
			instockdetailDo.setNwght(BigDecimalUtils.formObj(dataObject.getString(InstockdetailDo.COLUMNS.NWGHT.name()))); 
			instockdetailDo.setDeclno(dataObject.getString(InstockdetailDo.COLUMNS.DECLNO.name())); 
			instockdetailDo.setItemno(BigDecimalUtils.formObj(dataObject.getString(InstockdetailDo.COLUMNS.ITEMNO.name()))); 
			instockdetailDo.setOutstrno(dataObject.getString(InstockdetailDo.COLUMNS.OUTSTRNO.name())); 
			instockdetailDo.setOitem(BigDecimalUtils.formObj(dataObject.getString(InstockdetailDo.COLUMNS.OITEM.name()))); 
			instockdetailDo.setDecltype(dataObject.getString(InstockdetailDo.COLUMNS.DECLTYPE.name())); 
			return instockdetailDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final InstockdetailDo instockdetailDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(InstockdetailDo.COLUMNS.BONDNO.name(), instockdetailDo.getBondno()); 
			dataObject.setValue(InstockdetailDo.COLUMNS.STOCKNO.name(), instockdetailDo.getStockno()); 
			dataObject.setValue(InstockdetailDo.COLUMNS.ITEM.name(), instockdetailDo.getItem()); 
			dataObject.setValue(InstockdetailDo.COLUMNS.PRDTNO.name(), instockdetailDo.getPrdtno()); 
			dataObject.setValue(InstockdetailDo.COLUMNS.DESCRIP.name(), instockdetailDo.getDescrip()); 
			dataObject.setValue(InstockdetailDo.COLUMNS.SPEC.name(), instockdetailDo.getSpec()); 
			dataObject.setValue(InstockdetailDo.COLUMNS.MODEL.name(), instockdetailDo.getModel()); 
			dataObject.setValue(InstockdetailDo.COLUMNS.UNIT.name(), instockdetailDo.getUnit()); 
			dataObject.setValue(InstockdetailDo.COLUMNS.INQTY.name(), instockdetailDo.getInqty()); 
			dataObject.setValue(InstockdetailDo.COLUMNS.INPOST.name(), instockdetailDo.getInpost()); 
			dataObject.setValue(InstockdetailDo.COLUMNS.RMK.name(), instockdetailDo.getRmk()); 
			dataObject.setValue(InstockdetailDo.COLUMNS.UPDTIME.name(), instockdetailDo.getUpdtime()); 
			dataObject.setValue(InstockdetailDo.COLUMNS.INDATE.name(), instockdetailDo.getIndate()); 
			dataObject.setValue(InstockdetailDo.COLUMNS.INSTATUS.name(), instockdetailDo.getInstatus()); 
			dataObject.setValue(InstockdetailDo.COLUMNS.BALANCE.name(), instockdetailDo.getBalance()); 
			dataObject.setValue(InstockdetailDo.COLUMNS.NWGHT.name(), instockdetailDo.getNwght()); 
			dataObject.setValue(InstockdetailDo.COLUMNS.DECLNO.name(), instockdetailDo.getDeclno()); 
			dataObject.setValue(InstockdetailDo.COLUMNS.ITEMNO.name(), instockdetailDo.getItemno()); 
			dataObject.setValue(InstockdetailDo.COLUMNS.OUTSTRNO.name(), instockdetailDo.getOutstrno()); 
			dataObject.setValue(InstockdetailDo.COLUMNS.OITEM.name(), instockdetailDo.getOitem()); 
			dataObject.setValue(InstockdetailDo.COLUMNS.DECLTYPE.name(), instockdetailDo.getDecltype()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<InstockdetailDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(InstockdetailDo po) { 
		sqlWhere.add(InstockdetailDo.COLUMNS.PRDTNO.name(), po.getPrdtno()); 
		sqlWhere.add(InstockdetailDo.COLUMNS.DESCRIP.name(), po.getDescrip()); 
		sqlWhere.add(InstockdetailDo.COLUMNS.SPEC.name(), po.getSpec()); 
		sqlWhere.add(InstockdetailDo.COLUMNS.MODEL.name(), po.getModel()); 
		sqlWhere.add(InstockdetailDo.COLUMNS.UNIT.name(), po.getUnit()); 
		sqlWhere.add(InstockdetailDo.COLUMNS.INQTY.name(), po.getInqty()); 
		sqlWhere.add(InstockdetailDo.COLUMNS.INPOST.name(), po.getInpost()); 
		sqlWhere.add(InstockdetailDo.COLUMNS.RMK.name(), po.getRmk()); 
		sqlWhere.add(InstockdetailDo.COLUMNS.UPDTIME.name(), po.getUpdtime()); 
		sqlWhere.add(InstockdetailDo.COLUMNS.INDATE.name(), po.getIndate()); 
		sqlWhere.add(InstockdetailDo.COLUMNS.INSTATUS.name(), po.getInstatus()); 
		sqlWhere.add(InstockdetailDo.COLUMNS.BALANCE.name(), po.getBalance()); 
		sqlWhere.add(InstockdetailDo.COLUMNS.NWGHT.name(), po.getNwght()); 
		sqlWhere.add(InstockdetailDo.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(InstockdetailDo.COLUMNS.ITEMNO.name(), po.getItemno()); 
		sqlWhere.add(InstockdetailDo.COLUMNS.OUTSTRNO.name(), po.getOutstrno()); 
		sqlWhere.add(InstockdetailDo.COLUMNS.OITEM.name(), po.getOitem()); 
		sqlWhere.add(InstockdetailDo.COLUMNS.DECLTYPE.name(), po.getDecltype()); 
	} 
 
} 
