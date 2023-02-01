package com.doc.common.po.impl; 
 
public class Repcat$SnapgroupPo implements IRepcat$SnapgroupPo {
 
	public enum COLUMNS {
		GOWNER("Owner of the snapshot repgroup"), //
		GNAME("Name of the snapshot repgroup"), //
		DBLINK("Database site of the snapshot repgroup"), //
		GROUP_COMMENT("Description of the snapshot repgroup"), //
		REP_TYPE("Identifier of flavor at snapshot"), //
		FLAVOR_ID("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String gowner;
	private String gname;
	private String dblink;
	private String groupComment;
	private BigDecimal repType;
	private BigDecimal flavorId;

	@Override
	public String getGowner() {
		return this.gowner;
	}
 
	@Override
	public void setGowner(final String gowner) {
		this.gowner = gowner; 
	}
 
	@Override
	public String getGname() {
		return this.gname;
	}
 
	@Override
	public void setGname(final String gname) {
		this.gname = gname; 
	}
 
	@Override
	public String getDblink() {
		return this.dblink;
	}
 
	@Override
	public void setDblink(final String dblink) {
		this.dblink = dblink; 
	}
 
	@Override
	public String getGroupComment() {
		return this.groupComment;
	}
 
	@Override
	public void setGroupComment(final String groupComment) {
		this.groupComment = groupComment; 
	}
 
	@Override
	public BigDecimal getRepType() {
		return this.repType;
	}
 
	@Override
	public void setRepType(final BigDecimal repType) {
		this.repType = repType; 
	}
 
	@Override
	public BigDecimal getFlavorId() {
		return this.flavorId;
	}
 
	@Override
	public void setFlavorId(final BigDecimal flavorId) {
		this.flavorId = flavorId; 
	}
 
}
