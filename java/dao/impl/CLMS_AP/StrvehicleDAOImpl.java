package com.doc.common.dao.impl; 
 
public class StrvehicleDAOImpl extends GeneralDAOImpl<StrvehiclePo> implements StrvehicleDAO { 
	public static final StrvehicleDAOImpl INSTANCE = new StrvehicleDAOImpl(); 
	public static final String TABLENAME = "STRVEHICLE"; 

	public StrvehicleDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<StrvehiclePo> CONVERTER = new MapConverter<StrvehiclePo>() { 
 
		@Override 
		public StrvehiclePo convert(final DataObject dataObject) { 
			final StrvehiclePo strvehiclePo = new StrvehiclePo(); 
			strvehiclePo.setBondno(dataObject.getString(StrvehiclePo.COLUMNS.BONDNO.name())); 
			strvehiclePo.setDeclno(dataObject.getString(StrvehiclePo.COLUMNS.DECLNO.name())); 
			strvehiclePo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(StrvehiclePo.COLUMNS.ITEMNO.name()))); 
			strvehiclePo.setVehicleno(dataObject.getString(StrvehiclePo.COLUMNS.VEHICLENO.name())); 
			strvehiclePo.setVehicleout(dataObject.getString(StrvehiclePo.COLUMNS.VEHICLEOUT.name())); 
			return strvehiclePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final StrvehiclePo strvehiclePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(StrvehiclePo.COLUMNS.BONDNO.name(), strvehiclePo.getBondno()); 
			dataObject.setValue(StrvehiclePo.COLUMNS.DECLNO.name(), strvehiclePo.getDeclno()); 
			dataObject.setValue(StrvehiclePo.COLUMNS.ITEMNO.name(), strvehiclePo.getItemno()); 
			dataObject.setValue(StrvehiclePo.COLUMNS.VEHICLENO.name(), strvehiclePo.getVehicleno()); 
			dataObject.setValue(StrvehiclePo.COLUMNS.VEHICLEOUT.name(), strvehiclePo.getVehicleout()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<StrvehiclePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(StrvehiclePo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(StrvehiclePo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(StrvehiclePo.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(StrvehiclePo.COLUMNS.ITEMNO.name(), po.getItemno()); 
		sqlWhere.add(StrvehiclePo.COLUMNS.VEHICLENO.name(), po.getVehicleno()); 
		return sqlWhere; 
	} 
 
} 
