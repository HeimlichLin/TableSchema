package com.doc.common.dao.impl; 
 
public class VmcodeDAO extends GeneralDAOImpl<VmcodeDo> implements VmcodeDAO { 
	public static final VmcodeDAOImpl INSTANCE = new VmcodeDAOImpl(); 
	public static final String TABLENAME = "VMCODE"; 

	public VmcodeDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<VmcodeDo> CONVERTER = new MapConverter<VmcodeDo>() { 
 
		@Override 
		public VmcodeDo convert(final DataObject dataObject) { 
			final VmcodeDo vmcodeDo = new VmcodeDo(); 
			vmcodeDo.setVmno(dataObject.getString(VmcodeDo.COLUMNS.VMNO.name())); 
			vmcodeDo.setVmname(dataObject.getString(VmcodeDo.COLUMNS.VMNAME.name())); 
			return vmcodeDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final VmcodeDo vmcodeDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(VmcodeDo.COLUMNS.VMNO.name(), vmcodeDo.getVmno()); 
			dataObject.setValue(VmcodeDo.COLUMNS.VMNAME.name(), vmcodeDo.getVmname()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<VmcodeDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(VmcodeDo po) { 
		sqlWhere.add(VmcodeDo.COLUMNS.VMNO.name(), po.getVmno()); 
		sqlWhere.add(VmcodeDo.COLUMNS.VMNAME.name(), po.getVmname()); 
	} 
 
} 
