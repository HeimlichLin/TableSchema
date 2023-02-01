package com.doc.common.po.impl; 
 
public class LogmnrDictstate$Po implements ILogmnrDictstate$Po {
 
	public enum COLUMNS {
		LOGMNR_UID("null"), //
		START_SCNBAS("null"), //
		START_SCNWRP("null"), //
		END_SCNBAS("null"), //
		END_SCNWRP("null"), //
		REDO_THREAD("null"), //
		RBASQN("null"), //
		RBABLK("null"), //
		RBABYTE("null"), //
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
 
	private BigDecimal logmnrUid;
	private BigDecimal startScnbas;
	private BigDecimal startScnwrp;
	private BigDecimal endScnbas;
	private BigDecimal endScnwrp;
	private BigDecimal redoThread;
	private BigDecimal rbasqn;
	private BigDecimal rbablk;
	private BigDecimal rbabyte;
	private BigDecimal logmnrFlags;

	@Override
	public BigDecimal getLogmnrUid() {
		return this.logmnrUid;
	}
 
	@Override
	public void setLogmnrUid(final BigDecimal logmnrUid) {
		this.logmnrUid = logmnrUid; 
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
 
	@Override
	public BigDecimal getEndScnbas() {
		return this.endScnbas;
	}
 
	@Override
	public void setEndScnbas(final BigDecimal endScnbas) {
		this.endScnbas = endScnbas; 
	}
 
	@Override
	public BigDecimal getEndScnwrp() {
		return this.endScnwrp;
	}
 
	@Override
	public void setEndScnwrp(final BigDecimal endScnwrp) {
		this.endScnwrp = endScnwrp; 
	}
 
	@Override
	public BigDecimal getRedoThread() {
		return this.redoThread;
	}
 
	@Override
	public void setRedoThread(final BigDecimal redoThread) {
		this.redoThread = redoThread; 
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
	public BigDecimal getLogmnrFlags() {
		return this.logmnrFlags;
	}
 
	@Override
	public void setLogmnrFlags(final BigDecimal logmnrFlags) {
		this.logmnrFlags = logmnrFlags; 
	}
 
}
