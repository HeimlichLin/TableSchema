package com.doc.common.dao.impl; 
 
public class RMonthly1DAOImpl extends GeneralDAOImpl<RMonthly1Po> implements RMonthly1DAO { 
	public static final RMonthly1DAOImpl INSTANCE = new RMonthly1DAOImpl(); 
	public static final String TABLENAME = "R_MONTHLY1"; 

	public RMonthly1DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<RMonthly1Po> CONVERTER = new MapConverter<RMonthly1Po>() { 
 
		@Override 
		public RMonthly1Po convert(final DataObject dataObject) { 
			final RMonthly1Po rMonthly1Po = new RMonthly1Po(); 
			rMonthly1Po.setSessionid(dataObject.getString(RMonthly1Po.COLUMNS.SESSIONID.name())); 
			rMonthly1Po.setBondno(dataObject.getString(RMonthly1Po.COLUMNS.BONDNO.name())); 
			rMonthly1Po.setGdstype(dataObject.getString(RMonthly1Po.COLUMNS.GDSTYPE.name())); 
			rMonthly1Po.setPrdtno(dataObject.getString(RMonthly1Po.COLUMNS.PRDTNO.name())); 
			rMonthly1Po.setDeclno(dataObject.getString(RMonthly1Po.COLUMNS.DECLNO.name())); 
			rMonthly1Po.setItemno(BigDecimalUtils.formObj(dataObject.getValue(RMonthly1Po.COLUMNS.ITEMNO.name()))); 
			rMonthly1Po.setStockno(dataObject.getString(RMonthly1Po.COLUMNS.STOCKNO.name())); 
			rMonthly1Po.setIndate(dataObject.getString(RMonthly1Po.COLUMNS.INDATE.name())); 
			rMonthly1Po.setUnit(dataObject.getString(RMonthly1Po.COLUMNS.UNIT.name())); 
			rMonthly1Po.setRqty(BigDecimalUtils.formObj(dataObject.getValue(RMonthly1Po.COLUMNS.RQTY.name()))); 
			rMonthly1Po.setPost(dataObject.getString(RMonthly1Po.COLUMNS.POST.name())); 
			rMonthly1Po.setBalance(BigDecimalUtils.formObj(dataObject.getValue(RMonthly1Po.COLUMNS.BALANCE.name()))); 
			rMonthly1Po.setRefbillno(dataObject.getString(RMonthly1Po.COLUMNS.REFBILLNO.name())); 
			rMonthly1Po.setDescrip(dataObject.getString(RMonthly1Po.COLUMNS.DESCRIP.name())); 
			rMonthly1Po.setDecltype(dataObject.getString(RMonthly1Po.COLUMNS.DECLTYPE.name())); 
			rMonthly1Po.setId(BigDecimalUtils.formObj(dataObject.getValue(RMonthly1Po.COLUMNS.ID.name()))); 
			rMonthly1Po.setStocktype(dataObject.getString(RMonthly1Po.COLUMNS.STOCKTYPE.name())); 
			rMonthly1Po.setRlstime(dataObject.getString(RMonthly1Po.COLUMNS.RLSTIME.name())); 
			rMonthly1Po.setISequence(BigDecimalUtils.formObj(dataObject.getValue(RMonthly1Po.COLUMNS.I_SEQUENCE.name()))); 
			rMonthly1Po.setModel(dataObject.getString(RMonthly1Po.COLUMNS.MODEL.name())); 
			rMonthly1Po.setSpec(dataObject.getString(RMonthly1Po.COLUMNS.SPEC.name())); 
			rMonthly1Po.setCtmcode(dataObject.getString(RMonthly1Po.COLUMNS.CTMCODE.name())); 
			rMonthly1Po.setInrmks2(dataObject.getString(RMonthly1Po.COLUMNS.INRMKS2.name())); 
			rMonthly1Po.setItem(BigDecimalUtils.formObj(dataObject.getValue(RMonthly1Po.COLUMNS.ITEM.name()))); 
			return rMonthly1Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final RMonthly1Po rMonthly1Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(RMonthly1Po.COLUMNS.SESSIONID.name(), rMonthly1Po.getSessionid()); 
			dataObject.setValue(RMonthly1Po.COLUMNS.BONDNO.name(), rMonthly1Po.getBondno()); 
			dataObject.setValue(RMonthly1Po.COLUMNS.GDSTYPE.name(), rMonthly1Po.getGdstype()); 
			dataObject.setValue(RMonthly1Po.COLUMNS.PRDTNO.name(), rMonthly1Po.getPrdtno()); 
			dataObject.setValue(RMonthly1Po.COLUMNS.DECLNO.name(), rMonthly1Po.getDeclno()); 
			dataObject.setValue(RMonthly1Po.COLUMNS.ITEMNO.name(), rMonthly1Po.getItemno()); 
			dataObject.setValue(RMonthly1Po.COLUMNS.STOCKNO.name(), rMonthly1Po.getStockno()); 
			dataObject.setValue(RMonthly1Po.COLUMNS.INDATE.name(), rMonthly1Po.getIndate()); 
			dataObject.setValue(RMonthly1Po.COLUMNS.UNIT.name(), rMonthly1Po.getUnit()); 
			dataObject.setValue(RMonthly1Po.COLUMNS.RQTY.name(), rMonthly1Po.getRqty()); 
			dataObject.setValue(RMonthly1Po.COLUMNS.POST.name(), rMonthly1Po.getPost()); 
			dataObject.setValue(RMonthly1Po.COLUMNS.BALANCE.name(), rMonthly1Po.getBalance()); 
			dataObject.setValue(RMonthly1Po.COLUMNS.REFBILLNO.name(), rMonthly1Po.getRefbillno()); 
			dataObject.setValue(RMonthly1Po.COLUMNS.DESCRIP.name(), rMonthly1Po.getDescrip()); 
			dataObject.setValue(RMonthly1Po.COLUMNS.DECLTYPE.name(), rMonthly1Po.getDecltype()); 
			dataObject.setValue(RMonthly1Po.COLUMNS.ID.name(), rMonthly1Po.getId()); 
			dataObject.setValue(RMonthly1Po.COLUMNS.STOCKTYPE.name(), rMonthly1Po.getStocktype()); 
			dataObject.setValue(RMonthly1Po.COLUMNS.RLSTIME.name(), rMonthly1Po.getRlstime()); 
			dataObject.setValue(RMonthly1Po.COLUMNS.I_SEQUENCE.name(), rMonthly1Po.getISequence()); 
			dataObject.setValue(RMonthly1Po.COLUMNS.MODEL.name(), rMonthly1Po.getModel()); 
			dataObject.setValue(RMonthly1Po.COLUMNS.SPEC.name(), rMonthly1Po.getSpec()); 
			dataObject.setValue(RMonthly1Po.COLUMNS.CTMCODE.name(), rMonthly1Po.getCtmcode()); 
			dataObject.setValue(RMonthly1Po.COLUMNS.INRMKS2.name(), rMonthly1Po.getInrmks2()); 
			dataObject.setValue(RMonthly1Po.COLUMNS.ITEM.name(), rMonthly1Po.getItem()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<RMonthly1Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(RMonthly1Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(RMonthly1Po.COLUMNS.SESSIONID.name(), po.getSessionid()); 
		sqlWhere.add(RMonthly1Po.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(RMonthly1Po.COLUMNS.GDSTYPE.name(), po.getGdstype()); 
		sqlWhere.add(RMonthly1Po.COLUMNS.PRDTNO.name(), po.getPrdtno()); 
		sqlWhere.add(RMonthly1Po.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(RMonthly1Po.COLUMNS.ITEMNO.name(), po.getItemno()); 
		sqlWhere.add(RMonthly1Po.COLUMNS.INDATE.name(), po.getIndate()); 
		sqlWhere.add(RMonthly1Po.COLUMNS.UNIT.name(), po.getUnit()); 
		sqlWhere.add(RMonthly1Po.COLUMNS.RQTY.name(), po.getRqty()); 
		sqlWhere.add(RMonthly1Po.COLUMNS.POST.name(), po.getPost()); 
		sqlWhere.add(RMonthly1Po.COLUMNS.REFBILLNO.name(), po.getRefbillno()); 
		sqlWhere.add(RMonthly1Po.COLUMNS.DECLTYPE.name(), po.getDecltype()); 
		sqlWhere.add(RMonthly1Po.COLUMNS.ID.name(), po.getId()); 
		sqlWhere.add(RMonthly1Po.COLUMNS.ITEM.name(), po.getItem()); 
		return sqlWhere; 
	} 
 
} 
