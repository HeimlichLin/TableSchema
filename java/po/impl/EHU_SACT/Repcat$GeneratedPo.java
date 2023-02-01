package com.doc.common.po.impl; 
 
public class Repcat$GeneratedPo implements IRepcat$GeneratedPo {
 
	public enum COLUMNS {
		SNAME("Schema containing the generated object"), //
		ONAME("Name of the generated object"), //
		TYPE("Type of the generated object"), //
		REASON("Reason the object was generated"), //
		BASE_SNAME("Name of the object's owner"), //
		BASE_SNAME("Name of the object's owner"), //
		BASE_ONAME("Name of the object"), //
		BASE_ONAME("Name of the object"), //
		BASE_TYPE("Type of the object"), //
		BASE_TYPE("Type of the object"), //
		PACKAGE_PREFIX("Prefix for package wrapper"), //
		PROCEDURE_PREFIX("Procedure prefix for package wrapper or procedure wrapper"), //
		DISTRIBUTED("Is the generated object separately generated at each master") //
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
	private BigDecimal type;
	private BigDecimal reason;
	private String baseSname;
	private String baseSname;
	private String baseOname;
	private String baseOname;
	private BigDecimal baseType;
	private BigDecimal baseType;
	private String packagePrefix;
	private String procedurePrefix;
	private String distributed;

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
	public BigDecimal getReason() {
		return this.reason;
	}
 
	@Override
	public void setReason(final BigDecimal reason) {
		this.reason = reason; 
	}
 
	@Override
	public String getBaseSname() {
		return this.baseSname;
	}
 
	@Override
	public void setBaseSname(final String baseSname) {
		this.baseSname = baseSname; 
	}
 
	@Override
	public String getBaseSname() {
		return this.baseSname;
	}
 
	@Override
	public void setBaseSname(final String baseSname) {
		this.baseSname = baseSname; 
	}
 
	@Override
	public String getBaseOname() {
		return this.baseOname;
	}
 
	@Override
	public void setBaseOname(final String baseOname) {
		this.baseOname = baseOname; 
	}
 
	@Override
	public String getBaseOname() {
		return this.baseOname;
	}
 
	@Override
	public void setBaseOname(final String baseOname) {
		this.baseOname = baseOname; 
	}
 
	@Override
	public BigDecimal getBaseType() {
		return this.baseType;
	}
 
	@Override
	public void setBaseType(final BigDecimal baseType) {
		this.baseType = baseType; 
	}
 
	@Override
	public BigDecimal getBaseType() {
		return this.baseType;
	}
 
	@Override
	public void setBaseType(final BigDecimal baseType) {
		this.baseType = baseType; 
	}
 
	@Override
	public String getPackagePrefix() {
		return this.packagePrefix;
	}
 
	@Override
	public void setPackagePrefix(final String packagePrefix) {
		this.packagePrefix = packagePrefix; 
	}
 
	@Override
	public String getProcedurePrefix() {
		return this.procedurePrefix;
	}
 
	@Override
	public void setProcedurePrefix(final String procedurePrefix) {
		this.procedurePrefix = procedurePrefix; 
	}
 
	@Override
	public String getDistributed() {
		return this.distributed;
	}
 
	@Override
	public void setDistributed(final String distributed) {
		this.distributed = distributed; 
	}
 
}
