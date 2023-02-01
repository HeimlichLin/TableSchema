package com.doc.common.po.impl; 
 
public class OpgroupPo implements IOpgroupPo {
 
	public enum COLUMNS {
		OPGROUPID("null"), //
		OPID("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String opgroupid;
	private String opid;

	@Override
	public String getOpgroupid() {
		return this.opgroupid;
	}
 
	@Override
	public void setOpgroupid(final String opgroupid) {
		this.opgroupid = opgroupid; 
	}
 
	@Override
	public String getOpid() {
		return this.opid;
	}
 
	@Override
	public void setOpid(final String opid) {
		this.opid = opid; 
	}
 
}
