package com.doc.common.dao.impl; 
 
public class OutvehicleDAOImpl extends GeneralDAOImpl<OutvehicleDo> implements OutvehicleDAOImpl { 
	public static final OutvehicleDAOImpl INSTANCE = new OutvehicleDAOImpl(); 
	public static final String TABLENAME = "OUTVEHICLE"; 

	public OutvehicleDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<OutvehicleDo> CONVERTER = new MapConverter<OutvehicleDo>() { 
 
		@Override 
		public OutvehicleDo convert(final DataObject dataObject) { 
			final OutvehicleDo outvehicleDo = new OutvehicleDo(); 
			outvehicleDo.setBondno(dataObject.getString(OutvehicleDo.COLUMNS.BONDNO.name())); 
			outvehicleDo.setDeclno(dataObject.getString(OutvehicleDo.COLUMNS.DECLNO.name())); 
			outvehicleDo.setItemno(BigDecimalUtils.formObj(dataObject.getString(OutvehicleDo.COLUMNS.ITEMNO.name()))); 
			outvehicleDo.setVehicleno(dataObject.getString(OutvehicleDo.COLUMNS.VEHICLENO.name())); 
			return outvehicleDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final OutvehicleDo outvehicleDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(OutvehicleDo.COLUMNS.BONDNO.name(), outvehicleDo.getBondno()); 
			dataObject.setValue(OutvehicleDo.COLUMNS.DECLNO.name(), outvehicleDo.getDeclno()); 
			dataObject.setValue(OutvehicleDo.COLUMNS.ITEMNO.name(), outvehicleDo.getItemno()); 
			dataObject.setValue(OutvehicleDo.COLUMNS.VEHICLENO.name(), outvehicleDo.getVehicleno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<OutvehicleDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(OutvehicleDo po) { 
		sqlWhere.add(OutvehicleDo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(OutvehicleDo.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(OutvehicleDo.COLUMNS.ITEMNO.name(), po.getItemno()); 
		sqlWhere.add(OutvehicleDo.COLUMNS.VEHICLENO.name(), po.getVehicleno()); 
	} 
 
} 
