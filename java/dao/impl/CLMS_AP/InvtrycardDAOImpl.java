package com.doc.common.dao.impl; 
 
public class InvtrycardDAOImpl extends GeneralDAOImpl<InvtrycardPo> implements InvtrycardDAO { 
	public static final InvtrycardDAOImpl INSTANCE = new InvtrycardDAOImpl(); 
	public static final String TABLENAME = "INVTRYCARD"; 

	public InvtrycardDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<InvtrycardPo> CONVERTER = new MapConverter<InvtrycardPo>() { 
 
		@Override 
		public InvtrycardPo convert(final DataObject dataObject) { 
			final InvtrycardPo invtrycardPo = new InvtrycardPo(); 
			invtrycardPo.setBondno(dataObject.getString(InvtrycardPo.COLUMNS.BONDNO.name())); 
			invtrycardPo.setYy(dataObject.getString(InvtrycardPo.COLUMNS.YY.name())); 
			invtrycardPo.setSeriesno(BigDecimalUtils.formObj(dataObject.getValue(InvtrycardPo.COLUMNS.SERIESNO.name()))); 
			invtrycardPo.setCardno(dataObject.getString(InvtrycardPo.COLUMNS.CARDNO.name())); 
			invtrycardPo.setCheckdate(dataObject.getString(InvtrycardPo.COLUMNS.CHECKDATE.name())); 
			invtrycardPo.setOptype(dataObject.getString(InvtrycardPo.COLUMNS.OPTYPE.name())); 
			invtrycardPo.setPrdttype(dataObject.getString(InvtrycardPo.COLUMNS.PRDTTYPE.name())); 
			invtrycardPo.setPrdtno(dataObject.getString(InvtrycardPo.COLUMNS.PRDTNO.name())); 
			invtrycardPo.setUnit(dataObject.getString(InvtrycardPo.COLUMNS.UNIT.name())); 
			invtrycardPo.setInpost(dataObject.getString(InvtrycardPo.COLUMNS.INPOST.name())); 
			invtrycardPo.setLocation(dataObject.getString(InvtrycardPo.COLUMNS.LOCATION.name())); 
			invtrycardPo.setCheckqty(BigDecimalUtils.formObj(dataObject.getValue(InvtrycardPo.COLUMNS.CHECKQTY.name()))); 
			invtrycardPo.setDescrip(dataObject.getString(InvtrycardPo.COLUMNS.DESCRIP.name())); 
			invtrycardPo.setModel(dataObject.getString(InvtrycardPo.COLUMNS.MODEL.name())); 
			invtrycardPo.setSpec(dataObject.getString(InvtrycardPo.COLUMNS.SPEC.name())); 
			invtrycardPo.setChecker1(dataObject.getString(InvtrycardPo.COLUMNS.CHECKER1.name())); 
			invtrycardPo.setChecker2(dataObject.getString(InvtrycardPo.COLUMNS.CHECKER2.name())); 
			invtrycardPo.setChecker3(dataObject.getString(InvtrycardPo.COLUMNS.CHECKER3.name())); 
			invtrycardPo.setRmk(dataObject.getString(InvtrycardPo.COLUMNS.RMK.name())); 
			invtrycardPo.setUpdtime(dataObject.getString(InvtrycardPo.COLUMNS.UPDTIME.name())); 
			return invtrycardPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final InvtrycardPo invtrycardPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(InvtrycardPo.COLUMNS.BONDNO.name(), invtrycardPo.getBondno()); 
			dataObject.setValue(InvtrycardPo.COLUMNS.YY.name(), invtrycardPo.getYy()); 
			dataObject.setValue(InvtrycardPo.COLUMNS.SERIESNO.name(), invtrycardPo.getSeriesno()); 
			dataObject.setValue(InvtrycardPo.COLUMNS.CARDNO.name(), invtrycardPo.getCardno()); 
			dataObject.setValue(InvtrycardPo.COLUMNS.CHECKDATE.name(), invtrycardPo.getCheckdate()); 
			dataObject.setValue(InvtrycardPo.COLUMNS.OPTYPE.name(), invtrycardPo.getOptype()); 
			dataObject.setValue(InvtrycardPo.COLUMNS.PRDTTYPE.name(), invtrycardPo.getPrdttype()); 
			dataObject.setValue(InvtrycardPo.COLUMNS.PRDTNO.name(), invtrycardPo.getPrdtno()); 
			dataObject.setValue(InvtrycardPo.COLUMNS.UNIT.name(), invtrycardPo.getUnit()); 
			dataObject.setValue(InvtrycardPo.COLUMNS.INPOST.name(), invtrycardPo.getInpost()); 
			dataObject.setValue(InvtrycardPo.COLUMNS.LOCATION.name(), invtrycardPo.getLocation()); 
			dataObject.setValue(InvtrycardPo.COLUMNS.CHECKQTY.name(), invtrycardPo.getCheckqty()); 
			dataObject.setValue(InvtrycardPo.COLUMNS.DESCRIP.name(), invtrycardPo.getDescrip()); 
			dataObject.setValue(InvtrycardPo.COLUMNS.MODEL.name(), invtrycardPo.getModel()); 
			dataObject.setValue(InvtrycardPo.COLUMNS.SPEC.name(), invtrycardPo.getSpec()); 
			dataObject.setValue(InvtrycardPo.COLUMNS.CHECKER1.name(), invtrycardPo.getChecker1()); 
			dataObject.setValue(InvtrycardPo.COLUMNS.CHECKER2.name(), invtrycardPo.getChecker2()); 
			dataObject.setValue(InvtrycardPo.COLUMNS.CHECKER3.name(), invtrycardPo.getChecker3()); 
			dataObject.setValue(InvtrycardPo.COLUMNS.RMK.name(), invtrycardPo.getRmk()); 
			dataObject.setValue(InvtrycardPo.COLUMNS.UPDTIME.name(), invtrycardPo.getUpdtime()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<InvtrycardPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(InvtrycardPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(InvtrycardPo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(InvtrycardPo.COLUMNS.YY.name(), po.getYy()); 
		sqlWhere.add(InvtrycardPo.COLUMNS.CARDNO.name(), po.getCardno()); 
		return sqlWhere; 
	} 
 
} 
