package com.doc.common.po.impl; 
 
public class T5110dbackupPo implements IT5110dbackupPo {
 
	public enum COLUMNS {
		DUTYNO("null"), //
		MWB("null"), //
		HWB("null"), //
		PAYMETHORD("null"), //
		DUTY("null"), //
		LASTUPDATE("null"), //
		PAYMETHOD2("稅費代號2
"), //
		PAYMETHOD3("稅費代號3"), //
		PAYMETHOD4("稅費代號4"), //
		PAYMETHOD5("稅費代號5"), //
		PAYMETHOD6("稅費代號6"), //
		PAYMETHOD7("稅費代號7"), //
		PAYMETHOD8("稅費代號8"), //
		PAYMETHOD9("稅費代號9"), //
		DUTY2("稅費金額2"), //
		DUTY3("稅費金額3"), //
		DUTY4("稅費金額4"), //
		DUTY5("稅費金額5"), //
		DUTY6("稅費金額6"), //
		DUTY7("稅費金額7"), //
		DUTY8("稅費金額8"), //
		DUTY9("稅費金額9") //
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
	private String paymethord;
	private BigDecimal duty;
	private java.sql.Timestamp lastupdate;
	private String paymethod2;
	private String paymethod3;
	private String paymethod4;
	private String paymethod5;
	private String paymethod6;
	private String paymethod7;
	private String paymethod8;
	private String paymethod9;
	private String duty2;
	private String duty3;
	private String duty4;
	private String duty5;
	private String duty6;
	private String duty7;
	private String duty8;
	private String duty9;

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
	public String getPaymethord() {
		return this.paymethord;
	}
 
	@Override
	public void setPaymethord(final String paymethord) {
		this.paymethord = paymethord; 
	}
 
	@Override
	public BigDecimal getDuty() {
		return this.duty;
	}
 
	@Override
	public void setDuty(final BigDecimal duty) {
		this.duty = duty; 
	}
 
	@Override
	public java.sql.Timestamp getLastupdate() {
		return this.lastupdate;
	}
 
	@Override
	public void setLastupdate(final java.sql.Timestamp lastupdate) {
		this.lastupdate = lastupdate; 
	}
 
	@Override
	public String getPaymethod2() {
		return this.paymethod2;
	}
 
	@Override
	public void setPaymethod2(final String paymethod2) {
		this.paymethod2 = paymethod2; 
	}
 
	@Override
	public String getPaymethod3() {
		return this.paymethod3;
	}
 
	@Override
	public void setPaymethod3(final String paymethod3) {
		this.paymethod3 = paymethod3; 
	}
 
	@Override
	public String getPaymethod4() {
		return this.paymethod4;
	}
 
	@Override
	public void setPaymethod4(final String paymethod4) {
		this.paymethod4 = paymethod4; 
	}
 
	@Override
	public String getPaymethod5() {
		return this.paymethod5;
	}
 
	@Override
	public void setPaymethod5(final String paymethod5) {
		this.paymethod5 = paymethod5; 
	}
 
	@Override
	public String getPaymethod6() {
		return this.paymethod6;
	}
 
	@Override
	public void setPaymethod6(final String paymethod6) {
		this.paymethod6 = paymethod6; 
	}
 
	@Override
	public String getPaymethod7() {
		return this.paymethod7;
	}
 
	@Override
	public void setPaymethod7(final String paymethod7) {
		this.paymethod7 = paymethod7; 
	}
 
	@Override
	public String getPaymethod8() {
		return this.paymethod8;
	}
 
	@Override
	public void setPaymethod8(final String paymethod8) {
		this.paymethod8 = paymethod8; 
	}
 
	@Override
	public String getPaymethod9() {
		return this.paymethod9;
	}
 
	@Override
	public void setPaymethod9(final String paymethod9) {
		this.paymethod9 = paymethod9; 
	}
 
	@Override
	public String getDuty2() {
		return this.duty2;
	}
 
	@Override
	public void setDuty2(final String duty2) {
		this.duty2 = duty2; 
	}
 
	@Override
	public String getDuty3() {
		return this.duty3;
	}
 
	@Override
	public void setDuty3(final String duty3) {
		this.duty3 = duty3; 
	}
 
	@Override
	public String getDuty4() {
		return this.duty4;
	}
 
	@Override
	public void setDuty4(final String duty4) {
		this.duty4 = duty4; 
	}
 
	@Override
	public String getDuty5() {
		return this.duty5;
	}
 
	@Override
	public void setDuty5(final String duty5) {
		this.duty5 = duty5; 
	}
 
	@Override
	public String getDuty6() {
		return this.duty6;
	}
 
	@Override
	public void setDuty6(final String duty6) {
		this.duty6 = duty6; 
	}
 
	@Override
	public String getDuty7() {
		return this.duty7;
	}
 
	@Override
	public void setDuty7(final String duty7) {
		this.duty7 = duty7; 
	}
 
	@Override
	public String getDuty8() {
		return this.duty8;
	}
 
	@Override
	public void setDuty8(final String duty8) {
		this.duty8 = duty8; 
	}
 
	@Override
	public String getDuty9() {
		return this.duty9;
	}
 
	@Override
	public void setDuty9(final String duty9) {
		this.duty9 = duty9; 
	}
 
}
