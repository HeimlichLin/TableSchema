package com.doc.common.dao.impl; 
 
public class InvtrycardDAOImpl extends GeneralDAOImpl<InvtrycardDo> implements InvtrycardDAOImpl { 
	public static final InvtrycardDAOImpl INSTANCE = new InvtrycardDAOImpl(); 
	public static final String TABLENAME = "INVTRYCARD"; 

	public InvtrycardDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<InvtrycardDo> CONVERTER = new MapConverter<InvtrycardDo>() { 
 
		@Override 
		public InvtrycardDo convert(final DataObject dataObject) { 
			final InvtrycardDo invtrycardDo = new InvtrycardDo(); 
			invtrycardDo.setBondno(dataObject.getString(InvtrycardDo.COLUMNS.BONDNO.name())); 
			invtrycardDo.setYy(dataObject.getString(InvtrycardDo.COLUMNS.YY.name())); 
			invtrycardDo.setSeriesno(BigDecimalUtils.formObj(dataObject.getString(InvtrycardDo.COLUMNS.SERIESNO.name()))); 
			invtrycardDo.setCardno(dataObject.getString(InvtrycardDo.COLUMNS.CARDNO.name())); 
			invtrycardDo.setCheckdate(dataObject.getString(InvtrycardDo.COLUMNS.CHECKDATE.name())); 
			invtrycardDo.setOptype(dataObject.getString(InvtrycardDo.COLUMNS.OPTYPE.name())); 
			invtrycardDo.setPrdttype(dataObject.getString(InvtrycardDo.COLUMNS.PRDTTYPE.name())); 
			invtrycardDo.setPrdtno(dataObject.getString(InvtrycardDo.COLUMNS.PRDTNO.name())); 
			invtrycardDo.setUnit(dataObject.getString(InvtrycardDo.COLUMNS.UNIT.name())); 
			invtrycardDo.setInpost(dataObject.getString(InvtrycardDo.COLUMNS.INPOST.name())); 
			invtrycardDo.setLocation(dataObject.getString(InvtrycardDo.COLUMNS.LOCATION.name())); 
			invtrycardDo.setCheckqty(BigDecimalUtils.formObj(dataObject.getString(InvtrycardDo.COLUMNS.CHECKQTY.name()))); 
			invtrycardDo.setDescrip(dataObject.getString(InvtrycardDo.COLUMNS.DESCRIP.name())); 
			invtrycardDo.setModel(dataObject.getString(InvtrycardDo.COLUMNS.MODEL.name())); 
			invtrycardDo.setSpec(dataObject.getString(InvtrycardDo.COLUMNS.SPEC.name())); 
			invtrycardDo.setChecker1(dataObject.getString(InvtrycardDo.COLUMNS.CHECKER1.name())); 
			invtrycardDo.setChecker2(dataObject.getString(InvtrycardDo.COLUMNS.CHECKER2.name())); 
			invtrycardDo.setChecker3(dataObject.getString(InvtrycardDo.COLUMNS.CHECKER3.name())); 
			invtrycardDo.setRmk(dataObject.getString(InvtrycardDo.COLUMNS.RMK.name())); 
			invtrycardDo.setUpdtime(dataObject.getString(InvtrycardDo.COLUMNS.UPDTIME.name())); 
			return invtrycardDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final InvtrycardDo invtrycardDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(InvtrycardDo.COLUMNS.BONDNO.name(), invtrycardDo.getBondno()); 
			dataObject.setValue(InvtrycardDo.COLUMNS.YY.name(), invtrycardDo.getYy()); 
			dataObject.setValue(InvtrycardDo.COLUMNS.SERIESNO.name(), invtrycardDo.getSeriesno()); 
			dataObject.setValue(InvtrycardDo.COLUMNS.CARDNO.name(), invtrycardDo.getCardno()); 
			dataObject.setValue(InvtrycardDo.COLUMNS.CHECKDATE.name(), invtrycardDo.getCheckdate()); 
			dataObject.setValue(InvtrycardDo.COLUMNS.OPTYPE.name(), invtrycardDo.getOptype()); 
			dataObject.setValue(InvtrycardDo.COLUMNS.PRDTTYPE.name(), invtrycardDo.getPrdttype()); 
			dataObject.setValue(InvtrycardDo.COLUMNS.PRDTNO.name(), invtrycardDo.getPrdtno()); 
			dataObject.setValue(InvtrycardDo.COLUMNS.UNIT.name(), invtrycardDo.getUnit()); 
			dataObject.setValue(InvtrycardDo.COLUMNS.INPOST.name(), invtrycardDo.getInpost()); 
			dataObject.setValue(InvtrycardDo.COLUMNS.LOCATION.name(), invtrycardDo.getLocation()); 
			dataObject.setValue(InvtrycardDo.COLUMNS.CHECKQTY.name(), invtrycardDo.getCheckqty()); 
			dataObject.setValue(InvtrycardDo.COLUMNS.DESCRIP.name(), invtrycardDo.getDescrip()); 
			dataObject.setValue(InvtrycardDo.COLUMNS.MODEL.name(), invtrycardDo.getModel()); 
			dataObject.setValue(InvtrycardDo.COLUMNS.SPEC.name(), invtrycardDo.getSpec()); 
			dataObject.setValue(InvtrycardDo.COLUMNS.CHECKER1.name(), invtrycardDo.getChecker1()); 
			dataObject.setValue(InvtrycardDo.COLUMNS.CHECKER2.name(), invtrycardDo.getChecker2()); 
			dataObject.setValue(InvtrycardDo.COLUMNS.CHECKER3.name(), invtrycardDo.getChecker3()); 
			dataObject.setValue(InvtrycardDo.COLUMNS.RMK.name(), invtrycardDo.getRmk()); 
			dataObject.setValue(InvtrycardDo.COLUMNS.UPDTIME.name(), invtrycardDo.getUpdtime()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<InvtrycardDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(InvtrycardDo po) { 
		sqlWhere.add(InvtrycardDo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(InvtrycardDo.COLUMNS.YY.name(), po.getYy()); 
		sqlWhere.add(InvtrycardDo.COLUMNS.CARDNO.name(), po.getCardno()); 
	} 
 
} 
