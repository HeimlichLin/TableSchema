package com.doc.common.po.impl; 
 
public class TmpGrntprintPo implements ITmpGrntprintPo {
 
	public enum COLUMNS {
		SESSIONID("Session id"), //
		BONDNO("監管編號"), //
		RECORDNO("列出的序號"), //
		STRDATE("進出倉日期"), //
		STRQTY("進出倉數量"), //
		DECLQTY("申報數量"), //
		DECLNO("報單號碼"), //
		ITEMNO("項次"), //
		PRDTNO("料號"), //
		INTAXAMT("進倉核扣金額"), //
		OUTAXAMT("出倉核加金額"), //
		AVLAMT("保證金使用情形"), //
		DUTYRATE222("進口稅額"), //
		COMDTAXRATE222("貨物稅額"), //
		VATAXAMT("營業稅額"), //
		DECLTYPE("報單類別"), //
		CCCCODE("商品分類號列"), //
		STRPOST("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String sessionid;
	private String bondno;
	private BigDecimal recordno;
	private String strdate;
	private BigDecimal strqty;
	private BigDecimal declqty;
	private String declno;
	private BigDecimal itemno;
	private String prdtno;
	private BigDecimal intaxamt;
	private BigDecimal outaxamt;
	private BigDecimal avlamt;
	private BigDecimal dutyrate222;
	private BigDecimal comdtaxrate222;
	private BigDecimal vataxamt;
	private String decltype;
	private String ccccode;
	private String strpost;

	@Override
	public String getSessionid() {
		return this.sessionid;
	}
 
	@Override
	public void setSessionid(final String sessionid) {
		this.sessionid = sessionid; 
	}
 
	@Override
	public String getBondno() {
		return this.bondno;
	}
 
	@Override
	public void setBondno(final String bondno) {
		this.bondno = bondno; 
	}
 
	@Override
	public BigDecimal getRecordno() {
		return this.recordno;
	}
 
	@Override
	public void setRecordno(final BigDecimal recordno) {
		this.recordno = recordno; 
	}
 
	@Override
	public String getStrdate() {
		return this.strdate;
	}
 
	@Override
	public void setStrdate(final String strdate) {
		this.strdate = strdate; 
	}
 
	@Override
	public BigDecimal getStrqty() {
		return this.strqty;
	}
 
	@Override
	public void setStrqty(final BigDecimal strqty) {
		this.strqty = strqty; 
	}
 
	@Override
	public BigDecimal getDeclqty() {
		return this.declqty;
	}
 
	@Override
	public void setDeclqty(final BigDecimal declqty) {
		this.declqty = declqty; 
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
	public String getPrdtno() {
		return this.prdtno;
	}
 
	@Override
	public void setPrdtno(final String prdtno) {
		this.prdtno = prdtno; 
	}
 
	@Override
	public BigDecimal getIntaxamt() {
		return this.intaxamt;
	}
 
	@Override
	public void setIntaxamt(final BigDecimal intaxamt) {
		this.intaxamt = intaxamt; 
	}
 
	@Override
	public BigDecimal getOutaxamt() {
		return this.outaxamt;
	}
 
	@Override
	public void setOutaxamt(final BigDecimal outaxamt) {
		this.outaxamt = outaxamt; 
	}
 
	@Override
	public BigDecimal getAvlamt() {
		return this.avlamt;
	}
 
	@Override
	public void setAvlamt(final BigDecimal avlamt) {
		this.avlamt = avlamt; 
	}
 
	@Override
	public BigDecimal getDutyrate222() {
		return this.dutyrate222;
	}
 
	@Override
	public void setDutyrate222(final BigDecimal dutyrate222) {
		this.dutyrate222 = dutyrate222; 
	}
 
	@Override
	public BigDecimal getComdtaxrate222() {
		return this.comdtaxrate222;
	}
 
	@Override
	public void setComdtaxrate222(final BigDecimal comdtaxrate222) {
		this.comdtaxrate222 = comdtaxrate222; 
	}
 
	@Override
	public BigDecimal getVataxamt() {
		return this.vataxamt;
	}
 
	@Override
	public void setVataxamt(final BigDecimal vataxamt) {
		this.vataxamt = vataxamt; 
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
	public String getCcccode() {
		return this.ccccode;
	}
 
	@Override
	public void setCcccode(final String ccccode) {
		this.ccccode = ccccode; 
	}
 
	@Override
	public String getStrpost() {
		return this.strpost;
	}
 
	@Override
	public void setStrpost(final String strpost) {
		this.strpost = strpost; 
	}
 
}
