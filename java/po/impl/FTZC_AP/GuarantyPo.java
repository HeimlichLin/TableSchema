package com.doc.common.po.impl; 
 
public class GuarantyPo implements IGuarantyPo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		GRNT_AMT("循環保證金"), //
		GRNT_AMT_I("期初保證金") //
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
	private BigDecimal grntAmt;
	private BigDecimal grntAmtI;

	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
	}
 
	@Override
	public BigDecimal getGrntAmt() {
		return this.grntAmt;
	}
 
	@Override
	public void setGrntAmt(final BigDecimal grntAmt) {
		this.grntAmt = grntAmt; 
	}
 
	@Override
	public BigDecimal getGrntAmtI() {
		return this.grntAmtI;
	}
 
	@Override
	public void setGrntAmtI(final BigDecimal grntAmtI) {
		this.grntAmtI = grntAmtI; 
	}
 
}
