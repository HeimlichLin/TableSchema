package com.doc.common.dao.impl; 
 
public class Clearf2DAOImpl extends GeneralDAOImpl<Clearf2Do> implements Clearf2DAOImpl { 
	public static final Clearf2DAOImpl INSTANCE = new Clearf2DAOImpl(); 
	public static final String TABLENAME = "CLEARF2"; 

	public Clearf2DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<Clearf2Do> CONVERTER = new MapConverter<Clearf2Do>() { 
 
		@Override 
		public Clearf2Do convert(final DataObject dataObject) { 
			final Clearf2Do clearf2Do = new Clearf2Do(); 
			clearf2Do.setBondno(dataObject.getString(Clearf2Do.COLUMNS.BONDNO.name())); 
			clearf2Do.setDeclno(dataObject.getString(Clearf2Do.COLUMNS.DECLNO.name())); 
			clearf2Do.setItemno(BigDecimalUtils.formObj(dataObject.getString(Clearf2Do.COLUMNS.ITEMNO.name()))); 
			clearf2Do.setDecltype(dataObject.getString(Clearf2Do.COLUMNS.DECLTYPE.name())); 
			clearf2Do.setPrdtno(dataObject.getString(Clearf2Do.COLUMNS.PRDTNO.name())); 
			clearf2Do.setQty(BigDecimalUtils.formObj(dataObject.getString(Clearf2Do.COLUMNS.QTY.name()))); 
			clearf2Do.setPost(dataObject.getString(Clearf2Do.COLUMNS.POST.name())); 
			clearf2Do.setDutytype(dataObject.getString(Clearf2Do.COLUMNS.DUTYTYPE.name())); 
			clearf2Do.setOdeclno(dataObject.getString(Clearf2Do.COLUMNS.ODECLNO.name())); 
			clearf2Do.setOitemno(BigDecimalUtils.formObj(dataObject.getString(Clearf2Do.COLUMNS.OITEMNO.name()))); 
			clearf2Do.setOdecltype(dataObject.getString(Clearf2Do.COLUMNS.ODECLTYPE.name())); 
			clearf2Do.setOprdtno(dataObject.getString(Clearf2Do.COLUMNS.OPRDTNO.name())); 
			clearf2Do.setOqty(BigDecimalUtils.formObj(dataObject.getString(Clearf2Do.COLUMNS.OQTY.name()))); 
			clearf2Do.setOpost(dataObject.getString(Clearf2Do.COLUMNS.OPOST.name())); 
			clearf2Do.setOdutytype(dataObject.getString(Clearf2Do.COLUMNS.ODUTYTYPE.name())); 
			clearf2Do.setOutstatus(dataObject.getString(Clearf2Do.COLUMNS.OUTSTATUS.name())); 
			clearf2Do.setF4date(dataObject.getString(Clearf2Do.COLUMNS.F4DATE.name())); 
			clearf2Do.setF2date(dataObject.getString(Clearf2Do.COLUMNS.F2DATE.name())); 
			clearf2Do.setUnit(dataObject.getString(Clearf2Do.COLUMNS.UNIT.name())); 
			clearf2Do.setF2unit(dataObject.getString(Clearf2Do.COLUMNS.F2UNIT.name())); 
			clearf2Do.setBomquilty(BigDecimalUtils.formObj(dataObject.getString(Clearf2Do.COLUMNS.BOMQUILTY.name()))); 
			clearf2Do.setBomqty(BigDecimalUtils.formObj(dataObject.getString(Clearf2Do.COLUMNS.BOMQTY.name()))); 
			return clearf2Do; 
		} 
 
		@Override 
		public DataObject toDataObject(final Clearf2Do clearf2Do) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Clearf2Do.COLUMNS.BONDNO.name(), clearf2Do.getBondno()); 
			dataObject.setValue(Clearf2Do.COLUMNS.DECLNO.name(), clearf2Do.getDeclno()); 
			dataObject.setValue(Clearf2Do.COLUMNS.ITEMNO.name(), clearf2Do.getItemno()); 
			dataObject.setValue(Clearf2Do.COLUMNS.DECLTYPE.name(), clearf2Do.getDecltype()); 
			dataObject.setValue(Clearf2Do.COLUMNS.PRDTNO.name(), clearf2Do.getPrdtno()); 
			dataObject.setValue(Clearf2Do.COLUMNS.QTY.name(), clearf2Do.getQty()); 
			dataObject.setValue(Clearf2Do.COLUMNS.POST.name(), clearf2Do.getPost()); 
			dataObject.setValue(Clearf2Do.COLUMNS.DUTYTYPE.name(), clearf2Do.getDutytype()); 
			dataObject.setValue(Clearf2Do.COLUMNS.ODECLNO.name(), clearf2Do.getOdeclno()); 
			dataObject.setValue(Clearf2Do.COLUMNS.OITEMNO.name(), clearf2Do.getOitemno()); 
			dataObject.setValue(Clearf2Do.COLUMNS.ODECLTYPE.name(), clearf2Do.getOdecltype()); 
			dataObject.setValue(Clearf2Do.COLUMNS.OPRDTNO.name(), clearf2Do.getOprdtno()); 
			dataObject.setValue(Clearf2Do.COLUMNS.OQTY.name(), clearf2Do.getOqty()); 
			dataObject.setValue(Clearf2Do.COLUMNS.OPOST.name(), clearf2Do.getOpost()); 
			dataObject.setValue(Clearf2Do.COLUMNS.ODUTYTYPE.name(), clearf2Do.getOdutytype()); 
			dataObject.setValue(Clearf2Do.COLUMNS.OUTSTATUS.name(), clearf2Do.getOutstatus()); 
			dataObject.setValue(Clearf2Do.COLUMNS.F4DATE.name(), clearf2Do.getF4date()); 
			dataObject.setValue(Clearf2Do.COLUMNS.F2DATE.name(), clearf2Do.getF2date()); 
			dataObject.setValue(Clearf2Do.COLUMNS.UNIT.name(), clearf2Do.getUnit()); 
			dataObject.setValue(Clearf2Do.COLUMNS.F2UNIT.name(), clearf2Do.getF2unit()); 
			dataObject.setValue(Clearf2Do.COLUMNS.BOMQUILTY.name(), clearf2Do.getBomquilty()); 
			dataObject.setValue(Clearf2Do.COLUMNS.BOMQTY.name(), clearf2Do.getBomqty()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Clearf2Do> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Clearf2Do po) { 
	} 
 
} 
