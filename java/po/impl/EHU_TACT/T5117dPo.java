package com.doc.common.po.impl; 
 
public class T5117dPo implements IT5117dPo {
 
	public enum COLUMNS {
		CONTROLNO("null"), //
		DECLNO("null"), //
		PARTIALRELEASENOTE("null"), //
		GCODATE("null"), //
		DECLTYPE("null"), //
		IE("null"), //
		WAREHOUSENO("null"), //
		MWB("主提單號碼
"), //
		HWB("分提單號碼
"), //
		SONO("艙單號碼
"), //
		VRNO("海關通關號碼
"), //
		PARTRELEASENOTE("部分放行註記
"), //
		GCOPIECE("出倉件數
"), //
		UNRELEASEDUNIT("件數單位
"), //
		TTYPE("異動別
"), //
		BRIEFNOTE("簡易申報註記
"), //
		SENDSTATUS("傳送狀態") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String controlno;
	private String declno;
	private String partialreleasenote;
	private String gcodate;
	private String decltype;
	private String ie;
	private String warehouseno;
	private String mwb;
	private String hwb;
	private String sono;
	private String vrno;
	private String partreleasenote;
	private String gcopiece;
	private String unreleasedunit;
	private String ttype;
	private String briefnote;
	private String sendstatus;

	@Override
	public String getControlno() {
		return this.controlno;
	}
 
	@Override
	public void setControlno(final String controlno) {
		this.controlno = controlno; 
	}
 
	@Override
	public String getDeclno() {
		return this.declno;
	}
 
	@Override
	public void setDeclno(final String declno) {
		this.declno = declno; 
	}
 
	@Override
	public String getPartialreleasenote() {
		return this.partialreleasenote;
	}
 
	@Override
	public void setPartialreleasenote(final String partialreleasenote) {
		this.partialreleasenote = partialreleasenote; 
	}
 
	@Override
	public String getGcodate() {
		return this.gcodate;
	}
 
	@Override
	public void setGcodate(final String gcodate) {
		this.gcodate = gcodate; 
	}
 
	@Override
	public String getDecltype() {
		return this.decltype;
	}
 
	@Override
	public void setDecltype(final String decltype) {
		this.decltype = decltype; 
	}
 
	@Override
	public String getIe() {
		return this.ie;
	}
 
	@Override
	public void setIe(final String ie) {
		this.ie = ie; 
	}
 
	@Override
	public String getWarehouseno() {
		return this.warehouseno;
	}
 
	@Override
	public void setWarehouseno(final String warehouseno) {
		this.warehouseno = warehouseno; 
	}
 
	@Override
	public String getMwb() {
		return this.mwb;
	}
 
	@Override
	public void setMwb(final String mwb) {
		this.mwb = mwb; 
	}
 
	@Override
	public String getHwb() {
		return this.hwb;
	}
 
	@Override
	public void setHwb(final String hwb) {
		this.hwb = hwb; 
	}
 
	@Override
	public String getSono() {
		return this.sono;
	}
 
	@Override
	public void setSono(final String sono) {
		this.sono = sono; 
	}
 
	@Override
	public String getVrno() {
		return this.vrno;
	}
 
	@Override
	public void setVrno(final String vrno) {
		this.vrno = vrno; 
	}
 
	@Override
	public String getPartreleasenote() {
		return this.partreleasenote;
	}
 
	@Override
	public void setPartreleasenote(final String partreleasenote) {
		this.partreleasenote = partreleasenote; 
	}
 
	@Override
	public String getGcopiece() {
		return this.gcopiece;
	}
 
	@Override
	public void setGcopiece(final String gcopiece) {
		this.gcopiece = gcopiece; 
	}
 
	@Override
	public String getUnreleasedunit() {
		return this.unreleasedunit;
	}
 
	@Override
	public void setUnreleasedunit(final String unreleasedunit) {
		this.unreleasedunit = unreleasedunit; 
	}
 
	@Override
	public String getTtype() {
		return this.ttype;
	}
 
	@Override
	public void setTtype(final String ttype) {
		this.ttype = ttype; 
	}
 
	@Override
	public String getBriefnote() {
		return this.briefnote;
	}
 
	@Override
	public void setBriefnote(final String briefnote) {
		this.briefnote = briefnote; 
	}
 
	@Override
	public String getSendstatus() {
		return this.sendstatus;
	}
 
	@Override
	public void setSendstatus(final String sendstatus) {
		this.sendstatus = sendstatus; 
	}
 
}
