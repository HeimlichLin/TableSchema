package com.doc.common.dao.impl; 
 
public class AddressDAOImpl extends GeneralDAOImpl<AddressPo> implements AddressDAO { 
	public static final AddressDAOImpl INSTANCE = new AddressDAOImpl(); 
	public static final String TABLENAME = "ADDRESS"; 

	public AddressDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<AddressPo> CONVERTER = new MapConverter<AddressPo>() { 
 
		@Override 
		public AddressPo convert(final DataObject dataObject) { 
			final AddressPo addressPo = new AddressPo(); 
			addressPo.setCounty(dataObject.getString(AddressPo.COLUMNS.COUNTY.name())); 
			addressPo.setTownshipArea(dataObject.getString(AddressPo.COLUMNS.TOWNSHIP_AREA.name())); 
			return addressPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final AddressPo addressPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(AddressPo.COLUMNS.COUNTY.name(), addressPo.getCounty()); 
			dataObject.setValue(AddressPo.COLUMNS.TOWNSHIP_AREA.name(), addressPo.getTownshipArea()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<AddressPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(AddressPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(AddressPo.COLUMNS.COUNTY.name(), po.getCounty()); 
		sqlWhere.add(AddressPo.COLUMNS.TOWNSHIP_AREA.name(), po.getTownshipArea()); 
		return sqlWhere; 
	} 
 
} 
