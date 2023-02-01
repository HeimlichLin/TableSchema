package com.doc.common.po.impl; 
 
public class AaaaaPo implements IAaaaaPo {
 
	public enum COLUMNS {
		EXPBAGNO("null"), //
		EXP_COUNT("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String expbagno;
	private BigDecimal expCount;

	@Override
	public String getExpbagno() {
		return this.expbagno;
	}
 
	@Override
	public void setExpbagno(final String expbagno) {
		this.expbagno = expbagno; 
	}
 
	@Override
	public BigDecimal getExpCount() {
		return this.expCount;
	}
 
	@Override
	public void setExpCount(final BigDecimal expCount) {
		this.expCount = expCount; 
	}
 
}
