package com.doc.common.dao.impl; 
 
public class OutvehicleDAOImpl extends GeneralDAOImpl<OutvehiclePo> implements OutvehicleDAO { 
	public static final OutvehicleDAOImpl INSTANCE = new OutvehicleDAOImpl(); 
	public static final String TABLENAME = "OUTVEHICLE"; 

	public OutvehicleDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<OutvehiclePo> CONVERTER = new MapConverter<OutvehiclePo>() { 
 
		@Override 
		public OutvehiclePo convert(final DataObject dataObject) { 
			final OutvehiclePo outvehiclePo = new OutvehiclePo(); 
			outvehiclePo.setBondno(dataObject.getString(OutvehiclePo.COLUMNS.BONDNO.name())); 
			outvehiclePo.setDeclno(dataObject.getString(OutvehiclePo.COLUMNS.DECLNO.name())); 
			outvehiclePo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(OutvehiclePo.COLUMNS.ITEMNO.name()))); 
			outvehiclePo.setVehicleno(dataObject.getString(OutvehiclePo.COLUMNS.VEHICLENO.name())); 
			return outvehiclePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final OutvehiclePo outvehiclePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(OutvehiclePo.COLUMNS.BONDNO.name(), outvehiclePo.getBondno()); 
			dataObject.setValue(OutvehiclePo.COLUMNS.DECLNO.name(), outvehiclePo.getDeclno()); 
			dataObject.setValue(OutvehiclePo.COLUMNS.ITEMNO.name(), outvehiclePo.getItemno()); 
			dataObject.setValue(OutvehiclePo.COLUMNS.VEHICLENO.name(), outvehiclePo.getVehicleno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<OutvehiclePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(OutvehiclePo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(OutvehiclePo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(OutvehiclePo.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(OutvehiclePo.COLUMNS.ITEMNO.name(), po.getItemno()); 
		sqlWhere.add(OutvehiclePo.COLUMNS.VEHICLENO.name(), po.getVehicleno()); 
		return sqlWhere; 
	} 
 
} 
