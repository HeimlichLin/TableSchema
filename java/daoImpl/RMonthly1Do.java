package com.doc.common.dao.impl; 
 
public class RMonthly1DAO extends GeneralDAOImpl<RMonthly1Do> implements RMonthly1DAO { 
	public static final RMonthly1DAOImpl INSTANCE = new RMonthly1DAOImpl(); 
	public static final String TABLENAME = "R_MONTHLY1"; 

	public RMonthly1DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<RMonthly1Do> CONVERTER = new MapConverter<RMonthly1Do>() { 
 
		@Override 
		public RMonthly1Do convert(final DataObject dataObject) { 
			final RMonthly1Do rMonthly1Do = new RMonthly1Do(); 
			rMonthly1Do.setSessionid(dataObject.getString(RMonthly1Do.COLUMNS.SESSIONID.name())); 
			rMonthly1Do.setBondno(dataObject.getString(RMonthly1Do.COLUMNS.BONDNO.name())); 
			rMonthly1Do.setGdstype(dataObject.getString(RMonthly1Do.COLUMNS.GDSTYPE.name())); 
			rMonthly1Do.setPrdtno(dataObject.getString(RMonthly1Do.COLUMNS.PRDTNO.name())); 
			rMonthly1Do.setDeclno(dataObject.getString(RMonthly1Do.COLUMNS.DECLNO.name())); 
			rMonthly1Do.setItemno(BigDecimalUtils.formObj(dataObject.getString(RMonthly1Do.COLUMNS.ITEMNO.name()))); 
			rMonthly1Do.setStockno(dataObject.getString(RMonthly1Do.COLUMNS.STOCKNO.name())); 
			rMonthly1Do.setIndate(dataObject.getString(RMonthly1Do.COLUMNS.INDATE.name())); 
			rMonthly1Do.setUnit(dataObject.getString(RMonthly1Do.COLUMNS.UNIT.name())); 
			rMonthly1Do.setRqty(BigDecimalUtils.formObj(dataObject.getString(RMonthly1Do.COLUMNS.RQTY.name()))); 
			rMonthly1Do.setPost(dataObject.getString(RMonthly1Do.COLUMNS.POST.name())); 
			rMonthly1Do.setBalance(BigDecimalUtils.formObj(dataObject.getString(RMonthly1Do.COLUMNS.BALANCE.name()))); 
			rMonthly1Do.setRefbillno(dataObject.getString(RMonthly1Do.COLUMNS.REFBILLNO.name())); 
			rMonthly1Do.setDescrip(dataObject.getString(RMonthly1Do.COLUMNS.DESCRIP.name())); 
			rMonthly1Do.setDecltype(dataObject.getString(RMonthly1Do.COLUMNS.DECLTYPE.name())); 
			rMonthly1Do.setId(BigDecimalUtils.formObj(dataObject.getString(RMonthly1Do.COLUMNS.ID.name()))); 
			rMonthly1Do.setStocktype(dataObject.getString(RMonthly1Do.COLUMNS.STOCKTYPE.name())); 
			rMonthly1Do.setRlstime(dataObject.getString(RMonthly1Do.COLUMNS.RLSTIME.name())); 
			rMonthly1Do.setISequence(BigDecimalUtils.formObj(dataObject.getString(RMonthly1Do.COLUMNS.I_SEQUENCE.name()))); 
			rMonthly1Do.setModel(dataObject.getString(RMonthly1Do.COLUMNS.MODEL.name())); 
			rMonthly1Do.setSpec(dataObject.getString(RMonthly1Do.COLUMNS.SPEC.name())); 
			rMonthly1Do.setCtmcode(dataObject.getString(RMonthly1Do.COLUMNS.CTMCODE.name())); 
			rMonthly1Do.setInrmks2(dataObject.getString(RMonthly1Do.COLUMNS.INRMKS2.name())); 
			rMonthly1Do.setItem(BigDecimalUtils.formObj(dataObject.getString(RMonthly1Do.COLUMNS.ITEM.name()))); 
			return rMonthly1Do; 
		} 
 
		@Override 
		public DataObject toDataObject(final RMonthly1Do rMonthly1Do) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(RMonthly1Do.COLUMNS.SESSIONID.name(), rMonthly1Do.getSessionid()); 
			dataObject.setValue(RMonthly1Do.COLUMNS.BONDNO.name(), rMonthly1Do.getBondno()); 
			dataObject.setValue(RMonthly1Do.COLUMNS.GDSTYPE.name(), rMonthly1Do.getGdstype()); 
			dataObject.setValue(RMonthly1Do.COLUMNS.PRDTNO.name(), rMonthly1Do.getPrdtno()); 
			dataObject.setValue(RMonthly1Do.COLUMNS.DECLNO.name(), rMonthly1Do.getDeclno()); 
			dataObject.setValue(RMonthly1Do.COLUMNS.ITEMNO.name(), rMonthly1Do.getItemno()); 
			dataObject.setValue(RMonthly1Do.COLUMNS.STOCKNO.name(), rMonthly1Do.getStockno()); 
			dataObject.setValue(RMonthly1Do.COLUMNS.INDATE.name(), rMonthly1Do.getIndate()); 
			dataObject.setValue(RMonthly1Do.COLUMNS.UNIT.name(), rMonthly1Do.getUnit()); 
			dataObject.setValue(RMonthly1Do.COLUMNS.RQTY.name(), rMonthly1Do.getRqty()); 
			dataObject.setValue(RMonthly1Do.COLUMNS.POST.name(), rMonthly1Do.getPost()); 
			dataObject.setValue(RMonthly1Do.COLUMNS.BALANCE.name(), rMonthly1Do.getBalance()); 
			dataObject.setValue(RMonthly1Do.COLUMNS.REFBILLNO.name(), rMonthly1Do.getRefbillno()); 
			dataObject.setValue(RMonthly1Do.COLUMNS.DESCRIP.name(), rMonthly1Do.getDescrip()); 
			dataObject.setValue(RMonthly1Do.COLUMNS.DECLTYPE.name(), rMonthly1Do.getDecltype()); 
			dataObject.setValue(RMonthly1Do.COLUMNS.ID.name(), rMonthly1Do.getId()); 
			dataObject.setValue(RMonthly1Do.COLUMNS.STOCKTYPE.name(), rMonthly1Do.getStocktype()); 
			dataObject.setValue(RMonthly1Do.COLUMNS.RLSTIME.name(), rMonthly1Do.getRlstime()); 
			dataObject.setValue(RMonthly1Do.COLUMNS.I_SEQUENCE.name(), rMonthly1Do.getISequence()); 
			dataObject.setValue(RMonthly1Do.COLUMNS.MODEL.name(), rMonthly1Do.getModel()); 
			dataObject.setValue(RMonthly1Do.COLUMNS.SPEC.name(), rMonthly1Do.getSpec()); 
			dataObject.setValue(RMonthly1Do.COLUMNS.CTMCODE.name(), rMonthly1Do.getCtmcode()); 
			dataObject.setValue(RMonthly1Do.COLUMNS.INRMKS2.name(), rMonthly1Do.getInrmks2()); 
			dataObject.setValue(RMonthly1Do.COLUMNS.ITEM.name(), rMonthly1Do.getItem()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<RMonthly1Do> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(RMonthly1Do po) { 
		sqlWhere.add(RMonthly1Do.COLUMNS.STOCKNO.name(), po.getStockno()); 
		sqlWhere.add(RMonthly1Do.COLUMNS.BALANCE.name(), po.getBalance()); 
		sqlWhere.add(RMonthly1Do.COLUMNS.DESCRIP.name(), po.getDescrip()); 
		sqlWhere.add(RMonthly1Do.COLUMNS.STOCKTYPE.name(), po.getStocktype()); 
		sqlWhere.add(RMonthly1Do.COLUMNS.RLSTIME.name(), po.getRlstime()); 
		sqlWhere.add(RMonthly1Do.COLUMNS.I_SEQUENCE.name(), po.getISequence()); 
		sqlWhere.add(RMonthly1Do.COLUMNS.MODEL.name(), po.getModel()); 
		sqlWhere.add(RMonthly1Do.COLUMNS.SPEC.name(), po.getSpec()); 
		sqlWhere.add(RMonthly1Do.COLUMNS.CTMCODE.name(), po.getCtmcode()); 
		sqlWhere.add(RMonthly1Do.COLUMNS.INRMKS2.name(), po.getInrmks2()); 
	} 
 
} 
