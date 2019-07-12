package com.doc.common.dao.impl; 
 
public class VehicleDAOImpl extends GeneralDAOImpl<VehicleDo> implements VehicleDAOImpl { 
	public static final VehicleDAOImpl INSTANCE = new VehicleDAOImpl(); 
	public static final String TABLENAME = "VEHICLE"; 

	public VehicleDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<VehicleDo> CONVERTER = new MapConverter<VehicleDo>() { 
 
		@Override 
		public VehicleDo convert(final DataObject dataObject) { 
			final VehicleDo vehicleDo = new VehicleDo(); 
			vehicleDo.setBondno(dataObject.getString(VehicleDo.COLUMNS.BONDNO.name())); 
			vehicleDo.setDeclno(dataObject.getString(VehicleDo.COLUMNS.DECLNO.name())); 
			vehicleDo.setItemno(BigDecimalUtils.formObj(dataObject.getString(VehicleDo.COLUMNS.ITEMNO.name()))); 
			vehicleDo.setVehicleno(dataObject.getString(VehicleDo.COLUMNS.VEHICLENO.name())); 
			vehicleDo.setVehicleout(dataObject.getString(VehicleDo.COLUMNS.VEHICLEOUT.name())); 
			return vehicleDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final VehicleDo vehicleDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(VehicleDo.COLUMNS.BONDNO.name(), vehicleDo.getBondno()); 
			dataObject.setValue(VehicleDo.COLUMNS.DECLNO.name(), vehicleDo.getDeclno()); 
			dataObject.setValue(VehicleDo.COLUMNS.ITEMNO.name(), vehicleDo.getItemno()); 
			dataObject.setValue(VehicleDo.COLUMNS.VEHICLENO.name(), vehicleDo.getVehicleno()); 
			dataObject.setValue(VehicleDo.COLUMNS.VEHICLEOUT.name(), vehicleDo.getVehicleout()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<VehicleDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(VehicleDo po) { 
		sqlWhere.add(VehicleDo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(VehicleDo.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(VehicleDo.COLUMNS.ITEMNO.name(), po.getItemno()); 
		sqlWhere.add(VehicleDo.COLUMNS.VEHICLENO.name(), po.getVehicleno()); 
	} 
 
} 
