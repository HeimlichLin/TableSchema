package com.doc.common.po.impl; 
 
public class T5102backupPo implements IT5102backupPo {
 
	public enum COLUMNS {
		CONTROLNO("null"), //
		ARRIVALDATE("null"), //
		FLIGHTNO("null"), //
		MWB("null"), //
		HWB("null"), //
		TTYPE("null"), //
		PIECE("null"), //
		MAINFESTPIECE("null"), //
		MAINFESTWEIGHT("null"), //
		LOADINGPORT("null"), //
		COPACKAGE("null"), //
		GCIDATE("null"), //
		GCITIME("null"), //
		IRREGULARITYREASON("null"), //
		WAREHOUSENO("null"), //
		STORAGE("null"), //
		STORAGEAREA("null"), //
		INDICATOR("null"), //
		UNIT("null"), //
		DEPARTUREDATE("null"), //
		SENDERID("null"), //
		SENDERQUALIFIER("null"), //
		RECEIVERID("null"), //
		RECEIVERQUALIFIER("null"), //
		DECLTYPE("null"), //
		SENDSTATUS("傳送註記") //
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
	private String arrivaldate;
	private String flightno;
	private String mwb;
	private String hwb;
	private String ttype;
	private String piece;
	private String mainfestpiece;
	private String mainfestweight;
	private String loadingport;
	private String copackage;
	private String gcidate;
	private String gcitime;
	private String irregularityreason;
	private String warehouseno;
	private String storage;
	private String storagearea;
	private String indicator;
	private String unit;
	private String departuredate;
	private String senderid;
	private String senderqualifier;
	private String receiverid;
	private String receiverqualifier;
	private String decltype;
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
	public String getArrivaldate() {
		return this.arrivaldate;
	}
 
	@Override
	public void setArrivaldate(final String arrivaldate) {
		this.arrivaldate = arrivaldate; 
	}
 
	@Override
	public String getFlightno() {
		return this.flightno;
	}
 
	@Override
	public void setFlightno(final String flightno) {
		this.flightno = flightno; 
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
	public String getPiece() {
		return this.piece;
	}
 
	@Override
	public void setPiece(final String piece) {
		this.piece = piece; 
	}
 
	@Override
	public String getMainfestpiece() {
		return this.mainfestpiece;
	}
 
	@Override
	public void setMainfestpiece(final String mainfestpiece) {
		this.mainfestpiece = mainfestpiece; 
	}
 
	@Override
	public String getMainfestweight() {
		return this.mainfestweight;
	}
 
	@Override
	public void setMainfestweight(final String mainfestweight) {
		this.mainfestweight = mainfestweight; 
	}
 
	@Override
	public String getLoadingport() {
		return this.loadingport;
	}
 
	@Override
	public void setLoadingport(final String loadingport) {
		this.loadingport = loadingport; 
	}
 
	@Override
	public String getCopackage() {
		return this.copackage;
	}
 
	@Override
	public void setCopackage(final String copackage) {
		this.copackage = copackage; 
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
	public String getIrregularityreason() {
		return this.irregularityreason;
	}
 
	@Override
	public void setIrregularityreason(final String irregularityreason) {
		this.irregularityreason = irregularityreason; 
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
	public String getUnit() {
		return this.unit;
	}
 
	@Override
	public void setUnit(final String unit) {
		this.unit = unit; 
	}
 
	@Override
	public String getDeparturedate() {
		return this.departuredate;
	}
 
	@Override
	public void setDeparturedate(final String departuredate) {
		this.departuredate = departuredate; 
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
	public String getSendstatus() {
		return this.sendstatus;
	}
 
	@Override
	public void setSendstatus(final String sendstatus) {
		this.sendstatus = sendstatus; 
	}
 
}
