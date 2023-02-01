package com.doc.common.po.impl; 
 
public class Repcat$FlavorObjectsPo implements IRepcat$FlavorObjectsPo {
 
	public enum COLUMNS {
		FLAVOR_ID("Flavor identifier"), //
		FLAVOR_ID("Flavor identifier"), //
		GOWNER("Owner of the object group containing object"), //
		GOWNER("Owner of the object group containing object"), //
		GOWNER("Owner of the object group containing object"), //
		GNAME("Object group containing object"), //
		GNAME("Object group containing object"), //
		SNAME("Schema containing object"), //
		ONAME("Name of object"), //
		TYPE("Object type"), //
		VERSION#("Version# of a user-defined type"), //
		HASHCODE("Hashcode of a user-defined type"), //
		COLUMNS_PRESENT("For tables, encoded mapping of columns present") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal flavorId;
	private BigDecimal flavorId;
	private String gowner;
	private String gowner;
	private String gowner;
	private String gname;
	private String gname;
	private String sname;
	private String oname;
	private BigDecimal type;
	private BigDecimal version#;
	private String hashcode;
	private String columnsPresent;

	@Override
	public BigDecimal getFlavorId() {
		return this.flavorId;
	}
 
	@Override
	public void setFlavorId(final BigDecimal flavorId) {
		this.flavorId = flavorId; 
	}
 
	@Override
	public BigDecimal getFlavorId() {
		return this.flavorId;
	}
 
	@Override
	public void setFlavorId(final BigDecimal flavorId) {
		this.flavorId = flavorId; 
	}
 
	@Override
	public String getGowner() {
		return this.gowner;
	}
 
	@Override
	public void setGowner(final String gowner) {
		this.gowner = gowner; 
	}
 
	@Override
	public String getGowner() {
		return this.gowner;
	}
 
	@Override
	public void setGowner(final String gowner) {
		this.gowner = gowner; 
	}
 
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
	public String getGname() {
		return this.gname;
	}
 
	@Override
	public void setGname(final String gname) {
		this.gname = gname; 
	}
 
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
	public BigDecimal getType() {
		return this.type;
	}
 
	@Override
	public void setType(final BigDecimal type) {
		this.type = type; 
	}
 
	@Override
	public BigDecimal getVersion#() {
		return this.version#;
	}
 
	@Override
	public void setVersion#(final BigDecimal version#) {
		this.version# = version#; 
	}
 
	@Override
	public String getHashcode() {
		return this.hashcode;
	}
 
	@Override
	public void setHashcode(final String hashcode) {
		this.hashcode = hashcode; 
	}
 
	@Override
	public String getColumnsPresent() {
		return this.columnsPresent;
	}
 
	@Override
	public void setColumnsPresent(final String columnsPresent) {
		this.columnsPresent = columnsPresent; 
	}
 
}
