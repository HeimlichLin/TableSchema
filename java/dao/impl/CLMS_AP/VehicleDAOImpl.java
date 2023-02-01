package com.doc.common.dao.impl; 
 
public class VehicleDAOImpl extends GeneralDAOImpl<VehiclePo> implements VehicleDAO { 
	public static final VehicleDAOImpl INSTANCE = new VehicleDAOImpl(); 
	public static final String TABLENAME = "VEHICLE"; 

	public VehicleDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<VehiclePo> CONVERTER = new MapConverter<VehiclePo>() { 
 
		@Override 
		public VehiclePo convert(final DataObject dataObject) { 
			final VehiclePo vehiclePo = new VehiclePo(); 
			vehiclePo.setBondno(dataObject.getString(VehiclePo.COLUMNS.BONDNO.name())); 
			vehiclePo.setDeclno(dataObject.getString(VehiclePo.COLUMNS.DECLNO.name())); 
			vehiclePo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(VehiclePo.COLUMNS.ITEMNO.name()))); 
			vehiclePo.setVehicleno(dataObject.getString(VehiclePo.COLUMNS.VEHICLENO.name())); 
			vehiclePo.setVehicleout(dataObject.getString(VehiclePo.COLUMNS.VEHICLEOUT.name())); 
			return vehiclePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final VehiclePo vehiclePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(VehiclePo.COLUMNS.BONDNO.name(), vehiclePo.getBondno()); 
			dataObject.setValue(VehiclePo.COLUMNS.DECLNO.name(), vehiclePo.getDeclno()); 
			dataObject.setValue(VehiclePo.COLUMNS.ITEMNO.name(), vehiclePo.getItemno()); 
			dataObject.setValue(VehiclePo.COLUMNS.VEHICLENO.name(), vehiclePo.getVehicleno()); 
			dataObject.setValue(VehiclePo.COLUMNS.VEHICLEOUT.name(), vehiclePo.getVehicleout()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<VehiclePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(VehiclePo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(VehiclePo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(VehiclePo.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(VehiclePo.COLUMNS.ITEMNO.name(), po.getItemno()); 
		sqlWhere.add(VehiclePo.COLUMNS.VEHICLENO.name(), po.getVehicleno()); 
		return sqlWhere; 
	} 
 
} 
