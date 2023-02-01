package com.doc.common.po.impl; 
 
public class LogmnrggcGtloPo implements ILogmnrggcGtloPo {
 
	public enum COLUMNS {
		LOGMNR_UID("null"), //
		KEYOBJ#("null"), //
		LVLCNT("null"), //
		BASEOBJ#("null"), //
		BASEOBJV#("null"), //
		LVL1OBJ#("null"), //
		LVL2OBJ#("null"), //
		LVL0TYPE#("null"), //
		LVL1TYPE#("null"), //
		LVL2TYPE#("null"), //
		OWNER#("null"), //
		OWNERNAME("null"), //
		LVL0NAME("null"), //
		LVL1NAME("null"), //
		LVL2NAME("null"), //
		INTCOLS("null"), //
		COLS("null"), //
		KERNELCOLS("null"), //
		TAB_FLAGS("null"), //
		TRIGFLAG("null"), //
		ASSOC#("null"), //
		OBJ_FLAGS("null"), //
		TS#("null"), //
		TSNAME("null"), //
		PROPERTY("null"), //
		START_SCN("null"), //
		DROP_SCN("null"), //
		XIDUSN("null"), //
		XIDSLT("null"), //
		XIDSQN("null"), //
		FLAGS("null"), //
		LOGMNR_SPARE1("null"), //
		LOGMNR_SPARE2("null"), //
		LOGMNR_SPARE3("null"), //
		LOGMNR_SPARE4("null"), //
		LOGMNR_SPARE5("null"), //
		LOGMNR_SPARE6("null"), //
		LOGMNR_SPARE7("null"), //
		LOGMNR_SPARE8("null"), //
		LOGMNR_SPARE9("null"), //
		PARTTYPE("null"), //
		SUBPARTTYPE("null"), //
		UNSUPPORTEDCOLS("null"), //
		COMPLEXTYPECOLS("null"), //
		NTPARENTOBJNUM("null"), //
		NTPARENTOBJVERSION("null"), //
		NTPARENTINTCOLNUM("null"), //
		LOGMNRTLOFLAGS("null"), //
		LOGMNRMCV("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal logmnrUid;
	private BigDecimal keyobj#;
	private BigDecimal lvlcnt;
	private BigDecimal baseobj#;
	private BigDecimal baseobjv#;
	private BigDecimal lvl1obj#;
	private BigDecimal lvl2obj#;
	private BigDecimal lvl0type#;
	private BigDecimal lvl1type#;
	private BigDecimal lvl2type#;
	private BigDecimal owner#;
	private String ownername;
	private String lvl0name;
	private String lvl1name;
	private String lvl2name;
	private BigDecimal intcols;
	private BigDecimal cols;
	private BigDecimal kernelcols;
	private BigDecimal tabFlags;
	private BigDecimal trigflag;
	private BigDecimal assoc#;
	private BigDecimal objFlags;
	private BigDecimal ts#;
	private String tsname;
	private BigDecimal property;
	private BigDecimal startScn;
	private BigDecimal dropScn;
	private BigDecimal xidusn;
	private BigDecimal xidslt;
	private BigDecimal xidsqn;
	private BigDecimal flags;
	private BigDecimal logmnrSpare1;
	private BigDecimal logmnrSpare2;
	private String logmnrSpare3;
	private java.sql.Timestamp logmnrSpare4;
	private BigDecimal logmnrSpare5;
	private BigDecimal logmnrSpare6;
	private BigDecimal logmnrSpare7;
	private BigDecimal logmnrSpare8;
	private BigDecimal logmnrSpare9;
	private BigDecimal parttype;
	private BigDecimal subparttype;
	private BigDecimal unsupportedcols;
	private BigDecimal complextypecols;
	private BigDecimal ntparentobjnum;
	private BigDecimal ntparentobjversion;
	private BigDecimal ntparentintcolnum;
	private BigDecimal logmnrtloflags;
	private String logmnrmcv;

	@Override
	public BigDecimal getLogmnrUid() {
		return this.logmnrUid;
	}
 
	@Override
	public void setLogmnrUid(final BigDecimal logmnrUid) {
		this.logmnrUid = logmnrUid; 
	}
 
	@Override
	public BigDecimal getKeyobj#() {
		return this.keyobj#;
	}
 
	@Override
	public void setKeyobj#(final BigDecimal keyobj#) {
		this.keyobj# = keyobj#; 
	}
 
	@Override
	public BigDecimal getLvlcnt() {
		return this.lvlcnt;
	}
 
	@Override
	public void setLvlcnt(final BigDecimal lvlcnt) {
		this.lvlcnt = lvlcnt; 
	}
 
