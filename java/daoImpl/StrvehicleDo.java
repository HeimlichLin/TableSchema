package com.doc.common.dao.impl; 
 
public class StrvehicleDAO extends GeneralDAOImpl<StrvehicleDo> implements StrvehicleDAO { 
	public static final StrvehicleDAOImpl INSTANCE = new StrvehicleDAOImpl(); 
	public static final String TABLENAME = "STRVEHICLE"; 

	public StrvehicleDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<StrvehicleDo> CONVERTER = new MapConverter<StrvehicleDo>() { 
 
		@Override 
		public StrvehicleDo convert(final DataObject dataObject) { 
			final StrvehicleDo strvehicleDo = new StrvehicleDo(); 
			strvehicleDo.setBondno(dataObject.getString(StrvehicleDo.COLUMNS.BONDNO.name())); 
			strvehicleDo.setDeclno(dataObject.getString(StrvehicleDo.COLUMNS.DECLNO.name())); 
			strvehicleDo.setItemno(BigDecimalUtils.formObj(dataObject.getString(StrvehicleDo.COLUMNS.ITEMNO.name()))); 
			strvehicleDo.setVehicleno(dataObject.getString(StrvehicleDo.COLUMNS.VEHICLENO.name())); 
			strvehicleDo.setVehicleout(dataObject.getString(StrvehicleDo.COLUMNS.VEHICLEOUT.name())); 
			return strvehicleDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final StrvehicleDo strvehicleDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(StrvehicleDo.COLUMNS.BONDNO.name(), strvehicleDo.getBondno()); 
			dataObject.setValue(StrvehicleDo.COLUMNS.DECLNO.name(), strvehicleDo.getDeclno()); 
			dataObject.setValue(StrvehicleDo.COLUMNS.ITEMNO.name(), strvehicleDo.getItemno()); 
			dataObject.setValue(StrvehicleDo.COLUMNS.VEHICLENO.name(), strvehicleDo.getVehicleno()); 
			dataObject.setValue(StrvehicleDo.COLUMNS.VEHICLEOUT.name(), strvehicleDo.getVehicleout()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<StrvehicleDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(StrvehicleDo po) { 
		sqlWhere.add(StrvehicleDo.COLUMNS.VEHICLEOUT.name(), po.getVehicleout()); 
	} 
 
} 
