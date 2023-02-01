package com.doc.common.dao.impl; 
 
public class HVehicleDAOImpl extends GeneralDAOImpl<HVehiclePo> implements HVehicleDAO { 
	public static final HVehicleDAOImpl INSTANCE = new HVehicleDAOImpl(); 
	public static final String TABLENAME = "H_VEHICLE"; 

	public HVehicleDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<HVehiclePo> CONVERTER = new MapConverter<HVehiclePo>() { 
 
		@Override 
		public HVehiclePo convert(final DataObject dataObject) { 
			final HVehiclePo hVehiclePo = new HVehiclePo(); 
			hVehiclePo.setBondno(dataObject.getString(HVehiclePo.COLUMNS.BONDNO.name())); 
			hVehiclePo.setDeclno(dataObject.getString(HVehiclePo.COLUMNS.DECLNO.name())); 
			hVehiclePo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(HVehiclePo.COLUMNS.ITEMNO.name()))); 
			hVehiclePo.setVehicleno(dataObject.getString(HVehiclePo.COLUMNS.VEHICLENO.name())); 
			hVehiclePo.setVehicleout(dataObject.getString(HVehiclePo.COLUMNS.VEHICLEOUT.name())); 
			hVehiclePo.setUpdtime(dataObject.getString(HVehiclePo.COLUMNS.UPDTIME.name())); 
			return hVehiclePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final HVehiclePo hVehiclePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(HVehiclePo.COLUMNS.BONDNO.name(), hVehiclePo.getBondno()); 
			dataObject.setValue(HVehiclePo.COLUMNS.DECLNO.name(), hVehiclePo.getDeclno()); 
			dataObject.setValue(HVehiclePo.COLUMNS.ITEMNO.name(), hVehiclePo.getItemno()); 
			dataObject.setValue(HVehiclePo.COLUMNS.VEHICLENO.name(), hVehiclePo.getVehicleno()); 
			dataObject.setValue(HVehiclePo.COLUMNS.VEHICLEOUT.name(), hVehiclePo.getVehicleout()); 
			dataObject.setValue(HVehiclePo.COLUMNS.UPDTIME.name(), hVehiclePo.getUpdtime()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<HVehiclePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(HVehiclePo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(HVehiclePo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(HVehiclePo.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(HVehiclePo.COLUMNS.ITEMNO.name(), po.getItemno()); 
		sqlWhere.add(HVehiclePo.COLUMNS.VEHICLENO.name(), po.getVehicleno()); 
		return sqlWhere; 
	} 
 
} 
