package com.doc.common.po.impl; 
 
public class GuarantyPo implements IGuarantyPo {
 
	public enum COLUMNS {
		BONDNO("監管編號"), //
		GRNTAMT("循環保證金"), //
		GRNTAMTI("期初保證金") //
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
	private BigDecimal grntamt;
	private BigDecimal grntamti;

	@Override
	public String getBondno() {
		return this.bondno;
	}
 
	@Override
	public void setBondno(final String bondno) {
		this.bondno = bondno; 
	}
 
	@Override
	public BigDecimal getGrntamt() {
		return this.grntamt;
	}
 
	@Override
	public void setGrntamt(final BigDecimal grntamt) {
		this.grntamt = grntamt; 
	}
 
	@Override
	public BigDecimal getGrntamti() {
		return this.grntamti;
	}
 
	@Override
	public void setGrntamti(final BigDecimal grntamti) {
		this.grntamti = grntamti; 
	}
 
}
