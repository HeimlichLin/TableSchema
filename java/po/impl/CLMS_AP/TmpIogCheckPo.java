package com.doc.common.po.impl; 
 
public class TmpIogCheckPo implements ITmpIogCheckPo {
 
	public enum COLUMNS {
		BONDNO("監管編號"), //
		IOCOUNT("進出倉筆數"), //
		BCOUNT("退貨筆數"), //
		GCOUNT("保證金筆數"), //
		INIONOTG("進出倉不包含保證金筆數"), //
		INBNOTG("退貨不包含保證金筆數"), //
		INGNOTIBO("保證金不包含金出倉與退貨筆數"), //
		INOROUT("進倉或出倉(I/O)"), //
		MONTH("統計年月份"), //
		GMINUSIO("保證金-進出倉數量-退貨書量(差異)若相同時表示相等") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String bondno;
	private String iocount;
	private String bcount;
	private String gcount;
	private String inionotg;
	private String inbnotg;
	private String ingnotibo;
	private String inorout;
	private String month;
	private String gminusio;

	@Override
	public String getBondno() {
		return this.bondno;
	}
 
	@Override
	public void setBondno(final String bondno) {
		this.bondno = bondno; 
	}
 
	@Override
	public String getIocount() {
		return this.iocount;
	}
 
	@Override
	public void setIocount(final String iocount) {
		this.iocount = iocount; 
	}
 
	@Override
	public String getBcount() {
		return this.bcount;
	}
 
	@Override
	public void setBcount(final String bcount) {
		this.bcount = bcount; 
	}
 
	@Override
	public String getGcount() {
		return this.gcount;
	}
 
	@Override
	public void setGcount(final String gcount) {
		this.gcount = gcount; 
	}
 
	@Override
	public String getInionotg() {
		return this.inionotg;
	}
 
	@Override
	public void setInionotg(final String inionotg) {
		this.inionotg = inionotg; 
	}
 
	@Override
	public String getInbnotg() {
		return this.inbnotg;
	}
 
	@Override
	public void setInbnotg(final String inbnotg) {
		this.inbnotg = inbnotg; 
	}
 
	@Override
	public String getIngnotibo() {
		return this.ingnotibo;
	}
 
	@Override
	public void setIngnotibo(final String ingnotibo) {
		this.ingnotibo = ingnotibo; 
	}
 
	@Override
	public String getInorout() {
		return this.inorout;
	}
 
	@Override
	public void setInorout(final String inorout) {
		this.inorout = inorout; 
	}
 
	@Override
	public String getMonth() {
		return this.month;
	}
 
	@Override
	public void setMonth(final String month) {
		this.month = month; 
	}
 
	@Override
	public String getGminusio() {
		return this.gminusio;
	}
 
	@Override
	public void setGminusio(final String gminusio) {
		this.gminusio = gminusio; 
	}
 
}
