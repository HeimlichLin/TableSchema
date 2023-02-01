package com.doc.common.po.impl; 
 
public class GetNumberPo implements IGetNumberPo {
 
	public enum COLUMNS {
		PGM_ID("產生程式"), //
		SYSCODE1("代碼1"), //
		SYSCODE2("代碼2"), //
		SYSCODE3("代碼3"), //
		COUNT("目前號碼") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String pgmId;
	private String syscode1;
	private String syscode2;
	private String syscode3;
	private BigDecimal count;

	@Override
	public String getPgmId() {
		return this.pgmId;
	}
 
	@Override
	public void setPgmId(final String pgmId) {
		this.pgmId = pgmId; 
	}
 
	@Override
	public String getSyscode1() {
		return this.syscode1;
	}
 
	@Override
	public void setSyscode1(final String syscode1) {
		this.syscode1 = syscode1; 
	}
 
	@Override
	public String getSyscode2() {
		return this.syscode2;
	}
 
	@Override
	public void setSyscode2(final String syscode2) {
		this.syscode2 = syscode2; 
	}
 
	@Override
	public String getSyscode3() {
		return this.syscode3;
	}
 
	@Override
	public void setSyscode3(final String syscode3) {
		this.syscode3 = syscode3; 
	}
 
	@Override
	public BigDecimal getCount() {
		return this.count;
	}
 
	@Override
	public void setCount(final BigDecimal count) {
		this.count = count; 
	}
 
}
