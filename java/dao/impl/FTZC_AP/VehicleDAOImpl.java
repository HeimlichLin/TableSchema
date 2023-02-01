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
			vehiclePo.setBfNo(dataObject.getString(VehiclePo.COLUMNS.BF_NO.name())); 
			vehiclePo.setDeclNo(dataObject.getString(VehiclePo.COLUMNS.DECL_NO.name())); 
			vehiclePo.setItemNo(BigDecimalUtils.formObj(dataObject.getValue(VehiclePo.COLUMNS.ITEM_NO.name()))); 
			vehiclePo.setVehicleNo(dataObject.getString(VehiclePo.COLUMNS.VEHICLE_NO.name())); 
			vehiclePo.setVehicleOut(dataObject.getString(VehiclePo.COLUMNS.VEHICLE_OUT.name())); 
			vehiclePo.setEngineNo(dataObject.getString(VehiclePo.COLUMNS.ENGINE_NO.name())); 
			vehiclePo.setTransId(dataObject.getString(VehiclePo.COLUMNS.TRANS_ID.name())); 
			return vehiclePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final VehiclePo vehiclePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(VehiclePo.COLUMNS.BF_NO.name(), vehiclePo.getBfNo()); 
			dataObject.setValue(VehiclePo.COLUMNS.DECL_NO.name(), vehiclePo.getDeclNo()); 
			dataObject.setValue(VehiclePo.COLUMNS.ITEM_NO.name(), vehiclePo.getItemNo()); 
			dataObject.setValue(VehiclePo.COLUMNS.VEHICLE_NO.name(), vehiclePo.getVehicleNo()); 
			dataObject.setValue(VehiclePo.COLUMNS.VEHICLE_OUT.name(), vehiclePo.getVehicleOut()); 
			dataObject.setValue(VehiclePo.COLUMNS.ENGINE_NO.name(), vehiclePo.getEngineNo()); 
			dataObject.setValue(VehiclePo.COLUMNS.TRANS_ID.name(), vehiclePo.getTransId()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<VehiclePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(VehiclePo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
