package com.doc.common.dao.impl; 
 
public class InvehicleDAO extends GeneralDAOImpl<InvehicleDo> implements InvehicleDAO { 
	public static final InvehicleDAOImpl INSTANCE = new InvehicleDAOImpl(); 
	public static final String TABLENAME = "INVEHICLE"; 

	public InvehicleDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<InvehicleDo> CONVERTER = new MapConverter<InvehicleDo>() { 
 
		@Override 
		public InvehicleDo convert(final DataObject dataObject) { 
			final InvehicleDo invehicleDo = new InvehicleDo(); 
			invehicleDo.setBondno(dataObject.getString(InvehicleDo.COLUMNS.BONDNO.name())); 
			invehicleDo.setDeclno(dataObject.getString(InvehicleDo.COLUMNS.DECLNO.name())); 
			invehicleDo.setItemno(BigDecimalUtils.formObj(dataObject.getString(InvehicleDo.COLUMNS.ITEMNO.name()))); 
			invehicleDo.setVehicleno(dataObject.getString(InvehicleDo.COLUMNS.VEHICLENO.name())); 
			invehicleDo.setVehicleout(dataObject.getString(InvehicleDo.COLUMNS.VEHICLEOUT.name())); 
			return invehicleDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final InvehicleDo invehicleDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(InvehicleDo.COLUMNS.BONDNO.name(), invehicleDo.getBondno()); 
			dataObject.setValue(InvehicleDo.COLUMNS.DECLNO.name(), invehicleDo.getDeclno()); 
			dataObject.setValue(InvehicleDo.COLUMNS.ITEMNO.name(), invehicleDo.getItemno()); 
			dataObject.setValue(InvehicleDo.COLUMNS.VEHICLENO.name(), invehicleDo.getVehicleno()); 
			dataObject.setValue(InvehicleDo.COLUMNS.VEHICLEOUT.name(), invehicleDo.getVehicleout()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<InvehicleDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(InvehicleDo po) { 
		sqlWhere.add(InvehicleDo.COLUMNS.VEHICLEOUT.name(), po.getVehicleout()); 
	} 
 
} 
