package com.doc.common.dao.impl; 
 
public class InstockdetailDAOImpl extends GeneralDAOImpl<InstockdetailPo> implements InstockdetailDAO { 
	public static final InstockdetailDAOImpl INSTANCE = new InstockdetailDAOImpl(); 
	public static final String TABLENAME = "INSTOCKDETAIL"; 

	public InstockdetailDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<InstockdetailPo> CONVERTER = new MapConverter<InstockdetailPo>() { 
 
		@Override 
		public InstockdetailPo convert(final DataObject dataObject) { 
			final InstockdetailPo instockdetailPo = new InstockdetailPo(); 
			instockdetailPo.setBondno(dataObject.getString(InstockdetailPo.COLUMNS.BONDNO.name())); 
			instockdetailPo.setStockno(dataObject.getString(InstockdetailPo.COLUMNS.STOCKNO.name())); 
			instockdetailPo.setItem(dataObject.getString(InstockdetailPo.COLUMNS.ITEM.name())); 
			instockdetailPo.setPrdtno(dataObject.getString(InstockdetailPo.COLUMNS.PRDTNO.name())); 
			instockdetailPo.setDescrip(dataObject.getString(InstockdetailPo.COLUMNS.DESCRIP.name())); 
			instockdetailPo.setSpec(dataObject.getString(InstockdetailPo.COLUMNS.SPEC.name())); 
			instockdetailPo.setModel(dataObject.getString(InstockdetailPo.COLUMNS.MODEL.name())); 
			instockdetailPo.setUnit(dataObject.getString(InstockdetailPo.COLUMNS.UNIT.name())); 
			instockdetailPo.setInqty(BigDecimalUtils.formObj(dataObject.getValue(InstockdetailPo.COLUMNS.INQTY.name()))); 
			instockdetailPo.setInpost(dataObject.getString(InstockdetailPo.COLUMNS.INPOST.name())); 
			instockdetailPo.setRmk(dataObject.getString(InstockdetailPo.COLUMNS.RMK.name())); 
			instockdetailPo.setUpdtime(dataObject.getString(InstockdetailPo.COLUMNS.UPDTIME.name())); 
			instockdetailPo.setIndate(dataObject.getString(InstockdetailPo.COLUMNS.INDATE.name())); 
			instockdetailPo.setInstatus(dataObject.getString(InstockdetailPo.COLUMNS.INSTATUS.name())); 
			instockdetailPo.setBalance(BigDecimalUtils.formObj(dataObject.getValue(InstockdetailPo.COLUMNS.BALANCE.name()))); 
			instockdetailPo.setNwght(BigDecimalUtils.formObj(dataObject.getValue(InstockdetailPo.COLUMNS.NWGHT.name()))); 
			instockdetailPo.setDeclno(dataObject.getString(InstockdetailPo.COLUMNS.DECLNO.name())); 
			instockdetailPo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(InstockdetailPo.COLUMNS.ITEMNO.name()))); 
			instockdetailPo.setOutstrno(dataObject.getString(InstockdetailPo.COLUMNS.OUTSTRNO.name())); 
			instockdetailPo.setOitem(BigDecimalUtils.formObj(dataObject.getValue(InstockdetailPo.COLUMNS.OITEM.name()))); 
			instockdetailPo.setDecltype(dataObject.getString(InstockdetailPo.COLUMNS.DECLTYPE.name())); 
			return instockdetailPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final InstockdetailPo instockdetailPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(InstockdetailPo.COLUMNS.BONDNO.name(), instockdetailPo.getBondno()); 
			dataObject.setValue(InstockdetailPo.COLUMNS.STOCKNO.name(), instockdetailPo.getStockno()); 
			dataObject.setValue(InstockdetailPo.COLUMNS.ITEM.name(), instockdetailPo.getItem()); 
			dataObject.setValue(InstockdetailPo.COLUMNS.PRDTNO.name(), instockdetailPo.getPrdtno()); 
			dataObject.setValue(InstockdetailPo.COLUMNS.DESCRIP.name(), instockdetailPo.getDescrip()); 
			dataObject.setValue(InstockdetailPo.COLUMNS.SPEC.name(), instockdetailPo.getSpec()); 
			dataObject.setValue(InstockdetailPo.COLUMNS.MODEL.name(), instockdetailPo.getModel()); 
			dataObject.setValue(InstockdetailPo.COLUMNS.UNIT.name(), instockdetailPo.getUnit()); 
			dataObject.setValue(InstockdetailPo.COLUMNS.INQTY.name(), instockdetailPo.getInqty()); 
			dataObject.setValue(InstockdetailPo.COLUMNS.INPOST.name(), instockdetailPo.getInpost()); 
			dataObject.setValue(InstockdetailPo.COLUMNS.RMK.name(), instockdetailPo.getRmk()); 
			dataObject.setValue(InstockdetailPo.COLUMNS.UPDTIME.name(), instockdetailPo.getUpdtime()); 
			dataObject.setValue(InstockdetailPo.COLUMNS.INDATE.name(), instockdetailPo.getIndate()); 
			dataObject.setValue(InstockdetailPo.COLUMNS.INSTATUS.name(), instockdetailPo.getInstatus()); 
			dataObject.setValue(InstockdetailPo.COLUMNS.BALANCE.name(), instockdetailPo.getBalance()); 
			dataObject.setValue(InstockdetailPo.COLUMNS.NWGHT.name(), instockdetailPo.getNwght()); 
			dataObject.setValue(InstockdetailPo.COLUMNS.DECLNO.name(), instockdetailPo.getDeclno()); 
			dataObject.setValue(InstockdetailPo.COLUMNS.ITEMNO.name(), instockdetailPo.getItemno()); 
			dataObject.setValue(InstockdetailPo.COLUMNS.OUTSTRNO.name(), instockdetailPo.getOutstrno()); 
			dataObject.setValue(InstockdetailPo.COLUMNS.OITEM.name(), instockdetailPo.getOitem()); 
			dataObject.setValue(InstockdetailPo.COLUMNS.DECLTYPE.name(), instockdetailPo.getDecltype()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<InstockdetailPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(InstockdetailPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(InstockdetailPo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(InstockdetailPo.COLUMNS.STOCKNO.name(), po.getStockno()); 
		sqlWhere.add(InstockdetailPo.COLUMNS.ITEM.name(), po.getItem()); 
		return sqlWhere; 
	} 
 
} 
