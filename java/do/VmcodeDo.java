package com.doc.common.bean; 
 
public class VmcodeDo { 
 
	public enum COLUMNS { 
		VMNO("null"), 
		VMNAME("null") 
		; 
		final String name; 
	 
		private COLUMNS(final String name) { 
			this.name = name; 
		} 
	 
		public String getName() { 
			return this.name; 
		} 
	} 
 
	private String vmno; 
	private String vmname; 
	
	public String getVmno() { 
		return vmno; 
	} 
 
	public void setVmno(String vmno) { 
		this.vmno = vmno; 
	} 
 
	public String getVmname() { 
		return vmname; 
	} 
 
	public void setVmname(String vmname) { 
		this.vmname = vmname; 
	} 
 
} 
