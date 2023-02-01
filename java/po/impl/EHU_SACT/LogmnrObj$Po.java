package com.doc.common.po.impl; 
 
public class LogmnrObj$Po implements ILogmnrObj$Po {
 
	public enum COLUMNS {
		OBJV#("null"), //
		OWNER#("null"), //
		NAME("null"), //
		NAMESPACE("null"), //
		SUBNAME("null"), //
		TYPE#("null"), //
		OID$("null"), //
		REMOTEOWNER("null"), //
		LINKNAME("null"), //
		FLAGS("null"), //
		SPARE3("null"), //
		STIME("null"), //
		OBJ#("null"), //
		LOGMNR_UID("null"), //
		LOGMNR_FLAGS("null"), //
		START_SCNBAS("null"), //
		START_SCNWRP("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal objv#;
	private BigDecimal owner#;
	private String name;
	private BigDecimal namespace;
	private String subname;
	private BigDecimal type#;
	private String oid$;
	private String remoteowner;
	private String linkname;
	private BigDecimal flags;
	private BigDecimal spare3;
	private java.sql.Timestamp stime;
	private BigDecimal obj#;
	private BigDecimal logmnrUid;
	private BigDecimal logmnrFlags;
	private BigDecimal startScnbas;
	private BigDecimal startScnwrp;

	@Override
	public BigDecimal getObjv#() {
		return this.objv#;
	}
 
	@Override
	public void setObjv#(final BigDecimal objv#) {
		this.objv# = objv#; 
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
	public String getName() {
		return this.name;
	}
 
	@Override
	public void setName(final String name) {
		this.name = name; 
	}
 
	@Override
	public BigDecimal getNamespace() {
		return this.namespace;
	}
 
	@Override
	public void setNamespace(final BigDecimal namespace) {
		this.namespace = namespace; 
	}
 
	@Override
	public String getSubname() {
		return this.subname;
	}
 
	@Override
	public void setSubname(final String subname) {
		this.subname = subname; 
	}
 
	@Override
	public BigDecimal getType#() {
		return this.type#;
	}
 
	@Override
	public void setType#(final BigDecimal type#) {
		this.type# = type#; 
	}
 
	@Override
	public String getOid$() {
		return this.oid$;
	}
 
	@Override
	public void setOid$(final String oid$) {
		this.oid$ = oid$; 
	}
 
	@Override
	public String getRemoteowner() {
		return this.remoteowner;
	}
 
	@Override
	public void setRemoteowner(final String remoteowner) {
		this.remoteowner = remoteowner; 
	}
 
	@Override
	public String getLinkname() {
		return this.linkname;
	}
 
	@Override
	public void setLinkname(final String linkname) {
		this.linkname = linkname; 
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
	public BigDecimal getSpare3() {
		return this.spare3;
	}
 
	@Override
	public void setSpare3(final BigDecimal spare3) {
		this.spare3 = spare3; 
	}
 
	@Override
	public java.sql.Timestamp getStime() {
		return this.stime;
	}
 
	@Override
	public void setStime(final java.sql.Timestamp stime) {
		this.stime = stime; 
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
 
	@Override
	public BigDecimal getStartScnbas() {
		return this.startScnbas;
	}
 
	@Override
	public void setStartScnbas(final BigDecimal startScnbas) {
		this.startScnbas = startScnbas; 
	}
 
	@Override
	public BigDecimal getStartScnwrp() {
		return this.startScnwrp;
	}
 
	@Override
	public void setStartScnwrp(final BigDecimal startScnwrp) {
		this.startScnwrp = startScnwrp; 
	}
 
}
