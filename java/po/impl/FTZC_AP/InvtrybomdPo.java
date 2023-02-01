package com.doc.common.po.impl; 
 
public class InvtrybomdPo implements IInvtrybomdPo {
 
	public enum COLUMNS {
		SET_NO("結算表編號"), //
		CTM_CODE("客戶編號"), //
		COCOMP_NO("協力廠編號"), //
		RPT("報表類別"), //
		BF_NO("監管編號"), //
		PG("頁次"), //
		PRDT_NO("料號"), //
		UNIT("單位"), //
		SNO("項次"), //
		UQ1("單位用量一"), //
		WQ1("折合用量一"), //
		UQ2("單位用量二"), //
		WQ2("折合用量二"), //
		UQ3("單位用量三"), //
		WQ3("折合用量三"), //
		UQ4("單位用量四"), //
		WQ4("折合用量四"), //
		UQ5("單位用量五"), //
		WQ5("折合用量五"), //
		UQ6("單位用量六"), //
		WQ6("折合用量六"), //
		UQ7("單位用量七"), //
		WQ7("折合用量"), //
		UQ8("單位用量八"), //
		WQ8("折合用量八"), //
		UQ9("單位用量九"), //
		WQ9("折合用量九"), //
		SUMQ("折合合計"), //
		RMKS("備註"), //
		LKYN("用以鎖住結算表資料，若為Y則不允許重新建立結算表") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String setNo;
	private String ctmCode;
	private String cocompNo;
	private String rpt;
	private String bfNo;
	private BigDecimal pg;
	private String prdtNo;
	private String unit;
	private BigDecimal sno;
	private BigDecimal uq1;
	private BigDecimal wq1;
	private BigDecimal uq2;
	private BigDecimal wq2;
	private BigDecimal uq3;
	private BigDecimal wq3;
	private BigDecimal uq4;
	private BigDecimal wq4;
	private BigDecimal uq5;
	private BigDecimal wq5;
	private BigDecimal uq6;
	private BigDecimal wq6;
	private BigDecimal uq7;
	private BigDecimal wq7;
	private BigDecimal uq8;
	private BigDecimal wq8;
	private BigDecimal uq9;
	private BigDecimal wq9;
	private BigDecimal sumq;
	private String rmks;
	private String lkyn;

	@Override
	public String getSetNo() {
		return this.setNo;
	}
 
	@Override
	public void setSetNo(final String setNo) {
		this.setNo = setNo; 
	}
 
	@Override
	public String getCtmCode() {
		return this.ctmCode;
	}
 
	@Override
	public void setCtmCode(final String ctmCode) {
		this.ctmCode = ctmCode; 
	}
 
	@Override
	public String getCocompNo() {
		return this.cocompNo;
	}
 
	@Override
	public void setCocompNo(final String cocompNo) {
		this.cocompNo = cocompNo; 
	}
 
	@Override
	public String getRpt() {
		return this.rpt;
	}
 
	@Override
	public void setRpt(final String rpt) {
		this.rpt = rpt; 
	}
 
	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
	}
 
	@Override
	public BigDecimal getPg() {
		return this.pg;
	}
 
	@Override
	public void setPg(final BigDecimal pg) {
		this.pg = pg; 
	}
 
	@Override
	public String getPrdtNo() {
		return this.prdtNo;
	}
 
