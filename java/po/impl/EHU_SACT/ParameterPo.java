package com.doc.common.po.impl; 
 
public class ParameterPo implements IParameterPo {
 
	public enum COLUMNS {
		KEY("null"), //
		VALUE("null"), //
		GROUPNAME("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String key;
	private String value;
	private String groupname;

	@Override
	public String getKey() {
		return this.key;
	}
 
	@Override
	public void setKey(final String key) {
		this.key = key; 
	}
 
	@Override
	public String getValue() {
		return this.value;
	}
 
	@Override
	public void setValue(final String value) {
		this.value = value; 
	}
 
	@Override
	public String getGroupname() {
		return this.groupname;
	}
 
	@Override
	public void setGroupname(final String groupname) {
		this.groupname = groupname; 
	}
 
}
