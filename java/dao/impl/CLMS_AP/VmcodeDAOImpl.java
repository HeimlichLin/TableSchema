package com.doc.common.dao.impl; 
 
public class VmcodeDAOImpl extends GeneralDAOImpl<VmcodePo> implements VmcodeDAO { 
	public static final VmcodeDAOImpl INSTANCE = new VmcodeDAOImpl(); 
	public static final String TABLENAME = "VMCODE"; 

	public VmcodeDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<VmcodePo> CONVERTER = new MapConverter<VmcodePo>() { 
 
		@Override 
		public VmcodePo convert(final DataObject dataObject) { 
			final VmcodePo vmcodePo = new VmcodePo(); 
			vmcodePo.setVmno(dataObject.getString(VmcodePo.COLUMNS.VMNO.name())); 
			vmcodePo.setVmname(dataObject.getString(VmcodePo.COLUMNS.VMNAME.name())); 
			return vmcodePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final VmcodePo vmcodePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(VmcodePo.COLUMNS.VMNO.name(), vmcodePo.getVmno()); 
			dataObject.setValue(VmcodePo.COLUMNS.VMNAME.name(), vmcodePo.getVmname()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<VmcodePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(VmcodePo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
