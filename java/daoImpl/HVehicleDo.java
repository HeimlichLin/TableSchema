package com.doc.common.dao.impl; 
 
public class HVehicleDAO extends GeneralDAOImpl<HVehicleDo> implements HVehicleDAO { 
	public static final HVehicleDAOImpl INSTANCE = new HVehicleDAOImpl(); 
	public static final String TABLENAME = "H_VEHICLE"; 

	public HVehicleDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<HVehicleDo> CONVERTER = new MapConverter<HVehicleDo>() { 
 
		@Override 
		public HVehicleDo convert(final DataObject dataObject) { 
			final HVehicleDo hVehicleDo = new HVehicleDo(); 
			hVehicleDo.setBondno(dataObject.getString(HVehicleDo.COLUMNS.BONDNO.name())); 
			hVehicleDo.setDeclno(dataObject.getString(HVehicleDo.COLUMNS.DECLNO.name())); 
			hVehicleDo.setItemno(BigDecimalUtils.formObj(dataObject.getString(HVehicleDo.COLUMNS.ITEMNO.name()))); 
			hVehicleDo.setVehicleno(dataObject.getString(HVehicleDo.COLUMNS.VEHICLENO.name())); 
			hVehicleDo.setVehicleout(dataObject.getString(HVehicleDo.COLUMNS.VEHICLEOUT.name())); 
			hVehicleDo.setUpdtime(dataObject.getString(HVehicleDo.COLUMNS.UPDTIME.name())); 
			return hVehicleDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final HVehicleDo hVehicleDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(HVehicleDo.COLUMNS.BONDNO.name(), hVehicleDo.getBondno()); 
			dataObject.setValue(HVehicleDo.COLUMNS.DECLNO.name(), hVehicleDo.getDeclno()); 
			dataObject.setValue(HVehicleDo.COLUMNS.ITEMNO.name(), hVehicleDo.getItemno()); 
			dataObject.setValue(HVehicleDo.COLUMNS.VEHICLENO.name(), hVehicleDo.getVehicleno()); 
			dataObject.setValue(HVehicleDo.COLUMNS.VEHICLEOUT.name(), hVehicleDo.getVehicleout()); 
			dataObject.setValue(HVehicleDo.COLUMNS.UPDTIME.name(), hVehicleDo.getUpdtime()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<HVehicleDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(HVehicleDo po) { 
		sqlWhere.add(HVehicleDo.COLUMNS.VEHICLEOUT.name(), po.getVehicleout()); 
		sqlWhere.add(HVehicleDo.COLUMNS.UPDTIME.name(), po.getUpdtime()); 
	} 
 
} 