	@Override
	public void setPrdtNo(final String prdtNo) {
		this.prdtNo = prdtNo; 
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
	public BigDecimal getSno() {
		return this.sno;
	}
 
	@Override
	public void setSno(final BigDecimal sno) {
		this.sno = sno; 
	}
 
	@Override
	public BigDecimal getUq1() {
		return this.uq1;
	}
 
	@Override
	public void setUq1(final BigDecimal uq1) {
		this.uq1 = uq1; 
	}
 
	@Override
	public BigDecimal getWq1() {
		return this.wq1;
	}
 
	@Override
	public void setWq1(final BigDecimal wq1) {
		this.wq1 = wq1; 
	}
 
	@Override
	public BigDecimal getUq2() {
		return this.uq2;
	}
 
	@Override
	public void setUq2(final BigDecimal uq2) {
		this.uq2 = uq2; 
	}
 
	@Override
	public BigDecimal getWq2() {
		return this.wq2;
	}
 
	@Override
	public void setWq2(final BigDecimal wq2) {
		this.wq2 = wq2; 
	}
 
	@Override
	public BigDecimal getUq3() {
		return this.uq3;
	}
 
	@Override
	public void setUq3(final BigDecimal uq3) {
		this.uq3 = uq3; 
	}
 
	@Override
	public BigDecimal getWq3() {
		return this.wq3;
	}
 
	@Override
	public void setWq3(final BigDecimal wq3) {
		this.wq3 = wq3; 
	}
 
	@Override
	public BigDecimal getUq4() {
		return this.uq4;
	}
 
	@Override
	public void setUq4(final BigDecimal uq4) {
		this.uq4 = uq4; 
	}
 
	@Override
	public BigDecimal getWq4() {
		return this.wq4;
	}
 
	@Override
	public void setWq4(final BigDecimal wq4) {
		this.wq4 = wq4; 
	}
 
	@Override
	public BigDecimal getUq5() {
		return this.uq5;
	}
 
	@Override
	public void setUq5(final BigDecimal uq5) {
		this.uq5 = uq5; 
	}
 
	@Override
	public BigDecimal getWq5() {
		return this.wq5;
	}
 
	@Override
	public void setWq5(final BigDecimal wq5) {
		this.wq5 = wq5; 
	}
 
	@Override
	public BigDecimal getUq6() {
		return this.uq6;
	}
 
	@Override
	public void setUq6(final BigDecimal uq6) {
		this.uq6 = uq6; 
	}
 
	@Override
	public BigDecimal getWq6() {
		return this.wq6;
	}
 
	@Override
	public void setWq6(final BigDecimal wq6) {
		this.wq6 = wq6; 
	}
 
	@Override
	public BigDecimal getUq7() {
		return this.uq7;
	}
 
	@Override
	public void setUq7(final BigDecimal uq7) {
		this.uq7 = uq7; 
	}
 
	@Override
	public BigDecimal getWq7() {
		return this.wq7;
	}
 
	@Override
	public void setWq7(final BigDecimal wq7) {
		this.wq7 = wq7; 
	}
 
	@Override
	public BigDecimal getUq8() {
		return this.uq8;
	}
 
	@Override
	public void setUq8(final BigDecimal uq8) {
		this.uq8 = uq8; 
	}
 
	@Override
	public BigDecimal getWq8() {
		return this.wq8;
	}
 
	@Override
	public void setWq8(final BigDecimal wq8) {
		this.wq8 = wq8; 
	}
 
	@Override
	public BigDecimal getUq9() {
		return this.uq9;
	}
 
	@Override
	public void setUq9(final BigDecimal uq9) {
		this.uq9 = uq9; 
	}
 
	@Override
	public BigDecimal getWq9() {
		return this.wq9;
	}
 
	@Override
	public void setWq9(final BigDecimal wq9) {
		this.wq9 = wq9; 
	}
 
	@Override
	public BigDecimal getSumq() {
		return this.sumq;
	}
 
	@Override
	public void setSumq(final BigDecimal sumq) {
		this.sumq = sumq; 
	}
 
	@Override
	public String getRmks() {
		return this.rmks;
	}
 
	@Override
	public void setRmks(final String rmks) {
		this.rmks = rmks; 
	}
 
	@Override
	public String getLkyn() {
		return this.lkyn;
	}
 
	@Override
	public void setLkyn(final String lkyn) {
		this.lkyn = lkyn; 
	}
 
}
