package com.doc.common.po.impl; 
 
public class Repcat$ColumnGroupPo implements IRepcat$ColumnGroupPo {
 
	public enum COLUMNS {
		SNAME("Owner of replicated object"), //
		ONAME("Name of the replicated object"), //
		GROUP_NAME("Name of the column group"), //
		GROUP_COMMENT("Description of the column group") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String sname;
	private String oname;
	private String groupName;
	private String groupComment;

	@Override
	public String getSname() {
		return this.sname;
	}
 
	@Override
	public void setSname(final String sname) {
		this.sname = sname; 
	}
 
	@Override
	public String getOname() {
		return this.oname;
	}
 
	@Override
	public void setOname(final String oname) {
		this.oname = oname; 
	}
 
	@Override
	public String getGroupName() {
		return this.groupName;
	}
 
	@Override
	public void setGroupName(final String groupName) {
		this.groupName = groupName; 
	}
 
	@Override
	public String getGroupComment() {
		return this.groupComment;
	}
 
	@Override
	public void setGroupComment(final String groupComment) {
		this.groupComment = groupComment; 
	}
 
}
