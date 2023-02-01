package com.doc.common.dao.impl; 
 
public class InvehicleDAOImpl extends GeneralDAOImpl<InvehiclePo> implements InvehicleDAO { 
	public static final InvehicleDAOImpl INSTANCE = new InvehicleDAOImpl(); 
	public static final String TABLENAME = "INVEHICLE"; 

	public InvehicleDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<InvehiclePo> CONVERTER = new MapConverter<InvehiclePo>() { 
 
		@Override 
		public InvehiclePo convert(final DataObject dataObject) { 
			final InvehiclePo invehiclePo = new InvehiclePo(); 
			invehiclePo.setBondno(dataObject.getString(InvehiclePo.COLUMNS.BONDNO.name())); 
			invehiclePo.setDeclno(dataObject.getString(InvehiclePo.COLUMNS.DECLNO.name())); 
			invehiclePo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(InvehiclePo.COLUMNS.ITEMNO.name()))); 
			invehiclePo.setVehicleno(dataObject.getString(InvehiclePo.COLUMNS.VEHICLENO.name())); 
			invehiclePo.setVehicleout(dataObject.getString(InvehiclePo.COLUMNS.VEHICLEOUT.name())); 
			return invehiclePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final InvehiclePo invehiclePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(InvehiclePo.COLUMNS.BONDNO.name(), invehiclePo.getBondno()); 
			dataObject.setValue(InvehiclePo.COLUMNS.DECLNO.name(), invehiclePo.getDeclno()); 
			dataObject.setValue(InvehiclePo.COLUMNS.ITEMNO.name(), invehiclePo.getItemno()); 
			dataObject.setValue(InvehiclePo.COLUMNS.VEHICLENO.name(), invehiclePo.getVehicleno()); 
			dataObject.setValue(InvehiclePo.COLUMNS.VEHICLEOUT.name(), invehiclePo.getVehicleout()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<InvehiclePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(InvehiclePo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(InvehiclePo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(InvehiclePo.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(InvehiclePo.COLUMNS.ITEMNO.name(), po.getItemno()); 
		sqlWhere.add(InvehiclePo.COLUMNS.VEHICLENO.name(), po.getVehicleno()); 
		return sqlWhere; 
	} 
 
} 
