package com.doc.common.dao.impl; 
 
public class InvtrybookDAOImpl extends GeneralDAOImpl<InvtrybookPo> implements InvtrybookDAO { 
	public static final InvtrybookDAOImpl INSTANCE = new InvtrybookDAOImpl(); 
	public static final String TABLENAME = "INVTRYBOOK"; 

	public InvtrybookDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<InvtrybookPo> CONVERTER = new MapConverter<InvtrybookPo>() { 
 
		@Override 
		public InvtrybookPo convert(final DataObject dataObject) { 
			final InvtrybookPo invtrybookPo = new InvtrybookPo(); 
			invtrybookPo.setBondno(dataObject.getString(InvtrybookPo.COLUMNS.BONDNO.name())); 
			invtrybookPo.setYy(dataObject.getString(InvtrybookPo.COLUMNS.YY.name())); 
			invtrybookPo.setItem(BigDecimalUtils.formObj(dataObject.getValue(InvtrybookPo.COLUMNS.ITEM.name()))); 
			invtrybookPo.setPrdtno(dataObject.getString(InvtrybookPo.COLUMNS.PRDTNO.name())); 
			invtrybookPo.setInpost(dataObject.getString(InvtrybookPo.COLUMNS.INPOST.name())); 
			invtrybookPo.setCardno(dataObject.getString(InvtrybookPo.COLUMNS.CARDNO.name())); 
			invtrybookPo.setOptype(dataObject.getString(InvtrybookPo.COLUMNS.OPTYPE.name())); 
			invtrybookPo.setPrdttype(dataObject.getString(InvtrybookPo.COLUMNS.PRDTTYPE.name())); 
			invtrybookPo.setLocation(dataObject.getString(InvtrybookPo.COLUMNS.LOCATION.name())); 
			invtrybookPo.setUnit(dataObject.getString(InvtrybookPo.COLUMNS.UNIT.name())); 
			invtrybookPo.setChkqty(BigDecimalUtils.formObj(dataObject.getValue(InvtrybookPo.COLUMNS.CHKQTY.name()))); 
			invtrybookPo.setDescrip(dataObject.getString(InvtrybookPo.COLUMNS.DESCRIP.name())); 
			invtrybookPo.setModel(dataObject.getString(InvtrybookPo.COLUMNS.MODEL.name())); 
			invtrybookPo.setSpec(dataObject.getString(InvtrybookPo.COLUMNS.SPEC.name())); 
			invtrybookPo.setDel(dataObject.getString(InvtrybookPo.COLUMNS.DEL.name())); 
			invtrybookPo.setUpdtime(dataObject.getString(InvtrybookPo.COLUMNS.UPDTIME.name())); 
			invtrybookPo.setCheckdate(dataObject.getString(InvtrybookPo.COLUMNS.CHECKDATE.name())); 
			invtrybookPo.setCarryqty(BigDecimalUtils.formObj(dataObject.getValue(InvtrybookPo.COLUMNS.CARRYQTY.name()))); 
			return invtrybookPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final InvtrybookPo invtrybookPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(InvtrybookPo.COLUMNS.BONDNO.name(), invtrybookPo.getBondno()); 
			dataObject.setValue(InvtrybookPo.COLUMNS.YY.name(), invtrybookPo.getYy()); 
			dataObject.setValue(InvtrybookPo.COLUMNS.ITEM.name(), invtrybookPo.getItem()); 
			dataObject.setValue(InvtrybookPo.COLUMNS.PRDTNO.name(), invtrybookPo.getPrdtno()); 
			dataObject.setValue(InvtrybookPo.COLUMNS.INPOST.name(), invtrybookPo.getInpost()); 
			dataObject.setValue(InvtrybookPo.COLUMNS.CARDNO.name(), invtrybookPo.getCardno()); 
			dataObject.setValue(InvtrybookPo.COLUMNS.OPTYPE.name(), invtrybookPo.getOptype()); 
			dataObject.setValue(InvtrybookPo.COLUMNS.PRDTTYPE.name(), invtrybookPo.getPrdttype()); 
			dataObject.setValue(InvtrybookPo.COLUMNS.LOCATION.name(), invtrybookPo.getLocation()); 
			dataObject.setValue(InvtrybookPo.COLUMNS.UNIT.name(), invtrybookPo.getUnit()); 
			dataObject.setValue(InvtrybookPo.COLUMNS.CHKQTY.name(), invtrybookPo.getChkqty()); 
			dataObject.setValue(InvtrybookPo.COLUMNS.DESCRIP.name(), invtrybookPo.getDescrip()); 
			dataObject.setValue(InvtrybookPo.COLUMNS.MODEL.name(), invtrybookPo.getModel()); 
			dataObject.setValue(InvtrybookPo.COLUMNS.SPEC.name(), invtrybookPo.getSpec()); 
			dataObject.setValue(InvtrybookPo.COLUMNS.DEL.name(), invtrybookPo.getDel()); 
			dataObject.setValue(InvtrybookPo.COLUMNS.UPDTIME.name(), invtrybookPo.getUpdtime()); 
			dataObject.setValue(InvtrybookPo.COLUMNS.CHECKDATE.name(), invtrybookPo.getCheckdate()); 
			dataObject.setValue(InvtrybookPo.COLUMNS.CARRYQTY.name(), invtrybookPo.getCarryqty()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<InvtrybookPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(InvtrybookPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(InvtrybookPo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(InvtrybookPo.COLUMNS.YY.name(), po.getYy()); 
		sqlWhere.add(InvtrybookPo.COLUMNS.PRDTNO.name(), po.getPrdtno()); 
		sqlWhere.add(InvtrybookPo.COLUMNS.INPOST.name(), po.getInpost()); 
		sqlWhere.add(InvtrybookPo.COLUMNS.LOCATION.name(), po.getLocation()); 
		return sqlWhere; 
	} 
 
} 
