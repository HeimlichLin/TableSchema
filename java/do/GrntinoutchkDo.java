package com.doc.common.bean; 
 
public class GrntinoutchkDo { 
 
	public enum COLUMNS { 
		BONDNO("null"), 
		ODECLNO("null"), 
		OITEMNO("null"), 
		STRPOST("null"), 
		IN_TAXAMT("null"), 
		OUT_TAXAMT("null") 
		; 
		final String name; 
	 
		private COLUMNS(final String name) { 
			this.name = name; 
		} 
	 
		public String getName() { 
			return this.name; 
		} 
	} 
 
	private String bondno; 
	private String odeclno; 
	private BigDecimal oitemno; 
	private String strpost; 
	private BigDecimal inTaxamt; 
	private BigDecimal outTaxamt; 
	
	public String getBondno() { 
		return bondno; 
	} 
 
	public void setBondno(String bondno) { 
		this.bondno = bondno; 
	} 
 
	public String getOdeclno() { 
		return odeclno; 
	} 
 
	public void setOdeclno(String odeclno) { 
		this.odeclno = odeclno; 
	} 
 
	public BigDecimal getOitemno() { 
		return oitemno; 
	} 
 
	public void setOitemno(BigDecimal oitemno) { 
		this.oitemno = oitemno; 
	} 
 
	public String getStrpost() { 
		return strpost; 
	} 
 
	public void setStrpost(String strpost) { 
		this.strpost = strpost; 
	} 
 
	public BigDecimal getInTaxamt() { 
		return inTaxamt; 
	} 
 
	public void setInTaxamt(BigDecimal inTaxamt) { 
		this.inTaxamt = inTaxamt; 
	} 
 
	public BigDecimal getOutTaxamt() { 
		return outTaxamt; 
	} 
 
	public void setOutTaxamt(BigDecimal outTaxamt) { 
		this.outTaxamt = outTaxamt; 
	} 
 
} 
