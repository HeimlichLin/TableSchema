package com.doc.common.po.impl; 
 
public class Clearf2Po implements IClearf2Po {
 
	public enum COLUMNS {
		BONDNO("null"), //
		DECLNO("null"), //
		ITEMNO("null"), //
		DECLTYPE("null"), //
		PRDTNO("null"), //
		QTY("null"), //
		POST("null"), //
		DUTYTYPE("null"), //
		ODECLNO("null"), //
		OITEMNO("null"), //
		ODECLTYPE("null"), //
		OPRDTNO("null"), //
		OQTY("null"), //
		OPOST("null"), //
		ODUTYTYPE("null"), //
		OUTSTATUS("null"), //
		F4DATE("null"), //
		F2DATE("null"), //
		UNIT("null"), //
		F2UNIT("null"), //
		BOMQUILTY("null"), //
		BOMQTY("null") //
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
	private String declno;
	private BigDecimal itemno;
	private String decltype;
	private String prdtno;
	private BigDecimal qty;
	private String post;
	private String dutytype;
	private String odeclno;
	private BigDecimal oitemno;
	private String odecltype;
	private String oprdtno;
	private BigDecimal oqty;
	private String opost;
	private String odutytype;
	private String outstatus;
	private String f4date;
	private String f2date;
	private String unit;
	private String f2unit;
	private BigDecimal bomquilty;
	private BigDecimal bomqty;

	@Override
	public String getBondno() {
		return this.bondno;
	}
 
	@Override
	public void setBondno(final String bondno) {
		this.bondno = bondno; 
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
	public BigDecimal getItemno() {
		return this.itemno;
	}
 
	@Override
	public void setItemno(final BigDecimal itemno) {
		this.itemno = itemno; 
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
	public String getPrdtno() {
		return this.prdtno;
	}
 
	@Override
	public void setPrdtno(final String prdtno) {
		this.prdtno = prdtno; 
	}
 
	@Override
	public BigDecimal getQty() {
		return this.qty;
	}
 
	@Override
	public void setQty(final BigDecimal qty) {
		this.qty = qty; 
	}
 
	@Override
	public String getPost() {
		return this.post;
	}
 
	@Override
	public void setPost(final String post) {
		this.post = post; 
	}
 
	@Override
	public String getDutytype() {
		return this.dutytype;
	}
 
	@Override
	public void setDutytype(final String dutytype) {
		this.dutytype = dutytype; 
	}
 
	@Override
	public String getOdeclno() {
		return this.odeclno;
	}
 
	@Override
	public void setOdeclno(final String odeclno) {
		this.odeclno = odeclno; 
	}
 
	@Override
	public BigDecimal getOitemno() {
		return this.oitemno;
	}
 
	@Override
	public void setOitemno(final BigDecimal oitemno) {
		this.oitemno = oitemno; 
	}
 
	@Override
	public String getOdecltype() {
		return this.odecltype;
	}
 
	@Override
	public void setOdecltype(final String odecltype) {
		this.odecltype = odecltype; 
	}
 
	@Override
	public String getOprdtno() {
		return this.oprdtno;
	}
 
	@Override
	public void setOprdtno(final String oprdtno) {
		this.oprdtno = oprdtno; 
	}
 
	@Override
	public BigDecimal getOqty() {
		return this.oqty;
	}
 
	@Override
	public void setOqty(final BigDecimal oqty) {
		this.oqty = oqty; 
	}
 
	@Override
	public String getOpost() {
		return this.opost;
	}
 
	@Override
	public void setOpost(final String opost) {
		this.opost = opost; 
	}
 
	@Override
	public String getOdutytype() {
		return this.odutytype;
	}
 
	@Override
	public void setOdutytype(final String odutytype) {
		this.odutytype = odutytype; 
	}
 
	@Override
	public String getOutstatus() {
		return this.outstatus;
	}
 
	@Override
	public void setOutstatus(final String outstatus) {
		this.outstatus = outstatus; 
	}
 
	@Override
	public String getF4date() {
		return this.f4date;
	}
 
	@Override
	public void setF4date(final String f4date) {
		this.f4date = f4date; 
	}
 
	@Override
	public String getF2date() {
		return this.f2date;
	}
 
	@Override
	public void setF2date(final String f2date) {
		this.f2date = f2date; 
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
	public String getF2unit() {
		return this.f2unit;
	}
 
	@Override
	public void setF2unit(final String f2unit) {
		this.f2unit = f2unit; 
	}
 
	@Override
	public BigDecimal getBomquilty() {
		return this.bomquilty;
	}
 
	@Override
	public void setBomquilty(final BigDecimal bomquilty) {
		this.bomquilty = bomquilty; 
	}
 
	@Override
	public BigDecimal getBomqty() {
		return this.bomqty;
	}
 
	@Override
	public void setBomqty(final BigDecimal bomqty) {
		this.bomqty = bomqty; 
	}
 
}
