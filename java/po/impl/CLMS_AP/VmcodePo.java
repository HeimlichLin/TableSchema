package com.doc.common.po.impl; 
 
public class VmcodePo implements IVmcodePo {
 
	public enum COLUMNS {
		VMNO("null"), //
		VMNAME("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String vmno;
	private String vmname;

	@Override
	public String getVmno() {
		return this.vmno;
	}
 
	@Override
	public void setVmno(final String vmno) {
		this.vmno = vmno; 
	}
 
	@Override
	public String getVmname() {
		return this.vmname;
	}
 
	@Override
	public void setVmname(final String vmname) {
		this.vmname = vmname; 
	}
 
}
