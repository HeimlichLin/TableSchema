package com.doc.common.dao.impl; 
 
public class InvtrybookDAO extends GeneralDAOImpl<InvtrybookDo> implements InvtrybookDAO { 
	public static final InvtrybookDAOImpl INSTANCE = new InvtrybookDAOImpl(); 
	public static final String TABLENAME = "INVTRYBOOK"; 

	public InvtrybookDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<InvtrybookDo> CONVERTER = new MapConverter<InvtrybookDo>() { 
 
		@Override 
		public InvtrybookDo convert(final DataObject dataObject) { 
			final InvtrybookDo invtrybookDo = new InvtrybookDo(); 
			invtrybookDo.setBondno(dataObject.getString(InvtrybookDo.COLUMNS.BONDNO.name())); 
			invtrybookDo.setYy(dataObject.getString(InvtrybookDo.COLUMNS.YY.name())); 
			invtrybookDo.setItem(BigDecimalUtils.formObj(dataObject.getString(InvtrybookDo.COLUMNS.ITEM.name()))); 
			invtrybookDo.setPrdtno(dataObject.getString(InvtrybookDo.COLUMNS.PRDTNO.name())); 
			invtrybookDo.setInpost(dataObject.getString(InvtrybookDo.COLUMNS.INPOST.name())); 
			invtrybookDo.setCardno(dataObject.getString(InvtrybookDo.COLUMNS.CARDNO.name())); 
			invtrybookDo.setOptype(dataObject.getString(InvtrybookDo.COLUMNS.OPTYPE.name())); 
			invtrybookDo.setPrdttype(dataObject.getString(InvtrybookDo.COLUMNS.PRDTTYPE.name())); 
			invtrybookDo.setLocation(dataObject.getString(InvtrybookDo.COLUMNS.LOCATION.name())); 
			invtrybookDo.setUnit(dataObject.getString(InvtrybookDo.COLUMNS.UNIT.name())); 
			invtrybookDo.setChkqty(BigDecimalUtils.formObj(dataObject.getString(InvtrybookDo.COLUMNS.CHKQTY.name()))); 
			invtrybookDo.setDescrip(dataObject.getString(InvtrybookDo.COLUMNS.DESCRIP.name())); 
			invtrybookDo.setModel(dataObject.getString(InvtrybookDo.COLUMNS.MODEL.name())); 
			invtrybookDo.setSpec(dataObject.getString(InvtrybookDo.COLUMNS.SPEC.name())); 
			invtrybookDo.setDel(dataObject.getString(InvtrybookDo.COLUMNS.DEL.name())); 
			invtrybookDo.setUpdtime(dataObject.getString(InvtrybookDo.COLUMNS.UPDTIME.name())); 
			invtrybookDo.setCheckdate(dataObject.getString(InvtrybookDo.COLUMNS.CHECKDATE.name())); 
			invtrybookDo.setCarryqty(BigDecimalUtils.formObj(dataObject.getString(InvtrybookDo.COLUMNS.CARRYQTY.name()))); 
			return invtrybookDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final InvtrybookDo invtrybookDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(InvtrybookDo.COLUMNS.BONDNO.name(), invtrybookDo.getBondno()); 
			dataObject.setValue(InvtrybookDo.COLUMNS.YY.name(), invtrybookDo.getYy()); 
			dataObject.setValue(InvtrybookDo.COLUMNS.ITEM.name(), invtrybookDo.getItem()); 
			dataObject.setValue(InvtrybookDo.COLUMNS.PRDTNO.name(), invtrybookDo.getPrdtno()); 
			dataObject.setValue(InvtrybookDo.COLUMNS.INPOST.name(), invtrybookDo.getInpost()); 
			dataObject.setValue(InvtrybookDo.COLUMNS.CARDNO.name(), invtrybookDo.getCardno()); 
			dataObject.setValue(InvtrybookDo.COLUMNS.OPTYPE.name(), invtrybookDo.getOptype()); 
			dataObject.setValue(InvtrybookDo.COLUMNS.PRDTTYPE.name(), invtrybookDo.getPrdttype()); 
			dataObject.setValue(InvtrybookDo.COLUMNS.LOCATION.name(), invtrybookDo.getLocation()); 
			dataObject.setValue(InvtrybookDo.COLUMNS.UNIT.name(), invtrybookDo.getUnit()); 
			dataObject.setValue(InvtrybookDo.COLUMNS.CHKQTY.name(), invtrybookDo.getChkqty()); 
			dataObject.setValue(InvtrybookDo.COLUMNS.DESCRIP.name(), invtrybookDo.getDescrip()); 
			dataObject.setValue(InvtrybookDo.COLUMNS.MODEL.name(), invtrybookDo.getModel()); 
			dataObject.setValue(InvtrybookDo.COLUMNS.SPEC.name(), invtrybookDo.getSpec()); 
			dataObject.setValue(InvtrybookDo.COLUMNS.DEL.name(), invtrybookDo.getDel()); 
			dataObject.setValue(InvtrybookDo.COLUMNS.UPDTIME.name(), invtrybookDo.getUpdtime()); 
			dataObject.setValue(InvtrybookDo.COLUMNS.CHECKDATE.name(), invtrybookDo.getCheckdate()); 
			dataObject.setValue(InvtrybookDo.COLUMNS.CARRYQTY.name(), invtrybookDo.getCarryqty()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<InvtrybookDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(InvtrybookDo po) { 
		sqlWhere.add(InvtrybookDo.COLUMNS.ITEM.name(), po.getItem()); 
		sqlWhere.add(InvtrybookDo.COLUMNS.CARDNO.name(), po.getCardno()); 
		sqlWhere.add(InvtrybookDo.COLUMNS.OPTYPE.name(), po.getOptype()); 
		sqlWhere.add(InvtrybookDo.COLUMNS.PRDTTYPE.name(), po.getPrdttype()); 
		sqlWhere.add(InvtrybookDo.COLUMNS.UNIT.name(), po.getUnit()); 
		sqlWhere.add(InvtrybookDo.COLUMNS.CHKQTY.name(), po.getChkqty()); 
		sqlWhere.add(InvtrybookDo.COLUMNS.DESCRIP.name(), po.getDescrip()); 
		sqlWhere.add(InvtrybookDo.COLUMNS.MODEL.name(), po.getModel()); 
		sqlWhere.add(InvtrybookDo.COLUMNS.SPEC.name(), po.getSpec()); 
		sqlWhere.add(InvtrybookDo.COLUMNS.DEL.name(), po.getDel()); 
		sqlWhere.add(InvtrybookDo.COLUMNS.UPDTIME.name(), po.getUpdtime()); 
		sqlWhere.add(InvtrybookDo.COLUMNS.CHECKDATE.name(), po.getCheckdate()); 
		sqlWhere.add(InvtrybookDo.COLUMNS.CARRYQTY.name(), po.getCarryqty()); 
	} 
 
} 