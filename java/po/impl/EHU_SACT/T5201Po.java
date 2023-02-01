package com.doc.common.po.impl; 
 
public class T5201Po implements IT5201Po {
 
	public enum COLUMNS {
		CONTROLNO("????(?????)"), //
		MWB("null"), //
		HWB("null"), //
		TTYPE("???"), //
		MWBPIECE("null"), //
		HWBPIECE("null"), //
		WEIGHT("????"), //
		UNIT("null"), //
		GCIDATE("null"), //
		GCITIME("????"), //
		WAREHOUSENO("null"), //
		STORAGE("null"), //
		STORAGEAREA("null"), //
		INDICATOR("null"), //
		SENDERID("null"), //
		SENDERQUALIFIER("null"), //
		RECEIVERID("null"), //
		RECEIVERQUALIFIER("null"), //
		DECLTYPE("null"), //
		BRIEFNOTE("null"), //
		SENDSTATUS("????") //
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
	private String mwb;
	private String hwb;
	private String ttype;
	private String mwbpiece;
	private String hwbpiece;
	private String weight;
	private String unit;
	private String gcidate;
	private String gcitime;
	private String warehouseno;
	private String storage;
	private String storagearea;
	private String indicator;
	private String senderid;
	private String senderqualifier;
	private String receiverid;
	private String receiverqualifier;
	private String decltype;
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
	public String getTtype() {
		return this.ttype;
	}
 
	@Override
	public void setTtype(final String ttype) {
		this.ttype = ttype; 
	}
 
	@Override
	public String getMwbpiece() {
		return this.mwbpiece;
	}
 
	@Override
	public void setMwbpiece(final String mwbpiece) {
		this.mwbpiece = mwbpiece; 
	}
 
	@Override
	public String getHwbpiece() {
		return this.hwbpiece;
	}
 
	@Override
	public void setHwbpiece(final String hwbpiece) {
		this.hwbpiece = hwbpiece; 
	}
 
	@Override
	public String getWeight() {
		return this.weight;
	}
 
	@Override
	public void setWeight(final String weight) {
		this.weight = weight; 
	}
 
	@Override
	public String getUnit() {
		return this.unit;
	}
 
	@Override
	public void setUnit(final String unit) {
		this.unit = unit; 
	}
 
	@Override
	public String getGcidate() {
		return this.gcidate;
	}
 
	@Override
	public void setGcidate(final String gcidate) {
		this.gcidate = gcidate; 
	}
 
	@Override
	public String getGcitime() {
		return this.gcitime;
	}
 
	@Override
	public void setGcitime(final String gcitime) {
		this.gcitime = gcitime; 
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
	public String getStorage() {
		return this.storage;
	}
 
	@Override
	public void setStorage(final String storage) {
		this.storage = storage; 
	}
 
	@Override
	public String getStoragearea() {
		return this.storagearea;
	}
 
	@Override
	public void setStoragearea(final String storagearea) {
		this.storagearea = storagearea; 
	}
 
	@Override
	public String getIndicator() {
		return this.indicator;
	}
 
	@Override
	public void setIndicator(final String indicator) {
		this.indicator = indicator; 
	}
 
	@Override
	public String getSenderid() {
		return this.senderid;
	}
 
	@Override
	public void setSenderid(final String senderid) {
		this.senderid = senderid; 
	}
 
	@Override
	public String getSenderqualifier() {
		return this.senderqualifier;
	}
 
	@Override
	public void setSenderqualifier(final String senderqualifier) {
		this.senderqualifier = senderqualifier; 
	}
 
	@Override
	public String getReceiverid() {
		return this.receiverid;
	}
 
	@Override
	public void setReceiverid(final String receiverid) {
		this.receiverid = receiverid; 
	}
 
	@Override
	public String getReceiverqualifier() {
		return this.receiverqualifier;
	}
 
	@Override
	public void setReceiverqualifier(final String receiverqualifier) {
		this.receiverqualifier = receiverqualifier; 
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