	@Override
	public BigDecimal getBaseobj#() {
		return this.baseobj#;
	}
 
	@Override
	public void setBaseobj#(final BigDecimal baseobj#) {
		this.baseobj# = baseobj#; 
	}
 
	@Override
	public BigDecimal getBaseobjv#() {
		return this.baseobjv#;
	}
 
	@Override
	public void setBaseobjv#(final BigDecimal baseobjv#) {
		this.baseobjv# = baseobjv#; 
	}
 
	@Override
	public BigDecimal getLvl1obj#() {
		return this.lvl1obj#;
	}
 
	@Override
	public void setLvl1obj#(final BigDecimal lvl1obj#) {
		this.lvl1obj# = lvl1obj#; 
	}
 
	@Override
	public BigDecimal getLvl2obj#() {
		return this.lvl2obj#;
	}
 
	@Override
	public void setLvl2obj#(final BigDecimal lvl2obj#) {
		this.lvl2obj# = lvl2obj#; 
	}
 
	@Override
	public BigDecimal getLvl0type#() {
		return this.lvl0type#;
	}
 
	@Override
	public void setLvl0type#(final BigDecimal lvl0type#) {
		this.lvl0type# = lvl0type#; 
	}
 
	@Override
	public BigDecimal getLvl1type#() {
		return this.lvl1type#;
	}
 
	@Override
	public void setLvl1type#(final BigDecimal lvl1type#) {
		this.lvl1type# = lvl1type#; 
	}
 
	@Override
	public BigDecimal getLvl2type#() {
		return this.lvl2type#;
	}
 
	@Override
	public void setLvl2type#(final BigDecimal lvl2type#) {
		this.lvl2type# = lvl2type#; 
	}
 
	@Override
	public BigDecimal getOwner#() {
		return this.owner#;
	}
 
	@Override
	public void setOwner#(final BigDecimal owner#) {
		this.owner# = owner#; 
	}
 
	@Override
	public String getOwnername() {
		return this.ownername;
	}
 
	@Override
	public void setOwnername(final String ownername) {
		this.ownername = ownername; 
	}
 
	@Override
	public String getLvl0name() {
		return this.lvl0name;
	}
 
	@Override
	public void setLvl0name(final String lvl0name) {
		this.lvl0name = lvl0name; 
	}
 
	@Override
	public String getLvl1name() {
		return this.lvl1name;
	}
 
	@Override
	public void setLvl1name(final String lvl1name) {
		this.lvl1name = lvl1name; 
	}
 
	@Override
	public String getLvl2name() {
		return this.lvl2name;
	}
 
	@Override
	public void setLvl2name(final String lvl2name) {
		this.lvl2name = lvl2name; 
	}
 
	@Override
	public BigDecimal getIntcols() {
		return this.intcols;
	}
 
	@Override
	public void setIntcols(final BigDecimal intcols) {
		this.intcols = intcols; 
	}
 
	@Override
	public BigDecimal getCols() {
		return this.cols;
	}
 
	@Override
	public void setCols(final BigDecimal cols) {
		this.cols = cols; 
	}
 
	@Override
	public BigDecimal getKernelcols() {
		return this.kernelcols;
	}
 
	@Override
	public void setKernelcols(final BigDecimal kernelcols) {
		this.kernelcols = kernelcols; 
	}
 
	@Override
	public BigDecimal getTabFlags() {
		return this.tabFlags;
	}
 
	@Override
	public void setTabFlags(final BigDecimal tabFlags) {
		this.tabFlags = tabFlags; 
	}
 
	@Override
	public BigDecimal getTrigflag() {
		return this.trigflag;
	}
 
	@Override
	public void setTrigflag(final BigDecimal trigflag) {
		this.trigflag = trigflag; 
	}
 
	@Override
	public BigDecimal getAssoc#() {
		return this.assoc#;
	}
 
	@Override
	public void setAssoc#(final BigDecimal assoc#) {
		this.assoc# = assoc#; 
	}
 
	@Override
	public BigDecimal getObjFlags() {
		return this.objFlags;
	}
 
	@Override
	public void setObjFlags(final BigDecimal objFlags) {
		this.objFlags = objFlags; 
	}
 
	@Override
	public BigDecimal getTs#() {
		return this.ts#;
	}
 
	@Override
	public void setTs#(final BigDecimal ts#) {
		this.ts# = ts#; 
	}
 
	@Override
	public String getTsname() {
		return this.tsname;
	}
 
	@Override
	public void setTsname(final String tsname) {
		this.tsname = tsname; 
	}
 
	@Override
	public BigDecimal getProperty() {
		return this.property;
	}
 
	@Override
	public void setProperty(final BigDecimal property) {
		this.property = property; 
	}
 
	@Override
	public BigDecimal getStartScn() {
		return this.startScn;
	}
 
	@Override
	public void setStartScn(final BigDecimal startScn) {
		this.startScn = startScn; 
	}
 
	@Override
	public BigDecimal getDropScn() {
		return this.dropScn;
	}
 
	@Override
	public void setDropScn(final BigDecimal dropScn) {
		this.dropScn = dropScn; 
	}
 
	@Override
	public BigDecimal getXidusn() {
		return this.xidusn;
	}
 
	@Override
	public void setXidusn(final BigDecimal xidusn) {
		this.xidusn = xidusn; 
	}
 
	@Override
	public BigDecimal getXidslt() {
		return this.xidslt;
	}
 
	@Override
	public void setXidslt(final BigDecimal xidslt) {
		this.xidslt = xidslt; 
	}
 
	@Override
	public BigDecimal getXidsqn() {
		return this.xidsqn;
	}
 
	@Override
	public void setXidsqn(final BigDecimal xidsqn) {
		this.xidsqn = xidsqn; 
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
	public BigDecimal getLogmnrSpare1() {
		return this.logmnrSpare1;
	}
 
	@Override
	public void setLogmnrSpare1(final BigDecimal logmnrSpare1) {
		this.logmnrSpare1 = logmnrSpare1; 
	}
 
	@Override
	public BigDecimal getLogmnrSpare2() {
		return this.logmnrSpare2;
	}
 
	@Override
	public void setLogmnrSpare2(final BigDecimal logmnrSpare2) {
		this.logmnrSpare2 = logmnrSpare2; 
	}
 
	@Override
	public String getLogmnrSpare3() {
		return this.logmnrSpare3;
	}
 
	@Override
	public void setLogmnrSpare3(final String logmnrSpare3) {
		this.logmnrSpare3 = logmnrSpare3; 
	}
 
	@Override
	public java.sql.Timestamp getLogmnrSpare4() {
		return this.logmnrSpare4;
	}
 
	@Override
	public void setLogmnrSpare4(final java.sql.Timestamp logmnrSpare4) {
		this.logmnrSpare4 = logmnrSpare4; 
	}
 
	@Override
	public BigDecimal getLogmnrSpare5() {
		return this.logmnrSpare5;
	}
 
	@Override
	public void setLogmnrSpare5(final BigDecimal logmnrSpare5) {
		this.logmnrSpare5 = logmnrSpare5; 
	}
 
	@Override
	public BigDecimal getLogmnrSpare6() {
		return this.logmnrSpare6;
	}
 
	@Override
	public void setLogmnrSpare6(final BigDecimal logmnrSpare6) {
		this.logmnrSpare6 = logmnrSpare6; 
	}
 
	@Override
	public BigDecimal getLogmnrSpare7() {
		return this.logmnrSpare7;
	}
 
	@Override
	public void setLogmnrSpare7(final BigDecimal logmnrSpare7) {
		this.logmnrSpare7 = logmnrSpare7; 
	}
 
	@Override
	public BigDecimal getLogmnrSpare8() {
		return this.logmnrSpare8;
	}
 
	@Override
	public void setLogmnrSpare8(final BigDecimal logmnrSpare8) {
		this.logmnrSpare8 = logmnrSpare8; 
	}
 
	@Override
	public BigDecimal getLogmnrSpare9() {
		return this.logmnrSpare9;
	}
 
	@Override
	public void setLogmnrSpare9(final BigDecimal logmnrSpare9) {
		this.logmnrSpare9 = logmnrSpare9; 
	}
 
	@Override
	public BigDecimal getParttype() {
		return this.parttype;
	}
 
	@Override
	public void setParttype(final BigDecimal parttype) {
		this.parttype = parttype; 
	}
 
	@Override
	public BigDecimal getSubparttype() {
		return this.subparttype;
	}
 
	@Override
	public void setSubparttype(final BigDecimal subparttype) {
		this.subparttype = subparttype; 
	}
 
	@Override
	public BigDecimal getUnsupportedcols() {
		return this.unsupportedcols;
	}
 
	@Override
	public void setUnsupportedcols(final BigDecimal unsupportedcols) {
		this.unsupportedcols = unsupportedcols; 
	}
 
	@Override
	public BigDecimal getComplextypecols() {
		return this.complextypecols;
	}
 
	@Override
	public void setComplextypecols(final BigDecimal complextypecols) {
		this.complextypecols = complextypecols; 
	}
 
	@Override
	public BigDecimal getNtparentobjnum() {
		return this.ntparentobjnum;
	}
 
	@Override
	public void setNtparentobjnum(final BigDecimal ntparentobjnum) {
		this.ntparentobjnum = ntparentobjnum; 
	}
 
	@Override
	public BigDecimal getNtparentobjversion() {
		return this.ntparentobjversion;
	}
 
	@Override
	public void setNtparentobjversion(final BigDecimal ntparentobjversion) {
		this.ntparentobjversion = ntparentobjversion; 
	}
 
	@Override
	public BigDecimal getNtparentintcolnum() {
		return this.ntparentintcolnum;
	}
 
	@Override
	public void setNtparentintcolnum(final BigDecimal ntparentintcolnum) {
		this.ntparentintcolnum = ntparentintcolnum; 
	}
 
	@Override
	public BigDecimal getLogmnrtloflags() {
		return this.logmnrtloflags;
	}
 
	@Override
	public void setLogmnrtloflags(final BigDecimal logmnrtloflags) {
		this.logmnrtloflags = logmnrtloflags; 
	}
 
	@Override
	public String getLogmnrmcv() {
		return this.logmnrmcv;
	}
 
	@Override
	public void setLogmnrmcv(final String logmnrmcv) {
		this.logmnrmcv = logmnrmcv; 
	}
 
}
