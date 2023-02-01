package com.doc.common.po.impl; 
 
public class OpprofilePo implements IOpprofilePo {
 
	public enum COLUMNS {
		OPID("null"), //
		OPCNAME("null"), //
		OPSNAME("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String opid;
	private String opcname;
	private String opsname;

	@Override
	public String getOpid() {
		return this.opid;
	}
 
	@Override
	public void setOpid(final String opid) {
		this.opid = opid; 
	}
 
	@Override
	public String getOpcname() {
		return this.opcname;
	}
 
	@Override
	public void setOpcname(final String opcname) {
		this.opcname = opcname; 
	}
 
	@Override
	public String getOpsname() {
		return this.opsname;
	}
 
	@Override
	public void setOpsname(final String opsname) {
		this.opsname = opsname; 
	}
 
}
