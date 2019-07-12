package com.doc.common.dao.impl; 
 
public class WorkitemDAOImpl extends GeneralDAOImpl<WorkitemDo> implements WorkitemDAOImpl { 
	public static final WorkitemDAOImpl INSTANCE = new WorkitemDAOImpl(); 
	public static final String TABLENAME = "WORKITEM"; 

	public WorkitemDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<WorkitemDo> CONVERTER = new MapConverter<WorkitemDo>() { 
 
		@Override 
		public WorkitemDo convert(final DataObject dataObject) { 
			final WorkitemDo workitemDo = new WorkitemDo(); 
			workitemDo.setBondno(dataObject.getString(WorkitemDo.COLUMNS.BONDNO.name())); 
			workitemDo.setWorkno(dataObject.getString(WorkitemDo.COLUMNS.WORKNO.name())); 
			workitemDo.setPartno(dataObject.getString(WorkitemDo.COLUMNS.PARTNO.name())); 
			workitemDo.setCtmcode(dataObject.getString(WorkitemDo.COLUMNS.CTMCODE.name())); 
			workitemDo.setItemno(BigDecimalUtils.formObj(dataObject.getString(WorkitemDo.COLUMNS.ITEMNO.name()))); 
			workitemDo.setUseqty(BigDecimalUtils.formObj(dataObject.getString(WorkitemDo.COLUMNS.USEQTY.name()))); 
			workitemDo.setUnit(dataObject.getString(WorkitemDo.COLUMNS.UNIT.name())); 
			workitemDo.setLocation(dataObject.getString(WorkitemDo.COLUMNS.LOCATION.name())); 
			workitemDo.setOdeclno(dataObject.getString(WorkitemDo.COLUMNS.ODECLNO.name())); 
			workitemDo.setOitemno(BigDecimalUtils.formObj(dataObject.getString(WorkitemDo.COLUMNS.OITEMNO.name()))); 
			workitemDo.setBond(dataObject.getString(WorkitemDo.COLUMNS.BOND.name())); 
			workitemDo.setDescrip(dataObject.getString(WorkitemDo.COLUMNS.DESCRIP.name())); 
			workitemDo.setD8date(dataObject.getString(WorkitemDo.COLUMNS.D8DATE.name())); 
			workitemDo.setSpec(dataObject.getString(WorkitemDo.COLUMNS.SPEC.name())); 
			workitemDo.setMoitemno(BigDecimalUtils.formObj(dataObject.getString(WorkitemDo.COLUMNS.MOITEMNO.name()))); 
			return workitemDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final WorkitemDo workitemDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WorkitemDo.COLUMNS.BONDNO.name(), workitemDo.getBondno()); 
			dataObject.setValue(WorkitemDo.COLUMNS.WORKNO.name(), workitemDo.getWorkno()); 
			dataObject.setValue(WorkitemDo.COLUMNS.PARTNO.name(), workitemDo.getPartno()); 
			dataObject.setValue(WorkitemDo.COLUMNS.CTMCODE.name(), workitemDo.getCtmcode()); 
			dataObject.setValue(WorkitemDo.COLUMNS.ITEMNO.name(), workitemDo.getItemno()); 
			dataObject.setValue(WorkitemDo.COLUMNS.USEQTY.name(), workitemDo.getUseqty()); 
			dataObject.setValue(WorkitemDo.COLUMNS.UNIT.name(), workitemDo.getUnit()); 
			dataObject.setValue(WorkitemDo.COLUMNS.LOCATION.name(), workitemDo.getLocation()); 
			dataObject.setValue(WorkitemDo.COLUMNS.ODECLNO.name(), workitemDo.getOdeclno()); 
			dataObject.setValue(WorkitemDo.COLUMNS.OITEMNO.name(), workitemDo.getOitemno()); 
			dataObject.setValue(WorkitemDo.COLUMNS.BOND.name(), workitemDo.getBond()); 
			dataObject.setValue(WorkitemDo.COLUMNS.DESCRIP.name(), workitemDo.getDescrip()); 
			dataObject.setValue(WorkitemDo.COLUMNS.D8DATE.name(), workitemDo.getD8date()); 
			dataObject.setValue(WorkitemDo.COLUMNS.SPEC.name(), workitemDo.getSpec()); 
			dataObject.setValue(WorkitemDo.COLUMNS.MOITEMNO.name(), workitemDo.getMoitemno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<WorkitemDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(WorkitemDo po) { 
		sqlWhere.add(WorkitemDo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(WorkitemDo.COLUMNS.WORKNO.name(), po.getWorkno()); 
		sqlWhere.add(WorkitemDo.COLUMNS.PARTNO.name(), po.getPartno()); 
		sqlWhere.add(WorkitemDo.COLUMNS.CTMCODE.name(), po.getCtmcode()); 
		sqlWhere.add(WorkitemDo.COLUMNS.ITEMNO.name(), po.getItemno()); 
	} 
 
} 
