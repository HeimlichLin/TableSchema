package com.doc.common.po.impl; 
 
public class LogmnrPartobj$Po implements ILogmnrPartobj$Po {
 
	public enum COLUMNS {
		PARTTYPE("null"), //
		PARTCNT("null"), //
		PARTKEYCOLS("null"), //
		FLAGS("null"), //
		DEFTS#("null"), //
		DEFPCTFREE("null"), //
		DEFPCTUSED("null"), //
		DEFPCTTHRES("null"), //
		DEFINITRANS("null"), //
		DEFMAXTRANS("null"), //
		DEFTINIEXTS("null"), //
		DEFEXTSIZE("null"), //
		DEFMINEXTS("null"), //
		DEFMAXEXTS("null"), //
		DEFEXTPCT("null"), //
		DEFLISTS("null"), //
		DEFGROUPS("null"), //
		DEFLOGGING("null"), //
		SPARE1("null"), //
		SPARE2("null"), //
		SPARE3("null"), //
		DEFINCLCOL("null"), //
		PARAMETERS("null"), //
		OBJ#("null"), //
		LOGMNR_UID("null"), //
		LOGMNR_FLAGS("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal parttype;
	private BigDecimal partcnt;
	private BigDecimal partkeycols;
	private BigDecimal flags;
	private BigDecimal defts#;
	private BigDecimal defpctfree;
	private BigDecimal defpctused;
	private BigDecimal defpctthres;
	private BigDecimal definitrans;
	private BigDecimal defmaxtrans;
	private BigDecimal deftiniexts;
	private BigDecimal defextsize;
	private BigDecimal defminexts;
	private BigDecimal defmaxexts;
	private BigDecimal defextpct;
	private BigDecimal deflists;
	private BigDecimal defgroups;
	private BigDecimal deflogging;
	private BigDecimal spare1;
	private BigDecimal spare2;
	private BigDecimal spare3;
	private BigDecimal definclcol;
	private String parameters;
	private BigDecimal obj#;
	private BigDecimal logmnrUid;
	private BigDecimal logmnrFlags;

	@Override
	public BigDecimal getParttype() {
		return this.parttype;
	}
 
	@Override
	public void setParttype(final BigDecimal parttype) {
		this.parttype = parttype; 
	}
 
	@Override
	public BigDecimal getPartcnt() {
		return this.partcnt;
	}
 
	@Override
	public void setPartcnt(final BigDecimal partcnt) {
		this.partcnt = partcnt; 
	}
 
	@Override
	public BigDecimal getPartkeycols() {
		return this.partkeycols;
	}
 
	@Override
	public void setPartkeycols(final BigDecimal partkeycols) {
		this.partkeycols = partkeycols; 
	}
 
	@Override
	public BigDecimal getFlags() {
		return this.flags;
	}
 
	@Override
	public void setFlags(final BigDecimal flags) {
		this.flags = flags; 
	}
 
	@Override
	public BigDecimal getDefts#() {
		return this.defts#;
	}
 
	@Override
	public void setDefts#(final BigDecimal defts#) {
		this.defts# = defts#; 
	}
 
	@Override
	public BigDecimal getDefpctfree() {
		return this.defpctfree;
	}
 
	@Override
	public void setDefpctfree(final BigDecimal defpctfree) {
		this.defpctfree = defpctfree; 
	}
 
	@Override
	public BigDecimal getDefpctused() {
		return this.defpctused;
	}
 
	@Override
	public void setDefpctused(final BigDecimal defpctused) {
		this.defpctused = defpctused; 
	}
 
	@Override
	public BigDecimal getDefpctthres() {
		return this.defpctthres;
	}
 
	@Override
	public void setDefpctthres(final BigDecimal defpctthres) {
		this.defpctthres = defpctthres; 
	}
 
	@Override
	public BigDecimal getDefinitrans() {
		return this.definitrans;
	}
 
