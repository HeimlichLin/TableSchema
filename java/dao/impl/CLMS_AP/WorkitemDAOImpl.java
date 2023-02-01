package com.doc.common.dao.impl; 
 
public class WorkitemDAOImpl extends GeneralDAOImpl<WorkitemPo> implements WorkitemDAO { 
	public static final WorkitemDAOImpl INSTANCE = new WorkitemDAOImpl(); 
	public static final String TABLENAME = "WORKITEM"; 

	public WorkitemDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<WorkitemPo> CONVERTER = new MapConverter<WorkitemPo>() { 
 
		@Override 
		public WorkitemPo convert(final DataObject dataObject) { 
			final WorkitemPo workitemPo = new WorkitemPo(); 
			workitemPo.setBondno(dataObject.getString(WorkitemPo.COLUMNS.BONDNO.name())); 
			workitemPo.setWorkno(dataObject.getString(WorkitemPo.COLUMNS.WORKNO.name())); 
			workitemPo.setPartno(dataObject.getString(WorkitemPo.COLUMNS.PARTNO.name())); 
			workitemPo.setCtmcode(dataObject.getString(WorkitemPo.COLUMNS.CTMCODE.name())); 
			workitemPo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(WorkitemPo.COLUMNS.ITEMNO.name()))); 
			workitemPo.setUseqty(BigDecimalUtils.formObj(dataObject.getValue(WorkitemPo.COLUMNS.USEQTY.name()))); 
			workitemPo.setUnit(dataObject.getString(WorkitemPo.COLUMNS.UNIT.name())); 
			workitemPo.setLocation(dataObject.getString(WorkitemPo.COLUMNS.LOCATION.name())); 
			workitemPo.setOdeclno(dataObject.getString(WorkitemPo.COLUMNS.ODECLNO.name())); 
			workitemPo.setOitemno(BigDecimalUtils.formObj(dataObject.getValue(WorkitemPo.COLUMNS.OITEMNO.name()))); 
			workitemPo.setBond(dataObject.getString(WorkitemPo.COLUMNS.BOND.name())); 
			workitemPo.setDescrip(dataObject.getString(WorkitemPo.COLUMNS.DESCRIP.name())); 
			workitemPo.setD8date(dataObject.getString(WorkitemPo.COLUMNS.D8DATE.name())); 
			workitemPo.setSpec(dataObject.getString(WorkitemPo.COLUMNS.SPEC.name())); 
			workitemPo.setMoitemno(BigDecimalUtils.formObj(dataObject.getValue(WorkitemPo.COLUMNS.MOITEMNO.name()))); 
			return workitemPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final WorkitemPo workitemPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WorkitemPo.COLUMNS.BONDNO.name(), workitemPo.getBondno()); 
			dataObject.setValue(WorkitemPo.COLUMNS.WORKNO.name(), workitemPo.getWorkno()); 
			dataObject.setValue(WorkitemPo.COLUMNS.PARTNO.name(), workitemPo.getPartno()); 
			dataObject.setValue(WorkitemPo.COLUMNS.CTMCODE.name(), workitemPo.getCtmcode()); 
			dataObject.setValue(WorkitemPo.COLUMNS.ITEMNO.name(), workitemPo.getItemno()); 
			dataObject.setValue(WorkitemPo.COLUMNS.USEQTY.name(), workitemPo.getUseqty()); 
			dataObject.setValue(WorkitemPo.COLUMNS.UNIT.name(), workitemPo.getUnit()); 
			dataObject.setValue(WorkitemPo.COLUMNS.LOCATION.name(), workitemPo.getLocation()); 
			dataObject.setValue(WorkitemPo.COLUMNS.ODECLNO.name(), workitemPo.getOdeclno()); 
			dataObject.setValue(WorkitemPo.COLUMNS.OITEMNO.name(), workitemPo.getOitemno()); 
			dataObject.setValue(WorkitemPo.COLUMNS.BOND.name(), workitemPo.getBond()); 
			dataObject.setValue(WorkitemPo.COLUMNS.DESCRIP.name(), workitemPo.getDescrip()); 
			dataObject.setValue(WorkitemPo.COLUMNS.D8DATE.name(), workitemPo.getD8date()); 
			dataObject.setValue(WorkitemPo.COLUMNS.SPEC.name(), workitemPo.getSpec()); 
			dataObject.setValue(WorkitemPo.COLUMNS.MOITEMNO.name(), workitemPo.getMoitemno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<WorkitemPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(WorkitemPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(WorkitemPo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(WorkitemPo.COLUMNS.WORKNO.name(), po.getWorkno()); 
		sqlWhere.add(WorkitemPo.COLUMNS.PARTNO.name(), po.getPartno()); 
		sqlWhere.add(WorkitemPo.COLUMNS.CTMCODE.name(), po.getCtmcode()); 
		sqlWhere.add(WorkitemPo.COLUMNS.ITEMNO.name(), po.getItemno()); 
		return sqlWhere; 
	} 
 
} 
