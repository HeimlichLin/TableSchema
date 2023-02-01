package com.doc.common.dao.impl; 
 
public class Clearf2DAOImpl extends GeneralDAOImpl<Clearf2Po> implements Clearf2DAO { 
	public static final Clearf2DAOImpl INSTANCE = new Clearf2DAOImpl(); 
	public static final String TABLENAME = "CLEARF2"; 

	public Clearf2DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Clearf2Po> CONVERTER = new MapConverter<Clearf2Po>() { 
 
		@Override 
		public Clearf2Po convert(final DataObject dataObject) { 
			final Clearf2Po clearf2Po = new Clearf2Po(); 
			clearf2Po.setBondno(dataObject.getString(Clearf2Po.COLUMNS.BONDNO.name())); 
			clearf2Po.setDeclno(dataObject.getString(Clearf2Po.COLUMNS.DECLNO.name())); 
			clearf2Po.setItemno(BigDecimalUtils.formObj(dataObject.getValue(Clearf2Po.COLUMNS.ITEMNO.name()))); 
			clearf2Po.setDecltype(dataObject.getString(Clearf2Po.COLUMNS.DECLTYPE.name())); 
			clearf2Po.setPrdtno(dataObject.getString(Clearf2Po.COLUMNS.PRDTNO.name())); 
			clearf2Po.setQty(BigDecimalUtils.formObj(dataObject.getValue(Clearf2Po.COLUMNS.QTY.name()))); 
			clearf2Po.setPost(dataObject.getString(Clearf2Po.COLUMNS.POST.name())); 
			clearf2Po.setDutytype(dataObject.getString(Clearf2Po.COLUMNS.DUTYTYPE.name())); 
			clearf2Po.setOdeclno(dataObject.getString(Clearf2Po.COLUMNS.ODECLNO.name())); 
			clearf2Po.setOitemno(BigDecimalUtils.formObj(dataObject.getValue(Clearf2Po.COLUMNS.OITEMNO.name()))); 
			clearf2Po.setOdecltype(dataObject.getString(Clearf2Po.COLUMNS.ODECLTYPE.name())); 
			clearf2Po.setOprdtno(dataObject.getString(Clearf2Po.COLUMNS.OPRDTNO.name())); 
			clearf2Po.setOqty(BigDecimalUtils.formObj(dataObject.getValue(Clearf2Po.COLUMNS.OQTY.name()))); 
			clearf2Po.setOpost(dataObject.getString(Clearf2Po.COLUMNS.OPOST.name())); 
			clearf2Po.setOdutytype(dataObject.getString(Clearf2Po.COLUMNS.ODUTYTYPE.name())); 
			clearf2Po.setOutstatus(dataObject.getString(Clearf2Po.COLUMNS.OUTSTATUS.name())); 
			clearf2Po.setF4date(dataObject.getString(Clearf2Po.COLUMNS.F4DATE.name())); 
			clearf2Po.setF2date(dataObject.getString(Clearf2Po.COLUMNS.F2DATE.name())); 
			clearf2Po.setUnit(dataObject.getString(Clearf2Po.COLUMNS.UNIT.name())); 
			clearf2Po.setF2unit(dataObject.getString(Clearf2Po.COLUMNS.F2UNIT.name())); 
			clearf2Po.setBomquilty(BigDecimalUtils.formObj(dataObject.getValue(Clearf2Po.COLUMNS.BOMQUILTY.name()))); 
			clearf2Po.setBomqty(BigDecimalUtils.formObj(dataObject.getValue(Clearf2Po.COLUMNS.BOMQTY.name()))); 
			return clearf2Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Clearf2Po clearf2Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Clearf2Po.COLUMNS.BONDNO.name(), clearf2Po.getBondno()); 
			dataObject.setValue(Clearf2Po.COLUMNS.DECLNO.name(), clearf2Po.getDeclno()); 
			dataObject.setValue(Clearf2Po.COLUMNS.ITEMNO.name(), clearf2Po.getItemno()); 
			dataObject.setValue(Clearf2Po.COLUMNS.DECLTYPE.name(), clearf2Po.getDecltype()); 
			dataObject.setValue(Clearf2Po.COLUMNS.PRDTNO.name(), clearf2Po.getPrdtno()); 
			dataObject.setValue(Clearf2Po.COLUMNS.QTY.name(), clearf2Po.getQty()); 
			dataObject.setValue(Clearf2Po.COLUMNS.POST.name(), clearf2Po.getPost()); 
			dataObject.setValue(Clearf2Po.COLUMNS.DUTYTYPE.name(), clearf2Po.getDutytype()); 
			dataObject.setValue(Clearf2Po.COLUMNS.ODECLNO.name(), clearf2Po.getOdeclno()); 
			dataObject.setValue(Clearf2Po.COLUMNS.OITEMNO.name(), clearf2Po.getOitemno()); 
			dataObject.setValue(Clearf2Po.COLUMNS.ODECLTYPE.name(), clearf2Po.getOdecltype()); 
			dataObject.setValue(Clearf2Po.COLUMNS.OPRDTNO.name(), clearf2Po.getOprdtno()); 
			dataObject.setValue(Clearf2Po.COLUMNS.OQTY.name(), clearf2Po.getOqty()); 
			dataObject.setValue(Clearf2Po.COLUMNS.OPOST.name(), clearf2Po.getOpost()); 
			dataObject.setValue(Clearf2Po.COLUMNS.ODUTYTYPE.name(), clearf2Po.getOdutytype()); 
			dataObject.setValue(Clearf2Po.COLUMNS.OUTSTATUS.name(), clearf2Po.getOutstatus()); 
			dataObject.setValue(Clearf2Po.COLUMNS.F4DATE.name(), clearf2Po.getF4date()); 
			dataObject.setValue(Clearf2Po.COLUMNS.F2DATE.name(), clearf2Po.getF2date()); 
			dataObject.setValue(Clearf2Po.COLUMNS.UNIT.name(), clearf2Po.getUnit()); 
			dataObject.setValue(Clearf2Po.COLUMNS.F2UNIT.name(), clearf2Po.getF2unit()); 
			dataObject.setValue(Clearf2Po.COLUMNS.BOMQUILTY.name(), clearf2Po.getBomquilty()); 
			dataObject.setValue(Clearf2Po.COLUMNS.BOMQTY.name(), clearf2Po.getBomqty()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Clearf2Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Clearf2Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
