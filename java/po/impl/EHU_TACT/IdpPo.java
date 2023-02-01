package com.doc.common.po.impl; 
 
public class IdpPo implements IIdpPo {
 
	public enum COLUMNS {
		DUTYNO("null"), //
		MWB("null"), //
		HWB("null"), //
		PAYMETHORD_1("null"), //
		PAYMETHORD_2("null"), //
		PAYMETHORD_3("null"), //
		PAYMETHORD_4("null"), //
		PAYMETHORD_5("null"), //
		PAYMETHORD_6("null"), //
		PAYMETHORD_7("null"), //
		PAYMETHORD_8("null"), //
		PAYMETHORD_9("null"), //
		DUTY_1("null"), //
		DUTY_2("null"), //
		DUTY_3("null"), //
		DUTY_4("null"), //
		DUTY_5("null"), //
		DUTY_6("null"), //
		DUTY_7("null"), //
		DUTY_8("null"), //
		DUTY_9("null"), //
		DUTYPAYMENT("null"), //
		WDATE("null"), //
		EXPRESSID("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String dutyno;
	private String mwb;
	private String hwb;
	private String paymethord1;
	private String paymethord2;
	private String paymethord3;
	private String paymethord4;
	private String paymethord5;
	private String paymethord6;
	private String paymethord7;
	private String paymethord8;
	private String paymethord9;
	private BigDecimal duty1;
	private BigDecimal duty2;
	private BigDecimal duty3;
	private BigDecimal duty4;
	private BigDecimal duty5;
	private BigDecimal duty6;
	private BigDecimal duty7;
	private BigDecimal duty8;
	private BigDecimal duty9;
	private BigDecimal dutypayment;
	private java.sql.Timestamp wdate;
	private String expressid;

	@Override
	public String getDutyno() {
		return this.dutyno;
	}
 
	@Override
	public void setDutyno(final String dutyno) {
		this.dutyno = dutyno; 
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
	public String getPaymethord1() {
		return this.paymethord1;
	}
 
	@Override
	public void setPaymethord1(final String paymethord1) {
		this.paymethord1 = paymethord1; 
	}
 
	@Override
	public String getPaymethord2() {
		return this.paymethord2;
	}
 
	@Override
	public void setPaymethord2(final String paymethord2) {
		this.paymethord2 = paymethord2; 
	}
 
	@Override
	public String getPaymethord3() {
		return this.paymethord3;
	}
 
	@Override
	public void setPaymethord3(final String paymethord3) {
		this.paymethord3 = paymethord3; 
	}
 
	@Override
	public String getPaymethord4() {
		return this.paymethord4;
	}
 
	@Override
	public void setPaymethord4(final String paymethord4) {
		this.paymethord4 = paymethord4; 
	}
 
	@Override
	public String getPaymethord5() {
		return this.paymethord5;
	}
 
	@Override
	public void setPaymethord5(final String paymethord5) {
		this.paymethord5 = paymethord5; 
	}
 
	@Override
	public String getPaymethord6() {
		return this.paymethord6;
	}
 
	@Override
	public void setPaymethord6(final String paymethord6) {
		this.paymethord6 = paymethord6; 
	}
 
	@Override
	public String getPaymethord7() {
		return this.paymethord7;
	}
 
	@Override
	public void setPaymethord7(final String paymethord7) {
		this.paymethord7 = paymethord7; 
	}
 
	@Override
	public String getPaymethord8() {
		return this.paymethord8;
	}
 
	@Override
	public void setPaymethord8(final String paymethord8) {
		this.paymethord8 = paymethord8; 
	}
 
	@Override
	public String getPaymethord9() {
		return this.paymethord9;
	}
 
	@Override
	public void setPaymethord9(final String paymethord9) {
		this.paymethord9 = paymethord9; 
	}
 
	@Override
	public BigDecimal getDuty1() {
		return this.duty1;
	}
 
	@Override
	public void setDuty1(final BigDecimal duty1) {
		this.duty1 = duty1; 
	}
 
	@Override
	public BigDecimal getDuty2() {
		return this.duty2;
	}
 
	@Override
	public void setDuty2(final BigDecimal duty2) {
		this.duty2 = duty2; 
	}
 
	@Override
	public BigDecimal getDuty3() {
		return this.duty3;
	}
 
	@Override
	public void setDuty3(final BigDecimal duty3) {
		this.duty3 = duty3; 
	}
 
	@Override
	public BigDecimal getDuty4() {
		return this.duty4;
	}
 
	@Override
	public void setDuty4(final BigDecimal duty4) {
		this.duty4 = duty4; 
	}
 
	@Override
	public BigDecimal getDuty5() {
		return this.duty5;
	}
 
	@Override
	public void setDuty5(final BigDecimal duty5) {
		this.duty5 = duty5; 
	}
 
	@Override
	public BigDecimal getDuty6() {
		return this.duty6;
	}
 
	@Override
	public void setDuty6(final BigDecimal duty6) {
		this.duty6 = duty6; 
	}
 
	@Override
	public BigDecimal getDuty7() {
		return this.duty7;
	}
 
	@Override
	public void setDuty7(final BigDecimal duty7) {
		this.duty7 = duty7; 
	}
 
	@Override
	public BigDecimal getDuty8() {
		return this.duty8;
	}
 
	@Override
	public void setDuty8(final BigDecimal duty8) {
		this.duty8 = duty8; 
	}
 
	@Override
	public BigDecimal getDuty9() {
		return this.duty9;
	}
 
	@Override
	public void setDuty9(final BigDecimal duty9) {
		this.duty9 = duty9; 
	}
 
	@Override
	public BigDecimal getDutypayment() {
		return this.dutypayment;
	}
 
	@Override
	public void setDutypayment(final BigDecimal dutypayment) {
		this.dutypayment = dutypayment; 
	}
 
	@Override
	public java.sql.Timestamp getWdate() {
		return this.wdate;
	}
 
	@Override
	public void setWdate(final java.sql.Timestamp wdate) {
		this.wdate = wdate; 
	}
 
	@Override
	public String getExpressid() {
		return this.expressid;
	}
 
	@Override
	public void setExpressid(final String expressid) {
		this.expressid = expressid; 
	}
 
}