	@Override
	public void setDefinitrans(final BigDecimal definitrans) {
		this.definitrans = definitrans; 
	}
 
	@Override
	public BigDecimal getDefmaxtrans() {
		return this.defmaxtrans;
	}
 
	@Override
	public void setDefmaxtrans(final BigDecimal defmaxtrans) {
		this.defmaxtrans = defmaxtrans; 
	}
 
	@Override
	public BigDecimal getDeftiniexts() {
		return this.deftiniexts;
	}
 
	@Override
	public void setDeftiniexts(final BigDecimal deftiniexts) {
		this.deftiniexts = deftiniexts; 
	}
 
	@Override
	public BigDecimal getDefextsize() {
		return this.defextsize;
	}
 
	@Override
	public void setDefextsize(final BigDecimal defextsize) {
		this.defextsize = defextsize; 
	}
 
	@Override
	public BigDecimal getDefminexts() {
		return this.defminexts;
	}
 
	@Override
	public void setDefminexts(final BigDecimal defminexts) {
		this.defminexts = defminexts; 
	}
 
	@Override
	public BigDecimal getDefmaxexts() {
		return this.defmaxexts;
	}
 
	@Override
	public void setDefmaxexts(final BigDecimal defmaxexts) {
		this.defmaxexts = defmaxexts; 
	}
 
	@Override
	public BigDecimal getDefextpct() {
		return this.defextpct;
	}
 
	@Override
	public void setDefextpct(final BigDecimal defextpct) {
		this.defextpct = defextpct; 
	}
 
	@Override
	public BigDecimal getDeflists() {
		return this.deflists;
	}
 
	@Override
	public void setDeflists(final BigDecimal deflists) {
		this.deflists = deflists; 
	}
 
	@Override
	public BigDecimal getDefgroups() {
		return this.defgroups;
	}
 
	@Override
	public void setDefgroups(final BigDecimal defgroups) {
		this.defgroups = defgroups; 
	}
 
	@Override
	public BigDecimal getDeflogging() {
		return this.deflogging;
	}
 
	@Override
	public void setDeflogging(final BigDecimal deflogging) {
		this.deflogging = deflogging; 
	}
 
	@Override
	public BigDecimal getSpare1() {
		return this.spare1;
	}
 
	@Override
	public void setSpare1(final BigDecimal spare1) {
		this.spare1 = spare1; 
	}
 
	@Override
	public BigDecimal getSpare2() {
		return this.spare2;
	}
 
	@Override
	public void setSpare2(final BigDecimal spare2) {
		this.spare2 = spare2; 
	}
 
	@Override
	public BigDecimal getSpare3() {
		return this.spare3;
	}
 
	@Override
	public void setSpare3(final BigDecimal spare3) {
		this.spare3 = spare3; 
	}
 
	@Override
	public BigDecimal getDefinclcol() {
		return this.definclcol;
	}
 
	@Override
	public void setDefinclcol(final BigDecimal definclcol) {
		this.definclcol = definclcol; 
	}
 
	@Override
	public String getParameters() {
		return this.parameters;
	}
 
	@Override
	public void setParameters(final String parameters) {
		this.parameters = parameters; 
	}
 
	@Override
	public BigDecimal getObj#() {
		return this.obj#;
	}
 
	@Override
	public void setObj#(final BigDecimal obj#) {
		this.obj# = obj#; 
	}
 
	@Override
	public BigDecimal getLogmnrUid() {
		return this.logmnrUid;
	}
 
	@Override
	public void setLogmnrUid(final BigDecimal logmnrUid) {
		this.logmnrUid = logmnrUid; 
	}
 
	@Override
	public BigDecimal getLogmnrFlags() {
		return this.logmnrFlags;
	}
 
	@Override
	public void setLogmnrFlags(final BigDecimal logmnrFlags) {
		this.logmnrFlags = logmnrFlags; 
	}
 
}
