package com.doc.common.po.impl; 
 
public class Repcat$GroupedColumnPo implements IRepcat$GroupedColumnPo {
 
	public enum COLUMNS {
		SNAME("Owner of replicated object"), //
		ONAME("Name of the replicated object"), //
		GROUP_NAME("Name of the column group"), //
		COLUMN_NAME("Name of the column in the column group"), //
		POS("Position of a column or an attribute in the table") //
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
	private String columnName;
	private BigDecimal pos;

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
	public String getColumnName() {
		return this.columnName;
	}
 
	@Override
	public void setColumnName(final String columnName) {
		this.columnName = columnName; 
	}
 
	@Override
	public BigDecimal getPos() {
		return this.pos;
	}
 
	@Override
	public void setPos(final BigDecimal pos) {
		this.pos = pos; 
	}
 
}
