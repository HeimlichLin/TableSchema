package com.doc.common.po.impl; 
 
public class LogmnrSessionActions$Po implements ILogmnrSessionActions$Po {
 
	public enum COLUMNS {
		FLAGSRUNTIME("null"), //
		DROPSCN("null"), //
		MODIFYTIME("null"), //
		DISPATCHTIME("null"), //
		DROPTIME("null"), //
		LCRCOUNT("null"), //
		ACTIONNAME("null"), //
		LOGMNRSESSION#("null"), //
		PROCESSROLE#("null"), //
		ACTIONTYPE#("null"), //
		FLAGSDEFINETIME("null"), //
		CREATETIME("null"), //
		XIDUSN("null"), //
		XIDSLT("null"), //
		XIDSQN("null"), //
		THREAD#("null"), //
		STARTSCN("null"), //
		STARTSUBSCN("null"), //
		ENDSCN("null"), //
		ENDSUBSCN("null"), //
		RBASQN("null"), //
		RBABLK("null"), //
		RBABYTE("null"), //
		SESSION#("null"), //
		OBJ#("null"), //
		ATTR1("null"), //
		ATTR2("null"), //
		ATTR3("null"), //
		SPARE1("null"), //
		SPARE2("null"), //
		SPARE3("null"), //
		SPARE4("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal flagsruntime;
	private BigDecimal dropscn;
	private String modifytime;
	private String dispatchtime;
	private String droptime;
	private BigDecimal lcrcount;
	private String actionname;
	private BigDecimal logmnrsession#;
	private BigDecimal processrole#;
	private BigDecimal actiontype#;
	private BigDecimal flagsdefinetime;
	private String createtime;
	private BigDecimal xidusn;
	private BigDecimal xidslt;
	private BigDecimal xidsqn;
	private BigDecimal thread#;
	private BigDecimal startscn;
	private BigDecimal startsubscn;
	private BigDecimal endscn;
	private BigDecimal endsubscn;
	private BigDecimal rbasqn;
	private BigDecimal rbablk;
	private BigDecimal rbabyte;
	private BigDecimal session#;
	private BigDecimal obj#;
	private BigDecimal attr1;
	private BigDecimal attr2;
	private BigDecimal attr3;
	private BigDecimal spare1;
	private BigDecimal spare2;
	private String spare3;
	private String spare4;

	@Override
	public BigDecimal getFlagsruntime() {
		return this.flagsruntime;
	}
 
	@Override
	public void setFlagsruntime(final BigDecimal flagsruntime) {
		this.flagsruntime = flagsruntime; 
	}
 
	@Override
	public BigDecimal getDropscn() {
		return this.dropscn;
	}
 
	@Override
	public void setDropscn(final BigDecimal dropscn) {
		this.dropscn = dropscn; 
	}
 
	@Override
	public String getModifytime() {
		return this.modifytime;
	}
 
	@Override
	public void setModifytime(final String modifytime) {
		this.modifytime = modifytime; 
	}
 
	@Override
	public String getDispatchtime() {
		return this.dispatchtime;
	}
 
	@Override
	public void setDispatchtime(final String dispatchtime) {
		this.dispatchtime = dispatchtime; 
	}
 
	@Override
	public String getDroptime() {
		return this.droptime;
	}
 
	@Override
	public void setDroptime(final String droptime) {
		this.droptime = droptime; 
	}
 
	@Override
	public BigDecimal getLcrcount() {
		return this.lcrcount;
	}
 
	@Override
	public void setLcrcount(final BigDecimal lcrcount) {
		this.lcrcount = lcrcount; 
	}
 
	@Override
	public String getActionname() {
		return this.actionname;
	}
 
	@Override
	public void setActionname(final String actionname) {
		this.actionname = actionname; 
	}
 
	@Override
	public BigDecimal getLogmnrsession#() {
		return this.logmnrsession#;
	}
 
