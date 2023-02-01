package com.doc.common.po.impl; 
 
public class HistorychargePo implements IHistorychargePo {
 
	public enum COLUMNS {
		BAGNO("null"), //
		DECLNO("null"), //
		MWB("null"), //
		HWB("null"), //
		PREVPIECE("null"), //
		PREVFEE("null"), //
		PREVWEIGHT("null"), //
		DIFFPIECE("null"), //
		DIFFFEE("null"), //
		DIFFWEIGHT("null"), //
		EXPRESSID("null"), //
		WAREHOUSE("null"), //
		CHARGEDATE("null"), //
		EXTRAFEE("null"), //
		EXTRAFEEMARK("null"), //
		CREATEDATE("null"), //
		LASTCHARGEDATE("null"), //
		IE("null"), //
		WORKAREA("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String bagno;
	private String declno;
	private String mwb;
	private String hwb;
	private BigDecimal prevpiece;
	private BigDecimal prevfee;
	private BigDecimal prevweight;
	private BigDecimal diffpiece;
	private BigDecimal difffee;
	private BigDecimal diffweight;
	private String expressid;
	private String warehouse;
	private java.sql.Timestamp chargedate;
	private BigDecimal extrafee;
	private String extrafeemark;
	private java.sql.Timestamp createdate;
	private java.sql.Timestamp lastchargedate;
	private String ie;
	private String workarea;

	@Override
	public String getBagno() {
		return this.bagno;
	}
 
	@Override
	public void setBagno(final String bagno) {
		this.bagno = bagno; 
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
	public BigDecimal getPrevpiece() {
		return this.prevpiece;
	}
 
	@Override
	public void setPrevpiece(final BigDecimal prevpiece) {
		this.prevpiece = prevpiece; 
	}
 
	@Override
	public BigDecimal getPrevfee() {
		return this.prevfee;
	}
 
	@Override
	public void setPrevfee(final BigDecimal prevfee) {
		this.prevfee = prevfee; 
	}
 
	@Override
	public BigDecimal getPrevweight() {
		return this.prevweight;
	}
 
	@Override
	public void setPrevweight(final BigDecimal prevweight) {
		this.prevweight = prevweight; 
	}
 
	@Override
	public BigDecimal getDiffpiece() {
		return this.diffpiece;
	}
 
	@Override
	public void setDiffpiece(final BigDecimal diffpiece) {
		this.diffpiece = diffpiece; 
	}
 
	@Override
	public BigDecimal getDifffee() {
		return this.difffee;
	}
 
	@Override
	public void setDifffee(final BigDecimal difffee) {
		this.difffee = difffee; 
	}
 
	@Override
	public BigDecimal getDiffweight() {
		return this.diffweight;
	}
 
	@Override
	public void setDiffweight(final BigDecimal diffweight) {
		this.diffweight = diffweight; 
	}
 
	@Override
	public String getExpressid() {
		return this.expressid;
	}
 
	@Override
	public void setExpressid(final String expressid) {
		this.expressid = expressid; 
	}
 
	@Override
	public String getWarehouse() {
		return this.warehouse;
	}
 
	@Override
	public void setWarehouse(final String warehouse) {
		this.warehouse = warehouse; 
	}
 
	@Override
	public java.sql.Timestamp getChargedate() {
		return this.chargedate;
	}
 
	@Override
	public void setChargedate(final java.sql.Timestamp chargedate) {
		this.chargedate = chargedate; 
	}
 
	@Override
	public BigDecimal getExtrafee() {
		return this.extrafee;
	}
 
	@Override
	public void setExtrafee(final BigDecimal extrafee) {
		this.extrafee = extrafee; 
	}
 
	@Override
	public String getExtrafeemark() {
		return this.extrafeemark;
	}
 
	@Override
	public void setExtrafeemark(final String extrafeemark) {
		this.extrafeemark = extrafeemark; 
	}
 
	@Override
	public java.sql.Timestamp getCreatedate() {
		return this.createdate;
	}
 
	@Override
	public void setCreatedate(final java.sql.Timestamp createdate) {
		this.createdate = createdate; 
	}
 
	@Override
	public java.sql.Timestamp getLastchargedate() {
		return this.lastchargedate;
	}
 
	@Override
	public void setLastchargedate(final java.sql.Timestamp lastchargedate) {
		this.lastchargedate = lastchargedate; 
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
	public String getWorkarea() {
		return this.workarea;
	}
 
	@Override
	public void setWorkarea(final String workarea) {
		this.workarea = workarea; 
	}
 
}
