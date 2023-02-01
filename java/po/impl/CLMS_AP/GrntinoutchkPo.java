package com.doc.common.po.impl; 
 
public class GrntinoutchkPo implements IGrntinoutchkPo {
 
	public enum COLUMNS {
		BONDNO("null"), //
		ODECLNO("null"), //
		OITEMNO("null"), //
		STRPOST("null"), //
		IN_TAXAMT("null"), //
		OUT_TAXAMT("null") //
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
	private String odeclno;
	private BigDecimal oitemno;
	private String strpost;
	private BigDecimal inTaxamt;
	private BigDecimal outTaxamt;

	@Override
	public String getBondno() {
		return this.bondno;
	}
 
	@Override
	public void setBondno(final String bondno) {
		this.bondno = bondno; 
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
	public String getStrpost() {
		return this.strpost;
	}
 
	@Override
	public void setStrpost(final String strpost) {
		this.strpost = strpost; 
	}
 
	@Override
	public BigDecimal getInTaxamt() {
		return this.inTaxamt;
	}
 
	@Override
	public void setInTaxamt(final BigDecimal inTaxamt) {
		this.inTaxamt = inTaxamt; 
	}
 
	@Override
	public BigDecimal getOutTaxamt() {
		return this.outTaxamt;
	}
 
	@Override
	public void setOutTaxamt(final BigDecimal outTaxamt) {
		this.outTaxamt = outTaxamt; 
	}
 
}