	@Override
	public void setLogmnrsession#(final BigDecimal logmnrsession#) {
		this.logmnrsession# = logmnrsession#; 
	}
 
	@Override
	public BigDecimal getProcessrole#() {
		return this.processrole#;
	}
 
	@Override
	public void setProcessrole#(final BigDecimal processrole#) {
		this.processrole# = processrole#; 
	}
 
	@Override
	public BigDecimal getActiontype#() {
		return this.actiontype#;
	}
 
	@Override
	public void setActiontype#(final BigDecimal actiontype#) {
		this.actiontype# = actiontype#; 
	}
 
	@Override
	public BigDecimal getFlagsdefinetime() {
		return this.flagsdefinetime;
	}
 
	@Override
	public void setFlagsdefinetime(final BigDecimal flagsdefinetime) {
		this.flagsdefinetime = flagsdefinetime; 
	}
 
	@Override
	public String getCreatetime() {
		return this.createtime;
	}
 
	@Override
	public void setCreatetime(final String createtime) {
		this.createtime = createtime; 
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
	public BigDecimal getThread#() {
		return this.thread#;
	}
 
	@Override
	public void setThread#(final BigDecimal thread#) {
		this.thread# = thread#; 
	}
 
	@Override
	public BigDecimal getStartscn() {
		return this.startscn;
	}
 
	@Override
	public void setStartscn(final BigDecimal startscn) {
		this.startscn = startscn; 
	}
 
	@Override
	public BigDecimal getStartsubscn() {
		return this.startsubscn;
	}
 
	@Override
	public void setStartsubscn(final BigDecimal startsubscn) {
		this.startsubscn = startsubscn; 
	}
 
	@Override
	public BigDecimal getEndscn() {
		return this.endscn;
	}
 
	@Override
	public void setEndscn(final BigDecimal endscn) {
		this.endscn = endscn; 
	}
 
	@Override
	public BigDecimal getEndsubscn() {
		return this.endsubscn;
	}
 
	@Override
	public void setEndsubscn(final BigDecimal endsubscn) {
		this.endsubscn = endsubscn; 
	}
 
	@Override
	public BigDecimal getRbasqn() {
		return this.rbasqn;
	}
 
	@Override
	public void setRbasqn(final BigDecimal rbasqn) {
		this.rbasqn = rbasqn; 
	}
 
	@Override
	public BigDecimal getRbablk() {
		return this.rbablk;
	}
 
	@Override
	public void setRbablk(final BigDecimal rbablk) {
		this.rbablk = rbablk; 
	}
 
	@Override
	public BigDecimal getRbabyte() {
		return this.rbabyte;
	}
 
	@Override
	public void setRbabyte(final BigDecimal rbabyte) {
		this.rbabyte = rbabyte; 
	}
 
	@Override
	public BigDecimal getSession#() {
		return this.session#;
	}
 
	@Override
	public void setSession#(final BigDecimal session#) {
		this.session# = session#; 
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
	public BigDecimal getAttr1() {
		return this.attr1;
	}
 
	@Override
	public void setAttr1(final BigDecimal attr1) {
		this.attr1 = attr1; 
	}
 
	@Override
	public BigDecimal getAttr2() {
		return this.attr2;
	}
 
	@Override
	public void setAttr2(final BigDecimal attr2) {
		this.attr2 = attr2; 
	}
 
	@Override
	public BigDecimal getAttr3() {
		return this.attr3;
	}
 
	@Override
	public void setAttr3(final BigDecimal attr3) {
		this.attr3 = attr3; 
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
	public String getSpare3() {
		return this.spare3;
	}
 
	@Override
	public void setSpare3(final String spare3) {
		this.spare3 = spare3; 
	}
 
	@Override
	public String getSpare4() {
		return this.spare4;
	}
 
	@Override
	public void setSpare4(final String spare4) {
		this.spare4 = spare4; 
	}
 
}
