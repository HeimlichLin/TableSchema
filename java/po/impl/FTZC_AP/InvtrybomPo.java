package com.doc.common.po.impl; 
 
public class InvtrybomPo implements IInvtrybomPo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		SET_NO("結算表編號"), //
		CTM_CODE("客戶編號"), //
		COCOMP_NO("協力廠編號"), //
		RPT("報表類型"), //
		PG("頁次"), //
		BS("null"), //
		BHT("null"), //
		B1("表頭第1欄"), //
		B2("表頭第2欄"), //
		B3("表頭第3欄"), //
		B4("表頭第4欄"), //
		B5("表頭第5欄"), //
		B6("表頭第6欄"), //
		B7("表頭第7欄"), //
		B8("表頭第8欄"), //
		B9("表頭第9欄"), //
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
 
	private String bfNo;
	private String setNo;
	private String ctmCode;
	private String cocompNo;
	private String rpt;
	private BigDecimal pg;
	private BigDecimal bs;
	private String bht;
	private String b1;
	private String b2;
	private String b3;
	private String b4;
	private String b5;
	private String b6;
	private String b7;
	private String b8;
	private String b9;
	private String lkyn;

	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
	}
 
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
	public BigDecimal getPg() {
		return this.pg;
	}
 
	@Override
	public void setPg(final BigDecimal pg) {
		this.pg = pg; 
	}
 
	@Override
	public BigDecimal getBs() {
		return this.bs;
	}
 
	@Override
	public void setBs(final BigDecimal bs) {
		this.bs = bs; 
	}
 
	@Override
	public String getBht() {
		return this.bht;
	}
 
	@Override
	public void setBht(final String bht) {
		this.bht = bht; 
	}
 
	@Override
	public String getB1() {
		return this.b1;
	}
 
	@Override
	public void setB1(final String b1) {
		this.b1 = b1; 
	}
 
	@Override
	public String getB2() {
		return this.b2;
	}
 
	@Override
	public void setB2(final String b2) {
		this.b2 = b2; 
	}
 
	@Override
	public String getB3() {
		return this.b3;
	}
 
	@Override
	public void setB3(final String b3) {
		this.b3 = b3; 
	}
 
	@Override
	public String getB4() {
		return this.b4;
	}
 
	@Override
	public void setB4(final String b4) {
		this.b4 = b4; 
	}
 
	@Override
	public String getB5() {
		return this.b5;
	}
 
	@Override
	public void setB5(final String b5) {
		this.b5 = b5; 
	}
 
	@Override
	public String getB6() {
		return this.b6;
	}
 
	@Override
	public void setB6(final String b6) {
		this.b6 = b6; 
	}
 
	@Override
	public String getB7() {
		return this.b7;
	}
 
	@Override
	public void setB7(final String b7) {
		this.b7 = b7; 
	}
 
	@Override
	public String getB8() {
		return this.b8;
	}
 
	@Override
	public void setB8(final String b8) {
		this.b8 = b8; 
	}
 
	@Override
	public String getB9() {
		return this.b9;
	}
 
	@Override
	public void setB9(final String b9) {
		this.b9 = b9; 
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
